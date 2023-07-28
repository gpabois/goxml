package xpath

type parserOperation = int16
type parserStateAddr = int8

type parserTransition struct {
	op      parserOperation
	next    parserStateAddr
	r0      int
	invalid bool
}

type parserState = func(tok Token) parserTransition

const (
	parseLocationPath = iota
	parseAbsoluteLocationPath
)

const parseRewind = parserOperation(0)

var parserStates = []parserState{
	// parseLocationPaths
	func (tok Token) parserTransition {
		transition = parserTransition
		switch tok.Type {
		case TOKEN_AXIS_NAME, TOKEN_ABBREVIATED_AXIS_SPECIFIER, TOKEN_ABBREVIATED_STEP:
			transition.Next = 
		default:

		}
	}
}
