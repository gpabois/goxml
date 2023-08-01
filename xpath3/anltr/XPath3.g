grammar XPath3;

xPath : expr EOF;

paramList : param (',' param)*;

param : '$' eqName type_declaration?;

functionBody : enclosedExpr;
enclosedExpr :	'{' expr '}';
expr : exprSingle (',' exprSingle)*;
exprSingle
	: forExpr
	| letExpr
	| quantifiedExpr
	| ifExpr
	| orExpr;
	
forExpr	: simpleForClause 'return' exprSingle;
simpleForClause: 'for' simpleForBinding (',' simpleForBinding)*;
forBindingList : simpleForBinding
				| forBindingList ',' simpleForBinding;
simpleForBinding: '$' varName 'in' exprSingle;
letExpr	:	simpleLetClause 'return' exprSingle;
simpleLetClause
	:	'let' simpleLetBinding (',' simpleLetBinding)*;
simpleLetBinding
	:	'$' varName ':=' exprSingle;

quantifiedExpr
	:	('some' | 'any') '$' varName 'in' exprSingle (',' '$' varName 'in' exprSingle)* 'satisfies' exprSingle;

ifExpr	:	'if' '(' expr ')' 'then' exprSingle 'else' exprSingle;
orExpr	:	andExpr ('or' andExpr)*;
andExpr	:	stringConcatexpr ((valueComp | generalComp | nodeComp) stringConcatexpr)?;
stringConcatexpr
	:	rangeExpr ('||' rangeExpr)*;
rangeExpr
	:	additiveExpr ('to' additiveExpr)?;
additiveExpr
	:	multiplicativeExpr (('+' | '-') multiplicativeExpr)*;
multiplicativeExpr
	:	unionExpr (('*'|'div'|'idiv'|'mod') unionExpr)*;
unionExpr
	:	intersectExceptExpr (('union'|'|') intersectExceptExpr)*;
intersectExceptExpr
	:	instanceofExpr (('intersect'|'except') instanceofExpr)*;
instanceofExpr
	:	treatExpr ('instance' 'of' sequenceType)?;
treatExpr
	:	castableExpr ('treat' 'as' sequenceType)?;
castableExpr
	:	castExpr ('castable' 'as' singleType)?;
castExpr
	:	unaryExpr ('cast' 'as' singleType)?;
unaryExpr
	:	('+'|'-')* valueExpr;
valueExpr
	:	simpleMapExpr;
generalComp
	:	'=' | '!=' | '<=' | '>=' | '<' | '>';
valueComp
	:	'eq' | 'ne' | 'lt' | 'le' | 'gt' | 'ge';
nodeComp
	:	'is' | '<<' | '>>';
simpleMapExpr
	:	pathExpr ('!' pathExpr)*;
pathExpr 
	:	('/' relativePathExpr?)
	| 	('//' relativePathExpr)
	|	relativePathExpr;
relativePathExpr 
	:	stepExpr (('/' | '//') stepExpr)*;
stepExpr 
	:	postfixExpr | axisStep;
axisStep 
	:	(reverseStep | forwardStep) predicateList;
forwardStep 
	:	(forwardAxis nodeTest) | abbrevForwardStep;
forwardAxis 
	:	 ('child' '::')
	| 	('descendant' '::')
	| 	('attribute' '::')
	| 	('self' '::')
	| 	('descendant-or-self' '::')
	| 	('following-sibling' '::')
	| 	('following' '::')
	| 	('namespace' '::');
	
abbrevForwardStep 
	:	'@'? nodeTest;
reverseStep 
	:	(reverseAxis nodeTest) | abbrevReverseStep;
reverseAxis 
	:	('parent' '::')
	| 	('ancestor' '::')
	| 	('preceding-sibling' '::')
	| 	('preceding' '::')
	| 	('ancestor-or-self' '::');
abbrevReverseStep 
	:	'..';
nodeTest 
	:	kindTest | nameTest;
nameTest 
	:	eqName | wildCard;
wildCard 
	:	'*' 
	|	(NC_NAME ':' '*')
	|	('*' ':' NC_NAME)
	|	(BracedURILiteral '*');
postfixExpr 
	:	primaryExpr (predicate | argumentList)*;
argumentList 
	:	'(' (argument (',' argument)*)? ')';
predicateList 
	:	predicate*;
predicate 
	:	'[' expr ']';
primaryExpr 
	:	literal 
	|	varRef
	|	parenthesizedExpr
	|	contextItemExpr
	|	functionCall
	|	functionItemExpr;

