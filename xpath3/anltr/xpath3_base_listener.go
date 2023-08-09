// Code generated from XPath3.g by ANTLR 4.13.0. DO NOT EDIT.

package parser // XPath3

import "github.com/antlr4-go/antlr/v4"

// BaseXPath3Listener is a complete listener for a parse tree produced by XPath3Parser.
type BaseXPath3Listener struct{}

var _ XPath3Listener = &BaseXPath3Listener{}

// VisitTerminal is called when a terminal node is visited.
func (s *BaseXPath3Listener) VisitTerminal(node antlr.TerminalNode) {}

// VisitErrorNode is called when an error node is visited.
func (s *BaseXPath3Listener) VisitErrorNode(node antlr.ErrorNode) {}

// EnterEveryRule is called when any rule is entered.
func (s *BaseXPath3Listener) EnterEveryRule(ctx antlr.ParserRuleContext) {}

// ExitEveryRule is called when any rule is exited.
func (s *BaseXPath3Listener) ExitEveryRule(ctx antlr.ParserRuleContext) {}

// EnterXPath is called when production xPath is entered.
func (s *BaseXPath3Listener) EnterXPath(ctx *XPathContext) {}

// ExitXPath is called when production xPath is exited.
func (s *BaseXPath3Listener) ExitXPath(ctx *XPathContext) {}

// EnterParamList is called when production paramList is entered.
func (s *BaseXPath3Listener) EnterParamList(ctx *ParamListContext) {}

// ExitParamList is called when production paramList is exited.
func (s *BaseXPath3Listener) ExitParamList(ctx *ParamListContext) {}

// EnterParam is called when production param is entered.
func (s *BaseXPath3Listener) EnterParam(ctx *ParamContext) {}

// ExitParam is called when production param is exited.
func (s *BaseXPath3Listener) ExitParam(ctx *ParamContext) {}

// EnterFunctionBody is called when production functionBody is entered.
func (s *BaseXPath3Listener) EnterFunctionBody(ctx *FunctionBodyContext) {}

// ExitFunctionBody is called when production functionBody is exited.
func (s *BaseXPath3Listener) ExitFunctionBody(ctx *FunctionBodyContext) {}

// EnterEnclosedExpr is called when production enclosedExpr is entered.
func (s *BaseXPath3Listener) EnterEnclosedExpr(ctx *EnclosedExprContext) {}

// ExitEnclosedExpr is called when production enclosedExpr is exited.
func (s *BaseXPath3Listener) ExitEnclosedExpr(ctx *EnclosedExprContext) {}

// EnterExpr is called when production expr is entered.
func (s *BaseXPath3Listener) EnterExpr(ctx *ExprContext) {}

// ExitExpr is called when production expr is exited.
func (s *BaseXPath3Listener) ExitExpr(ctx *ExprContext) {}

// EnterExprSingle is called when production exprSingle is entered.
func (s *BaseXPath3Listener) EnterExprSingle(ctx *ExprSingleContext) {}

// ExitExprSingle is called when production exprSingle is exited.
func (s *BaseXPath3Listener) ExitExprSingle(ctx *ExprSingleContext) {}

// EnterForExpr is called when production forExpr is entered.
func (s *BaseXPath3Listener) EnterForExpr(ctx *ForExprContext) {}

// ExitForExpr is called when production forExpr is exited.
func (s *BaseXPath3Listener) ExitForExpr(ctx *ForExprContext) {}

// EnterSimpleForClause is called when production simpleForClause is entered.
func (s *BaseXPath3Listener) EnterSimpleForClause(ctx *SimpleForClauseContext) {}

// ExitSimpleForClause is called when production simpleForClause is exited.
func (s *BaseXPath3Listener) ExitSimpleForClause(ctx *SimpleForClauseContext) {}

// EnterForBindingList is called when production forBindingList is entered.
func (s *BaseXPath3Listener) EnterForBindingList(ctx *ForBindingListContext) {}

// ExitForBindingList is called when production forBindingList is exited.
func (s *BaseXPath3Listener) ExitForBindingList(ctx *ForBindingListContext) {}

// EnterSimpleForBinding is called when production simpleForBinding is entered.
func (s *BaseXPath3Listener) EnterSimpleForBinding(ctx *SimpleForBindingContext) {}

