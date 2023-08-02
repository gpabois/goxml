package xpath3

type XPath struct {
	Expr any
}

type Bindings []Binding

type Binding struct {
	Symbol string
	Expr   any
}
