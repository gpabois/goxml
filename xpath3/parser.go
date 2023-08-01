package xpath3

import (
	"io"

	"github.com/antlr4-go/antlr/v4"
	"github.com/gpabois/gostd/collection"
	parser "github.com/gpabois/goxml/xpath3/anltr"
)

func newParser(r io.Reader) *parser.XPath3Parser {
	is := antlr.NewIoStream(r)
	lexer := parser.NewXPath3Lexer(is)
	stream := antlr.NewCommonTokenStream(lexer, antlr.TokenDefaultChannel)
	return parser.NewXPath3Parser(stream)
}

// Turn XPath into an AST
type xPathAstVisitor struct {
	parser.BaseXPath3Listener
	stack collection.Stack[any]
}

func ParseXPathWithString(xpath string)
