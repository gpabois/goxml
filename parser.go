package goxml

import (
	"errors"
	"fmt"
	"io"
	"strings"

	"github.com/gpabois/gostd/collection"
	"github.com/gpabois/gostd/iter"
	"github.com/gpabois/gostd/option"
	"github.com/gpabois/gostd/result"
)

type ParserArgs struct {
	// Allows to trace the operations of the parser
	Debug bool
}

type Parser struct {
	state    int8
	scanner  iter.Iterator[result.Result[Token]]
	document Document
	stack    collection.Stack[any]
	tokStack collection.Stack[Token] // Used to rewind token
	debug    bool
	logs     []string
}

func NewParser(r io.Reader, args ParserArgs) Parser {
	scanner := NewScanner(r)
	return Parser{
		scanner: &scanner,
		debug:   args.Debug,
	}
}

// Consume the token, if not set it will rewind the token for the next loop
const parserShift = byte(1)

// [Child, Parent, ...] => Parent.AttachChild(Element)
// OR [Child] => Document.AttachRoot(Child)
const parserReduceElement = byte(1 << 1)

// [Value, QName, Element] => Element.AttachAttribute(Attribute{QName, Value})
const parserReduceAttribute = byte(1 << 2)

// [Local] => QName{Prefix}
const parserReduceQName = byte(1 << 3)

// [Prefix, Local] => QName{Local, Prefix}
const parserReduceQNameWithPrefix = byte(1 << 4)

// Reduce [Element, QName] => Element.Tag = QName
const parserReduceTagName = byte(1 << 5)

// Reduce [Element, String] => Element.Text = string
const parserReduceText = byte(1 << 6)

// Define an invalid transition
const parserInvalidTransition = byte(1 << 7)

type sParserTransition struct {
	op             byte
	next           int8
	values         []any
	expectedTokens []string
}

func parserNext(next int8) sParserTransition {
	return sParserTransition{
		next: next,
	}
}

func (t sParserTransition) some() option.Option[sParserTransition] {
	return option.Some(t)
}

func (t sParserTransition) shift() sParserTransition {
	t.op = t.op | parserShift
	return t
}

func (t sParserTransition) pushValue(value any) sParserTransition {
	t.values = append(t.values, value)
	return t
}

func (t sParserTransition) reduceText() sParserTransition {
	t.op = t.op | parserReduceText
	return t
}

func (t sParserTransition) reduceElement() sParserTransition {
	t.op = t.op | parserReduceElement
	return t
}

func (t sParserTransition) reduceAttribute() sParserTransition {
	t.op = t.op | parserReduceAttribute
	return t
}

func (t sParserTransition) reduceQName(withPrefix bool) sParserTransition {
	if withPrefix {
		t.op = t.op | parserReduceQNameWithPrefix
	} else {
		t.op = t.op | parserReduceQName
	}
	return t
}

func (t sParserTransition) reduceTag() sParserTransition {
	t.op = t.op | parserReduceTagName
	return t
}

// No transition match the criteria
func parserNoTransition(expectedTokens ...string) option.Option[sParserTransition] {
	return option.Some(sParserTransition{op: parserInvalidTransition, expectedTokens: expectedTokens})
}

type parserState = func(tok Token) option.Option[sParserTransition]

// Adresses to parser states
const (
	// Parse <foo/>, <foo></foo>, <!-- whatever -->, <?foo ... ?>
	parseElements = iota
	// Parse a Comment <!-- ... -->
	// Retrieve the text
	parseComment
	// Parse the -->
	// Reduce as a comment element
	parseComment_02
	// Parse an <foo attributes>elements</foo>
	parseElement
	// Parse prefix:local, or local
	parseOpeningTagElementName
	// Parse the local, with prefix
	parseOpeningTagElementName01
	// Parse attribute, >, or />
	parseOpeningTagElement
	// Parse prefix:local="value"
	parseElementAttribute
	parseElementAttributeName01
	parseElementAttributeValue
	parseClosingTagElement
	parseClosingTagNameElement01
	parseClosingTagNameElement02
	parseClosingTagNameElement03
	parseProcInstElement
	parseProcInstElement01
	parseProcInstElementAttribute
	parseProcInstElementAttribute01
)

