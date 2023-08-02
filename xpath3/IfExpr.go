package xpath3

import parser "github.com/gpabois/goxml/xpath3/anltr"

// ifExpr: if' '(' expr ')' 'then' exprSingle 'else' exprSingle;
type IfExpr struct {
	Predicates Expressions
	ThenExpr   any
	ElseExpr   any
}

func (v *xPathAstVisitor) ExitIfExpr(c *parser.IForExprContext) {
	predicates := v.stack.Pop().Expect().(Expressions)
	thenExpr := v.stack.Pop().Expect()
	elseExpr := v.stack.Pop().Expect()

	v.stack.Push(IfExpr{
		Predicates: predicates,
		ThenExpr:   thenExpr,
		ElseExpr:   elseExpr,
	})
}
