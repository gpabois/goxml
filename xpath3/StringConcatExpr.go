package xpath3

import parser "github.com/gpabois/goxml/xpath3/anltr"

// String concatenation expressions allow the string representations of values to be concatenated.
// Ex: "con" || "cat" || "enate"
type StringConcatExpr struct {
	Left  any
	Right any
}

func (v *xPathAstVisitor) ExitStringConcatExpr(c *parser.StringConcatExprContext) {
	if c.StringConcatExpr() != nil {
		left := v.stack.Pop().Expect()
		right := v.stack.Pop().Expect()

		v.stack.Push(StringConcatExpr{
			Left:  left,
			Right: right,
		})
	}
}
