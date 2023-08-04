package xpath3

import parser "github.com/gpabois/goxml/xpath3/anltr"

// Quantified expressions support existential and universal quantification. The value of a quantified expression is always true or false.
// Ex: every $part in /parts/part satisfies $part/@discounted
type QuantifiedExpr struct {
	Operation string
	Bindings  Bindings
	Expr      any
}

func (v *xPathAstVisitor) ExitQuantifiedExpr(c *parser.QuantifiedExprContext) {
	if c.GetQuantifiedOp() != nil {
		op := c.GetQuantifiedOp().GetText()
		bindings := v.stack.Pop().Expect().(Bindings)
		expr := v.stack.Pop().Expect()

		v.stack.Push(QuantifiedExpr{
			Operation: op,
			Bindings:  bindings,
			Expr:      expr,
		})
	}
}

// Generate Bindings
func (v *xPathAstVisitor) ExitQuantifiedBindingList(c *parser.QuantifiedBindingListContext) {
	switch c.QuantifiedBindingList() {
	// quantifiedBindingList : simpleQuantifiedBinding
	case nil:
		v.reduceBindingsFromSimpleBinding()
	// quantifiedBindingList : quantifiedBindingList ',' simpleQuantifiedBinding;
	default:
		v.reduceBindings()
	}
}

// Generate Binding
func (v *xPathAstVisitor) ExitSimpleQuantifiedBinding(c *parser.SimpleQuantifiedBindingContext) {
	varName, expr := v.stack.Pop().Expect().(string), v.stack.Pop().Expect()
	v.stack.Push(Binding{
		Symbol: varName,
		Expr:   expr,
	})
}