// ExitSimpleForBinding is called when production simpleForBinding is exited.
func (s *BaseXPath3Listener) ExitSimpleForBinding(ctx *SimpleForBindingContext) {}

// EnterLetExpr is called when production letExpr is entered.
func (s *BaseXPath3Listener) EnterLetExpr(ctx *LetExprContext) {}

// ExitLetExpr is called when production letExpr is exited.
func (s *BaseXPath3Listener) ExitLetExpr(ctx *LetExprContext) {}

// EnterSimpleLetClause is called when production simpleLetClause is entered.
func (s *BaseXPath3Listener) EnterSimpleLetClause(ctx *SimpleLetClauseContext) {}

// ExitSimpleLetClause is called when production simpleLetClause is exited.
func (s *BaseXPath3Listener) ExitSimpleLetClause(ctx *SimpleLetClauseContext) {}

// EnterLetBindingList is called when production letBindingList is entered.
func (s *BaseXPath3Listener) EnterLetBindingList(ctx *LetBindingListContext) {}

// ExitLetBindingList is called when production letBindingList is exited.
func (s *BaseXPath3Listener) ExitLetBindingList(ctx *LetBindingListContext) {}

// EnterSimpleLetBinding is called when production simpleLetBinding is entered.
func (s *BaseXPath3Listener) EnterSimpleLetBinding(ctx *SimpleLetBindingContext) {}

// ExitSimpleLetBinding is called when production simpleLetBinding is exited.
func (s *BaseXPath3Listener) ExitSimpleLetBinding(ctx *SimpleLetBindingContext) {}

// EnterQuantifiedExpr is called when production quantifiedExpr is entered.
func (s *BaseXPath3Listener) EnterQuantifiedExpr(ctx *QuantifiedExprContext) {}

// ExitQuantifiedExpr is called when production quantifiedExpr is exited.
func (s *BaseXPath3Listener) ExitQuantifiedExpr(ctx *QuantifiedExprContext) {}

// EnterQuantifiedBindingList is called when production quantifiedBindingList is entered.
func (s *BaseXPath3Listener) EnterQuantifiedBindingList(ctx *QuantifiedBindingListContext) {}

// ExitQuantifiedBindingList is called when production quantifiedBindingList is exited.
func (s *BaseXPath3Listener) ExitQuantifiedBindingList(ctx *QuantifiedBindingListContext) {}

// EnterSimpleQuantifiedBinding is called when production simpleQuantifiedBinding is entered.
func (s *BaseXPath3Listener) EnterSimpleQuantifiedBinding(ctx *SimpleQuantifiedBindingContext) {}

// ExitSimpleQuantifiedBinding is called when production simpleQuantifiedBinding is exited.
func (s *BaseXPath3Listener) ExitSimpleQuantifiedBinding(ctx *SimpleQuantifiedBindingContext) {}

// EnterIfExpr is called when production ifExpr is entered.
func (s *BaseXPath3Listener) EnterIfExpr(ctx *IfExprContext) {}

// ExitIfExpr is called when production ifExpr is exited.
func (s *BaseXPath3Listener) ExitIfExpr(ctx *IfExprContext) {}

// EnterOrExpr is called when production orExpr is entered.
func (s *BaseXPath3Listener) EnterOrExpr(ctx *OrExprContext) {}

// ExitOrExpr is called when production orExpr is exited.
func (s *BaseXPath3Listener) ExitOrExpr(ctx *OrExprContext) {}

// EnterAndExpr is called when production andExpr is entered.
func (s *BaseXPath3Listener) EnterAndExpr(ctx *AndExprContext) {}

// ExitAndExpr is called when production andExpr is exited.
func (s *BaseXPath3Listener) ExitAndExpr(ctx *AndExprContext) {}

// EnterComparisonExpr is called when production comparisonExpr is entered.
func (s *BaseXPath3Listener) EnterComparisonExpr(ctx *ComparisonExprContext) {}

// ExitComparisonExpr is called when production comparisonExpr is exited.
func (s *BaseXPath3Listener) ExitComparisonExpr(ctx *ComparisonExprContext) {}

// EnterStringConcatExpr is called when production stringConcatExpr is entered.
func (s *BaseXPath3Listener) EnterStringConcatExpr(ctx *StringConcatExprContext) {}

