package xpath3

import parser "github.com/gpabois/goxml/xpath3/anltr"

type LetExpr struct {
	Bindings []Binding
	Expr     any // Return value
}

// Generate ForExpr
func (v *xPathAstVisitor) ExitLetExpr(c *parser.XPathContext) {
	bindings, expr := v.stack.Pop().Expect().(Bindings), v.stack.Pop()
	v.stack.Push(LetExpr{Bindings: bindings, Expr: expr})
}

// Generate Bindings
func (v *xPathAstVisitor) ExitLetBindingList(c *parser.XPathContext) {
	switch c.GetAltNumber() {
	// letBindingList : simpleLetBinding
	case 0:
		v.stack.Push(Bindings{v.stack.Pop().Expect().(Binding)})
	// letBindingList : letBindingList ',' simpleLetBinding
	case 1:
		left, right := v.stack.Pop().Expect().(Bindings), v.stack.Pop().Expect().(Binding)
		left = append(left, right)
		v.stack.Push(left)
	}
}

func (v *xPathAstVisitor) ExitLetSimpleForBinding(c *parser.XPathContext) {
	varName, expr := v.stack.Pop().Expect().(string), v.stack.Pop().Expect()
	v.stack.Push(Binding{
		Symbol: varName,
		Expr:   expr,
	})
}
