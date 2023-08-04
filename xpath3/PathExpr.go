package xpath3

import (
	"github.com/gpabois/gostd/option"
	parser "github.com/gpabois/goxml/xpath3/anltr"
)

// A "/" at the beginning of a path expression is an abbreviation for the initial step (fn:root(self::node()) treat as document-node())/
//
// A "//" at the beginning of a path expression is an abbreviation for the initial steps (fn:root(self::node()) treat as document-node())/descendant-or-self::node()/
type PathExpr struct {
	Abbreviation option.Option[string]
	Path         option.Option[any]
}

func (v *xPathAstVisitor) ExitPathExpr(c *parser.PathExprContext) {
	var path option.Option[any]
	var abbv option.Option[string]

	if c.GetAbbvStep() != nil {
		abbv = option.Some(c.GetAbbvStep().GetText())
	}

	if c.RelativePathExpr() != nil && abbv.IsSome() {
		path = option.Some(v.stack.Pop().Expect())
		v.stack.Push(PathExpr{
			Abbreviation: abbv,
			Path:         path,
		})
	} else if c.RelativePathExpr() == nil && abbv.IsSome() {
		v.stack.Push(PathExpr{
			Abbreviation: abbv,
		})
	}
}
