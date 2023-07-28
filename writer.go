package goxml

import (
	"io"
	"strings"

	"github.com/gpabois/gostd/iter"
)

type WriteArgs struct {
	Level int
}

func (doc *Document) WriteTo(w io.Writer, args WriteArgs) {
	for _, c := range doc.Children {
		c.WriteTo(w, WriteArgs{Level: 0})
	}
}

func (el *Element) WriteTo(w io.Writer, args WriteArgs) {
	io.WriteString(w, strings.Repeat(" ", args.Level*2))

	if el.Flag&ProcInstFlag > 0 {
		io.WriteString(w, "<?")
		io.WriteString(w, el.Tag.String())
		writeAttributes(w, el, args)
		io.WriteString(w, "?>\n")
	} else if el.Flag&TextElementFlag > 0 {
		io.WriteString(w, el.Text)
	} else if el.Flag&CommentElementFlag > 0 {
		io.WriteString(w, "<!-- ")
		io.WriteString(w, el.Text)
		io.WriteString(w, "-->")
	} else {
		io.WriteString(w, "<")
		io.WriteString(w, el.Tag.String())
		writeAttributes(w, el, args)
		if (el.Flag & SingleElementFlag) == SingleElementFlag {
			io.WriteString(w, "/>")
		} else {
			io.WriteString(w, ">")

			writeChildren(w, el, args)

			io.WriteString(w, "\n")
			io.WriteString(w, strings.Repeat(" ", args.Level*2))
			io.WriteString(w, "</")
			io.WriteString(w, el.Tag.String())
			io.WriteString(w, ">")
		}
	}
}

func writeChildren(w io.Writer, el *Element, args WriteArgs) {
	args.Level += 1
	for _, c := range el.Children {
		io.WriteString(w, "\n")
		c.WriteTo(w, args)
	}
}

func writeAttributes(w io.Writer, el *Element, args WriteArgs) {
	if el.Attributes.Length() > 0 {
		io.WriteString(w, " ")
		n := 0

		iter.ForEach(el.Attributes.Iter(), func(a Attribute) {
			a.WriteTo(w, args)
			if n < len(el.Children)-1 {
				io.WriteString(w, " ")
			}
			n++
		})
	}
}

func (attr *Attribute) WriteTo(w io.Writer, args WriteArgs) {
	attr.Name.WriteTo(w, args)

	io.WriteString(w, "=\"")
	io.WriteString(w, strings.ReplaceAll(attr.Value, "\"", "\\\""))
	io.WriteString(w, "\"")
}

func (qname *QName) WriteTo(w io.Writer, args WriteArgs) {
	io.WriteString(w, qname.String())
}
