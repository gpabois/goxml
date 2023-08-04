package xpath3

import parser "github.com/gpabois/goxml/xpath3/anltr"

// Ex: 10 to 10
type RangeExpr struct {
	Begin any
	End   any
}

func (v *xPathAstVisitor) ExitRangeExpr(c *parser.RangeExprContext) {
	if c.RangeExpr() != nil {
		begin := v.stack.Pop().Expect()
		end := v.stack.Pop().Expect()

		v.stack.Push(RangeExpr{
			Begin: begin,
			End:   end,
		})
	}
}
