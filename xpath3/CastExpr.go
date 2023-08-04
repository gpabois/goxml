package xpath3

import parser "github.com/gpabois/goxml/xpath3/anltr"

// A cast expression takes two operands: an input expression and a target type. The type of the atomized value of the input expression is called the input type.
// The SimpleTypeName must be the name of a type defined in the in-scope schema types, and it must be a simple type [err:XQST0052].
// In addition, the target type cannot be xs:NOTATION, xs:anySimpleType, or xs:anyAtomicType [err:XPST0080].
// The optional occurrence indicator "?" denotes that an empty sequence is permitted. If the target type is a lexical QName that has no namespace prefix,
// it is considered to be in the default element/type namespace.
type CastExpr struct {
	Expr any
	Type SingleType
}

func (v *xPathAstVisitor) ExitCastExpr(c *parser.CastExprContext) {
	if c.SingleType() != nil {
		expr := v.stack.Pop().Expect()
		typ := v.stack.Pop().Expect().(SingleType)
		v.stack.Push(CastExpr{
			Expr: expr,
			Type: typ,
		})
	}
}
