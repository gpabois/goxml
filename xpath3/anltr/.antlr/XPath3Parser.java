// Generated from c:\Users\gael.pabois\dev\goxml\xpath3\anltr\XPath3.g by ANTLR 4.9.2
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
		T__87=88, T__88=89, T__89=90, T__90=91, NumericLiteral=92, IntegerLiteral=93, 
		DecimalLiteral=94, DoubleLiteral=95, ESCAPE_QUOTE=96, ESCAPE_APOS=97, 
		URIQualifiedName=98, Comment=99, BracedURILiteral=100, CommentContents=101, 
		QNAME=102, PREFIXED_NAME=103, UNPREFIXED_NAME=104, PREFIX=105, LOCAL_PART=106, 
		NC_NAME=107, CHAR=108, DIGITS=109;
	public static final int
		RULE_xPath = 0, RULE_paramList = 1, RULE_param = 2, RULE_functionBody = 3, 
		RULE_enclosedExpr = 4, RULE_expr = 5, RULE_exprSingle = 6, RULE_forExpr = 7, 
		RULE_simpleForClause = 8, RULE_forBindingList = 9, RULE_simpleForBinding = 10, 
		RULE_letExpr = 11, RULE_simpleLetClause = 12, RULE_letBindingList = 13, 
		RULE_simpleLetBinding = 14, RULE_quantifiedExpr = 15, RULE_quantifiedBindingList = 16, 
		RULE_simpleQuantifiedBinding = 17, RULE_ifExpr = 18, RULE_orExpr = 19, 
		RULE_andExpr = 20, RULE_comparisonExpr = 21, RULE_stringConcatExpr = 22, 
		RULE_rangeExpr = 23, RULE_additiveExpr = 24, RULE_multiplicativeExpr = 25, 
		RULE_unionExpr = 26, RULE_intersectExceptExpr = 27, RULE_instanceofExpr = 28, 
		RULE_treatExpr = 29, RULE_castableExpr = 30, RULE_castExpr = 31, RULE_unaryExpr = 32, 
		RULE_valueExpr = 33, RULE_generalComp = 34, RULE_valueComp = 35, RULE_nodeComp = 36, 
		RULE_simpleMapExpr = 37, RULE_pathExpr = 38, RULE_relativePathExpr = 39, 
		RULE_stepExpr = 40, RULE_axisStep = 41, RULE_forwardStep = 42, RULE_forwardAxis = 43, 
		RULE_abbrevForwardStep = 44, RULE_reverseStep = 45, RULE_reverseAxis = 46, 
		RULE_abbrevReverseStep = 47, RULE_nodeTest = 48, RULE_nameTest = 49, RULE_wildCard = 50, 
		RULE_postfixExpr = 51, RULE_argumentList = 52, RULE_predicateList = 53, 
		RULE_predicate = 54, RULE_primaryExpr = 55, RULE_varRef = 56, RULE_varName = 57, 
		RULE_literal = 58, RULE_parenthesizedExpr = 59, RULE_contextItemExpr = 60, 
		RULE_functionCall = 61, RULE_argument = 62, RULE_argumentPlaceholder = 63, 
		RULE_functionItemExpr = 64, RULE_namedFunctionRef = 65, RULE_inlineFunctionExpr = 66, 
		RULE_singleType = 67, RULE_type_declaration = 68, RULE_sequenceType = 69, 
		RULE_occurenceIndicator = 70, RULE_itemType = 71, RULE_atomicOrUnionType = 72, 
		RULE_kindTest = 73, RULE_anyKindTest = 74, RULE_documentTest = 75, RULE_textTest = 76, 
		RULE_commentTest = 77, RULE_namespaceNodeTest = 78, RULE_piTest = 79, 
		RULE_attributeTest = 80, RULE_attribNameOrWildcard = 81, RULE_schemaAttributeTest = 82, 
		RULE_attributeDeclaration = 83, RULE_elementTest = 84, RULE_elementNameOrWildcard = 85, 
		RULE_schemaElementTest = 86, RULE_elementDeclaration = 87, RULE_attributeName = 88, 
		RULE_elementName = 89, RULE_simpleTypeName = 90, RULE_typeName = 91, RULE_functionTest = 92, 
		RULE_anyFunctionTest = 93, RULE_typedFunctionTest = 94, RULE_parenthesizedItemType = 95, 
		RULE_eqName = 96, RULE_stringLiteral = 97;
	private static String[] makeRuleNames() {
		return new String[] {
			"xPath", "paramList", "param", "functionBody", "enclosedExpr", "expr", 
			"exprSingle", "forExpr", "simpleForClause", "forBindingList", "simpleForBinding", 
			"letExpr", "simpleLetClause", "letBindingList", "simpleLetBinding", "quantifiedExpr", 
			"quantifiedBindingList", "simpleQuantifiedBinding", "ifExpr", "orExpr", 
			"andExpr", "comparisonExpr", "stringConcatExpr", "rangeExpr", "additiveExpr", 
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
			"'else'", "'or'", "'and'", "'||'", "'to'", "'+'", "'-'", "'*'", "'div'", 
			"'idiv'", "'mod'", "'union'", "'|'", "'intersect'", "'except'", "'instance'", 
			"'of'", "'treat'", "'as'", "'castable'", "'cast'", "'='", "'!='", "'<='", 
			"'>='", "'<'", "'>'", "'eq'", "'ne'", "'lt'", "'le'", "'gt'", "'ge'", 
			"'is'", "'<<'", "'>>'", "'!'", "'/'", "'//'", "'child'", "'::'", "'descendant'", 
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
			null, null, null, null, null, null, null, null, "NumericLiteral", "IntegerLiteral", 
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
			setState(196);
			expr(0);
			setState(197);
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
			setState(199);
			param();
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(200);
				match(T__0);
				setState(201);
				param();
				}
				}
				setState(206);
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
			setState(207);
			match(T__1);
			setState(208);
			eqName();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__34) {
				{
				setState(209);
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
			setState(212);
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
			setState(214);
			match(T__2);
			setState(215);
			expr(0);
			setState(216);
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
		public ExprSingleContext exprSingle() {
			return getRuleContext(ExprSingleContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(219);
			exprSingle();
			}
			_ctx.stop = _input.LT(-1);
			setState(226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(221);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(222);
					match(T__0);
					setState(223);
					exprSingle();
					}
					} 
				}
				setState(228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				forExpr();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				letExpr();
				}
				break;
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				quantifiedExpr();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(232);
				ifExpr();
				}
				break;
			case T__1:
			case T__13:
			case T__21:
			case T__22:
			case T__23:
			case T__53:
			case T__54:
			case T__55:
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
			case T__70:
			case T__74:
			case T__77:
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
			case T__90:
			case NumericLiteral:
			case URIQualifiedName:
			case BracedURILiteral:
			case QNAME:
			case NC_NAME:
				enterOuterAlt(_localctx, 5);
				{
				setState(233);
				orExpr(0);
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
			setState(236);
			simpleForClause();
			setState(237);
			match(T__4);
			setState(238);
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
		public ForBindingListContext forBindingList() {
			return getRuleContext(ForBindingListContext.class,0);
		}
		public SimpleForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleForClause; }
	}

	public final SimpleForClauseContext simpleForClause() throws RecognitionException {
		SimpleForClauseContext _localctx = new SimpleForClauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_simpleForClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(T__5);
			setState(241);
			forBindingList(0);
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
			setState(244);
			simpleForBinding();
			}
			_ctx.stop = _input.LT(-1);
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ForBindingListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_forBindingList);
					setState(246);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(247);
					match(T__0);
					setState(248);
					simpleForBinding();
					}
					} 
				}
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
			setState(254);
			match(T__1);
			setState(255);
			varName();
			setState(256);
			match(T__6);
			setState(257);
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
			setState(259);
			simpleLetClause();
			setState(260);
			match(T__4);
			setState(261);
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
		public LetBindingListContext letBindingList() {
			return getRuleContext(LetBindingListContext.class,0);
		}
		public SimpleLetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleLetClause; }
	}

	public final SimpleLetClauseContext simpleLetClause() throws RecognitionException {
		SimpleLetClauseContext _localctx = new SimpleLetClauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_simpleLetClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(T__7);
			setState(264);
			letBindingList(0);
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

	public static class LetBindingListContext extends ParserRuleContext {
		public SimpleLetClauseContext simpleLetClause() {
			return getRuleContext(SimpleLetClauseContext.class,0);
		}
		public LetBindingListContext letBindingList() {
			return getRuleContext(LetBindingListContext.class,0);
		}
		public SimpleLetBindingContext simpleLetBinding() {
			return getRuleContext(SimpleLetBindingContext.class,0);
		}
		public LetBindingListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letBindingList; }
	}

	public final LetBindingListContext letBindingList() throws RecognitionException {
		return letBindingList(0);
	}

	private LetBindingListContext letBindingList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LetBindingListContext _localctx = new LetBindingListContext(_ctx, _parentState);
		LetBindingListContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_letBindingList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(267);
			simpleLetClause();
			}
			_ctx.stop = _input.LT(-1);
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LetBindingListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_letBindingList);
					setState(269);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(270);
					match(T__0);
					setState(271);
					simpleLetBinding();
					}
					} 
				}
				setState(276);
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
		enterRule(_localctx, 28, RULE_simpleLetBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(T__1);
			setState(278);
			varName();
			setState(279);
			match(T__8);
			setState(280);
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
		public Token quantifiedOp;
		public QuantifiedBindingListContext quantifiedBindingList() {
			return getRuleContext(QuantifiedBindingListContext.class,0);
		}
		public ExprSingleContext exprSingle() {
			return getRuleContext(ExprSingleContext.class,0);
		}
		public QuantifiedExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifiedExpr; }
	}

	public final QuantifiedExprContext quantifiedExpr() throws RecognitionException {
		QuantifiedExprContext _localctx = new QuantifiedExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_quantifiedExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			((QuantifiedExprContext)_localctx).quantifiedOp = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T__10) ) {
				((QuantifiedExprContext)_localctx).quantifiedOp = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(283);
			quantifiedBindingList(0);
			setState(284);
			match(T__11);
			setState(285);
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

	public static class QuantifiedBindingListContext extends ParserRuleContext {
		public SimpleQuantifiedBindingContext simpleQuantifiedBinding() {
			return getRuleContext(SimpleQuantifiedBindingContext.class,0);
		}
		public QuantifiedBindingListContext quantifiedBindingList() {
			return getRuleContext(QuantifiedBindingListContext.class,0);
		}
		public QuantifiedBindingListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifiedBindingList; }
	}

	public final QuantifiedBindingListContext quantifiedBindingList() throws RecognitionException {
		return quantifiedBindingList(0);
	}

	private QuantifiedBindingListContext quantifiedBindingList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QuantifiedBindingListContext _localctx = new QuantifiedBindingListContext(_ctx, _parentState);
		QuantifiedBindingListContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_quantifiedBindingList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(288);
			simpleQuantifiedBinding();
			}
			_ctx.stop = _input.LT(-1);
			setState(295);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new QuantifiedBindingListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_quantifiedBindingList);
					setState(290);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(291);
					match(T__0);
					setState(292);
					simpleQuantifiedBinding();
					}
					} 
				}
				setState(297);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class SimpleQuantifiedBindingContext extends ParserRuleContext {
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public ExprSingleContext exprSingle() {
			return getRuleContext(ExprSingleContext.class,0);
		}
		public SimpleQuantifiedBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleQuantifiedBinding; }
	}

	public final SimpleQuantifiedBindingContext simpleQuantifiedBinding() throws RecognitionException {
		SimpleQuantifiedBindingContext _localctx = new SimpleQuantifiedBindingContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_simpleQuantifiedBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(T__1);
			setState(299);
			varName();
			setState(300);
			match(T__6);
			setState(301);
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
		enterRule(_localctx, 36, RULE_ifExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(T__12);
			setState(304);
			match(T__13);
			setState(305);
			expr(0);
			setState(306);
			match(T__14);
			setState(307);
			match(T__15);
			setState(308);
			exprSingle();
			setState(309);
			match(T__16);
			setState(310);
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
		public AndExprContext andExpr() {
			return getRuleContext(AndExprContext.class,0);
		}
		public OrExprContext orExpr() {
			return getRuleContext(OrExprContext.class,0);
		}
		public OrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpr; }
	}

	public final OrExprContext orExpr() throws RecognitionException {
		return orExpr(0);
	}

	private OrExprContext orExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OrExprContext _localctx = new OrExprContext(_ctx, _parentState);
		OrExprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_orExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(313);
			andExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(320);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_orExpr);
					setState(315);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(316);
					match(T__17);
					setState(317);
					andExpr(0);
					}
					} 
				}
				setState(322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class AndExprContext extends ParserRuleContext {
		public ComparisonExprContext comparisonExpr() {
			return getRuleContext(ComparisonExprContext.class,0);
		}
		public AndExprContext andExpr() {
			return getRuleContext(AndExprContext.class,0);
		}
		public AndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr; }
	}

	public final AndExprContext andExpr() throws RecognitionException {
		return andExpr(0);
	}

	private AndExprContext andExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExprContext _localctx = new AndExprContext(_ctx, _parentState);
		AndExprContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_andExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(324);
			comparisonExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(331);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpr);
					setState(326);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(327);
					match(T__18);
					setState(328);
					comparisonExpr();
					}
					} 
				}
				setState(333);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ComparisonExprContext extends ParserRuleContext {
		public List<StringConcatExprContext> stringConcatExpr() {
			return getRuleContexts(StringConcatExprContext.class);
		}
		public StringConcatExprContext stringConcatExpr(int i) {
			return getRuleContext(StringConcatExprContext.class,i);
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
		public ComparisonExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpr; }
	}

	public final ComparisonExprContext comparisonExpr() throws RecognitionException {
		ComparisonExprContext _localctx = new ComparisonExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_comparisonExpr);
		try {
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				stringConcatExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				stringConcatExpr(0);
				setState(339);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__43:
				case T__44:
				case T__45:
				case T__46:
				case T__47:
				case T__48:
					{
					setState(336);
					valueComp();
					}
					break;
				case T__37:
				case T__38:
				case T__39:
				case T__40:
				case T__41:
				case T__42:
					{
					setState(337);
					generalComp();
					}
					break;
				case T__49:
				case T__50:
				case T__51:
					{
					setState(338);
					nodeComp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(341);
				stringConcatExpr(0);
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

	public static class StringConcatExprContext extends ParserRuleContext {
		public RangeExprContext rangeExpr() {
			return getRuleContext(RangeExprContext.class,0);
		}
		public StringConcatExprContext stringConcatExpr() {
			return getRuleContext(StringConcatExprContext.class,0);
		}
		public StringConcatExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringConcatExpr; }
	}

	public final StringConcatExprContext stringConcatExpr() throws RecognitionException {
		return stringConcatExpr(0);
	}

	private StringConcatExprContext stringConcatExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StringConcatExprContext _localctx = new StringConcatExprContext(_ctx, _parentState);
		StringConcatExprContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_stringConcatExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(346);
			rangeExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(353);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StringConcatExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_stringConcatExpr);
					setState(348);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(349);
					match(T__19);
					setState(350);
					rangeExpr(0);
					}
					} 
				}
				setState(355);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RangeExprContext extends ParserRuleContext {
		public AdditiveExprContext additiveExpr() {
			return getRuleContext(AdditiveExprContext.class,0);
		}
		public RangeExprContext rangeExpr() {
			return getRuleContext(RangeExprContext.class,0);
		}
		public RangeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeExpr; }
	}

	public final RangeExprContext rangeExpr() throws RecognitionException {
		return rangeExpr(0);
	}

	private RangeExprContext rangeExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RangeExprContext _localctx = new RangeExprContext(_ctx, _parentState);
		RangeExprContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_rangeExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(357);
			additiveExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(364);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RangeExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_rangeExpr);
					setState(359);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(360);
					match(T__20);
					setState(361);
					additiveExpr(0);
					}
					} 
				}
				setState(366);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class AdditiveExprContext extends ParserRuleContext {
		public Token additiveOp;
		public MultiplicativeExprContext multiplicativeExpr() {
			return getRuleContext(MultiplicativeExprContext.class,0);
		}
		public AdditiveExprContext additiveExpr() {
			return getRuleContext(AdditiveExprContext.class,0);
		}
		public AdditiveExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpr; }
	}

	public final AdditiveExprContext additiveExpr() throws RecognitionException {
		return additiveExpr(0);
	}

	private AdditiveExprContext additiveExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExprContext _localctx = new AdditiveExprContext(_ctx, _parentState);
		AdditiveExprContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_additiveExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(368);
			multiplicativeExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(375);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AdditiveExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_additiveExpr);
					setState(370);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(371);
					((AdditiveExprContext)_localctx).additiveOp = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__21 || _la==T__22) ) {
						((AdditiveExprContext)_localctx).additiveOp = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(372);
					multiplicativeExpr(0);
					}
					} 
				}
				setState(377);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicativeExprContext extends ParserRuleContext {
		public Token multiplicativeOp;
		public UnionExprContext unionExpr() {
			return getRuleContext(UnionExprContext.class,0);
		}
		public MultiplicativeExprContext multiplicativeExpr() {
			return getRuleContext(MultiplicativeExprContext.class,0);
		}
		public MultiplicativeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpr; }
	}

	public final MultiplicativeExprContext multiplicativeExpr() throws RecognitionException {
		return multiplicativeExpr(0);
	}

	private MultiplicativeExprContext multiplicativeExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExprContext _localctx = new MultiplicativeExprContext(_ctx, _parentState);
		MultiplicativeExprContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_multiplicativeExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(379);
			unionExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(386);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiplicativeExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpr);
					setState(381);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(382);
					((MultiplicativeExprContext)_localctx).multiplicativeOp = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
						((MultiplicativeExprContext)_localctx).multiplicativeOp = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(383);
					unionExpr(0);
					}
					} 
				}
				setState(388);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnionExprContext extends ParserRuleContext {
		public Token unionOp;
		public IntersectExceptExprContext intersectExceptExpr() {
			return getRuleContext(IntersectExceptExprContext.class,0);
		}
		public UnionExprContext unionExpr() {
			return getRuleContext(UnionExprContext.class,0);
		}
		public UnionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionExpr; }
	}

	public final UnionExprContext unionExpr() throws RecognitionException {
		return unionExpr(0);
	}

	private UnionExprContext unionExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		UnionExprContext _localctx = new UnionExprContext(_ctx, _parentState);
		UnionExprContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_unionExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(390);
			intersectExceptExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(397);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new UnionExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_unionExpr);
					setState(392);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(393);
					((UnionExprContext)_localctx).unionOp = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__27 || _la==T__28) ) {
						((UnionExprContext)_localctx).unionOp = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(394);
					intersectExceptExpr(0);
					}
					} 
				}
				setState(399);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IntersectExceptExprContext extends ParserRuleContext {
		public Token intersectExceptOp;
		public InstanceofExprContext instanceofExpr() {
			return getRuleContext(InstanceofExprContext.class,0);
		}
		public IntersectExceptExprContext intersectExceptExpr() {
			return getRuleContext(IntersectExceptExprContext.class,0);
		}
		public IntersectExceptExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intersectExceptExpr; }
	}

	public final IntersectExceptExprContext intersectExceptExpr() throws RecognitionException {
		return intersectExceptExpr(0);
	}

	private IntersectExceptExprContext intersectExceptExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IntersectExceptExprContext _localctx = new IntersectExceptExprContext(_ctx, _parentState);
		IntersectExceptExprContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_intersectExceptExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(401);
			instanceofExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(408);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IntersectExceptExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_intersectExceptExpr);
					setState(403);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(404);
					((IntersectExceptExprContext)_localctx).intersectExceptOp = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__29 || _la==T__30) ) {
						((IntersectExceptExprContext)_localctx).intersectExceptOp = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(405);
					instanceofExpr();
					}
					} 
				}
				setState(410);
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
			unrollRecursionContexts(_parentctx);
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
		enterRule(_localctx, 56, RULE_instanceofExpr);
		try {
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				treatExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				treatExpr();
				setState(413);
				match(T__31);
				setState(414);
				match(T__32);
				setState(415);
				sequenceType();
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
		enterRule(_localctx, 58, RULE_treatExpr);
		try {
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				castableExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				castableExpr();
				setState(421);
				match(T__33);
				setState(422);
				match(T__34);
				setState(423);
				sequenceType();
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
		enterRule(_localctx, 60, RULE_castableExpr);
		try {
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				castExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
				castExpr();
				setState(429);
				match(T__35);
				setState(430);
				match(T__34);
				setState(431);
				singleType();
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
		enterRule(_localctx, 62, RULE_castExpr);
		try {
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				unaryExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				unaryExpr();
				setState(437);
				match(T__36);
				setState(438);
				match(T__34);
				setState(439);
				singleType();
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

	public static class UnaryExprContext extends ParserRuleContext {
		public ValueExprContext valueExpr() {
			return getRuleContext(ValueExprContext.class,0);
		}
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_unaryExpr);
		try {
			setState(448);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__13:
			case T__23:
			case T__53:
			case T__54:
			case T__55:
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
			case T__70:
			case T__74:
			case T__77:
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
			case T__90:
			case NumericLiteral:
			case URIQualifiedName:
			case BracedURILiteral:
			case QNAME:
			case NC_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				valueExpr();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				match(T__22);
				setState(445);
				unaryExpr();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 3);
				{
				setState(446);
				match(T__21);
				setState(447);
				unaryExpr();
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
		enterRule(_localctx, 66, RULE_valueExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
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
		enterRule(_localctx, 68, RULE_generalComp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42))) != 0)) ) {
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
		enterRule(_localctx, 70, RULE_valueComp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48))) != 0)) ) {
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
		enterRule(_localctx, 72, RULE_nodeComp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__49) | (1L << T__50) | (1L << T__51))) != 0)) ) {
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
		enterRule(_localctx, 74, RULE_simpleMapExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			pathExpr();
			setState(463);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(459);
					match(T__52);
					setState(460);
					pathExpr();
					}
					} 
				}
				setState(465);
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
		enterRule(_localctx, 76, RULE_pathExpr);
		try {
			setState(473);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__53:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(466);
				match(T__53);
				setState(468);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(467);
					relativePathExpr();
					}
					break;
				}
				}
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(470);
				match(T__54);
				setState(471);
				relativePathExpr();
				}
				}
				break;
			case T__1:
			case T__13:
			case T__23:
			case T__55:
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
			case T__70:
			case T__74:
			case T__77:
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
			case T__90:
			case NumericLiteral:
			case URIQualifiedName:
			case BracedURILiteral:
			case QNAME:
			case NC_NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(472);
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
		public Token stepOp;
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
		enterRule(_localctx, 78, RULE_relativePathExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			stepExpr();
			setState(480);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(476);
					((RelativePathExprContext)_localctx).stepOp = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__53 || _la==T__54) ) {
						((RelativePathExprContext)_localctx).stepOp = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(477);
					stepExpr();
					}
					} 
				}
				setState(482);
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
		enterRule(_localctx, 80, RULE_stepExpr);
		try {
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				postfixExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(484);
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
		enterRule(_localctx, 82, RULE_axisStep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
				{
				setState(487);
				reverseStep();
				}
				break;
			case T__23:
			case T__55:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
			case T__85:
			case T__86:
			case T__87:
			case T__88:
			case URIQualifiedName:
			case BracedURILiteral:
			case QNAME:
			case NC_NAME:
				{
				setState(488);
				forwardStep();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(491);
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
		enterRule(_localctx, 84, RULE_forwardStep);
		try {
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(493);
				forwardAxis();
				setState(494);
				nodeTest();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
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
		enterRule(_localctx, 86, RULE_forwardAxis);
		try {
			setState(515);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__55:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(499);
				match(T__55);
				setState(500);
				match(T__56);
				}
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(501);
				match(T__57);
				setState(502);
				match(T__56);
				}
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(503);
				match(T__58);
				setState(504);
				match(T__56);
				}
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(505);
				match(T__59);
				setState(506);
				match(T__56);
				}
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(507);
				match(T__60);
				setState(508);
				match(T__56);
				}
				}
				break;
			case T__61:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(509);
				match(T__61);
				setState(510);
				match(T__56);
				}
				}
				break;
			case T__62:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(511);
				match(T__62);
				setState(512);
				match(T__56);
				}
				}
				break;
			case T__63:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(513);
				match(T__63);
				setState(514);
				match(T__56);
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
		public Token abbvOp;
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
		enterRule(_localctx, 88, RULE_abbrevForwardStep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__64) {
				{
				setState(517);
				((AbbrevForwardStepContext)_localctx).abbvOp = match(T__64);
				}
			}

			setState(520);
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
		enterRule(_localctx, 90, RULE_reverseStep);
		try {
			setState(526);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(522);
				reverseAxis();
				setState(523);
				nodeTest();
				}
				}
				break;
			case T__70:
				enterOuterAlt(_localctx, 2);
				{
				setState(525);
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
		enterRule(_localctx, 92, RULE_reverseAxis);
		try {
			setState(538);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__65:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(528);
				match(T__65);
				setState(529);
				match(T__56);
				}
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(530);
				match(T__66);
				setState(531);
				match(T__56);
				}
				}
				break;
			case T__67:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(532);
				match(T__67);
				setState(533);
				match(T__56);
				}
				}
				break;
			case T__68:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(534);
				match(T__68);
				setState(535);
				match(T__56);
				}
				}
				break;
			case T__69:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(536);
				match(T__69);
				setState(537);
				match(T__56);
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
		enterRule(_localctx, 94, RULE_abbrevReverseStep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(T__70);
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
		enterRule(_localctx, 96, RULE_nodeTest);
		try {
			setState(544);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__58:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
			case T__85:
			case T__86:
			case T__87:
			case T__88:
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				kindTest();
				}
				break;
			case T__23:
			case URIQualifiedName:
			case BracedURILiteral:
			case QNAME:
			case NC_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(543);
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
		enterRule(_localctx, 98, RULE_nameTest);
		try {
			setState(548);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case URIQualifiedName:
			case QNAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
				eqName();
				}
				break;
			case T__23:
			case BracedURILiteral:
			case NC_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
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
		enterRule(_localctx, 100, RULE_wildCard);
		try {
			setState(559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(550);
				match(T__23);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(551);
				match(NC_NAME);
				setState(552);
				match(T__71);
				setState(553);
				match(T__23);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(554);
				match(T__23);
				setState(555);
				match(T__71);
				setState(556);
				match(NC_NAME);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(557);
				match(BracedURILiteral);
				setState(558);
				match(T__23);
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
		enterRule(_localctx, 102, RULE_postfixExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			primaryExpr();
			setState(566);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(564);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__72:
						{
						setState(562);
						predicate();
						}
						break;
					case T__13:
						{
						setState(563);
						argumentList();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(568);
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
		enterRule(_localctx, 104, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(T__13);
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__77 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (NumericLiteral - 64)) | (1L << (URIQualifiedName - 64)) | (1L << (BracedURILiteral - 64)) | (1L << (QNAME - 64)) | (1L << (NC_NAME - 64)))) != 0)) {
				{
				setState(570);
				argument();
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(571);
					match(T__0);
					setState(572);
					argument();
					}
					}
					setState(577);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(580);
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
		enterRule(_localctx, 106, RULE_predicateList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(582);
					predicate();
					}
					} 
				}
				setState(587);
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
		enterRule(_localctx, 108, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(T__72);
			setState(589);
			expr(0);
			setState(590);
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
		enterRule(_localctx, 110, RULE_primaryExpr);
		try {
			setState(598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(592);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(593);
				varRef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(594);
				parenthesizedExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(595);
				contextItemExpr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(596);
				functionCall();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(597);
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
		enterRule(_localctx, 112, RULE_varRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(T__1);
			setState(601);
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
		enterRule(_localctx, 114, RULE_varName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
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
		enterRule(_localctx, 116, RULE_literal);
		try {
			setState(607);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NumericLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(605);
				match(NumericLiteral);
				}
				break;
			case T__89:
			case T__90:
				enterOuterAlt(_localctx, 2);
				{
				setState(606);
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
		enterRule(_localctx, 118, RULE_parenthesizedExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(T__13);
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__74 - 64)) | (1L << (T__77 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (NumericLiteral - 64)) | (1L << (URIQualifiedName - 64)) | (1L << (BracedURILiteral - 64)) | (1L << (QNAME - 64)) | (1L << (NC_NAME - 64)))) != 0)) {
				{
				setState(610);
				expr(0);
				}
			}

			setState(613);
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
		enterRule(_localctx, 120, RULE_contextItemExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
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
		enterRule(_localctx, 122, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			eqName();
			setState(618);
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
		enterRule(_localctx, 124, RULE_argument);
		try {
			setState(622);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__5:
			case T__7:
			case T__9:
			case T__10:
			case T__12:
			case T__13:
			case T__21:
			case T__22:
			case T__23:
			case T__53:
			case T__54:
			case T__55:
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
			case T__70:
			case T__74:
			case T__77:
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
			case T__90:
			case NumericLiteral:
			case URIQualifiedName:
			case BracedURILiteral:
			case QNAME:
			case NC_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(620);
				exprSingle();
				}
				break;
			case T__75:
				enterOuterAlt(_localctx, 2);
				{
				setState(621);
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
		enterRule(_localctx, 126, RULE_argumentPlaceholder);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(T__75);
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
		enterRule(_localctx, 128, RULE_functionItemExpr);
		try {
			setState(628);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case URIQualifiedName:
			case QNAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(626);
				namedFunctionRef();
				}
				break;
			case T__77:
				enterOuterAlt(_localctx, 2);
				{
				setState(627);
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
		enterRule(_localctx, 130, RULE_namedFunctionRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			eqName();
			setState(631);
			match(T__76);
			setState(632);
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
		enterRule(_localctx, 132, RULE_inlineFunctionExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			match(T__77);
			setState(635);
			match(T__13);
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(636);
				paramList();
				}
			}

			setState(639);
			match(T__14);
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__34) {
				{
				setState(640);
				match(T__34);
				setState(641);
				sequenceType();
				}
			}

			setState(644);
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
		enterRule(_localctx, 134, RULE_singleType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			simpleTypeName();
			setState(648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(647);
				match(T__75);
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
		enterRule(_localctx, 136, RULE_type_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			match(T__34);
			setState(651);
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
		enterRule(_localctx, 138, RULE_sequenceType);
		try {
			setState(660);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__78:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(653);
				match(T__78);
				setState(654);
				match(T__13);
				setState(655);
				match(T__14);
				}
				}
				break;
			case T__13:
			case T__58:
			case T__77:
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
			case URIQualifiedName:
			case QNAME:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(656);
				itemType();
				setState(658);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(657);
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
		enterRule(_localctx, 140, RULE_occurenceIndicator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			_la = _input.LA(1);
			if ( !(((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (T__21 - 22)) | (1L << (T__23 - 22)) | (1L << (T__75 - 22)))) != 0)) ) {
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
		enterRule(_localctx, 142, RULE_itemType);
		try {
			setState(671);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__58:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
			case T__85:
			case T__86:
			case T__87:
			case T__88:
				enterOuterAlt(_localctx, 1);
				{
				setState(664);
				kindTest();
				}
				break;
			case T__79:
				enterOuterAlt(_localctx, 2);
				{
				setState(665);
				match(T__79);
				setState(666);
				match(T__13);
				setState(667);
				match(T__14);
				}
				break;
			case T__77:
				enterOuterAlt(_localctx, 3);
				{
				setState(668);
				functionTest();
				}
				break;
			case URIQualifiedName:
			case QNAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(669);
				atomicOrUnionType();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(670);
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
		enterRule(_localctx, 144, RULE_atomicOrUnionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
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
		enterRule(_localctx, 146, RULE_kindTest);
		try {
			setState(685);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__81:
				enterOuterAlt(_localctx, 1);
				{
				setState(675);
				documentTest();
				}
				break;
			case T__87:
				enterOuterAlt(_localctx, 2);
				{
				setState(676);
				elementTest();
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 3);
				{
				setState(677);
				attributeTest();
				}
				break;
			case T__88:
				enterOuterAlt(_localctx, 4);
				{
				setState(678);
				schemaElementTest();
				}
				break;
			case T__86:
				enterOuterAlt(_localctx, 5);
				{
				setState(679);
				schemaAttributeTest();
				}
				break;
			case T__85:
				enterOuterAlt(_localctx, 6);
				{
				setState(680);
				piTest();
				}
				break;
			case T__83:
				enterOuterAlt(_localctx, 7);
				{
				setState(681);
				commentTest();
				}
				break;
			case T__82:
				enterOuterAlt(_localctx, 8);
				{
				setState(682);
				textTest();
				}
				break;
			case T__84:
				enterOuterAlt(_localctx, 9);
				{
				setState(683);
				namespaceNodeTest();
				}
				break;
			case T__80:
				enterOuterAlt(_localctx, 10);
				{
				setState(684);
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
		enterRule(_localctx, 148, RULE_anyKindTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			match(T__80);
			setState(688);
			match(T__13);
			setState(689);
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
		enterRule(_localctx, 150, RULE_documentTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			match(T__81);
			setState(692);
			match(T__13);
			setState(695);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__87:
				{
				setState(693);
				elementTest();
				}
				break;
			case T__88:
				{
				setState(694);
				schemaElementTest();
				}
				break;
			case T__14:
				break;
			default:
				break;
			}
			setState(697);
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
		enterRule(_localctx, 152, RULE_textTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			match(T__82);
			setState(700);
			match(T__13);
			setState(701);
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
		enterRule(_localctx, 154, RULE_commentTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			match(T__83);
			setState(704);
			match(T__13);
			setState(705);
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
		enterRule(_localctx, 156, RULE_namespaceNodeTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			match(T__84);
			setState(708);
			match(T__13);
			setState(709);
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
		enterRule(_localctx, 158, RULE_piTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			match(T__85);
			setState(712);
			match(T__13);
			setState(715);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NC_NAME:
				{
				setState(713);
				match(NC_NAME);
				}
				break;
			case T__89:
			case T__90:
				{
				setState(714);
				stringLiteral();
				}
				break;
			case T__14:
				break;
			default:
				break;
			}
			setState(717);
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
		enterRule(_localctx, 160, RULE_attributeTest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			match(T__58);
			setState(720);
			match(T__13);
			setState(726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23 || _la==URIQualifiedName || _la==QNAME) {
				{
				setState(721);
				attribNameOrWildcard();
				setState(724);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(722);
					match(T__0);
					setState(723);
					typeName();
					}
				}

				}
			}

			setState(728);
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
		enterRule(_localctx, 162, RULE_attribNameOrWildcard);
		try {
			setState(732);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case URIQualifiedName:
			case QNAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(730);
				attributeName();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(731);
				match(T__23);
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
		enterRule(_localctx, 164, RULE_schemaAttributeTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			match(T__86);
			setState(735);
			match(T__13);
			setState(736);
			attributeDeclaration();
			setState(737);
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
		enterRule(_localctx, 166, RULE_attributeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
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
		enterRule(_localctx, 168, RULE_elementTest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			match(T__87);
			setState(742);
			match(T__13);
			setState(751);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23 || _la==URIQualifiedName || _la==QNAME) {
				{
				setState(743);
				elementNameOrWildcard();
				setState(749);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(744);
					match(T__0);
					setState(745);
					typeName();
					setState(747);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__75) {
						{
						setState(746);
						match(T__75);
						}
					}

					}
				}

				}
			}

			setState(753);
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
		enterRule(_localctx, 170, RULE_elementNameOrWildcard);
		try {
			setState(757);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case URIQualifiedName:
			case QNAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(755);
				elementName();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(756);
				match(T__23);
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
		enterRule(_localctx, 172, RULE_schemaElementTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			match(T__88);
			setState(760);
			match(T__13);
			setState(761);
			elementDeclaration();
			setState(762);
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
		enterRule(_localctx, 174, RULE_elementDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
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
		enterRule(_localctx, 176, RULE_attributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
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
		enterRule(_localctx, 178, RULE_elementName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
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
		enterRule(_localctx, 180, RULE_simpleTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
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
		enterRule(_localctx, 182, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
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
		enterRule(_localctx, 184, RULE_functionTest);
		try {
			setState(776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(774);
				anyFunctionTest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(775);
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
		enterRule(_localctx, 186, RULE_anyFunctionTest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			match(T__77);
			setState(779);
			match(T__13);
			setState(780);
			match(T__23);
			setState(781);
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
		enterRule(_localctx, 188, RULE_typedFunctionTest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			match(T__77);
			setState(784);
			match(T__13);
			setState(793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__58 || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (T__77 - 78)) | (1L << (T__78 - 78)) | (1L << (T__79 - 78)) | (1L << (T__80 - 78)) | (1L << (T__81 - 78)) | (1L << (T__82 - 78)) | (1L << (T__83 - 78)) | (1L << (T__84 - 78)) | (1L << (T__85 - 78)) | (1L << (T__86 - 78)) | (1L << (T__87 - 78)) | (1L << (T__88 - 78)) | (1L << (URIQualifiedName - 78)) | (1L << (QNAME - 78)))) != 0)) {
				{
				setState(785);
				sequenceType();
				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(786);
					match(T__0);
					setState(787);
					sequenceType();
					}
					}
					setState(792);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(795);
			match(T__14);
			setState(796);
			match(T__34);
			setState(797);
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
		enterRule(_localctx, 190, RULE_parenthesizedItemType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			match(T__13);
			setState(800);
			itemType();
			setState(801);
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
		enterRule(_localctx, 192, RULE_eqName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
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
		enterRule(_localctx, 194, RULE_stringLiteral);
		try {
			int _alt;
			setState(823);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__89:
				enterOuterAlt(_localctx, 1);
				{
				setState(805);
				match(T__89);
				setState(810);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						setState(808);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
						case 1:
							{
							setState(806);
							match(ESCAPE_QUOTE);
							}
							break;
						case 2:
							{
							setState(807);
							matchWildcard();
							}
							break;
						}
						} 
					}
					setState(812);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				}
				setState(813);
				match(T__89);
				}
				break;
			case T__90:
				enterOuterAlt(_localctx, 2);
				{
				setState(814);
				match(T__90);
				setState(819);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						setState(817);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
						case 1:
							{
							setState(815);
							match(ESCAPE_APOS);
							}
							break;
						case 2:
							{
							setState(816);
							matchWildcard();
							}
							break;
						}
						} 
					}
					setState(821);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				}
				setState(822);
				match(T__90);
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
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 9:
			return forBindingList_sempred((ForBindingListContext)_localctx, predIndex);
		case 13:
			return letBindingList_sempred((LetBindingListContext)_localctx, predIndex);
		case 16:
			return quantifiedBindingList_sempred((QuantifiedBindingListContext)_localctx, predIndex);
		case 19:
			return orExpr_sempred((OrExprContext)_localctx, predIndex);
		case 20:
			return andExpr_sempred((AndExprContext)_localctx, predIndex);
		case 22:
			return stringConcatExpr_sempred((StringConcatExprContext)_localctx, predIndex);
		case 23:
			return rangeExpr_sempred((RangeExprContext)_localctx, predIndex);
		case 24:
			return additiveExpr_sempred((AdditiveExprContext)_localctx, predIndex);
		case 25:
			return multiplicativeExpr_sempred((MultiplicativeExprContext)_localctx, predIndex);
		case 26:
			return unionExpr_sempred((UnionExprContext)_localctx, predIndex);
		case 27:
			return intersectExceptExpr_sempred((IntersectExceptExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean forBindingList_sempred(ForBindingListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean letBindingList_sempred(LetBindingListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean quantifiedBindingList_sempred(QuantifiedBindingListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean orExpr_sempred(OrExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpr_sempred(AndExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean stringConcatExpr_sempred(StringConcatExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean rangeExpr_sempred(RangeExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpr_sempred(AdditiveExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpr_sempred(MultiplicativeExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean unionExpr_sempred(UnionExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean intersectExceptExpr_sempred(IntersectExceptExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3o\u033c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\3\2\3\2\3\2\3\3\3\3\3\3\7\3\u00cd\n\3\f\3\16\3"+
		"\u00d0\13\3\3\4\3\4\3\4\5\4\u00d5\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\7\7\u00e3\n\7\f\7\16\7\u00e6\13\7\3\b\3\b\3\b\3\b\3\b"+
		"\5\b\u00ed\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\7\13\u00fc\n\13\f\13\16\13\u00ff\13\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0113\n\17"+
		"\f\17\16\17\u0116\13\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0128\n\22\f\22\16\22\u012b\13"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0141\n\25\f\25\16\25\u0144\13"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u014c\n\26\f\26\16\26\u014f\13"+
		"\26\3\27\3\27\3\27\3\27\3\27\5\27\u0156\n\27\3\27\3\27\5\27\u015a\n\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0162\n\30\f\30\16\30\u0165\13\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u016d\n\31\f\31\16\31\u0170\13\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0178\n\32\f\32\16\32\u017b\13\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0183\n\33\f\33\16\33\u0186\13\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u018e\n\34\f\34\16\34\u0191\13\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0199\n\35\f\35\16\35\u019c\13\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01a4\n\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u01ac\n\37\3 \3 \3 \3 \3 \3 \5 \u01b4\n \3!\3!\3!\3!\3!\3!"+
		"\5!\u01bc\n!\3\"\3\"\3\"\3\"\3\"\5\"\u01c3\n\"\3#\3#\3$\3$\3%\3%\3&\3"+
		"&\3\'\3\'\3\'\7\'\u01d0\n\'\f\'\16\'\u01d3\13\'\3(\3(\5(\u01d7\n(\3(\3"+
		"(\3(\5(\u01dc\n(\3)\3)\3)\7)\u01e1\n)\f)\16)\u01e4\13)\3*\3*\5*\u01e8"+
		"\n*\3+\3+\5+\u01ec\n+\3+\3+\3,\3,\3,\3,\5,\u01f4\n,\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0206\n-\3.\5.\u0209\n.\3.\3.\3/\3/"+
		"\3/\3/\5/\u0211\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5"+
		"\60\u021d\n\60\3\61\3\61\3\62\3\62\5\62\u0223\n\62\3\63\3\63\5\63\u0227"+
		"\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0232\n\64\3\65"+
		"\3\65\3\65\7\65\u0237\n\65\f\65\16\65\u023a\13\65\3\66\3\66\3\66\3\66"+
		"\7\66\u0240\n\66\f\66\16\66\u0243\13\66\5\66\u0245\n\66\3\66\3\66\3\67"+
		"\7\67\u024a\n\67\f\67\16\67\u024d\13\67\38\38\38\38\39\39\39\39\39\39"+
		"\59\u0259\n9\3:\3:\3:\3;\3;\3<\3<\5<\u0262\n<\3=\3=\5=\u0266\n=\3=\3="+
		"\3>\3>\3?\3?\3?\3@\3@\5@\u0271\n@\3A\3A\3B\3B\5B\u0277\nB\3C\3C\3C\3C"+
		"\3D\3D\3D\5D\u0280\nD\3D\3D\3D\5D\u0285\nD\3D\3D\3E\3E\5E\u028b\nE\3F"+
		"\3F\3F\3G\3G\3G\3G\3G\5G\u0295\nG\5G\u0297\nG\3H\3H\3I\3I\3I\3I\3I\3I"+
		"\3I\5I\u02a2\nI\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u02b0\nK\3L\3L"+
		"\3L\3L\3M\3M\3M\3M\5M\u02ba\nM\3M\3M\3N\3N\3N\3N\3O\3O\3O\3O\3P\3P\3P"+
		"\3P\3Q\3Q\3Q\3Q\5Q\u02ce\nQ\3Q\3Q\3R\3R\3R\3R\3R\5R\u02d7\nR\5R\u02d9"+
		"\nR\3R\3R\3S\3S\5S\u02df\nS\3T\3T\3T\3T\3T\3U\3U\3V\3V\3V\3V\3V\3V\5V"+
		"\u02ee\nV\5V\u02f0\nV\5V\u02f2\nV\3V\3V\3W\3W\5W\u02f8\nW\3X\3X\3X\3X"+
		"\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3^\3^\5^\u030b\n^\3_\3_\3_\3_\3_\3"+
		"`\3`\3`\3`\3`\7`\u0317\n`\f`\16`\u031a\13`\5`\u031c\n`\3`\3`\3`\3`\3a"+
		"\3a\3a\3a\3b\3b\3c\3c\3c\7c\u032b\nc\fc\16c\u032e\13c\3c\3c\3c\3c\7c\u0334"+
		"\nc\fc\16c\u0337\13c\3c\5c\u033a\nc\3c\4\u032c\u0335\16\f\24\34\"(*.\60"+
		"\62\64\668d\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\2\r\3\2\f\r\3\2\30\31\3\2\32\35\3\2\36"+
		"\37\3\2 !\3\2(-\3\2.\63\3\2\64\66\3\289\5\2\30\30\32\32NN\4\2ddhh\2\u0341"+
		"\2\u00c6\3\2\2\2\4\u00c9\3\2\2\2\6\u00d1\3\2\2\2\b\u00d6\3\2\2\2\n\u00d8"+
		"\3\2\2\2\f\u00dc\3\2\2\2\16\u00ec\3\2\2\2\20\u00ee\3\2\2\2\22\u00f2\3"+
		"\2\2\2\24\u00f5\3\2\2\2\26\u0100\3\2\2\2\30\u0105\3\2\2\2\32\u0109\3\2"+
		"\2\2\34\u010c\3\2\2\2\36\u0117\3\2\2\2 \u011c\3\2\2\2\"\u0121\3\2\2\2"+
		"$\u012c\3\2\2\2&\u0131\3\2\2\2(\u013a\3\2\2\2*\u0145\3\2\2\2,\u0159\3"+
		"\2\2\2.\u015b\3\2\2\2\60\u0166\3\2\2\2\62\u0171\3\2\2\2\64\u017c\3\2\2"+
		"\2\66\u0187\3\2\2\28\u0192\3\2\2\2:\u01a3\3\2\2\2<\u01ab\3\2\2\2>\u01b3"+
		"\3\2\2\2@\u01bb\3\2\2\2B\u01c2\3\2\2\2D\u01c4\3\2\2\2F\u01c6\3\2\2\2H"+
		"\u01c8\3\2\2\2J\u01ca\3\2\2\2L\u01cc\3\2\2\2N\u01db\3\2\2\2P\u01dd\3\2"+
		"\2\2R\u01e7\3\2\2\2T\u01eb\3\2\2\2V\u01f3\3\2\2\2X\u0205\3\2\2\2Z\u0208"+
		"\3\2\2\2\\\u0210\3\2\2\2^\u021c\3\2\2\2`\u021e\3\2\2\2b\u0222\3\2\2\2"+
		"d\u0226\3\2\2\2f\u0231\3\2\2\2h\u0233\3\2\2\2j\u023b\3\2\2\2l\u024b\3"+
		"\2\2\2n\u024e\3\2\2\2p\u0258\3\2\2\2r\u025a\3\2\2\2t\u025d\3\2\2\2v\u0261"+
		"\3\2\2\2x\u0263\3\2\2\2z\u0269\3\2\2\2|\u026b\3\2\2\2~\u0270\3\2\2\2\u0080"+
		"\u0272\3\2\2\2\u0082\u0276\3\2\2\2\u0084\u0278\3\2\2\2\u0086\u027c\3\2"+
		"\2\2\u0088\u0288\3\2\2\2\u008a\u028c\3\2\2\2\u008c\u0296\3\2\2\2\u008e"+
		"\u0298\3\2\2\2\u0090\u02a1\3\2\2\2\u0092\u02a3\3\2\2\2\u0094\u02af\3\2"+
		"\2\2\u0096\u02b1\3\2\2\2\u0098\u02b5\3\2\2\2\u009a\u02bd\3\2\2\2\u009c"+
		"\u02c1\3\2\2\2\u009e\u02c5\3\2\2\2\u00a0\u02c9\3\2\2\2\u00a2\u02d1\3\2"+
		"\2\2\u00a4\u02de\3\2\2\2\u00a6\u02e0\3\2\2\2\u00a8\u02e5\3\2\2\2\u00aa"+
		"\u02e7\3\2\2\2\u00ac\u02f7\3\2\2\2\u00ae\u02f9\3\2\2\2\u00b0\u02fe\3\2"+
		"\2\2\u00b2\u0300\3\2\2\2\u00b4\u0302\3\2\2\2\u00b6\u0304\3\2\2\2\u00b8"+
		"\u0306\3\2\2\2\u00ba\u030a\3\2\2\2\u00bc\u030c\3\2\2\2\u00be\u0311\3\2"+
		"\2\2\u00c0\u0321\3\2\2\2\u00c2\u0325\3\2\2\2\u00c4\u0339\3\2\2\2\u00c6"+
		"\u00c7\5\f\7\2\u00c7\u00c8\7\2\2\3\u00c8\3\3\2\2\2\u00c9\u00ce\5\6\4\2"+
		"\u00ca\u00cb\7\3\2\2\u00cb\u00cd\5\6\4\2\u00cc\u00ca\3\2\2\2\u00cd\u00d0"+
		"\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\5\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d1\u00d2\7\4\2\2\u00d2\u00d4\5\u00c2b\2\u00d3\u00d5"+
		"\5\u008aF\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\7\3\2\2\2\u00d6"+
		"\u00d7\5\n\6\2\u00d7\t\3\2\2\2\u00d8\u00d9\7\5\2\2\u00d9\u00da\5\f\7\2"+
		"\u00da\u00db\7\6\2\2\u00db\13\3\2\2\2\u00dc\u00dd\b\7\1\2\u00dd\u00de"+
		"\5\16\b\2\u00de\u00e4\3\2\2\2\u00df\u00e0\f\3\2\2\u00e0\u00e1\7\3\2\2"+
		"\u00e1\u00e3\5\16\b\2\u00e2\u00df\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2"+
		"\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\r\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7"+
		"\u00ed\5\20\t\2\u00e8\u00ed\5\30\r\2\u00e9\u00ed\5 \21\2\u00ea\u00ed\5"+
		"&\24\2\u00eb\u00ed\5(\25\2\u00ec\u00e7\3\2\2\2\u00ec\u00e8\3\2\2\2\u00ec"+
		"\u00e9\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\17\3\2\2"+
		"\2\u00ee\u00ef\5\22\n\2\u00ef\u00f0\7\7\2\2\u00f0\u00f1\5\16\b\2\u00f1"+
		"\21\3\2\2\2\u00f2\u00f3\7\b\2\2\u00f3\u00f4\5\24\13\2\u00f4\23\3\2\2\2"+
		"\u00f5\u00f6\b\13\1\2\u00f6\u00f7\5\26\f\2\u00f7\u00fd\3\2\2\2\u00f8\u00f9"+
		"\f\3\2\2\u00f9\u00fa\7\3\2\2\u00fa\u00fc\5\26\f\2\u00fb\u00f8\3\2\2\2"+
		"\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\25"+
		"\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101\7\4\2\2\u0101\u0102\5t;\2\u0102"+
		"\u0103\7\t\2\2\u0103\u0104\5\16\b\2\u0104\27\3\2\2\2\u0105\u0106\5\32"+
		"\16\2\u0106\u0107\7\7\2\2\u0107\u0108\5\16\b\2\u0108\31\3\2\2\2\u0109"+
		"\u010a\7\n\2\2\u010a\u010b\5\34\17\2\u010b\33\3\2\2\2\u010c\u010d\b\17"+
		"\1\2\u010d\u010e\5\32\16\2\u010e\u0114\3\2\2\2\u010f\u0110\f\3\2\2\u0110"+
		"\u0111\7\3\2\2\u0111\u0113\5\36\20\2\u0112\u010f\3\2\2\2\u0113\u0116\3"+
		"\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\35\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0117\u0118\7\4\2\2\u0118\u0119\5t;\2\u0119\u011a\7\13"+
		"\2\2\u011a\u011b\5\16\b\2\u011b\37\3\2\2\2\u011c\u011d\t\2\2\2\u011d\u011e"+
		"\5\"\22\2\u011e\u011f\7\16\2\2\u011f\u0120\5\16\b\2\u0120!\3\2\2\2\u0121"+
		"\u0122\b\22\1\2\u0122\u0123\5$\23\2\u0123\u0129\3\2\2\2\u0124\u0125\f"+
		"\3\2\2\u0125\u0126\7\3\2\2\u0126\u0128\5$\23\2\u0127\u0124\3\2\2\2\u0128"+
		"\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a#\3\2\2\2"+
		"\u012b\u0129\3\2\2\2\u012c\u012d\7\4\2\2\u012d\u012e\5t;\2\u012e\u012f"+
		"\7\t\2\2\u012f\u0130\5\16\b\2\u0130%\3\2\2\2\u0131\u0132\7\17\2\2\u0132"+
		"\u0133\7\20\2\2\u0133\u0134\5\f\7\2\u0134\u0135\7\21\2\2\u0135\u0136\7"+
		"\22\2\2\u0136\u0137\5\16\b\2\u0137\u0138\7\23\2\2\u0138\u0139\5\16\b\2"+
		"\u0139\'\3\2\2\2\u013a\u013b\b\25\1\2\u013b\u013c\5*\26\2\u013c\u0142"+
		"\3\2\2\2\u013d\u013e\f\3\2\2\u013e\u013f\7\24\2\2\u013f\u0141\5*\26\2"+
		"\u0140\u013d\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143"+
		"\3\2\2\2\u0143)\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0146\b\26\1\2\u0146"+
		"\u0147\5,\27\2\u0147\u014d\3\2\2\2\u0148\u0149\f\3\2\2\u0149\u014a\7\25"+
		"\2\2\u014a\u014c\5,\27\2\u014b\u0148\3\2\2\2\u014c\u014f\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e+\3\2\2\2\u014f\u014d\3\2\2\2"+
		"\u0150\u015a\5.\30\2\u0151\u0155\5.\30\2\u0152\u0156\5H%\2\u0153\u0156"+
		"\5F$\2\u0154\u0156\5J&\2\u0155\u0152\3\2\2\2\u0155\u0153\3\2\2\2\u0155"+
		"\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\5.\30\2\u0158\u015a\3\2"+
		"\2\2\u0159\u0150\3\2\2\2\u0159\u0151\3\2\2\2\u015a-\3\2\2\2\u015b\u015c"+
		"\b\30\1\2\u015c\u015d\5\60\31\2\u015d\u0163\3\2\2\2\u015e\u015f\f\3\2"+
		"\2\u015f\u0160\7\26\2\2\u0160\u0162\5\60\31\2\u0161\u015e\3\2\2\2\u0162"+
		"\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164/\3\2\2\2"+
		"\u0165\u0163\3\2\2\2\u0166\u0167\b\31\1\2\u0167\u0168\5\62\32\2\u0168"+
		"\u016e\3\2\2\2\u0169\u016a\f\3\2\2\u016a\u016b\7\27\2\2\u016b\u016d\5"+
		"\62\32\2\u016c\u0169\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\61\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0172\b\32\1"+
		"\2\u0172\u0173\5\64\33\2\u0173\u0179\3\2\2\2\u0174\u0175\f\3\2\2\u0175"+
		"\u0176\t\3\2\2\u0176\u0178\5\64\33\2\u0177\u0174\3\2\2\2\u0178\u017b\3"+
		"\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\63\3\2\2\2\u017b"+
		"\u0179\3\2\2\2\u017c\u017d\b\33\1\2\u017d\u017e\5\66\34\2\u017e\u0184"+
		"\3\2\2\2\u017f\u0180\f\3\2\2\u0180\u0181\t\4\2\2\u0181\u0183\5\66\34\2"+
		"\u0182\u017f\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185"+
		"\3\2\2\2\u0185\65\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0188\b\34\1\2\u0188"+
		"\u0189\58\35\2\u0189\u018f\3\2\2\2\u018a\u018b\f\3\2\2\u018b\u018c\t\5"+
		"\2\2\u018c\u018e\58\35\2\u018d\u018a\3\2\2\2\u018e\u0191\3\2\2\2\u018f"+
		"\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\67\3\2\2\2\u0191\u018f\3\2\2"+
		"\2\u0192\u0193\b\35\1\2\u0193\u0194\5:\36\2\u0194\u019a\3\2\2\2\u0195"+
		"\u0196\f\3\2\2\u0196\u0197\t\6\2\2\u0197\u0199\5:\36\2\u0198\u0195\3\2"+
		"\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b"+
		"9\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u01a4\5<\37\2\u019e\u019f\5<\37\2"+
		"\u019f\u01a0\7\"\2\2\u01a0\u01a1\7#\2\2\u01a1\u01a2\5\u008cG\2\u01a2\u01a4"+
		"\3\2\2\2\u01a3\u019d\3\2\2\2\u01a3\u019e\3\2\2\2\u01a4;\3\2\2\2\u01a5"+
		"\u01ac\5> \2\u01a6\u01a7\5> \2\u01a7\u01a8\7$\2\2\u01a8\u01a9\7%\2\2\u01a9"+
		"\u01aa\5\u008cG\2\u01aa\u01ac\3\2\2\2\u01ab\u01a5\3\2\2\2\u01ab\u01a6"+
		"\3\2\2\2\u01ac=\3\2\2\2\u01ad\u01b4\5@!\2\u01ae\u01af\5@!\2\u01af\u01b0"+
		"\7&\2\2\u01b0\u01b1\7%\2\2\u01b1\u01b2\5\u0088E\2\u01b2\u01b4\3\2\2\2"+
		"\u01b3\u01ad\3\2\2\2\u01b3\u01ae\3\2\2\2\u01b4?\3\2\2\2\u01b5\u01bc\5"+
		"B\"\2\u01b6\u01b7\5B\"\2\u01b7\u01b8\7\'\2\2\u01b8\u01b9\7%\2\2\u01b9"+
		"\u01ba\5\u0088E\2\u01ba\u01bc\3\2\2\2\u01bb\u01b5\3\2\2\2\u01bb\u01b6"+
		"\3\2\2\2\u01bcA\3\2\2\2\u01bd\u01c3\5D#\2\u01be\u01bf\7\31\2\2\u01bf\u01c3"+
		"\5B\"\2\u01c0\u01c1\7\30\2\2\u01c1\u01c3\5B\"\2\u01c2\u01bd\3\2\2\2\u01c2"+
		"\u01be\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3C\3\2\2\2\u01c4\u01c5\5L\'\2\u01c5"+
		"E\3\2\2\2\u01c6\u01c7\t\7\2\2\u01c7G\3\2\2\2\u01c8\u01c9\t\b\2\2\u01c9"+
		"I\3\2\2\2\u01ca\u01cb\t\t\2\2\u01cbK\3\2\2\2\u01cc\u01d1\5N(\2\u01cd\u01ce"+
		"\7\67\2\2\u01ce\u01d0\5N(\2\u01cf\u01cd\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1"+
		"\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2M\3\2\2\2\u01d3\u01d1\3\2\2\2"+
		"\u01d4\u01d6\78\2\2\u01d5\u01d7\5P)\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7"+
		"\3\2\2\2\u01d7\u01dc\3\2\2\2\u01d8\u01d9\79\2\2\u01d9\u01dc\5P)\2\u01da"+
		"\u01dc\5P)\2\u01db\u01d4\3\2\2\2\u01db\u01d8\3\2\2\2\u01db\u01da\3\2\2"+
		"\2\u01dcO\3\2\2\2\u01dd\u01e2\5R*\2\u01de\u01df\t\n\2\2\u01df\u01e1\5"+
		"R*\2\u01e0\u01de\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2"+
		"\u01e3\3\2\2\2\u01e3Q\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01e8\5h\65\2"+
		"\u01e6\u01e8\5T+\2\u01e7\u01e5\3\2\2\2\u01e7\u01e6\3\2\2\2\u01e8S\3\2"+
		"\2\2\u01e9\u01ec\5\\/\2\u01ea\u01ec\5V,\2\u01eb\u01e9\3\2\2\2\u01eb\u01ea"+
		"\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\5l\67\2\u01eeU\3\2\2\2\u01ef"+
		"\u01f0\5X-\2\u01f0\u01f1\5b\62\2\u01f1\u01f4\3\2\2\2\u01f2\u01f4\5Z.\2"+
		"\u01f3\u01ef\3\2\2\2\u01f3\u01f2\3\2\2\2\u01f4W\3\2\2\2\u01f5\u01f6\7"+
		":\2\2\u01f6\u0206\7;\2\2\u01f7\u01f8\7<\2\2\u01f8\u0206\7;\2\2\u01f9\u01fa"+
		"\7=\2\2\u01fa\u0206\7;\2\2\u01fb\u01fc\7>\2\2\u01fc\u0206\7;\2\2\u01fd"+
		"\u01fe\7?\2\2\u01fe\u0206\7;\2\2\u01ff\u0200\7@\2\2\u0200\u0206\7;\2\2"+
		"\u0201\u0202\7A\2\2\u0202\u0206\7;\2\2\u0203\u0204\7B\2\2\u0204\u0206"+
		"\7;\2\2\u0205\u01f5\3\2\2\2\u0205\u01f7\3\2\2\2\u0205\u01f9\3\2\2\2\u0205"+
		"\u01fb\3\2\2\2\u0205\u01fd\3\2\2\2\u0205\u01ff\3\2\2\2\u0205\u0201\3\2"+
		"\2\2\u0205\u0203\3\2\2\2\u0206Y\3\2\2\2\u0207\u0209\7C\2\2\u0208\u0207"+
		"\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020b\5b\62\2\u020b"+
		"[\3\2\2\2\u020c\u020d\5^\60\2\u020d\u020e\5b\62\2\u020e\u0211\3\2\2\2"+
		"\u020f\u0211\5`\61\2\u0210\u020c\3\2\2\2\u0210\u020f\3\2\2\2\u0211]\3"+
		"\2\2\2\u0212\u0213\7D\2\2\u0213\u021d\7;\2\2\u0214\u0215\7E\2\2\u0215"+
		"\u021d\7;\2\2\u0216\u0217\7F\2\2\u0217\u021d\7;\2\2\u0218\u0219\7G\2\2"+
		"\u0219\u021d\7;\2\2\u021a\u021b\7H\2\2\u021b\u021d\7;\2\2\u021c\u0212"+
		"\3\2\2\2\u021c\u0214\3\2\2\2\u021c\u0216\3\2\2\2\u021c\u0218\3\2\2\2\u021c"+
		"\u021a\3\2\2\2\u021d_\3\2\2\2\u021e\u021f\7I\2\2\u021fa\3\2\2\2\u0220"+
		"\u0223\5\u0094K\2\u0221\u0223\5d\63\2\u0222\u0220\3\2\2\2\u0222\u0221"+
		"\3\2\2\2\u0223c\3\2\2\2\u0224\u0227\5\u00c2b\2\u0225\u0227\5f\64\2\u0226"+
		"\u0224\3\2\2\2\u0226\u0225\3\2\2\2\u0227e\3\2\2\2\u0228\u0232\7\32\2\2"+
		"\u0229\u022a\7m\2\2\u022a\u022b\7J\2\2\u022b\u0232\7\32\2\2\u022c\u022d"+
		"\7\32\2\2\u022d\u022e\7J\2\2\u022e\u0232\7m\2\2\u022f\u0230\7f\2\2\u0230"+
		"\u0232\7\32\2\2\u0231\u0228\3\2\2\2\u0231\u0229\3\2\2\2\u0231\u022c\3"+
		"\2\2\2\u0231\u022f\3\2\2\2\u0232g\3\2\2\2\u0233\u0238\5p9\2\u0234\u0237"+
		"\5n8\2\u0235\u0237\5j\66\2\u0236\u0234\3\2\2\2\u0236\u0235\3\2\2\2\u0237"+
		"\u023a\3\2\2\2\u0238\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239i\3\2\2\2"+
		"\u023a\u0238\3\2\2\2\u023b\u0244\7\20\2\2\u023c\u0241\5~@\2\u023d\u023e"+
		"\7\3\2\2\u023e\u0240\5~@\2\u023f\u023d\3\2\2\2\u0240\u0243\3\2\2\2\u0241"+
		"\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0245\3\2\2\2\u0243\u0241\3\2"+
		"\2\2\u0244\u023c\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0246\3\2\2\2\u0246"+
		"\u0247\7\21\2\2\u0247k\3\2\2\2\u0248\u024a\5n8\2\u0249\u0248\3\2\2\2\u024a"+
		"\u024d\3\2\2\2\u024b\u0249\3\2\2\2\u024b\u024c\3\2\2\2\u024cm\3\2\2\2"+
		"\u024d\u024b\3\2\2\2\u024e\u024f\7K\2\2\u024f\u0250\5\f\7\2\u0250\u0251"+
		"\7L\2\2\u0251o\3\2\2\2\u0252\u0259\5v<\2\u0253\u0259\5r:\2\u0254\u0259"+
		"\5x=\2\u0255\u0259\5z>\2\u0256\u0259\5|?\2\u0257\u0259\5\u0082B\2\u0258"+
		"\u0252\3\2\2\2\u0258\u0253\3\2\2\2\u0258\u0254\3\2\2\2\u0258\u0255\3\2"+
		"\2\2\u0258\u0256\3\2\2\2\u0258\u0257\3\2\2\2\u0259q\3\2\2\2\u025a\u025b"+
		"\7\4\2\2\u025b\u025c\5t;\2\u025cs\3\2\2\2\u025d\u025e\5\u00c2b\2\u025e"+
		"u\3\2\2\2\u025f\u0262\7^\2\2\u0260\u0262\5\u00c4c\2\u0261\u025f\3\2\2"+
		"\2\u0261\u0260\3\2\2\2\u0262w\3\2\2\2\u0263\u0265\7\20\2\2\u0264\u0266"+
		"\5\f\7\2\u0265\u0264\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0267\3\2\2\2\u0267"+
		"\u0268\7\21\2\2\u0268y\3\2\2\2\u0269\u026a\7M\2\2\u026a{\3\2\2\2\u026b"+
		"\u026c\5\u00c2b\2\u026c\u026d\5j\66\2\u026d}\3\2\2\2\u026e\u0271\5\16"+
		"\b\2\u026f\u0271\5\u0080A\2\u0270\u026e\3\2\2\2\u0270\u026f\3\2\2\2\u0271"+
		"\177\3\2\2\2\u0272\u0273\7N\2\2\u0273\u0081\3\2\2\2\u0274\u0277\5\u0084"+
		"C\2\u0275\u0277\5\u0086D\2\u0276\u0274\3\2\2\2\u0276\u0275\3\2\2\2\u0277"+
		"\u0083\3\2\2\2\u0278\u0279\5\u00c2b\2\u0279\u027a\7O\2\2\u027a\u027b\7"+
		"_\2\2\u027b\u0085\3\2\2\2\u027c\u027d\7P\2\2\u027d\u027f\7\20\2\2\u027e"+
		"\u0280\5\4\3\2\u027f\u027e\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0281\3\2"+
		"\2\2\u0281\u0284\7\21\2\2\u0282\u0283\7%\2\2\u0283\u0285\5\u008cG\2\u0284"+
		"\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0287\5\b"+
		"\5\2\u0287\u0087\3\2\2\2\u0288\u028a\5\u00b6\\\2\u0289\u028b\7N\2\2\u028a"+
		"\u0289\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u0089\3\2\2\2\u028c\u028d\7%"+
		"\2\2\u028d\u028e\5\u008cG\2\u028e\u008b\3\2\2\2\u028f\u0290\7Q\2\2\u0290"+
		"\u0291\7\20\2\2\u0291\u0297\7\21\2\2\u0292\u0294\5\u0090I\2\u0293\u0295"+
		"\5\u008eH\2\u0294\u0293\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0297\3\2\2"+
		"\2\u0296\u028f\3\2\2\2\u0296\u0292\3\2\2\2\u0297\u008d\3\2\2\2\u0298\u0299"+
		"\t\13\2\2\u0299\u008f\3\2\2\2\u029a\u02a2\5\u0094K\2\u029b\u029c\7R\2"+
		"\2\u029c\u029d\7\20\2\2\u029d\u02a2\7\21\2\2\u029e\u02a2\5\u00ba^\2\u029f"+
		"\u02a2\5\u0092J\2\u02a0\u02a2\5\u00c0a\2\u02a1\u029a\3\2\2\2\u02a1\u029b"+
		"\3\2\2\2\u02a1\u029e\3\2\2\2\u02a1\u029f\3\2\2\2\u02a1\u02a0\3\2\2\2\u02a2"+
		"\u0091\3\2\2\2\u02a3\u02a4\5\u00c2b\2\u02a4\u0093\3\2\2\2\u02a5\u02b0"+
		"\5\u0098M\2\u02a6\u02b0\5\u00aaV\2\u02a7\u02b0\5\u00a2R\2\u02a8\u02b0"+
		"\5\u00aeX\2\u02a9\u02b0\5\u00a6T\2\u02aa\u02b0\5\u00a0Q\2\u02ab\u02b0"+
		"\5\u009cO\2\u02ac\u02b0\5\u009aN\2\u02ad\u02b0\5\u009eP\2\u02ae\u02b0"+
		"\5\u0096L\2\u02af\u02a5\3\2\2\2\u02af\u02a6\3\2\2\2\u02af\u02a7\3\2\2"+
		"\2\u02af\u02a8\3\2\2\2\u02af\u02a9\3\2\2\2\u02af\u02aa\3\2\2\2\u02af\u02ab"+
		"\3\2\2\2\u02af\u02ac\3\2\2\2\u02af\u02ad\3\2\2\2\u02af\u02ae\3\2\2\2\u02b0"+
		"\u0095\3\2\2\2\u02b1\u02b2\7S\2\2\u02b2\u02b3\7\20\2\2\u02b3\u02b4\7\21"+
		"\2\2\u02b4\u0097\3\2\2\2\u02b5\u02b6\7T\2\2\u02b6\u02b9\7\20\2\2\u02b7"+
		"\u02ba\5\u00aaV\2\u02b8\u02ba\5\u00aeX\2\u02b9\u02b7\3\2\2\2\u02b9\u02b8"+
		"\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bc\7\21\2\2"+
		"\u02bc\u0099\3\2\2\2\u02bd\u02be\7U\2\2\u02be\u02bf\7\20\2\2\u02bf\u02c0"+
		"\7\21\2\2\u02c0\u009b\3\2\2\2\u02c1\u02c2\7V\2\2\u02c2\u02c3\7\20\2\2"+
		"\u02c3\u02c4\7\21\2\2\u02c4\u009d\3\2\2\2\u02c5\u02c6\7W\2\2\u02c6\u02c7"+
		"\7\20\2\2\u02c7\u02c8\7\21\2\2\u02c8\u009f\3\2\2\2\u02c9\u02ca\7X\2\2"+
		"\u02ca\u02cd\7\20\2\2\u02cb\u02ce\7m\2\2\u02cc\u02ce\5\u00c4c\2\u02cd"+
		"\u02cb\3\2\2\2\u02cd\u02cc\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02cf\3\2"+
		"\2\2\u02cf\u02d0\7\21\2\2\u02d0\u00a1\3\2\2\2\u02d1\u02d2\7=\2\2\u02d2"+
		"\u02d8\7\20\2\2\u02d3\u02d6\5\u00a4S\2\u02d4\u02d5\7\3\2\2\u02d5\u02d7"+
		"\5\u00b8]\2\u02d6\u02d4\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d9\3\2\2"+
		"\2\u02d8\u02d3\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02db"+
		"\7\21\2\2\u02db\u00a3\3\2\2\2\u02dc\u02df\5\u00b2Z\2\u02dd\u02df\7\32"+
		"\2\2\u02de\u02dc\3\2\2\2\u02de\u02dd\3\2\2\2\u02df\u00a5\3\2\2\2\u02e0"+
		"\u02e1\7Y\2\2\u02e1\u02e2\7\20\2\2\u02e2\u02e3\5\u00a8U\2\u02e3\u02e4"+
		"\7\21\2\2\u02e4\u00a7\3\2\2\2\u02e5\u02e6\5\u00b2Z\2\u02e6\u00a9\3\2\2"+
		"\2\u02e7\u02e8\7Z\2\2\u02e8\u02f1\7\20\2\2\u02e9\u02ef\5\u00acW\2\u02ea"+
		"\u02eb\7\3\2\2\u02eb\u02ed\5\u00b8]\2\u02ec\u02ee\7N\2\2\u02ed\u02ec\3"+
		"\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02f0\3\2\2\2\u02ef\u02ea\3\2\2\2\u02ef"+
		"\u02f0\3\2\2\2\u02f0\u02f2\3\2\2\2\u02f1\u02e9\3\2\2\2\u02f1\u02f2\3\2"+
		"\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f4\7\21\2\2\u02f4\u00ab\3\2\2\2\u02f5"+
		"\u02f8\5\u00b4[\2\u02f6\u02f8\7\32\2\2\u02f7\u02f5\3\2\2\2\u02f7\u02f6"+
		"\3\2\2\2\u02f8\u00ad\3\2\2\2\u02f9\u02fa\7[\2\2\u02fa\u02fb\7\20\2\2\u02fb"+
		"\u02fc\5\u00b0Y\2\u02fc\u02fd\7\21\2\2\u02fd\u00af\3\2\2\2\u02fe\u02ff"+
		"\5\u00b4[\2\u02ff\u00b1\3\2\2\2\u0300\u0301\5\u00c2b\2\u0301\u00b3\3\2"+
		"\2\2\u0302\u0303\5\u00c2b\2\u0303\u00b5\3\2\2\2\u0304\u0305\5\u00b8]\2"+
		"\u0305\u00b7\3\2\2\2\u0306\u0307\7h\2\2\u0307\u00b9\3\2\2\2\u0308\u030b"+
		"\5\u00bc_\2\u0309\u030b\5\u00be`\2\u030a\u0308\3\2\2\2\u030a\u0309\3\2"+
		"\2\2\u030b\u00bb\3\2\2\2\u030c\u030d\7P\2\2\u030d\u030e\7\20\2\2\u030e"+
		"\u030f\7\32\2\2\u030f\u0310\7\21\2\2\u0310\u00bd\3\2\2\2\u0311\u0312\7"+
		"P\2\2\u0312\u031b\7\20\2\2\u0313\u0318\5\u008cG\2\u0314\u0315\7\3\2\2"+
		"\u0315\u0317\5\u008cG\2\u0316\u0314\3\2\2\2\u0317\u031a\3\2\2\2\u0318"+
		"\u0316\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031c\3\2\2\2\u031a\u0318\3\2"+
		"\2\2\u031b\u0313\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031d\3\2\2\2\u031d"+
		"\u031e\7\21\2\2\u031e\u031f\7%\2\2\u031f\u0320\5\u008cG\2\u0320\u00bf"+
		"\3\2\2\2\u0321\u0322\7\20\2\2\u0322\u0323\5\u0090I\2\u0323\u0324\7\21"+
		"\2\2\u0324\u00c1\3\2\2\2\u0325\u0326\t\f\2\2\u0326\u00c3\3\2\2\2\u0327"+
		"\u032c\7\\\2\2\u0328\u032b\7b\2\2\u0329\u032b\13\2\2\2\u032a\u0328\3\2"+
		"\2\2\u032a\u0329\3\2\2\2\u032b\u032e\3\2\2\2\u032c\u032d\3\2\2\2\u032c"+
		"\u032a\3\2\2\2\u032d\u032f\3\2\2\2\u032e\u032c\3\2\2\2\u032f\u033a\7\\"+
		"\2\2\u0330\u0335\7]\2\2\u0331\u0334\7c\2\2\u0332\u0334\13\2\2\2\u0333"+
		"\u0331\3\2\2\2\u0333\u0332\3\2\2\2\u0334\u0337\3\2\2\2\u0335\u0336\3\2"+
		"\2\2\u0335\u0333\3\2\2\2\u0336\u0338\3\2\2\2\u0337\u0335\3\2\2\2\u0338"+
		"\u033a\7]\2\2\u0339\u0327\3\2\2\2\u0339\u0330\3\2\2\2\u033a\u00c5\3\2"+
		"\2\2H\u00ce\u00d4\u00e4\u00ec\u00fd\u0114\u0129\u0142\u014d\u0155\u0159"+
		"\u0163\u016e\u0179\u0184\u018f\u019a\u01a3\u01ab\u01b3\u01bb\u01c2\u01d1"+
		"\u01d6\u01db\u01e2\u01e7\u01eb\u01f3\u0205\u0208\u0210\u021c\u0222\u0226"+
		"\u0231\u0236\u0238\u0241\u0244\u024b\u0258\u0261\u0265\u0270\u0276\u027f"+
		"\u0284\u028a\u0294\u0296\u02a1\u02af\u02b9\u02cd\u02d6\u02d8\u02de\u02ed"+
		"\u02ef\u02f1\u02f7\u030a\u0318\u031b\u032a\u032c\u0333\u0335\u0339";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}