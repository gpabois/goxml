package xpath3

import parser "github.com/gpabois/goxml/xpath3/anltr"

type ForExpr struct {
	Bindings []Binding
	Expr     any // Loop over value
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
	varName, expr := v.stack.Pop().Expect().(string), v.stack.Pop().Expect()
	v.stack.Push(Binding{
		Symbol: varName,
		Expr:   expr,
	})
}
