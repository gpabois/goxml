// Code generated from XPath3.g by ANTLR 4.13.0. DO NOT EDIT.

package parser // XPath3

import "github.com/antlr4-go/antlr/v4"

// XPath3Listener is a complete listener for a parse tree produced by XPath3Parser.
type XPath3Listener interface {
	antlr.ParseTreeListener

	// EnterXPath is called when entering the xPath production.
	EnterXPath(c *XPathContext)

	// EnterParamList is called when entering the paramList production.
	EnterParamList(c *ParamListContext)

	// EnterParam is called when entering the param production.
	EnterParam(c *ParamContext)

	// EnterFunctionBody is called when entering the functionBody production.
	EnterFunctionBody(c *FunctionBodyContext)

	// EnterEnclosedExpr is called when entering the enclosedExpr production.
	EnterEnclosedExpr(c *EnclosedExprContext)

	// EnterExpr is called when entering the expr production.
	EnterExpr(c *ExprContext)

	// EnterExprSingle is called when entering the exprSingle production.
	EnterExprSingle(c *ExprSingleContext)

	// EnterForExpr is called when entering the forExpr production.
	EnterForExpr(c *ForExprContext)

	// EnterSimpleForClause is called when entering the simpleForClause production.
	EnterSimpleForClause(c *SimpleForClauseContext)

	// EnterForBindingList is called when entering the forBindingList production.
	EnterForBindingList(c *ForBindingListContext)

	// EnterSimpleForBinding is called when entering the simpleForBinding production.
	EnterSimpleForBinding(c *SimpleForBindingContext)

	// EnterLetExpr is called when entering the letExpr production.
	EnterLetExpr(c *LetExprContext)

	// EnterSimpleLetClause is called when entering the simpleLetClause production.
	EnterSimpleLetClause(c *SimpleLetClauseContext)

	// EnterSimpleLetBinding is called when entering the simpleLetBinding production.
	EnterSimpleLetBinding(c *SimpleLetBindingContext)

	// EnterQuantifiedExpr is called when entering the quantifiedExpr production.
	EnterQuantifiedExpr(c *QuantifiedExprContext)

	// EnterIfExpr is called when entering the ifExpr production.
	EnterIfExpr(c *IfExprContext)

	// EnterOrExpr is called when entering the orExpr production.
	EnterOrExpr(c *OrExprContext)

	// EnterAndExpr is called when entering the andExpr production.
	EnterAndExpr(c *AndExprContext)

	// EnterStringConcatexpr is called when entering the stringConcatexpr production.
	EnterStringConcatexpr(c *StringConcatexprContext)

	// EnterRangeExpr is called when entering the rangeExpr production.
	EnterRangeExpr(c *RangeExprContext)

	// EnterAdditiveExpr is called when entering the additiveExpr production.
	EnterAdditiveExpr(c *AdditiveExprContext)

	// EnterMultiplicativeExpr is called when entering the multiplicativeExpr production.
	EnterMultiplicativeExpr(c *MultiplicativeExprContext)

	// EnterUnionExpr is called when entering the unionExpr production.
	EnterUnionExpr(c *UnionExprContext)

	// EnterIntersectExceptExpr is called when entering the intersectExceptExpr production.
	EnterIntersectExceptExpr(c *IntersectExceptExprContext)

	// EnterInstanceofExpr is called when entering the instanceofExpr production.
	EnterInstanceofExpr(c *InstanceofExprContext)

	// EnterTreatExpr is called when entering the treatExpr production.
	EnterTreatExpr(c *TreatExprContext)

	// EnterCastableExpr is called when entering the castableExpr production.
	EnterCastableExpr(c *CastableExprContext)

	// EnterCastExpr is called when entering the castExpr production.
	EnterCastExpr(c *CastExprContext)

	// EnterUnaryExpr is called when entering the unaryExpr production.
	EnterUnaryExpr(c *UnaryExprContext)

	// EnterValueExpr is called when entering the valueExpr production.
	EnterValueExpr(c *ValueExprContext)

	// EnterGeneralComp is called when entering the generalComp production.
	EnterGeneralComp(c *GeneralCompContext)

	// EnterValueComp is called when entering the valueComp production.
	EnterValueComp(c *ValueCompContext)

	// EnterNodeComp is called when entering the nodeComp production.
	EnterNodeComp(c *NodeCompContext)

	// EnterSimpleMapExpr is called when entering the simpleMapExpr production.
	EnterSimpleMapExpr(c *SimpleMapExprContext)

	// EnterPathExpr is called when entering the pathExpr production.
	EnterPathExpr(c *PathExprContext)

	// EnterRelativePathExpr is called when entering the relativePathExpr production.
	EnterRelativePathExpr(c *RelativePathExprContext)

	// EnterStepExpr is called when entering the stepExpr production.
	EnterStepExpr(c *StepExprContext)

	// EnterAxisStep is called when entering the axisStep production.
	EnterAxisStep(c *AxisStepContext)

	// EnterForwardStep is called when entering the forwardStep production.
	EnterForwardStep(c *ForwardStepContext)

	// EnterForwardAxis is called when entering the forwardAxis production.
	EnterForwardAxis(c *ForwardAxisContext)

	// EnterAbbrevForwardStep is called when entering the abbrevForwardStep production.
	EnterAbbrevForwardStep(c *AbbrevForwardStepContext)

	// EnterReverseStep is called when entering the reverseStep production.
	EnterReverseStep(c *ReverseStepContext)

	// EnterReverseAxis is called when entering the reverseAxis production.
	EnterReverseAxis(c *ReverseAxisContext)

	// EnterAbbrevReverseStep is called when entering the abbrevReverseStep production.
	EnterAbbrevReverseStep(c *AbbrevReverseStepContext)

	// EnterNodeTest is called when entering the nodeTest production.
	EnterNodeTest(c *NodeTestContext)

	// EnterNameTest is called when entering the nameTest production.
	EnterNameTest(c *NameTestContext)

	// EnterWildCard is called when entering the wildCard production.
	EnterWildCard(c *WildCardContext)

	// EnterPostfixExpr is called when entering the postfixExpr production.
	EnterPostfixExpr(c *PostfixExprContext)

	// EnterArgumentList is called when entering the argumentList production.
	EnterArgumentList(c *ArgumentListContext)

	// EnterPredicateList is called when entering the predicateList production.
	EnterPredicateList(c *PredicateListContext)

	// EnterPredicate is called when entering the predicate production.
	EnterPredicate(c *PredicateContext)

	// EnterPrimaryExpr is called when entering the primaryExpr production.
	EnterPrimaryExpr(c *PrimaryExprContext)

	// EnterVarRef is called when entering the varRef production.
	EnterVarRef(c *VarRefContext)

	// EnterVarName is called when entering the varName production.
	EnterVarName(c *VarNameContext)

	// EnterLiteral is called when entering the literal production.
	EnterLiteral(c *LiteralContext)

	// EnterParenthesizedExpr is called when entering the parenthesizedExpr production.
	EnterParenthesizedExpr(c *ParenthesizedExprContext)

	// EnterContextItemExpr is called when entering the contextItemExpr production.
	EnterContextItemExpr(c *ContextItemExprContext)

	// EnterFunctionCall is called when entering the functionCall production.
	EnterFunctionCall(c *FunctionCallContext)

	// EnterArgument is called when entering the argument production.
	EnterArgument(c *ArgumentContext)

	// EnterArgumentPlaceholder is called when entering the argumentPlaceholder production.
	EnterArgumentPlaceholder(c *ArgumentPlaceholderContext)

	// EnterFunctionItemExpr is called when entering the functionItemExpr production.
	EnterFunctionItemExpr(c *FunctionItemExprContext)

	// EnterNamedFunctionRef is called when entering the namedFunctionRef production.
	EnterNamedFunctionRef(c *NamedFunctionRefContext)

	// EnterInlineFunctionExpr is called when entering the inlineFunctionExpr production.
	EnterInlineFunctionExpr(c *InlineFunctionExprContext)

	// EnterSingleType is called when entering the singleType production.
	EnterSingleType(c *SingleTypeContext)

	// EnterType_declaration is called when entering the type_declaration production.
	EnterType_declaration(c *Type_declarationContext)

	// EnterSequenceType is called when entering the sequenceType production.
	EnterSequenceType(c *SequenceTypeContext)

	// EnterOccurenceIndicator is called when entering the occurenceIndicator production.
	EnterOccurenceIndicator(c *OccurenceIndicatorContext)

	// EnterItemType is called when entering the itemType production.
	EnterItemType(c *ItemTypeContext)

	// EnterAtomicOrUnionType is called when entering the atomicOrUnionType production.
	EnterAtomicOrUnionType(c *AtomicOrUnionTypeContext)

	// EnterKindTest is called when entering the kindTest production.
	EnterKindTest(c *KindTestContext)

	// EnterAnyKindTest is called when entering the anyKindTest production.
	EnterAnyKindTest(c *AnyKindTestContext)

	// EnterDocumentTest is called when entering the documentTest production.
	EnterDocumentTest(c *DocumentTestContext)

	// EnterTextTest is called when entering the textTest production.
	EnterTextTest(c *TextTestContext)

	// EnterCommentTest is called when entering the commentTest production.
	EnterCommentTest(c *CommentTestContext)

	// EnterNamespaceNodeTest is called when entering the namespaceNodeTest production.
	EnterNamespaceNodeTest(c *NamespaceNodeTestContext)

	// EnterPiTest is called when entering the piTest production.
	EnterPiTest(c *PiTestContext)

	// EnterAttributeTest is called when entering the attributeTest production.
	EnterAttributeTest(c *AttributeTestContext)

	// EnterAttribNameOrWildcard is called when entering the attribNameOrWildcard production.
	EnterAttribNameOrWildcard(c *AttribNameOrWildcardContext)

	// EnterSchemaAttributeTest is called when entering the schemaAttributeTest production.
	EnterSchemaAttributeTest(c *SchemaAttributeTestContext)

	// EnterAttributeDeclaration is called when entering the attributeDeclaration production.
	EnterAttributeDeclaration(c *AttributeDeclarationContext)

	// EnterElementTest is called when entering the elementTest production.
	EnterElementTest(c *ElementTestContext)

	// EnterElementNameOrWildcard is called when entering the elementNameOrWildcard production.
	EnterElementNameOrWildcard(c *ElementNameOrWildcardContext)

	// EnterSchemaElementTest is called when entering the schemaElementTest production.
	EnterSchemaElementTest(c *SchemaElementTestContext)

	// EnterElementDeclaration is called when entering the elementDeclaration production.
	EnterElementDeclaration(c *ElementDeclarationContext)

	// EnterAttributeName is called when entering the attributeName production.
	EnterAttributeName(c *AttributeNameContext)

	// EnterElementName is called when entering the elementName production.
	EnterElementName(c *ElementNameContext)

	// EnterSimpleTypeName is called when entering the simpleTypeName production.
	EnterSimpleTypeName(c *SimpleTypeNameContext)

	// EnterTypeName is called when entering the typeName production.
	EnterTypeName(c *TypeNameContext)

	// EnterFunctionTest is called when entering the functionTest production.
	EnterFunctionTest(c *FunctionTestContext)

	// EnterAnyFunctionTest is called when entering the anyFunctionTest production.
	EnterAnyFunctionTest(c *AnyFunctionTestContext)

	// EnterTypedFunctionTest is called when entering the typedFunctionTest production.
	EnterTypedFunctionTest(c *TypedFunctionTestContext)

	// EnterParenthesizedItemType is called when entering the parenthesizedItemType production.
	EnterParenthesizedItemType(c *ParenthesizedItemTypeContext)

	// EnterEqName is called when entering the eqName production.
	EnterEqName(c *EqNameContext)

	// EnterStringLiteral is called when entering the stringLiteral production.
	EnterStringLiteral(c *StringLiteralContext)

	// ExitXPath is called when exiting the xPath production.
	ExitXPath(c *XPathContext)

	// ExitParamList is called when exiting the paramList production.
	ExitParamList(c *ParamListContext)

	// ExitParam is called when exiting the param production.
	ExitParam(c *ParamContext)

	// ExitFunctionBody is called when exiting the functionBody production.
	ExitFunctionBody(c *FunctionBodyContext)

	// ExitEnclosedExpr is called when exiting the enclosedExpr production.
	ExitEnclosedExpr(c *EnclosedExprContext)

	// ExitExpr is called when exiting the expr production.
	ExitExpr(c *ExprContext)

	// ExitExprSingle is called when exiting the exprSingle production.
	ExitExprSingle(c *ExprSingleContext)

	// ExitForExpr is called when exiting the forExpr production.
	ExitForExpr(c *ForExprContext)

	// ExitSimpleForClause is called when exiting the simpleForClause production.
	ExitSimpleForClause(c *SimpleForClauseContext)

	// ExitForBindingList is called when exiting the forBindingList production.
	ExitForBindingList(c *ForBindingListContext)

	// ExitSimpleForBinding is called when exiting the simpleForBinding production.
	ExitSimpleForBinding(c *SimpleForBindingContext)

	// ExitLetExpr is called when exiting the letExpr production.
	ExitLetExpr(c *LetExprContext)

	// ExitSimpleLetClause is called when exiting the simpleLetClause production.
	ExitSimpleLetClause(c *SimpleLetClauseContext)

	// ExitSimpleLetBinding is called when exiting the simpleLetBinding production.
	ExitSimpleLetBinding(c *SimpleLetBindingContext)

	// ExitQuantifiedExpr is called when exiting the quantifiedExpr production.
	ExitQuantifiedExpr(c *QuantifiedExprContext)

	// ExitIfExpr is called when exiting the ifExpr production.
	ExitIfExpr(c *IfExprContext)

	// ExitOrExpr is called when exiting the orExpr production.
	ExitOrExpr(c *OrExprContext)

	// ExitAndExpr is called when exiting the andExpr production.
	ExitAndExpr(c *AndExprContext)

	// ExitStringConcatexpr is called when exiting the stringConcatexpr production.
	ExitStringConcatexpr(c *StringConcatexprContext)

	// ExitRangeExpr is called when exiting the rangeExpr production.
	ExitRangeExpr(c *RangeExprContext)

	// ExitAdditiveExpr is called when exiting the additiveExpr production.
	ExitAdditiveExpr(c *AdditiveExprContext)

	// ExitMultiplicativeExpr is called when exiting the multiplicativeExpr production.
	ExitMultiplicativeExpr(c *MultiplicativeExprContext)

	// ExitUnionExpr is called when exiting the unionExpr production.
	ExitUnionExpr(c *UnionExprContext)

	// ExitIntersectExceptExpr is called when exiting the intersectExceptExpr production.
	ExitIntersectExceptExpr(c *IntersectExceptExprContext)

	// ExitInstanceofExpr is called when exiting the instanceofExpr production.
	ExitInstanceofExpr(c *InstanceofExprContext)

	// ExitTreatExpr is called when exiting the treatExpr production.
	ExitTreatExpr(c *TreatExprContext)

	// ExitCastableExpr is called when exiting the castableExpr production.
	ExitCastableExpr(c *CastableExprContext)

	// ExitCastExpr is called when exiting the castExpr production.
	ExitCastExpr(c *CastExprContext)

	// ExitUnaryExpr is called when exiting the unaryExpr production.
	ExitUnaryExpr(c *UnaryExprContext)

	// ExitValueExpr is called when exiting the valueExpr production.
	ExitValueExpr(c *ValueExprContext)

	// ExitGeneralComp is called when exiting the generalComp production.
	ExitGeneralComp(c *GeneralCompContext)

	// ExitValueComp is called when exiting the valueComp production.
	ExitValueComp(c *ValueCompContext)

	// ExitNodeComp is called when exiting the nodeComp production.
	ExitNodeComp(c *NodeCompContext)

	// ExitSimpleMapExpr is called when exiting the simpleMapExpr production.
	ExitSimpleMapExpr(c *SimpleMapExprContext)

	// ExitPathExpr is called when exiting the pathExpr production.
	ExitPathExpr(c *PathExprContext)

	// ExitRelativePathExpr is called when exiting the relativePathExpr production.
	ExitRelativePathExpr(c *RelativePathExprContext)

	// ExitStepExpr is called when exiting the stepExpr production.
	ExitStepExpr(c *StepExprContext)

	// ExitAxisStep is called when exiting the axisStep production.
	ExitAxisStep(c *AxisStepContext)

	// ExitForwardStep is called when exiting the forwardStep production.
	ExitForwardStep(c *ForwardStepContext)

	// ExitForwardAxis is called when exiting the forwardAxis production.
	ExitForwardAxis(c *ForwardAxisContext)

	// ExitAbbrevForwardStep is called when exiting the abbrevForwardStep production.
	ExitAbbrevForwardStep(c *AbbrevForwardStepContext)

	// ExitReverseStep is called when exiting the reverseStep production.
	ExitReverseStep(c *ReverseStepContext)

	// ExitReverseAxis is called when exiting the reverseAxis production.
	ExitReverseAxis(c *ReverseAxisContext)

	// ExitAbbrevReverseStep is called when exiting the abbrevReverseStep production.
	ExitAbbrevReverseStep(c *AbbrevReverseStepContext)

	// ExitNodeTest is called when exiting the nodeTest production.
	ExitNodeTest(c *NodeTestContext)

	// ExitNameTest is called when exiting the nameTest production.
	ExitNameTest(c *NameTestContext)

	// ExitWildCard is called when exiting the wildCard production.
	ExitWildCard(c *WildCardContext)

	// ExitPostfixExpr is called when exiting the postfixExpr production.
	ExitPostfixExpr(c *PostfixExprContext)

	// ExitArgumentList is called when exiting the argumentList production.
	ExitArgumentList(c *ArgumentListContext)

	// ExitPredicateList is called when exiting the predicateList production.
	ExitPredicateList(c *PredicateListContext)

	// ExitPredicate is called when exiting the predicate production.
	ExitPredicate(c *PredicateContext)

	// ExitPrimaryExpr is called when exiting the primaryExpr production.
	ExitPrimaryExpr(c *PrimaryExprContext)

	// ExitVarRef is called when exiting the varRef production.
	ExitVarRef(c *VarRefContext)

	// ExitVarName is called when exiting the varName production.
	ExitVarName(c *VarNameContext)

	// ExitLiteral is called when exiting the literal production.
	ExitLiteral(c *LiteralContext)

	// ExitParenthesizedExpr is called when exiting the parenthesizedExpr production.
	ExitParenthesizedExpr(c *ParenthesizedExprContext)

	// ExitContextItemExpr is called when exiting the contextItemExpr production.
	ExitContextItemExpr(c *ContextItemExprContext)

	// ExitFunctionCall is called when exiting the functionCall production.
	ExitFunctionCall(c *FunctionCallContext)

	// ExitArgument is called when exiting the argument production.
	ExitArgument(c *ArgumentContext)

	// ExitArgumentPlaceholder is called when exiting the argumentPlaceholder production.
	ExitArgumentPlaceholder(c *ArgumentPlaceholderContext)

	// ExitFunctionItemExpr is called when exiting the functionItemExpr production.
	ExitFunctionItemExpr(c *FunctionItemExprContext)

	// ExitNamedFunctionRef is called when exiting the namedFunctionRef production.
	ExitNamedFunctionRef(c *NamedFunctionRefContext)

	// ExitInlineFunctionExpr is called when exiting the inlineFunctionExpr production.
	ExitInlineFunctionExpr(c *InlineFunctionExprContext)

	// ExitSingleType is called when exiting the singleType production.
	ExitSingleType(c *SingleTypeContext)

	// ExitType_declaration is called when exiting the type_declaration production.
	ExitType_declaration(c *Type_declarationContext)

	// ExitSequenceType is called when exiting the sequenceType production.
	ExitSequenceType(c *SequenceTypeContext)

	// ExitOccurenceIndicator is called when exiting the occurenceIndicator production.
	ExitOccurenceIndicator(c *OccurenceIndicatorContext)

	// ExitItemType is called when exiting the itemType production.
	ExitItemType(c *ItemTypeContext)

	// ExitAtomicOrUnionType is called when exiting the atomicOrUnionType production.
	ExitAtomicOrUnionType(c *AtomicOrUnionTypeContext)

	// ExitKindTest is called when exiting the kindTest production.
	ExitKindTest(c *KindTestContext)

	// ExitAnyKindTest is called when exiting the anyKindTest production.
	ExitAnyKindTest(c *AnyKindTestContext)

	// ExitDocumentTest is called when exiting the documentTest production.
	ExitDocumentTest(c *DocumentTestContext)

	// ExitTextTest is called when exiting the textTest production.
	ExitTextTest(c *TextTestContext)

	// ExitCommentTest is called when exiting the commentTest production.
	ExitCommentTest(c *CommentTestContext)

	// ExitNamespaceNodeTest is called when exiting the namespaceNodeTest production.
	ExitNamespaceNodeTest(c *NamespaceNodeTestContext)

	// ExitPiTest is called when exiting the piTest production.
	ExitPiTest(c *PiTestContext)

	// ExitAttributeTest is called when exiting the attributeTest production.
	ExitAttributeTest(c *AttributeTestContext)

	// ExitAttribNameOrWildcard is called when exiting the attribNameOrWildcard production.
	ExitAttribNameOrWildcard(c *AttribNameOrWildcardContext)

	// ExitSchemaAttributeTest is called when exiting the schemaAttributeTest production.
	ExitSchemaAttributeTest(c *SchemaAttributeTestContext)

	// ExitAttributeDeclaration is called when exiting the attributeDeclaration production.
	ExitAttributeDeclaration(c *AttributeDeclarationContext)

	// ExitElementTest is called when exiting the elementTest production.
	ExitElementTest(c *ElementTestContext)

	// ExitElementNameOrWildcard is called when exiting the elementNameOrWildcard production.
	ExitElementNameOrWildcard(c *ElementNameOrWildcardContext)

	// ExitSchemaElementTest is called when exiting the schemaElementTest production.
	ExitSchemaElementTest(c *SchemaElementTestContext)

	// ExitElementDeclaration is called when exiting the elementDeclaration production.
	ExitElementDeclaration(c *ElementDeclarationContext)

	// ExitAttributeName is called when exiting the attributeName production.
	ExitAttributeName(c *AttributeNameContext)

	// ExitElementName is called when exiting the elementName production.
	ExitElementName(c *ElementNameContext)

	// ExitSimpleTypeName is called when exiting the simpleTypeName production.
	ExitSimpleTypeName(c *SimpleTypeNameContext)

	// ExitTypeName is called when exiting the typeName production.
	ExitTypeName(c *TypeNameContext)

	// ExitFunctionTest is called when exiting the functionTest production.
	ExitFunctionTest(c *FunctionTestContext)

	// ExitAnyFunctionTest is called when exiting the anyFunctionTest production.
	ExitAnyFunctionTest(c *AnyFunctionTestContext)

	// ExitTypedFunctionTest is called when exiting the typedFunctionTest production.
	ExitTypedFunctionTest(c *TypedFunctionTestContext)

	// ExitParenthesizedItemType is called when exiting the parenthesizedItemType production.
	ExitParenthesizedItemType(c *ParenthesizedItemTypeContext)

	// ExitEqName is called when exiting the eqName production.
	ExitEqName(c *EqNameContext)

	// ExitStringLiteral is called when exiting the stringLiteral production.
	ExitStringLiteral(c *StringLiteralContext)
}
