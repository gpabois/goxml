package xpath3

import parser "github.com/gpabois/goxml/xpath3/anltr"

type BinOpArithmeticExpr struct {
	Left      any
	Operation string
	Right     any
}

type UnaryExpr struct {
	Operation string
	Value     any
}

func (v *xPathAstVisitor) ExitMultiplicativeExpr(c *parser.MultiplicativeExprContext) {
	if c.GetMultiplicativeOp() != nil {
		op := c.GetMultiplicativeOp().GetText()
		left := v.stack.Pop().Expect()
		right := v.stack.Pop().Expect()

		v.stack.Push(BinOpArithmeticExpr{
			Operation: op,
			Left:      left,
			Right:     right,
		})
	}
}

func (v *xPathAstVisitor) ExitAdditiveExpr(c *parser.AdditiveExprContext) {
	if c.GetAdditiveOp() != nil {
		op := c.GetAdditiveOp().GetText()
		left := v.stack.Pop().Expect()
		right := v.stack.Pop().Expect()

		v.stack.Push(BinOpArithmeticExpr{
			Operation: op,
			Left:      left,
			Right:     right,
		})
	}
}
