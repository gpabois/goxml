package xpath3

type XPath struct {
	Expr any
}

type ForExpr struct {
	Bindings []Binding
	Expr     any // Loop over value
}

type LetExpr struct {
	Bindings []Binding
	Expr     any // Return value
}

type QuantifiedExpr struct {
	Bindings []Binding
	Expr     any // Satisfies
}

const (
	LET_BINDING = byte(iota)
	IN_BINDING
)

type Bindings []Binding

type Binding struct {
	Type   byte
	Symbol string
	Expr   any
}