// ExitStringConcatExpr is called when production stringConcatExpr is exited.
func (s *BaseXPath3Listener) ExitStringConcatExpr(ctx *StringConcatExprContext) {}

// EnterRangeExpr is called when production rangeExpr is entered.
func (s *BaseXPath3Listener) EnterRangeExpr(ctx *RangeExprContext) {}

// ExitRangeExpr is called when production rangeExpr is exited.
func (s *BaseXPath3Listener) ExitRangeExpr(ctx *RangeExprContext) {}

// EnterAdditiveExpr is called when production additiveExpr is entered.
func (s *BaseXPath3Listener) EnterAdditiveExpr(ctx *AdditiveExprContext) {}

// ExitAdditiveExpr is called when production additiveExpr is exited.
func (s *BaseXPath3Listener) ExitAdditiveExpr(ctx *AdditiveExprContext) {}

// EnterMultiplicativeExpr is called when production multiplicativeExpr is entered.
func (s *BaseXPath3Listener) EnterMultiplicativeExpr(ctx *MultiplicativeExprContext) {}

// ExitMultiplicativeExpr is called when production multiplicativeExpr is exited.
func (s *BaseXPath3Listener) ExitMultiplicativeExpr(ctx *MultiplicativeExprContext) {}

// EnterUnionExpr is called when production unionExpr is entered.
func (s *BaseXPath3Listener) EnterUnionExpr(ctx *UnionExprContext) {}

// ExitUnionExpr is called when production unionExpr is exited.
func (s *BaseXPath3Listener) ExitUnionExpr(ctx *UnionExprContext) {}

// EnterIntersectExceptExpr is called when production intersectExceptExpr is entered.
func (s *BaseXPath3Listener) EnterIntersectExceptExpr(ctx *IntersectExceptExprContext) {}

// ExitIntersectExceptExpr is called when production intersectExceptExpr is exited.
func (s *BaseXPath3Listener) ExitIntersectExceptExpr(ctx *IntersectExceptExprContext) {}

// EnterInstanceofExpr is called when production instanceofExpr is entered.
func (s *BaseXPath3Listener) EnterInstanceofExpr(ctx *InstanceofExprContext) {}

// ExitInstanceofExpr is called when production instanceofExpr is exited.
func (s *BaseXPath3Listener) ExitInstanceofExpr(ctx *InstanceofExprContext) {}

// EnterTreatExpr is called when production treatExpr is entered.
func (s *BaseXPath3Listener) EnterTreatExpr(ctx *TreatExprContext) {}

// ExitTreatExpr is called when production treatExpr is exited.
func (s *BaseXPath3Listener) ExitTreatExpr(ctx *TreatExprContext) {}

// EnterCastableExpr is called when production castableExpr is entered.
func (s *BaseXPath3Listener) EnterCastableExpr(ctx *CastableExprContext) {}

// ExitCastableExpr is called when production castableExpr is exited.
func (s *BaseXPath3Listener) ExitCastableExpr(ctx *CastableExprContext) {}

// EnterCastExpr is called when production castExpr is entered.
func (s *BaseXPath3Listener) EnterCastExpr(ctx *CastExprContext) {}

// ExitCastExpr is called when production castExpr is exited.
func (s *BaseXPath3Listener) ExitCastExpr(ctx *CastExprContext) {}

// EnterUnaryExpr is called when production unaryExpr is entered.
func (s *BaseXPath3Listener) EnterUnaryExpr(ctx *UnaryExprContext) {}

// ExitUnaryExpr is called when production unaryExpr is exited.
func (s *BaseXPath3Listener) ExitUnaryExpr(ctx *UnaryExprContext) {}

// EnterValueExpr is called when production valueExpr is entered.
func (s *BaseXPath3Listener) EnterValueExpr(ctx *ValueExprContext) {}

// ExitValueExpr is called when production valueExpr is exited.
func (s *BaseXPath3Listener) ExitValueExpr(ctx *ValueExprContext) {}

// EnterGeneralComp is called when production generalComp is entered.
func (s *BaseXPath3Listener) EnterGeneralComp(ctx *GeneralCompContext) {}

// ExitGeneralComp is called when production generalComp is exited.
func (s *BaseXPath3Listener) ExitGeneralComp(ctx *GeneralCompContext) {}

// EnterValueComp is called when production valueComp is entered.
func (s *BaseXPath3Listener) EnterValueComp(ctx *ValueCompContext) {}

