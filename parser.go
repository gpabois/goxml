package goxml

import (
	"errors"
	"fmt"
	"io"
	"strings"

	"github.com/gpabois/gostd/collection"
	"github.com/gpabois/gostd/option"
	"github.com/gpabois/gostd/result"
)

type Parser struct {
	state    int8
	scanner  Scanner
	document Document
	stack    collection.Stack[any]
	tokStack collection.Stack[Token] // Used to rewind token
}

func NewParser(r io.Reader) Parser {
	return Parser{
		scanner: NewScanner(r),
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

// Adresse to the root element state
const (
	parseElements = iota
	parseCommentElement
	parseCommentElement01
	parseElement
	parseOpeningTagElementName
	parseOpeningTagElementName01
	parseOpeningTagElement01
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

var parserStates = []parserState{
	// parseElements
	// Parse <foo/>, <foo></foo>, <!-- whatever -->
	func(tok Token) option.Option[sParserTransition] {
		switch tok.Type {
		case TOK_OPEN_PROCINST: // <?
			return parserNext(parseProcInstElement).
				shift().
				pushValue(Element{Flag: ProcInstFlag}).
				some()
		case TOK_OPEN_COMMENT: // <!--
			return parserNext(parseCommentElement).
				shift().
				pushValue(Element{Tag: QName{Local: "#comment"}}).
				some()
		case TOK_OPEN_ELEMENT_TAG: // <
			return parserNext(parseElement).
				shift().
				pushValue(Element{}).
				some()
		case TOK_STRING:
			return parserNext(parseElements).
				shift().
				pushValue(Element{
					Tag:  QName{Local: "#text"},
					Text: tok.Value,
				}).
				reduceElement().
				some()
		default:
			return parserNoTransition()
		}
	},
	// parseCommentElement
	func(tok Token) option.Option[sParserTransition] {
		switch tok.Type {
		case TOK_STRING:
			return parserNext(parseCommentElement01).
				shift().
				pushValue(tok.Value).
				reduceText().
				some()
		default:
			return parserNoTransition("string")
		}
	},
	// parseCommentElement-01
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
	// parseElement
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
	// parseElementOpeningTagName
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
			return parserNext(parseOpeningTagElement01).
				reduceQName(false).
				some() // do not perform shifting !
		}
	},
	// parseElementOpeningTagName01
	// Get the local name
	func(tok Token) option.Option[sParserTransition] {
		switch tok.Type {
		case TOK_ID:
			return parserNext(parseOpeningTagElement01).
				shift().
				pushValue(tok.Value).
				reduceQName(true).
				reduceTag().
				some()
		default:
			return parserNoTransition("identifier")
		}
	},
	// parseOpeningTagElement01
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
	// parseElementAttribute
	// Parse an element attribute
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
	// parseElementAttributeName01
	// Parse the attribute name with a prefix
	func(tok Token) option.Option[sParserTransition] {
		switch tok.Type {
		case TOK_ID:
			return parserNext(7).
				shift().
				pushValue(tok.Value).
				reduceQName(true).
				some()
		default:
			return parserNoTransition("identifier")
		}
	},
	// parseElementAttributeValue
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
	// parseClosingTagElement
	// Parse </prefix:foo>
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
	// parseClosingTagNameElement-01
	// Check if prefix is set
	func(tok Token) option.Option[sParserTransition] {
		switch tok.Type {
		case TOK_PREFIX_SEP:
			return parserNext(parseClosingTagNameElement02).
				shift().
				some()
		default:
			return parserNext(parseClosingTagNameElement03).
				shift().
				some()

		}
	},
	// parseClosingTagNameElement-02
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
	// parseClosingTagNameElement03
	// Check for closing tag ">"
	func(tok Token) option.Option[sParserTransition] {
		switch tok.Type {
		case TOK_CLOSE_ELEMENT_TAG:
			return parserNext(parseElements).shift().reduceElement().some()
		default:
			return parserNoTransition(">")
		}
	},
	// parseProcInstElement
	func(tok Token) option.Option[sParserTransition] {
		switch tok.Type {
		case TOK_ID:
			return parserNext(parseProcInstElement01).shift().reduceElement().some()
		default:
			return parserNoTransition("identifier")
		}
	},
	// parseProcInstElement01
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
	// parseProcInstElementAttribute
	func(tok Token) option.Option[sParserTransition] {
		switch tok.Type {
		case TOK_EQUAL:
			return parserNext(parseProcInstElementAttribute01).shift().some()
		default:
			return parserNoTransition("=")
		}
	},
	// parseProcInstElementAttribute01
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

func (p *Parser) attachToParentOrDocument(element Element) {

	// We have a parent element
	if p.stack.Last().IsSome() {
		el := p.stack.Pop().Expect().(Element)
		el.AttachChild(element)
		p.stack.Push(el)
	} else { // We set it as the root of the document
		p.document.AttachChild(element)
	}
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

		p.state = transition.next
		/// Process the operations

		// Rewind
		if transition.op&parserShift == 0 {
			p.rewindToken(tok)
		}

		// Push values, if any
		for _, v := range transition.values {
			p.stack.Push(v)
		}

		// Reduce to a QName
		if transition.op&parserReduceQName > 0 {
			local := p.stack.Pop().Expect().(string)
			p.stack.Push(QName{Local: local})
		}

		// Reduce the attribute
		if transition.op&parserReduceAttribute > 0 {
			attrValue := p.stack.Pop().Expect().(string)
			attrName := p.stack.Pop().Expect().(QName)
			el := p.stack.Pop().Expect().(Element)
			el.AttachAttribute(Attribute{
				Name:  attrName,
				Value: attrValue,
			})
			p.stack.Push(el)
		}

		// Reduce to text
		if transition.op&parserReduceText > 0 {
			text := p.stack.Pop().Expect().(string)
			el := p.stack.Pop().Expect().(Element)
			el.Text = text
			p.stack.Push(el)
		}

		// Reduce the element
		if transition.op&parserReduceElement > 0 {
			el := p.stack.Pop().Expect().(Element)
			p.attachToParentOrDocument(el)

		}
	}
}
