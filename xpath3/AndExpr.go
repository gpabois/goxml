package xpath3

import parser "github.com/gpabois/goxml/xpath3/anltr"

type AndExpr struct {
	Expressions Expressions
}

func (v *xPathAstVisitor) ExitAndExpr(c *parser.AndExprContext) {
	switch c.AndExpr() {
	case nil:
		v.stack.Push(AndExpr{Expressions{v.stack.Pop().Expect()}})
	default:
		left := v.stack.Pop().Expect().(AndExpr)
		right := v.stack.Pop().Expect()

		left.Expressions = append(left.Expressions, right)
		v.stack.Push(left)
	}
}