// ExitValueComp is called when production valueComp is exited.
func (s *BaseXPath3Listener) ExitValueComp(ctx *ValueCompContext) {}

// EnterNodeComp is called when production nodeComp is entered.
func (s *BaseXPath3Listener) EnterNodeComp(ctx *NodeCompContext) {}

// ExitNodeComp is called when production nodeComp is exited.
func (s *BaseXPath3Listener) ExitNodeComp(ctx *NodeCompContext) {}

// EnterSimpleMapExpr is called when production simpleMapExpr is entered.
func (s *BaseXPath3Listener) EnterSimpleMapExpr(ctx *SimpleMapExprContext) {}

// ExitSimpleMapExpr is called when production simpleMapExpr is exited.
func (s *BaseXPath3Listener) ExitSimpleMapExpr(ctx *SimpleMapExprContext) {}

// EnterPathExpr is called when production pathExpr is entered.
func (s *BaseXPath3Listener) EnterPathExpr(ctx *PathExprContext) {}

// ExitPathExpr is called when production pathExpr is exited.
func (s *BaseXPath3Listener) ExitPathExpr(ctx *PathExprContext) {}

// EnterRelativePathExpr is called when production relativePathExpr is entered.
func (s *BaseXPath3Listener) EnterRelativePathExpr(ctx *RelativePathExprContext) {}

// ExitRelativePathExpr is called when production relativePathExpr is exited.
func (s *BaseXPath3Listener) ExitRelativePathExpr(ctx *RelativePathExprContext) {}

// EnterStepExpr is called when production stepExpr is entered.
func (s *BaseXPath3Listener) EnterStepExpr(ctx *StepExprContext) {}

// ExitStepExpr is called when production stepExpr is exited.
func (s *BaseXPath3Listener) ExitStepExpr(ctx *StepExprContext) {}

// EnterAxisStep is called when production axisStep is entered.
func (s *BaseXPath3Listener) EnterAxisStep(ctx *AxisStepContext) {}

// ExitAxisStep is called when production axisStep is exited.
func (s *BaseXPath3Listener) ExitAxisStep(ctx *AxisStepContext) {}

// EnterForwardStep is called when production forwardStep is entered.
func (s *BaseXPath3Listener) EnterForwardStep(ctx *ForwardStepContext) {}

// ExitForwardStep is called when production forwardStep is exited.
func (s *BaseXPath3Listener) ExitForwardStep(ctx *ForwardStepContext) {}

// EnterForwardAxis is called when production forwardAxis is entered.
func (s *BaseXPath3Listener) EnterForwardAxis(ctx *ForwardAxisContext) {}

// ExitForwardAxis is called when production forwardAxis is exited.
func (s *BaseXPath3Listener) ExitForwardAxis(ctx *ForwardAxisContext) {}

// EnterAbbrevForwardStep is called when production abbrevForwardStep is entered.
func (s *BaseXPath3Listener) EnterAbbrevForwardStep(ctx *AbbrevForwardStepContext) {}

// ExitAbbrevForwardStep is called when production abbrevForwardStep is exited.
func (s *BaseXPath3Listener) ExitAbbrevForwardStep(ctx *AbbrevForwardStepContext) {}

// EnterReverseStep is called when production reverseStep is entered.
func (s *BaseXPath3Listener) EnterReverseStep(ctx *ReverseStepContext) {}

// ExitReverseStep is called when production reverseStep is exited.
func (s *BaseXPath3Listener) ExitReverseStep(ctx *ReverseStepContext) {}

// EnterReverseAxis is called when production reverseAxis is entered.
func (s *BaseXPath3Listener) EnterReverseAxis(ctx *ReverseAxisContext) {}

// ExitReverseAxis is called when production reverseAxis is exited.
func (s *BaseXPath3Listener) ExitReverseAxis(ctx *ReverseAxisContext) {}

// EnterAbbrevReverseStep is called when production abbrevReverseStep is entered.
func (s *BaseXPath3Listener) EnterAbbrevReverseStep(ctx *AbbrevReverseStepContext) {}

// ExitAbbrevReverseStep is called when production abbrevReverseStep is exited.
func (s *BaseXPath3Listener) ExitAbbrevReverseStep(ctx *AbbrevReverseStepContext) {}

