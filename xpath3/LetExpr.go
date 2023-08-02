package xpath3

import parser "github.com/gpabois/goxml/xpath3/anltr"

type LetExpr struct {
	Bindings []Binding
	Expr     any // Return value
}

// Generate ForExpr
func (v *xPathAstVisitor) ExitLetExpr(c *parser.LetExprContext) {
	bindings, expr := v.stack.Pop().Expect().(Bindings), v.stack.Pop()
	v.stack.Push(LetExpr{Bindings: bindings, Expr: expr})
}

// Generate Bindings
func (v *xPathAstVisitor) ExitLetBindingList(c *parser.LetBindingListContext) {
	switch c.LetBindingList() {
	// letBindingList : simpleLetBinding
	case nil:
		v.reduceBindingsFromSimpleBinding()
	// letBindingList : letBindingList ',' simpleLetBinding
	default:
		v.reduceBindings()
	}
}

func (v *xPathAstVisitor) ExitLetSimpleForBinding(c *parser.SimpleForBindingContext) {
	varName, expr := v.stack.Pop().Expect().(string), v.stack.Pop().Expect()
	v.stack.Push(Binding{
		Symbol: varName,
		Expr:   expr,
	})
}
