package xpath3

import parser "github.com/gpabois/goxml/xpath3/anltr"

type RelativePathExpr struct {
	Left  any
	Step  string
	Right any
}

func (v *xPathAstVisitor) ExitRelativePathExpr(c *parser.RelativePathExprContext) {
	if c.GetStepOp() != nil {
		left := v.stack.Pop().Expect()
		right := v.stack.Pop().Expect()
		step := c.GetStepOp().GetText()

		v.stack.Push(RelativePathExpr{
			Left:  left,
			Right: right,
			Step:  step,
		})
	}
}
