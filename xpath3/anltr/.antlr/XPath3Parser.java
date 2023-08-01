// Generated from /Users/gpabois/dev/goxml/xpath3/anltr/XPath3.g by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XPath3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, NumericLiteral=91, IntegerLiteral=92, DecimalLiteral=93, 
		DoubleLiteral=94, ESCAPE_QUOTE=95, ESCAPE_APOS=96, URIQualifiedName=97, 
		Comment=98, BracedURILiteral=99, CommentContents=100, QNAME=101, PREFIXED_NAME=102, 
		UNPREFIXED_NAME=103, PREFIX=104, LOCAL_PART=105, NC_NAME=106, CHAR=107, 
		DIGITS=108;
	public static final int
		RULE_xPath = 0, RULE_paramList = 1, RULE_param = 2, RULE_functionBody = 3, 
		RULE_enclosedExpr = 4, RULE_expr = 5, RULE_exprSingle = 6, RULE_forExpr = 7, 
		RULE_simpleForClause = 8, RULE_forBindingList = 9, RULE_simpleForBinding = 10, 
		RULE_letExpr = 11, RULE_simpleLetClause = 12, RULE_simpleLetBinding = 13, 
		RULE_quantifiedExpr = 14, RULE_ifExpr = 15, RULE_orExpr = 16, RULE_andExpr = 17, 
		RULE_stringConcatexpr = 18, RULE_rangeExpr = 19, RULE_additiveExpr = 20, 
		RULE_multiplicativeExpr = 21, RULE_unionExpr = 22, RULE_intersectExceptExpr = 23, 
		RULE_instanceofExpr = 24, RULE_treatExpr = 25, RULE_castableExpr = 26, 
		RULE_castExpr = 27, RULE_unaryExpr = 28, RULE_valueExpr = 29, RULE_generalComp = 30, 
		RULE_valueComp = 31, RULE_nodeComp = 32, RULE_simpleMapExpr = 33, RULE_pathExpr = 34, 
		RULE_relativePathExpr = 35, RULE_stepExpr = 36, RULE_axisStep = 37, RULE_forwardStep = 38, 
		RULE_forwardAxis = 39, RULE_abbrevForwardStep = 40, RULE_reverseStep = 41, 
		RULE_reverseAxis = 42, RULE_abbrevReverseStep = 43, RULE_nodeTest = 44, 
		RULE_nameTest = 45, RULE_wildCard = 46, RULE_postfixExpr = 47, RULE_argumentList = 48, 
		RULE_predicateList = 49, RULE_predicate = 50, RULE_primaryExpr = 51, RULE_varRef = 52, 
		RULE_varName = 53, RULE_literal = 54, RULE_parenthesizedExpr = 55, RULE_contextItemExpr = 56, 
		RULE_functionCall = 57, RULE_argument = 58, RULE_argumentPlaceholder = 59, 
		RULE_functionItemExpr = 60, RULE_namedFunctionRef = 61, RULE_inlineFunctionExpr = 62, 
		RULE_singleType = 63, RULE_type_declaration = 64, RULE_sequenceType = 65, 
		RULE_occurenceIndicator = 66, RULE_itemType = 67, RULE_atomicOrUnionType = 68, 
		RULE_kindTest = 69, RULE_anyKindTest = 70, RULE_documentTest = 71, RULE_textTest = 72, 
		RULE_commentTest = 73, RULE_namespaceNodeTest = 74, RULE_piTest = 75, 
		RULE_attributeTest = 76, RULE_attribNameOrWildcard = 77, RULE_schemaAttributeTest = 78, 
		RULE_attributeDeclaration = 79, RULE_elementTest = 80, RULE_elementNameOrWildcard = 81, 
		RULE_schemaElementTest = 82, RULE_elementDeclaration = 83, RULE_attributeName = 84, 
		RULE_elementName = 85, RULE_simpleTypeName = 86, RULE_typeName = 87, RULE_functionTest = 88, 
		RULE_anyFunctionTest = 89, RULE_typedFunctionTest = 90, RULE_parenthesizedItemType = 91, 
		RULE_eqName = 92, RULE_stringLiteral = 93;
	private static String[] makeRuleNames() {
		return new String[] {
			"xPath", "paramList", "param", "functionBody", "enclosedExpr", "expr", 
			"exprSingle", "forExpr", "simpleForClause", "forBindingList", "simpleForBinding", 
			"letExpr", "simpleLetClause", "simpleLetBinding", "quantifiedExpr", "ifExpr", 
			"orExpr", "andExpr", "stringConcatexpr", "rangeExpr", "additiveExpr", 
			"multiplicativeExpr", "unionExpr", "intersectExceptExpr", "instanceofExpr", 
			"treatExpr", "castableExpr", "castExpr", "unaryExpr", "valueExpr", "generalComp", 
			"valueComp", "nodeComp", "simpleMapExpr", "pathExpr", "relativePathExpr", 
			"stepExpr", "axisStep", "forwardStep", "forwardAxis", "abbrevForwardStep", 
			"reverseStep", "reverseAxis", "abbrevReverseStep", "nodeTest", "nameTest", 
			"wildCard", "postfixExpr", "argumentList", "predicateList", "predicate", 
			"primaryExpr", "varRef", "varName", "literal", "parenthesizedExpr", "contextItemExpr", 
			"functionCall", "argument", "argumentPlaceholder", "functionItemExpr", 
			"namedFunctionRef", "inlineFunctionExpr", "singleType", "type_declaration", 
			"sequenceType", "occurenceIndicator", "itemType", "atomicOrUnionType", 
			"kindTest", "anyKindTest", "documentTest", "textTest", "commentTest", 
			"namespaceNodeTest", "piTest", "attributeTest", "attribNameOrWildcard", 
			"schemaAttributeTest", "attributeDeclaration", "elementTest", "elementNameOrWildcard", 
			"schemaElementTest", "elementDeclaration", "attributeName", "elementName", 
			"simpleTypeName", "typeName", "functionTest", "anyFunctionTest", "typedFunctionTest", 
			"parenthesizedItemType", "eqName", "stringLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'$'", "'{'", "'}'", "'return'", "'for'", "'in'", "'let'", 
			"':='", "'some'", "'any'", "'satisfies'", "'if'", "'('", "')'", "'then'", 
			"'else'", "'or'", "'||'", "'to'", "'+'", "'-'", "'*'", "'div'", "'idiv'", 
			"'mod'", "'union'", "'|'", "'intersect'", "'except'", "'instance'", "'of'", 
			"'treat'", "'as'", "'castable'", "'cast'", "'='", "'!='", "'<='", "'>='", 
			"'<'", "'>'", "'eq'", "'ne'", "'lt'", "'le'", "'gt'", "'ge'", "'is'", 
			"'<<'", "'>>'", "'!'", "'/'", "'//'", "'child'", "'::'", "'descendant'", 
			"'attribute'", "'self'", "'descendant-or-self'", "'following-sibling'", 
			"'following'", "'namespace'", "'@'", "'parent'", "'ancestor'", "'preceding-sibling'", 
			"'preceding'", "'ancestor-or-self'", "'..'", "':'", "'['", "']'", "'.'", 
			"'?'", "'#'", "'function'", "'empty-sequence'", "'item'", "'node'", "'document-node'", 
			"'text'", "'comment'", "'namespace-node'", "'processing-instruction'", 
			"'schema-attribute'", "'element'", "'schema-element'", "'\"'", "'''", 
			null, null, null, null, "'\\\"'", "'\\''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "NumericLiteral", "IntegerLiteral", 
			"DecimalLiteral", "DoubleLiteral", "ESCAPE_QUOTE", "ESCAPE_APOS", "URIQualifiedName", 
			"Comment", "BracedURILiteral", "CommentContents", "QNAME", "PREFIXED_NAME", 
			"UNPREFIXED_NAME", "PREFIX", "LOCAL_PART", "NC_NAME", "CHAR", "DIGITS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "XPath3.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XPath3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class XPathContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(XPath3Parser.EOF, 0); }
		public XPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xPath; }
	}

	public final XPathContext xPath() throws RecognitionException {
		XPathContext _localctx = new XPathContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_xPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			expr();
			setState(189);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamListContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			param();
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(192);
				match(T__0);
				setState(193);
				param();
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public EqNameContext eqName() {
			return getRuleContext(EqNameContext.class,0);
		}
		public Type_declarationContext type_declaration() {
			return getRuleContext(Type_declarationContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(T__1);
			setState(200);
			eqName();
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__33) {
				{
				setState(201);
				type_declaration();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public EnclosedExprContext enclosedExpr() {
			return getRuleContext(EnclosedExprContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			enclosedExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnclosedExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public EnclosedExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enclosedExpr; }
	}

	public final EnclosedExprContext enclosedExpr() throws RecognitionException {
		EnclosedExprContext _localctx = new EnclosedExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_enclosedExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(T__2);
			setState(207);
			expr();
			setState(208);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public List<ExprSingleContext> exprSingle() {
			return getRuleContexts(ExprSingleContext.class);
		}
		public ExprSingleContext exprSingle(int i) {
			return getRuleContext(ExprSingleContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			exprSingle();
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(211);
				match(T__0);
				setState(212);
				exprSingle();
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprSingleContext extends ParserRuleContext {
		public ForExprContext forExpr() {
			return getRuleContext(ForExprContext.class,0);
		}
		public LetExprContext letExpr() {
			return getRuleContext(LetExprContext.class,0);
		}
		public QuantifiedExprContext quantifiedExpr() {
			return getRuleContext(QuantifiedExprContext.class,0);
		}
		public IfExprContext ifExpr() {
			return getRuleContext(IfExprContext.class,0);
		}
		public OrExprContext orExpr() {
			return getRuleContext(OrExprContext.class,0);
		}
		public ExprSingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprSingle; }
	}

	public final ExprSingleContext exprSingle() throws RecognitionException {
		ExprSingleContext _localctx = new ExprSingleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exprSingle);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				forExpr();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				letExpr();
				}
				break;
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				quantifiedExpr();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(221);
				ifExpr();
				}
				break;
			case T__1:
			case T__13:
			case T__20:
			case T__21:
			case T__22:
			case T__52:
			case T__53:
			case T__54:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__73:
			case T__76:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
			case T__85:
			case T__86:
			case T__87:
			case T__88:
			case T__89:
			case NumericLiteral:
			case URIQualifiedName:
			case BracedURILiteral:
			case QNAME:
			case NC_NAME:
				enterOuterAlt(_localctx, 5);
				{
				setState(222);
				orExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForExprContext extends ParserRuleContext {
		public SimpleForClauseContext simpleForClause() {
			return getRuleContext(SimpleForClauseContext.class,0);
		}
		public ExprSingleContext exprSingle() {
			return getRuleContext(ExprSingleContext.class,0);
		}
		public ForExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpr; }
	}

	public final ForExprContext forExpr() throws RecognitionException {
		ForExprContext _localctx = new ForExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			simpleForClause();
			setState(226);
			match(T__4);
			setState(227);
			exprSingle();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleForClauseContext extends ParserRuleContext {
		public List<SimpleForBindingContext> simpleForBinding() {
			return getRuleContexts(SimpleForBindingContext.class);
		}
		public SimpleForBindingContext simpleForBinding(int i) {
			return getRuleContext(SimpleForBindingContext.class,i);
		}
		public SimpleForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleForClause; }
	}

	public final SimpleForClauseContext simpleForClause() throws RecognitionException {
		SimpleForClauseContext _localctx = new SimpleForClauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_simpleForClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(T__5);
			setState(230);
			simpleForBinding();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(231);
				match(T__0);
				setState(232);
				simpleForBinding();
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForBindingListContext extends ParserRuleContext {
		public SimpleForBindingContext simpleForBinding() {
			return getRuleContext(SimpleForBindingContext.class,0);
		}
		public ForBindingListContext forBindingList() {
			return getRuleContext(ForBindingListContext.class,0);
		}
		public ForBindingListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBindingList; }
	}

	public final ForBindingListContext forBindingList() throws RecognitionException {
		return forBindingList(0);
	}

	private ForBindingListContext forBindingList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ForBindingListContext _localctx = new ForBindingListContext(_ctx, _parentState);
		ForBindingListContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_forBindingList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(239);
			simpleForBinding();
			}
			_ctx.stop = _input.LT(-1);
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ForBindingListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_forBindingList);
					setState(241);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(242);
					match(T__0);
					setState(243);
					simpleForBinding();
					}
					} 
				}
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SimpleForBindingContext extends ParserRuleContext {
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public ExprSingleContext exprSingle() {
			return getRuleContext(ExprSingleContext.class,0);
		}
		public SimpleForBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleForBinding; }
	}

	public final SimpleForBindingContext simpleForBinding() throws RecognitionException {
		SimpleForBindingContext _localctx = new SimpleForBindingContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_simpleForBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(T__1);
			setState(250);
			varName();
			setState(251);
			match(T__6);
			setState(252);
			exprSingle();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetExprContext extends ParserRuleContext {
		public SimpleLetClauseContext simpleLetClause() {
			return getRuleContext(SimpleLetClauseContext.class,0);
		}
		public ExprSingleContext exprSingle() {
			return getRuleContext(ExprSingleContext.class,0);
		}
		public LetExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letExpr; }
	}

	public final LetExprContext letExpr() throws RecognitionException {
		LetExprContext _localctx = new LetExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_letExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			simpleLetClause();
			setState(255);
			match(T__4);
			setState(256);
			exprSingle();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleLetClauseContext extends ParserRuleContext {
		public List<SimpleLetBindingContext> simpleLetBinding() {
			return getRuleContexts(SimpleLetBindingContext.class);
		}
		public SimpleLetBindingContext simpleLetBinding(int i) {
			return getRuleContext(SimpleLetBindingContext.class,i);
		}
		public SimpleLetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleLetClause; }
	}

	public final SimpleLetClauseContext simpleLetClause() throws RecognitionException {
		SimpleLetClauseContext _localctx = new SimpleLetClauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_simpleLetClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(T__7);
			setState(259);
			simpleLetBinding();
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(260);
				match(T__0);
				setState(261);
				simpleLetBinding();
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleLetBindingContext extends ParserRuleContext {
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public ExprSingleContext exprSingle() {
			return getRuleContext(ExprSingleContext.class,0);
		}
		public SimpleLetBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleLetBinding; }
	}

	public final SimpleLetBindingContext simpleLetBinding() throws RecognitionException {
		SimpleLetBindingContext _localctx = new SimpleLetBindingContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_simpleLetBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(T__1);
			setState(268);
			varName();
			setState(269);
			match(T__8);
			setState(270);
			exprSingle();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantifiedExprContext extends ParserRuleContext {
		public List<VarNameContext> varName() {
			return getRuleContexts(VarNameContext.class);
		}
		public VarNameContext varName(int i) {
			return getRuleContext(VarNameContext.class,i);
		}
		public List<ExprSingleContext> exprSingle() {
			return getRuleContexts(ExprSingleContext.class);
		}
		public ExprSingleContext exprSingle(int i) {
			return getRuleContext(ExprSingleContext.class,i);
		}
		public QuantifiedExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifiedExpr; }
	}

	public final QuantifiedExprContext quantifiedExpr() throws RecognitionException {
		QuantifiedExprContext _localctx = new QuantifiedExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_quantifiedExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T__10) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(273);
			match(T__1);
			setState(274);
			varName();
			setState(275);
			match(T__6);
			setState(276);
			exprSingle();
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(277);
				match(T__0);
				setState(278);
				match(T__1);
				setState(279);
				varName();
				setState(280);
				match(T__6);
				setState(281);
				exprSingle();
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
			match(T__11);
			setState(289);
			exprSingle();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<ExprSingleContext> exprSingle() {
			return getRuleContexts(ExprSingleContext.class);
		}
		public ExprSingleContext exprSingle(int i) {
			return getRuleContext(ExprSingleContext.class,i);
		}
		public IfExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpr; }
	}

	public final IfExprContext ifExpr() throws RecognitionException {
		IfExprContext _localctx = new IfExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ifExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(T__12);
			setState(292);
			match(T__13);
			setState(293);
			expr();
			setState(294);
			match(T__14);
			setState(295);
			match(T__15);
			setState(296);
			exprSingle();
			setState(297);
			match(T__16);
			setState(298);
			exprSingle();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrExprContext extends ParserRuleContext {
		public List<AndExprContext> andExpr() {
			return getRuleContexts(AndExprContext.class);
		}
		public AndExprContext andExpr(int i) {
			return getRuleContext(AndExprContext.class,i);
		}
		public OrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpr; }
	}

	public final OrExprContext orExpr() throws RecognitionException {
		OrExprContext _localctx = new OrExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_orExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			andExpr();
			setState(305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(301);
					match(T__17);
					setState(302);
					andExpr();
					}
					} 
				}
				setState(307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndExprContext extends ParserRuleContext {
		public List<StringConcatexprContext> stringConcatexpr() {
			return getRuleContexts(StringConcatexprContext.class);
		}
		public StringConcatexprContext stringConcatexpr(int i) {
			return getRuleContext(StringConcatexprContext.class,i);
		}
		public ValueCompContext valueComp() {
			return getRuleContext(ValueCompContext.class,0);
		}
		public GeneralCompContext generalComp() {
			return getRuleContext(GeneralCompContext.class,0);
		}
		public NodeCompContext nodeComp() {
			return getRuleContext(NodeCompContext.class,0);
		}
		public AndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr; }
	}

	public final AndExprContext andExpr() throws RecognitionException {
		AndExprContext _localctx = new AndExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_andExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			stringConcatexpr();
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(312);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__42:
				case T__43:
				case T__44:
				case T__45:
				case T__46:
				case T__47:
					{
					setState(309);
					valueComp();
					}
					break;
				case T__36:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
				case T__41:
					{
					setState(310);
					generalComp();
					}
					break;
				case T__48:
				case T__49:
				case T__50:
					{
					setState(311);
					nodeComp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(314);
				stringConcatexpr();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringConcatexprContext extends ParserRuleContext {
		public List<RangeExprContext> rangeExpr() {
			return getRuleContexts(RangeExprContext.class);
		}
		public RangeExprContext rangeExpr(int i) {
			return getRuleContext(RangeExprContext.class,i);
		}
		public StringConcatexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringConcatexpr; }
	}

	public final StringConcatexprContext stringConcatexpr() throws RecognitionException {
		StringConcatexprContext _localctx = new StringConcatexprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_stringConcatexpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			rangeExpr();
			setState(323);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(319);
					match(T__18);
					setState(320);
					rangeExpr();
					}
					} 
				}
				setState(325);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeExprContext extends ParserRuleContext {
		public List<AdditiveExprContext> additiveExpr() {
			return getRuleContexts(AdditiveExprContext.class);
		}
		public AdditiveExprContext additiveExpr(int i) {
			return getRuleContext(AdditiveExprContext.class,i);
		}
		public RangeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeExpr; }
	}

	public final RangeExprContext rangeExpr() throws RecognitionException {
		RangeExprContext _localctx = new RangeExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_rangeExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			additiveExpr();
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(327);
				match(T__19);
				setState(328);
				additiveExpr();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveExprContext extends ParserRuleContext {
		public List<MultiplicativeExprContext> multiplicativeExpr() {
			return getRuleContexts(MultiplicativeExprContext.class);
		}
		public MultiplicativeExprContext multiplicativeExpr(int i) {
			return getRuleContext(MultiplicativeExprContext.class,i);
		}
		public AdditiveExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpr; }
	}

	public final AdditiveExprContext additiveExpr() throws RecognitionException {
		AdditiveExprContext _localctx = new AdditiveExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_additiveExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			multiplicativeExpr();
			setState(336);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(332);
					_la = _input.LA(1);
					if ( !(_la==T__20 || _la==T__21) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(333);
					multiplicativeExpr();
					}
					} 
				}
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExprContext extends ParserRuleContext {
		public List<UnionExprContext> unionExpr() {
			return getRuleContexts(UnionExprContext.class);
		}
		public UnionExprContext unionExpr(int i) {
			return getRuleContext(UnionExprContext.class,i);
		}
		public MultiplicativeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpr; }
	}

	public final MultiplicativeExprContext multiplicativeExpr() throws RecognitionException {
		MultiplicativeExprContext _localctx = new MultiplicativeExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_multiplicativeExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			unionExpr();
			setState(344);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(340);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(341);
					unionExpr();
					}
					} 
				}
				setState(346);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionExprContext extends ParserRuleContext {
		public List<IntersectExceptExprContext> intersectExceptExpr() {
			return getRuleContexts(IntersectExceptExprContext.class);
		}
		public IntersectExceptExprContext intersectExceptExpr(int i) {
			return getRuleContext(IntersectExceptExprContext.class,i);
		}
		public UnionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionExpr; }
	}

	public final UnionExprContext unionExpr() throws RecognitionException {
		UnionExprContext _localctx = new UnionExprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_unionExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			intersectExceptExpr();
			setState(352);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(348);
					_la = _input.LA(1);
					if ( !(_la==T__26 || _la==T__27) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(349);
					intersectExceptExpr();
					}
					} 
				}
				setState(354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntersectExceptExprContext extends ParserRuleContext {
		public List<InstanceofExprContext> instanceofExpr() {
			return getRuleContexts(InstanceofExprContext.class);
		}
		public InstanceofExprContext instanceofExpr(int i) {
			return getRuleContext(InstanceofExprContext.class,i);
		}
		public IntersectExceptExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intersectExceptExpr; }
	}

	public final IntersectExceptExprContext intersectExceptExpr() throws RecognitionException {
		IntersectExceptExprContext _localctx = new IntersectExceptExprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_intersectExceptExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			instanceofExpr();
			setState(360);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(356);
					_la = _input.LA(1);
					if ( !(_la==T__28 || _la==T__29) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(357);
					instanceofExpr();
					}
					} 
				}
				setState(362);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceofExprContext extends ParserRuleContext {
		public TreatExprContext treatExpr() {
			return getRuleContext(TreatExprContext.class,0);
		}
		public SequenceTypeContext sequenceType() {
			return getRuleContext(SequenceTypeContext.class,0);
		}
		public InstanceofExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceofExpr; }
	}

	public final InstanceofExprContext instanceofExpr() throws RecognitionException {
		InstanceofExprContext _localctx = new InstanceofExprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_instanceofExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			treatExpr();
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(364);
				match(T__30);
				setState(365);
				match(T__31);
				setState(366);
				sequenceType();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TreatExprContext extends ParserRuleContext {
		public CastableExprContext castableExpr() {
			return getRuleContext(CastableExprContext.class,0);
		}
		public SequenceTypeContext sequenceType() {
			return getRuleContext(SequenceTypeContext.class,0);
		}
		public TreatExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treatExpr; }
	}

	public final TreatExprContext treatExpr() throws RecognitionException {
		TreatExprContext _localctx = new TreatExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_treatExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			castableExpr();
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(370);
				match(T__32);
				setState(371);
				match(T__33);
				setState(372);
				sequenceType();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastableExprContext extends ParserRuleContext {
		public CastExprContext castExpr() {
			return getRuleContext(CastExprContext.class,0);
		}
		public SingleTypeContext singleType() {
			return getRuleContext(SingleTypeContext.class,0);
		}
		public CastableExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castableExpr; }
	}

	public final CastableExprContext castableExpr() throws RecognitionException {
		CastableExprContext _localctx = new CastableExprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_castableExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			castExpr();
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(376);
				match(T__34);
				setState(377);
				match(T__33);
				setState(378);
				singleType();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExprContext extends ParserRuleContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public SingleTypeContext singleType() {
			return getRuleContext(SingleTypeContext.class,0);
		}
		public CastExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpr; }
	}

	public final CastExprContext castExpr() throws RecognitionException {
		CastExprContext _localctx = new CastExprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_castExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			unaryExpr();
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(382);
				match(T__35);
				setState(383);
				match(T__33);
				setState(384);
				singleType();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExprContext extends ParserRuleContext {
		public ValueExprContext valueExpr() {
			return getRuleContext(ValueExprContext.class,0);
		}
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_unaryExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20 || _la==T__21) {
				{
				{
				setState(387);
				_la = _input.LA(1);
				if ( !(_la==T__20 || _la==T__21) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(393);
			valueExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueExprContext extends ParserRuleContext {
		public SimpleMapExprContext simpleMapExpr() {
			return getRuleContext(SimpleMapExprContext.class,0);
		}
		public ValueExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpr; }
	}

	public final ValueExprContext valueExpr() throws RecognitionException {
		ValueExprContext _localctx = new ValueExprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_valueExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			simpleMapExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeneralCompContext extends ParserRuleContext {
		public GeneralCompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalComp; }
	}

	public final GeneralCompContext generalComp() throws RecognitionException {
		GeneralCompContext _localctx = new GeneralCompContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_generalComp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueCompContext extends ParserRuleContext {
		public ValueCompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueComp; }
	}

	public final ValueCompContext valueComp() throws RecognitionException {
		ValueCompContext _localctx = new ValueCompContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_valueComp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NodeCompContext extends ParserRuleContext {
		public NodeCompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeComp; }
	}

	public final NodeCompContext nodeComp() throws RecognitionException {
		NodeCompContext _localctx = new NodeCompContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_nodeComp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__48) | (1L << T__49) | (1L << T__50))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleMapExprContext extends ParserRuleContext {
		public List<PathExprContext> pathExpr() {
			return getRuleContexts(PathExprContext.class);
		}
		public PathExprContext pathExpr(int i) {
			return getRuleContext(PathExprContext.class,i);
		}
		public SimpleMapExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleMapExpr; }
	}

	public final SimpleMapExprContext simpleMapExpr() throws RecognitionException {
		SimpleMapExprContext _localctx = new SimpleMapExprContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_simpleMapExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			pathExpr();
			setState(408);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(404);
					match(T__51);
					setState(405);
					pathExpr();
					}
					} 
				}
				setState(410);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathExprContext extends ParserRuleContext {
		public RelativePathExprContext relativePathExpr() {
			return getRuleContext(RelativePathExprContext.class,0);
		}
		public PathExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathExpr; }
	}

	public final PathExprContext pathExpr() throws RecognitionException {
		PathExprContext _localctx = new PathExprContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_pathExpr);
		try {
			setState(418);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__52:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(411);
				match(T__52);
				setState(413);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(412);
					relativePathExpr();
					}
					break;
				}
				}
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(415);
				match(T__53);
				setState(416);
				relativePathExpr();
				}
				}
				break;
			case T__1:
			case T__13:
			case T__22:
			case T__54:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__73:
			case T__76:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
			case T__85:
			case T__86:
			case T__87:
			case T__88:
			case T__89:
			case NumericLiteral:
			case URIQualifiedName:
			case BracedURILiteral:
			case QNAME:
			case NC_NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(417);
				relativePathExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelativePathExprContext extends ParserRuleContext {
		public List<StepExprContext> stepExpr() {
			return getRuleContexts(StepExprContext.class);
		}
		public StepExprContext stepExpr(int i) {
			return getRuleContext(StepExprContext.class,i);
		}
		public RelativePathExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relativePathExpr; }
	}

	public final RelativePathExprContext relativePathExpr() throws RecognitionException {
		RelativePathExprContext _localctx = new RelativePathExprContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_relativePathExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			stepExpr();
			setState(425);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(421);
					_la = _input.LA(1);
					if ( !(_la==T__52 || _la==T__53) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(422);
					stepExpr();
					}
					} 
				}
				setState(427);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StepExprContext extends ParserRuleContext {
		public PostfixExprContext postfixExpr() {
			return getRuleContext(PostfixExprContext.class,0);
		}
		public AxisStepContext axisStep() {
			return getRuleContext(AxisStepContext.class,0);
		}
		public StepExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stepExpr; }
	}

	public final StepExprContext stepExpr() throws RecognitionException {
		StepExprContext _localctx = new StepExprContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_stepExpr);
		try {
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				postfixExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				axisStep();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AxisStepContext extends ParserRuleContext {
		public PredicateListContext predicateList() {
			return getRuleContext(PredicateListContext.class,0);
		}
		public ReverseStepContext reverseStep() {
			return getRuleContext(ReverseStepContext.class,0);
		}
		public ForwardStepContext forwardStep() {
			return getRuleContext(ForwardStepContext.class,0);
		}
		public AxisStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_axisStep; }
	}

	public final AxisStepContext axisStep() throws RecognitionException {
		AxisStepContext _localctx = new AxisStepContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_axisStep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
				{
				setState(432);
				reverseStep();
				}
				break;
			case T__22:
			case T__54:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
			case T__85:
			case T__86:
			case T__87:
			case URIQualifiedName:
			case BracedURILiteral:
			case QNAME:
			case NC_NAME:
				{
				setState(433);
				forwardStep();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(436);
			predicateList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForwardStepContext extends ParserRuleContext {
		public ForwardAxisContext forwardAxis() {
			return getRuleContext(ForwardAxisContext.class,0);
		}
		public NodeTestContext nodeTest() {
			return getRuleContext(NodeTestContext.class,0);
		}
		public AbbrevForwardStepContext abbrevForwardStep() {
			return getRuleContext(AbbrevForwardStepContext.class,0);
		}
		public ForwardStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forwardStep; }
	}

	public final ForwardStepContext forwardStep() throws RecognitionException {
		ForwardStepContext _localctx = new ForwardStepContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_forwardStep);
		try {
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(438);
				forwardAxis();
				setState(439);
				nodeTest();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
				abbrevForwardStep();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForwardAxisContext extends ParserRuleContext {
		public ForwardAxisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forwardAxis; }
	}

	public final ForwardAxisContext forwardAxis() throws RecognitionException {
		ForwardAxisContext _localctx = new ForwardAxisContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_forwardAxis);
		try {
			setState(460);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__54:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(444);
				match(T__54);
				setState(445);
				match(T__55);
				}
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(446);
				match(T__56);
				setState(447);
				match(T__55);
				}
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(448);
				match(T__57);
				setState(449);
				match(T__55);
				}
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(450);
				match(T__58);
				setState(451);
				match(T__55);
				}
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(452);
				match(T__59);
				setState(453);
				match(T__55);
				}
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(454);
				match(T__60);
				setState(455);
				match(T__55);
				}
				}
				break;
			case T__61:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(456);
				match(T__61);
				setState(457);
				match(T__55);
				}
				}
				break;
			case T__62:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(458);
				match(T__62);
				setState(459);
				match(T__55);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbbrevForwardStepContext extends ParserRuleContext {
		public NodeTestContext nodeTest() {
			return getRuleContext(NodeTestContext.class,0);
		}
		public AbbrevForwardStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abbrevForwardStep; }
	}

	public final AbbrevForwardStepContext abbrevForwardStep() throws RecognitionException {
		AbbrevForwardStepContext _localctx = new AbbrevForwardStepContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_abbrevForwardStep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__63) {
				{
				setState(462);
				match(T__63);
				}
			}

			setState(465);
			nodeTest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReverseStepContext extends ParserRuleContext {
		public ReverseAxisContext reverseAxis() {
			return getRuleContext(ReverseAxisContext.class,0);
		}
		public NodeTestContext nodeTest() {
			return getRuleContext(NodeTestContext.class,0);
		}
		public AbbrevReverseStepContext abbrevReverseStep() {
			return getRuleContext(AbbrevReverseStepContext.class,0);
		}
		public ReverseStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reverseStep; }
	}

	public final ReverseStepContext reverseStep() throws RecognitionException {
		ReverseStepContext _localctx = new ReverseStepContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_reverseStep);
		try {
			setState(471);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(467);
				reverseAxis();
				setState(468);
				nodeTest();
				}
				}
				break;
			case T__69:
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
				abbrevReverseStep();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReverseAxisContext extends ParserRuleContext {
		public ReverseAxisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reverseAxis; }
	}

	public final ReverseAxisContext reverseAxis() throws RecognitionException {
		ReverseAxisContext _localctx = new ReverseAxisContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_reverseAxis);
		try {
			setState(483);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__64:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(473);
				match(T__64);
				setState(474);
				match(T__55);
				}
				}
				break;
			case T__65:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(475);
				match(T__65);
				setState(476);
				match(T__55);
				}
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(477);
				match(T__66);
				setState(478);
				match(T__55);
				}
				}
				break;
			case T__67:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(479);
				match(T__67);
				setState(480);
				match(T__55);
				}
				}
				break;
			case T__68:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(481);
				match(T__68);
				setState(482);
				match(T__55);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbbrevReverseStepContext extends ParserRuleContext {
		public AbbrevReverseStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abbrevReverseStep; }
	}

	public final AbbrevReverseStepContext abbrevReverseStep() throws RecognitionException {
		AbbrevReverseStepContext _localctx = new AbbrevReverseStepContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_abbrevReverseStep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(T__69);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NodeTestContext extends ParserRuleContext {
		public KindTestContext kindTest() {
			return getRuleContext(KindTestContext.class,0);
		}
		public NameTestContext nameTest() {
			return getRuleContext(NameTestContext.class,0);
		}
		public NodeTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeTest; }
	}

	public final NodeTestContext nodeTest() throws RecognitionException {
		NodeTestContext _localctx = new NodeTestContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_nodeTest);
		try {
			setState(489);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__57:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
			case T__85:
			case T__86:
			case T__87:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				kindTest();
				}
				break;
			case T__22:
			case URIQualifiedName:
			case BracedURILiteral:
			case QNAME:
			case NC_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				nameTest();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameTestContext extends ParserRuleContext {
		public EqNameContext eqName() {
			return getRuleContext(EqNameContext.class,0);
		}
		public WildCardContext wildCard() {
			return getRuleContext(WildCardContext.class,0);
		}
		public NameTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameTest; }
	}

	public final NameTestContext nameTest() throws RecognitionException {
		NameTestContext _localctx = new NameTestContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_nameTest);
		try {
			setState(493);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case URIQualifiedName:
			case QNAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(491);
				eqName();
				}
				break;
			case T__22:
			case BracedURILiteral:
			case NC_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
				wildCard();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildCardContext extends ParserRuleContext {
		public TerminalNode NC_NAME() { return getToken(XPath3Parser.NC_NAME, 0); }
		public TerminalNode BracedURILiteral() { return getToken(XPath3Parser.BracedURILiteral, 0); }
		public WildCardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildCard; }
	}

	public final WildCardContext wildCard() throws RecognitionException {
		WildCardContext _localctx = new WildCardContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_wildCard);
		try {
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				match(T__22);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(496);
				match(NC_NAME);
				setState(497);
				match(T__70);
				setState(498);
				match(T__22);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(499);
				match(T__22);
				setState(500);
				match(T__70);
				setState(501);
				match(NC_NAME);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(502);
				match(BracedURILiteral);
				setState(503);
				match(T__22);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExprContext extends ParserRuleContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public List<ArgumentListContext> argumentList() {
			return getRuleContexts(ArgumentListContext.class);
		}
		public ArgumentListContext argumentList(int i) {
			return getRuleContext(ArgumentListContext.class,i);
		}
		public PostfixExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpr; }
	}

	public final PostfixExprContext postfixExpr() throws RecognitionException {
		PostfixExprContext _localctx = new PostfixExprContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_postfixExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			primaryExpr();
			setState(511);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(509);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__71:
						{
						setState(507);
						predicate();
						}
						break;
					case T__13:
						{
						setState(508);
						argumentList();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(513);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(T__13);
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (NumericLiteral - 64)) | (1L << (URIQualifiedName - 64)) | (1L << (BracedURILiteral - 64)) | (1L << (QNAME - 64)) | (1L << (NC_NAME - 64)))) != 0)) {
				{
				setState(515);
				argument();
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(516);
					match(T__0);
					setState(517);
					argument();
					}
					}
					setState(522);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(525);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateListContext extends ParserRuleContext {
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public PredicateListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateList; }
	}

	public final PredicateListContext predicateList() throws RecognitionException {
		PredicateListContext _localctx = new PredicateListContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_predicateList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(527);
					predicate();
					}
					} 
				}
				setState(532);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			match(T__71);
			setState(534);
			expr();
			setState(535);
			match(T__72);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExprContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public VarRefContext varRef() {
			return getRuleContext(VarRefContext.class,0);
		}
		public ParenthesizedExprContext parenthesizedExpr() {
			return getRuleContext(ParenthesizedExprContext.class,0);
		}
		public ContextItemExprContext contextItemExpr() {
			return getRuleContext(ContextItemExprContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionItemExprContext functionItemExpr() {
			return getRuleContext(FunctionItemExprContext.class,0);
		}
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_primaryExpr);
		try {
			setState(543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(537);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(538);
				varRef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(539);
				parenthesizedExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(540);
				contextItemExpr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(541);
				functionCall();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(542);
				functionItemExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarRefContext extends ParserRuleContext {
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public VarRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varRef; }
	}

	public final VarRefContext varRef() throws RecognitionException {
		VarRefContext _localctx = new VarRefContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_varRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(T__1);
			setState(546);
			varName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarNameContext extends ParserRuleContext {
		public EqNameContext eqName() {
			return getRuleContext(EqNameContext.class,0);
		}
		public VarNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varName; }
	}

	public final VarNameContext varName() throws RecognitionException {
		VarNameContext _localctx = new VarNameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_varName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			eqName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NumericLiteral() { return getToken(XPath3Parser.NumericLiteral, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_literal);
		try {
			setState(552);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NumericLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(550);
				match(NumericLiteral);
				}
				break;
			case T__88:
			case T__89:
				enterOuterAlt(_localctx, 2);
				{
				setState(551);
				stringLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParenthesizedExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesizedExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesizedExpr; }
	}

	public final ParenthesizedExprContext parenthesizedExpr() throws RecognitionException {
		ParenthesizedExprContext _localctx = new ParenthesizedExprContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_parenthesizedExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(T__13);
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__73 - 64)) | (1L << (T__76 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (NumericLiteral - 64)) | (1L << (URIQualifiedName - 64)) | (1L << (BracedURILiteral - 64)) | (1L << (QNAME - 64)) | (1L << (NC_NAME - 64)))) != 0)) {
				{
				setState(555);
				expr();
				}
			}

			setState(558);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContextItemExprContext extends ParserRuleContext {
		public ContextItemExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextItemExpr; }
	}

	public final ContextItemExprContext contextItemExpr() throws RecognitionException {
		ContextItemExprContext _localctx = new ContextItemExprContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_contextItemExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			match(T__73);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public EqNameContext eqName() {
			return getRuleContext(EqNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			eqName();
			setState(563);
			argumentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public ExprSingleContext exprSingle() {
			return getRuleContext(ExprSingleContext.class,0);
		}
		public ArgumentPlaceholderContext argumentPlaceholder() {
			return getRuleContext(ArgumentPlaceholderContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_argument);
		try {
			setState(567);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__5:
			case T__7:
			case T__9:
			case T__10:
			case T__12:
			case T__13:
			case T__20:
			case T__21:
			case T__22:
			case T__52:
			case T__53:
			case T__54:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__73:
			case T__76:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
			case T__85:
			case T__86:
			case T__87:
			case T__88:
			case T__89:
			case NumericLiteral:
			case URIQualifiedName:
			case BracedURILiteral:
			case QNAME:
			case NC_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				exprSingle();
				}
				break;
			case T__74:
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				argumentPlaceholder();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentPlaceholderContext extends ParserRuleContext {
		public ArgumentPlaceholderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentPlaceholder; }
	}

	public final ArgumentPlaceholderContext argumentPlaceholder() throws RecognitionException {
		ArgumentPlaceholderContext _localctx = new ArgumentPlaceholderContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_argumentPlaceholder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(T__74);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionItemExprContext extends ParserRuleContext {
		public NamedFunctionRefContext namedFunctionRef() {
			return getRuleContext(NamedFunctionRefContext.class,0);
		}
		public InlineFunctionExprContext inlineFunctionExpr() {
			return getRuleContext(InlineFunctionExprContext.class,0);
		}
		public FunctionItemExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionItemExpr; }
	}

	public final FunctionItemExprContext functionItemExpr() throws RecognitionException {
		FunctionItemExprContext _localctx = new FunctionItemExprContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_functionItemExpr);
		try {
			setState(573);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case URIQualifiedName:
			case QNAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(571);
				namedFunctionRef();
				}
				break;
			case T__76:
				enterOuterAlt(_localctx, 2);
				{
				setState(572);
				inlineFunctionExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedFunctionRefContext extends ParserRuleContext {
		public EqNameContext eqName() {
			return getRuleContext(EqNameContext.class,0);
		}
		public TerminalNode IntegerLiteral() { return getToken(XPath3Parser.IntegerLiteral, 0); }
		public NamedFunctionRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedFunctionRef; }
	}

	public final NamedFunctionRefContext namedFunctionRef() throws RecognitionException {
		NamedFunctionRefContext _localctx = new NamedFunctionRefContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_namedFunctionRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			eqName();
			setState(576);
			match(T__75);
			setState(577);
			match(IntegerLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineFunctionExprContext extends ParserRuleContext {
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public SequenceTypeContext sequenceType() {
			return getRuleContext(SequenceTypeContext.class,0);
		}
		public InlineFunctionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineFunctionExpr; }
	}

	public final InlineFunctionExprContext inlineFunctionExpr() throws RecognitionException {
		InlineFunctionExprContext _localctx = new InlineFunctionExprContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_inlineFunctionExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			match(T__76);
			setState(580);
			match(T__13);
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(581);
				paramList();
				}
			}

			setState(584);
			match(T__14);
			setState(587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__33) {
				{
				setState(585);
				match(T__33);
				setState(586);
				sequenceType();
				}
			}

			setState(589);
			functionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTypeContext extends ParserRuleContext {
		public SimpleTypeNameContext simpleTypeName() {
			return getRuleContext(SimpleTypeNameContext.class,0);
		}
		public SingleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleType; }
	}

	public final SingleTypeContext singleType() throws RecognitionException {
		SingleTypeContext _localctx = new SingleTypeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_singleType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			simpleTypeName();
			setState(593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(592);
				match(T__74);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_declarationContext extends ParserRuleContext {
		public SequenceTypeContext sequenceType() {
			return getRuleContext(SequenceTypeContext.class,0);
		}
		public Type_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_declaration; }
	}

	public final Type_declarationContext type_declaration() throws RecognitionException {
		Type_declarationContext _localctx = new Type_declarationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_type_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(T__33);
			setState(596);
			sequenceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SequenceTypeContext extends ParserRuleContext {
		public ItemTypeContext itemType() {
			return getRuleContext(ItemTypeContext.class,0);
		}
		public OccurenceIndicatorContext occurenceIndicator() {
			return getRuleContext(OccurenceIndicatorContext.class,0);
		}
		public SequenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceType; }
	}

	public final SequenceTypeContext sequenceType() throws RecognitionException {
		SequenceTypeContext _localctx = new SequenceTypeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_sequenceType);
		try {
			setState(605);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__77:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(598);
				match(T__77);
				setState(599);
				match(T__13);
				setState(600);
				match(T__14);
				}
				}
				break;
			case T__13:
			case T__57:
			case T__76:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
			case T__85:
			case T__86:
			case T__87:
			case URIQualifiedName:
			case QNAME:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(601);
				itemType();
				setState(603);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(602);
					occurenceIndicator();
					}
					break;
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OccurenceIndicatorContext extends ParserRuleContext {
		public OccurenceIndicatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_occurenceIndicator; }
	}

	public final OccurenceIndicatorContext occurenceIndicator() throws RecognitionException {
		OccurenceIndicatorContext _localctx = new OccurenceIndicatorContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_occurenceIndicator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			_la = _input.LA(1);
			if ( !(((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (T__20 - 21)) | (1L << (T__22 - 21)) | (1L << (T__74 - 21)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ItemTypeContext extends ParserRuleContext {
		public KindTestContext kindTest() {
			return getRuleContext(KindTestContext.class,0);
		}
		public FunctionTestContext functionTest() {
			return getRuleContext(FunctionTestContext.class,0);
		}
		public AtomicOrUnionTypeContext atomicOrUnionType() {
			return getRuleContext(AtomicOrUnionTypeContext.class,0);
		}
		public ParenthesizedItemTypeContext parenthesizedItemType() {
			return getRuleContext(ParenthesizedItemTypeContext.class,0);
		}
		public ItemTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemType; }
	}

	public final ItemTypeContext itemType() throws RecognitionException {
		ItemTypeContext _localctx = new ItemTypeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_itemType);
		try {
			setState(616);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__57:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
			case T__85:
			case T__86:
			case T__87:
				enterOuterAlt(_localctx, 1);
				{
				setState(609);
				kindTest();
				}
				break;
			case T__78:
				enterOuterAlt(_localctx, 2);
				{
				setState(610);
				match(T__78);
				setState(611);
				match(T__13);
				setState(612);
				match(T__14);
				}
				break;
			case T__76:
				enterOuterAlt(_localctx, 3);
				{
				setState(613);
				functionTest();
				}
				break;
			case URIQualifiedName:
			case QNAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(614);
				atomicOrUnionType();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(615);
				parenthesizedItemType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomicOrUnionTypeContext extends ParserRuleContext {
		public EqNameContext eqName() {
			return getRuleContext(EqNameContext.class,0);
		}
		public AtomicOrUnionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicOrUnionType; }
	}

	public final AtomicOrUnionTypeContext atomicOrUnionType() throws RecognitionException {
		AtomicOrUnionTypeContext _localctx = new AtomicOrUnionTypeContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_atomicOrUnionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			eqName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KindTestContext extends ParserRuleContext {
		public DocumentTestContext documentTest() {
			return getRuleContext(DocumentTestContext.class,0);
		}
		public ElementTestContext elementTest() {
			return getRuleContext(ElementTestContext.class,0);
		}
		public AttributeTestContext attributeTest() {
			return getRuleContext(AttributeTestContext.class,0);
		}
		public SchemaElementTestContext schemaElementTest() {
			return getRuleContext(SchemaElementTestContext.class,0);
		}
		public SchemaAttributeTestContext schemaAttributeTest() {
			return getRuleContext(SchemaAttributeTestContext.class,0);
		}
		public PiTestContext piTest() {
			return getRuleContext(PiTestContext.class,0);
		}
		public CommentTestContext commentTest() {
			return getRuleContext(CommentTestContext.class,0);
		}
		public TextTestContext textTest() {
			return getRuleContext(TextTestContext.class,0);
		}
		public NamespaceNodeTestContext namespaceNodeTest() {
			return getRuleContext(NamespaceNodeTestContext.class,0);
		}
		public AnyKindTestContext anyKindTest() {
			return getRuleContext(AnyKindTestContext.class,0);
		}
		public KindTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kindTest; }
	}

	public final KindTestContext kindTest() throws RecognitionException {
		KindTestContext _localctx = new KindTestContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_kindTest);
		try {
			setState(630);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__80:
				enterOuterAlt(_localctx, 1);
				{
				setState(620);
				documentTest();
				}
				break;
			case T__86:
				enterOuterAlt(_localctx, 2);
				{
				setState(621);
				elementTest();
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 3);
				{
				setState(622);
				attributeTest();
				}
				break;
			case T__87:
				enterOuterAlt(_localctx, 4);
				{
				setState(623);
				schemaElementTest();
				}
				break;
			case T__85:
				enterOuterAlt(_localctx, 5);
				{
				setState(624);
				schemaAttributeTest();
				}
				break;
			case T__84:
				enterOuterAlt(_localctx, 6);
				{
				setState(625);
				piTest();
				}
				break;
			case T__82:
				enterOuterAlt(_localctx, 7);
				{
				setState(626);
				commentTest();
				}
				break;
			case T__81:
				enterOuterAlt(_localctx, 8);
				{
				setState(627);
				textTest();
				}
				break;
			case T__83:
				enterOuterAlt(_localctx, 9);
				{
				setState(628);
				namespaceNodeTest();
				}
				break;
			case T__79:
				enterOuterAlt(_localctx, 10);
				{
				setState(629);
				anyKindTest();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnyKindTestContext extends ParserRuleContext {
		public AnyKindTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyKindTest; }
	}

	public final AnyKindTestContext anyKindTest() throws RecognitionException {
		AnyKindTestContext _localctx = new AnyKindTestContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_anyKindTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			match(T__79);
			setState(633);
			match(T__13);
			setState(634);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DocumentTestContext extends ParserRuleContext {
		public ElementTestContext elementTest() {
			return getRuleContext(ElementTestContext.class,0);
		}
		public SchemaElementTestContext schemaElementTest() {
			return getRuleContext(SchemaElementTestContext.class,0);
		}
		public DocumentTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_documentTest; }
	}

	public final DocumentTestContext documentTest() throws RecognitionException {
		DocumentTestContext _localctx = new DocumentTestContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_documentTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			match(T__80);
			setState(637);
			match(T__13);
			setState(640);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__86:
				{
				setState(638);
				elementTest();
				}
				break;
			case T__87:
				{
				setState(639);
				schemaElementTest();
				}
				break;
			case T__14:
				break;
			default:
				break;
			}
			setState(642);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextTestContext extends ParserRuleContext {
		public TextTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textTest; }
	}

	public final TextTestContext textTest() throws RecognitionException {
		TextTestContext _localctx = new TextTestContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_textTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			match(T__81);
			setState(645);
			match(T__13);
			setState(646);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentTestContext extends ParserRuleContext {
		public CommentTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentTest; }
	}

	public final CommentTestContext commentTest() throws RecognitionException {
		CommentTestContext _localctx = new CommentTestContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_commentTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			match(T__82);
			setState(649);
			match(T__13);
			setState(650);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceNodeTestContext extends ParserRuleContext {
		public NamespaceNodeTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceNodeTest; }
	}

	public final NamespaceNodeTestContext namespaceNodeTest() throws RecognitionException {
		NamespaceNodeTestContext _localctx = new NamespaceNodeTestContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_namespaceNodeTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			match(T__83);
			setState(653);
			match(T__13);
			setState(654);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PiTestContext extends ParserRuleContext {
		public TerminalNode NC_NAME() { return getToken(XPath3Parser.NC_NAME, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public PiTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_piTest; }
	}

	public final PiTestContext piTest() throws RecognitionException {
		PiTestContext _localctx = new PiTestContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_piTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			match(T__84);
			setState(657);
			match(T__13);
			setState(660);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NC_NAME:
				{
				setState(658);
				match(NC_NAME);
				}
				break;
			case T__88:
			case T__89:
				{
				setState(659);
				stringLiteral();
				}
				break;
			case T__14:
				break;
			default:
				break;
			}
			setState(662);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeTestContext extends ParserRuleContext {
		public AttribNameOrWildcardContext attribNameOrWildcard() {
			return getRuleContext(AttribNameOrWildcardContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public AttributeTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeTest; }
	}

	public final AttributeTestContext attributeTest() throws RecognitionException {
		AttributeTestContext _localctx = new AttributeTestContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_attributeTest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			match(T__57);
			setState(665);
			match(T__13);
			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22 || _la==URIQualifiedName || _la==QNAME) {
				{
				setState(666);
				attribNameOrWildcard();
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(667);
					match(T__0);
					setState(668);
					typeName();
					}
				}

				}
			}

			setState(673);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttribNameOrWildcardContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public AttribNameOrWildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribNameOrWildcard; }
	}

	public final AttribNameOrWildcardContext attribNameOrWildcard() throws RecognitionException {
		AttribNameOrWildcardContext _localctx = new AttribNameOrWildcardContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_attribNameOrWildcard);
		try {
			setState(677);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case URIQualifiedName:
			case QNAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(675);
				attributeName();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(676);
				match(T__22);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SchemaAttributeTestContext extends ParserRuleContext {
		public AttributeDeclarationContext attributeDeclaration() {
			return getRuleContext(AttributeDeclarationContext.class,0);
		}
		public SchemaAttributeTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaAttributeTest; }
	}

	public final SchemaAttributeTestContext schemaAttributeTest() throws RecognitionException {
		SchemaAttributeTestContext _localctx = new SchemaAttributeTestContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_schemaAttributeTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			match(T__85);
			setState(680);
			match(T__13);
			setState(681);
			attributeDeclaration();
			setState(682);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeDeclarationContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public AttributeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeDeclaration; }
	}

	public final AttributeDeclarationContext attributeDeclaration() throws RecognitionException {
		AttributeDeclarationContext _localctx = new AttributeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_attributeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			attributeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementTestContext extends ParserRuleContext {
		public ElementNameOrWildcardContext elementNameOrWildcard() {
			return getRuleContext(ElementNameOrWildcardContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ElementTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementTest; }
	}

	public final ElementTestContext elementTest() throws RecognitionException {
		ElementTestContext _localctx = new ElementTestContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_elementTest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(T__86);
			setState(687);
			match(T__13);
			setState(696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22 || _la==URIQualifiedName || _la==QNAME) {
				{
				setState(688);
				elementNameOrWildcard();
				setState(694);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(689);
					match(T__0);
					setState(690);
					typeName();
					setState(692);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__74) {
						{
						setState(691);
						match(T__74);
						}
					}

					}
				}

				}
			}

			setState(698);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementNameOrWildcardContext extends ParserRuleContext {
		public ElementNameContext elementName() {
			return getRuleContext(ElementNameContext.class,0);
		}
		public ElementNameOrWildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementNameOrWildcard; }
	}

	public final ElementNameOrWildcardContext elementNameOrWildcard() throws RecognitionException {
		ElementNameOrWildcardContext _localctx = new ElementNameOrWildcardContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_elementNameOrWildcard);
		try {
			setState(702);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case URIQualifiedName:
			case QNAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(700);
				elementName();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(701);
				match(T__22);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SchemaElementTestContext extends ParserRuleContext {
		public ElementDeclarationContext elementDeclaration() {
			return getRuleContext(ElementDeclarationContext.class,0);
		}
		public SchemaElementTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaElementTest; }
	}

	public final SchemaElementTestContext schemaElementTest() throws RecognitionException {
		SchemaElementTestContext _localctx = new SchemaElementTestContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_schemaElementTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			match(T__87);
			setState(705);
			match(T__13);
			setState(706);
			elementDeclaration();
			setState(707);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementDeclarationContext extends ParserRuleContext {
		public ElementNameContext elementName() {
			return getRuleContext(ElementNameContext.class,0);
		}
		public ElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementDeclaration; }
	}

	public final ElementDeclarationContext elementDeclaration() throws RecognitionException {
		ElementDeclarationContext _localctx = new ElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_elementDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			elementName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeNameContext extends ParserRuleContext {
		public EqNameContext eqName() {
			return getRuleContext(EqNameContext.class,0);
		}
		public AttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeName; }
	}

	public final AttributeNameContext attributeName() throws RecognitionException {
		AttributeNameContext _localctx = new AttributeNameContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_attributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			eqName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementNameContext extends ParserRuleContext {
		public EqNameContext eqName() {
			return getRuleContext(EqNameContext.class,0);
		}
		public ElementNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementName; }
	}

	public final ElementNameContext elementName() throws RecognitionException {
		ElementNameContext _localctx = new ElementNameContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_elementName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			eqName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTypeNameContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public SimpleTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeName; }
	}

	public final SimpleTypeNameContext simpleTypeName() throws RecognitionException {
		SimpleTypeNameContext _localctx = new SimpleTypeNameContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_simpleTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			typeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode QNAME() { return getToken(XPath3Parser.QNAME, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			match(QNAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTestContext extends ParserRuleContext {
		public AnyFunctionTestContext anyFunctionTest() {
			return getRuleContext(AnyFunctionTestContext.class,0);
		}
		public TypedFunctionTestContext typedFunctionTest() {
			return getRuleContext(TypedFunctionTestContext.class,0);
		}
		public FunctionTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTest; }
	}

	public final FunctionTestContext functionTest() throws RecognitionException {
		FunctionTestContext _localctx = new FunctionTestContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_functionTest);
		try {
			setState(721);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(719);
				anyFunctionTest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(720);
				typedFunctionTest();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnyFunctionTestContext extends ParserRuleContext {
		public AnyFunctionTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyFunctionTest; }
	}

	public final AnyFunctionTestContext anyFunctionTest() throws RecognitionException {
		AnyFunctionTestContext _localctx = new AnyFunctionTestContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_anyFunctionTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			match(T__76);
			setState(724);
			match(T__13);
			setState(725);
			match(T__22);
			setState(726);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedFunctionTestContext extends ParserRuleContext {
		public List<SequenceTypeContext> sequenceType() {
			return getRuleContexts(SequenceTypeContext.class);
		}
		public SequenceTypeContext sequenceType(int i) {
			return getRuleContext(SequenceTypeContext.class,i);
		}
		public TypedFunctionTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedFunctionTest; }
	}

	public final TypedFunctionTestContext typedFunctionTest() throws RecognitionException {
		TypedFunctionTestContext _localctx = new TypedFunctionTestContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_typedFunctionTest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			match(T__76);
			setState(729);
			match(T__13);
			setState(738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__57 || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (T__76 - 77)) | (1L << (T__77 - 77)) | (1L << (T__78 - 77)) | (1L << (T__79 - 77)) | (1L << (T__80 - 77)) | (1L << (T__81 - 77)) | (1L << (T__82 - 77)) | (1L << (T__83 - 77)) | (1L << (T__84 - 77)) | (1L << (T__85 - 77)) | (1L << (T__86 - 77)) | (1L << (T__87 - 77)) | (1L << (URIQualifiedName - 77)) | (1L << (QNAME - 77)))) != 0)) {
				{
				setState(730);
				sequenceType();
				setState(735);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(731);
					match(T__0);
					setState(732);
					sequenceType();
					}
					}
					setState(737);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(740);
			match(T__14);
			setState(741);
			match(T__33);
			setState(742);
			sequenceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParenthesizedItemTypeContext extends ParserRuleContext {
		public ItemTypeContext itemType() {
			return getRuleContext(ItemTypeContext.class,0);
		}
		public ParenthesizedItemTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesizedItemType; }
	}

	public final ParenthesizedItemTypeContext parenthesizedItemType() throws RecognitionException {
		ParenthesizedItemTypeContext _localctx = new ParenthesizedItemTypeContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_parenthesizedItemType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			match(T__13);
			setState(745);
			itemType();
			setState(746);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqNameContext extends ParserRuleContext {
		public TerminalNode QNAME() { return getToken(XPath3Parser.QNAME, 0); }
		public TerminalNode URIQualifiedName() { return getToken(XPath3Parser.URIQualifiedName, 0); }
		public EqNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqName; }
	}

	public final EqNameContext eqName() throws RecognitionException {
		EqNameContext _localctx = new EqNameContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_eqName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			_la = _input.LA(1);
			if ( !(_la==URIQualifiedName || _la==QNAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> ESCAPE_QUOTE() { return getTokens(XPath3Parser.ESCAPE_QUOTE); }
		public TerminalNode ESCAPE_QUOTE(int i) {
			return getToken(XPath3Parser.ESCAPE_QUOTE, i);
		}
		public List<TerminalNode> ESCAPE_APOS() { return getTokens(XPath3Parser.ESCAPE_APOS); }
		public TerminalNode ESCAPE_APOS(int i) {
			return getToken(XPath3Parser.ESCAPE_APOS, i);
		}
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_stringLiteral);
		try {
			int _alt;
			setState(768);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__88:
				enterOuterAlt(_localctx, 1);
				{
				setState(750);
				match(T__88);
				setState(755);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						setState(753);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
						case 1:
							{
							setState(751);
							match(ESCAPE_QUOTE);
							}
							break;
						case 2:
							{
							setState(752);
							matchWildcard();
							}
							break;
						}
						} 
					}
					setState(757);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				}
				setState(758);
				match(T__88);
				}
				break;
			case T__89:
				enterOuterAlt(_localctx, 2);
				{
				setState(759);
				match(T__89);
				setState(764);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						setState(762);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
						case 1:
							{
							setState(760);
							match(ESCAPE_APOS);
							}
							break;
						case 2:
							{
							setState(761);
							matchWildcard();
							}
							break;
						}
						} 
					}
					setState(766);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				}
				setState(767);
				match(T__89);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return forBindingList_sempred((ForBindingListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean forBindingList_sempred(ForBindingListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3n\u0305\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\7\3\u00c5\n\3\f\3\16\3\u00c8\13\3\3\4\3\4\3\4\5"+
		"\4\u00cd\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7\u00d8\n\7\f\7\16"+
		"\7\u00db\13\7\3\b\3\b\3\b\3\b\3\b\5\b\u00e2\n\b\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\7\n\u00ec\n\n\f\n\16\n\u00ef\13\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\7\13\u00f7\n\13\f\13\16\13\u00fa\13\13\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u0109\n\16\f\16\16\16\u010c\13\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\7\20\u011e\n\20\f\20\16\20\u0121\13\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\7\22\u0132\n\22"+
		"\f\22\16\22\u0135\13\22\3\23\3\23\3\23\3\23\5\23\u013b\n\23\3\23\3\23"+
		"\5\23\u013f\n\23\3\24\3\24\3\24\7\24\u0144\n\24\f\24\16\24\u0147\13\24"+
		"\3\25\3\25\3\25\5\25\u014c\n\25\3\26\3\26\3\26\7\26\u0151\n\26\f\26\16"+
		"\26\u0154\13\26\3\27\3\27\3\27\7\27\u0159\n\27\f\27\16\27\u015c\13\27"+
		"\3\30\3\30\3\30\7\30\u0161\n\30\f\30\16\30\u0164\13\30\3\31\3\31\3\31"+
		"\7\31\u0169\n\31\f\31\16\31\u016c\13\31\3\32\3\32\3\32\3\32\5\32\u0172"+
		"\n\32\3\33\3\33\3\33\3\33\5\33\u0178\n\33\3\34\3\34\3\34\3\34\5\34\u017e"+
		"\n\34\3\35\3\35\3\35\3\35\5\35\u0184\n\35\3\36\7\36\u0187\n\36\f\36\16"+
		"\36\u018a\13\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\7#\u0199"+
		"\n#\f#\16#\u019c\13#\3$\3$\5$\u01a0\n$\3$\3$\3$\5$\u01a5\n$\3%\3%\3%\7"+
		"%\u01aa\n%\f%\16%\u01ad\13%\3&\3&\5&\u01b1\n&\3\'\3\'\5\'\u01b5\n\'\3"+
		"\'\3\'\3(\3(\3(\3(\5(\u01bd\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\5)\u01cf\n)\3*\5*\u01d2\n*\3*\3*\3+\3+\3+\3+\5+\u01da\n+\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u01e6\n,\3-\3-\3.\3.\5.\u01ec\n.\3/\3/"+
		"\5/\u01f0\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u01fb\n"+
		"\60\3\61\3\61\3\61\7\61\u0200\n\61\f\61\16\61\u0203\13\61\3\62\3\62\3"+
		"\62\3\62\7\62\u0209\n\62\f\62\16\62\u020c\13\62\5\62\u020e\n\62\3\62\3"+
		"\62\3\63\7\63\u0213\n\63\f\63\16\63\u0216\13\63\3\64\3\64\3\64\3\64\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\5\65\u0222\n\65\3\66\3\66\3\66\3\67\3\67"+
		"\38\38\58\u022b\n8\39\39\59\u022f\n9\39\39\3:\3:\3;\3;\3;\3<\3<\5<\u023a"+
		"\n<\3=\3=\3>\3>\5>\u0240\n>\3?\3?\3?\3?\3@\3@\3@\5@\u0249\n@\3@\3@\3@"+
		"\5@\u024e\n@\3@\3@\3A\3A\5A\u0254\nA\3B\3B\3B\3C\3C\3C\3C\3C\5C\u025e"+
		"\nC\5C\u0260\nC\3D\3D\3E\3E\3E\3E\3E\3E\3E\5E\u026b\nE\3F\3F\3G\3G\3G"+
		"\3G\3G\3G\3G\3G\3G\3G\5G\u0279\nG\3H\3H\3H\3H\3I\3I\3I\3I\5I\u0283\nI"+
		"\3I\3I\3J\3J\3J\3J\3K\3K\3K\3K\3L\3L\3L\3L\3M\3M\3M\3M\5M\u0297\nM\3M"+
		"\3M\3N\3N\3N\3N\3N\5N\u02a0\nN\5N\u02a2\nN\3N\3N\3O\3O\5O\u02a8\nO\3P"+
		"\3P\3P\3P\3P\3Q\3Q\3R\3R\3R\3R\3R\3R\5R\u02b7\nR\5R\u02b9\nR\5R\u02bb"+
		"\nR\3R\3R\3S\3S\5S\u02c1\nS\3T\3T\3T\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y"+
		"\3Y\3Z\3Z\5Z\u02d4\nZ\3[\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\7\\\u02e0\n\\"+
		"\f\\\16\\\u02e3\13\\\5\\\u02e5\n\\\3\\\3\\\3\\\3\\\3]\3]\3]\3]\3^\3^\3"+
		"_\3_\3_\7_\u02f4\n_\f_\16_\u02f7\13_\3_\3_\3_\3_\7_\u02fd\n_\f_\16_\u0300"+
		"\13_\3_\5_\u0303\n_\3_\4\u02f5\u02fe\3\24`\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096"+
		"\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae"+
		"\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\2\r\3\2\f\r\3\2\27\30\3\2\31"+
		"\34\3\2\35\36\3\2\37 \3\2\',\3\2-\62\3\2\63\65\3\2\678\5\2\27\27\31\31"+
		"MM\4\2ccgg\2\u030d\2\u00be\3\2\2\2\4\u00c1\3\2\2\2\6\u00c9\3\2\2\2\b\u00ce"+
		"\3\2\2\2\n\u00d0\3\2\2\2\f\u00d4\3\2\2\2\16\u00e1\3\2\2\2\20\u00e3\3\2"+
		"\2\2\22\u00e7\3\2\2\2\24\u00f0\3\2\2\2\26\u00fb\3\2\2\2\30\u0100\3\2\2"+
		"\2\32\u0104\3\2\2\2\34\u010d\3\2\2\2\36\u0112\3\2\2\2 \u0125\3\2\2\2\""+
		"\u012e\3\2\2\2$\u0136\3\2\2\2&\u0140\3\2\2\2(\u0148\3\2\2\2*\u014d\3\2"+
		"\2\2,\u0155\3\2\2\2.\u015d\3\2\2\2\60\u0165\3\2\2\2\62\u016d\3\2\2\2\64"+
		"\u0173\3\2\2\2\66\u0179\3\2\2\28\u017f\3\2\2\2:\u0188\3\2\2\2<\u018d\3"+
		"\2\2\2>\u018f\3\2\2\2@\u0191\3\2\2\2B\u0193\3\2\2\2D\u0195\3\2\2\2F\u01a4"+
		"\3\2\2\2H\u01a6\3\2\2\2J\u01b0\3\2\2\2L\u01b4\3\2\2\2N\u01bc\3\2\2\2P"+
		"\u01ce\3\2\2\2R\u01d1\3\2\2\2T\u01d9\3\2\2\2V\u01e5\3\2\2\2X\u01e7\3\2"+
		"\2\2Z\u01eb\3\2\2\2\\\u01ef\3\2\2\2^\u01fa\3\2\2\2`\u01fc\3\2\2\2b\u0204"+
		"\3\2\2\2d\u0214\3\2\2\2f\u0217\3\2\2\2h\u0221\3\2\2\2j\u0223\3\2\2\2l"+
		"\u0226\3\2\2\2n\u022a\3\2\2\2p\u022c\3\2\2\2r\u0232\3\2\2\2t\u0234\3\2"+
		"\2\2v\u0239\3\2\2\2x\u023b\3\2\2\2z\u023f\3\2\2\2|\u0241\3\2\2\2~\u0245"+
		"\3\2\2\2\u0080\u0251\3\2\2\2\u0082\u0255\3\2\2\2\u0084\u025f\3\2\2\2\u0086"+
		"\u0261\3\2\2\2\u0088\u026a\3\2\2\2\u008a\u026c\3\2\2\2\u008c\u0278\3\2"+
		"\2\2\u008e\u027a\3\2\2\2\u0090\u027e\3\2\2\2\u0092\u0286\3\2\2\2\u0094"+
		"\u028a\3\2\2\2\u0096\u028e\3\2\2\2\u0098\u0292\3\2\2\2\u009a\u029a\3\2"+
		"\2\2\u009c\u02a7\3\2\2\2\u009e\u02a9\3\2\2\2\u00a0\u02ae\3\2\2\2\u00a2"+
		"\u02b0\3\2\2\2\u00a4\u02c0\3\2\2\2\u00a6\u02c2\3\2\2\2\u00a8\u02c7\3\2"+
		"\2\2\u00aa\u02c9\3\2\2\2\u00ac\u02cb\3\2\2\2\u00ae\u02cd\3\2\2\2\u00b0"+
		"\u02cf\3\2\2\2\u00b2\u02d3\3\2\2\2\u00b4\u02d5\3\2\2\2\u00b6\u02da\3\2"+
		"\2\2\u00b8\u02ea\3\2\2\2\u00ba\u02ee\3\2\2\2\u00bc\u0302\3\2\2\2\u00be"+
		"\u00bf\5\f\7\2\u00bf\u00c0\7\2\2\3\u00c0\3\3\2\2\2\u00c1\u00c6\5\6\4\2"+
		"\u00c2\u00c3\7\3\2\2\u00c3\u00c5\5\6\4\2\u00c4\u00c2\3\2\2\2\u00c5\u00c8"+
		"\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\5\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c9\u00ca\7\4\2\2\u00ca\u00cc\5\u00ba^\2\u00cb\u00cd"+
		"\5\u0082B\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\7\3\2\2\2\u00ce"+
		"\u00cf\5\n\6\2\u00cf\t\3\2\2\2\u00d0\u00d1\7\5\2\2\u00d1\u00d2\5\f\7\2"+
		"\u00d2\u00d3\7\6\2\2\u00d3\13\3\2\2\2\u00d4\u00d9\5\16\b\2\u00d5\u00d6"+
		"\7\3\2\2\u00d6\u00d8\5\16\b\2\u00d7\u00d5\3\2\2\2\u00d8\u00db\3\2\2\2"+
		"\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\r\3\2\2\2\u00db\u00d9\3"+
		"\2\2\2\u00dc\u00e2\5\20\t\2\u00dd\u00e2\5\30\r\2\u00de\u00e2\5\36\20\2"+
		"\u00df\u00e2\5 \21\2\u00e0\u00e2\5\"\22\2\u00e1\u00dc\3\2\2\2\u00e1\u00dd"+
		"\3\2\2\2\u00e1\u00de\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2"+
		"\17\3\2\2\2\u00e3\u00e4\5\22\n\2\u00e4\u00e5\7\7\2\2\u00e5\u00e6\5\16"+
		"\b\2\u00e6\21\3\2\2\2\u00e7\u00e8\7\b\2\2\u00e8\u00ed\5\26\f\2\u00e9\u00ea"+
		"\7\3\2\2\u00ea\u00ec\5\26\f\2\u00eb\u00e9\3\2\2\2\u00ec\u00ef\3\2\2\2"+
		"\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\23\3\2\2\2\u00ef\u00ed"+
		"\3\2\2\2\u00f0\u00f1\b\13\1\2\u00f1\u00f2\5\26\f\2\u00f2\u00f8\3\2\2\2"+
		"\u00f3\u00f4\f\3\2\2\u00f4\u00f5\7\3\2\2\u00f5\u00f7\5\26\f\2\u00f6\u00f3"+
		"\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\25\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\7\4\2\2\u00fc\u00fd\5l\67"+
		"\2\u00fd\u00fe\7\t\2\2\u00fe\u00ff\5\16\b\2\u00ff\27\3\2\2\2\u0100\u0101"+
		"\5\32\16\2\u0101\u0102\7\7\2\2\u0102\u0103\5\16\b\2\u0103\31\3\2\2\2\u0104"+
		"\u0105\7\n\2\2\u0105\u010a\5\34\17\2\u0106\u0107\7\3\2\2\u0107\u0109\5"+
		"\34\17\2\u0108\u0106\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\33\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\7\4\2"+
		"\2\u010e\u010f\5l\67\2\u010f\u0110\7\13\2\2\u0110\u0111\5\16\b\2\u0111"+
		"\35\3\2\2\2\u0112\u0113\t\2\2\2\u0113\u0114\7\4\2\2\u0114\u0115\5l\67"+
		"\2\u0115\u0116\7\t\2\2\u0116\u011f\5\16\b\2\u0117\u0118\7\3\2\2\u0118"+
		"\u0119\7\4\2\2\u0119\u011a\5l\67\2\u011a\u011b\7\t\2\2\u011b\u011c\5\16"+
		"\b\2\u011c\u011e\3\2\2\2\u011d\u0117\3\2\2\2\u011e\u0121\3\2\2\2\u011f"+
		"\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u011f\3\2"+
		"\2\2\u0122\u0123\7\16\2\2\u0123\u0124\5\16\b\2\u0124\37\3\2\2\2\u0125"+
		"\u0126\7\17\2\2\u0126\u0127\7\20\2\2\u0127\u0128\5\f\7\2\u0128\u0129\7"+
		"\21\2\2\u0129\u012a\7\22\2\2\u012a\u012b\5\16\b\2\u012b\u012c\7\23\2\2"+
		"\u012c\u012d\5\16\b\2\u012d!\3\2\2\2\u012e\u0133\5$\23\2\u012f\u0130\7"+
		"\24\2\2\u0130\u0132\5$\23\2\u0131\u012f\3\2\2\2\u0132\u0135\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134#\3\2\2\2\u0135\u0133\3\2\2\2"+
		"\u0136\u013e\5&\24\2\u0137\u013b\5@!\2\u0138\u013b\5> \2\u0139\u013b\5"+
		"B\"\2\u013a\u0137\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u0139\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u013d\5&\24\2\u013d\u013f\3\2\2\2\u013e\u013a\3\2"+
		"\2\2\u013e\u013f\3\2\2\2\u013f%\3\2\2\2\u0140\u0145\5(\25\2\u0141\u0142"+
		"\7\25\2\2\u0142\u0144\5(\25\2\u0143\u0141\3\2\2\2\u0144\u0147\3\2\2\2"+
		"\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\'\3\2\2\2\u0147\u0145\3"+
		"\2\2\2\u0148\u014b\5*\26\2\u0149\u014a\7\26\2\2\u014a\u014c\5*\26\2\u014b"+
		"\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c)\3\2\2\2\u014d\u0152\5,\27\2"+
		"\u014e\u014f\t\3\2\2\u014f\u0151\5,\27\2\u0150\u014e\3\2\2\2\u0151\u0154"+
		"\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153+\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0155\u015a\5.\30\2\u0156\u0157\t\4\2\2\u0157\u0159\5."+
		"\30\2\u0158\u0156\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a"+
		"\u015b\3\2\2\2\u015b-\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u0162\5\60\31"+
		"\2\u015e\u015f\t\5\2\2\u015f\u0161\5\60\31\2\u0160\u015e\3\2\2\2\u0161"+
		"\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163/\3\2\2\2"+
		"\u0164\u0162\3\2\2\2\u0165\u016a\5\62\32\2\u0166\u0167\t\6\2\2\u0167\u0169"+
		"\5\62\32\2\u0168\u0166\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2"+
		"\u016a\u016b\3\2\2\2\u016b\61\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u0171"+
		"\5\64\33\2\u016e\u016f\7!\2\2\u016f\u0170\7\"\2\2\u0170\u0172\5\u0084"+
		"C\2\u0171\u016e\3\2\2\2\u0171\u0172\3\2\2\2\u0172\63\3\2\2\2\u0173\u0177"+
		"\5\66\34\2\u0174\u0175\7#\2\2\u0175\u0176\7$\2\2\u0176\u0178\5\u0084C"+
		"\2\u0177\u0174\3\2\2\2\u0177\u0178\3\2\2\2\u0178\65\3\2\2\2\u0179\u017d"+
		"\58\35\2\u017a\u017b\7%\2\2\u017b\u017c\7$\2\2\u017c\u017e\5\u0080A\2"+
		"\u017d\u017a\3\2\2\2\u017d\u017e\3\2\2\2\u017e\67\3\2\2\2\u017f\u0183"+
		"\5:\36\2\u0180\u0181\7&\2\2\u0181\u0182\7$\2\2\u0182\u0184\5\u0080A\2"+
		"\u0183\u0180\3\2\2\2\u0183\u0184\3\2\2\2\u01849\3\2\2\2\u0185\u0187\t"+
		"\3\2\2\u0186\u0185\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u018b\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u018c\5<"+
		"\37\2\u018c;\3\2\2\2\u018d\u018e\5D#\2\u018e=\3\2\2\2\u018f\u0190\t\7"+
		"\2\2\u0190?\3\2\2\2\u0191\u0192\t\b\2\2\u0192A\3\2\2\2\u0193\u0194\t\t"+
		"\2\2\u0194C\3\2\2\2\u0195\u019a\5F$\2\u0196\u0197\7\66\2\2\u0197\u0199"+
		"\5F$\2\u0198\u0196\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a"+
		"\u019b\3\2\2\2\u019bE\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u019f\7\67\2\2"+
		"\u019e\u01a0\5H%\2\u019f\u019e\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a5"+
		"\3\2\2\2\u01a1\u01a2\78\2\2\u01a2\u01a5\5H%\2\u01a3\u01a5\5H%\2\u01a4"+
		"\u019d\3\2\2\2\u01a4\u01a1\3\2\2\2\u01a4\u01a3\3\2\2\2\u01a5G\3\2\2\2"+
		"\u01a6\u01ab\5J&\2\u01a7\u01a8\t\n\2\2\u01a8\u01aa\5J&\2\u01a9\u01a7\3"+
		"\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"I\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01b1\5`\61\2\u01af\u01b1\5L\'\2\u01b0"+
		"\u01ae\3\2\2\2\u01b0\u01af\3\2\2\2\u01b1K\3\2\2\2\u01b2\u01b5\5T+\2\u01b3"+
		"\u01b5\5N(\2\u01b4\u01b2\3\2\2\2\u01b4\u01b3\3\2\2\2\u01b5\u01b6\3\2\2"+
		"\2\u01b6\u01b7\5d\63\2\u01b7M\3\2\2\2\u01b8\u01b9\5P)\2\u01b9\u01ba\5"+
		"Z.\2\u01ba\u01bd\3\2\2\2\u01bb\u01bd\5R*\2\u01bc\u01b8\3\2\2\2\u01bc\u01bb"+
		"\3\2\2\2\u01bdO\3\2\2\2\u01be\u01bf\79\2\2\u01bf\u01cf\7:\2\2\u01c0\u01c1"+
		"\7;\2\2\u01c1\u01cf\7:\2\2\u01c2\u01c3\7<\2\2\u01c3\u01cf\7:\2\2\u01c4"+
		"\u01c5\7=\2\2\u01c5\u01cf\7:\2\2\u01c6\u01c7\7>\2\2\u01c7\u01cf\7:\2\2"+
		"\u01c8\u01c9\7?\2\2\u01c9\u01cf\7:\2\2\u01ca\u01cb\7@\2\2\u01cb\u01cf"+
		"\7:\2\2\u01cc\u01cd\7A\2\2\u01cd\u01cf\7:\2\2\u01ce\u01be\3\2\2\2\u01ce"+
		"\u01c0\3\2\2\2\u01ce\u01c2\3\2\2\2\u01ce\u01c4\3\2\2\2\u01ce\u01c6\3\2"+
		"\2\2\u01ce\u01c8\3\2\2\2\u01ce\u01ca\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf"+
		"Q\3\2\2\2\u01d0\u01d2\7B\2\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2"+
		"\u01d3\3\2\2\2\u01d3\u01d4\5Z.\2\u01d4S\3\2\2\2\u01d5\u01d6\5V,\2\u01d6"+
		"\u01d7\5Z.\2\u01d7\u01da\3\2\2\2\u01d8\u01da\5X-\2\u01d9\u01d5\3\2\2\2"+
		"\u01d9\u01d8\3\2\2\2\u01daU\3\2\2\2\u01db\u01dc\7C\2\2\u01dc\u01e6\7:"+
		"\2\2\u01dd\u01de\7D\2\2\u01de\u01e6\7:\2\2\u01df\u01e0\7E\2\2\u01e0\u01e6"+
		"\7:\2\2\u01e1\u01e2\7F\2\2\u01e2\u01e6\7:\2\2\u01e3\u01e4\7G\2\2\u01e4"+
		"\u01e6\7:\2\2\u01e5\u01db\3\2\2\2\u01e5\u01dd\3\2\2\2\u01e5\u01df\3\2"+
		"\2\2\u01e5\u01e1\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6W\3\2\2\2\u01e7\u01e8"+
		"\7H\2\2\u01e8Y\3\2\2\2\u01e9\u01ec\5\u008cG\2\u01ea\u01ec\5\\/\2\u01eb"+
		"\u01e9\3\2\2\2\u01eb\u01ea\3\2\2\2\u01ec[\3\2\2\2\u01ed\u01f0\5\u00ba"+
		"^\2\u01ee\u01f0\5^\60\2\u01ef\u01ed\3\2\2\2\u01ef\u01ee\3\2\2\2\u01f0"+
		"]\3\2\2\2\u01f1\u01fb\7\31\2\2\u01f2\u01f3\7l\2\2\u01f3\u01f4\7I\2\2\u01f4"+
		"\u01fb\7\31\2\2\u01f5\u01f6\7\31\2\2\u01f6\u01f7\7I\2\2\u01f7\u01fb\7"+
		"l\2\2\u01f8\u01f9\7e\2\2\u01f9\u01fb\7\31\2\2\u01fa\u01f1\3\2\2\2\u01fa"+
		"\u01f2\3\2\2\2\u01fa\u01f5\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fb_\3\2\2\2"+
		"\u01fc\u0201\5h\65\2\u01fd\u0200\5f\64\2\u01fe\u0200\5b\62\2\u01ff\u01fd"+
		"\3\2\2\2\u01ff\u01fe\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff\3\2\2\2\u0201"+
		"\u0202\3\2\2\2\u0202a\3\2\2\2\u0203\u0201\3\2\2\2\u0204\u020d\7\20\2\2"+
		"\u0205\u020a\5v<\2\u0206\u0207\7\3\2\2\u0207\u0209\5v<\2\u0208\u0206\3"+
		"\2\2\2\u0209\u020c\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b"+
		"\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020d\u0205\3\2\2\2\u020d\u020e\3\2"+
		"\2\2\u020e\u020f\3\2\2\2\u020f\u0210\7\21\2\2\u0210c\3\2\2\2\u0211\u0213"+
		"\5f\64\2\u0212\u0211\3\2\2\2\u0213\u0216\3\2\2\2\u0214\u0212\3\2\2\2\u0214"+
		"\u0215\3\2\2\2\u0215e\3\2\2\2\u0216\u0214\3\2\2\2\u0217\u0218\7J\2\2\u0218"+
		"\u0219\5\f\7\2\u0219\u021a\7K\2\2\u021ag\3\2\2\2\u021b\u0222\5n8\2\u021c"+
		"\u0222\5j\66\2\u021d\u0222\5p9\2\u021e\u0222\5r:\2\u021f\u0222\5t;\2\u0220"+
		"\u0222\5z>\2\u0221\u021b\3\2\2\2\u0221\u021c\3\2\2\2\u0221\u021d\3\2\2"+
		"\2\u0221\u021e\3\2\2\2\u0221\u021f\3\2\2\2\u0221\u0220\3\2\2\2\u0222i"+
		"\3\2\2\2\u0223\u0224\7\4\2\2\u0224\u0225\5l\67\2\u0225k\3\2\2\2\u0226"+
		"\u0227\5\u00ba^\2\u0227m\3\2\2\2\u0228\u022b\7]\2\2\u0229\u022b\5\u00bc"+
		"_\2\u022a\u0228\3\2\2\2\u022a\u0229\3\2\2\2\u022bo\3\2\2\2\u022c\u022e"+
		"\7\20\2\2\u022d\u022f\5\f\7\2\u022e\u022d\3\2\2\2\u022e\u022f\3\2\2\2"+
		"\u022f\u0230\3\2\2\2\u0230\u0231\7\21\2\2\u0231q\3\2\2\2\u0232\u0233\7"+
		"L\2\2\u0233s\3\2\2\2\u0234\u0235\5\u00ba^\2\u0235\u0236\5b\62\2\u0236"+
		"u\3\2\2\2\u0237\u023a\5\16\b\2\u0238\u023a\5x=\2\u0239\u0237\3\2\2\2\u0239"+
		"\u0238\3\2\2\2\u023aw\3\2\2\2\u023b\u023c\7M\2\2\u023cy\3\2\2\2\u023d"+
		"\u0240\5|?\2\u023e\u0240\5~@\2\u023f\u023d\3\2\2\2\u023f\u023e\3\2\2\2"+
		"\u0240{\3\2\2\2\u0241\u0242\5\u00ba^\2\u0242\u0243\7N\2\2\u0243\u0244"+
		"\7^\2\2\u0244}\3\2\2\2\u0245\u0246\7O\2\2\u0246\u0248\7\20\2\2\u0247\u0249"+
		"\5\4\3\2\u0248\u0247\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\3\2\2\2\u024a"+
		"\u024d\7\21\2\2\u024b\u024c\7$\2\2\u024c\u024e\5\u0084C\2\u024d\u024b"+
		"\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0250\5\b\5\2\u0250"+
		"\177\3\2\2\2\u0251\u0253\5\u00aeX\2\u0252\u0254\7M\2\2\u0253\u0252\3\2"+
		"\2\2\u0253\u0254\3\2\2\2\u0254\u0081\3\2\2\2\u0255\u0256\7$\2\2\u0256"+
		"\u0257\5\u0084C\2\u0257\u0083\3\2\2\2\u0258\u0259\7P\2\2\u0259\u025a\7"+
		"\20\2\2\u025a\u0260\7\21\2\2\u025b\u025d\5\u0088E\2\u025c\u025e\5\u0086"+
		"D\2\u025d\u025c\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0260\3\2\2\2\u025f"+
		"\u0258\3\2\2\2\u025f\u025b\3\2\2\2\u0260\u0085\3\2\2\2\u0261\u0262\t\13"+
		"\2\2\u0262\u0087\3\2\2\2\u0263\u026b\5\u008cG\2\u0264\u0265\7Q\2\2\u0265"+
		"\u0266\7\20\2\2\u0266\u026b\7\21\2\2\u0267\u026b\5\u00b2Z\2\u0268\u026b"+
		"\5\u008aF\2\u0269\u026b\5\u00b8]\2\u026a\u0263\3\2\2\2\u026a\u0264\3\2"+
		"\2\2\u026a\u0267\3\2\2\2\u026a\u0268\3\2\2\2\u026a\u0269\3\2\2\2\u026b"+
		"\u0089\3\2\2\2\u026c\u026d\5\u00ba^\2\u026d\u008b\3\2\2\2\u026e\u0279"+
		"\5\u0090I\2\u026f\u0279\5\u00a2R\2\u0270\u0279\5\u009aN\2\u0271\u0279"+
		"\5\u00a6T\2\u0272\u0279\5\u009eP\2\u0273\u0279\5\u0098M\2\u0274\u0279"+
		"\5\u0094K\2\u0275\u0279\5\u0092J\2\u0276\u0279\5\u0096L\2\u0277\u0279"+
		"\5\u008eH\2\u0278\u026e\3\2\2\2\u0278\u026f\3\2\2\2\u0278\u0270\3\2\2"+
		"\2\u0278\u0271\3\2\2\2\u0278\u0272\3\2\2\2\u0278\u0273\3\2\2\2\u0278\u0274"+
		"\3\2\2\2\u0278\u0275\3\2\2\2\u0278\u0276\3\2\2\2\u0278\u0277\3\2\2\2\u0279"+
		"\u008d\3\2\2\2\u027a\u027b\7R\2\2\u027b\u027c\7\20\2\2\u027c\u027d\7\21"+
		"\2\2\u027d\u008f\3\2\2\2\u027e\u027f\7S\2\2\u027f\u0282\7\20\2\2\u0280"+
		"\u0283\5\u00a2R\2\u0281\u0283\5\u00a6T\2\u0282\u0280\3\2\2\2\u0282\u0281"+
		"\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0285\7\21\2\2"+
		"\u0285\u0091\3\2\2\2\u0286\u0287\7T\2\2\u0287\u0288\7\20\2\2\u0288\u0289"+
		"\7\21\2\2\u0289\u0093\3\2\2\2\u028a\u028b\7U\2\2\u028b\u028c\7\20\2\2"+
		"\u028c\u028d\7\21\2\2\u028d\u0095\3\2\2\2\u028e\u028f\7V\2\2\u028f\u0290"+
		"\7\20\2\2\u0290\u0291\7\21\2\2\u0291\u0097\3\2\2\2\u0292\u0293\7W\2\2"+
		"\u0293\u0296\7\20\2\2\u0294\u0297\7l\2\2\u0295\u0297\5\u00bc_\2\u0296"+
		"\u0294\3\2\2\2\u0296\u0295\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0298\3\2"+
		"\2\2\u0298\u0299\7\21\2\2\u0299\u0099\3\2\2\2\u029a\u029b\7<\2\2\u029b"+
		"\u02a1\7\20\2\2\u029c\u029f\5\u009cO\2\u029d\u029e\7\3\2\2\u029e\u02a0"+
		"\5\u00b0Y\2\u029f\u029d\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a2\3\2\2"+
		"\2\u02a1\u029c\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a4"+
		"\7\21\2\2\u02a4\u009b\3\2\2\2\u02a5\u02a8\5\u00aaV\2\u02a6\u02a8\7\31"+
		"\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a6\3\2\2\2\u02a8\u009d\3\2\2\2\u02a9"+
		"\u02aa\7X\2\2\u02aa\u02ab\7\20\2\2\u02ab\u02ac\5\u00a0Q\2\u02ac\u02ad"+
		"\7\21\2\2\u02ad\u009f\3\2\2\2\u02ae\u02af\5\u00aaV\2\u02af\u00a1\3\2\2"+
		"\2\u02b0\u02b1\7Y\2\2\u02b1\u02ba\7\20\2\2\u02b2\u02b8\5\u00a4S\2\u02b3"+
		"\u02b4\7\3\2\2\u02b4\u02b6\5\u00b0Y\2\u02b5\u02b7\7M\2\2\u02b6\u02b5\3"+
		"\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b9\3\2\2\2\u02b8\u02b3\3\2\2\2\u02b8"+
		"\u02b9\3\2\2\2\u02b9\u02bb\3\2\2\2\u02ba\u02b2\3\2\2\2\u02ba\u02bb\3\2"+
		"\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02bd\7\21\2\2\u02bd\u00a3\3\2\2\2\u02be"+
		"\u02c1\5\u00acW\2\u02bf\u02c1\7\31\2\2\u02c0\u02be\3\2\2\2\u02c0\u02bf"+
		"\3\2\2\2\u02c1\u00a5\3\2\2\2\u02c2\u02c3\7Z\2\2\u02c3\u02c4\7\20\2\2\u02c4"+
		"\u02c5\5\u00a8U\2\u02c5\u02c6\7\21\2\2\u02c6\u00a7\3\2\2\2\u02c7\u02c8"+
		"\5\u00acW\2\u02c8\u00a9\3\2\2\2\u02c9\u02ca\5\u00ba^\2\u02ca\u00ab\3\2"+
		"\2\2\u02cb\u02cc\5\u00ba^\2\u02cc\u00ad\3\2\2\2\u02cd\u02ce\5\u00b0Y\2"+
		"\u02ce\u00af\3\2\2\2\u02cf\u02d0\7g\2\2\u02d0\u00b1\3\2\2\2\u02d1\u02d4"+
		"\5\u00b4[\2\u02d2\u02d4\5\u00b6\\\2\u02d3\u02d1\3\2\2\2\u02d3\u02d2\3"+
		"\2\2\2\u02d4\u00b3\3\2\2\2\u02d5\u02d6\7O\2\2\u02d6\u02d7\7\20\2\2\u02d7"+
		"\u02d8\7\31\2\2\u02d8\u02d9\7\21\2\2\u02d9\u00b5\3\2\2\2\u02da\u02db\7"+
		"O\2\2\u02db\u02e4\7\20\2\2\u02dc\u02e1\5\u0084C\2\u02dd\u02de\7\3\2\2"+
		"\u02de\u02e0\5\u0084C\2\u02df\u02dd\3\2\2\2\u02e0\u02e3\3\2\2\2\u02e1"+
		"\u02df\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e5\3\2\2\2\u02e3\u02e1\3\2"+
		"\2\2\u02e4\u02dc\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6"+
		"\u02e7\7\21\2\2\u02e7\u02e8\7$\2\2\u02e8\u02e9\5\u0084C\2\u02e9\u00b7"+
		"\3\2\2\2\u02ea\u02eb\7\20\2\2\u02eb\u02ec\5\u0088E\2\u02ec\u02ed\7\21"+
		"\2\2\u02ed\u00b9\3\2\2\2\u02ee\u02ef\t\f\2\2\u02ef\u00bb\3\2\2\2\u02f0"+
		"\u02f5\7[\2\2\u02f1\u02f4\7a\2\2\u02f2\u02f4\13\2\2\2\u02f3\u02f1\3\2"+
		"\2\2\u02f3\u02f2\3\2\2\2\u02f4\u02f7\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f5"+
		"\u02f3\3\2\2\2\u02f6\u02f8\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f8\u0303\7["+
		"\2\2\u02f9\u02fe\7\\\2\2\u02fa\u02fd\7b\2\2\u02fb\u02fd\13\2\2\2\u02fc"+
		"\u02fa\3\2\2\2\u02fc\u02fb\3\2\2\2\u02fd\u0300\3\2\2\2\u02fe\u02ff\3\2"+
		"\2\2\u02fe\u02fc\3\2\2\2\u02ff\u0301\3\2\2\2\u0300\u02fe\3\2\2\2\u0301"+
		"\u0303\7\\\2\2\u0302\u02f0\3\2\2\2\u0302\u02f9\3\2\2\2\u0303\u00bd\3\2"+
		"\2\2H\u00c6\u00cc\u00d9\u00e1\u00ed\u00f8\u010a\u011f\u0133\u013a\u013e"+
		"\u0145\u014b\u0152\u015a\u0162\u016a\u0171\u0177\u017d\u0183\u0188\u019a"+
		"\u019f\u01a4\u01ab\u01b0\u01b4\u01bc\u01ce\u01d1\u01d9\u01e5\u01eb\u01ef"+
		"\u01fa\u01ff\u0201\u020a\u020d\u0214\u0221\u022a\u022e\u0239\u023f\u0248"+
		"\u024d\u0253\u025d\u025f\u026a\u0278\u0282\u0296\u029f\u02a1\u02a7\u02b6"+
		"\u02b8\u02ba\u02c0\u02d3\u02e1\u02e4\u02f3\u02f5\u02fc\u02fe\u0302";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}