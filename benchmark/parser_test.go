package benchmark

import (
	"strings"
	"testing"

	"github.com/gpabois/goxml"
)

const XML = `
<?xml version="1.0" encoding="UTF-8"?>
<prefix:text>
  <para>hello world<foo>else</foo></para>
</prefix:text>
`

func BenchmarkParser(b *testing.B) {
	stream := strings.NewReader(XML)

	for n := 0; n < b.N; n++ {
		parser := goxml.NewParser(stream, goxml.ParserArgs{Debug: true})
		parser.Parse()
	}
}
