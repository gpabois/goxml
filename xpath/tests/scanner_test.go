package tests

import (
	"fmt"
	"strings"
	"testing"

	"github.com/gpabois/gostd/iter"
	"github.com/gpabois/gostd/result"
	"github.com/gpabois/goxml/xpath"
	"github.com/stretchr/testify/assert"
)

func Test_Scanner(t *testing.T) {
	stream := strings.NewReader(XPATH)

	scanner := xpath.NewScanner(stream, xpath.ScannerArgs{Debug: true})
	defer func() {
		fmt.Println("=== SCANNER'S DEBUG TRACE ===")
		fmt.Println(strings.Join(scanner.GetDebugTrace(), "\n"))
		fmt.Println("=== END OF SCANNER'S DEBUG TRACE ===")
	}()

	var tokIterator iter.Iterator[result.Result[xpath.Token]]
	tokIterator = &scanner

	tokenRes := iter.Result_FromIter[[]xpath.Token](tokIterator)

	assert.False(t, tokenRes.HasFailed(), tokenRes.UnwrapError())
	tokens := tokenRes.Expect()

	assert.Equal(t, XPATH_TOKENS, tokens)
}
