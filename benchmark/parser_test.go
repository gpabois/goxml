package benchmark

import (
	"io"
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
		stream.Seek(0, io.SeekStart)

		parser := goxml.NewParser(stream, goxml.ParserArgs{})
		parser.Parse()
	}
}
