package xpath

import (
	"bufio"
	"errors"
	"fmt"
	"io"
	"unicode"

	"github.com/gpabois/gostd/option"
	"github.com/gpabois/gostd/result"
)

type scannerStateAddr = int16
type scannerOperation = int8
type scannerState = func(ch rune) scannerTransition
type scannerTransition struct {
	op      scannerOperation
	next    scannerStateAddr
	tokType TokenType
	invalid bool
}

const (
	scanFirstToken         = scannerStateAddr(iota) // first token
	scanToken                                       // main state
	scanWildcard                                    // scan *
	scanAbbvStep                                    // scan : or ::
	scanColonOrDoubleColon                          // scan . or ..
	scanWhiteSpace                                  // whitespaces
	scanLowerEqOrGreaterEq                          // scan >= or <=
	scanIdentifier                                  // scan identifier
	scanNumber
	scanNumberFraction
	scanLiteralWithDoubleQuote
	scanLiteralEscapeWithDoubleQuote
	scanLiteralWithSingleQuote
	scanLiteralEscapeWithSingleQuote
)

const scannerRewind = scannerOperation(1)
const scannerReduce = scannerOperation(2)
const scannerSkip = scannerOperation(3)

func continueIfSymbolOrGoToIdentifier(expected rune, next scannerStateAddr) scannerState {
	return func(ch rune) scannerTransition {
		transition := scannerTransition{}
		switch ch {
		case expected:
			transition.next = next
		default:
			transition.next = scanIdentifier
			transition.op = (1 << scannerSkip) | (1 << scannerRewind)
		}
		return transition
	}
}

func reduceIfSymbolOrGoToIdentifier(expected rune, tokType TokenType) scannerState {
	return func(ch rune) scannerTransition {
		transition := scannerTransition{}
		switch ch {
		case expected:
			transition.next = scanToken
			transition.tokType = tokType
			transition.op = (1 << scannerReduce)
		default:
			transition.next = scanIdentifier
			transition.op = (1 << scannerSkip) | (1 << scannerRewind)
		}
		return transition
	}
}

