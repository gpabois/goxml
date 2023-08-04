package xpath3

import parser "github.com/gpabois/goxml/xpath3/anltr"

type ComparisonExpr struct {
	Left      any
	Operation string
	Right     any
}

func (v *xPathAstVisitor) ExitComparisonExpr(c *parser.AndExprContext) {
	switch c.ComparisonExpr() {
	case nil:
		//
	default:
		left := v.stack.Pop().Expect()
		op := v.stack.Pop().Expect().(string)
		right := v.stack.Pop().Expect()

		v.stack.Push(ComparisonExpr{
			Left:      left,
			Operation: op,
			Right:     right,
		})
	}
}

func (v *xPathAstVisitor) ExitGeneralComp(c *parser.GeneralCompContext) {
	v.stack.Push(c.GetText())
}

func (v *xPathAstVisitor) ExitValueComp(c *parser.GeneralCompContext) {
	v.stack.Push(c.GetText())
}

func (v *xPathAstVisitor) ExitNodeComp(c *parser.GeneralCompContext) {
	v.stack.Push(c.GetText())
}
