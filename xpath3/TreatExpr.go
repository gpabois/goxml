package xpath3

import parser "github.com/gpabois/goxml/xpath3/anltr"

// Like cast, the treat expression takes two operands: an expression and a SequenceType.
// Unlike cast, however, treat does not change the dynamic type or value of its operand.
// Instead, the purpose of treat is to ensure that an expression has an expected dynamic type at evaluation time.
// Ex: $myaddress treat as element(*, USAddress)
type TreatExpr struct {
	Expr any
	Type SequenceType
}

func (v *xPathAstVisitor) ExitTreatExpr(c *parser.TreatExprContext) {
	if c.SequenceType() != nil {
		expr := v.stack.Pop().Expect()
		typ := v.stack.Pop().Expect().(SequenceType)
		v.stack.Push(TreatExpr{
			Expr: expr,
			Type: typ,
		})
	}
}