// EnterNodeTest is called when production nodeTest is entered.
func (s *BaseXPath3Listener) EnterNodeTest(ctx *NodeTestContext) {}

// ExitNodeTest is called when production nodeTest is exited.
func (s *BaseXPath3Listener) ExitNodeTest(ctx *NodeTestContext) {}

// EnterNameTest is called when production nameTest is entered.
func (s *BaseXPath3Listener) EnterNameTest(ctx *NameTestContext) {}

// ExitNameTest is called when production nameTest is exited.
func (s *BaseXPath3Listener) ExitNameTest(ctx *NameTestContext) {}

// EnterWildCard is called when production wildCard is entered.
func (s *BaseXPath3Listener) EnterWildCard(ctx *WildCardContext) {}

// ExitWildCard is called when production wildCard is exited.
func (s *BaseXPath3Listener) ExitWildCard(ctx *WildCardContext) {}

// EnterPostfixExpr is called when production postfixExpr is entered.
func (s *BaseXPath3Listener) EnterPostfixExpr(ctx *PostfixExprContext) {}

// ExitPostfixExpr is called when production postfixExpr is exited.
func (s *BaseXPath3Listener) ExitPostfixExpr(ctx *PostfixExprContext) {}

// EnterArgumentList is called when production argumentList is entered.
func (s *BaseXPath3Listener) EnterArgumentList(ctx *ArgumentListContext) {}

// ExitArgumentList is called when production argumentList is exited.
func (s *BaseXPath3Listener) ExitArgumentList(ctx *ArgumentListContext) {}

// EnterArguments is called when production arguments is entered.
func (s *BaseXPath3Listener) EnterArguments(ctx *ArgumentsContext) {}

// ExitArguments is called when production arguments is exited.
func (s *BaseXPath3Listener) ExitArguments(ctx *ArgumentsContext) {}

// EnterPredicateList is called when production predicateList is entered.
func (s *BaseXPath3Listener) EnterPredicateList(ctx *PredicateListContext) {}

// ExitPredicateList is called when production predicateList is exited.
func (s *BaseXPath3Listener) ExitPredicateList(ctx *PredicateListContext) {}

// EnterPredicate is called when production predicate is entered.
func (s *BaseXPath3Listener) EnterPredicate(ctx *PredicateContext) {}

// ExitPredicate is called when production predicate is exited.
func (s *BaseXPath3Listener) ExitPredicate(ctx *PredicateContext) {}

// EnterPrimaryExpr is called when production primaryExpr is entered.
func (s *BaseXPath3Listener) EnterPrimaryExpr(ctx *PrimaryExprContext) {}

// ExitPrimaryExpr is called when production primaryExpr is exited.
func (s *BaseXPath3Listener) ExitPrimaryExpr(ctx *PrimaryExprContext) {}

// EnterVarRef is called when production varRef is entered.
func (s *BaseXPath3Listener) EnterVarRef(ctx *VarRefContext) {}

// ExitVarRef is called when production varRef is exited.
func (s *BaseXPath3Listener) ExitVarRef(ctx *VarRefContext) {}

// EnterVarName is called when production varName is entered.
func (s *BaseXPath3Listener) EnterVarName(ctx *VarNameContext) {}

// ExitVarName is called when production varName is exited.
func (s *BaseXPath3Listener) ExitVarName(ctx *VarNameContext) {}

// EnterLiteral is called when production literal is entered.
func (s *BaseXPath3Listener) EnterLiteral(ctx *LiteralContext) {}

// ExitLiteral is called when production literal is exited.
func (s *BaseXPath3Listener) ExitLiteral(ctx *LiteralContext) {}

// EnterParenthesizedExpr is called when production parenthesizedExpr is entered.
func (s *BaseXPath3Listener) EnterParenthesizedExpr(ctx *ParenthesizedExprContext) {}

// ExitParenthesizedExpr is called when production parenthesizedExpr is exited.
func (s *BaseXPath3Listener) ExitParenthesizedExpr(ctx *ParenthesizedExprContext) {}

// EnterContextItemExpr is called when production contextItemExpr is entered.
func (s *BaseXPath3Listener) EnterContextItemExpr(ctx *ContextItemExprContext) {}

// ExitContextItemExpr is called when production contextItemExpr is exited.
func (s *BaseXPath3Listener) ExitContextItemExpr(ctx *ContextItemExprContext) {}

