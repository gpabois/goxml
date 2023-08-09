package xpath3

import parser "github.com/gpabois/goxml/xpath3/anltr"

// Ex: E1[E2]
type FilterExpr struct {
	Expr      any
	Predicate any
}

// Ex: E1(E2, E3, ...)
type DynamicFunctionCallExpr struct {
	Function  any
	Arguments []any
}

func (v *xPathAstVisitor) ExitPostfixExpr(c *parser.PostfixExprContext) {
	if c.Predicate() != nil { // Filter expression
		left := v.stack.Pop().Expect()
		right := v.stack.Pop().Expect()
		v.stack.Push(FilterExpr{
			Expr:      left,
			Predicate: right,
		})
	} else if c.ArgumentList() != nil { // Dynamic function call
		left := v.stack.Pop().Expect()
		right := v.stack.Pop().Expect().([]any)
		v.stack.Push(DynamicFunctionCallExpr{
			Function:  left,
			Arguments: right,
		})
	}
}

func (v *xPathAstVisitor) ExitArgumentList(c *parser.ArgumentListContext) {
	if c.Arguments() == nil {
		v.stack.Push([]any{})
	}
}

func (v *xPathAstVisitor) ExitArguments(c *parser.ArgumentsContext) {
	if c.Arguments() == nil {
		left := v.stack.Pop().Expect().([]any)
		left = append(left, v.stack.Pop().Expect())
		v.stack.Push(left)
	} else {
		single := v.stack.Pop().Expect()
		v.stack.Push([]any{single})
	}
}
