package xpath3

type XPath struct {
	Expr any
}

type QuantifiedExpr struct {
	Bindings []Binding
	Expr     any // Satisfies
}

type Bindings []Binding

type Binding struct {
	Symbol string
	Expr   any
}
