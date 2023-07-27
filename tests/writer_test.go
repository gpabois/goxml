package tests

import (
	"bytes"
	"testing"

	"github.com/gpabois/goxml"
	"github.com/stretchr/testify/assert"
)

func Test_WriteTo(t *testing.T) {
	stream := bytes.NewBuffer(make([]byte, 0))
	XML_DOC.WriteTo(stream, goxml.WriteArgs{})
	str := stream.String()
	assert.Equal(t, EXPECTED_XML_STR, str)
}
