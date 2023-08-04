package xpath3

import parser "github.com/gpabois/goxml/xpath3/anltr"

// Ex: $seq1 is bound to (A, B), $seq2 is bound to (A, B), $seq3 is bound to (B, C)
// $seq1 union $seq2 evaluates to the sequence (A, B).
// $seq1 intersect $seq2 evaluates to the sequence (A, B).
// $seq1 except $seq2 evaluates to the empty sequence.
type CombiningSequenceExpr struct {
	Left      any
	Operation string
	Right     any
}

func (v *xPathAstVisitor) ExitIntersectExceptExpr(c *parser.IntersectExceptExprContext) {
	if c.GetIntersectExceptOp() != nil {
		op := c.GetIntersectExceptOp().GetText()
		left := v.stack.Pop().Expect()
		right := v.stack.Pop().Expect()

		v.stack.Push(CombiningSequenceExpr{
			Operation: op,
			Left:      left,
			Right:     right,
		})
	}
}

func (v *xPathAstVisitor) ExitUnionExpr(c *parser.UnionExprContext) {
	if c.GetUnionOp() != nil {
		op := c.GetUnionOp().GetText()
		left := v.stack.Pop().Expect()
		right := v.stack.Pop().Expect()

		v.stack.Push(CombiningSequenceExpr{
			Operation: op,
			Left:      left,
			Right:     right,
		})
	}
}
