package xpath

import "fmt"

const (
	TOK_INVALID = int8(iota)
	TOK_EOF
	TOK_LITERAL
	TOK_NUMBER
	TOK_WS
	TOK_ID
	TOKEN_AXIS_NAME
	TOKEN_WILDCARD                   // '*' for NameTesting
	TOKEN_ABBREVIATED_STEP           // '.', '..'
	TOKEN_ABBREVIATED_AXIS_SPECIFIER // '@'
	TOKEN_LEFT_BRACKET               // [
	TOKEN_RIGHT_BRACKET              // ]
	TOKEN_LEFT_PARENTHESIS           // (
	TOKEN_RIGHT_PARENTHESIS          // )
	TOKEN_COLON                      // ':'
	TOKEN_DOUBLE_COLON               // '::'
	TOKEN_COMMA                      // ','
	TOKEN_OPERATOR
	TOKEN_NODE_TYPE  // 'comment', 'text', 'processing-instruction', 'node'
	TOKEN_VAR_SYMBOL // '$'
)

type TokenType = int8
type Token struct {
	Type  TokenType
	Value string
	Row   int
	Col   int
}

func (tok Token) String() string {
	return fmt.Sprintf("[Token type=%d value=\"%s\" row=%d col=%d]", tok.Type, tok.Value, tok.Row, tok.Col)
}