// All parser states
var parserStates = []parserState{
	//0: parseElements
	func(tok Token) option.Option[sParserTransition] {
		switch tok.Type {
		case TOK_OPEN_PROCINST: // <?
			return parserNext(parseProcInstElement).
				shift().
				pushValue(NewElement("", "", ProcInstFlag, []Element{}, []Attribute{})).
				some()
		case TOK_OPEN_COMMENT: // <!--
			return parserNext(parseComment).
				shift().
				pushValue(NewCommentElement("")).
				some()
		case TOK_OPEN_ELEMENT_TAG: // <
			return parserNext(parseElement).
				shift().
				pushValue(NewElement("", "", 0, []Element{}, []Attribute{})).
				some()
		case TOK_OPEN_CLOSING_ELEMENT_TAG: // </
			return parserNext(parseClosingTagElement).
				shift().
				some()
		case TOK_STRING:
			return parserNext(parseElements).
				shift().
				pushValue(NewTextElement(tok.Value)).
				reduceElement().
				some()
		default:
			return parserNoTransition("<?", "<!--", "<", "</", "string")
		}
	},
	//1: parseCommentElement
	func(tok Token) option.Option[sParserTransition] {
		switch tok.Type {
		case TOK_STRING:
			return parserNext(parseComment_02).
				shift().
				pushValue(tok.Value).
				reduceText().
				some()
		default:
			return parserNoTransition("string")
		}
	},
	//2: parseCommentElement-01
	func(tok Token) option.Option[sParserTransition] {
		switch tok.Type {
		case TOK_CLOSE_COMMENT: // -->
			return parserNext(0).
				shift().
				reduceElement().
				some()
		default:
			return parserNoTransition()
		}
	},
	//3: parseElement
	// Parse <foo bar="acme">...</foo>, <foo/>
	func(tok Token) option.Option[sParserTransition] {
		switch tok.Type {
		case TOK_ID:
			return parserNext(parseOpeningTagElementName).
				shift().
				pushValue(tok.Value).
				some()
		default:
			return parserNoTransition("identifier")
		}
	},
	//4: parseElementOpeningTagName
	// <[prefix:local], or <[local]
	// Check if a prefix exists
	func(tok Token) option.Option[sParserTransition] {
		switch tok.Type {
		// We have a prefix separator
		case TOK_PREFIX_SEP:
			return parserNext(parseOpeningTagElementName01).
				shift().
				some()
		default:
			return parserNext(parseOpeningTagElement).
				reduceQName(false).
				reduceTag().
				some() // do not perform shifting !
		}
	},
	//5: parseElementOpeningTagName01
	// Get the local name
	func(tok Token) option.Option[sParserTransition] {
		switch tok.Type {
		case TOK_ID:
			return parserNext(parseOpeningTagElement).
				shift().
				pushValue(tok.Value).
				reduceQName(true).
				reduceTag().
				some()
		default:
			return parserNoTransition("identifier")
		}
	},
	//6: parseOpeningTagElement
	func(tok Token) option.Option[sParserTransition] {
		switch tok.Type {
		case TOK_ID: // We have an attribute
			return parserNext(parseElementAttribute).
				shift().
				pushValue(tok.Value).
				some()
		// Reduce the element
		case TOK_CLOSE_SINGLE_ELEMENT_TAG:
			return parserNext(0).
				shift().
				reduceElement().
				some()
		// Inner-element
		case TOK_CLOSE_ELEMENT_TAG:
			return parserNext(parseElements).
				shift().
				some()
		default:
			return parserNoTransition("identifier", "/>", ">")
		}
	},
	//7: parseElementAttribute
	// attribute = prefix:local="value"
	//			 | local="value"
	func(tok Token) option.Option[sParserTransition] {
		switch tok.Type {
		case TOK_PREFIX_SEP:
			return parserNext(parseElementAttributeName01).shift().some()
		case TOK_EQUAL:
			return parserNext(9).shift().reduceQName(false).some()
		default:
			return parserNoTransition(":", "=")
		}
	},
	//8: parseElementAttributeName01
	// attribute = prefix:local="value"
	func(tok Token) option.Option[sParserTransition] {
		switch tok.Type {
		case TOK_ID:
			return parserNext(7).shift().pushValue(tok.Value).reduceQName(true).some()
		default:
			return parserNoTransition("identifier")
		}
	},
	//9: parseElementAttributeValue
	// Parse the attribute value
	func(tok Token) option.Option[sParserTransition] {
		switch tok.Type {
		case TOK_STRING:
			return parserNext(6).
				shift().
				pushValue(tok.Value).
				reduceAttribute().
				some()
		default:
			return parserNoTransition("string")
		}
	},
	//10: parseClosingTagElement
	// Parse </prefix:foo>
	func(tok Token) option.Option[sParserTransition] {
		switch tok.Type {
		case TOK_ID:
			return parserNext(parseClosingTagNameElement01).
				shift().
				some()
		default:
			return parserNoTransition("identifier")
		}
	},
	//11: parseClosingTagNameElement-01
	// Check if prefix is set
	func(tok Token) option.Option[sParserTransition] {
		switch tok.Type {
		case TOK_PREFIX_SEP:
			return parserNext(parseClosingTagNameElement02).
				shift().
				some()
		default:
			return parserNext(parseClosingTagNameElement03).
				some()

		}
	},
	//12: parseClosingTagNameElement-02
	// Retrieve the local name
	func(tok Token) option.Option[sParserTransition] {
		switch tok.Type {
		case TOK_ID:
			return parserNext(parseClosingTagNameElement03).
				shift().
				some()
		default:
			return parserNoTransition("identifier")
		}
	},
	//13: parseClosingTagNameElement03
	// Check for closing tag ">"
	func(tok Token) option.Option[sParserTransition] {
		switch tok.Type {
		case TOK_CLOSE_ELEMENT_TAG:
			return parserNext(parseElements).
				shift().
				reduceElement().
				some()
		default:
			return parserNoTransition(">")
		}
	},
	//14: parseProcInstElement
	func(tok Token) option.Option[sParserTransition] {
		switch tok.Type {
		case TOK_ID:
			return parserNext(parseProcInstElement01).
				pushValue(tok.Value).
				reduceQName(false).
				reduceTag().
				shift().
				some()
		default:
			return parserNoTransition("identifier")
		}
	},
	//15: parseProcInstElement01
	// Parse attribute name
	func(tok Token) option.Option[sParserTransition] {
		switch tok.Type {
		case TOK_ID:
			return parserNext(parseProcInstElementAttribute).
				shift().
				pushValue(tok.Value).
				reduceQName(false).
				some()
		case TOK_CLOSE_PROCINST:
			return parserNext(parseElements).shift().reduceElement().some()
		default:
			return parserNoTransition("identifier")
		}
	},
	//16: parseProcInstElementAttribute
	func(tok Token) option.Option[sParserTransition] {
		switch tok.Type {
		case TOK_EQUAL:
			return parserNext(parseProcInstElementAttribute01).shift().some()
		default:
			return parserNoTransition("=")
		}
	},
	//17: parseProcInstElementAttribute01
	func(tok Token) option.Option[sParserTransition] {
		switch tok.Type {
		case TOK_STRING:
			return parserNext(parseProcInstElement01).
				shift().
				pushValue(tok.Value).
				reduceAttribute().
				some()
		default:
			return parserNoTransition("string")
		}
	},
}

