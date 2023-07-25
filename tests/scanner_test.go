package tests

import (
	"strings"
	"testing"

	"github.com/gpabois/gostd/iter"
	"github.com/gpabois/gostd/result"
	"github.com/gpabois/goxml"
	"github.com/stretchr/testify/assert"
)

const XML = `
<?xml version="1.0" encoding="UTF-8"?>
<prefix:text>
  <para>hello world<foo>else</foo></para>
</prefix:text>
`

var XML_TOKENS = []goxml.Token{
	{Type: goxml.TOK_OPEN_PROCINST, Value: "<?", Row: 0, Col: 0},
	{Type: goxml.TOK_ID, Value: "xml", Row: 1, Col: 3},
	{Type: goxml.TOK_ID, Value: "version", Row: 1, Col: 6},
	{Type: goxml.TOK_EQUAL, Value: "=", Row: 1, Col: 14},
	{Type: goxml.TOK_STRING, Value: "1.0", Row: 1, Col: 15},
	{Type: goxml.TOK_ID, Value: "encoding", Row: 1, Col: 20},
	{Type: goxml.TOK_EQUAL, Value: "=", Row: 1, Col: 29},
	{Type: goxml.TOK_STRING, Value: "UTF-8", Row: 1, Col: 30},
	{Type: goxml.TOK_CLOSE_PROCINST, Value: "?>", Row: 1, Col: 37},
	{Type: goxml.TOK_OPEN_ELEMENT_TAG, Value: "<", Row: 1, Col: 39},
	{Type: goxml.TOK_ID, Value: "prefix", Row: goxml.TOK_ID, Col: 2},
	{Type: goxml.TOK_PREFIX_SEP, Value: ":", Row: goxml.TOK_ID, Col: 8},
	{Type: goxml.TOK_ID, Value: "text", Row: goxml.TOK_ID, Col: 9},
	{Type: goxml.TOK_CLOSE_ELEMENT_TAG, Value: ">", Row: goxml.TOK_ID, Col: 13},
	{Type: goxml.TOK_OPEN_ELEMENT_TAG, Value: "<", Row: goxml.TOK_ID, Col: 14},
	{Type: goxml.TOK_ID, Value: "para", Row: goxml.TOK_STRING, Col: 4},
	{Type: goxml.TOK_CLOSE_ELEMENT_TAG, Value: ">", Row: goxml.TOK_STRING, Col: 8},
	{Type: goxml.TOK_STRING, Value: "hello world", Row: goxml.TOK_STRING, Col: 9},
	{Type: goxml.TOK_OPEN_ELEMENT_TAG, Value: "<", Row: goxml.TOK_STRING, Col: 20},
	{Type: goxml.TOK_ID, Value: "foo", Row: goxml.TOK_STRING, Col: 21},
	{Type: goxml.TOK_CLOSE_ELEMENT_TAG, Value: ">", Row: goxml.TOK_STRING, Col: 24},
	{Type: goxml.TOK_STRING, Value: "else", Row: goxml.TOK_STRING, Col: 25},
	{Type: goxml.TOK_OPEN_CLOSING_ELEMENT_TAG, Value: "</", Row: goxml.TOK_STRING, Col: 29},
	{Type: goxml.TOK_ID, Value: "foo", Row: goxml.TOK_STRING, Col: 31},
	{Type: goxml.TOK_CLOSE_ELEMENT_TAG, Value: ">", Row: goxml.TOK_STRING, Col: 34},
	{Type: goxml.TOK_OPEN_CLOSING_ELEMENT_TAG, Value: "</", Row: goxml.TOK_STRING, Col: 35},
	{Type: goxml.TOK_ID, Value: "para", Row: goxml.TOK_STRING, Col: 37},
	{Type: goxml.TOK_CLOSE_ELEMENT_TAG, Value: ">", Row: goxml.TOK_STRING, Col: 41},
	{Type: goxml.TOK_OPEN_CLOSING_ELEMENT_TAG, Value: "</", Row: goxml.TOK_STRING, Col: 42},
	{Type: goxml.TOK_ID, Value: "prefix", Row: 4, Col: 3},
	{Type: goxml.TOK_PREFIX_SEP, Value: ":", Row: 4, Col: 9},
	{Type: goxml.TOK_ID, Value: "text", Row: 4, Col: 10},
	{Type: goxml.TOK_CLOSE_ELEMENT_TAG, Value: ">", Row: 4, Col: 14},
	{Type: goxml.TOK_EOF, Value: "\x00", Row: 4, Col: 15},
}

func Test_Scanner(t *testing.T) {
	stream := strings.NewReader(XML)

	scanner := goxml.NewScanner(stream)
	var tokIterator iter.Iterator[result.Result[goxml.Token]]
	tokIterator = &scanner

	tokenRes := iter.Result_FromIter[[]goxml.Token](tokIterator)

	assert.False(t, tokenRes.HasFailed(), tokenRes.UnwrapError())
	tokens := tokenRes.Expect()

	assert.Equal(t, XML_TOKENS, tokens)
}
