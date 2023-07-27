package goxml

import "fmt"

const (
	TOK_INVALID = iota
	TOK_EOF
	TOK_ID
	TOK_STRING
	TOK_PREFIX_SEP               // Symbol ":"
	TOK_EQUAL                    // Symbol "="
	TOK_OPEN_ELEMENT_TAG         // Symbol "<"
	TOK_CLOSE_SINGLE_ELEMENT_TAG // Symbol "/>"
	TOK_OPEN_CLOSING_ELEMENT_TAG // Symbol "</"
	TOK_CLOSE_ELEMENT_TAG        // Symbol ">"
	TOK_OPEN_COMMENT             // Symbol "<!--"
	TOK_CLOSE_COMMENT            // Symbol "-->"
	TOK_OPEN_PROCINST            // Symbol "<?"
	TOK_CLOSE_PROCINST           // Symbol "?>"
)

type Token struct {
	Type  int8
	Value string
	Row   int
	Col   int
}

func (tok Token) String() string {
	return fmt.Sprintf("[Token type=%s value=\"%s\" (r:%d, c:%d)]", tok.TypeName(), tok.Value, tok.Row, tok.Col)
}

func (tok Token) TypeName() string {
	switch tok.Type {
	case TOK_EOF:
		return "[EOF]"
	case TOK_INVALID:
		return "[INVALID]"
	case TOK_ID:
		return "identifier"
	case TOK_STRING:
		return "string"
	case TOK_PREFIX_SEP:
		return ":"
	case TOK_EQUAL:
		return "="
	case TOK_OPEN_ELEMENT_TAG:
		return "<"
	case TOK_OPEN_CLOSING_ELEMENT_TAG:
		return "</"
	case TOK_CLOSE_SINGLE_ELEMENT_TAG:
		return "/>"
	case TOK_CLOSE_ELEMENT_TAG:
		return ">"
	case TOK_OPEN_COMMENT:
		return "<!--"
	case TOK_CLOSE_COMMENT:
		return "-->"
	case TOK_OPEN_PROCINST:
		return "<?"
	case TOK_CLOSE_PROCINST:
		return "?>"
	default:
		return "[UNKNOWN]"
	}
}
