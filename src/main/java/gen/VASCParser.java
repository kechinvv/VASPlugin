// Generated from C:/Users/valer/IdeaProjects/VASPlugin/src/main/java/com/github/kechinvv/vasplugin/antlr/VASCParser.g4 by ANTLR 4.13.1
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class VASCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOT=1, COLON=2, COMMA=3, MINUS=4, L_BRACKET=5, R_BRACKET=6, L_SQUARE_BRACKET=7, 
		R_SQUARE_BRACKET=8, ASSIGN_OP=9, CLASS=10, EXTENDS=11, METHOD=12, WHILE=13, 
		LOOP=14, IS=15, END=16, RETURN=17, LIST=18, THIS=19, ARRAY=20, PRINT=21, 
		SUPER=22, IF=23, THEN=24, ELSE=25, VAR=26, TRUE=27, FALSE=28, NULL=29, 
		STRING=30, IDENTIFIER=31, DIGIT=32, MlComment=33, COMMENT=34, WS=35, NL=36, 
		BAD_CHARACTER=37;
	public static final int
		RULE_program = 0, RULE_classDeclaration = 1, RULE_identifier = 2, RULE_listType = 3, 
		RULE_arrayType = 4, RULE_genericType = 5, RULE_memberDeclaration = 6, 
		RULE_variableDeclaration = 7, RULE_methodDeclaration = 8, RULE_parameters = 9, 
		RULE_parameterDeclaration = 10, RULE_body = 11, RULE_bodyStatement = 12, 
		RULE_constructorDeclaration = 13, RULE_statement = 14, RULE_print = 15, 
		RULE_assignment = 16, RULE_whileLoop = 17, RULE_ifStatement = 18, RULE_returnStatement = 19, 
		RULE_expression = 20, RULE_arguments = 21, RULE_callable = 22, RULE_primary = 23, 
		RULE_className = 24, RULE_integerLiteral = 25, RULE_realLiteral = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classDeclaration", "identifier", "listType", "arrayType", 
			"genericType", "memberDeclaration", "variableDeclaration", "methodDeclaration", 
			"parameters", "parameterDeclaration", "body", "bodyStatement", "constructorDeclaration", 
			"statement", "print", "assignment", "whileLoop", "ifStatement", "returnStatement", 
			"expression", "arguments", "callable", "primary", "className", "integerLiteral", 
			"realLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "':'", "','", "'-'", "'('", "')'", "'['", "']'", "':='", 
			"'class'", "'extends'", "'method'", "'while'", "'loop'", "'is'", "'end'", 
			"'return'", "'List'", "'this'", "'Array'", "'println'", "'super'", "'if'", 
			"'then'", "'else'", "'var'", "'true'", "'false'", "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOT", "COLON", "COMMA", "MINUS", "L_BRACKET", "R_BRACKET", "L_SQUARE_BRACKET", 
			"R_SQUARE_BRACKET", "ASSIGN_OP", "CLASS", "EXTENDS", "METHOD", "WHILE", 
			"LOOP", "IS", "END", "RETURN", "LIST", "THIS", "ARRAY", "PRINT", "SUPER", 
			"IF", "THEN", "ELSE", "VAR", "TRUE", "FALSE", "NULL", "STRING", "IDENTIFIER", 
			"DIGIT", "MlComment", "COMMENT", "WS", "NL", "BAD_CHARACTER"
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
	public String getGrammarFileName() { return "VASCParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VASCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(VASCParser.EOF, 0); }
		public List<TerminalNode> NL() { return getTokens(VASCParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VASCParser.NL, i);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(54);
					match(NL);
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(60);
				classDeclaration();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(66);
				match(NL);
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(VASCParser.CLASS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode IS() { return getToken(VASCParser.IS, 0); }
		public TerminalNode END() { return getToken(VASCParser.END, 0); }
		public List<TerminalNode> NL() { return getTokens(VASCParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VASCParser.NL, i);
		}
		public TerminalNode EXTENDS() { return getToken(VASCParser.EXTENDS, 0); }
		public List<MemberDeclarationContext> memberDeclaration() {
			return getRuleContexts(MemberDeclarationContext.class);
		}
		public MemberDeclarationContext memberDeclaration(int i) {
			return getRuleContext(MemberDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(CLASS);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(75);
				match(NL);
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			identifier();
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(82);
					match(NL);
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(88);
				match(EXTENDS);
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(89);
					match(NL);
					}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(95);
				identifier();
				}
			}

			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(98);
				match(NL);
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			match(IS);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(105);
				match(NL);
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 67637248L) != 0)) {
				{
				{
				setState(111);
				memberDeclaration();
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(112);
					match(NL);
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			match(END);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(124);
					match(NL);
					}
					} 
				}
				setState(129);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(VASCParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListTypeContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(VASCParser.LIST, 0); }
		public GenericTypeContext genericType() {
			return getRuleContext(GenericTypeContext.class,0);
		}
		public ListTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listType; }
	}

	public final ListTypeContext listType() throws RecognitionException {
		ListTypeContext _localctx = new ListTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_listType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(LIST);
			setState(133);
			genericType();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(VASCParser.ARRAY, 0); }
		public GenericTypeContext genericType() {
			return getRuleContext(GenericTypeContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(ARRAY);
			setState(136);
			genericType();
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

	@SuppressWarnings("CheckReturnValue")
	public static class GenericTypeContext extends ParserRuleContext {
		public TerminalNode L_SQUARE_BRACKET() { return getToken(VASCParser.L_SQUARE_BRACKET, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode R_SQUARE_BRACKET() { return getToken(VASCParser.R_SQUARE_BRACKET, 0); }
		public List<TerminalNode> NL() { return getTokens(VASCParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VASCParser.NL, i);
		}
		public GenericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericType; }
	}

	public final GenericTypeContext genericType() throws RecognitionException {
		GenericTypeContext _localctx = new GenericTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_genericType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(138);
				match(NL);
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			match(L_SQUARE_BRACKET);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(145);
				match(NL);
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			className();
			setState(152);
			match(R_SQUARE_BRACKET);
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(153);
					match(NL);
					}
					} 
				}
				setState(158);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MemberDeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_memberDeclaration);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				variableDeclaration();
				}
				break;
			case METHOD:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				methodDeclaration();
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				constructorDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(VASCParser.VAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(VASCParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(VASCParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(VASCParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VASCParser.NL, i);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(VAR);
			setState(165);
			match(IDENTIFIER);
			setState(166);
			match(COLON);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(167);
				match(NL);
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode METHOD() { return getToken(VASCParser.METHOD, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(VASCParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(VASCParser.IDENTIFIER, i);
		}
		public TerminalNode IS() { return getToken(VASCParser.IS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode END() { return getToken(VASCParser.END, 0); }
		public List<TerminalNode> NL() { return getTokens(VASCParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VASCParser.NL, i);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VASCParser.COLON, 0); }
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(METHOD);
			setState(176);
			match(IDENTIFIER);
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(177);
					match(NL);
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_BRACKET) {
				{
				setState(183);
				parameters();
				}
			}

			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(186);
					match(NL);
					}
					} 
				}
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(192);
				match(COLON);
				setState(193);
				match(IDENTIFIER);
				}
			}

			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(196);
				match(NL);
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			match(IS);
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(203);
					match(NL);
					}
					} 
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(209);
			body();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(210);
				match(NL);
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode L_BRACKET() { return getToken(VASCParser.L_BRACKET, 0); }
		public TerminalNode R_BRACKET() { return getToken(VASCParser.R_BRACKET, 0); }
		public List<TerminalNode> NL() { return getTokens(VASCParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VASCParser.NL, i);
		}
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VASCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VASCParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(L_BRACKET);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(219);
				match(NL);
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				{
				setState(225);
				parameterDeclaration();
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(226);
						match(NL);
						}
						} 
					}
					setState(231);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA || _la==NL) {
					{
					{
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(232);
						match(NL);
						}
						}
						setState(237);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(238);
					match(COMMA);
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(239);
						match(NL);
						}
						}
						setState(244);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(245);
					parameterDeclaration();
					setState(249);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(246);
							match(NL);
							}
							} 
						}
						setState(251);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
					}
					}
					}
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case R_BRACKET:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(260);
			match(R_BRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(VASCParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(VASCParser.COLON, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(VASCParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VASCParser.NL, i);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameterDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(IDENTIFIER);
			setState(263);
			match(COLON);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(264);
				match(NL);
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270);
			className();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public List<BodyStatementContext> bodyStatement() {
			return getRuleContexts(BodyStatementContext.class);
		}
		public BodyStatementContext bodyStatement(int i) {
			return getRuleContext(BodyStatementContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(VASCParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VASCParser.NL, i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7465738256L) != 0)) {
				{
				{
				setState(272);
				bodyStatement();
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(273);
						match(NL);
						}
						} 
					}
					setState(278);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				}
				}
				setState(283);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BodyStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public BodyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyStatement; }
	}

	public final BodyStatementContext bodyStatement() throws RecognitionException {
		BodyStatementContext _localctx = new BodyStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bodyStatement);
		try {
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case WHILE:
			case RETURN:
			case LIST:
			case THIS:
			case ARRAY:
			case PRINT:
			case SUPER:
			case IF:
			case TRUE:
			case FALSE:
			case NULL:
			case IDENTIFIER:
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				statement();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				variableDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(VASCParser.THIS, 0); }
		public TerminalNode IS() { return getToken(VASCParser.IS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode END() { return getToken(VASCParser.END, 0); }
		public List<TerminalNode> NL() { return getTokens(VASCParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VASCParser.NL, i);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_constructorDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(THIS);
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(289);
					match(NL);
					}
					} 
				}
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_BRACKET) {
				{
				setState(295);
				parameters();
				}
			}

			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(298);
				match(NL);
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(304);
			match(IS);
			setState(308);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(305);
					match(NL);
					}
					} 
				}
				setState(310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			setState(311);
			body();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(312);
				match(NL);
				}
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(318);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statement);
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				whileLoop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(323);
				returnStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(324);
				expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(325);
				print();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(VASCParser.PRINT, 0); }
		public TerminalNode L_BRACKET() { return getToken(VASCParser.L_BRACKET, 0); }
		public TerminalNode STRING() { return getToken(VASCParser.STRING, 0); }
		public TerminalNode R_BRACKET() { return getToken(VASCParser.R_BRACKET, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(PRINT);
			setState(329);
			match(L_BRACKET);
			setState(330);
			match(STRING);
			setState(331);
			match(R_BRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(VASCParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN_OP() { return getToken(VASCParser.ASSIGN_OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(VASCParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VASCParser.NL, i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(IDENTIFIER);
			setState(334);
			match(ASSIGN_OP);
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(335);
				match(NL);
				}
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(341);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(VASCParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LOOP() { return getToken(VASCParser.LOOP, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode END() { return getToken(VASCParser.END, 0); }
		public List<TerminalNode> NL() { return getTokens(VASCParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VASCParser.NL, i);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_whileLoop);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(WHILE);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(344);
				match(NL);
				}
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(350);
			expression();
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(351);
				match(NL);
				}
				}
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(357);
			match(LOOP);
			setState(361);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(358);
					match(NL);
					}
					} 
				}
				setState(363);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			setState(364);
			body();
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(365);
				match(NL);
				}
				}
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(371);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(VASCParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(VASCParser.THEN, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public TerminalNode END() { return getToken(VASCParser.END, 0); }
		public List<TerminalNode> NL() { return getTokens(VASCParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VASCParser.NL, i);
		}
		public TerminalNode ELSE() { return getToken(VASCParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(IF);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(374);
				match(NL);
				}
				}
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(380);
			expression();
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(381);
				match(NL);
				}
				}
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(387);
			match(THEN);
			setState(391);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(388);
					match(NL);
					}
					} 
				}
				setState(393);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			setState(394);
			body();
			setState(398);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(395);
					match(NL);
					}
					} 
				}
				setState(400);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(401);
				match(ELSE);
				setState(405);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(402);
						match(NL);
						}
						} 
					}
					setState(407);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				setState(408);
				body();
				}
			}

			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(411);
				match(NL);
				}
				}
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(417);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(VASCParser.RETURN, 0); }
		public List<TerminalNode> NL() { return getTokens(VASCParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VASCParser.NL, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_returnStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(RETURN);
			setState(423);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(420);
					match(NL);
					}
					} 
				}
				setState(425);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(426);
				expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public CallableContext callable() {
			return getRuleContext(CallableContext.class,0);
		}
		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}
		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(VASCParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(VASCParser.DOT, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(VASCParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(VASCParser.IDENTIFIER, i);
		}
		public List<TerminalNode> NL() { return getTokens(VASCParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VASCParser.NL, i);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expression);
		int _la;
		try {
			int _alt;
			setState(456);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIST:
			case THIS:
			case ARRAY:
			case SUPER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				callable();
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==L_BRACKET) {
					{
					setState(430);
					arguments();
					}
				}

				setState(452);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(436);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(433);
							match(NL);
							}
							}
							setState(438);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(439);
						match(DOT);
						setState(440);
						match(IDENTIFIER);
						setState(444);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(441);
								match(NL);
								}
								} 
							}
							setState(446);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
						}
						setState(448);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==L_BRACKET) {
							{
							setState(447);
							arguments();
							}
						}

						}
						} 
					}
					setState(454);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
				}
				break;
			case MINUS:
			case TRUE:
			case FALSE:
			case NULL:
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				primary();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode L_BRACKET() { return getToken(VASCParser.L_BRACKET, 0); }
		public TerminalNode R_BRACKET() { return getToken(VASCParser.R_BRACKET, 0); }
		public List<TerminalNode> NL() { return getTokens(VASCParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VASCParser.NL, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VASCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VASCParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_arguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(L_BRACKET);
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(459);
				match(NL);
				}
				}
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(492);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case LIST:
			case THIS:
			case ARRAY:
			case SUPER:
			case TRUE:
			case FALSE:
			case NULL:
			case IDENTIFIER:
			case DIGIT:
				{
				{
				setState(465);
				expression();
				setState(482);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(469);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(466);
							match(NL);
							}
							}
							setState(471);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(472);
						match(COMMA);
						setState(476);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(473);
							match(NL);
							}
							}
							setState(478);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(479);
						expression();
						}
						} 
					}
					setState(484);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				}
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(485);
					match(NL);
					}
					}
					setState(490);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case R_BRACKET:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(494);
			match(R_BRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CallableContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(VASCParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(VASCParser.SUPER, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public CallableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callable; }
	}

	public final CallableContext callable() throws RecognitionException {
		CallableContext _localctx = new CallableContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_callable);
		try {
			setState(499);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
				match(THIS);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				match(SUPER);
				}
				break;
			case LIST:
			case ARRAY:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(498);
				className();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public Token bool;
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public RealLiteralContext realLiteral() {
			return getRuleContext(RealLiteralContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(VASCParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(VASCParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(VASCParser.NULL, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_primary);
		int _la;
		try {
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(501);
				integerLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(502);
				realLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(503);
				((PrimaryContext)_localctx).bool = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
					((PrimaryContext)_localctx).bool = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(504);
				match(NULL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ListTypeContext listType() {
			return getRuleContext(ListTypeContext.class,0);
		}
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_className);
		try {
			setState(510);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(507);
				identifier();
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
				arrayType();
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 3);
				{
				setState(509);
				listType();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(VASCParser.MINUS, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(VASCParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(VASCParser.DIGIT, i);
		}
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_integerLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(512);
				match(MINUS);
				}
			}

			setState(516); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(515);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(518); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class RealLiteralContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(VASCParser.DOT, 0); }
		public TerminalNode MINUS() { return getToken(VASCParser.MINUS, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(VASCParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(VASCParser.DIGIT, i);
		}
		public RealLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realLiteral; }
	}

	public final RealLiteralContext realLiteral() throws RecognitionException {
		RealLiteralContext _localctx = new RealLiteralContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_realLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(520);
				match(MINUS);
				}
			}

			setState(524); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(523);
				match(DIGIT);
				}
				}
				setState(526); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(528);
			match(DOT);
			setState(530); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(529);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(532); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static final String _serializedATN =
		"\u0004\u0001%\u0217\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0005\u0000"+
		"8\b\u0000\n\u0000\f\u0000;\t\u0000\u0001\u0000\u0005\u0000>\b\u0000\n"+
		"\u0000\f\u0000A\t\u0000\u0001\u0000\u0005\u0000D\b\u0000\n\u0000\f\u0000"+
		"G\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001"+
		"M\b\u0001\n\u0001\f\u0001P\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"T\b\u0001\n\u0001\f\u0001W\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"[\b\u0001\n\u0001\f\u0001^\t\u0001\u0001\u0001\u0003\u0001a\b\u0001\u0001"+
		"\u0001\u0005\u0001d\b\u0001\n\u0001\f\u0001g\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001k\b\u0001\n\u0001\f\u0001n\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001r\b\u0001\n\u0001\f\u0001u\t\u0001\u0005\u0001w\b\u0001"+
		"\n\u0001\f\u0001z\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001~\b\u0001"+
		"\n\u0001\f\u0001\u0081\t\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0005"+
		"\u0005\u008c\b\u0005\n\u0005\f\u0005\u008f\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005\u0093\b\u0005\n\u0005\f\u0005\u0096\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u009b\b\u0005\n\u0005\f\u0005\u009e\t\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00a3\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00a9\b\u0007\n\u0007"+
		"\f\u0007\u00ac\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0005\b\u00b3\b\b\n\b\f\b\u00b6\t\b\u0001\b\u0003\b\u00b9\b\b\u0001\b"+
		"\u0005\b\u00bc\b\b\n\b\f\b\u00bf\t\b\u0001\b\u0001\b\u0003\b\u00c3\b\b"+
		"\u0001\b\u0005\b\u00c6\b\b\n\b\f\b\u00c9\t\b\u0001\b\u0001\b\u0005\b\u00cd"+
		"\b\b\n\b\f\b\u00d0\t\b\u0001\b\u0001\b\u0005\b\u00d4\b\b\n\b\f\b\u00d7"+
		"\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0005\t\u00dd\b\t\n\t\f\t\u00e0\t"+
		"\t\u0001\t\u0001\t\u0005\t\u00e4\b\t\n\t\f\t\u00e7\t\t\u0001\t\u0005\t"+
		"\u00ea\b\t\n\t\f\t\u00ed\t\t\u0001\t\u0001\t\u0005\t\u00f1\b\t\n\t\f\t"+
		"\u00f4\t\t\u0001\t\u0001\t\u0005\t\u00f8\b\t\n\t\f\t\u00fb\t\t\u0005\t"+
		"\u00fd\b\t\n\t\f\t\u0100\t\t\u0001\t\u0003\t\u0103\b\t\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0001\n\u0005\n\u010a\b\n\n\n\f\n\u010d\t\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0005\u000b\u0113\b\u000b\n\u000b\f\u000b\u0116"+
		"\t\u000b\u0005\u000b\u0118\b\u000b\n\u000b\f\u000b\u011b\t\u000b\u0001"+
		"\f\u0001\f\u0003\f\u011f\b\f\u0001\r\u0001\r\u0005\r\u0123\b\r\n\r\f\r"+
		"\u0126\t\r\u0001\r\u0003\r\u0129\b\r\u0001\r\u0005\r\u012c\b\r\n\r\f\r"+
		"\u012f\t\r\u0001\r\u0001\r\u0005\r\u0133\b\r\n\r\f\r\u0136\t\r\u0001\r"+
		"\u0001\r\u0005\r\u013a\b\r\n\r\f\r\u013d\t\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u0147\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0151\b\u0010\n\u0010"+
		"\f\u0010\u0154\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u015a\b\u0011\n\u0011\f\u0011\u015d\t\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u0161\b\u0011\n\u0011\f\u0011\u0164\t\u0011\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u0168\b\u0011\n\u0011\f\u0011\u016b\t\u0011\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u016f\b\u0011\n\u0011\f\u0011\u0172\t\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0005\u0012\u0178\b\u0012"+
		"\n\u0012\f\u0012\u017b\t\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u017f"+
		"\b\u0012\n\u0012\f\u0012\u0182\t\u0012\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u0186\b\u0012\n\u0012\f\u0012\u0189\t\u0012\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u018d\b\u0012\n\u0012\f\u0012\u0190\t\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u0194\b\u0012\n\u0012\f\u0012\u0197\t\u0012\u0001\u0012\u0003"+
		"\u0012\u019a\b\u0012\u0001\u0012\u0005\u0012\u019d\b\u0012\n\u0012\f\u0012"+
		"\u01a0\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u01a6\b\u0013\n\u0013\f\u0013\u01a9\t\u0013\u0001\u0013\u0003\u0013\u01ac"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u01b0\b\u0014\u0001\u0014"+
		"\u0005\u0014\u01b3\b\u0014\n\u0014\f\u0014\u01b6\t\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0005\u0014\u01bb\b\u0014\n\u0014\f\u0014\u01be\t\u0014"+
		"\u0001\u0014\u0003\u0014\u01c1\b\u0014\u0005\u0014\u01c3\b\u0014\n\u0014"+
		"\f\u0014\u01c6\t\u0014\u0001\u0014\u0003\u0014\u01c9\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0005\u0015\u01cd\b\u0015\n\u0015\f\u0015\u01d0\t\u0015\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u01d4\b\u0015\n\u0015\f\u0015\u01d7\t\u0015"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u01db\b\u0015\n\u0015\f\u0015\u01de"+
		"\t\u0015\u0001\u0015\u0005\u0015\u01e1\b\u0015\n\u0015\f\u0015\u01e4\t"+
		"\u0015\u0001\u0015\u0005\u0015\u01e7\b\u0015\n\u0015\f\u0015\u01ea\t\u0015"+
		"\u0001\u0015\u0003\u0015\u01ed\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u01f4\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u01fa\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u01ff\b\u0018\u0001\u0019\u0003\u0019\u0202\b"+
		"\u0019\u0001\u0019\u0004\u0019\u0205\b\u0019\u000b\u0019\f\u0019\u0206"+
		"\u0001\u001a\u0003\u001a\u020a\b\u001a\u0001\u001a\u0004\u001a\u020d\b"+
		"\u001a\u000b\u001a\f\u001a\u020e\u0001\u001a\u0001\u001a\u0004\u001a\u0213"+
		"\b\u001a\u000b\u001a\f\u001a\u0214\u0001\u001a\u0000\u0000\u001b\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.024\u0000\u0001\u0001\u0000\u001b\u001c\u024f\u00009\u0001"+
		"\u0000\u0000\u0000\u0002J\u0001\u0000\u0000\u0000\u0004\u0082\u0001\u0000"+
		"\u0000\u0000\u0006\u0084\u0001\u0000\u0000\u0000\b\u0087\u0001\u0000\u0000"+
		"\u0000\n\u008d\u0001\u0000\u0000\u0000\f\u00a2\u0001\u0000\u0000\u0000"+
		"\u000e\u00a4\u0001\u0000\u0000\u0000\u0010\u00af\u0001\u0000\u0000\u0000"+
		"\u0012\u00da\u0001\u0000\u0000\u0000\u0014\u0106\u0001\u0000\u0000\u0000"+
		"\u0016\u0119\u0001\u0000\u0000\u0000\u0018\u011e\u0001\u0000\u0000\u0000"+
		"\u001a\u0120\u0001\u0000\u0000\u0000\u001c\u0146\u0001\u0000\u0000\u0000"+
		"\u001e\u0148\u0001\u0000\u0000\u0000 \u014d\u0001\u0000\u0000\u0000\""+
		"\u0157\u0001\u0000\u0000\u0000$\u0175\u0001\u0000\u0000\u0000&\u01a3\u0001"+
		"\u0000\u0000\u0000(\u01c8\u0001\u0000\u0000\u0000*\u01ca\u0001\u0000\u0000"+
		"\u0000,\u01f3\u0001\u0000\u0000\u0000.\u01f9\u0001\u0000\u0000\u00000"+
		"\u01fe\u0001\u0000\u0000\u00002\u0201\u0001\u0000\u0000\u00004\u0209\u0001"+
		"\u0000\u0000\u000068\u0005$\u0000\u000076\u0001\u0000\u0000\u00008;\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000"+
		":?\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000<>\u0003\u0002\u0001"+
		"\u0000=<\u0001\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000"+
		"\u0000\u0000?@\u0001\u0000\u0000\u0000@E\u0001\u0000\u0000\u0000A?\u0001"+
		"\u0000\u0000\u0000BD\u0005$\u0000\u0000CB\u0001\u0000\u0000\u0000DG\u0001"+
		"\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000"+
		"FH\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HI\u0005\u0000\u0000"+
		"\u0001I\u0001\u0001\u0000\u0000\u0000JN\u0005\n\u0000\u0000KM\u0005$\u0000"+
		"\u0000LK\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000"+
		"\u0000\u0000NO\u0001\u0000\u0000\u0000OQ\u0001\u0000\u0000\u0000PN\u0001"+
		"\u0000\u0000\u0000QU\u0003\u0004\u0002\u0000RT\u0005$\u0000\u0000SR\u0001"+
		"\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000"+
		"UV\u0001\u0000\u0000\u0000V`\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000"+
		"\u0000X\\\u0005\u000b\u0000\u0000Y[\u0005$\u0000\u0000ZY\u0001\u0000\u0000"+
		"\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000"+
		"\u0000\u0000]_\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000_a\u0003"+
		"\u0004\u0002\u0000`X\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000"+
		"ae\u0001\u0000\u0000\u0000bd\u0005$\u0000\u0000cb\u0001\u0000\u0000\u0000"+
		"dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000"+
		"\u0000fh\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000hl\u0005\u000f"+
		"\u0000\u0000ik\u0005$\u0000\u0000ji\u0001\u0000\u0000\u0000kn\u0001\u0000"+
		"\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mx\u0001"+
		"\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000os\u0003\f\u0006\u0000pr\u0005"+
		"$\u0000\u0000qp\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001"+
		"\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000"+
		"us\u0001\u0000\u0000\u0000vo\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000"+
		"\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y{\u0001\u0000"+
		"\u0000\u0000zx\u0001\u0000\u0000\u0000{\u007f\u0005\u0010\u0000\u0000"+
		"|~\u0005$\u0000\u0000}|\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000"+
		"\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000"+
		"\u0080\u0003\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0005\u001f\u0000\u0000\u0083\u0005\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0005\u0012\u0000\u0000\u0085\u0086\u0003\n\u0005\u0000\u0086"+
		"\u0007\u0001\u0000\u0000\u0000\u0087\u0088\u0005\u0014\u0000\u0000\u0088"+
		"\u0089\u0003\n\u0005\u0000\u0089\t\u0001\u0000\u0000\u0000\u008a\u008c"+
		"\u0005$\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u008f\u0001"+
		"\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001"+
		"\u0000\u0000\u0000\u008e\u0090\u0001\u0000\u0000\u0000\u008f\u008d\u0001"+
		"\u0000\u0000\u0000\u0090\u0094\u0005\u0007\u0000\u0000\u0091\u0093\u0005"+
		"$\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000"+
		"\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000"+
		"\u0000\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u00030\u0018\u0000\u0098\u009c\u0005\b\u0000"+
		"\u0000\u0099\u009b\u0005$\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000"+
		"\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u000b\u0001\u0000\u0000\u0000"+
		"\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u00a3\u0003\u000e\u0007\u0000"+
		"\u00a0\u00a3\u0003\u0010\b\u0000\u00a1\u00a3\u0003\u001a\r\u0000\u00a2"+
		"\u009f\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a3\r\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0005\u001a\u0000\u0000\u00a5\u00a6\u0005\u001f\u0000\u0000\u00a6\u00aa"+
		"\u0005\u0002\u0000\u0000\u00a7\u00a9\u0005$\u0000\u0000\u00a8\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ad\u0001"+
		"\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad\u00ae\u0003"+
		"(\u0014\u0000\u00ae\u000f\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\f"+
		"\u0000\u0000\u00b0\u00b4\u0005\u001f\u0000\u0000\u00b1\u00b3\u0005$\u0000"+
		"\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b9\u0003\u0012\t\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00bd\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bc\u0005$\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bf\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0001\u0000\u0000\u0000\u00be\u00c2\u0001\u0000\u0000\u0000\u00bf"+
		"\u00bd\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\u0002\u0000\u0000\u00c1"+
		"\u00c3\u0005\u001f\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c7\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c6\u0005$\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c9"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u0001\u0000\u0000\u0000\u00c8\u00ca\u0001\u0000\u0000\u0000\u00c9\u00c7"+
		"\u0001\u0000\u0000\u0000\u00ca\u00ce\u0005\u000f\u0000\u0000\u00cb\u00cd"+
		"\u0005$\u0000\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cd\u00d0\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d1\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d5\u0003\u0016\u000b\u0000\u00d2\u00d4\u0005"+
		"$\u0000\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d9\u0005\u0010\u0000\u0000\u00d9\u0011\u0001\u0000"+
		"\u0000\u0000\u00da\u00de\u0005\u0005\u0000\u0000\u00db\u00dd\u0005$\u0000"+
		"\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dd\u00e0\u0001\u0000\u0000"+
		"\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000"+
		"\u0000\u00df\u0102\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e5\u0003\u0014\n\u0000\u00e2\u00e4\u0005$\u0000\u0000"+
		"\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e6\u00fe\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e8\u00ea\u0005$\u0000\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00ea"+
		"\u00ed\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ee\u0001\u0000\u0000\u0000\u00ed"+
		"\u00eb\u0001\u0000\u0000\u0000\u00ee\u00f2\u0005\u0003\u0000\u0000\u00ef"+
		"\u00f1\u0005$\u0000\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f9\u0003\u0014\n\u0000\u00f6\u00f8\u0005"+
		"$\u0000\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f8\u00fb\u0001\u0000"+
		"\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fc\u00eb\u0001\u0000\u0000\u0000\u00fd\u0100\u0001\u0000"+
		"\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000"+
		"\u0000\u0000\u00ff\u0103\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000"+
		"\u0000\u0000\u0101\u0103\u0001\u0000\u0000\u0000\u0102\u00e1\u0001\u0000"+
		"\u0000\u0000\u0102\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000"+
		"\u0000\u0000\u0104\u0105\u0005\u0006\u0000\u0000\u0105\u0013\u0001\u0000"+
		"\u0000\u0000\u0106\u0107\u0005\u001f\u0000\u0000\u0107\u010b\u0005\u0002"+
		"\u0000\u0000\u0108\u010a\u0005$\u0000\u0000\u0109\u0108\u0001\u0000\u0000"+
		"\u0000\u010a\u010d\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000"+
		"\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010e\u0001\u0000\u0000"+
		"\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010e\u010f\u00030\u0018\u0000"+
		"\u010f\u0015\u0001\u0000\u0000\u0000\u0110\u0114\u0003\u0018\f\u0000\u0111"+
		"\u0113\u0005$\u0000\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u0113\u0116"+
		"\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114\u0115"+
		"\u0001\u0000\u0000\u0000\u0115\u0118\u0001\u0000\u0000\u0000\u0116\u0114"+
		"\u0001\u0000\u0000\u0000\u0117\u0110\u0001\u0000\u0000\u0000\u0118\u011b"+
		"\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u011a"+
		"\u0001\u0000\u0000\u0000\u011a\u0017\u0001\u0000\u0000\u0000\u011b\u0119"+
		"\u0001\u0000\u0000\u0000\u011c\u011f\u0003\u001c\u000e\u0000\u011d\u011f"+
		"\u0003\u000e\u0007\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011e\u011d"+
		"\u0001\u0000\u0000\u0000\u011f\u0019\u0001\u0000\u0000\u0000\u0120\u0124"+
		"\u0005\u0013\u0000\u0000\u0121\u0123\u0005$\u0000\u0000\u0122\u0121\u0001"+
		"\u0000\u0000\u0000\u0123\u0126\u0001\u0000\u0000\u0000\u0124\u0122\u0001"+
		"\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0128\u0001"+
		"\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0127\u0129\u0003"+
		"\u0012\t\u0000\u0128\u0127\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000"+
		"\u0000\u0000\u0129\u012d\u0001\u0000\u0000\u0000\u012a\u012c\u0005$\u0000"+
		"\u0000\u012b\u012a\u0001\u0000\u0000\u0000\u012c\u012f\u0001\u0000\u0000"+
		"\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000"+
		"\u0000\u012e\u0130\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000"+
		"\u0000\u0130\u0134\u0005\u000f\u0000\u0000\u0131\u0133\u0005$\u0000\u0000"+
		"\u0132\u0131\u0001\u0000\u0000\u0000\u0133\u0136\u0001\u0000\u0000\u0000"+
		"\u0134\u0132\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000"+
		"\u0135\u0137\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000\u0000"+
		"\u0137\u013b\u0003\u0016\u000b\u0000\u0138\u013a\u0005$\u0000\u0000\u0139"+
		"\u0138\u0001\u0000\u0000\u0000\u013a\u013d\u0001\u0000\u0000\u0000\u013b"+
		"\u0139\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c"+
		"\u013e\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013e"+
		"\u013f\u0005\u0010\u0000\u0000\u013f\u001b\u0001\u0000\u0000\u0000\u0140"+
		"\u0147\u0003 \u0010\u0000\u0141\u0147\u0003\"\u0011\u0000\u0142\u0147"+
		"\u0003$\u0012\u0000\u0143\u0147\u0003&\u0013\u0000\u0144\u0147\u0003("+
		"\u0014\u0000\u0145\u0147\u0003\u001e\u000f\u0000\u0146\u0140\u0001\u0000"+
		"\u0000\u0000\u0146\u0141\u0001\u0000\u0000\u0000\u0146\u0142\u0001\u0000"+
		"\u0000\u0000\u0146\u0143\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000"+
		"\u0000\u0000\u0146\u0145\u0001\u0000\u0000\u0000\u0147\u001d\u0001\u0000"+
		"\u0000\u0000\u0148\u0149\u0005\u0015\u0000\u0000\u0149\u014a\u0005\u0005"+
		"\u0000\u0000\u014a\u014b\u0005\u001e\u0000\u0000\u014b\u014c\u0005\u0006"+
		"\u0000\u0000\u014c\u001f\u0001\u0000\u0000\u0000\u014d\u014e\u0005\u001f"+
		"\u0000\u0000\u014e\u0152\u0005\t\u0000\u0000\u014f\u0151\u0005$\u0000"+
		"\u0000\u0150\u014f\u0001\u0000\u0000\u0000\u0151\u0154\u0001\u0000\u0000"+
		"\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000"+
		"\u0000\u0153\u0155\u0001\u0000\u0000\u0000\u0154\u0152\u0001\u0000\u0000"+
		"\u0000\u0155\u0156\u0003(\u0014\u0000\u0156!\u0001\u0000\u0000\u0000\u0157"+
		"\u015b\u0005\r\u0000\u0000\u0158\u015a\u0005$\u0000\u0000\u0159\u0158"+
		"\u0001\u0000\u0000\u0000\u015a\u015d\u0001\u0000\u0000\u0000\u015b\u0159"+
		"\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u015e"+
		"\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015e\u0162"+
		"\u0003(\u0014\u0000\u015f\u0161\u0005$\u0000\u0000\u0160\u015f\u0001\u0000"+
		"\u0000\u0000\u0161\u0164\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000"+
		"\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0165\u0001\u0000"+
		"\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0165\u0169\u0005\u000e"+
		"\u0000\u0000\u0166\u0168\u0005$\u0000\u0000\u0167\u0166\u0001\u0000\u0000"+
		"\u0000\u0168\u016b\u0001\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000"+
		"\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a\u016c\u0001\u0000\u0000"+
		"\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016c\u0170\u0003\u0016\u000b"+
		"\u0000\u016d\u016f\u0005$\u0000\u0000\u016e\u016d\u0001\u0000\u0000\u0000"+
		"\u016f\u0172\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000"+
		"\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u0173\u0001\u0000\u0000\u0000"+
		"\u0172\u0170\u0001\u0000\u0000\u0000\u0173\u0174\u0005\u0010\u0000\u0000"+
		"\u0174#\u0001\u0000\u0000\u0000\u0175\u0179\u0005\u0017\u0000\u0000\u0176"+
		"\u0178\u0005$\u0000\u0000\u0177\u0176\u0001\u0000\u0000\u0000\u0178\u017b"+
		"\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u0179\u017a"+
		"\u0001\u0000\u0000\u0000\u017a\u017c\u0001\u0000\u0000\u0000\u017b\u0179"+
		"\u0001\u0000\u0000\u0000\u017c\u0180\u0003(\u0014\u0000\u017d\u017f\u0005"+
		"$\u0000\u0000\u017e\u017d\u0001\u0000\u0000\u0000\u017f\u0182\u0001\u0000"+
		"\u0000\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000"+
		"\u0000\u0000\u0181\u0183\u0001\u0000\u0000\u0000\u0182\u0180\u0001\u0000"+
		"\u0000\u0000\u0183\u0187\u0005\u0018\u0000\u0000\u0184\u0186\u0005$\u0000"+
		"\u0000\u0185\u0184\u0001\u0000\u0000\u0000\u0186\u0189\u0001\u0000\u0000"+
		"\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000"+
		"\u0000\u0188\u018a\u0001\u0000\u0000\u0000\u0189\u0187\u0001\u0000\u0000"+
		"\u0000\u018a\u018e\u0003\u0016\u000b\u0000\u018b\u018d\u0005$\u0000\u0000"+
		"\u018c\u018b\u0001\u0000\u0000\u0000\u018d\u0190\u0001\u0000\u0000\u0000"+
		"\u018e\u018c\u0001\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000"+
		"\u018f\u0199\u0001\u0000\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000"+
		"\u0191\u0195\u0005\u0019\u0000\u0000\u0192\u0194\u0005$\u0000\u0000\u0193"+
		"\u0192\u0001\u0000\u0000\u0000\u0194\u0197\u0001\u0000\u0000\u0000\u0195"+
		"\u0193\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196"+
		"\u0198\u0001\u0000\u0000\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0198"+
		"\u019a\u0003\u0016\u000b\u0000\u0199\u0191\u0001\u0000\u0000\u0000\u0199"+
		"\u019a\u0001\u0000\u0000\u0000\u019a\u019e\u0001\u0000\u0000\u0000\u019b"+
		"\u019d\u0005$\u0000\u0000\u019c\u019b\u0001\u0000\u0000\u0000\u019d\u01a0"+
		"\u0001\u0000\u0000\u0000\u019e\u019c\u0001\u0000\u0000\u0000\u019e\u019f"+
		"\u0001\u0000\u0000\u0000\u019f\u01a1\u0001\u0000\u0000\u0000\u01a0\u019e"+
		"\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005\u0010\u0000\u0000\u01a2%\u0001"+
		"\u0000\u0000\u0000\u01a3\u01a7\u0005\u0011\u0000\u0000\u01a4\u01a6\u0005"+
		"$\u0000\u0000\u01a5\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a9\u0001\u0000"+
		"\u0000\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000"+
		"\u0000\u0000\u01a8\u01ab\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000"+
		"\u0000\u0000\u01aa\u01ac\u0003(\u0014\u0000\u01ab\u01aa\u0001\u0000\u0000"+
		"\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\'\u0001\u0000\u0000\u0000"+
		"\u01ad\u01af\u0003,\u0016\u0000\u01ae\u01b0\u0003*\u0015\u0000\u01af\u01ae"+
		"\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0\u01c4"+
		"\u0001\u0000\u0000\u0000\u01b1\u01b3\u0005$\u0000\u0000\u01b2\u01b1\u0001"+
		"\u0000\u0000\u0000\u01b3\u01b6\u0001\u0000\u0000\u0000\u01b4\u01b2\u0001"+
		"\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5\u01b7\u0001"+
		"\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b7\u01b8\u0005"+
		"\u0001\u0000\u0000\u01b8\u01bc\u0005\u001f\u0000\u0000\u01b9\u01bb\u0005"+
		"$\u0000\u0000\u01ba\u01b9\u0001\u0000\u0000\u0000\u01bb\u01be\u0001\u0000"+
		"\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000"+
		"\u0000\u0000\u01bd\u01c0\u0001\u0000\u0000\u0000\u01be\u01bc\u0001\u0000"+
		"\u0000\u0000\u01bf\u01c1\u0003*\u0015\u0000\u01c0\u01bf\u0001\u0000\u0000"+
		"\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c2\u01b4\u0001\u0000\u0000\u0000\u01c3\u01c6\u0001\u0000\u0000"+
		"\u0000\u01c4\u01c2\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000\u0000"+
		"\u0000\u01c5\u01c9\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001\u0000\u0000"+
		"\u0000\u01c7\u01c9\u0003.\u0017\u0000\u01c8\u01ad\u0001\u0000\u0000\u0000"+
		"\u01c8\u01c7\u0001\u0000\u0000\u0000\u01c9)\u0001\u0000\u0000\u0000\u01ca"+
		"\u01ce\u0005\u0005\u0000\u0000\u01cb\u01cd\u0005$\u0000\u0000\u01cc\u01cb"+
		"\u0001\u0000\u0000\u0000\u01cd\u01d0\u0001\u0000\u0000\u0000\u01ce\u01cc"+
		"\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf\u01ec"+
		"\u0001\u0000\u0000\u0000\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d1\u01e2"+
		"\u0003(\u0014\u0000\u01d2\u01d4\u0005$\u0000\u0000\u01d3\u01d2\u0001\u0000"+
		"\u0000\u0000\u01d4\u01d7\u0001\u0000\u0000\u0000\u01d5\u01d3\u0001\u0000"+
		"\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6\u01d8\u0001\u0000"+
		"\u0000\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d8\u01dc\u0005\u0003"+
		"\u0000\u0000\u01d9\u01db\u0005$\u0000\u0000\u01da\u01d9\u0001\u0000\u0000"+
		"\u0000\u01db\u01de\u0001\u0000\u0000\u0000\u01dc\u01da\u0001\u0000\u0000"+
		"\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u01df\u0001\u0000\u0000"+
		"\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01df\u01e1\u0003(\u0014\u0000"+
		"\u01e0\u01d5\u0001\u0000\u0000\u0000\u01e1\u01e4\u0001\u0000\u0000\u0000"+
		"\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000"+
		"\u01e3\u01e8\u0001\u0000\u0000\u0000\u01e4\u01e2\u0001\u0000\u0000\u0000"+
		"\u01e5\u01e7\u0005$\u0000\u0000\u01e6\u01e5\u0001\u0000\u0000\u0000\u01e7"+
		"\u01ea\u0001\u0000\u0000\u0000\u01e8\u01e6\u0001\u0000\u0000\u0000\u01e8"+
		"\u01e9\u0001\u0000\u0000\u0000\u01e9\u01ed\u0001\u0000\u0000\u0000\u01ea"+
		"\u01e8\u0001\u0000\u0000\u0000\u01eb\u01ed\u0001\u0000\u0000\u0000\u01ec"+
		"\u01d1\u0001\u0000\u0000\u0000\u01ec\u01eb\u0001\u0000\u0000\u0000\u01ed"+
		"\u01ee\u0001\u0000\u0000\u0000\u01ee\u01ef\u0005\u0006\u0000\u0000\u01ef"+
		"+\u0001\u0000\u0000\u0000\u01f0\u01f4\u0005\u0013\u0000\u0000\u01f1\u01f4"+
		"\u0005\u0016\u0000\u0000\u01f2\u01f4\u00030\u0018\u0000\u01f3\u01f0\u0001"+
		"\u0000\u0000\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f3\u01f2\u0001"+
		"\u0000\u0000\u0000\u01f4-\u0001\u0000\u0000\u0000\u01f5\u01fa\u00032\u0019"+
		"\u0000\u01f6\u01fa\u00034\u001a\u0000\u01f7\u01fa\u0007\u0000\u0000\u0000"+
		"\u01f8\u01fa\u0005\u001d\u0000\u0000\u01f9\u01f5\u0001\u0000\u0000\u0000"+
		"\u01f9\u01f6\u0001\u0000\u0000\u0000\u01f9\u01f7\u0001\u0000\u0000\u0000"+
		"\u01f9\u01f8\u0001\u0000\u0000\u0000\u01fa/\u0001\u0000\u0000\u0000\u01fb"+
		"\u01ff\u0003\u0004\u0002\u0000\u01fc\u01ff\u0003\b\u0004\u0000\u01fd\u01ff"+
		"\u0003\u0006\u0003\u0000\u01fe\u01fb\u0001\u0000\u0000\u0000\u01fe\u01fc"+
		"\u0001\u0000\u0000\u0000\u01fe\u01fd\u0001\u0000\u0000\u0000\u01ff1\u0001"+
		"\u0000\u0000\u0000\u0200\u0202\u0005\u0004\u0000\u0000\u0201\u0200\u0001"+
		"\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000\u0000\u0202\u0204\u0001"+
		"\u0000\u0000\u0000\u0203\u0205\u0005 \u0000\u0000\u0204\u0203\u0001\u0000"+
		"\u0000\u0000\u0205\u0206\u0001\u0000\u0000\u0000\u0206\u0204\u0001\u0000"+
		"\u0000\u0000\u0206\u0207\u0001\u0000\u0000\u0000\u02073\u0001\u0000\u0000"+
		"\u0000\u0208\u020a\u0005\u0004\u0000\u0000\u0209\u0208\u0001\u0000\u0000"+
		"\u0000\u0209\u020a\u0001\u0000\u0000\u0000\u020a\u020c\u0001\u0000\u0000"+
		"\u0000\u020b\u020d\u0005 \u0000\u0000\u020c\u020b\u0001\u0000\u0000\u0000"+
		"\u020d\u020e\u0001\u0000\u0000\u0000\u020e\u020c\u0001\u0000\u0000\u0000"+
		"\u020e\u020f\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000\u0000\u0000"+
		"\u0210\u0212\u0005\u0001\u0000\u0000\u0211\u0213\u0005 \u0000\u0000\u0212"+
		"\u0211\u0001\u0000\u0000\u0000\u0213\u0214\u0001\u0000\u0000\u0000\u0214"+
		"\u0212\u0001\u0000\u0000\u0000\u0214\u0215\u0001\u0000\u0000\u0000\u0215"+
		"5\u0001\u0000\u0000\u0000K9?ENU\\`elsx\u007f\u008d\u0094\u009c\u00a2\u00aa"+
		"\u00b4\u00b8\u00bd\u00c2\u00c7\u00ce\u00d5\u00de\u00e5\u00eb\u00f2\u00f9"+
		"\u00fe\u0102\u010b\u0114\u0119\u011e\u0124\u0128\u012d\u0134\u013b\u0146"+
		"\u0152\u015b\u0162\u0169\u0170\u0179\u0180\u0187\u018e\u0195\u0199\u019e"+
		"\u01a7\u01ab\u01af\u01b4\u01bc\u01c0\u01c4\u01c8\u01ce\u01d5\u01dc\u01e2"+
		"\u01e8\u01ec\u01f3\u01f9\u01fe\u0201\u0206\u0209\u020e\u0214";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}