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

// Generate ForExpr
func (v *xPathAstVisitor) ExitForExpr(c *parser.XPathContext) {
	bindings, expr := v.stack.Pop().Expect().(Bindings), v.stack.Pop()
	v.stack.Push(ForExpr{Bindings: bindings, Expr: expr})
}

// Generate Bindings
func (v *xPathAstVisitor) ExitForBindingList(c *parser.XPathContext) {
	switch c.GetAltNumber() {
	// forBindingList : simpleForBinding
	case 0:
		v.stack.Push(Bindings{v.stack.Pop().Expect().(Binding)})
	// forBindingList : forBindingList ',' simpleForBinding
	case 1:
		left, right := v.stack.Pop().Expect().(Bindings), v.stack.Pop().Expect().(Binding)
		left = append(left, right)
		v.stack.Push(left)
	}
}

func (v *xPathAstVisitor) ExitForSimpleForBinding(c *parser.XPathContext) {
	varName, expr := 
}

func ParseXPathWithString(xpath string)
