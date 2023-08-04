package xpath3

import parser "github.com/gpabois/goxml/xpath3/anltr"

// The expression E castable as T returns true if the result of evaluating E can be successfully cast into the target type T by using a cast expression;
// otherwise it returns false.
// If evaluation of E fails with a dynamic error or if the value of E cannot be atomized, the castable expression as a whole fails.
// The castable expression can be used as a predicate to avoid errors at evaluation time.
// Instead, the purpose of treat is to ensure that an expression has an expected dynamic type at evaluation time.
// Ex: if ($x castable as hatsize)
//   then $x cast as hatsize
//   else if ($x castable as IQ)
//   then $x cast as IQ
//   else $x cast as xs:string
type CastableExpr struct {
	Expr any
	Type SingleType
}

func (v *xPathAstVisitor) ExitCastableExpr(c *parser.CastableExprContext) {
	if c.SingleType() != nil {
		expr := v.stack.Pop().Expect()
		typ := v.stack.Pop().Expect().(SingleType)
		v.stack.Push(CastableExpr{
			Expr: expr,
			Type: typ,
		})
	}
}
