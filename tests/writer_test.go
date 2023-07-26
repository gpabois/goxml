package tests

import (
	"bytes"
	"testing"

	"github.com/gpabois/goxml"
	"github.com/stretchr/testify/assert"
)

const EXPECTED_XML_STR = `<?xml version="1.0"encoding="UTF-8"?>
<prefix:text>
  <para>
    hello world
    <foo>
      else
    </foo>
  </para>
</prefix:text>`

func Test_WriteTo(t *testing.T) {
	stream := bytes.NewBuffer(make([]byte, 0))
	XML_DOC.WriteTo(stream, goxml.WriteArgs{})
	str := stream.String()
	assert.Equal(t, EXPECTED_XML_STR, str)
}
