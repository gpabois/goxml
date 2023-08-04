package xpath3

import parser "github.com/gpabois/goxml/xpath3/anltr"

// XPath 3.1 supports a conditional expression based on the keywords if, then, and else.
// Ex: if ($widget1/unit-cost < $widget2/unit-cost) then $widget1 else $widget2
type ConditionalExpr struct {
	Predicates Expressions
	ThenExpr   any
	ElseExpr   any
}

func (v *xPathAstVisitor) ExitIfExpr(c *parser.IForExprContext) {
	predicates := v.stack.Pop().Expect().(Expressions)
	thenExpr := v.stack.Pop().Expect()
	elseExpr := v.stack.Pop().Expect()

	v.stack.Push(ConditionalExpr{
		Predicates: predicates,
		ThenExpr:   thenExpr,
		ElseExpr:   elseExpr,
	})
}