// EnterFunctionCall is called when production functionCall is entered.
func (s *BaseXPath3Listener) EnterFunctionCall(ctx *FunctionCallContext) {}

// ExitFunctionCall is called when production functionCall is exited.
func (s *BaseXPath3Listener) ExitFunctionCall(ctx *FunctionCallContext) {}

// EnterArgument is called when production argument is entered.
func (s *BaseXPath3Listener) EnterArgument(ctx *ArgumentContext) {}

// ExitArgument is called when production argument is exited.
func (s *BaseXPath3Listener) ExitArgument(ctx *ArgumentContext) {}

// EnterArgumentPlaceholder is called when production argumentPlaceholder is entered.
func (s *BaseXPath3Listener) EnterArgumentPlaceholder(ctx *ArgumentPlaceholderContext) {}

// ExitArgumentPlaceholder is called when production argumentPlaceholder is exited.
func (s *BaseXPath3Listener) ExitArgumentPlaceholder(ctx *ArgumentPlaceholderContext) {}

// EnterFunctionItemExpr is called when production functionItemExpr is entered.
func (s *BaseXPath3Listener) EnterFunctionItemExpr(ctx *FunctionItemExprContext) {}

// ExitFunctionItemExpr is called when production functionItemExpr is exited.
func (s *BaseXPath3Listener) ExitFunctionItemExpr(ctx *FunctionItemExprContext) {}

// EnterNamedFunctionRef is called when production namedFunctionRef is entered.
func (s *BaseXPath3Listener) EnterNamedFunctionRef(ctx *NamedFunctionRefContext) {}

// ExitNamedFunctionRef is called when production namedFunctionRef is exited.
func (s *BaseXPath3Listener) ExitNamedFunctionRef(ctx *NamedFunctionRefContext) {}

// EnterInlineFunctionExpr is called when production inlineFunctionExpr is entered.
func (s *BaseXPath3Listener) EnterInlineFunctionExpr(ctx *InlineFunctionExprContext) {}

// ExitInlineFunctionExpr is called when production inlineFunctionExpr is exited.
func (s *BaseXPath3Listener) ExitInlineFunctionExpr(ctx *InlineFunctionExprContext) {}

// EnterSingleType is called when production singleType is entered.
func (s *BaseXPath3Listener) EnterSingleType(ctx *SingleTypeContext) {}

// ExitSingleType is called when production singleType is exited.
func (s *BaseXPath3Listener) ExitSingleType(ctx *SingleTypeContext) {}

// EnterType_declaration is called when production type_declaration is entered.
func (s *BaseXPath3Listener) EnterType_declaration(ctx *Type_declarationContext) {}

// ExitType_declaration is called when production type_declaration is exited.
func (s *BaseXPath3Listener) ExitType_declaration(ctx *Type_declarationContext) {}

// EnterSequenceType is called when production sequenceType is entered.
func (s *BaseXPath3Listener) EnterSequenceType(ctx *SequenceTypeContext) {}

// ExitSequenceType is called when production sequenceType is exited.
func (s *BaseXPath3Listener) ExitSequenceType(ctx *SequenceTypeContext) {}

// EnterOccurenceIndicator is called when production occurenceIndicator is entered.
func (s *BaseXPath3Listener) EnterOccurenceIndicator(ctx *OccurenceIndicatorContext) {}

// ExitOccurenceIndicator is called when production occurenceIndicator is exited.
func (s *BaseXPath3Listener) ExitOccurenceIndicator(ctx *OccurenceIndicatorContext) {}

// EnterItemType is called when production itemType is entered.
func (s *BaseXPath3Listener) EnterItemType(ctx *ItemTypeContext) {}

// ExitItemType is called when production itemType is exited.
func (s *BaseXPath3Listener) ExitItemType(ctx *ItemTypeContext) {}

// EnterAtomicOrUnionType is called when production atomicOrUnionType is entered.
func (s *BaseXPath3Listener) EnterAtomicOrUnionType(ctx *AtomicOrUnionTypeContext) {}

// ExitAtomicOrUnionType is called when production atomicOrUnionType is exited.
func (s *BaseXPath3Listener) ExitAtomicOrUnionType(ctx *AtomicOrUnionTypeContext) {}

