package xpath3

import parser "github.com/gpabois/goxml/xpath3/anltr"

// The boolean operator instance of returns true if the value of its first operand matches the SequenceType in its second operand,
// according to the rules for SequenceType matching; otherwise it returns false.
// Ex: 5 instance of xs:integer
type InstanceofExpr struct {
	Left  any
	Right SequenceType
}

func (v *xPathAstVisitor) ExitInstanceofExpr(c *parser.InstanceofExprContext) {
	if c.SequenceType() != nil {
		left := v.stack.Pop().Expect()
		right := v.stack.Pop().Expect().(SequenceType)

		v.stack.Push(InstanceofExpr{
			Left:  left,
			Right: right,
		})
	}
}
