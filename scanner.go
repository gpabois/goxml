package goxml

import (
	"bufio"
	"errors"
	"fmt"
	"io"
	"unicode"

	"github.com/gpabois/gostd/option"
	"github.com/gpabois/gostd/result"
)

const (
	TOK_EOF = iota
	TOK_INVALID
	TOK_ID
	TOK_STRING
	TOK_PREFIX_SEP               // :
	TOK_EQUAL                    // =
	TOK_OPEN_ELEMENT_TAG         // <
	TOK_CLOSE_SINGLE_ELEMENT_TAG // />
	TOK_OPEN_CLOSING_ELEMENT_TAG // </
	TOK_CLOSE_ELEMENT_TAG        // >
	TOK_OPEN_COMMENT             // <!--
	TOK_CLOSE_COMMENT            // -->
	TOK_OPEN_PROCINST            // <?
	TOK_CLOSE_PROCINST           // ?>
)

type Token struct {
	Type  int8
	Value string
	Row   int
	Col   int
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

const (
	scannerShiftOp  = byte(0b1)   // Shift the stream
	scannerReduceOp = byte(0b10)  // Reduce to a token
	scannerSkipOp   = byte(0b100) // Does not add the char to the aggregator
)

type scannerTransition struct {
	op      byte
	tokType int8
	next    int8
}

func scannerShift(next int8) option.Option[scannerTransition] {
	return option.Some(scannerTransition{
		op:   scannerShiftOp,
		next: next,
	})
}

func scannerSkip(next int8) option.Option[scannerTransition] {
	return option.Some(scannerTransition{
		op:   scannerSkipOp | scannerShiftOp,
		next: next,
	})
}

func scannerReduce(tokType, next int8, shift bool, skip bool) option.Option[scannerTransition] {
	flag := scannerReduceOp
	if shift {
		flag = flag | scannerShiftOp
	}
	if skip {
		flag = flag | scannerSkipOp
	}

	return option.Some(scannerTransition{
		op:      flag,
		next:    next,
		tokType: tokType,
	})
}

func scannerNoTransition() option.Option[scannerTransition] {
	return option.None[scannerTransition]()
}

type scannerState = func(ch rune) option.Option[scannerTransition]

var scannerStates = []scannerState{
	// 0: Root
	func(ch rune) option.Option[scannerTransition] {
		switch ch {
		case '<': // Opening element
			return scannerShift(1)
		case ' ', '\n', '\t': // Whitespace
			return scannerSkip(0)
		case 0: // EOF
			return scannerReduce(TOK_EOF, 0, false, false)
		default: // Text
			return scannerShift(14)
		}
	},
	// 1: Opening-Root
	func(ch rune) option.Option[scannerTransition] {
		switch ch {
		case '?':
			return scannerReduce(TOK_OPEN_PROCINST, 8, true, false)
		case '!':
			return scannerShift(2)
		case '/':
			return scannerReduce(TOK_OPEN_CLOSING_ELEMENT_TAG, 8, true, false)
		default:
			return scannerReduce(TOK_OPEN_ELEMENT_TAG, 8, false, true)
		}
	},
	// 2: Opening-Comment-0
	func(ch rune) option.Option[scannerTransition] {
		switch ch {
		case '-':
			return scannerShift(3)
		default:
			return scannerNoTransition()
		}
	},
	// 3: Opening-Comment-Final
	func(ch rune) option.Option[scannerTransition] {
		switch ch {
		case '-':
			return scannerReduce(TOK_OPEN_COMMENT, 4, true, false)
		default:
			return scannerNoTransition()
		}
	},
	// 4: Comment text
	func(ch rune) option.Option[scannerTransition] {
		switch ch {
		case '-':
			return scannerReduce(TOK_STRING, 5, true, false)
		default:
			return scannerNoTransition()
		}
	},
	// 5: Closing-Comment-0
	func(ch rune) option.Option[scannerTransition] {
		switch ch {
		case '-':
			return scannerShift(6)
		default:
			return scannerNoTransition()
		}
	},
	// 6: Closing-Comment-1
	func(ch rune) option.Option[scannerTransition] {
		switch ch {
		case '-':
			return scannerShift(7)
		default:
			return scannerNoTransition()
		}
	},
	// 7: Closing-Comment-Final
	func(ch rune) option.Option[scannerTransition] {
		switch ch {
		case '>':
			return scannerReduce(TOK_CLOSE_COMMENT, 0, true, false)
		default:
			return scannerNoTransition()
		}
	},
	// 8: In-Tag-Root
	func(ch rune) option.Option[scannerTransition] {
		if unicode.IsLetter(ch) {
			return scannerShift(9)
		}
		switch ch {
		case ' ', '\t', '\n':
			return scannerSkip(8)
		case '?':
			return scannerShift(15)
		case '>':
			return scannerReduce(TOK_CLOSE_ELEMENT_TAG, 0, true, false)
		case '=': // Attribute definition
			return scannerReduce(TOK_EQUAL, 8, true, false)
		case ':': // Prefix separator
			return scannerReduce(TOK_PREFIX_SEP, 8, true, false)
		case '"': // String with " delimiter
			return scannerSkip(10)
		case '\'': // String with ' delimiter
			return scannerSkip(11)
		}

		return scannerNoTransition()
	},
	// 9: Identifier
	func(ch rune) option.Option[scannerTransition] {
		if unicode.IsLetter(ch) || unicode.IsDigit(ch) {
			return scannerShift(9)
		}
		return scannerReduce(TOK_ID, 8, false, true)
	},
	// 10: String, with " delimiter
	func(ch rune) option.Option[scannerTransition] {
		switch ch {
		case '"': // End of the string
			return scannerReduce(TOK_STRING, 8, true, true)
		case '\\':
			return scannerSkip(12)
		default:
			return scannerShift(10)
		}
	},
	// 11: String, with ' delimiter
	func(ch rune) option.Option[scannerTransition] {
		switch ch {
		case '\'': // End of the string
			return scannerReduce(TOK_STRING, 8, true, true)
		case '\\':
			return scannerSkip(13)
		default:
			return scannerShift(11)
		}
	},
	// 12: Escape string with " del
	func(ch rune) option.Option[scannerTransition] {
		return scannerShift(10)
	},
	// 13: Escape string with ' del
	func(ch rune) option.Option[scannerTransition] {
		return scannerShift(11)
	},
	// 14: Text
	func(ch rune) option.Option[scannerTransition] {
		switch ch {
		case '<':
			return scannerReduce(TOK_STRING, 0, false, true)
		default:
			return scannerShift(14)
		}
	},
	// 15: Closing PROCSINT
	func(ch rune) option.Option[scannerTransition] {
		switch ch {
		case '>':
			return scannerReduce(TOK_CLOSE_PROCINST, 0, true, false)
		default:
			return scannerNoTransition()
		}
	},
}

type Scanner struct {
	stream      bufio.Reader
	state       int8
	prevCol     int
	row         int
	col         int
	accumulator string
	tokenRow    int
	tokenCol    int
	exhausted   bool
}

func NewScanner(r io.Reader) Scanner {
	return Scanner{
		stream: *bufio.NewReader(r),
	}
}

// Reduce to a token
func (l *Scanner) reduce(tokType int8) Token {
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
		transitionOpt := scannerStates[l.state](ch)

		if transitionOpt.IsNone() {
			l.exhausted = true
			return option.Some(result.Failed[Token](errors.New(
				fmt.Sprintf("Invalid character %s at col: %d, row: %d", string(ch), l.row, l.col),
			)))
		}

		transition := transitionOpt.Expect()
		l.state = transition.next

		// Aggregate
		if transition.op&scannerSkipOp == 0 {
			l.accumulator = fmt.Sprintf("%s%s", l.accumulator, string(ch))
		}

		// We don't shift, so we rewind
		if transition.op&scannerShiftOp == 0 {
			l.rewindRune()
		}

		// We reduce
		if transition.op&scannerReduceOp > 0 {
			tok := l.reduce(transition.tokType)
			if tok.Type == TOK_EOF {
				l.exhausted = true
			}
			return option.Some(result.Success(tok))
		}
	}
}
