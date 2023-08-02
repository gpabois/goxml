package xpath3

import parser "github.com/gpabois/goxml/xpath3/anltr"

type Expressions []any

func (v *xPathAstVisitor) ExitExpr(c *parser.ExprContext) {
	switch c.Expr() {
	case nil:
		v.stack.Push(Expressions{v.stack.Pop().Expect()})
	default:
		left := v.stack.Pop().Expect().(Expressions)
		right := v.stack.Pop().Expect()

		left = append(left, right)
		v.stack.Push(left)
	}
}
