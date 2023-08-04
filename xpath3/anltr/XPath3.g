grammar XPath3;

xPath : expr EOF;

paramList : param (',' param)*;

param : '$' eqName type_declaration?;

functionBody : enclosedExpr;
enclosedExpr :	'{' expr '}';
expr : exprSingle
	 | expr ',' exprSingle;
exprSingle
	: forExpr
	| letExpr
	| quantifiedExpr
	| ifExpr
	| orExpr;

// For Expression
forExpr	: simpleForClause 'return' exprSingle;
simpleForClause: 'for' forBindingList;
forBindingList : simpleForBinding
				| forBindingList ',' simpleForBinding;
simpleForBinding: '$' varName 'in' exprSingle;

// Let Expression
letExpr	: simpleLetClause 'return' exprSingle;
simpleLetClause : 'let' letBindingList;
letBindingList : simpleLetClause
			   | letBindingList ',' simpleLetBinding;
simpleLetBinding
	:	'$' varName ':=' exprSingle;

// Quantified Expression
quantifiedExpr
	:	quantifiedOp=('some' | 'any') quantifiedBindingList 'satisfies' exprSingle;
quantifiedBindingList : simpleQuantifiedBinding 
						|  quantifiedBindingList ',' simpleQuantifiedBinding;
simpleQuantifiedBinding : '$' varName 'in' exprSingle;

// If expression
ifExpr	:	'if' '(' expr ')' 'then' exprSingle 'else' exprSingle;

// Or expression
orExpr	: andExpr
		| orExpr 'or' andExpr;

// And expression
andExpr	: comparisonExpr
		| andExpr 'and' comparisonExpr;

// Comparison expression
comparisonExpr : stringConcatExpr
			   | stringConcatExpr (valueComp | generalComp | nodeComp) stringConcatExpr;

// String concat expression
stringConcatExpr :	rangeExpr
				 | stringConcatExpr '||' rangeExpr;

// Range expression
rangeExpr 	: additiveExpr
			| rangeExpr 'to' additiveExpr;

// Additive expression
additiveExpr :	multiplicativeExpr 
			 | additiveExpr additiveOp=('+' | '-') multiplicativeExpr;

// Multiplicative expression
multiplicativeExpr : unionExpr 
					| multiplicativeExpr multiplicativeOp=('*'|'div'|'idiv'|'mod') unionExpr;

// Union expression
unionExpr
	:	intersectExceptExpr 
	| unionExpr unionOp=('union'|'|') intersectExceptExpr;

// Intersect or except expression
intersectExceptExpr : instanceofExpr 
					| intersectExceptExpr intersectExceptOp=('intersect'|'except') instanceofExpr;

// InstanceOf expression
instanceofExpr : treatExpr 
				| treatExpr 'instance' 'of' sequenceType;

// Treat expression
treatExpr :	castableExpr 
		  | castableExpr 'treat' 'as' sequenceType;

// Castable expression
castableExpr : castExpr
			 | castExpr 'castable' 'as' singleType;

// Cast expression
castExpr : unaryExpr
		 | unaryExpr 'cast' 'as' singleType;

// Unary expression	
unaryExpr :	valueExpr
		  | '-' unaryExpr
		  | '+' unaryExpr;
valueExpr
	:	simpleMapExpr;
generalComp
	:	'=' | '!=' | '<=' | '>=' | '<' | '>';
valueComp
	:	'eq' | 'ne' | 'lt' | 'le' | 'gt' | 'ge';
nodeComp
	:	'is' | '<<' | '>>';
simpleMapExpr
	: pathExpr 
	| simpleMapExpr simpleMapOp='!' pathExpr;

pathExpr 
	:	(abbvStep='/' relativePathExpr?)
	| 	(abbvStep='//' relativePathExpr)
	|	relativePathExpr;

relativePathExpr 
	:	stepExpr
	| relativePathExpr stepOp=('/' | '//') stepExpr;
	
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
	:	abbvOp='@'? nodeTest;
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


	




