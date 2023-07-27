package tests

import (
	"strings"
	"testing"

	"github.com/gpabois/gostd/iter"
	"github.com/gpabois/gostd/result"
	"github.com/gpabois/goxml"
	"github.com/stretchr/testify/assert"
)

func Test_Scanner(t *testing.T) {
	stream := strings.NewReader(XML)

	scanner := goxml.NewScanner(stream)
	var tokIterator iter.Iterator[result.Result[goxml.Token]]
	tokIterator = &scanner

	tokenRes := iter.Result_FromIter[[]goxml.Token](tokIterator)

	assert.False(t, tokenRes.HasFailed(), tokenRes.UnwrapError())
	tokens := tokenRes.Expect()

	assert.Equal(t, XML_TOKENS, tokens)
}
