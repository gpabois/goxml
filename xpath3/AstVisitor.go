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

// bindings := simpleBinding
func (v *xPathAstVisitor) reduceBindingsFromSimpleBinding() {
	v.stack.Push(Bindings{v.stack.Pop().Expect().(Binding)})
}

// bindings := bindings, simpleBinding
func (v *xPathAstVisitor) reduceBindings() {
	left, right := v.stack.Pop().Expect().(Bindings), v.stack.Pop().Expect().(Binding)
	left = append(left, right)
	v.stack.Push(left)
}

func ParseXPathWithString(xpath string)