// EnterKindTest is called when production kindTest is entered.
func (s *BaseXPath3Listener) EnterKindTest(ctx *KindTestContext) {}

// ExitKindTest is called when production kindTest is exited.
func (s *BaseXPath3Listener) ExitKindTest(ctx *KindTestContext) {}

// EnterAnyKindTest is called when production anyKindTest is entered.
func (s *BaseXPath3Listener) EnterAnyKindTest(ctx *AnyKindTestContext) {}

// ExitAnyKindTest is called when production anyKindTest is exited.
func (s *BaseXPath3Listener) ExitAnyKindTest(ctx *AnyKindTestContext) {}

// EnterDocumentTest is called when production documentTest is entered.
func (s *BaseXPath3Listener) EnterDocumentTest(ctx *DocumentTestContext) {}

// ExitDocumentTest is called when production documentTest is exited.
func (s *BaseXPath3Listener) ExitDocumentTest(ctx *DocumentTestContext) {}

// EnterTextTest is called when production textTest is entered.
func (s *BaseXPath3Listener) EnterTextTest(ctx *TextTestContext) {}

// ExitTextTest is called when production textTest is exited.
func (s *BaseXPath3Listener) ExitTextTest(ctx *TextTestContext) {}

// EnterCommentTest is called when production commentTest is entered.
func (s *BaseXPath3Listener) EnterCommentTest(ctx *CommentTestContext) {}

// ExitCommentTest is called when production commentTest is exited.
func (s *BaseXPath3Listener) ExitCommentTest(ctx *CommentTestContext) {}

// EnterNamespaceNodeTest is called when production namespaceNodeTest is entered.
func (s *BaseXPath3Listener) EnterNamespaceNodeTest(ctx *NamespaceNodeTestContext) {}

// ExitNamespaceNodeTest is called when production namespaceNodeTest is exited.
func (s *BaseXPath3Listener) ExitNamespaceNodeTest(ctx *NamespaceNodeTestContext) {}

// EnterPiTest is called when production piTest is entered.
func (s *BaseXPath3Listener) EnterPiTest(ctx *PiTestContext) {}

// ExitPiTest is called when production piTest is exited.
func (s *BaseXPath3Listener) ExitPiTest(ctx *PiTestContext) {}

// EnterAttributeTest is called when production attributeTest is entered.
func (s *BaseXPath3Listener) EnterAttributeTest(ctx *AttributeTestContext) {}

// ExitAttributeTest is called when production attributeTest is exited.
func (s *BaseXPath3Listener) ExitAttributeTest(ctx *AttributeTestContext) {}

// EnterAttribNameOrWildcard is called when production attribNameOrWildcard is entered.
func (s *BaseXPath3Listener) EnterAttribNameOrWildcard(ctx *AttribNameOrWildcardContext) {}

// ExitAttribNameOrWildcard is called when production attribNameOrWildcard is exited.
func (s *BaseXPath3Listener) ExitAttribNameOrWildcard(ctx *AttribNameOrWildcardContext) {}

// EnterSchemaAttributeTest is called when production schemaAttributeTest is entered.
func (s *BaseXPath3Listener) EnterSchemaAttributeTest(ctx *SchemaAttributeTestContext) {}

// ExitSchemaAttributeTest is called when production schemaAttributeTest is exited.
func (s *BaseXPath3Listener) ExitSchemaAttributeTest(ctx *SchemaAttributeTestContext) {}

// EnterAttributeDeclaration is called when production attributeDeclaration is entered.
func (s *BaseXPath3Listener) EnterAttributeDeclaration(ctx *AttributeDeclarationContext) {}

// ExitAttributeDeclaration is called when production attributeDeclaration is exited.
func (s *BaseXPath3Listener) ExitAttributeDeclaration(ctx *AttributeDeclarationContext) {}

// EnterElementTest is called when production elementTest is entered.
func (s *BaseXPath3Listener) EnterElementTest(ctx *ElementTestContext) {}

// ExitElementTest is called when production elementTest is exited.
func (s *BaseXPath3Listener) ExitElementTest(ctx *ElementTestContext) {}

// EnterElementNameOrWildcard is called when production elementNameOrWildcard is entered.
func (s *BaseXPath3Listener) EnterElementNameOrWildcard(ctx *ElementNameOrWildcardContext) {}