func (p *Parser) rewindToken(token Token) {
	p.tokStack.Push(token)
}

func (p *Parser) nextToken() option.Option[result.Result[Token]] {
	if p.tokStack.Last().IsSome() {
		tok := p.tokStack.Pop().Expect()
		return option.Some(result.Success(tok))
	}

	return p.scanner.Next()
}

func (p *Parser) attachToParentOrDocument(element Element) result.Result[bool] {
	// We have a parent element
	if p.stack.Last().IsSome() {
		e := p.stack.Pop().Expect()
		switch el := e.(type) {
		case Element:
			p.trace(func() string {
				return fmt.Sprintf("reducing element %s in %s", element, el)
			})
			el.AttachChild(element)
			p.stack.Push(el)
		default:
			p.stack.Push(el)
			return result.Failed[bool](errors.New(fmt.Sprintf("Expecting an element, got %v #%d", el, p.state)))
		}
	} else { // We set it as the root of the document
		p.trace(func() string {
			return fmt.Sprintf("reducing element %s in %s", element, p.document)
		})
		p.document.AttachChild(element)
	}

	return result.Success(true)
}

func (p *Parser) trace(f func() string) {
	if p.debug {
		p.logs = append(p.logs, f())
	}
}

func (p *Parser) GetTrace() []string {
	return p.logs
}

