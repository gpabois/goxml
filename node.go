package goxml

import (
	"fmt"
	"strings"

	"github.com/gpabois/gostd/option"
)

type Document struct {
	Children []Element
}

func NewDocument(children []Element) Document {
	doc := Document{}
	for _, c := range children {
		doc.AttachChild(c)
	}
	return doc
}

func (doc *Document) AttachChild(child Element) {
	doc.Children = append(doc.Children, child)
}

type QName struct {
	Local  string
	Prefix option.Option[string]
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

func NewAttribute(name any, value string) Attribute {
	attr := Attribute{}
	attr.Name = parseQName(name)
	attr.Value = value
	return attr
}

func (attr Attribute) String() string {
	return fmt.Sprintf("%s='%s'", attr.Name, attr.Value)
}

const ProcInstFlag = 0b1
const TextElementFlag = 0b10
const CommentElementFlag = 0b100

func parseQName(name any) QName {
	qname := QName{}
	switch t := name.(type) {
	case string:
		rawQname := strings.Split(t, ":")
		if len(rawQname) == 2 {
			qname = QName{Local: rawQname[1], Prefix: option.Some(rawQname[0])}
		} else {
			qname = QName{Local: t}
		}
	case QName:
		qname = t
	}
	return qname
}

func NewElement(tag any, text string, flag byte, children []Element, attributes []Attribute) Element {
	el := Element{}

	el.Attributes = make(map[string]Attribute)
	el.Children = make([]Element, 0)
	el.Tag = parseQName(tag)
	el.Text = text
	el.Flag = flag

	if el.Tag.String() == "#text" {
		el.Flag = el.Flag | TextElementFlag
	}

	if el.Tag.String() == "#comment" {
		el.Flag = el.Flag | CommentElementFlag
	}

	for _, c := range children {
		el.AttachChild(c)
	}
	for _, a := range attributes {
		el.AttachAttribute(a)
	}

	return el
}

func NewTextElement(text string) Element {
	return NewElement("#text", text, TextElementFlag, []Element{}, []Attribute{})
}

func NewCommentElement(text string) Element {
	return NewElement("#comment", text, CommentElementFlag, []Element{}, []Attribute{})
}

type Element struct {
	Tag        QName
	Text       string
	Children   []Element
	Attributes map[string]Attribute
	Flag       byte
}

func (el Element) String() string {
	return fmt.Sprintf("<%s attributes=%s text='%s'>", el.Tag, el.Attributes, el.Text)
}

func (el *Element) AttachAttribute(attr Attribute) {
	el.Attributes[attr.Name.String()] = attr
}

func (el *Element) AttachChild(child Element) {
	el.Children = append(el.Children, child)
}
