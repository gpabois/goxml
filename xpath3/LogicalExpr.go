package xpath3

import parser "github.com/gpabois/goxml/xpath3/anltr"

type LogicalExpr struct {
	Left      any
	Operation string
	Right     any
}

func (v *xPathAstVisitor) ExitOrExpr(c *parser.OrExprContext) {
	if c.OrExpr() != nil {
		left := v.stack.Pop()
		right := v.stack.Pop()
		v.stack.Push(LogicalExpr{
			Left:      left,
			Operation: "or",
			Right:     right,
		})
	}
}

func (v *xPathAstVisitor) ExitAndExpr(c *parser.AndExprContext) {
	if c.AndExpr() != nil {
		left := v.stack.Pop()
		right := v.stack.Pop()
		v.stack.Push(LogicalExpr{
			Left:      left,
			Operation: "and",
			Right:     right,
		})
	}
}
