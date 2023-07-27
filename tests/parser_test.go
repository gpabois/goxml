package tests

import (
	"fmt"
	"strings"
	"testing"

	"github.com/gpabois/goxml"
	"github.com/stretchr/testify/assert"
)

func Test_Parser(t *testing.T) {
	stream := strings.NewReader(XML)

	parser := goxml.NewParser(stream, goxml.ParserArgs{Debug: true})

	defer func() {
		fmt.Println("=== PARSER TRACE ===")
		fmt.Println(strings.Join(parser.GetTrace(), "\n"))
		fmt.Println("=== END OF PARSER TRACE ===")
	}()

	docRes := parser.Parse()

	assert.False(t, docRes.HasFailed(), docRes.UnwrapError())
	assert.Equal(t, XML_DOC, docRes.Expect())

}