var scannerStates = []scannerState{
	// scanFirstToken
	// no preceding token, '*' is treated as a wildcard
	func(ch rune) scannerTransition {
		transition := scannerTransition{
			next: scanToken,
		}
		switch ch {
		case '*':
			transition.tokType = TOKEN_WILDCARD
			transition.op = (1 << scannerReduce)
		default:
			transition.op = (1 << scannerSkip) | (1 << scannerRewind)
		}

		return transition
	},
	// scanToken
	func(ch rune) scannerTransition {
		transition := scannerTransition{}

		if unicode.IsDigit(ch) {
			transition.next = scanNumber
		}

		if unicode.IsLetter(ch) {
			transition.next = scanIdentifier
		}

		switch ch {
		case 0:
			transition.tokType = TOK_EOF
			transition.op = (1 << scannerReduce)
		case '@':
			transition.tokType = TOKEN_ABBREVIATED_AXIS_SPECIFIER
			transition.next = scanWildcard
			transition.op = (1 << scannerReduce)
		case '(':
			transition.tokType = TOKEN_LEFT_PARENTHESIS
			transition.next = scanWildcard
			transition.op = (1 << scannerReduce)
		case '[':
			transition.tokType = TOKEN_LEFT_BRACKET
			transition.next = scanWildcard
			transition.op = (1 << scannerReduce)
		case '.':
			transition.next = scanAbbvStep
		case ':':
			transition.next = scanColonOrDoubleColon
		case ')':
			transition.tokType = TOKEN_RIGHT_PARENTHESIS
			transition.next = scanToken
			transition.op = (1 << scannerReduce)
		case ']':
			transition.tokType = TOKEN_RIGHT_BRACKET
			transition.next = scanToken
			transition.op = (1 << scannerReduce)
		case ',':
			transition.tokType = TOKEN_COMMA
			transition.next = scanToken
			transition.op = (1 << scannerReduce)
		case ' ', '\t', '\n':
			transition.next = scanWhiteSpace
		case '*', '/', '|', '+', '-', '=':
			transition.next = scanToken
			transition.tokType = TOKEN_OPERATOR
			transition.op = (1 << scannerReduce)
		case '<', '>':
			transition.next = scanLowerEqOrGreaterEq
		case '$':
			transition.next = scanToken
			transition.tokType = TOKEN_VAR_SYMBOL
			transition.op = (1 << scannerReduce)
		case '"':
			transition.next = scanLiteralEscapeWithDoubleQuote
			transition.op = (1 << scannerSkip)
		case '\'':
			transition.next = scanLiteralEscapeWithSingleQuote
			transition.op = (1 << scannerSkip)
		}

		return transition
	},
	// scanWildcard
	// preceding token is '@', '::', '(', or '['
	// * is thus a WILDCARD
	func(ch rune) scannerTransition {
		transition := scannerTransition{
			next: scanToken,
		}
		switch ch {
		case '*':
			transition.tokType = TOKEN_WILDCARD
			transition.op = (1 << scannerReduce)
		default:
			transition.op = (1 << scannerSkip) | (1 << scannerRewind)
		}

		return transition
	},
	// scanAbbvStep
	// check if it's '.' or '..'
	func(ch rune) scannerTransition {
		transition := scannerTransition{
			next:    scanToken,
			op:      (1 << scannerReduce),
			tokType: TOKEN_ABBREVIATED_STEP,
		}

		switch ch {
		case '.':
			// ...
		default:
			transition.op = transition.op | (1 << scannerSkip) | (1 << scannerRewind)
		}

		return transition
	},
	// scanColonOrDoubleColon
	// check if it's ':' or '::'
	func(ch rune) scannerTransition {
		transition := scannerTransition{
			next: scanToken,
			op:   (1 << scannerReduce),
		}
		switch ch {
		case ':':
			transition.tokType = TOKEN_DOUBLE_COLON
		default:
			transition.tokType = TOKEN_COLON
			transition.op = transition.op | (1 << scannerSkip) | (1 << scannerRewind)
		}

		return transition
	},
	// scanWhiteSpace
	func(ch rune) scannerTransition {
		transition := scannerTransition{}
		switch ch {
		case ' ', '\t', '\n':
			transition.next = scanWhiteSpace
		default:
			transition.op = (1 << scannerSkip) | (1 << scannerReduce) | (1 << scannerRewind)
			transition.tokType = TOK_WS
			transition.next = scanToken
		}
		return transition
	},
	// scanLowerEqOrGreaterEq
	func(ch rune) scannerTransition {
		transition := scannerTransition{
			op:      (1 << scannerReduce),
			tokType: TOKEN_OPERATOR,
		}
		switch ch {
		case '=':
			//..
		default:
			transition.op = transition.op | (1 << scannerSkip) | (1 << scannerRewind)
		}

		return transition
	},
	// scanIdentifier
	func(ch rune) scannerTransition {
		transition := scannerTransition{}
		if ch == '-' || unicode.IsLetter(ch) || unicode.IsDigit(ch) {
			transition.next = scanIdentifier
		} else {
			transition.op = (1 << scannerReduce) | (1 << scannerSkip) | (1 << scannerRewind)
			transition.tokType = TOK_ID
			transition.next = scanToken
		}

		return transition
	},
	// scanNumber
	func(ch rune) scannerTransition {
		transition := scannerTransition{}
		if unicode.IsDigit(ch) {
			transition.next = scanNumber
		} else if ch == '.' {
			transition.next = scanNumberFraction
		} else {
			transition.op = (1 << scannerReduce) | (1 << scannerSkip) | (1 << scannerRewind)
			transition.tokType = TOK_NUMBER
			transition.next = scanToken
		}

		return transition
	},
	// scanNumberFraction
	func(ch rune) scannerTransition {
		transition := scannerTransition{}
		if unicode.IsDigit(ch) {
			transition.next = scanNumberFraction
		} else {
			transition.op = (1 << scannerReduce) | (1 << scannerSkip) | (1 << scannerRewind)
			transition.tokType = TOK_NUMBER
			transition.next = scanToken
		}
		return transition
	},
	// scanLiteralWithDoubleQuote
	func(ch rune) scannerTransition {
		transition := scannerTransition{}
		switch ch {
		case '"':
			transition.op = (1 << scannerSkip) | (1 << scannerReduce)
			transition.next = scanToken
		case '\\':
			transition.op = (1 << scannerSkip)
			transition.next = scanLiteralEscapeWithDoubleQuote
		default:
			transition.next = scanLiteralWithDoubleQuote
		}

		return transition
	},
	// scanLiteralEscapeWithDoubleQuote
	func(ch rune) scannerTransition {
		return scannerTransition{
			next: scanLiteralWithDoubleQuote,
		}
	},
	// scanLiteralWithSingleQuote
	func(ch rune) scannerTransition {
		transition := scannerTransition{}
		switch ch {
		case '\'':
			transition.op = (1 << scannerSkip) | (1 << scannerReduce)
			transition.next = scanToken
		case '\\':
			transition.op = (1 << scannerSkip)
			transition.next = scanLiteralEscapeWithSingleQuote
		default:
			transition.next = scanLiteralWithSingleQuote
		}

		return transition
	},
	// scanLiteralEscapeWithSingleQuote
	func(ch rune) scannerTransition {
		return scannerTransition{
			next: scanLiteralWithSingleQuote,
		}
	},
}

type ScannerArgs struct {
	Debug bool
}

type Scanner struct {
	stream        bufio.Reader
	state         scannerStateAddr
	prevCol       int
	row           int
	col           int
	accumulator   string
	tokenRow      int
	tokenCol      int
	exhausted     bool
	debug         bool
	rewindCounter int
	logs          []string
}

