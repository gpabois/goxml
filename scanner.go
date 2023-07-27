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
	scannerShift  = 0 // 0b1
	scannerReduce = 1 // 0b10
	scannerSkip   = 2 // 0b100
)

type scannerTransition struct {
	op      byte
	tokType int8
	next    int8
	invalid bool
}

type scannerState = func(ch rune) scannerTransition

const (
	scanRoot = iota
	scanTagOpening
	scanCommentTag
	scanCommentTag01
	scanCommentText
	scanClosingCommentTag
	scanClosingCommentTag01
	scanClosingCommentTag02
	scanInTag
	scanInTagIdentifier
	scanStringWithDoubleQuote
	scanStringWithSingleQuote
	scanStringEscapeWithDoubleQuote
	scanStringEscapeWithSingleQuote
	scanText
	scanClosingProcInst
)

// Contains all possible states of the scanner
var scannerStates = []scannerState{
	// scanRoot
	func(ch rune) scannerTransition {
		// Boolean statements
		isOpeningTag := ch == '<'                             // Shift, skip, go to scanTagOpening
		isWhiteSpace := ch == ' ' || ch == '\n' || ch == '\t' // Shift, skip, go to scanRoot
		isEOF := ch == 0                                      // Shift, reduce to TOK_EOF, go to scanRoot
		isText := !isOpeningTag && !isWhiteSpace && !isEOF    // Rewind, go to scanText

		// Operations to execute
		op := (boolToByte(isOpeningTag || isWhiteSpace) << scannerShift) | // Shift
			(boolToByte(isWhiteSpace || isText) << scannerSkip) | // Skip
			(boolToByte(isEOF) << scannerReduce) // Reduce to token

		// Next transition
		next := boolToInt8(isOpeningTag)*scanTagOpening +
			boolToInt8(isWhiteSpace || isEOF)*scanRoot +
			boolToInt8(isText)*scanText

		tokType := int8(TOK_EOF)

		return scannerTransition{
			op:      op,
			tokType: tokType,
			next:    next,
		}
	},
	// scanTagOpening
	func(ch rune) scannerTransition {
		isProcInstTagOpening := ch == '?'                                                      // Shift, reduce to TOK_OPEN_PROCINST, go to scanInTag
		isCommentTagOpening := ch == '!'                                                       // Shift, go to scanCommentTag
		isOpenClosingElementTag := ch == '/'                                                   // Shift, reduce to TOK_OPEN_CLOSING_ELEMENT_TAG, go to scanInTag
		isOpenTag := !isProcInstTagOpening && !isCommentTagOpening && !isOpenClosingElementTag // Rewind, skip, reduceo to  TOK_OPEN_ELEMENT_TAG, go to scanInTag

		op := (boolToByte(isProcInstTagOpening || isCommentTagOpening || isOpenClosingElementTag) << scannerShift) +
			(boolToByte(isProcInstTagOpening || isOpenClosingElementTag || isOpenTag) << scannerReduce) +
			(boolToByte(isOpenTag) << scannerSkip)

		next := boolToInt8(isProcInstTagOpening || isOpenClosingElementTag || isOpenTag)*scanInTag +
			boolToInt8(isCommentTagOpening)*scanCommentTag

		tokType := boolToInt8(isProcInstTagOpening)*TOK_OPEN_PROCINST +
			boolToInt8(isOpenClosingElementTag)*TOK_OPEN_CLOSING_ELEMENT_TAG +
			boolToInt8(isOpenTag)*TOK_OPEN_ELEMENT_TAG

		return scannerTransition{
			op:      op,
			next:    next,
			tokType: tokType,
		}
	},
	// scanCommentTag
	func(ch rune) scannerTransition {
		isDash := ch == '-' // Shift, reduce to TOK_OPEN_COMMENT, go to scanCommentTag01
		isInvalid := !isDash

		bIsDash := boolToByte(isDash)

		op := (bIsDash << scannerShift) | (bIsDash << scannerReduce)
		tokType := TOK_OPEN_COMMENT
		invalid := isInvalid
		next := scanClosingCommentTag01

		return scannerTransition{
			op:      op,
			next:    int8(next),
			tokType: int8(tokType),
			invalid: invalid,
		}
	},
	// scanCommentTag01
	func(ch rune) scannerTransition {
		isDash := ch == '-' // Shift, reduce to TOK_OPEN_COMMENT, go to scanCommentText
		isInvalid := !isDash

		bIsDash := boolToByte(isDash)

		op := (bIsDash << scannerShift) + (bIsDash << scannerReduce)
		tokType := TOK_OPEN_COMMENT
		invalid := isInvalid
		next := scanCommentText

		return scannerTransition{
			op:      op,
			next:    int8(next),
			tokType: int8(tokType),
			invalid: invalid,
		}
	},
	// scanCommentText
	func(ch rune) scannerTransition {
		isDash := ch == '-' // Shift, skip, reduce to TOK_STRING, go to scanClosingCommentTag
		isSymbol := !isDash // Shift, go to scanCommentText

		bIsDash := boolToByte(isDash)

		op := (boolToByte(isDash || isSymbol) << scannerShift) + (bIsDash << scannerSkip) + (bIsDash << scannerReduce)
		next := boolToInt8(isDash)*scanClosingCommentTag + boolToInt8(isSymbol)*scanCommentText
		tokType := TOK_STRING

		return scannerTransition{
			op:      op,
			next:    int8(next),
			tokType: int8(tokType),
		}
	},
	// scanClosingCommentTag
	func(ch rune) scannerTransition {
		isDash := ch == '-'  // Shift, skip, go to scanClosingCommentTag01
		isInvalid := !isDash // Invalid transition

		bIsDash := boolToByte(isDash)

		op := (bIsDash << scannerShift) + (bIsDash << scannerSkip)
		next := boolToInt8(isDash) * scanClosingCommentTag01

		return scannerTransition{
			op:      op,
			next:    int8(next),
			invalid: isInvalid,
		}
	},
	// scanClosingCommentTag01
	func(ch rune) scannerTransition {
		isDash := ch == '-'  // Shift, skip, go to scanClosingCommentTag02
		isInvalid := !isDash // Invalid transition

		op := byte((1 << scannerShift) | (1 << scannerReduce))
		next := scanClosingCommentTag02

		return scannerTransition{
			op:      op,
			next:    int8(next),
			invalid: isInvalid,
		}
	},
	// scanClosingCommentTag02
	func(ch rune) scannerTransition {
		isClosingTag := ch == '>' // Shift, reduce to TOK_CLOSE_COMMENT, go to scanRoot
		invalid := !isClosingTag

		op := byte((1 << scannerShift) | (1 << scannerReduce))
		next := scanRoot
		tokType := TOK_CLOSE_COMMENT

		return scannerTransition{
			op:      op,
			next:    int8(next),
			tokType: int8(tokType),
			invalid: invalid,
		}
	},
	// scanInTag
	func(ch rune) scannerTransition {
		isLetter := unicode.IsLetter(ch)                      // Shift, go to scanInTagIdentifier
		isWhiteSpace := ch == ' ' || ch == '\t' || ch == '\n' // Shift, skip go to scanInTag
		isClosingProcInst := ch == '?'                        // Shift, go to scanClosingProcInst
		isClosingTag := ch == '>'                             // Shift, reduce to TOK_CLOSE_ELEMENT_TAG, go to scanRoot
		isEqual := ch == '='                                  // Shift, reduce to TOK_EQUAL, go to scanInTag
		isPrefixSep := ch == ':'                              // Shift, reduce to TOK_PREFIX_SEP, go to scanInTag
		isDoubleQuote := ch == '"'                            // Shift, skip, go to scanStringWithDoubleQuote
		isSingleQuote := ch == '\''                           // Shift, skip, go to scanStringWithSingleQuote

		invalid := !isLetter && !isWhiteSpace && !isClosingProcInst && !isClosingTag && !isEqual && !isPrefixSep && !isDoubleQuote && !isSingleQuote

		op := (1 << scannerShift) +
			(boolToByte(isWhiteSpace || isDoubleQuote || isSingleQuote) << scannerSkip) |
			(boolToByte(isClosingTag || isEqual || isPrefixSep) << scannerReduce)

		next := boolToInt8(isLetter)*scanInTagIdentifier +
			boolToInt8(isWhiteSpace || isEqual || isPrefixSep)*scanInTag +
			boolToInt8(isDoubleQuote)*scanStringWithDoubleQuote +
			boolToInt8(isSingleQuote)*scanStringWithSingleQuote +
			boolToInt8(isClosingProcInst)*scanClosingProcInst +
			boolToInt8(isClosingTag)*scanRoot

		tokType := boolToInt8(isClosingTag)*TOK_CLOSE_ELEMENT_TAG +
			boolToInt8(isEqual)*TOK_EQUAL +
			boolToInt8(isPrefixSep)*TOK_PREFIX_SEP

		return scannerTransition{
			op:      op,
			next:    next,
			tokType: tokType,
			invalid: invalid,
		}
	},
	// scanInTagIdentifier
	func(ch rune) scannerTransition {
		isIdentifierSymbol := unicode.IsLetter(ch) || unicode.IsDigit(ch) // Shift, go to scanInTagIdentifier
		hasReachedEndOfIdentifier := !isIdentifierSymbol                  // Rewind, skip, reduce to TOK_ID, go to scanInTag

		op := (boolToByte(isIdentifierSymbol) << scannerShift) +
			(boolToByte(hasReachedEndOfIdentifier) << scannerReduce) +
			(boolToByte(hasReachedEndOfIdentifier) << scannerSkip)

		next := boolToInt8(isIdentifierSymbol)*scanInTagIdentifier + boolToInt8(hasReachedEndOfIdentifier)*scanInTag
		tokType := TOK_ID

		return scannerTransition{
			op:      op,
			next:    next,
			tokType: int8(tokType),
		}
	},
	// scanStringWithDoubleQuote
	func(ch rune) scannerTransition {
		isEndOfString := ch == '"'                      // Shift, skip, reduce to TOK_STRING, go to scanInTag
		isEscaping := ch == '\\'                        // Shift, skip, go to scanStringEscapeWithDoubleQuote
		isStringSymbol := !isEndOfString && !isEscaping // Shift, go to scanStringWithDoubleQuote

		op := (1 << scannerShift) | (boolToByte(isEndOfString || isEscaping) << scannerSkip) | (boolToByte(isEndOfString) << scannerReduce)
		next := boolToInt8(isEndOfString)*scanInTag + boolToInt8(isEscaping)*scanStringEscapeWithDoubleQuote + boolToInt8(isStringSymbol)*scanStringWithDoubleQuote
		tokType := TOK_STRING

		return scannerTransition{
			op:      op,
			next:    next,
			tokType: int8(tokType),
		}
	},
	// scanStringWithSingleQuote
	func(ch rune) scannerTransition {
		isEndOfString := ch == '\''                     // Shift, skip, reduce to TOK_STRING, go to scanInTag
		isEscaping := ch == '\\'                        // Shift, skip, go to scanStringEscapeWithSingleQuote
		isStringSymbol := !isEndOfString && !isEscaping // Shift, go to scanStringWithSingleQuote

		op := (1 << scannerShift) | (boolToByte(isEndOfString || isEscaping) << scannerSkip) | (boolToByte(isEndOfString) << scannerReduce)
		next := boolToInt8(isEndOfString)*scanInTag + boolToInt8(isEscaping)*scanStringEscapeWithSingleQuote + boolToInt8(isStringSymbol)*scanStringWithSingleQuote
		tokType := TOK_STRING

		return scannerTransition{
			op:      op,
			next:    next,
			tokType: int8(tokType),
		}
	},
	// scanStringEscapeWithDoubleQuote
	func(ch rune) scannerTransition {
		return scannerTransition{
			op:   (1 << scannerShift),
			next: scanStringEscapeWithDoubleQuote,
		}
	},
	// scanStringEscapeWithSingleQuote
	func(ch rune) scannerTransition {
		return scannerTransition{
			op:   (1 << scannerShift),
			next: scanStringEscapeWithSingleQuote,
		}
	},
	// scanText
	func(ch rune) scannerTransition {
		isEndOfText := ch == '<'     // Rewind, skip, reduce to TOK_STRING, go to scanRoot
		isTextSymbol := !isEndOfText // Shift, go to scanText

		op := (boolToByte(isTextSymbol) << scannerShift) | (boolToByte(isEndOfText) << scannerSkip) | (boolToByte(isEndOfText) << scannerReduce)
		next := boolToInt8(isEndOfText)*scanRoot + boolToInt8(isTextSymbol)*scanText
		tokType := TOK_STRING

		return scannerTransition{
			op:      op,
			next:    next,
			tokType: int8(tokType),
		}
	},
	// scanClosingProcInst
	func(ch rune) scannerTransition {
		isClosingTag := ch == '>' // Shift, reduce to TOK_CLOSE_PROCINST, go to scanRoot

		invalid := !isClosingTag

		return scannerTransition{
			op:      (1 << scannerShift) | (1 << scannerReduce),
			next:    scanRoot,
			tokType: TOK_CLOSE_PROCINST,
			invalid: invalid,
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

		// Call the state
		transition := scannerStates[l.state](ch)

		if transition.invalid {
			l.exhausted = true
			return option.Some(result.Failed[Token](errors.New(
				fmt.Sprintf("Invalid character %s at col: %d, row: %d", string(ch), l.row, l.col),
			)))
		}

		l.state = transition.next

		// Decode operation
		skip := ((transition.op >> scannerSkip) & 1) == 1
		rewind := ((transition.op >> scannerShift) & 1) == 0
		reduce := ((transition.op >> scannerReduce) & 1) == 1

		// No skip order, we add the symbol to the accumulator
		if !skip {
			l.accumulator = l.accumulator + string(ch)
		}

		// We don't received a shift order, we rewind the symbol
		if rewind {
			l.rewindRune()
		}

		// We reduce
		if reduce {
			tok := l.reduce(transition.tokType)

			// If the token is EOF, we raise exhausted flag
			if tok.Type == TOK_EOF {
				l.exhausted = true
			}

			if tok.Type == TOK_INVALID {
				l.exhausted = true
				return option.Some(result.Failed[Token](errors.New(
					fmt.Sprintf("Invalid character %s at col: %d, row: %d", string(ch), l.row, l.col),
				)))
			}

			return option.Some(result.Success(tok))
		}
	}
}
