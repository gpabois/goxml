package goxml

import (
	"fmt"

	"github.com/gpabois/gostd/option"
)

type Document struct {
	Children []Element
}

func (doc *Document) AttachChild(child Element) {
	child.NamespaceTable.Attach(&child.NamespaceTable)
	doc.Children = append(doc.Children, child)
}

type QName struct {
	Local          string
	Prefix         option.Option[string]
	NamespaceTable NamespaceTable
}

func (q QName) String() string {
	if q.Prefix.IsSome() {
		return fmt.Sprintf("%s:%s", q.Prefix.Expect(), q.Local)
	}
	return q.Local
}

type NamespaceTable struct {
	parent option.Option[*NamespaceTable]
	table  map[string]string // Map prefix -> NS URI
}

func (table *NamespaceTable) Attach(parent *NamespaceTable) {
	table.parent = option.Some(parent)
}

type Attribute struct {
	Name  QName
	Value string
}

const ProcInstFlag = 0b1

type Element struct {
	Tag            QName
	Text           string
	Children       []Element
	Attributes     map[string]Attribute
	Single         bool
	NamespaceTable NamespaceTable
	Flag           byte
}

func (el *Element) AttachAttribute(attr Attribute) {
	attr.Name.NamespaceTable.Attach(&el.NamespaceTable)
}

func (el *Element) AttachChild(child Element) {
	child.NamespaceTable.Attach(&child.NamespaceTable)
	el.Children = append(el.Children, child)
}
