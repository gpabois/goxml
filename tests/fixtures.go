package tests

import "github.com/gpabois/goxml"

const XML = `
<?xml version="1.0" encoding="UTF-8"?>
<prefix:text attr:foo="bar">
  <single-element />
  <para>hello world<graph>else</graph></para>
</prefix:text>
`

const EXPECTED_XML_STR = `<?xml version="1.0"encoding="UTF-8"?>
<prefix:text attr:foo="bar">
  <single-element />
  <para>
    hello world
    <graph>
      else
    </graph>
  </para>
</prefix:text>`

var XML_DOC = goxml.NewDocument([]goxml.Element{
	goxml.NewElement("xml", "", goxml.ProcInstFlag, []goxml.Element{},
		[]goxml.Attribute{
			goxml.NewAttribute("version", "1.0"),
			goxml.NewAttribute("encoding", "UTF-8"),
		},
	),
	goxml.NewElement("prefix:text", "", 0,
		[]goxml.Element{
			goxml.NewElement("single-element", "", goxml.SingleElementFlag, []goxml.Element{}, []goxml.Attribute{}),
			goxml.NewElement("para", "", 0,
				[]goxml.Element{
					goxml.NewTextElement("hello world"),
					goxml.NewElement("graph", "", 0, []goxml.Element{
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
	{Type: 12, Value: "<?", Row: 0, Col: 0},
	{Type: 2, Value: "xml", Row: 1, Col: 3},
	{Type: 2, Value: "version", Row: 1, Col: 6},
	{Type: 5, Value: "=", Row: 1, Col: 14},
	{Type: 3, Value: "1.0", Row: 1, Col: 15},
	{Type: 2, Value: "encoding", Row: 1, Col: 20},
	{Type: 5, Value: "=", Row: 1, Col: 29},
	{Type: 3, Value: "UTF-8", Row: 1, Col: 30},
	{Type: 13, Value: "?>", Row: 1, Col: 37},
	{Type: 6, Value: "<", Row: 1, Col: 39},
	{Type: 2, Value: "prefix", Row: 2, Col: 2},
	{Type: 4, Value: ":", Row: 2, Col: 8},
	{Type: 2, Value: "text", Row: 2, Col: 9},
	{Type: 2, Value: "attr", Row: 2, Col: 13},
	{Type: 4, Value: ":", Row: 2, Col: 18},
	{Type: 2, Value: "foo", Row: 2, Col: 19},
	{Type: 5, Value: "=", Row: 2, Col: 22},
	{Type: 3, Value: "bar", Row: 2, Col: 23},
	{Type: 9, Value: ">", Row: 2, Col: 28},
	{Type: 6, Value: "<", Row: 2, Col: 29},
	{Type: 2, Value: "single-element", Row: 3, Col: 4},
	{Type: 7, Value: "/>", Row: 3, Col: 18},
	{Type: 6, Value: "<", Row: 3, Col: 21},
	{Type: 2, Value: "para", Row: 4, Col: 4},
	{Type: 9, Value: ">", Row: 4, Col: 8},
	{Type: 3, Value: "hello world", Row: 4, Col: 9},
	{Type: 6, Value: "<", Row: 4, Col: 20},
	{Type: 2, Value: "graph", Row: 4, Col: 21},
	{Type: 9, Value: ">", Row: 4, Col: 26},
	{Type: 3, Value: "else", Row: 4, Col: 27},
	{Type: 8, Value: "</", Row: 4, Col: 31},
	{Type: 2, Value: "graph", Row: 4, Col: 33},
	{Type: 9, Value: ">", Row: 4, Col: 38},
	{Type: 8, Value: "</", Row: 4, Col: 39},
	{Type: 2, Value: "para", Row: 4, Col: 41},
	{Type: 9, Value: ">", Row: 4, Col: 45},
	{Type: 8, Value: "</", Row: 4, Col: 46},
	{Type: 2, Value: "prefix", Row: 5, Col: 3},
	{Type: 4, Value: ":", Row: 5, Col: 9},
	{Type: 2, Value: "text", Row: 5, Col: 10},
	{Type: 9, Value: ">", Row: 5, Col: 14},
	{Type: 1, Value: "\x00", Row: 5, Col: 15},
}
