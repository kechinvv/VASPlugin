// Generated from C:/Users/valer/IdeaProjects/VASPlugin/src/main/java/parser/com/github/kechinvv/vasplugin/antlr/VASCParser.g4 by ANTLR 4.13.1
package parser.com.github.kechinvv.vasplugin.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

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
		STRING=30, IDENTIFIER=31, DIGIT=32, NL=33, MlComment=34, COMMENT=35, WS=36, 
		BAD_CHARACTER=37;
	public static final int
		RULE_program = 0, RULE_classDeclaration = 1, RULE_listType = 2, RULE_arrayType = 3, 
		RULE_genericType = 4, RULE_memberDeclaration = 5, RULE_variableDeclaration = 6, 
		RULE_initializedVariable = 7, RULE_uninitializedVariable = 8, RULE_parameters = 9, 
		RULE_parameterDeclaration = 10, RULE_body = 11, RULE_bodyStatement = 12, 
		RULE_methodDeclaration = 13, RULE_constructorDeclaration = 14, RULE_statement = 15, 
		RULE_print = 16, RULE_assignment = 17, RULE_whileLoop = 18, RULE_ifStatement = 19, 
		RULE_returnStatement = 20, RULE_expression = 21, RULE_callableExpression = 22, 
		RULE_chainExpression = 23, RULE_arguments = 24, RULE_callable = 25, RULE_primary = 26, 
		RULE_type = 27, RULE_className = 28, RULE_integerLiteral = 29, RULE_realLiteral = 30, 
		RULE_identifier = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classDeclaration", "listType", "arrayType", "genericType", 
			"memberDeclaration", "variableDeclaration", "initializedVariable", "uninitializedVariable", 
			"parameters", "parameterDeclaration", "body", "bodyStatement", "methodDeclaration", 
			"constructorDeclaration", "statement", "print", "assignment", "whileLoop", 
			"ifStatement", "returnStatement", "expression", "callableExpression", 
			"chainExpression", "arguments", "callable", "primary", "type", "className", 
			"integerLiteral", "realLiteral", "identifier"
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
			"DIGIT", "NL", "MlComment", "COMMENT", "WS", "BAD_CHARACTER"
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
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(64);
					match(NL);
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(70);
				classDeclaration();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(76);
				match(NL);
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
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
			setState(84);
			match(CLASS);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(85);
				match(NL);
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			identifier();
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(92);
					match(NL);
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(98);
				match(EXTENDS);
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(99);
					match(NL);
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(105);
				identifier();
				}
			}

			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(108);
				match(NL);
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			match(IS);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(115);
				match(NL);
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 67637248L) != 0)) {
				{
				{
				setState(121);
				memberDeclaration();
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(122);
					match(NL);
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			match(END);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(134);
					match(NL);
					}
					} 
				}
				setState(139);
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
			setState(140);
			match(LIST);
			setState(141);
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
			setState(143);
			match(ARRAY);
			setState(144);
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
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(146);
				match(NL);
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			match(L_SQUARE_BRACKET);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(153);
				match(NL);
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
			className();
			setState(160);
			match(R_SQUARE_BRACKET);
			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(161);
					match(NL);
					}
					} 
				}
				setState(166);
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
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				variableDeclaration();
				}
				break;
			case METHOD:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				methodDeclaration();
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
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
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				uninitializedVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
			setState(176);
			match(VAR);
			setState(177);
			identifier();
			setState(178);
			match(COLON);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(179);
				match(NL);
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
			setState(187);
			match(VAR);
			setState(188);
			identifier();
			setState(189);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(L_BRACKET);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(192);
				match(NL);
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(198);
				parameterDeclaration();
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(199);
					match(NL);
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(205);
					match(COMMA);
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(206);
						match(NL);
						}
						}
						setState(211);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(212);
					parameterDeclaration();
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(213);
						match(NL);
						}
						}
						setState(218);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(226);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		enterRule(_localctx, 20, RULE_parameterDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			identifier();
			setState(229);
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
		enterRule(_localctx, 22, RULE_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7465738256L) != 0)) {
				{
				{
				setState(231);
				bodyStatement();
				setState(235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(232);
						match(NL);
						}
						} 
					}
					setState(237);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				}
				}
				setState(242);
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
			setState(245);
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
				setState(243);
				statement();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
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
	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode METHOD() { return getToken(VASCParser.METHOD, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		enterRule(_localctx, 26, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(METHOD);
			setState(248);
			identifier();
			setState(252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(249);
					match(NL);
					}
					} 
				}
				setState(254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_BRACKET) {
				{
				setState(255);
				parameters();
				}
			}

			setState(261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(258);
					match(NL);
					}
					} 
				}
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(264);
				type();
				}
			}

			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(267);
				match(NL);
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273);
			match(IS);
			setState(277);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(274);
					match(NL);
					}
					} 
				}
				setState(279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(280);
			body();
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(281);
				match(NL);
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(287);
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
			setState(289);
			match(THIS);
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(290);
					match(NL);
					}
					} 
				}
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_BRACKET) {
				{
				setState(296);
				parameters();
				}
			}

			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(299);
				match(NL);
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(305);
			match(IS);
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(306);
					match(NL);
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(312);
			body();
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(313);
				match(NL);
				}
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(319);
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
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				whileLoop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(324);
				returnStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(325);
				expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(326);
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
			setState(329);
			match(PRINT);
			setState(330);
			match(L_BRACKET);
			setState(331);
			match(STRING);
			setState(332);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
			setState(334);
			identifier();
			setState(335);
			match(ASSIGN_OP);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(336);
				match(NL);
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(342);
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
			setState(344);
			match(WHILE);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(345);
				match(NL);
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(351);
			expression();
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(352);
				match(NL);
				}
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(358);
			match(LOOP);
			setState(362);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(359);
					match(NL);
					}
					} 
				}
				setState(364);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			setState(365);
			body();
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(366);
				match(NL);
				}
				}
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(372);
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
			setState(374);
			match(IF);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(375);
				match(NL);
				}
				}
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(381);
			expression();
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(382);
				match(NL);
				}
				}
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(388);
			match(THEN);
			setState(392);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(389);
					match(NL);
					}
					} 
				}
				setState(394);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			setState(395);
			body();
			setState(399);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(396);
					match(NL);
					}
					} 
				}
				setState(401);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(402);
				match(ELSE);
				setState(406);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(403);
						match(NL);
						}
						} 
					}
					setState(408);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				}
				setState(409);
				body();
				}
			}

			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(412);
				match(NL);
				}
				}
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(418);
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
			setState(420);
			match(RETURN);
			setState(424);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(421);
					match(NL);
					}
					} 
				}
				setState(426);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(427);
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
		public CallableExpressionContext callableExpression() {
			return getRuleContext(CallableExpressionContext.class,0);
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
		try {
			setState(432);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIST:
			case THIS:
			case ARRAY:
			case SUPER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				callableExpression();
				}
				break;
			case MINUS:
			case TRUE:
			case FALSE:
			case NULL:
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
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
	public static class CallableExpressionContext extends ParserRuleContext {
		public CallableContext callable() {
			return getRuleContext(CallableContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ChainExpressionContext chainExpression() {
			return getRuleContext(ChainExpressionContext.class,0);
		}
		public CallableExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callableExpression; }
	}

	public final CallableExpressionContext callableExpression() throws RecognitionException {
		CallableExpressionContext _localctx = new CallableExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_callableExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			callable();
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_BRACKET) {
				{
				setState(435);
				arguments();
				}
			}

			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(438);
				chainExpression();
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
	public static class ChainExpressionContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(VASCParser.DOT, 0); }
		public CallableExpressionContext callableExpression() {
			return getRuleContext(CallableExpressionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(VASCParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VASCParser.NL, i);
		}
		public ChainExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chainExpression; }
	}

	public final ChainExpressionContext chainExpression() throws RecognitionException {
		ChainExpressionContext _localctx = new ChainExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_chainExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(441);
				match(NL);
				}
				}
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(447);
			match(DOT);
			setState(448);
			callableExpression();
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
		enterRule(_localctx, 48, RULE_arguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(L_BRACKET);
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(451);
				match(NL);
				}
				}
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7388004368L) != 0)) {
				{
				setState(457);
				expression();
				setState(474);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(461);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(458);
							match(NL);
							}
							}
							setState(463);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(464);
						match(COMMA);
						setState(468);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(465);
							match(NL);
							}
							}
							setState(470);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(471);
						expression();
						}
						} 
					}
					setState(476);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(477);
					match(NL);
					}
					}
					setState(482);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(485);
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
		enterRule(_localctx, 50, RULE_callable);
		try {
			setState(490);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				match(THIS);
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				match(SUPER);
				}
				break;
			case LIST:
			case ARRAY:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(489);
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
		enterRule(_localctx, 52, RULE_primary);
		int _la;
		try {
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(492);
				integerLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(493);
				realLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(494);
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
				setState(495);
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
		enterRule(_localctx, 54, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(COLON);
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(499);
				match(NL);
				}
				}
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(505);
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
		enterRule(_localctx, 56, RULE_className);
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
		enterRule(_localctx, 58, RULE_integerLiteral);
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
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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
		enterRule(_localctx, 60, RULE_realLiteral);
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
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(VASCParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
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

	public static final String _serializedATN =
		"\u0004\u0001%\u0219\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0001\u0000\u0005\u0000B\b\u0000\n\u0000\f\u0000"+
		"E\t\u0000\u0001\u0000\u0005\u0000H\b\u0000\n\u0000\f\u0000K\t\u0000\u0001"+
		"\u0000\u0005\u0000N\b\u0000\n\u0000\f\u0000Q\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0005\u0001W\b\u0001\n\u0001\f\u0001Z\t"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001^\b\u0001\n\u0001\f\u0001a\t"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001e\b\u0001\n\u0001\f\u0001h\t"+
		"\u0001\u0001\u0001\u0003\u0001k\b\u0001\u0001\u0001\u0005\u0001n\b\u0001"+
		"\n\u0001\f\u0001q\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001u\b\u0001"+
		"\n\u0001\f\u0001x\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001|\b\u0001"+
		"\n\u0001\f\u0001\u007f\t\u0001\u0005\u0001\u0081\b\u0001\n\u0001\f\u0001"+
		"\u0084\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0088\b\u0001\n\u0001"+
		"\f\u0001\u008b\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0005\u0004\u0094\b\u0004\n\u0004"+
		"\f\u0004\u0097\t\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u009b\b\u0004"+
		"\n\u0004\f\u0004\u009e\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004\u00a3\b\u0004\n\u0004\f\u0004\u00a6\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u00ab\b\u0005\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u00af\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u00b5\b\u0007\n\u0007\f\u0007\u00b8\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0005\t\u00c2\b\t\n\t\f\t\u00c5"+
		"\t\t\u0001\t\u0001\t\u0005\t\u00c9\b\t\n\t\f\t\u00cc\t\t\u0001\t\u0001"+
		"\t\u0005\t\u00d0\b\t\n\t\f\t\u00d3\t\t\u0001\t\u0001\t\u0005\t\u00d7\b"+
		"\t\n\t\f\t\u00da\t\t\u0005\t\u00dc\b\t\n\t\f\t\u00df\t\t\u0003\t\u00e1"+
		"\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u00ea\b\u000b\n\u000b\f\u000b\u00ed\t\u000b\u0005\u000b\u00ef\b"+
		"\u000b\n\u000b\f\u000b\u00f2\t\u000b\u0001\f\u0001\f\u0003\f\u00f6\b\f"+
		"\u0001\r\u0001\r\u0001\r\u0005\r\u00fb\b\r\n\r\f\r\u00fe\t\r\u0001\r\u0003"+
		"\r\u0101\b\r\u0001\r\u0005\r\u0104\b\r\n\r\f\r\u0107\t\r\u0001\r\u0003"+
		"\r\u010a\b\r\u0001\r\u0005\r\u010d\b\r\n\r\f\r\u0110\t\r\u0001\r\u0001"+
		"\r\u0005\r\u0114\b\r\n\r\f\r\u0117\t\r\u0001\r\u0001\r\u0005\r\u011b\b"+
		"\r\n\r\f\r\u011e\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u0124\b\u000e\n\u000e\f\u000e\u0127\t\u000e\u0001\u000e\u0003\u000e\u012a"+
		"\b\u000e\u0001\u000e\u0005\u000e\u012d\b\u000e\n\u000e\f\u000e\u0130\t"+
		"\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0134\b\u000e\n\u000e\f\u000e"+
		"\u0137\t\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u013b\b\u000e\n\u000e"+
		"\f\u000e\u013e\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0148\b\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0005\u0011\u0152\b\u0011\n\u0011\f\u0011\u0155"+
		"\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0005\u0012\u015b"+
		"\b\u0012\n\u0012\f\u0012\u015e\t\u0012\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u0162\b\u0012\n\u0012\f\u0012\u0165\t\u0012\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u0169\b\u0012\n\u0012\f\u0012\u016c\t\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u0170\b\u0012\n\u0012\f\u0012\u0173\t\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0005\u0013\u0179\b\u0013\n\u0013\f\u0013"+
		"\u017c\t\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0180\b\u0013\n\u0013"+
		"\f\u0013\u0183\t\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0187\b\u0013"+
		"\n\u0013\f\u0013\u018a\t\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u018e"+
		"\b\u0013\n\u0013\f\u0013\u0191\t\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u0195\b\u0013\n\u0013\f\u0013\u0198\t\u0013\u0001\u0013\u0003\u0013\u019b"+
		"\b\u0013\u0001\u0013\u0005\u0013\u019e\b\u0013\n\u0013\f\u0013\u01a1\t"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0005\u0014\u01a7"+
		"\b\u0014\n\u0014\f\u0014\u01aa\t\u0014\u0001\u0014\u0003\u0014\u01ad\b"+
		"\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u01b1\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u01b5\b\u0016\u0001\u0016\u0003\u0016\u01b8\b\u0016"+
		"\u0001\u0017\u0005\u0017\u01bb\b\u0017\n\u0017\f\u0017\u01be\t\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0005\u0018\u01c5"+
		"\b\u0018\n\u0018\f\u0018\u01c8\t\u0018\u0001\u0018\u0001\u0018\u0005\u0018"+
		"\u01cc\b\u0018\n\u0018\f\u0018\u01cf\t\u0018\u0001\u0018\u0001\u0018\u0005"+
		"\u0018\u01d3\b\u0018\n\u0018\f\u0018\u01d6\t\u0018\u0001\u0018\u0005\u0018"+
		"\u01d9\b\u0018\n\u0018\f\u0018\u01dc\t\u0018\u0001\u0018\u0005\u0018\u01df"+
		"\b\u0018\n\u0018\f\u0018\u01e2\t\u0018\u0003\u0018\u01e4\b\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01eb"+
		"\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01f1"+
		"\b\u001a\u0001\u001b\u0001\u001b\u0005\u001b\u01f5\b\u001b\n\u001b\f\u001b"+
		"\u01f8\t\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u01ff\b\u001c\u0001\u001d\u0003\u001d\u0202\b\u001d\u0001"+
		"\u001d\u0004\u001d\u0205\b\u001d\u000b\u001d\f\u001d\u0206\u0001\u001e"+
		"\u0003\u001e\u020a\b\u001e\u0001\u001e\u0004\u001e\u020d\b\u001e\u000b"+
		"\u001e\f\u001e\u020e\u0001\u001e\u0001\u001e\u0004\u001e\u0213\b\u001e"+
		"\u000b\u001e\f\u001e\u0214\u0001\u001f\u0001\u001f\u0001\u001f\u0000\u0000"+
		" \u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>\u0000\u0001\u0001\u0000\u001b\u001c\u024a"+
		"\u0000C\u0001\u0000\u0000\u0000\u0002T\u0001\u0000\u0000\u0000\u0004\u008c"+
		"\u0001\u0000\u0000\u0000\u0006\u008f\u0001\u0000\u0000\u0000\b\u0095\u0001"+
		"\u0000\u0000\u0000\n\u00aa\u0001\u0000\u0000\u0000\f\u00ae\u0001\u0000"+
		"\u0000\u0000\u000e\u00b0\u0001\u0000\u0000\u0000\u0010\u00bb\u0001\u0000"+
		"\u0000\u0000\u0012\u00bf\u0001\u0000\u0000\u0000\u0014\u00e4\u0001\u0000"+
		"\u0000\u0000\u0016\u00f0\u0001\u0000\u0000\u0000\u0018\u00f5\u0001\u0000"+
		"\u0000\u0000\u001a\u00f7\u0001\u0000\u0000\u0000\u001c\u0121\u0001\u0000"+
		"\u0000\u0000\u001e\u0147\u0001\u0000\u0000\u0000 \u0149\u0001\u0000\u0000"+
		"\u0000\"\u014e\u0001\u0000\u0000\u0000$\u0158\u0001\u0000\u0000\u0000"+
		"&\u0176\u0001\u0000\u0000\u0000(\u01a4\u0001\u0000\u0000\u0000*\u01b0"+
		"\u0001\u0000\u0000\u0000,\u01b2\u0001\u0000\u0000\u0000.\u01bc\u0001\u0000"+
		"\u0000\u00000\u01c2\u0001\u0000\u0000\u00002\u01ea\u0001\u0000\u0000\u0000"+
		"4\u01f0\u0001\u0000\u0000\u00006\u01f2\u0001\u0000\u0000\u00008\u01fe"+
		"\u0001\u0000\u0000\u0000:\u0201\u0001\u0000\u0000\u0000<\u0209\u0001\u0000"+
		"\u0000\u0000>\u0216\u0001\u0000\u0000\u0000@B\u0005!\u0000\u0000A@\u0001"+
		"\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000"+
		"CD\u0001\u0000\u0000\u0000DI\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000"+
		"\u0000FH\u0003\u0002\u0001\u0000GF\u0001\u0000\u0000\u0000HK\u0001\u0000"+
		"\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JO\u0001"+
		"\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LN\u0005!\u0000\u0000ML\u0001"+
		"\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000"+
		"OP\u0001\u0000\u0000\u0000PR\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000"+
		"\u0000RS\u0005\u0000\u0000\u0001S\u0001\u0001\u0000\u0000\u0000TX\u0005"+
		"\n\u0000\u0000UW\u0005!\u0000\u0000VU\u0001\u0000\u0000\u0000WZ\u0001"+
		"\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000"+
		"Y[\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[_\u0003>\u001f\u0000"+
		"\\^\u0005!\u0000\u0000]\\\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000"+
		"\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`j\u0001\u0000"+
		"\u0000\u0000a_\u0001\u0000\u0000\u0000bf\u0005\u000b\u0000\u0000ce\u0005"+
		"!\u0000\u0000dc\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001"+
		"\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gi\u0001\u0000\u0000\u0000"+
		"hf\u0001\u0000\u0000\u0000ik\u0003>\u001f\u0000jb\u0001\u0000\u0000\u0000"+
		"jk\u0001\u0000\u0000\u0000ko\u0001\u0000\u0000\u0000ln\u0005!\u0000\u0000"+
		"ml\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000"+
		"\u0000op\u0001\u0000\u0000\u0000pr\u0001\u0000\u0000\u0000qo\u0001\u0000"+
		"\u0000\u0000rv\u0005\u000f\u0000\u0000su\u0005!\u0000\u0000ts\u0001\u0000"+
		"\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001"+
		"\u0000\u0000\u0000w\u0082\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000"+
		"\u0000y}\u0003\n\u0005\u0000z|\u0005!\u0000\u0000{z\u0001\u0000\u0000"+
		"\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001"+
		"\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000"+
		"\u0000\u0080y\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000\u0000\u0000"+
		"\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000"+
		"\u0083\u0085\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000"+
		"\u0085\u0089\u0005\u0010\u0000\u0000\u0086\u0088\u0005!\u0000\u0000\u0087"+
		"\u0086\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089"+
		"\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a"+
		"\u0003\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0005\u0012\u0000\u0000\u008d\u008e\u0003\b\u0004\u0000\u008e\u0005"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u0014\u0000\u0000\u0090\u0091"+
		"\u0003\b\u0004\u0000\u0091\u0007\u0001\u0000\u0000\u0000\u0092\u0094\u0005"+
		"!\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000"+
		"\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000"+
		"\u0000\u0000\u0096\u0098\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000"+
		"\u0000\u0000\u0098\u009c\u0005\u0007\u0000\u0000\u0099\u009b\u0005!\u0000"+
		"\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000"+
		"\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000"+
		"\u0000\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u00038\u001c\u0000\u00a0\u00a4\u0005\b\u0000\u0000"+
		"\u00a1\u00a3\u0005!\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a5\t\u0001\u0000\u0000\u0000\u00a6\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a7\u00ab\u0003\f\u0006\u0000\u00a8\u00ab\u0003"+
		"\u001a\r\u0000\u00a9\u00ab\u0003\u001c\u000e\u0000\u00aa\u00a7\u0001\u0000"+
		"\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ab\u000b\u0001\u0000\u0000\u0000\u00ac\u00af\u0003\u0010"+
		"\b\u0000\u00ad\u00af\u0003\u000e\u0007\u0000\u00ae\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af\r\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b1\u0005\u001a\u0000\u0000\u00b1\u00b2\u0003>\u001f\u0000\u00b2"+
		"\u00b6\u0005\u0002\u0000\u0000\u00b3\u00b5\u0005!\u0000\u0000\u00b4\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b9"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0003*\u0015\u0000\u00ba\u000f\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005"+
		"\u001a\u0000\u0000\u00bc\u00bd\u0003>\u001f\u0000\u00bd\u00be\u00036\u001b"+
		"\u0000\u00be\u0011\u0001\u0000\u0000\u0000\u00bf\u00c3\u0005\u0005\u0000"+
		"\u0000\u00c0\u00c2\u0005!\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c5\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00e0\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6\u00ca\u0003\u0014\n\u0000\u00c7"+
		"\u00c9\u0005!\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9\u00cc"+
		"\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb"+
		"\u0001\u0000\u0000\u0000\u00cb\u00dd\u0001\u0000\u0000\u0000\u00cc\u00ca"+
		"\u0001\u0000\u0000\u0000\u00cd\u00d1\u0005\u0003\u0000\u0000\u00ce\u00d0"+
		"\u0005!\u0000\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d4\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d8\u0003\u0014\n\u0000\u00d5\u00d7\u0005!"+
		"\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7\u00da\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000"+
		"\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000"+
		"\u0000\u0000\u00db\u00cd\u0001\u0000\u0000\u0000\u00dc\u00df\u0001\u0000"+
		"\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000"+
		"\u0000\u0000\u00de\u00e1\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000"+
		"\u0000\u0000\u00e0\u00c6\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005\u0006"+
		"\u0000\u0000\u00e3\u0013\u0001\u0000\u0000\u0000\u00e4\u00e5\u0003>\u001f"+
		"\u0000\u00e5\u00e6\u00036\u001b\u0000\u00e6\u0015\u0001\u0000\u0000\u0000"+
		"\u00e7\u00eb\u0003\u0018\f\u0000\u00e8\u00ea\u0005!\u0000\u0000\u00e9"+
		"\u00e8\u0001\u0000\u0000\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb"+
		"\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee"+
		"\u00e7\u0001\u0000\u0000\u0000\u00ef\u00f2\u0001\u0000\u0000\u0000\u00f0"+
		"\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1"+
		"\u0017\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f6\u0003\u001e\u000f\u0000\u00f4\u00f6\u0003\f\u0006\u0000\u00f5\u00f3"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f6\u0019"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005\f\u0000\u0000\u00f8\u00fc\u0003"+
		">\u001f\u0000\u00f9\u00fb\u0005!\u0000\u0000\u00fa\u00f9\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fe\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u0100\u0001\u0000\u0000"+
		"\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00ff\u0101\u0003\u0012\t\u0000"+
		"\u0100\u00ff\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000"+
		"\u0101\u0105\u0001\u0000\u0000\u0000\u0102\u0104\u0005!\u0000\u0000\u0103"+
		"\u0102\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000\u0000\u0000\u0105"+
		"\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106"+
		"\u0109\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108"+
		"\u010a\u00036\u001b\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u0109\u010a"+
		"\u0001\u0000\u0000\u0000\u010a\u010e\u0001\u0000\u0000\u0000\u010b\u010d"+
		"\u0005!\u0000\u0000\u010c\u010b\u0001\u0000\u0000\u0000\u010d\u0110\u0001"+
		"\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010e\u010f\u0001"+
		"\u0000\u0000\u0000\u010f\u0111\u0001\u0000\u0000\u0000\u0110\u010e\u0001"+
		"\u0000\u0000\u0000\u0111\u0115\u0005\u000f\u0000\u0000\u0112\u0114\u0005"+
		"!\u0000\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u0114\u0117\u0001\u0000"+
		"\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000"+
		"\u0000\u0000\u0116\u0118\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000"+
		"\u0000\u0000\u0118\u011c\u0003\u0016\u000b\u0000\u0119\u011b\u0005!\u0000"+
		"\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011b\u011e\u0001\u0000\u0000"+
		"\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000"+
		"\u0000\u011d\u011f\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000\u0000"+
		"\u0000\u011f\u0120\u0005\u0010\u0000\u0000\u0120\u001b\u0001\u0000\u0000"+
		"\u0000\u0121\u0125\u0005\u0013\u0000\u0000\u0122\u0124\u0005!\u0000\u0000"+
		"\u0123\u0122\u0001\u0000\u0000\u0000\u0124\u0127\u0001\u0000\u0000\u0000"+
		"\u0125\u0123\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000"+
		"\u0126\u0129\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000"+
		"\u0128\u012a\u0003\u0012\t\u0000\u0129\u0128\u0001\u0000\u0000\u0000\u0129"+
		"\u012a\u0001\u0000\u0000\u0000\u012a\u012e\u0001\u0000\u0000\u0000\u012b"+
		"\u012d\u0005!\u0000\u0000\u012c\u012b\u0001\u0000\u0000\u0000\u012d\u0130"+
		"\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012e\u012f"+
		"\u0001\u0000\u0000\u0000\u012f\u0131\u0001\u0000\u0000\u0000\u0130\u012e"+
		"\u0001\u0000\u0000\u0000\u0131\u0135\u0005\u000f\u0000\u0000\u0132\u0134"+
		"\u0005!\u0000\u0000\u0133\u0132\u0001\u0000\u0000\u0000\u0134\u0137\u0001"+
		"\u0000\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0135\u0136\u0001"+
		"\u0000\u0000\u0000\u0136\u0138\u0001\u0000\u0000\u0000\u0137\u0135\u0001"+
		"\u0000\u0000\u0000\u0138\u013c\u0003\u0016\u000b\u0000\u0139\u013b\u0005"+
		"!\u0000\u0000\u013a\u0139\u0001\u0000\u0000\u0000\u013b\u013e\u0001\u0000"+
		"\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000"+
		"\u0000\u0000\u013d\u013f\u0001\u0000\u0000\u0000\u013e\u013c\u0001\u0000"+
		"\u0000\u0000\u013f\u0140\u0005\u0010\u0000\u0000\u0140\u001d\u0001\u0000"+
		"\u0000\u0000\u0141\u0148\u0003\"\u0011\u0000\u0142\u0148\u0003$\u0012"+
		"\u0000\u0143\u0148\u0003&\u0013\u0000\u0144\u0148\u0003(\u0014\u0000\u0145"+
		"\u0148\u0003*\u0015\u0000\u0146\u0148\u0003 \u0010\u0000\u0147\u0141\u0001"+
		"\u0000\u0000\u0000\u0147\u0142\u0001\u0000\u0000\u0000\u0147\u0143\u0001"+
		"\u0000\u0000\u0000\u0147\u0144\u0001\u0000\u0000\u0000\u0147\u0145\u0001"+
		"\u0000\u0000\u0000\u0147\u0146\u0001\u0000\u0000\u0000\u0148\u001f\u0001"+
		"\u0000\u0000\u0000\u0149\u014a\u0005\u0015\u0000\u0000\u014a\u014b\u0005"+
		"\u0005\u0000\u0000\u014b\u014c\u0005\u001e\u0000\u0000\u014c\u014d\u0005"+
		"\u0006\u0000\u0000\u014d!\u0001\u0000\u0000\u0000\u014e\u014f\u0003>\u001f"+
		"\u0000\u014f\u0153\u0005\t\u0000\u0000\u0150\u0152\u0005!\u0000\u0000"+
		"\u0151\u0150\u0001\u0000\u0000\u0000\u0152\u0155\u0001\u0000\u0000\u0000"+
		"\u0153\u0151\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000"+
		"\u0154\u0156\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000"+
		"\u0156\u0157\u0003*\u0015\u0000\u0157#\u0001\u0000\u0000\u0000\u0158\u015c"+
		"\u0005\r\u0000\u0000\u0159\u015b\u0005!\u0000\u0000\u015a\u0159\u0001"+
		"\u0000\u0000\u0000\u015b\u015e\u0001\u0000\u0000\u0000\u015c\u015a\u0001"+
		"\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015f\u0001"+
		"\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015f\u0163\u0003"+
		"*\u0015\u0000\u0160\u0162\u0005!\u0000\u0000\u0161\u0160\u0001\u0000\u0000"+
		"\u0000\u0162\u0165\u0001\u0000\u0000\u0000\u0163\u0161\u0001\u0000\u0000"+
		"\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0166\u0001\u0000\u0000"+
		"\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0166\u016a\u0005\u000e\u0000"+
		"\u0000\u0167\u0169\u0005!\u0000\u0000\u0168\u0167\u0001\u0000\u0000\u0000"+
		"\u0169\u016c\u0001\u0000\u0000\u0000\u016a\u0168\u0001\u0000\u0000\u0000"+
		"\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u016d\u0001\u0000\u0000\u0000"+
		"\u016c\u016a\u0001\u0000\u0000\u0000\u016d\u0171\u0003\u0016\u000b\u0000"+
		"\u016e\u0170\u0005!\u0000\u0000\u016f\u016e\u0001\u0000\u0000\u0000\u0170"+
		"\u0173\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0171"+
		"\u0172\u0001\u0000\u0000\u0000\u0172\u0174\u0001\u0000\u0000\u0000\u0173"+
		"\u0171\u0001\u0000\u0000\u0000\u0174\u0175\u0005\u0010\u0000\u0000\u0175"+
		"%\u0001\u0000\u0000\u0000\u0176\u017a\u0005\u0017\u0000\u0000\u0177\u0179"+
		"\u0005!\u0000\u0000\u0178\u0177\u0001\u0000\u0000\u0000\u0179\u017c\u0001"+
		"\u0000\u0000\u0000\u017a\u0178\u0001\u0000\u0000\u0000\u017a\u017b\u0001"+
		"\u0000\u0000\u0000\u017b\u017d\u0001\u0000\u0000\u0000\u017c\u017a\u0001"+
		"\u0000\u0000\u0000\u017d\u0181\u0003*\u0015\u0000\u017e\u0180\u0005!\u0000"+
		"\u0000\u017f\u017e\u0001\u0000\u0000\u0000\u0180\u0183\u0001\u0000\u0000"+
		"\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000"+
		"\u0000\u0182\u0184\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000"+
		"\u0000\u0184\u0188\u0005\u0018\u0000\u0000\u0185\u0187\u0005!\u0000\u0000"+
		"\u0186\u0185\u0001\u0000\u0000\u0000\u0187\u018a\u0001\u0000\u0000\u0000"+
		"\u0188\u0186\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000"+
		"\u0189\u018b\u0001\u0000\u0000\u0000\u018a\u0188\u0001\u0000\u0000\u0000"+
		"\u018b\u018f\u0003\u0016\u000b\u0000\u018c\u018e\u0005!\u0000\u0000\u018d"+
		"\u018c\u0001\u0000\u0000\u0000\u018e\u0191\u0001\u0000\u0000\u0000\u018f"+
		"\u018d\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190"+
		"\u019a\u0001\u0000\u0000\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0192"+
		"\u0196\u0005\u0019\u0000\u0000\u0193\u0195\u0005!\u0000\u0000\u0194\u0193"+
		"\u0001\u0000\u0000\u0000\u0195\u0198\u0001\u0000\u0000\u0000\u0196\u0194"+
		"\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u0199"+
		"\u0001\u0000\u0000\u0000\u0198\u0196\u0001\u0000\u0000\u0000\u0199\u019b"+
		"\u0003\u0016\u000b\u0000\u019a\u0192\u0001\u0000\u0000\u0000\u019a\u019b"+
		"\u0001\u0000\u0000\u0000\u019b\u019f\u0001\u0000\u0000\u0000\u019c\u019e"+
		"\u0005!\u0000\u0000\u019d\u019c\u0001\u0000\u0000\u0000\u019e\u01a1\u0001"+
		"\u0000\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u019f\u01a0\u0001"+
		"\u0000\u0000\u0000\u01a0\u01a2\u0001\u0000\u0000\u0000\u01a1\u019f\u0001"+
		"\u0000\u0000\u0000\u01a2\u01a3\u0005\u0010\u0000\u0000\u01a3\'\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a8\u0005\u0011\u0000\u0000\u01a5\u01a7\u0005!\u0000"+
		"\u0000\u01a6\u01a5\u0001\u0000\u0000\u0000\u01a7\u01aa\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000"+
		"\u0000\u01a9\u01ac\u0001\u0000\u0000\u0000\u01aa\u01a8\u0001\u0000\u0000"+
		"\u0000\u01ab\u01ad\u0003*\u0015\u0000\u01ac\u01ab\u0001\u0000\u0000\u0000"+
		"\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad)\u0001\u0000\u0000\u0000\u01ae"+
		"\u01b1\u0003,\u0016\u0000\u01af\u01b1\u00034\u001a\u0000\u01b0\u01ae\u0001"+
		"\u0000\u0000\u0000\u01b0\u01af\u0001\u0000\u0000\u0000\u01b1+\u0001\u0000"+
		"\u0000\u0000\u01b2\u01b4\u00032\u0019\u0000\u01b3\u01b5\u00030\u0018\u0000"+
		"\u01b4\u01b3\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000"+
		"\u01b5\u01b7\u0001\u0000\u0000\u0000\u01b6\u01b8\u0003.\u0017\u0000\u01b7"+
		"\u01b6\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8"+
		"-\u0001\u0000\u0000\u0000\u01b9\u01bb\u0005!\u0000\u0000\u01ba\u01b9\u0001"+
		"\u0000\u0000\u0000\u01bb\u01be\u0001\u0000\u0000\u0000\u01bc\u01ba\u0001"+
		"\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd\u01bf\u0001"+
		"\u0000\u0000\u0000\u01be\u01bc\u0001\u0000\u0000\u0000\u01bf\u01c0\u0005"+
		"\u0001\u0000\u0000\u01c0\u01c1\u0003,\u0016\u0000\u01c1/\u0001\u0000\u0000"+
		"\u0000\u01c2\u01c6\u0005\u0005\u0000\u0000\u01c3\u01c5\u0005!\u0000\u0000"+
		"\u01c4\u01c3\u0001\u0000\u0000\u0000\u01c5\u01c8\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000"+
		"\u01c7\u01e3\u0001\u0000\u0000\u0000\u01c8\u01c6\u0001\u0000\u0000\u0000"+
		"\u01c9\u01da\u0003*\u0015\u0000\u01ca\u01cc\u0005!\u0000\u0000\u01cb\u01ca"+
		"\u0001\u0000\u0000\u0000\u01cc\u01cf\u0001\u0000\u0000\u0000\u01cd\u01cb"+
		"\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce\u01d0"+
		"\u0001\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01d0\u01d4"+
		"\u0005\u0003\u0000\u0000\u01d1\u01d3\u0005!\u0000\u0000\u01d2\u01d1\u0001"+
		"\u0000\u0000\u0000\u01d3\u01d6\u0001\u0000\u0000\u0000\u01d4\u01d2\u0001"+
		"\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5\u01d7\u0001"+
		"\u0000\u0000\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d7\u01d9\u0003"+
		"*\u0015\u0000\u01d8\u01cd\u0001\u0000\u0000\u0000\u01d9\u01dc\u0001\u0000"+
		"\u0000\u0000\u01da\u01d8\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000"+
		"\u0000\u0000\u01db\u01e0\u0001\u0000\u0000\u0000\u01dc\u01da\u0001\u0000"+
		"\u0000\u0000\u01dd\u01df\u0005!\u0000\u0000\u01de\u01dd\u0001\u0000\u0000"+
		"\u0000\u01df\u01e2\u0001\u0000\u0000\u0000\u01e0\u01de\u0001\u0000\u0000"+
		"\u0000\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1\u01e4\u0001\u0000\u0000"+
		"\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e3\u01c9\u0001\u0000\u0000"+
		"\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000"+
		"\u0000\u01e5\u01e6\u0005\u0006\u0000\u0000\u01e61\u0001\u0000\u0000\u0000"+
		"\u01e7\u01eb\u0005\u0013\u0000\u0000\u01e8\u01eb\u0005\u0016\u0000\u0000"+
		"\u01e9\u01eb\u00038\u001c\u0000\u01ea\u01e7\u0001\u0000\u0000\u0000\u01ea"+
		"\u01e8\u0001\u0000\u0000\u0000\u01ea\u01e9\u0001\u0000\u0000\u0000\u01eb"+
		"3\u0001\u0000\u0000\u0000\u01ec\u01f1\u0003:\u001d\u0000\u01ed\u01f1\u0003"+
		"<\u001e\u0000\u01ee\u01f1\u0007\u0000\u0000\u0000\u01ef\u01f1\u0005\u001d"+
		"\u0000\u0000\u01f0\u01ec\u0001\u0000\u0000\u0000\u01f0\u01ed\u0001\u0000"+
		"\u0000\u0000\u01f0\u01ee\u0001\u0000\u0000\u0000\u01f0\u01ef\u0001\u0000"+
		"\u0000\u0000\u01f15\u0001\u0000\u0000\u0000\u01f2\u01f6\u0005\u0002\u0000"+
		"\u0000\u01f3\u01f5\u0005!\u0000\u0000\u01f4\u01f3\u0001\u0000\u0000\u0000"+
		"\u01f5\u01f8\u0001\u0000\u0000\u0000\u01f6\u01f4\u0001\u0000\u0000\u0000"+
		"\u01f6\u01f7\u0001\u0000\u0000\u0000\u01f7\u01f9\u0001\u0000\u0000\u0000"+
		"\u01f8\u01f6\u0001\u0000\u0000\u0000\u01f9\u01fa\u00038\u001c\u0000\u01fa"+
		"7\u0001\u0000\u0000\u0000\u01fb\u01ff\u0003>\u001f\u0000\u01fc\u01ff\u0003"+
		"\u0006\u0003\u0000\u01fd\u01ff\u0003\u0004\u0002\u0000\u01fe\u01fb\u0001"+
		"\u0000\u0000\u0000\u01fe\u01fc\u0001\u0000\u0000\u0000\u01fe\u01fd\u0001"+
		"\u0000\u0000\u0000\u01ff9\u0001\u0000\u0000\u0000\u0200\u0202\u0005\u0004"+
		"\u0000\u0000\u0201\u0200\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000"+
		"\u0000\u0000\u0202\u0204\u0001\u0000\u0000\u0000\u0203\u0205\u0005 \u0000"+
		"\u0000\u0204\u0203\u0001\u0000\u0000\u0000\u0205\u0206\u0001\u0000\u0000"+
		"\u0000\u0206\u0204\u0001\u0000\u0000\u0000\u0206\u0207\u0001\u0000\u0000"+
		"\u0000\u0207;\u0001\u0000\u0000\u0000\u0208\u020a\u0005\u0004\u0000\u0000"+
		"\u0209\u0208\u0001\u0000\u0000\u0000\u0209\u020a\u0001\u0000\u0000\u0000"+
		"\u020a\u020c\u0001\u0000\u0000\u0000\u020b\u020d\u0005 \u0000\u0000\u020c"+
		"\u020b\u0001\u0000\u0000\u0000\u020d\u020e\u0001\u0000\u0000\u0000\u020e"+
		"\u020c\u0001\u0000\u0000\u0000\u020e\u020f\u0001\u0000\u0000\u0000\u020f"+
		"\u0210\u0001\u0000\u0000\u0000\u0210\u0212\u0005\u0001\u0000\u0000\u0211"+
		"\u0213\u0005 \u0000\u0000\u0212\u0211\u0001\u0000\u0000\u0000\u0213\u0214"+
		"\u0001\u0000\u0000\u0000\u0214\u0212\u0001\u0000\u0000\u0000\u0214\u0215"+
		"\u0001\u0000\u0000\u0000\u0215=\u0001\u0000\u0000\u0000\u0216\u0217\u0005"+
		"\u001f\u0000\u0000\u0217?\u0001\u0000\u0000\u0000ICIOX_fjov}\u0082\u0089"+
		"\u0095\u009c\u00a4\u00aa\u00ae\u00b6\u00c3\u00ca\u00d1\u00d8\u00dd\u00e0"+
		"\u00eb\u00f0\u00f5\u00fc\u0100\u0105\u0109\u010e\u0115\u011c\u0125\u0129"+
		"\u012e\u0135\u013c\u0147\u0153\u015c\u0163\u016a\u0171\u017a\u0181\u0188"+
		"\u018f\u0196\u019a\u019f\u01a8\u01ac\u01b0\u01b4\u01b7\u01bc\u01c6\u01cd"+
		"\u01d4\u01da\u01e0\u01e3\u01ea\u01f0\u01f6\u01fe\u0201\u0206\u0209\u020e"+
		"\u0214";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}