package tests

import (
	"strings"
	"testing"

	"github.com/gpabois/goxml"
	"github.com/stretchr/testify/assert"
)

func Test_Parser(t *testing.T) {
	stream := strings.NewReader(XML)

	parser := goxml.NewParser(stream)
	docRes := parser.Parse()

	assert.False(t, docRes.HasFailed(), docRes.UnwrapError())
}
