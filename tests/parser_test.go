package tests

import (
	"fmt"
	"strings"
	"testing"

	"github.com/gpabois/goxml"
	"github.com/stretchr/testify/assert"
)

const COMPLEX_XML = `<?xml version="1.0" encoding="UTF-8"?>
<office:document-content xmlns:office="urn:oasis:names:tc:opendocument:xmlns:office:1.0" xmlns:calcext="urn:org:documentfoundation:names:experimental:calc:xmlns:calcext:1.0" xmlns:chart="urn:oasis:names:tc:opendocument:xmlns:chart:1.0" xmlns:css3t="http://www.w3.org/TR/css3-text/" xmlns:dc="http://purl.org/dc/elements/1.1/" xmlns:dom="http://www.w3.org/2001/xml-events" xmlns:dr3d="urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0" xmlns:draw="urn:oasis:names:tc:opendocument:xmlns:drawing:1.0" xmlns:drawooo="http://openoffice.org/2010/draw" xmlns:field="urn:openoffice:names:experimental:ooo-ms-interop:xmlns:field:1.0" xmlns:fo="urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0" xmlns:form="urn:oasis:names:tc:opendocument:xmlns:form:1.0" xmlns:formx="urn:openoffice:names:experimental:ooxml-odf-interop:xmlns:form:1.0" xmlns:grddl="http://www.w3.org/2003/g/data-view#" xmlns:loext="urn:org:documentfoundation:names:experimental:office:xmlns:loext:1.0" xmlns:math="http://www.w3.org/1998/Math/MathML" xmlns:meta="urn:oasis:names:tc:opendocument:xmlns:meta:1.0" xmlns:number="urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0" xmlns:of="urn:oasis:names:tc:opendocument:xmlns:of:1.2" xmlns:officeooo="http://openoffice.org/2009/office" xmlns:ooo="http://openoffice.org/2004/office" xmlns:oooc="http://openoffice.org/2004/calc" xmlns:ooow="http://openoffice.org/2004/writer" xmlns:rpt="http://openoffice.org/2005/report" xmlns:script="urn:oasis:names:tc:opendocument:xmlns:script:1.0" xmlns:style="urn:oasis:names:tc:opendocument:xmlns:style:1.0" xmlns:svg="urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0" xmlns:table="urn:oasis:names:tc:opendocument:xmlns:table:1.0" xmlns:tableooo="http://openoffice.org/2009/table" xmlns:text="urn:oasis:names:tc:opendocument:xmlns:text:1.0" xmlns:xforms="http://www.w3.org/2002/xforms" xmlns:xhtml="http://www.w3.org/1999/xhtml" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" office:version="1.3">
   <office:scripts />
   <office:font-face-decls>
      <style:font-face style:name="Liberation Sans" svg:font-family="'Liberation Sans'" style:font-family-generic="swiss" style:font-pitch="variable" />
      <style:font-face style:name="Liberation Serif" svg:font-family="'Liberation Serif'" style:font-family-generic="roman" style:font-pitch="variable" />
      <style:font-face style:name="Lucida Sans" svg:font-family="'Lucida Sans'" style:font-family-generic="system" style:font-pitch="variable" />
      <style:font-face style:name="Lucida Sans1" svg:font-family="'Lucida Sans'" style:font-family-generic="swiss" />
      <style:font-face style:name="Microsoft YaHei" svg:font-family="'Microsoft YaHei'" style:font-family-generic="system" style:font-pitch="variable" />
      <style:font-face style:name="NSimSun" svg:font-family="NSimSun" style:font-family-generic="system" style:font-pitch="variable" />
   </office:font-face-decls>
   <office:automatic-styles />
   <office:body>
      <office:text>
         <text:sequence-decls>
            <text:sequence-decl text:display-outline-level="0" text:name="Illustration" />
            <text:sequence-decl text:display-outline-level="0" text:name="Table" />
            <text:sequence-decl text:display-outline-level="0" text:name="Text" />
            <text:sequence-decl text:display-outline-level="0" text:name="Drawing" />
            <text:sequence-decl text:display-outline-level="0" text:name="Figure" />
         </text:sequence-decls>
         <text:p text:style-name="Standard" />
      </office:text>
   </office:body>
</office:document-content>
`

func Test_Parser_ComplexDocument(t *testing.T) {
	stream := strings.NewReader(COMPLEX_XML)
	parser := goxml.NewParser(stream, goxml.ParserArgs{Debug: true})
	defer func() {
		fmt.Println("=== PARSER TRACE ===")
		fmt.Println(strings.Join(parser.GetDebugTrace(), "\n"))
		fmt.Println("=== END OF PARSER TRACE ===")
	}()
	docRes := parser.Parse()

	assert.False(t, docRes.HasFailed(), docRes.UnwrapError())
	assert.Equal(t, XML_DOC, docRes.Expect())

}

func Test_Parser(t *testing.T) {
	stream := strings.NewReader(XML)

	parser := goxml.NewParser(stream, goxml.ParserArgs{Debug: true})

	defer func() {
		fmt.Println("=== PARSER TRACE ===")
		fmt.Println(strings.Join(parser.GetDebugTrace(), "\n"))
		fmt.Println("=== END OF PARSER TRACE ===")
	}()

	docRes := parser.Parse()

	assert.False(t, docRes.HasFailed(), docRes.UnwrapError())
	assert.Equal(t, XML_DOC, docRes.Expect())

}
