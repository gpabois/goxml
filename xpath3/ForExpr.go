package xpath3

import parser "github.com/gpabois/goxml/xpath3/anltr"

type ForExpr struct {
	Bindings []Binding
	Expr     any // Loop over value
}

// Generate ForExpr
func (v *xPathAstVisitor) ExitForExpr(c *parser.ForExprContext) {
	bindings, expr := v.stack.Pop().Expect().(Bindings), v.stack.Pop()
	v.stack.Push(ForExpr{Bindings: bindings, Expr: expr})
}

// Generate Bindings
func (v *xPathAstVisitor) ExitForBindingList(c *parser.ForBindingListContext) {
	switch c.ForBindingList() {
	// forBindingList : simpleForBinding
	case nil:
		v.reduceBindingsFromSimpleBinding()
	// forBindingList : forBindingList ',' simpleForBinding
	default:
		v.reduceBindings()
	}
}

func (v *xPathAstVisitor) ExitSimpleForBinding(c *parser.SimpleForBindingContext) {
	varName, expr := v.stack.Pop().Expect().(string), v.stack.Pop().Expect()
	v.stack.Push(Binding{
		Symbol: varName,
		Expr:   expr,
	})
}
