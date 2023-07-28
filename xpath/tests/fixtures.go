package tests

import "github.com/gpabois/goxml/xpath"

//  selects the second section of the fifth chapter of the doc document element
const XPATH = "/child::doc/child::chapter[position()=5]/child::section[position()=2]"

var XPATH_TOKENS = []xpath.Token{
	{Type: xpath.TOKEN_OPERATOR, Value: "/", Row: 0, Col: 0},
	{Type: xpath.TOKEN_AXIS_NAME, Value: "child", Row: 0, Col: 2},
	{Type: xpath.TOKEN_DOUBLE_COLON, Value: "::", Row: 0, Col: 7},
	{Type: xpath.TOK_ID, Value: "doc", Row: 0, Col: 9},
	{Type: xpath.TOKEN_OPERATOR, Value: "/", Row: 0, Col: 12},
	{Type: xpath.TOKEN_AXIS_NAME, Value: "child", Row: 0, Col: 13},
	{Type: xpath.TOKEN_DOUBLE_COLON, Value: "::", Row: 0, Col: 18},
	{Type: xpath.TOK_ID, Value: "chapter", Row: 0, Col: 20},
	{Type: 10, Value: "[", Row: 0, Col: 27},
	{Type: xpath.TOK_ID, Value: "position", Row: 0, Col: 28},
	{Type: 12, Value: "(", Row: 0, Col: 36},
	{Type: 13, Value: ")", Row: 0, Col: 37},
	{Type: xpath.TOKEN_OPERATOR, Value: "=", Row: 0, Col: 38},
	{Type: xpath.TOK_NUMBER, Value: "5", Row: 0, Col: 39},
	{Type: 11, Value: "]", Row: 0, Col: 40},
	{Type: xpath.TOKEN_OPERATOR, Value: "/", Row: 0, Col: 41},
	{Type: xpath.TOKEN_AXIS_NAME, Value: "child", Row: 0, Col: 42},
	{Type: xpath.TOKEN_DOUBLE_COLON, Value: "::", Row: 0, Col: 47},
	{Type: xpath.TOK_ID, Value: "section", Row: 0, Col: 49},
	{Type: 10, Value: "[", Row: 0, Col: 56},
	{Type: xpath.TOK_ID, Value: "position", Row: 0, Col: 57},
	{Type: 12, Value: "(", Row: 0, Col: 65},
	{Type: 13, Value: ")", Row: 0, Col: 66},
	{Type: xpath.TOKEN_OPERATOR, Value: "=", Row: 0, Col: 67},
	{Type: xpath.TOK_NUMBER, Value: "2", Row: 0, Col: 68},
	{Type: 11, Value: "]", Row: 0, Col: 69},
	{Type: 1, Value: "\x00", Row: 0, Col: 70},
}
