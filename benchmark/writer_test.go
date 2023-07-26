package benchmark

import (
	"bytes"
	"testing"

	"github.com/gpabois/goxml"
)

var XML_DOC = goxml.NewDocument([]goxml.Element{
	goxml.NewElement("xml", "", goxml.ProcInstFlag, []goxml.Element{},
		[]goxml.Attribute{
			goxml.NewAttribute("version", "1.0"),
			goxml.NewAttribute("encoding", "UTF-8"),
		},
	),
	goxml.NewElement("prefix:text", "", 0,
		[]goxml.Element{
			goxml.NewElement("para", "", 0,
				[]goxml.Element{
					goxml.NewTextElement("hello world"),
					goxml.NewElement("foo", "", 0, []goxml.Element{
						goxml.NewTextElement("else"),
					}, []goxml.Attribute{}),
				},
				[]goxml.Attribute{},
			),
		},
		[]goxml.Attribute{},
	),
})

func BenchmarkWriter(b *testing.B) {
	for n := 0; n < b.N; n++ {
		stream := bytes.NewBuffer(make([]byte, 0))
		XML_DOC.WriteTo(stream, goxml.WriteArgs{})
	}
}