func NewScanner(r io.Reader, args ScannerArgs) Scanner {
	return Scanner{
		stream: *bufio.NewReader(r),
		debug:  args.Debug,
	}
}

func (l *Scanner) GetDebugTrace() []string {
	return l.logs
}

func (l *Scanner) trace(f func() string) {
	if l.debug {
		l.logs = append(l.logs, f())
	}
}

func (l *Scanner) reduce(tokType TokenType) Token {
	token := Token{Type: tokType, Row: l.tokenRow, Col: l.tokenCol, Value: l.accumulator}
	l.accumulator = ""
	l.tokenRow = l.row
	l.tokenCol = l.col + 1
	return token
}

func (l *Scanner) rewindRune() result.Result[bool] {
	l.stream.UnreadRune()
	if l.col == 0 {
		l.col = l.prevCol
		l.row -= 1
	} else {
		l.col -= 1
	}
	return result.Success(true)
}

func (l *Scanner) nextRune() result.Result[rune] {
	r, _, err := l.stream.ReadRune()
	l.col += 1

	if err == io.EOF {
		return result.Success(rune(0))
	} else if err != nil {
		return result.Failed[rune](err)
	}

	if r == '\n' {
		l.row += 1
		l.prevCol = l.col
		l.col = 0
	}

	return result.Success(r)
}

func (l *Scanner) Next() option.Option[result.Result[Token]] {
	if l.exhausted {
		return option.None[result.Result[Token]]()
	}

	for {
		chRes := l.nextRune()

		if chRes.HasFailed() {
			l.exhausted = true
			return option.Some(result.Failed[Token](chRes.UnwrapError()))
		}

		ch := chRes.Expect()

		// Call the state
		l.trace(func() string { return fmt.Sprintf("xpath::scanner - state #%d, char=%s", l.state, string(ch)) })
		transition := scannerStates[l.state](ch)
		l.state = transition.next
		if transition.invalid {
			l.exhausted = true
			return option.Some(result.Failed[Token](errors.New(
				fmt.Sprintf("Invalid character %s at col: %d, row: %d", string(ch), l.row, l.col),
			)))
		}

		// Decode operation
		skip := ((transition.op >> scannerSkip) & 1) == 1
		rewind := ((transition.op >> scannerRewind) & 1) == 1
		reduce := ((transition.op >> scannerReduce) & 1) == 1

		// No skip order, we add the symbol to the accumulator
		if !skip {
			l.trace(func() string {
				return fmt.Sprintf("xpath::scanner - add \"%s\" into \"%s\"", string(ch), l.accumulator)
			})
			l.accumulator = l.accumulator + string(ch)
		} else {
			l.trace(func() string { return fmt.Sprintf("xpath::scanner - skip") })
		}

		// We don't received a shift order, we rewind the symbol
		if rewind {
			l.trace(func() string { return fmt.Sprintf("xpath::scanner - rewind") })
			l.rewindRune()
			l.rewindCounter += 1
		} else {
			l.trace(func() string { return fmt.Sprintf("xpath::scanner - shift") })
			l.rewindCounter = 0
		}

		// If the rewind counter is too high, we might have an infinite loop !
		if l.rewindCounter > 10 {
			l.trace(func() string { return fmt.Sprintf("xpath::scanner - infinite loop detected") })
			return option.Some(result.Failed[Token](errors.New("infinite loop")))
		}

		// We reduce
		if reduce {
			tok := l.reduce(transition.tokType)

			l.trace(func() string { return fmt.Sprintf("xpath::scanner - reduce into %s", tok) })

			// If the token is EOF, we raise exhausted flag
			if tok.Type == TOK_EOF {
				l.exhausted = true
			}

			// Some identifiers with keyword are repurposed
			if tok.Type == TOK_ID {
				switch tok.Value {
				case "ancestor", "ancestor-or-self", "attribute",
					"child", "descendant", "descendant-or-self", "following",
					"following-sibling", "namespace", "parent", "preceding",
					"self":
					tok.Type = TOKEN_AXIS_NAME
				case "and", "or", "mod", "div":
					tok.Type = TOKEN_OPERATOR
				case "comment", "text", "processing-instruction", "node":
					tok.Type = TOKEN_NODE_TYPE
				}
			}

			// Invalid token
			if tok.Type == TOK_INVALID {
				l.exhausted = true
				return option.Some(result.Failed[Token](errors.New(
					fmt.Sprintf("Invalid character %s at col: %d, row: %d", string(ch), l.row, l.col),
				)))
			}

			return option.Some(result.Success(tok))
		} else if ch == 0 {
			l.exhausted = true
			return option.Some(result.Failed[Token](errors.New(
				fmt.Sprintf("Unexpected EOF at col: %d, row: %d", l.row, l.col),
			)))
		}

		l.trace(func() string {
			return fmt.Sprintf("xpath::scanner - go to #%d", l.state)
		})
	}
}