func (p *Parser) Parse() result.Result[Document] {
	for {
		// No more token
		tokOpt := p.nextToken()
		if tokOpt.IsNone() {
			return result.Success(p.document)
		}

		// Cannot get a next token
		tokRes := tokOpt.Expect()
		if tokRes.HasFailed() {
			return result.Result[Document]{}.Failed(tokRes.UnwrapError())
		}

		// No more token
		tok := tokRes.Expect()
		if tok.Type == TOK_EOF {
			return result.Success(p.document)
		}

		transitionOpt := parserStates[p.state](tok)
		if transitionOpt.IsNone() {
			return result.Failed[Document](errors.New("Invalid token"))
		}

		transition := transitionOpt.Expect()
		if transition.op&parserInvalidTransition > 0 {
			return result.Failed[Document](errors.New(
				fmt.Sprintf(
					"Invalid token %s at (row: %d, col: %d), expecting: %s #%d",
					tok.TypeName(),
					tok.Row,
					tok.Col,
					strings.Join(transition.expectedTokens, ", "),
					p.state,
				),
			))
		}

		p.trace(func() string {
			return fmt.Sprintf("state #%d", p.state)
		})

		/// Process the operations
		// Rewind
		if transition.op&parserShift == 0 {
			p.rewindToken(tok)
			p.trace(func() string {
				return fmt.Sprintf("rewinding")
			})
		} else {
			p.trace(func() string {
				return fmt.Sprintf("shifting")
			})
		}

		// Push values, if any
		for _, v := range transition.values {
			p.stack.Push(v)
			p.trace(func() string {
				return fmt.Sprintf("pushing %s", v)
			})
		}

		// Reduce to a QName
		if transition.op&parserReduceQName > 0 {
			local := p.stack.Pop().Expect().(string)
			qname := QName{Local: local}
			p.stack.Push(qname)
			p.trace(func() string {
				return fmt.Sprintf("reducing QName %s", qname)
			})
		}

		// Reduce to a QName, with a Prefix
		if transition.op&parserReduceQNameWithPrefix > 0 {
			local := p.stack.Pop().Expect().(string)
			prefix := p.stack.Pop().Expect().(string)
			qname := QName{Local: local, Prefix: option.Some(prefix)}
			p.stack.Push(qname)
			p.trace(func() string {
				return fmt.Sprintf("reducing QName (with prefix) %s", qname)
			})
		}

		if transition.op&parserReduceTagName > 0 {
			qname := p.stack.Pop().Expect().(QName)
			elOpt := p.stack.Pop()
			if elOpt.IsNone() {
				return result.Failed[Document](errors.New(
					fmt.Sprintf("Missing element to perform attribute reduction #%d", p.state),
				))
			}
			el := elOpt.Expect().(Element)
			el.Tag = qname
			p.stack.Push(el)
			p.trace(func() string {
				return fmt.Sprintf("reducing tag name %s in %s", qname, el)
			})
		}

		// Reduce the attribute
		if transition.op&parserReduceAttribute > 0 {
			attrValue := p.stack.Pop().Expect().(string)
			attrName := p.stack.Pop().Expect().(QName)
			elOpt := p.stack.Pop()
			if elOpt.IsNone() {
				return result.Failed[Document](errors.New(
					fmt.Sprintf("Missing element to perform attribute reduction #%d", p.state),
				))
			}
			el := elOpt.Expect().(Element)
			attr := Attribute{
				Name:  attrName,
				Value: attrValue,
			}
			el.AttachAttribute(attr)
			p.stack.Push(el)
			p.trace(func() string {
				return fmt.Sprintf("reducing attribute %s in %s", attr, el)
			})
		}

		// Reduce to text
		if transition.op&parserReduceText > 0 {
			text := p.stack.Pop().Expect().(string)
			el := p.stack.Pop().Expect().(Element)
			el.Text = text
			p.stack.Push(el)
			p.trace(func() string {
				return fmt.Sprintf("reducing text %s in %s", text, el)
			})
		}

		// Reduce the element
		if transition.op&parserReduceElement > 0 {
			switch el := p.stack.Pop().Expect().(type) {
			case Element:
				if res := p.attachToParentOrDocument(el); res.HasFailed() {
					return result.Failed[Document](res.UnwrapError())
				}
			default:
				return result.Failed[Document](errors.New(fmt.Sprintf("Expecting an element, got %v", el)))
			}
		}

		p.state = transition.next

	}
}
