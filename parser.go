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
	elStack  collection.Stack[Element]
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

const (
	// Consume the token, if not set it will rewind the token for the next loop
	parserShift = int16(iota)
	parserPushTokenValue
	parserPushElement
	parserReduceFlag
	parserReduceElement
	parserReduceAttribute
	parserReduceQName
	parserReduceQNameWithPrefix
	parserReduceTagName
	parserReduceText
)

type parserTransition struct {
	op      int16
	next    int8
	flag    byte
	invalid bool
}

type parserState = func(tok Token) parserTransition

// Adresses to parser states
const (
	parseElements = int8(iota)
	parseComment
	parseComment02
	parseElement
	parseOpeningTagElementName
	parseOpeningTagElementName01
	parseOpeningTagElement
	parseElementAttribute
	parseElementAttributeName01
	parseElementAttributeName02
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

// Expected token types, per state
var expectedTokens = [][]string{
	{"<?", "<!--", "<", "</", "string"},
	{"string"},
	{"-->"},
	{"identifier"},
	{},
	{"identifier"},
	{"identifier", "/>", ">"},
	{":", "="},
	{"identifier"},
	{"="},
	{"string"},
	{"identifier"},
	{},
	{"identifier"},
	{">"},
	{"identifier"},
	{"identifier", "?"},
	{"="},
	{"string"},
}

// All parser states
var parserStates = []parserState{
	// parseElements
	func(tok Token) parserTransition {
		isOpenProcInst := tok.Type == TOK_OPEN_PROCINST              // Shift, push element, reduce flag, go to parseProcInstElement
		isOpenComment := tok.Type == TOK_OPEN_COMMENT                // Shift, push element, reduce flag, go to parseComment
		isOpenTag := tok.Type == TOK_OPEN_ELEMENT_TAG                // Shift, push element, go to parseElement
		isOpenClosingTag := tok.Type == TOK_OPEN_CLOSING_ELEMENT_TAG // Shift, go to parseClosingTagElement
		isText := tok.Type == TOK_STRING                             // Shift, push element, reduce flag, push token value, reduce text, reduce element go to parseElements

		invalid := !isOpenProcInst && !isOpenComment && !isOpenTag && !isOpenClosingTag && !isText
		// Encode operations
		op := (1 << parserShift) |
			(boolToInt16(isOpenProcInst || isOpenComment || isOpenTag || isText) << parserPushElement) |
			(boolToInt16(isText) << parserPushTokenValue) |
			(boolToInt16(isOpenProcInst || isOpenComment || isText) << parserReduceFlag) |
			(boolToInt16(isText) << parserReduceText) |
			(boolToInt16(isText) << parserReduceElement)

		// Encode element tag
		flag := (boolToByte(isOpenProcInst) * ProcInstFlag) +
			(boolToByte(isOpenComment) * CommentElementFlag) +
			(boolToByte(isText) * TextElementFlag)

		// Next transition
		next := boolToInt8(isOpenProcInst)*parseProcInstElement +
			boolToInt8(isOpenComment)*parseComment +
			boolToInt8(isOpenTag)*parseElement +
			boolToInt8(isOpenClosingTag)*parseClosingTagElement +
			boolToInt8(isText)*parseElements

		return parserTransition{
			op:      op,
			flag:    flag,
			next:    next,
			invalid: invalid,
		}
	},
	// parseComment
	func(tok Token) parserTransition {
		isString := tok.Type == TOK_STRING // Shift, push token value, reduce text, go to parseComment02
		invalid := !isString

		return parserTransition{
			op:      (1 << parserShift) | (1 << parserPushTokenValue) | (1 << parserReduceText),
			next:    parseComment02,
			invalid: invalid,
		}
	},
	// parseComment02
	func(tok Token) parserTransition {
		isClosingComment := tok.Type == TOK_CLOSE_COMMENT // Shift, reduce element, go to parseElements
		invalid := !isClosingComment

		return parserTransition{
			op:      (1 << parserShift) | (1 << parserReduceElement),
			next:    parseElements,
			invalid: invalid,
		}
	},
	// parseElement
	func(tok Token) parserTransition {
		isIdentifier := tok.Type == TOK_ID // Shift, push token value go to parseOpeningTagElementName
		invalid := !isIdentifier

		return parserTransition{
			op:      (1 << parserShift) | (1 << parserPushTokenValue),
			next:    parseOpeningTagElementName,
			invalid: invalid,
		}
	},
	// parseElementOpeningTagName
	func(tok Token) parserTransition {
		isPrefixSep := tok.Type == TOK_PREFIX_SEP // shift, go to parseOpeningTagElementName01
		isEndOfTagName := !isPrefixSep            // rewind, reduce QName, reduce tag name, go to parseOpeningTagElement

		// Encode operations
		op := (boolToInt16(isPrefixSep) << parserShift) |
			(boolToInt16(isEndOfTagName) << parserReduceQName) |
			(boolToInt16(isEndOfTagName) << parserReduceTagName)

		// Set next transition
		next := boolToInt8(isPrefixSep)*parseOpeningTagElementName01 +
			boolToInt8(isEndOfTagName)*parseOpeningTagElement

		return parserTransition{
			op:   op,
			next: next,
		}
	},
	// parseElementOpeningTagName01
	func(tok Token) parserTransition {
		isIdentifier := tok.Type == TOK_ID // shift, push token value, reduce qname with prefix, reduce tag, go to parseOpeningTagElement
		invalid := !isIdentifier

		return parserTransition{
			op:      (1 << parserShift) | (1 << parserPushTokenValue) | (1 << parserReduceQNameWithPrefix) | (1 << parserReduceTagName),
			next:    parseOpeningTagElement,
			invalid: invalid,
		}
	},
	// parseOpeningTagElement
	func(tok Token) parserTransition {
		isIdentifier := tok.Type == TOK_ID                                  // Shift, push token value, go to parseElementAttribute
		isCloseSingleElementTag := tok.Type == TOK_CLOSE_SINGLE_ELEMENT_TAG // Shift, reduce element go to parseElements
		isCloseElementTag := tok.Type == TOK_CLOSE_ELEMENT_TAG              // Shift, go to parseElements

		invalid := !isIdentifier && !isCloseSingleElementTag && !isCloseElementTag

		op := (1 << parserShift) |
			(boolToInt16(isIdentifier) << parserPushTokenValue) |
			(boolToInt16(isCloseSingleElementTag) << parserReduceElement)

		next := boolToInt8(isIdentifier)*parseElementAttribute +
			boolToInt8(isCloseSingleElementTag || isCloseElementTag)*parseElements

		return parserTransition{
			op:      op,
			next:    next,
			invalid: invalid,
		}
	},
	// parseElementAttribute
	func(tok Token) parserTransition {
		isPrefixSep := tok.Type == TOK_PREFIX_SEP // shift, go to parseElementAttributeName01
		isEqual := tok.Type == TOK_EQUAL          // shift, reduce qname (no prefix), go to parseElementAttributeValue

		invalid := !isPrefixSep && !isEqual

		op := (1 << parserShift) | (boolToInt16(isEqual) << parserReduceQName)

		next := boolToInt8(isPrefixSep)*parseElementAttributeName01 + boolToInt8(isEqual)*parseElementAttributeValue

		return parserTransition{
			op:      op,
			next:    next,
			invalid: invalid,
		}
	},
	// parseElementAttributeName01
	// prefixed attribute name
	func(tok Token) parserTransition {
		isIdentifier := tok.Type == TOK_ID // shift, push token value, reduce QName, go to parseElementAttribute

		invalid := !isIdentifier
		op := (1 << parserShift) | (1 << parserPushTokenValue) | (1 << parserReduceQNameWithPrefix)
		next := parseElementAttributeName02

		return parserTransition{
			op:      int16(op),
			next:    int8(next),
			invalid: invalid,
		}
	},
	// parseElementAttributeName02
	func(tok Token) parserTransition {
		isEqual := tok.Type == TOK_EQUAL // shift, go to parseElementAttributeValue
		invalid := !isEqual

		op := (1 << parserShift)

		next := boolToInt8(isEqual) * parseElementAttributeValue

		return parserTransition{
			op:      int16(op),
			next:    next,
			invalid: invalid,
		}
	},
	// parseElementAttributeValue
	func(tok Token) parserTransition {
		isString := tok.Type == TOK_STRING // shift, push token value, reduce attribute, go to parseOpeningTagElement

		invalid := !isString
		op := (1 << parserShift) | (1 << parserPushTokenValue) | (1 << parserReduceAttribute)
		next := parseOpeningTagElement

		return parserTransition{
			op:      int16(op),
			next:    int8(next),
			invalid: invalid,
		}
	},
	// parseClosingTagElement
	// Parse </prefix:foo>
	func(tok Token) parserTransition {
		isIdentifier := tok.Type == TOK_ID // shift, go to parseClosingTagNameElement01
		invalid := !isIdentifier

		op := (1 << parserShift)
		next := parseClosingTagNameElement01

		return parserTransition{
			op:      int16(op),
			next:    int8(next),
			invalid: invalid,
		}
	},
	//11: parseClosingTagNameElement-01
	// Check if prefix is set
	func(tok Token) parserTransition {
		isTokenPrefixSep := tok.Type == TOK_PREFIX_SEP // shift, go to parseClosingTagNameElement02
		isEndOfTagName := !isTokenPrefixSep            // rewind, go to parseClosingTagNameElement03

		op := (boolToInt16(isTokenPrefixSep) << parserShift)
		next := boolToInt8(isTokenPrefixSep)*parseClosingTagNameElement02 + boolToInt8(isEndOfTagName)*parseClosingTagNameElement03

		return parserTransition{
			op:   op,
			next: next,
		}
	},
	//12: parseClosingTagNameElement-02
	// Retrieve the local name
	func(tok Token) parserTransition {
		isIdentifier := tok.Type == TOK_ID // shift, go to parseClosingTagNameElement03
		invalid := !isIdentifier

		op := (1 << parserShift)
		next := parseClosingTagNameElement03

		return parserTransition{
			op:      int16(op),
			next:    int8(next),
			invalid: invalid,
		}
	},
	//13: parseClosingTagNameElement03
	// Check for closing tag ">"
	func(tok Token) parserTransition {
		isCloseElementTag := tok.Type == TOK_CLOSE_ELEMENT_TAG // shift, reduce element, go to parseElements
		invalid := !isCloseElementTag

		op := (1 << parserShift) | (1 << parserReduceElement)
		next := parseElements

		return parserTransition{
			op:      int16(op),
			next:    next,
			invalid: invalid,
		}
	},
	//14: parseProcInstElement
	func(tok Token) parserTransition {
		isIdentifier := tok.Type == TOK_ID // shift, push token value, reduce qname, reduce tag name, go to parseProcInstElement01
		invalid := !isIdentifier

		op := (1 << parserShift) | (1 << parserPushTokenValue) | (1 << parserReduceQName) | (1 << parserReduceTagName)
		next := parseProcInstElement01

		return parserTransition{
			op:      int16(op),
			next:    next,
			invalid: invalid,
		}
	},
	//15: parseProcInstElement01
	func(tok Token) parserTransition {
		isIdentifier := tok.Type == TOK_ID                // shift, push token value, reduce QName, go to parseProcInstElementAttribute
		isCloseProcInst := tok.Type == TOK_CLOSE_PROCINST // shift, reduce element, go to parseElements

		invalid := !isIdentifier && !isCloseProcInst

		op := (1 << parserShift) |
			(boolToInt16(isIdentifier) << parserPushTokenValue) | (boolToInt16(isIdentifier) << parserReduceQName) |
			(boolToInt16(isCloseProcInst) << parserReduceElement)

		next := (boolToInt8(isIdentifier) * parseProcInstElementAttribute) + (boolToInt8(isCloseProcInst) * parseElements)

		return parserTransition{
			op:      op,
			next:    next,
			invalid: invalid,
		}
	},
	//16: parseProcInstElementAttribute
	func(tok Token) parserTransition {
		isEqual := tok.Type == TOK_EQUAL // shift, go to parseProcInstElementAttribute01

		invalid := !isEqual
		op := (1 << parserShift)
		next := parseProcInstElementAttribute01

		return parserTransition{
			op:      int16(op),
			next:    next,
			invalid: invalid,
		}
	},
	//17: parseProcInstElementAttribute01
	func(tok Token) parserTransition {
		isString := tok.Type == TOK_STRING // shift, push token value, reduce attribute, go to parseProcInstElement01

		invalid := !isString
		op := (1 << parserShift) | (1 << parserPushTokenValue) | (1 << parserReduceAttribute)
		next := parseProcInstElement01

		return parserTransition{
			op:      int16(op),
			next:    next,
			invalid: invalid,
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
	if p.elStack.Last().IsSome() {
		parent := p.elStack.Last().Expect()
		p.trace(func() string {
			return fmt.Sprintf("reducing element %s in %s", element, parent)
		})
		parent.AttachChild(element)
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

		transition := parserStates[p.state](tok)

		if transition.invalid {
			return result.Failed[Document](errors.New(
				fmt.Sprintf(
					"Invalid token %s at (row: %d, col: %d), expecting: %s #%d",
					tok.TypeName(),
					tok.Row,
					tok.Col,
					strings.Join(expectedTokens[p.state], ", "),
					p.state,
				),
			))
		}

		p.trace(func() string {
			return fmt.Sprintf("state #%d, token: %s", p.state, tok)
		})

		// Decode operations
		shift := ((transition.op >> parserShift) & 1) == 1
		pushTokenValue := ((transition.op >> parserPushTokenValue) & 1) == 1
		pushElement := ((transition.op >> parserPushElement) & 1) == 1
		reduceFlag := ((transition.op >> parserReduceFlag) & 1) == 1
		reduceQName := ((transition.op >> parserReduceQName) & 1) == 1
		reduceQNameWithPrefix := ((transition.op >> parserReduceQNameWithPrefix) & 1) == 1
		reduceTagName := ((transition.op >> parserReduceTagName) & 1) == 1
		reduceAttribute := ((transition.op >> parserReduceAttribute) & 1) == 1
		reduceText := ((transition.op >> parserReduceText) & 1) == 1
		reduceElement := ((transition.op >> parserReduceElement) & 1) == 1

		/// Execute the operations
		// Rewind
		if !shift {
			p.rewindToken(tok)
			p.trace(func() string {
				return fmt.Sprintf("rewinding")
			})
		} else {
			p.trace(func() string {
				return fmt.Sprintf("shifting")
			})
		}

		// Push commands
		if pushElement {
			p.trace(func() string {
				return fmt.Sprintf("pushing new element")
			})
			p.elStack.Push(Element{Children: []Element{}})
		}

		if pushTokenValue {
			p.trace(func() string {
				return fmt.Sprintf("pushing token value \"%s\"", tok.Value)
			})
			p.stack.Push(tok.Value)
		}

		// Reduce flag
		if reduceFlag {
			element := p.elStack.Last().Expect()
			element.Flag = element.Flag | transition.flag
			p.trace(func() string {
				return fmt.Sprintf("reducing flag %d in %s", transition.flag, element)
			})
		}

		// Reduce to text
		if reduceText {
			element := p.elStack.Last().Expect()
			text := p.stack.Pop().Expect().(string)
			element.Text = text
			p.trace(func() string {
				return fmt.Sprintf("reducing text %s in %s", text, element)
			})
		}

		// Reduce to a QName
		if reduceQName {
			local := p.stack.Pop().Expect().(string)
			qname := QName{Local: local}
			p.stack.Push(qname)
			p.trace(func() string {
				return fmt.Sprintf("reducing QName %s", qname)
			})
		}

		// Reduce to a QName, with a Prefix
		if reduceQNameWithPrefix {
			local := p.stack.Pop().Expect().(string)
			prefix := p.stack.Pop().Expect().(string)
			qname := QName{Local: local, Prefix: option.Some(prefix)}
			p.stack.Push(qname)
			p.trace(func() string {
				return fmt.Sprintf("reducing QName (with prefix) %s", qname)
			})
		}

		if reduceTagName {
			element := p.elStack.Last().Expect()
			qname := p.stack.Pop().Expect().(QName)
			element.Tag = qname
			p.trace(func() string {
				return fmt.Sprintf("reducing tag name %s in %s", qname, element)
			})
		}

		// Reduce the attribute
		if reduceAttribute {
			element := p.elStack.Last().Expect()
			attrValue := p.stack.Pop().Expect().(string)
			attrName := p.stack.Pop().Expect().(QName)
			attr := Attribute{
				Name:  attrName,
				Value: attrValue,
			}
			element.AttachAttribute(attr)
			p.trace(func() string {
				return fmt.Sprintf("reducing attribute %s in %s", attr, element)
			})
		}

		// Reduce the element
		if reduceElement {
			el := p.elStack.Pop().Expect()
			p.attachToParentOrDocument(el)
		}

		p.state = transition.next

		p.trace(func() string {
			return fmt.Sprintf("go to #%d", transition.next)
		})

	}
}
