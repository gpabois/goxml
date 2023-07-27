package tests

import "github.com/gpabois/goxml"

const XML = `
<?xml version="1.0" encoding="UTF-8"?>
<prefix:text attr:foo="bar">
  <para>hello world<graph>else</graph></para>
</prefix:text>
`

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
		[]goxml.Attribute{
			goxml.NewAttribute("attr:foo", "bar"),
		},
	),
})

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
	{Type: goxml.TOK_ID, Value: "attr", Row: 2, Col: 13},
	{Type: goxml.TOK_PREFIX_SEP, Value: ":", Row: 2, Col: 18},
	{Type: goxml.TOK_ID, Value: "foo", Row: 2, Col: 19},
	{Type: goxml.TOK_EQUAL, Value: "=", Row: 2, Col: 22},
	{Type: goxml.TOK_STRING, Value: "bar", Row: 2, Col: 23},
	{Type: 9, Value: ">", Row: 2, Col: 28},
	{Type: 6, Value: "<", Row: 2, Col: 29},
	{Type: 2, Value: "para", Row: 3, Col: 4},
	{Type: 9, Value: ">", Row: 3, Col: 8},
	{Type: 3, Value: "hello world", Row: 3, Col: 9},
	{Type: 6, Value: "<", Row: 3, Col: 20},
	{Type: 2, Value: "graph", Row: 3, Col: 21},
	{Type: 9, Value: ">", Row: 3, Col: 26},
	{Type: 3, Value: "else", Row: 3, Col: 27},
	{Type: 8, Value: "</", Row: 3, Col: 31},
	{Type: 2, Value: "graph", Row: 3, Col: 33},
	{Type: 9, Value: ">", Row: 3, Col: 38},
	{Type: 8, Value: "</", Row: 3, Col: 39},
	{Type: 2, Value: "para", Row: 3, Col: 41},
	{Type: 9, Value: ">", Row: 3, Col: 45},
	{Type: 8, Value: "</", Row: 3, Col: 46},
	{Type: 2, Value: "prefix", Row: 4, Col: 3},
	{Type: 4, Value: ":", Row: 4, Col: 9},
	{Type: 2, Value: "text", Row: 4, Col: 10},
	{Type: 9, Value: ">", Row: 4, Col: 14},
	{Type: 1, Value: "\x00", Row: 4, Col: 15},
}