// ExitElementNameOrWildcard is called when production elementNameOrWildcard is exited.
func (s *BaseXPath3Listener) ExitElementNameOrWildcard(ctx *ElementNameOrWildcardContext) {}

// EnterSchemaElementTest is called when production schemaElementTest is entered.
func (s *BaseXPath3Listener) EnterSchemaElementTest(ctx *SchemaElementTestContext) {}

// ExitSchemaElementTest is called when production schemaElementTest is exited.
func (s *BaseXPath3Listener) ExitSchemaElementTest(ctx *SchemaElementTestContext) {}

// EnterElementDeclaration is called when production elementDeclaration is entered.
func (s *BaseXPath3Listener) EnterElementDeclaration(ctx *ElementDeclarationContext) {}

// ExitElementDeclaration is called when production elementDeclaration is exited.
func (s *BaseXPath3Listener) ExitElementDeclaration(ctx *ElementDeclarationContext) {}

// EnterAttributeName is called when production attributeName is entered.
func (s *BaseXPath3Listener) EnterAttributeName(ctx *AttributeNameContext) {}

// ExitAttributeName is called when production attributeName is exited.
func (s *BaseXPath3Listener) ExitAttributeName(ctx *AttributeNameContext) {}

// EnterElementName is called when production elementName is entered.
func (s *BaseXPath3Listener) EnterElementName(ctx *ElementNameContext) {}

// ExitElementName is called when production elementName is exited.
func (s *BaseXPath3Listener) ExitElementName(ctx *ElementNameContext) {}

// EnterSimpleTypeName is called when production simpleTypeName is entered.
func (s *BaseXPath3Listener) EnterSimpleTypeName(ctx *SimpleTypeNameContext) {}

// ExitSimpleTypeName is called when production simpleTypeName is exited.
func (s *BaseXPath3Listener) ExitSimpleTypeName(ctx *SimpleTypeNameContext) {}

// EnterTypeName is called when production typeName is entered.
func (s *BaseXPath3Listener) EnterTypeName(ctx *TypeNameContext) {}

// ExitTypeName is called when production typeName is exited.
func (s *BaseXPath3Listener) ExitTypeName(ctx *TypeNameContext) {}

// EnterFunctionTest is called when production functionTest is entered.
func (s *BaseXPath3Listener) EnterFunctionTest(ctx *FunctionTestContext) {}

// ExitFunctionTest is called when production functionTest is exited.
func (s *BaseXPath3Listener) ExitFunctionTest(ctx *FunctionTestContext) {}

// EnterAnyFunctionTest is called when production anyFunctionTest is entered.
func (s *BaseXPath3Listener) EnterAnyFunctionTest(ctx *AnyFunctionTestContext) {}

// ExitAnyFunctionTest is called when production anyFunctionTest is exited.
func (s *BaseXPath3Listener) ExitAnyFunctionTest(ctx *AnyFunctionTestContext) {}

// EnterTypedFunctionTest is called when production typedFunctionTest is entered.
func (s *BaseXPath3Listener) EnterTypedFunctionTest(ctx *TypedFunctionTestContext) {}

// ExitTypedFunctionTest is called when production typedFunctionTest is exited.
func (s *BaseXPath3Listener) ExitTypedFunctionTest(ctx *TypedFunctionTestContext) {}

// EnterParenthesizedItemType is called when production parenthesizedItemType is entered.
func (s *BaseXPath3Listener) EnterParenthesizedItemType(ctx *ParenthesizedItemTypeContext) {}

// ExitParenthesizedItemType is called when production parenthesizedItemType is exited.
func (s *BaseXPath3Listener) ExitParenthesizedItemType(ctx *ParenthesizedItemTypeContext) {}

// EnterEqName is called when production eqName is entered.
func (s *BaseXPath3Listener) EnterEqName(ctx *EqNameContext) {}

// ExitEqName is called when production eqName is exited.
func (s *BaseXPath3Listener) ExitEqName(ctx *EqNameContext) {}

// EnterStringLiteral is called when production stringLiteral is entered.
func (s *BaseXPath3Listener) EnterStringLiteral(ctx *StringLiteralContext) {}

// ExitStringLiteral is called when production stringLiteral is exited.
func (s *BaseXPath3Listener) ExitStringLiteral(ctx *StringLiteralContext) {}