varRef 	:	'$' varName;
varName	:	eqName;

literal :	NumericLiteral | stringLiteral;
NumericLiteral 
	:	IntegerLiteral | DecimalLiteral | DoubleLiteral;

parenthesizedExpr
	:	'(' expr? ')';
contextItemExpr 
	:	'.';
functionCall 
	:	eqName argumentList;
argument 
	:	exprSingle | argumentPlaceholder;
argumentPlaceholder 
	:	 '?';
functionItemExpr
	:	namedFunctionRef | inlineFunctionExpr;
namedFunctionRef
	:	eqName '#' IntegerLiteral;
inlineFunctionExpr
	:	'function' '(' paramList? ')' ('as' sequenceType)? functionBody;
singleType
	:	simpleTypeName '?'?;
type_declaration
	:	'as' sequenceType;
sequenceType
	:	('empty-sequence' '(' ')')
	| 	(itemType occurenceIndicator?);
occurenceIndicator
	:	'?' | '*' | '+';
itemType 
	:	kindTest 
	| 	'item' '(' ')'
	| 	functionTest
	| 	atomicOrUnionType
	| 	parenthesizedItemType;
atomicOrUnionType 
	:	eqName;
kindTest 
	:	documentTest
	| 	elementTest
	| 	attributeTest
	| 	schemaElementTest
	| 	schemaAttributeTest
	| 	piTest
	| 	commentTest
	| 	textTest
	| 	namespaceNodeTest
	| 	anyKindTest;
anyKindTest
	:  	'node' '(' ')';
documentTest 
	:	'document-node' '(' (elementTest | schemaElementTest)? ')';
textTest 
	:	'text' '(' ')';
commentTest 
	:	'comment' '(' ')';
namespaceNodeTest 
	:	'namespace-node' '(' ')';
piTest 	:	'processing-instruction' '(' (NC_NAME | stringLiteral)? ')';
attributeTest 
	:	'attribute' '(' (attribNameOrWildcard (',' typeName)?)? ')';
attribNameOrWildcard
	:	attributeName | '*';
schemaAttributeTest 
	:	'schema-attribute' '(' attributeDeclaration ')';
attributeDeclaration 
	:	attributeName;
elementTest 
	:	'element' '(' (elementNameOrWildcard (',' typeName '?'?)?)? ')';
elementNameOrWildcard
	:	elementName | '*';
schemaElementTest
	:	'schema-element' '(' elementDeclaration ')';
elementDeclaration 
	:	elementName;
attributeName 
	:	eqName;
elementName
	:	eqName;
simpleTypeName
	:	typeName;
typeName:	QNAME;
functionTest
	:	anyFunctionTest
	| 	typedFunctionTest;
anyFunctionTest
	:	'function' '(' '*' ')';
typedFunctionTest
	:	'function' '(' (sequenceType (',' sequenceType)*)? ')' 'as' sequenceType;
parenthesizedItemType
	:	'(' itemType ')';
eqName	:	QNAME | URIQualifiedName;


IntegerLiteral : DIGITS;
DecimalLiteral
	:	('.' DIGITS) | (DIGITS '.' DIGITS?);
DoubleLiteral
	:	(('.' DIGITS) | (DIGITS ('.' DIGITS?)?)) ('E'|'e') ('+'|'-')? DIGITS;
stringLiteral
	:	'"' (ESCAPE_QUOTE|.)*? '"'
	| 	'\'' (ESCAPE_APOS|.)*? '\'';

ESCAPE_QUOTE : '\\"';
ESCAPE_APOS : '\\\'';

URIQualifiedName 
	:	BracedURILiteral NC_NAME;
Comment :	'(:' (CommentContents | Comment)* ':)';

BracedURILiteral
	:	'Q' '{' .*? '}';

CommentContents
	:	(CHAR+ '-' (CHAR* ('(:' | ':)') CHAR*));


QNAME	:	PREFIXED_NAME | UNPREFIXED_NAME;

PREFIXED_NAME
	:	PREFIX ':' LOCAL_PART;

UNPREFIXED_NAME
	:	LOCAL_PART;

PREFIX	:	NC_NAME;
LOCAL_PART
	:	NC_NAME;
NC_NAME	:	CHAR* '-' (CHAR* ':' CHAR*);

CHAR	: 'a'..'z' | 'A'..'Z';
DIGITS 	: ('0'..'9')+;


	




