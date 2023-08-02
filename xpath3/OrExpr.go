package xpath3

import parser "github.com/gpabois/goxml/xpath3/anltr"

type OrExpr struct {
	Expressions Expressions
}

func (v *xPathAstVisitor) ExitOrExpr(c *parser.OrExprContext) {
	switch c.OrExpr() {
	case nil:
		v.stack.Push(OrExpr{Expressions{v.stack.Pop().Expect()}})
	default:
		left := v.stack.Pop().Expect().(OrExpr)
		right := v.stack.Pop().Expect()

		left.Expressions = append(left.Expressions, right)
		v.stack.Push(left)
	}
}
