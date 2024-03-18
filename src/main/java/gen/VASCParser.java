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
		RULE_program = 0, RULE_classDeclaration = 1, RULE_listType = 2, RULE_arrayType = 3, 
		RULE_genericType = 4, RULE_memberDeclaration = 5, RULE_variableDeclaration = 6, 
		RULE_initializedVariable = 7, RULE_uninitializedVariable = 8, RULE_methodDeclaration = 9, 
		RULE_parameters = 10, RULE_parameterDeclaration = 11, RULE_body = 12, 
		RULE_bodyStatement = 13, RULE_constructorDeclaration = 14, RULE_statement = 15, 
		RULE_print = 16, RULE_assignment = 17, RULE_whileLoop = 18, RULE_ifStatement = 19, 
		RULE_returnStatement = 20, RULE_expression = 21, RULE_arguments = 22, 
		RULE_callable = 23, RULE_primary = 24, RULE_type = 25, RULE_className = 26, 
		RULE_integerLiteral = 27, RULE_realLiteral = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classDeclaration", "listType", "arrayType", "genericType", 
			"memberDeclaration", "variableDeclaration", "initializedVariable", "uninitializedVariable", 
			"methodDeclaration", "parameters", "parameterDeclaration", "body", "bodyStatement", 
			"constructorDeclaration", "statement", "print", "assignment", "whileLoop", 
			"ifStatement", "returnStatement", "expression", "arguments", "callable", 
			"primary", "type", "className", "integerLiteral", "realLiteral"
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
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(58);
					match(NL);
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(64);
				classDeclaration();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(70);
				match(NL);
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(VASCParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(VASCParser.IDENTIFIER, i);
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
			setState(78);
			match(CLASS);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(79);
				match(NL);
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			match(IDENTIFIER);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(86);
					match(NL);
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(92);
				match(EXTENDS);
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(93);
					match(NL);
					}
					}
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(99);
				match(IDENTIFIER);
				}
			}

			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(102);
				match(NL);
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			match(IS);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(109);
				match(NL);
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 67637248L) != 0)) {
				{
				{
				setState(115);
				memberDeclaration();
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(116);
					match(NL);
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			match(END);
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(128);
					match(NL);
					}
					} 
				}
				setState(133);
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
		enterRule(_localctx, 4, RULE_listType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(LIST);
			setState(135);
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
		enterRule(_localctx, 6, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(ARRAY);
			setState(138);
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
		enterRule(_localctx, 8, RULE_genericType);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(140);
				match(NL);
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			match(L_SQUARE_BRACKET);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(147);
				match(NL);
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
			className();
			setState(154);
			match(R_SQUARE_BRACKET);
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(155);
					match(NL);
					}
					} 
				}
				setState(160);
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
		enterRule(_localctx, 10, RULE_memberDeclaration);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				variableDeclaration();
				}
				break;
			case METHOD:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				methodDeclaration();
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
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
		public UninitializedVariableContext uninitializedVariable() {
			return getRuleContext(UninitializedVariableContext.class,0);
		}
		public InitializedVariableContext initializedVariable() {
			return getRuleContext(InitializedVariableContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableDeclaration);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				uninitializedVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				initializedVariable();
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
	public static class InitializedVariableContext extends ParserRuleContext {
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
		public InitializedVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializedVariable; }
	}

	public final InitializedVariableContext initializedVariable() throws RecognitionException {
		InitializedVariableContext _localctx = new InitializedVariableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_initializedVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(VAR);
			setState(171);
			match(IDENTIFIER);
			setState(172);
			match(COLON);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(173);
				match(NL);
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179);
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
	public static class UninitializedVariableContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(VASCParser.VAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(VASCParser.IDENTIFIER, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public UninitializedVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uninitializedVariable; }
	}

	public final UninitializedVariableContext uninitializedVariable() throws RecognitionException {
		UninitializedVariableContext _localctx = new UninitializedVariableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_uninitializedVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(VAR);
			setState(182);
			match(IDENTIFIER);
			setState(183);
			type();
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
		public TerminalNode IDENTIFIER() { return getToken(VASCParser.IDENTIFIER, 0); }
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(METHOD);
			setState(186);
			match(IDENTIFIER);
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(187);
					match(NL);
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_BRACKET) {
				{
				setState(193);
				parameters();
				}
			}

			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(196);
					match(NL);
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(202);
				type();
				}
			}

			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(205);
				match(NL);
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
			match(IS);
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(212);
					match(NL);
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(218);
			body();
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
			setState(225);
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
		enterRule(_localctx, 20, RULE_parameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(L_BRACKET);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(228);
				match(NL);
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				{
				setState(234);
				parameterDeclaration();
				setState(238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(235);
						match(NL);
						}
						} 
					}
					setState(240);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA || _la==NL) {
					{
					{
					setState(244);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(241);
						match(NL);
						}
						}
						setState(246);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(247);
					match(COMMA);
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(248);
						match(NL);
						}
						}
						setState(253);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(254);
					parameterDeclaration();
					setState(258);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(255);
							match(NL);
							}
							} 
						}
						setState(260);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					}
					}
					}
					setState(265);
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
			setState(269);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parameterDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(IDENTIFIER);
			setState(272);
			type();
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
		enterRule(_localctx, 24, RULE_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7465738256L) != 0)) {
				{
				{
				setState(274);
				bodyStatement();
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(275);
						match(NL);
						}
						} 
					}
					setState(280);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				}
				}
				setState(285);
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
		enterRule(_localctx, 26, RULE_bodyStatement);
		try {
			setState(288);
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
				setState(286);
				statement();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
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
		enterRule(_localctx, 28, RULE_constructorDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(THIS);
			setState(294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(291);
					match(NL);
					}
					} 
				}
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_BRACKET) {
				{
				setState(297);
				parameters();
				}
			}

			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(300);
				match(NL);
				}
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(306);
			match(IS);
			setState(310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(307);
					match(NL);
					}
					} 
				}
				setState(312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			setState(313);
			body();
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(314);
				match(NL);
				}
				}
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(320);
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
		enterRule(_localctx, 30, RULE_statement);
		try {
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				whileLoop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(325);
				returnStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(326);
				expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(327);
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
		enterRule(_localctx, 32, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(PRINT);
			setState(331);
			match(L_BRACKET);
			setState(332);
			match(STRING);
			setState(333);
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
		enterRule(_localctx, 34, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(IDENTIFIER);
			setState(336);
			match(ASSIGN_OP);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(337);
				match(NL);
				}
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(343);
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
		enterRule(_localctx, 36, RULE_whileLoop);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(WHILE);
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(346);
				match(NL);
				}
				}
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(352);
			expression();
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(353);
				match(NL);
				}
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(359);
			match(LOOP);
			setState(363);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(360);
					match(NL);
					}
					} 
				}
				setState(365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			setState(366);
			body();
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(367);
				match(NL);
				}
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(373);
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
		enterRule(_localctx, 38, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(IF);
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(376);
				match(NL);
				}
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(382);
			expression();
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(383);
				match(NL);
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(389);
			match(THEN);
			setState(393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(390);
					match(NL);
					}
					} 
				}
				setState(395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			setState(396);
			body();
			setState(400);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(397);
					match(NL);
					}
					} 
				}
				setState(402);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(403);
				match(ELSE);
				setState(407);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(404);
						match(NL);
						}
						} 
					}
					setState(409);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				setState(410);
				body();
				}
			}

			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(413);
				match(NL);
				}
				}
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(419);
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
		enterRule(_localctx, 40, RULE_returnStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(RETURN);
			setState(425);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(422);
					match(NL);
					}
					} 
				}
				setState(427);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(428);
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
		enterRule(_localctx, 42, RULE_expression);
		int _la;
		try {
			int _alt;
			setState(458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIST:
			case THIS:
			case ARRAY:
			case SUPER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				callable();
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==L_BRACKET) {
					{
					setState(432);
					arguments();
					}
				}

				setState(454);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(438);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(435);
							match(NL);
							}
							}
							setState(440);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(441);
						match(DOT);
						setState(442);
						match(IDENTIFIER);
						setState(446);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(443);
								match(NL);
								}
								} 
							}
							setState(448);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
						}
						setState(450);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==L_BRACKET) {
							{
							setState(449);
							arguments();
							}
						}

						}
						} 
					}
					setState(456);
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
				setState(457);
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
		enterRule(_localctx, 44, RULE_arguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(L_BRACKET);
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(461);
				match(NL);
				}
				}
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(494);
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
				setState(467);
				expression();
				setState(484);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(471);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(468);
							match(NL);
							}
							}
							setState(473);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(474);
						match(COMMA);
						setState(478);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(475);
							match(NL);
							}
							}
							setState(480);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(481);
						expression();
						}
						} 
					}
					setState(486);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				}
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(487);
					match(NL);
					}
					}
					setState(492);
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
			setState(496);
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
		enterRule(_localctx, 46, RULE_callable);
		try {
			setState(501);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				match(THIS);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(499);
				match(SUPER);
				}
				break;
			case LIST:
			case ARRAY:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(500);
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
		enterRule(_localctx, 48, RULE_primary);
		int _la;
		try {
			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				integerLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(504);
				realLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(505);
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
				setState(506);
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(VASCParser.COLON, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(VASCParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VASCParser.NL, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(COLON);
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(510);
				match(NL);
				}
				}
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(516);
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
	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(VASCParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 52, RULE_className);
		try {
			setState(521);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				match(IDENTIFIER);
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				arrayType();
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 3);
				{
				setState(520);
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
		enterRule(_localctx, 54, RULE_integerLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(523);
				match(MINUS);
				}
			}

			setState(527); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(526);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(529); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
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
		enterRule(_localctx, 56, RULE_realLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(531);
				match(MINUS);
				}
			}

			setState(535); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(534);
				match(DIGIT);
				}
				}
				setState(537); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(539);
			match(DOT);
			setState(541); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(540);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(543); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
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
		"\u0004\u0001%\u0222\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0001\u0000\u0005\u0000<\b\u0000\n\u0000\f\u0000"+
		"?\t\u0000\u0001\u0000\u0005\u0000B\b\u0000\n\u0000\f\u0000E\t\u0000\u0001"+
		"\u0000\u0005\u0000H\b\u0000\n\u0000\f\u0000K\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0005\u0001Q\b\u0001\n\u0001\f\u0001T\t"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001X\b\u0001\n\u0001\f\u0001[\t"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001_\b\u0001\n\u0001\f\u0001b\t"+
		"\u0001\u0001\u0001\u0003\u0001e\b\u0001\u0001\u0001\u0005\u0001h\b\u0001"+
		"\n\u0001\f\u0001k\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001o\b\u0001"+
		"\n\u0001\f\u0001r\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001v\b\u0001"+
		"\n\u0001\f\u0001y\t\u0001\u0005\u0001{\b\u0001\n\u0001\f\u0001~\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001\u0082\b\u0001\n\u0001\f\u0001\u0085"+
		"\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0005\u0004\u008e\b\u0004\n\u0004\f\u0004\u0091\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004\u0095\b\u0004\n\u0004\f\u0004\u0098"+
		"\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u009d\b\u0004"+
		"\n\u0004\f\u0004\u00a0\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u00a5\b\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u00a9\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00af\b\u0007"+
		"\n\u0007\f\u0007\u00b2\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\t\u00bd\b\t\n\t\f\t\u00c0"+
		"\t\t\u0001\t\u0003\t\u00c3\b\t\u0001\t\u0005\t\u00c6\b\t\n\t\f\t\u00c9"+
		"\t\t\u0001\t\u0003\t\u00cc\b\t\u0001\t\u0005\t\u00cf\b\t\n\t\f\t\u00d2"+
		"\t\t\u0001\t\u0001\t\u0005\t\u00d6\b\t\n\t\f\t\u00d9\t\t\u0001\t\u0001"+
		"\t\u0005\t\u00dd\b\t\n\t\f\t\u00e0\t\t\u0001\t\u0001\t\u0001\n\u0001\n"+
		"\u0005\n\u00e6\b\n\n\n\f\n\u00e9\t\n\u0001\n\u0001\n\u0005\n\u00ed\b\n"+
		"\n\n\f\n\u00f0\t\n\u0001\n\u0005\n\u00f3\b\n\n\n\f\n\u00f6\t\n\u0001\n"+
		"\u0001\n\u0005\n\u00fa\b\n\n\n\f\n\u00fd\t\n\u0001\n\u0001\n\u0005\n\u0101"+
		"\b\n\n\n\f\n\u0104\t\n\u0005\n\u0106\b\n\n\n\f\n\u0109\t\n\u0001\n\u0003"+
		"\n\u010c\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0005\f\u0115\b\f\n\f\f\f\u0118\t\f\u0005\f\u011a\b\f\n\f\f"+
		"\f\u011d\t\f\u0001\r\u0001\r\u0003\r\u0121\b\r\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u0125\b\u000e\n\u000e\f\u000e\u0128\t\u000e\u0001\u000e\u0003"+
		"\u000e\u012b\b\u000e\u0001\u000e\u0005\u000e\u012e\b\u000e\n\u000e\f\u000e"+
		"\u0131\t\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0135\b\u000e\n\u000e"+
		"\f\u000e\u0138\t\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u013c\b\u000e"+
		"\n\u000e\f\u000e\u013f\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0149"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0153\b\u0011\n\u0011\f\u0011"+
		"\u0156\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u015c\b\u0012\n\u0012\f\u0012\u015f\t\u0012\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u0163\b\u0012\n\u0012\f\u0012\u0166\t\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u016a\b\u0012\n\u0012\f\u0012\u016d\t\u0012\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u0171\b\u0012\n\u0012\f\u0012\u0174\t\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0005\u0013\u017a\b\u0013\n\u0013"+
		"\f\u0013\u017d\t\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0181\b\u0013"+
		"\n\u0013\f\u0013\u0184\t\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0188"+
		"\b\u0013\n\u0013\f\u0013\u018b\t\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u018f\b\u0013\n\u0013\f\u0013\u0192\t\u0013\u0001\u0013\u0001\u0013\u0005"+
		"\u0013\u0196\b\u0013\n\u0013\f\u0013\u0199\t\u0013\u0001\u0013\u0003\u0013"+
		"\u019c\b\u0013\u0001\u0013\u0005\u0013\u019f\b\u0013\n\u0013\f\u0013\u01a2"+
		"\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0005\u0014\u01a8"+
		"\b\u0014\n\u0014\f\u0014\u01ab\t\u0014\u0001\u0014\u0003\u0014\u01ae\b"+
		"\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u01b2\b\u0015\u0001\u0015\u0005"+
		"\u0015\u01b5\b\u0015\n\u0015\f\u0015\u01b8\t\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0005\u0015\u01bd\b\u0015\n\u0015\f\u0015\u01c0\t\u0015\u0001"+
		"\u0015\u0003\u0015\u01c3\b\u0015\u0005\u0015\u01c5\b\u0015\n\u0015\f\u0015"+
		"\u01c8\t\u0015\u0001\u0015\u0003\u0015\u01cb\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0005\u0016\u01cf\b\u0016\n\u0016\f\u0016\u01d2\t\u0016\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u01d6\b\u0016\n\u0016\f\u0016\u01d9\t\u0016\u0001"+
		"\u0016\u0001\u0016\u0005\u0016\u01dd\b\u0016\n\u0016\f\u0016\u01e0\t\u0016"+
		"\u0001\u0016\u0005\u0016\u01e3\b\u0016\n\u0016\f\u0016\u01e6\t\u0016\u0001"+
		"\u0016\u0005\u0016\u01e9\b\u0016\n\u0016\f\u0016\u01ec\t\u0016\u0001\u0016"+
		"\u0003\u0016\u01ef\b\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u01f6\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u01fc\b\u0018\u0001\u0019\u0001\u0019\u0005\u0019"+
		"\u0200\b\u0019\n\u0019\f\u0019\u0203\t\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u020a\b\u001a\u0001\u001b\u0003"+
		"\u001b\u020d\b\u001b\u0001\u001b\u0004\u001b\u0210\b\u001b\u000b\u001b"+
		"\f\u001b\u0211\u0001\u001c\u0003\u001c\u0215\b\u001c\u0001\u001c\u0004"+
		"\u001c\u0218\b\u001c\u000b\u001c\f\u001c\u0219\u0001\u001c\u0001\u001c"+
		"\u0004\u001c\u021e\b\u001c\u000b\u001c\f\u001c\u021f\u0001\u001c\u0000"+
		"\u0000\u001d\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468\u0000\u0001\u0001\u0000\u001b\u001c"+
		"\u0259\u0000=\u0001\u0000\u0000\u0000\u0002N\u0001\u0000\u0000\u0000\u0004"+
		"\u0086\u0001\u0000\u0000\u0000\u0006\u0089\u0001\u0000\u0000\u0000\b\u008f"+
		"\u0001\u0000\u0000\u0000\n\u00a4\u0001\u0000\u0000\u0000\f\u00a8\u0001"+
		"\u0000\u0000\u0000\u000e\u00aa\u0001\u0000\u0000\u0000\u0010\u00b5\u0001"+
		"\u0000\u0000\u0000\u0012\u00b9\u0001\u0000\u0000\u0000\u0014\u00e3\u0001"+
		"\u0000\u0000\u0000\u0016\u010f\u0001\u0000\u0000\u0000\u0018\u011b\u0001"+
		"\u0000\u0000\u0000\u001a\u0120\u0001\u0000\u0000\u0000\u001c\u0122\u0001"+
		"\u0000\u0000\u0000\u001e\u0148\u0001\u0000\u0000\u0000 \u014a\u0001\u0000"+
		"\u0000\u0000\"\u014f\u0001\u0000\u0000\u0000$\u0159\u0001\u0000\u0000"+
		"\u0000&\u0177\u0001\u0000\u0000\u0000(\u01a5\u0001\u0000\u0000\u0000*"+
		"\u01ca\u0001\u0000\u0000\u0000,\u01cc\u0001\u0000\u0000\u0000.\u01f5\u0001"+
		"\u0000\u0000\u00000\u01fb\u0001\u0000\u0000\u00002\u01fd\u0001\u0000\u0000"+
		"\u00004\u0209\u0001\u0000\u0000\u00006\u020c\u0001\u0000\u0000\u00008"+
		"\u0214\u0001\u0000\u0000\u0000:<\u0005$\u0000\u0000;:\u0001\u0000\u0000"+
		"\u0000<?\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000"+
		"\u0000\u0000>C\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@B\u0003"+
		"\u0002\u0001\u0000A@\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000"+
		"CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DI\u0001\u0000\u0000"+
		"\u0000EC\u0001\u0000\u0000\u0000FH\u0005$\u0000\u0000GF\u0001\u0000\u0000"+
		"\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000"+
		"\u0000\u0000JL\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LM\u0005"+
		"\u0000\u0000\u0001M\u0001\u0001\u0000\u0000\u0000NR\u0005\n\u0000\u0000"+
		"OQ\u0005$\u0000\u0000PO\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000\u0000"+
		"RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000SU\u0001\u0000\u0000"+
		"\u0000TR\u0001\u0000\u0000\u0000UY\u0005\u001f\u0000\u0000VX\u0005$\u0000"+
		"\u0000WV\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000"+
		"\u0000\u0000YZ\u0001\u0000\u0000\u0000Zd\u0001\u0000\u0000\u0000[Y\u0001"+
		"\u0000\u0000\u0000\\`\u0005\u000b\u0000\u0000]_\u0005$\u0000\u0000^]\u0001"+
		"\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000"+
		"`a\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000"+
		"\u0000ce\u0005\u001f\u0000\u0000d\\\u0001\u0000\u0000\u0000de\u0001\u0000"+
		"\u0000\u0000ei\u0001\u0000\u0000\u0000fh\u0005$\u0000\u0000gf\u0001\u0000"+
		"\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001"+
		"\u0000\u0000\u0000jl\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000"+
		"lp\u0005\u000f\u0000\u0000mo\u0005$\u0000\u0000nm\u0001\u0000\u0000\u0000"+
		"or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000"+
		"\u0000q|\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000sw\u0003\n\u0005"+
		"\u0000tv\u0005$\u0000\u0000ut\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000"+
		"\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x{\u0001\u0000"+
		"\u0000\u0000yw\u0001\u0000\u0000\u0000zs\u0001\u0000\u0000\u0000{~\u0001"+
		"\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000"+
		"}\u007f\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f\u0083"+
		"\u0005\u0010\u0000\u0000\u0080\u0082\u0005$\u0000\u0000\u0081\u0080\u0001"+
		"\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0003\u0001"+
		"\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u0087\u0005"+
		"\u0012\u0000\u0000\u0087\u0088\u0003\b\u0004\u0000\u0088\u0005\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0005\u0014\u0000\u0000\u008a\u008b\u0003\b\u0004"+
		"\u0000\u008b\u0007\u0001\u0000\u0000\u0000\u008c\u008e\u0005$\u0000\u0000"+
		"\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000"+
		"\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000"+
		"\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000"+
		"\u0092\u0096\u0005\u0007\u0000\u0000\u0093\u0095\u0005$\u0000\u0000\u0094"+
		"\u0093\u0001\u0000\u0000\u0000\u0095\u0098\u0001\u0000\u0000\u0000\u0096"+
		"\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097"+
		"\u0099\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u00034\u001a\u0000\u009a\u009e\u0005\b\u0000\u0000\u009b\u009d"+
		"\u0005$\u0000\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u00a0\u0001"+
		"\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001"+
		"\u0000\u0000\u0000\u009f\t\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a5\u0003\f\u0006\u0000\u00a2\u00a5\u0003\u0012\t"+
		"\u0000\u00a3\u00a5\u0003\u001c\u000e\u0000\u00a4\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a5\u000b\u0001\u0000\u0000\u0000\u00a6\u00a9\u0003\u0010\b\u0000"+
		"\u00a7\u00a9\u0003\u000e\u0007\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9\r\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ab\u0005\u001a\u0000\u0000\u00ab\u00ac\u0005\u001f\u0000\u0000\u00ac"+
		"\u00b0\u0005\u0002\u0000\u0000\u00ad\u00af\u0005$\u0000\u0000\u00ae\u00ad"+
		"\u0001\u0000\u0000\u0000\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b4"+
		"\u0003*\u0015\u0000\u00b4\u000f\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005"+
		"\u001a\u0000\u0000\u00b6\u00b7\u0005\u001f\u0000\u0000\u00b7\u00b8\u0003"+
		"2\u0019\u0000\u00b8\u0011\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\f"+
		"\u0000\u0000\u00ba\u00be\u0005\u001f\u0000\u0000\u00bb\u00bd\u0005$\u0000"+
		"\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000"+
		"\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c3\u0003\u0014\n\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c6\u0005$\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c8\u0001\u0000\u0000\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9"+
		"\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cc\u00032\u0019\u0000\u00cb\u00ca"+
		"\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00d0"+
		"\u0001\u0000\u0000\u0000\u00cd\u00cf\u0005$\u0000\u0000\u00ce\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d7\u0005"+
		"\u000f\u0000\u0000\u00d4\u00d6\u0005$\u0000\u0000\u00d5\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00da\u0001\u0000"+
		"\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00de\u0003\u0018"+
		"\f\u0000\u00db\u00dd\u0005$\u0000\u0000\u00dc\u00db\u0001\u0000\u0000"+
		"\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000"+
		"\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\u0010\u0000"+
		"\u0000\u00e2\u0013\u0001\u0000\u0000\u0000\u00e3\u00e7\u0005\u0005\u0000"+
		"\u0000\u00e4\u00e6\u0005$\u0000\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u010b\u0001\u0000\u0000\u0000"+
		"\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u00ee\u0003\u0016\u000b\u0000"+
		"\u00eb\u00ed\u0005$\u0000\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ed"+
		"\u00f0\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ef\u0001\u0000\u0000\u0000\u00ef\u0107\u0001\u0000\u0000\u0000\u00f0"+
		"\u00ee\u0001\u0000\u0000\u0000\u00f1\u00f3\u0005$\u0000\u0000\u00f2\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f6\u0001\u0000\u0000\u0000\u00f4\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f7\u00fb"+
		"\u0005\u0003\u0000\u0000\u00f8\u00fa\u0005$\u0000\u0000\u00f9\u00f8\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fe\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fe\u0102\u0003"+
		"\u0016\u000b\u0000\u00ff\u0101\u0005$\u0000\u0000\u0100\u00ff\u0001\u0000"+
		"\u0000\u0000\u0101\u0104\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000"+
		"\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0106\u0001\u0000"+
		"\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0105\u00f4\u0001\u0000"+
		"\u0000\u0000\u0106\u0109\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000"+
		"\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u010c\u0001\u0000"+
		"\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u010a\u010c\u0001\u0000"+
		"\u0000\u0000\u010b\u00ea\u0001\u0000\u0000\u0000\u010b\u010a\u0001\u0000"+
		"\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010e\u0005\u0006"+
		"\u0000\u0000\u010e\u0015\u0001\u0000\u0000\u0000\u010f\u0110\u0005\u001f"+
		"\u0000\u0000\u0110\u0111\u00032\u0019\u0000\u0111\u0017\u0001\u0000\u0000"+
		"\u0000\u0112\u0116\u0003\u001a\r\u0000\u0113\u0115\u0005$\u0000\u0000"+
		"\u0114\u0113\u0001\u0000\u0000\u0000\u0115\u0118\u0001\u0000\u0000\u0000"+
		"\u0116\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000"+
		"\u0117\u011a\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000"+
		"\u0119\u0112\u0001\u0000\u0000\u0000\u011a\u011d\u0001\u0000\u0000\u0000"+
		"\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000"+
		"\u011c\u0019\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000"+
		"\u011e\u0121\u0003\u001e\u000f\u0000\u011f\u0121\u0003\f\u0006\u0000\u0120"+
		"\u011e\u0001\u0000\u0000\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0121"+
		"\u001b\u0001\u0000\u0000\u0000\u0122\u0126\u0005\u0013\u0000\u0000\u0123"+
		"\u0125\u0005$\u0000\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0125\u0128"+
		"\u0001\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0127"+
		"\u0001\u0000\u0000\u0000\u0127\u012a\u0001\u0000\u0000\u0000\u0128\u0126"+
		"\u0001\u0000\u0000\u0000\u0129\u012b\u0003\u0014\n\u0000\u012a\u0129\u0001"+
		"\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012f\u0001"+
		"\u0000\u0000\u0000\u012c\u012e\u0005$\u0000\u0000\u012d\u012c\u0001\u0000"+
		"\u0000\u0000\u012e\u0131\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000"+
		"\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0132\u0001\u0000"+
		"\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0132\u0136\u0005\u000f"+
		"\u0000\u0000\u0133\u0135\u0005$\u0000\u0000\u0134\u0133\u0001\u0000\u0000"+
		"\u0000\u0135\u0138\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000"+
		"\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0139\u0001\u0000\u0000"+
		"\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0139\u013d\u0003\u0018\f\u0000"+
		"\u013a\u013c\u0005$\u0000\u0000\u013b\u013a\u0001\u0000\u0000\u0000\u013c"+
		"\u013f\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013d"+
		"\u013e\u0001\u0000\u0000\u0000\u013e\u0140\u0001\u0000\u0000\u0000\u013f"+
		"\u013d\u0001\u0000\u0000\u0000\u0140\u0141\u0005\u0010\u0000\u0000\u0141"+
		"\u001d\u0001\u0000\u0000\u0000\u0142\u0149\u0003\"\u0011\u0000\u0143\u0149"+
		"\u0003$\u0012\u0000\u0144\u0149\u0003&\u0013\u0000\u0145\u0149\u0003("+
		"\u0014\u0000\u0146\u0149\u0003*\u0015\u0000\u0147\u0149\u0003 \u0010\u0000"+
		"\u0148\u0142\u0001\u0000\u0000\u0000\u0148\u0143\u0001\u0000\u0000\u0000"+
		"\u0148\u0144\u0001\u0000\u0000\u0000\u0148\u0145\u0001\u0000\u0000\u0000"+
		"\u0148\u0146\u0001\u0000\u0000\u0000\u0148\u0147\u0001\u0000\u0000\u0000"+
		"\u0149\u001f\u0001\u0000\u0000\u0000\u014a\u014b\u0005\u0015\u0000\u0000"+
		"\u014b\u014c\u0005\u0005\u0000\u0000\u014c\u014d\u0005\u001e\u0000\u0000"+
		"\u014d\u014e\u0005\u0006\u0000\u0000\u014e!\u0001\u0000\u0000\u0000\u014f"+
		"\u0150\u0005\u001f\u0000\u0000\u0150\u0154\u0005\t\u0000\u0000\u0151\u0153"+
		"\u0005$\u0000\u0000\u0152\u0151\u0001\u0000\u0000\u0000\u0153\u0156\u0001"+
		"\u0000\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0154\u0155\u0001"+
		"\u0000\u0000\u0000\u0155\u0157\u0001\u0000\u0000\u0000\u0156\u0154\u0001"+
		"\u0000\u0000\u0000\u0157\u0158\u0003*\u0015\u0000\u0158#\u0001\u0000\u0000"+
		"\u0000\u0159\u015d\u0005\r\u0000\u0000\u015a\u015c\u0005$\u0000\u0000"+
		"\u015b\u015a\u0001\u0000\u0000\u0000\u015c\u015f\u0001\u0000\u0000\u0000"+
		"\u015d\u015b\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000"+
		"\u015e\u0160\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000"+
		"\u0160\u0164\u0003*\u0015\u0000\u0161\u0163\u0005$\u0000\u0000\u0162\u0161"+
		"\u0001\u0000\u0000\u0000\u0163\u0166\u0001\u0000\u0000\u0000\u0164\u0162"+
		"\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0167"+
		"\u0001\u0000\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0167\u016b"+
		"\u0005\u000e\u0000\u0000\u0168\u016a\u0005$\u0000\u0000\u0169\u0168\u0001"+
		"\u0000\u0000\u0000\u016a\u016d\u0001\u0000\u0000\u0000\u016b\u0169\u0001"+
		"\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016e\u0001"+
		"\u0000\u0000\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016e\u0172\u0003"+
		"\u0018\f\u0000\u016f\u0171\u0005$\u0000\u0000\u0170\u016f\u0001\u0000"+
		"\u0000\u0000\u0171\u0174\u0001\u0000\u0000\u0000\u0172\u0170\u0001\u0000"+
		"\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173\u0175\u0001\u0000"+
		"\u0000\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0175\u0176\u0005\u0010"+
		"\u0000\u0000\u0176%\u0001\u0000\u0000\u0000\u0177\u017b\u0005\u0017\u0000"+
		"\u0000\u0178\u017a\u0005$\u0000\u0000\u0179\u0178\u0001\u0000\u0000\u0000"+
		"\u017a\u017d\u0001\u0000\u0000\u0000\u017b\u0179\u0001\u0000\u0000\u0000"+
		"\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u017e\u0001\u0000\u0000\u0000"+
		"\u017d\u017b\u0001\u0000\u0000\u0000\u017e\u0182\u0003*\u0015\u0000\u017f"+
		"\u0181\u0005$\u0000\u0000\u0180\u017f\u0001\u0000\u0000\u0000\u0181\u0184"+
		"\u0001\u0000\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0182\u0183"+
		"\u0001\u0000\u0000\u0000\u0183\u0185\u0001\u0000\u0000\u0000\u0184\u0182"+
		"\u0001\u0000\u0000\u0000\u0185\u0189\u0005\u0018\u0000\u0000\u0186\u0188"+
		"\u0005$\u0000\u0000\u0187\u0186\u0001\u0000\u0000\u0000\u0188\u018b\u0001"+
		"\u0000\u0000\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u0189\u018a\u0001"+
		"\u0000\u0000\u0000\u018a\u018c\u0001\u0000\u0000\u0000\u018b\u0189\u0001"+
		"\u0000\u0000\u0000\u018c\u0190\u0003\u0018\f\u0000\u018d\u018f\u0005$"+
		"\u0000\u0000\u018e\u018d\u0001\u0000\u0000\u0000\u018f\u0192\u0001\u0000"+
		"\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000"+
		"\u0000\u0000\u0191\u019b\u0001\u0000\u0000\u0000\u0192\u0190\u0001\u0000"+
		"\u0000\u0000\u0193\u0197\u0005\u0019\u0000\u0000\u0194\u0196\u0005$\u0000"+
		"\u0000\u0195\u0194\u0001\u0000\u0000\u0000\u0196\u0199\u0001\u0000\u0000"+
		"\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000"+
		"\u0000\u0198\u019a\u0001\u0000\u0000\u0000\u0199\u0197\u0001\u0000\u0000"+
		"\u0000\u019a\u019c\u0003\u0018\f\u0000\u019b\u0193\u0001\u0000\u0000\u0000"+
		"\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u01a0\u0001\u0000\u0000\u0000"+
		"\u019d\u019f\u0005$\u0000\u0000\u019e\u019d\u0001\u0000\u0000\u0000\u019f"+
		"\u01a2\u0001\u0000\u0000\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a3\u0001\u0000\u0000\u0000\u01a2"+
		"\u01a0\u0001\u0000\u0000\u0000\u01a3\u01a4\u0005\u0010\u0000\u0000\u01a4"+
		"\'\u0001\u0000\u0000\u0000\u01a5\u01a9\u0005\u0011\u0000\u0000\u01a6\u01a8"+
		"\u0005$\u0000\u0000\u01a7\u01a6\u0001\u0000\u0000\u0000\u01a8\u01ab\u0001"+
		"\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001"+
		"\u0000\u0000\u0000\u01aa\u01ad\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001"+
		"\u0000\u0000\u0000\u01ac\u01ae\u0003*\u0015\u0000\u01ad\u01ac\u0001\u0000"+
		"\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae)\u0001\u0000\u0000"+
		"\u0000\u01af\u01b1\u0003.\u0017\u0000\u01b0\u01b2\u0003,\u0016\u0000\u01b1"+
		"\u01b0\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2"+
		"\u01c6\u0001\u0000\u0000\u0000\u01b3\u01b5\u0005$\u0000\u0000\u01b4\u01b3"+
		"\u0001\u0000\u0000\u0000\u01b5\u01b8\u0001\u0000\u0000\u0000\u01b6\u01b4"+
		"\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7\u01b9"+
		"\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b9\u01ba"+
		"\u0005\u0001\u0000\u0000\u01ba\u01be\u0005\u001f\u0000\u0000\u01bb\u01bd"+
		"\u0005$\u0000\u0000\u01bc\u01bb\u0001\u0000\u0000\u0000\u01bd\u01c0\u0001"+
		"\u0000\u0000\u0000\u01be\u01bc\u0001\u0000\u0000\u0000\u01be\u01bf\u0001"+
		"\u0000\u0000\u0000\u01bf\u01c2\u0001\u0000\u0000\u0000\u01c0\u01be\u0001"+
		"\u0000\u0000\u0000\u01c1\u01c3\u0003,\u0016\u0000\u01c2\u01c1\u0001\u0000"+
		"\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000\u01c3\u01c5\u0001\u0000"+
		"\u0000\u0000\u01c4\u01b6\u0001\u0000\u0000\u0000\u01c5\u01c8\u0001\u0000"+
		"\u0000\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000"+
		"\u0000\u0000\u01c7\u01cb\u0001\u0000\u0000\u0000\u01c8\u01c6\u0001\u0000"+
		"\u0000\u0000\u01c9\u01cb\u00030\u0018\u0000\u01ca\u01af\u0001\u0000\u0000"+
		"\u0000\u01ca\u01c9\u0001\u0000\u0000\u0000\u01cb+\u0001\u0000\u0000\u0000"+
		"\u01cc\u01d0\u0005\u0005\u0000\u0000\u01cd\u01cf\u0005$\u0000\u0000\u01ce"+
		"\u01cd\u0001\u0000\u0000\u0000\u01cf\u01d2\u0001\u0000\u0000\u0000\u01d0"+
		"\u01ce\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1"+
		"\u01ee\u0001\u0000\u0000\u0000\u01d2\u01d0\u0001\u0000\u0000\u0000\u01d3"+
		"\u01e4\u0003*\u0015\u0000\u01d4\u01d6\u0005$\u0000\u0000\u01d5\u01d4\u0001"+
		"\u0000\u0000\u0000\u01d6\u01d9\u0001\u0000\u0000\u0000\u01d7\u01d5\u0001"+
		"\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01da\u0001"+
		"\u0000\u0000\u0000\u01d9\u01d7\u0001\u0000\u0000\u0000\u01da\u01de\u0005"+
		"\u0003\u0000\u0000\u01db\u01dd\u0005$\u0000\u0000\u01dc\u01db\u0001\u0000"+
		"\u0000\u0000\u01dd\u01e0\u0001\u0000\u0000\u0000\u01de\u01dc\u0001\u0000"+
		"\u0000\u0000\u01de\u01df\u0001\u0000\u0000\u0000\u01df\u01e1\u0001\u0000"+
		"\u0000\u0000\u01e0\u01de\u0001\u0000\u0000\u0000\u01e1\u01e3\u0003*\u0015"+
		"\u0000\u01e2\u01d7\u0001\u0000\u0000\u0000\u01e3\u01e6\u0001\u0000\u0000"+
		"\u0000\u01e4\u01e2\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000"+
		"\u0000\u01e5\u01ea\u0001\u0000\u0000\u0000\u01e6\u01e4\u0001\u0000\u0000"+
		"\u0000\u01e7\u01e9\u0005$\u0000\u0000\u01e8\u01e7\u0001\u0000\u0000\u0000"+
		"\u01e9\u01ec\u0001\u0000\u0000\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000"+
		"\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb\u01ef\u0001\u0000\u0000\u0000"+
		"\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ed\u01ef\u0001\u0000\u0000\u0000"+
		"\u01ee\u01d3\u0001\u0000\u0000\u0000\u01ee\u01ed\u0001\u0000\u0000\u0000"+
		"\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0\u01f1\u0005\u0006\u0000\u0000"+
		"\u01f1-\u0001\u0000\u0000\u0000\u01f2\u01f6\u0005\u0013\u0000\u0000\u01f3"+
		"\u01f6\u0005\u0016\u0000\u0000\u01f4\u01f6\u00034\u001a\u0000\u01f5\u01f2"+
		"\u0001\u0000\u0000\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f5\u01f4"+
		"\u0001\u0000\u0000\u0000\u01f6/\u0001\u0000\u0000\u0000\u01f7\u01fc\u0003"+
		"6\u001b\u0000\u01f8\u01fc\u00038\u001c\u0000\u01f9\u01fc\u0007\u0000\u0000"+
		"\u0000\u01fa\u01fc\u0005\u001d\u0000\u0000\u01fb\u01f7\u0001\u0000\u0000"+
		"\u0000\u01fb\u01f8\u0001\u0000\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000"+
		"\u0000\u01fb\u01fa\u0001\u0000\u0000\u0000\u01fc1\u0001\u0000\u0000\u0000"+
		"\u01fd\u0201\u0005\u0002\u0000\u0000\u01fe\u0200\u0005$\u0000\u0000\u01ff"+
		"\u01fe\u0001\u0000\u0000\u0000\u0200\u0203\u0001\u0000\u0000\u0000\u0201"+
		"\u01ff\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000\u0000\u0202"+
		"\u0204\u0001\u0000\u0000\u0000\u0203\u0201\u0001\u0000\u0000\u0000\u0204"+
		"\u0205\u00034\u001a\u0000\u02053\u0001\u0000\u0000\u0000\u0206\u020a\u0005"+
		"\u001f\u0000\u0000\u0207\u020a\u0003\u0006\u0003\u0000\u0208\u020a\u0003"+
		"\u0004\u0002\u0000\u0209\u0206\u0001\u0000\u0000\u0000\u0209\u0207\u0001"+
		"\u0000\u0000\u0000\u0209\u0208\u0001\u0000\u0000\u0000\u020a5\u0001\u0000"+
		"\u0000\u0000\u020b\u020d\u0005\u0004\u0000\u0000\u020c\u020b\u0001\u0000"+
		"\u0000\u0000\u020c\u020d\u0001\u0000\u0000\u0000\u020d\u020f\u0001\u0000"+
		"\u0000\u0000\u020e\u0210\u0005 \u0000\u0000\u020f\u020e\u0001\u0000\u0000"+
		"\u0000\u0210\u0211\u0001\u0000\u0000\u0000\u0211\u020f\u0001\u0000\u0000"+
		"\u0000\u0211\u0212\u0001\u0000\u0000\u0000\u02127\u0001\u0000\u0000\u0000"+
		"\u0213\u0215\u0005\u0004\u0000\u0000\u0214\u0213\u0001\u0000\u0000\u0000"+
		"\u0214\u0215\u0001\u0000\u0000\u0000\u0215\u0217\u0001\u0000\u0000\u0000"+
		"\u0216\u0218\u0005 \u0000\u0000\u0217\u0216\u0001\u0000\u0000\u0000\u0218"+
		"\u0219\u0001\u0000\u0000\u0000\u0219\u0217\u0001\u0000\u0000\u0000\u0219"+
		"\u021a\u0001\u0000\u0000\u0000\u021a\u021b\u0001\u0000\u0000\u0000\u021b"+
		"\u021d\u0005\u0001\u0000\u0000\u021c\u021e\u0005 \u0000\u0000\u021d\u021c"+
		"\u0001\u0000\u0000\u0000\u021e\u021f\u0001\u0000\u0000\u0000\u021f\u021d"+
		"\u0001\u0000\u0000\u0000\u021f\u0220\u0001\u0000\u0000\u0000\u02209\u0001"+
		"\u0000\u0000\u0000L=CIRY`dipw|\u0083\u008f\u0096\u009e\u00a4\u00a8\u00b0"+
		"\u00be\u00c2\u00c7\u00cb\u00d0\u00d7\u00de\u00e7\u00ee\u00f4\u00fb\u0102"+
		"\u0107\u010b\u0116\u011b\u0120\u0126\u012a\u012f\u0136\u013d\u0148\u0154"+
		"\u015d\u0164\u016b\u0172\u017b\u0182\u0189\u0190\u0197\u019b\u01a0\u01a9"+
		"\u01ad\u01b1\u01b6\u01be\u01c2\u01c6\u01ca\u01d0\u01d7\u01de\u01e4\u01ea"+
		"\u01ee\u01f5\u01fb\u0201\u0209\u020c\u0211\u0214\u0219\u021f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}