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
		LOOP=14, IS=15, END=16, RETURN=17, THIS=18, SUPER=19, IF=20, THEN=21, 
		ELSE=22, VAR=23, ARRAY=24, LIST=25, BOOL=26, REAL=27, INT=28, TRUE=29, 
		FALSE=30, NULL=31, PRINT=32, STRING=33, IDENTIFIER=34, DIGIT=35, NL=36, 
		MlComment=37, COMMENT=38, WS=39, BAD_CHARACTER=40;
	public static final int
		RULE_program = 0, RULE_classDeclaration = 1, RULE_classBody = 2, RULE_memberDeclaration = 3, 
		RULE_variableDeclaration = 4, RULE_parameters = 5, RULE_parameter = 6, 
		RULE_body = 7, RULE_statement = 8, RULE_expression = 9, RULE_dotCall = 10, 
		RULE_arguments = 11, RULE_primary = 12, RULE_genericType = 13, RULE_className = 14, 
		RULE_identifier = 15, RULE_semi = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classDeclaration", "classBody", "memberDeclaration", "variableDeclaration", 
			"parameters", "parameter", "body", "statement", "expression", "dotCall", 
			"arguments", "primary", "genericType", "className", "identifier", "semi"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "':'", "','", "'-'", "'('", "')'", "'['", "']'", "'='", 
			"'class'", "'extends'", "'method'", "'while'", "'loop'", "'is'", "'end'", 
			"'return'", "'this'", "'super'", "'if'", "'then'", "'else'", "'var'", 
			"'Array'", "'List'", "'Boolean'", "'Real'", "'Integer'", "'true'", "'false'", 
			"'null'", "'println'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOT", "COLON", "COMMA", "MINUS", "L_BRACKET", "R_BRACKET", "L_SQUARE_BRACKET", 
			"R_SQUARE_BRACKET", "ASSIGN_OP", "CLASS", "EXTENDS", "METHOD", "WHILE", 
			"LOOP", "IS", "END", "RETURN", "THIS", "SUPER", "IF", "THEN", "ELSE", 
			"VAR", "ARRAY", "LIST", "BOOL", "REAL", "INT", "TRUE", "FALSE", "NULL", 
			"PRINT", "STRING", "IDENTIFIER", "DIGIT", "NL", "MlComment", "COMMENT", 
			"WS", "BAD_CHARACTER"
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
		public ClassDeclarationContext classDeclaration;
		public List<ClassDeclarationContext> classDeclarations = new ArrayList<ClassDeclarationContext>();
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
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(34);
				match(NL);
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(40);
				((ProgramContext)_localctx).classDeclaration = classDeclaration();
				((ProgramContext)_localctx).classDeclarations.add(((ProgramContext)_localctx).classDeclaration);
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NL) {
					{
					setState(41);
					semi();
					}
				}

				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
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
		public IdentifierContext name;
		public IdentifierContext parentName;
		public TerminalNode CLASS() { return getToken(VASCParser.CLASS, 0); }
		public TerminalNode IS() { return getToken(VASCParser.IS, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(VASCParser.END, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(VASCParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VASCParser.NL, i);
		}
		public TerminalNode EXTENDS() { return getToken(VASCParser.EXTENDS, 0); }
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
			setState(51);
			match(CLASS);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(52);
				match(NL);
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			((ClassDeclarationContext)_localctx).name = identifier();
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(59);
					match(NL);
					}
					} 
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(65);
				match(EXTENDS);
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
				((ClassDeclarationContext)_localctx).parentName = identifier();
				}
			}

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
			match(IS);
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(88);
			classBody();
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
	public static class ClassBodyContext extends ParserRuleContext {
		public MemberDeclarationContext memberDeclaration;
		public List<MemberDeclarationContext> memberDeclarations = new ArrayList<MemberDeclarationContext>();
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public List<MemberDeclarationContext> memberDeclaration() {
			return getRuleContexts(MemberDeclarationContext.class);
		}
		public MemberDeclarationContext memberDeclaration(int i) {
			return getRuleContext(MemberDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8654848L) != 0)) {
				{
				{
				setState(97);
				((ClassBodyContext)_localctx).memberDeclaration = memberDeclaration();
				((ClassBodyContext)_localctx).memberDeclarations.add(((ClassBodyContext)_localctx).memberDeclaration);
				setState(98);
				semi();
				}
				}
				setState(104);
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
	public static class MemberDeclarationContext extends ParserRuleContext {
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
	 
		public MemberDeclarationContext() { }
		public void copyFrom(MemberDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends MemberDeclarationContext {
		public ClassNameContext returnType;
		public TerminalNode METHOD() { return getToken(VASCParser.METHOD, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
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
		public TerminalNode COLON() { return getToken(VASCParser.COLON, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public MethodDeclarationContext(MemberDeclarationContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclarationContext extends MemberDeclarationContext {
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
		public ConstructorDeclarationContext(MemberDeclarationContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FieldDeclarationContext extends MemberDeclarationContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public FieldDeclarationContext(MemberDeclarationContext ctx) { copyFrom(ctx); }
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_memberDeclaration);
		int _la;
		try {
			int _alt;
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				_localctx = new FieldDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				variableDeclaration();
				}
				break;
			case METHOD:
				_localctx = new MethodDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(METHOD);
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(107);
					match(NL);
					}
					}
					setState(112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(113);
				identifier();
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(114);
					match(NL);
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(120);
				parameters();
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(121);
					match(NL);
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(127);
					match(COLON);
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(128);
						match(NL);
						}
						}
						setState(133);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(134);
					((MethodDeclarationContext)_localctx).returnType = className();
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(135);
						match(NL);
						}
						}
						setState(140);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(143);
				match(IS);
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(144);
						match(NL);
						}
						} 
					}
					setState(149);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(150);
				body();
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(151);
					match(NL);
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(157);
				match(END);
				}
				break;
			case THIS:
				_localctx = new ConstructorDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				match(THIS);
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(160);
						match(NL);
						}
						} 
					}
					setState(165);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==L_BRACKET) {
					{
					setState(166);
					parameters();
					}
				}

				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(169);
					match(NL);
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(175);
				match(IS);
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(176);
						match(NL);
						}
						} 
					}
					setState(181);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				setState(182);
				body();
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(183);
					match(NL);
					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(189);
				match(END);
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
		public ExpressionContext initExpression;
		public TerminalNode VAR() { return getToken(VASCParser.VAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VASCParser.COLON, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(VASCParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VASCParser.NL, i);
		}
		public TerminalNode ASSIGN_OP() { return getToken(VASCParser.ASSIGN_OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(VAR);
			setState(194);
			identifier();
			setState(195);
			match(COLON);
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
			className();
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(203);
					match(NL);
					}
					}
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(209);
				match(ASSIGN_OP);
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
				((VariableDeclarationContext)_localctx).initExpression = expression();
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
	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode L_BRACKET() { return getToken(VASCParser.L_BRACKET, 0); }
		public TerminalNode R_BRACKET() { return getToken(VASCParser.R_BRACKET, 0); }
		public List<TerminalNode> NL() { return getTokens(VASCParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VASCParser.NL, i);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
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
		enterRule(_localctx, 10, RULE_parameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(L_BRACKET);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(220);
					match(NL);
					}
					} 
				}
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(226);
				parameter();
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(230);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(227);
							match(NL);
							}
							}
							setState(232);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(233);
						match(COMMA);
						setState(237);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(234);
							match(NL);
							}
							}
							setState(239);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(240);
						parameter();
						}
						} 
					}
					setState(245);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				}
			}

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
	public static class ParameterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VASCParser.COLON, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(VASCParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VASCParser.NL, i);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			identifier();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(257);
				match(NL);
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 60123127824L) != 0)) {
				{
				{
				setState(272);
				statement();
				setState(273);
				semi();
				}
				}
				setState(279);
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
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends StatementContext {
		public ExpressionContext condition;
		public BodyContext thenBody;
		public BodyContext elseBody;
		public TerminalNode IF() { return getToken(VASCParser.IF, 0); }
		public TerminalNode THEN() { return getToken(VASCParser.THEN, 0); }
		public TerminalNode END() { return getToken(VASCParser.END, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(VASCParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VASCParser.NL, i);
		}
		public TerminalNode ELSE() { return getToken(VASCParser.ELSE, 0); }
		public IfStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableStatementContext extends StatementContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(VASCParser.RETURN, 0); }
		public List<TerminalNode> NL() { return getTokens(VASCParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VASCParser.NL, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends StatementContext {
		public TerminalNode PRINT() { return getToken(VASCParser.PRINT, 0); }
		public TerminalNode L_BRACKET() { return getToken(VASCParser.L_BRACKET, 0); }
		public TerminalNode STRING() { return getToken(VASCParser.STRING, 0); }
		public TerminalNode R_BRACKET() { return getToken(VASCParser.R_BRACKET, 0); }
		public PrintStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends StatementContext {
		public ExpressionContext condition;
		public TerminalNode WHILE() { return getToken(VASCParser.WHILE, 0); }
		public TerminalNode LOOP() { return getToken(VASCParser.LOOP, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode END() { return getToken(VASCParser.END, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(VASCParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VASCParser.NL, i);
		}
		public WhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignStatementContext extends StatementContext {
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
		public AssignStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				_localctx = new AssignStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				identifier();
				setState(281);
				match(ASSIGN_OP);
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(282);
					match(NL);
					}
					}
					setState(287);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(288);
				expression();
				}
				break;
			case 2:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				match(WHILE);
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(291);
					match(NL);
					}
					}
					setState(296);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(297);
				((WhileStatementContext)_localctx).condition = expression();
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
				match(LOOP);
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
				break;
			case 3:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
				match(IF);
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(321);
					match(NL);
					}
					}
					setState(326);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(327);
				((IfStatementContext)_localctx).condition = expression();
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(328);
					match(NL);
					}
					}
					setState(333);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(334);
				match(THEN);
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(335);
						match(NL);
						}
						} 
					}
					setState(340);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				setState(341);
				((IfStatementContext)_localctx).thenBody = body();
				setState(345);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(342);
						match(NL);
						}
						} 
					}
					setState(347);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(348);
					match(ELSE);
					setState(352);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(349);
							match(NL);
							}
							} 
						}
						setState(354);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
					}
					setState(355);
					((IfStatementContext)_localctx).elseBody = body();
					}
				}

				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(358);
					match(NL);
					}
					}
					setState(363);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(364);
				match(END);
				}
				break;
			case 4:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(366);
				match(RETURN);
				setState(370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(367);
						match(NL);
						}
						} 
					}
					setState(372);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 55818584080L) != 0)) {
					{
					setState(373);
					expression();
					}
				}

				}
				break;
			case 5:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(376);
				expression();
				}
				break;
			case 6:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(377);
				match(PRINT);
				setState(378);
				match(L_BRACKET);
				setState(379);
				match(STRING);
				setState(380);
				match(R_BRACKET);
				}
				break;
			case 7:
				_localctx = new VariableStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(381);
				variableDeclaration();
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
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisExpressionContext extends ExpressionContext {
		public TerminalNode THIS() { return getToken(VASCParser.THIS, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public List<DotCallContext> dotCall() {
			return getRuleContexts(DotCallContext.class);
		}
		public DotCallContext dotCall(int i) {
			return getRuleContext(DotCallContext.class,i);
		}
		public ThisExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallableExpressionContext extends ExpressionContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public List<DotCallContext> dotCall() {
			return getRuleContexts(DotCallContext.class);
		}
		public DotCallContext dotCall(int i) {
			return getRuleContext(DotCallContext.class,i);
		}
		public CallableExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ExpressionContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public PrimaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableExpressionContext extends ExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<DotCallContext> dotCall() {
			return getRuleContexts(DotCallContext.class);
		}
		public DotCallContext dotCall(int i) {
			return getRuleContext(DotCallContext.class,i);
		}
		public VariableExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SuperExpressionContext extends ExpressionContext {
		public TerminalNode SUPER() { return getToken(VASCParser.SUPER, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public List<DotCallContext> dotCall() {
			return getRuleContexts(DotCallContext.class);
		}
		public DotCallContext dotCall(int i) {
			return getRuleContext(DotCallContext.class,i);
		}
		public SuperExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression);
		int _la;
		try {
			int _alt;
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				_localctx = new ThisExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				match(THIS);
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==L_BRACKET) {
					{
					setState(385);
					arguments();
					}
				}

				setState(391);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(388);
						dotCall();
						}
						} 
					}
					setState(393);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new SuperExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				match(SUPER);
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==L_BRACKET) {
					{
					setState(395);
					arguments();
					}
				}

				setState(401);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(398);
						dotCall();
						}
						} 
					}
					setState(403);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				}
				break;
			case 3:
				_localctx = new VariableExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(404);
				identifier();
				setState(408);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(405);
						dotCall();
						}
						} 
					}
					setState(410);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				}
				}
				break;
			case 4:
				_localctx = new CallableExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(411);
				className();
				setState(412);
				arguments();
				setState(416);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(413);
						dotCall();
						}
						} 
					}
					setState(418);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				}
				}
				break;
			case 5:
				_localctx = new PrimaryExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(419);
				primary();
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
	public static class DotCallContext extends ParserRuleContext {
		public DotCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotCall; }
	 
		public DotCallContext() { }
		public void copyFrom(DotCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FieldAccessContext extends DotCallContext {
		public TerminalNode DOT() { return getToken(VASCParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(VASCParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VASCParser.NL, i);
		}
		public FieldAccessContext(DotCallContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallContext extends DotCallContext {
		public TerminalNode DOT() { return getToken(VASCParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(VASCParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VASCParser.NL, i);
		}
		public MethodCallContext(DotCallContext ctx) { copyFrom(ctx); }
	}

	public final DotCallContext dotCall() throws RecognitionException {
		DotCallContext _localctx = new DotCallContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dotCall);
		int _la;
		try {
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				_localctx = new FieldAccessContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(422);
					match(NL);
					}
					}
					setState(427);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(428);
				match(DOT);
				setState(429);
				identifier();
				}
				break;
			case 2:
				_localctx = new MethodCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(430);
					match(NL);
					}
					}
					setState(435);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(436);
				match(DOT);
				setState(437);
				identifier();
				setState(438);
				arguments();
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
		enterRule(_localctx, 22, RULE_arguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(L_BRACKET);
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(443);
				match(NL);
				}
				}
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 55818584080L) != 0)) {
				{
				setState(449);
				expression();
				setState(466);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(453);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(450);
							match(NL);
							}
							}
							setState(455);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(456);
						match(COMMA);
						setState(460);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(457);
							match(NL);
							}
							}
							setState(462);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(463);
						expression();
						}
						} 
					}
					setState(468);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				}
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(469);
					match(NL);
					}
					}
					setState(474);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(477);
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
	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RealLiteralContext extends PrimaryContext {
		public TerminalNode DOT() { return getToken(VASCParser.DOT, 0); }
		public TerminalNode MINUS() { return getToken(VASCParser.MINUS, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(VASCParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(VASCParser.DIGIT, i);
		}
		public RealLiteralContext(PrimaryContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueLiteralContext extends PrimaryContext {
		public TerminalNode TRUE() { return getToken(VASCParser.TRUE, 0); }
		public TrueLiteralContext(PrimaryContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullLiteralContext extends PrimaryContext {
		public TerminalNode NULL() { return getToken(VASCParser.NULL, 0); }
		public NullLiteralContext(PrimaryContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerLiteralContext extends PrimaryContext {
		public TerminalNode MINUS() { return getToken(VASCParser.MINUS, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(VASCParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(VASCParser.DIGIT, i);
		}
		public IntegerLiteralContext(PrimaryContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseLiteralContext extends PrimaryContext {
		public TerminalNode FALSE() { return getToken(VASCParser.FALSE, 0); }
		public FalseLiteralContext(PrimaryContext ctx) { copyFrom(ctx); }
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_primary);
		int _la;
		try {
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(479);
					match(MINUS);
					}
				}

				setState(483); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(482);
					match(DIGIT);
					}
					}
					setState(485); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				}
				break;
			case 2:
				_localctx = new RealLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(487);
					match(MINUS);
					}
				}

				setState(491); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(490);
					match(DIGIT);
					}
					}
					setState(493); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				setState(495);
				match(DOT);
				setState(497); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(496);
					match(DIGIT);
					}
					}
					setState(499); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				}
				break;
			case 3:
				_localctx = new TrueLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(501);
				match(TRUE);
				}
				break;
			case 4:
				_localctx = new FalseLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(502);
				match(FALSE);
				}
				break;
			case 5:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(503);
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
		enterRule(_localctx, 26, RULE_genericType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(L_SQUARE_BRACKET);
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(507);
				match(NL);
				}
				}
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(513);
			className();
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(514);
				match(NL);
				}
				}
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(520);
			match(R_SQUARE_BRACKET);
			}
		}
		catch (RecognitionException re) {
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
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
	 
		public ClassNameContext() { }
		public void copyFrom(ClassNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayTypeContext extends ClassNameContext {
		public TerminalNode ARRAY() { return getToken(VASCParser.ARRAY, 0); }
		public GenericTypeContext genericType() {
			return getRuleContext(GenericTypeContext.class,0);
		}
		public ArrayTypeContext(ClassNameContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerTypeContext extends ClassNameContext {
		public TerminalNode INT() { return getToken(VASCParser.INT, 0); }
		public IntegerTypeContext(ClassNameContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListTypeContext extends ClassNameContext {
		public TerminalNode LIST() { return getToken(VASCParser.LIST, 0); }
		public GenericTypeContext genericType() {
			return getRuleContext(GenericTypeContext.class,0);
		}
		public ListTypeContext(ClassNameContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanTypeContext extends ClassNameContext {
		public TerminalNode BOOL() { return getToken(VASCParser.BOOL, 0); }
		public BooleanTypeContext(ClassNameContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RealTypeContext extends ClassNameContext {
		public TerminalNode REAL() { return getToken(VASCParser.REAL, 0); }
		public RealTypeContext(ClassNameContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UserTypeContext extends ClassNameContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UserTypeContext(ClassNameContext ctx) { copyFrom(ctx); }
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_className);
		try {
			setState(530);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
				_localctx = new ArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(522);
				match(ARRAY);
				setState(523);
				genericType();
				}
				break;
			case LIST:
				_localctx = new ListTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				match(LIST);
				setState(525);
				genericType();
				}
				break;
			case INT:
				_localctx = new IntegerTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(526);
				match(INT);
				}
				break;
			case BOOL:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(527);
				match(BOOL);
				}
				break;
			case REAL:
				_localctx = new RealTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(528);
				match(REAL);
				}
				break;
			case IDENTIFIER:
				_localctx = new UserTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(529);
				identifier();
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
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(VASCParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
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
	public static class SemiContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(VASCParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(VASCParser.NL, i);
		}
		public SemiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semi; }
	}

	public final SemiContext semi() throws RecognitionException {
		SemiContext _localctx = new SemiContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_semi);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(535); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(534);
					match(NL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(537); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
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
		"\u0004\u0001(\u021c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0005\u0000$\b\u0000\n\u0000\f\u0000"+
		"\'\t\u0000\u0001\u0000\u0001\u0000\u0003\u0000+\b\u0000\u0005\u0000-\b"+
		"\u0000\n\u0000\f\u00000\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0005\u00016\b\u0001\n\u0001\f\u00019\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001=\b\u0001\n\u0001\f\u0001@\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001D\b\u0001\n\u0001\f\u0001G\t\u0001\u0001\u0001\u0003"+
		"\u0001J\b\u0001\u0001\u0001\u0005\u0001M\b\u0001\n\u0001\f\u0001P\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001T\b\u0001\n\u0001\f\u0001W\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001[\b\u0001\n\u0001\f\u0001^\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"e\b\u0002\n\u0002\f\u0002h\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003m\b\u0003\n\u0003\f\u0003p\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003t\b\u0003\n\u0003\f\u0003w\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003{\b\u0003\n\u0003\f\u0003~\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003\u0082\b\u0003\n\u0003\f\u0003\u0085\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003\u0089\b\u0003\n\u0003\f\u0003\u008c\t\u0003\u0003\u0003"+
		"\u008e\b\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0092\b\u0003\n\u0003"+
		"\f\u0003\u0095\t\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0099\b\u0003"+
		"\n\u0003\f\u0003\u009c\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003\u00a2\b\u0003\n\u0003\f\u0003\u00a5\t\u0003\u0001\u0003"+
		"\u0003\u0003\u00a8\b\u0003\u0001\u0003\u0005\u0003\u00ab\b\u0003\n\u0003"+
		"\f\u0003\u00ae\t\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00b2\b\u0003"+
		"\n\u0003\f\u0003\u00b5\t\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00b9"+
		"\b\u0003\n\u0003\f\u0003\u00bc\t\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u00c0\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"\u00c6\b\u0004\n\u0004\f\u0004\u00c9\t\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004\u00cd\b\u0004\n\u0004\f\u0004\u00d0\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004\u00d4\b\u0004\n\u0004\f\u0004\u00d7\t\u0004\u0001\u0004\u0003"+
		"\u0004\u00da\b\u0004\u0001\u0005\u0001\u0005\u0005\u0005\u00de\b\u0005"+
		"\n\u0005\f\u0005\u00e1\t\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00e5"+
		"\b\u0005\n\u0005\f\u0005\u00e8\t\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u00ec\b\u0005\n\u0005\f\u0005\u00ef\t\u0005\u0001\u0005\u0005\u0005\u00f2"+
		"\b\u0005\n\u0005\f\u0005\u00f5\t\u0005\u0003\u0005\u00f7\b\u0005\u0001"+
		"\u0005\u0005\u0005\u00fa\b\u0005\n\u0005\f\u0005\u00fd\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0005\u0006\u0103\b\u0006\n\u0006"+
		"\f\u0006\u0106\t\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u010a\b\u0006"+
		"\n\u0006\f\u0006\u010d\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u0114\b\u0007\n\u0007\f\u0007\u0117\t\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0005\b\u011c\b\b\n\b\f\b\u011f\t\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u0125\b\b\n\b\f\b\u0128\t\b\u0001\b\u0001\b"+
		"\u0005\b\u012c\b\b\n\b\f\b\u012f\t\b\u0001\b\u0001\b\u0005\b\u0133\b\b"+
		"\n\b\f\b\u0136\t\b\u0001\b\u0001\b\u0005\b\u013a\b\b\n\b\f\b\u013d\t\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0143\b\b\n\b\f\b\u0146\t\b\u0001"+
		"\b\u0001\b\u0005\b\u014a\b\b\n\b\f\b\u014d\t\b\u0001\b\u0001\b\u0005\b"+
		"\u0151\b\b\n\b\f\b\u0154\t\b\u0001\b\u0001\b\u0005\b\u0158\b\b\n\b\f\b"+
		"\u015b\t\b\u0001\b\u0001\b\u0005\b\u015f\b\b\n\b\f\b\u0162\t\b\u0001\b"+
		"\u0003\b\u0165\b\b\u0001\b\u0005\b\u0168\b\b\n\b\f\b\u016b\t\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0005\b\u0171\b\b\n\b\f\b\u0174\t\b\u0001\b\u0003"+
		"\b\u0177\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u017f"+
		"\b\b\u0001\t\u0001\t\u0003\t\u0183\b\t\u0001\t\u0005\t\u0186\b\t\n\t\f"+
		"\t\u0189\t\t\u0001\t\u0001\t\u0003\t\u018d\b\t\u0001\t\u0005\t\u0190\b"+
		"\t\n\t\f\t\u0193\t\t\u0001\t\u0001\t\u0005\t\u0197\b\t\n\t\f\t\u019a\t"+
		"\t\u0001\t\u0001\t\u0001\t\u0005\t\u019f\b\t\n\t\f\t\u01a2\t\t\u0001\t"+
		"\u0003\t\u01a5\b\t\u0001\n\u0005\n\u01a8\b\n\n\n\f\n\u01ab\t\n\u0001\n"+
		"\u0001\n\u0001\n\u0005\n\u01b0\b\n\n\n\f\n\u01b3\t\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u01b9\b\n\u0001\u000b\u0001\u000b\u0005\u000b\u01bd"+
		"\b\u000b\n\u000b\f\u000b\u01c0\t\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u01c4\b\u000b\n\u000b\f\u000b\u01c7\t\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u01cb\b\u000b\n\u000b\f\u000b\u01ce\t\u000b\u0001\u000b\u0005\u000b"+
		"\u01d1\b\u000b\n\u000b\f\u000b\u01d4\t\u000b\u0001\u000b\u0005\u000b\u01d7"+
		"\b\u000b\n\u000b\f\u000b\u01da\t\u000b\u0003\u000b\u01dc\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0003\f\u01e1\b\f\u0001\f\u0004\f\u01e4\b\f"+
		"\u000b\f\f\f\u01e5\u0001\f\u0003\f\u01e9\b\f\u0001\f\u0004\f\u01ec\b\f"+
		"\u000b\f\f\f\u01ed\u0001\f\u0001\f\u0004\f\u01f2\b\f\u000b\f\f\f\u01f3"+
		"\u0001\f\u0001\f\u0001\f\u0003\f\u01f9\b\f\u0001\r\u0001\r\u0005\r\u01fd"+
		"\b\r\n\r\f\r\u0200\t\r\u0001\r\u0001\r\u0005\r\u0204\b\r\n\r\f\r\u0207"+
		"\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0213\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0004\u0010\u0218\b\u0010\u000b\u0010\f"+
		"\u0010\u0219\u0001\u0010\u0000\u0000\u0011\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \u0000\u0000"+
		"\u0269\u0000%\u0001\u0000\u0000\u0000\u00023\u0001\u0000\u0000\u0000\u0004"+
		"f\u0001\u0000\u0000\u0000\u0006\u00bf\u0001\u0000\u0000\u0000\b\u00c1"+
		"\u0001\u0000\u0000\u0000\n\u00db\u0001\u0000\u0000\u0000\f\u0100\u0001"+
		"\u0000\u0000\u0000\u000e\u0115\u0001\u0000\u0000\u0000\u0010\u017e\u0001"+
		"\u0000\u0000\u0000\u0012\u01a4\u0001\u0000\u0000\u0000\u0014\u01b8\u0001"+
		"\u0000\u0000\u0000\u0016\u01ba\u0001\u0000\u0000\u0000\u0018\u01f8\u0001"+
		"\u0000\u0000\u0000\u001a\u01fa\u0001\u0000\u0000\u0000\u001c\u0212\u0001"+
		"\u0000\u0000\u0000\u001e\u0214\u0001\u0000\u0000\u0000 \u0217\u0001\u0000"+
		"\u0000\u0000\"$\u0005$\u0000\u0000#\"\u0001\u0000\u0000\u0000$\'\u0001"+
		"\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000"+
		"&.\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000(*\u0003\u0002\u0001"+
		"\u0000)+\u0003 \u0010\u0000*)\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000"+
		"\u0000+-\u0001\u0000\u0000\u0000,(\u0001\u0000\u0000\u0000-0\u0001\u0000"+
		"\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/1\u0001"+
		"\u0000\u0000\u00000.\u0001\u0000\u0000\u000012\u0005\u0000\u0000\u0001"+
		"2\u0001\u0001\u0000\u0000\u000037\u0005\n\u0000\u000046\u0005$\u0000\u0000"+
		"54\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000\u0000"+
		"\u000078\u0001\u0000\u0000\u00008:\u0001\u0000\u0000\u000097\u0001\u0000"+
		"\u0000\u0000:>\u0003\u001e\u000f\u0000;=\u0005$\u0000\u0000<;\u0001\u0000"+
		"\u0000\u0000=@\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001"+
		"\u0000\u0000\u0000?I\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000"+
		"AE\u0005\u000b\u0000\u0000BD\u0005$\u0000\u0000CB\u0001\u0000\u0000\u0000"+
		"DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000"+
		"\u0000FH\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HJ\u0003\u001e"+
		"\u000f\u0000IA\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JN\u0001"+
		"\u0000\u0000\u0000KM\u0005$\u0000\u0000LK\u0001\u0000\u0000\u0000MP\u0001"+
		"\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000"+
		"OQ\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QU\u0005\u000f\u0000"+
		"\u0000RT\u0005$\u0000\u0000SR\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000"+
		"\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VX\u0001\u0000"+
		"\u0000\u0000WU\u0001\u0000\u0000\u0000X\\\u0003\u0004\u0002\u0000Y[\u0005"+
		"$\u0000\u0000ZY\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001"+
		"\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]_\u0001\u0000\u0000\u0000"+
		"^\\\u0001\u0000\u0000\u0000_`\u0005\u0010\u0000\u0000`\u0003\u0001\u0000"+
		"\u0000\u0000ab\u0003\u0006\u0003\u0000bc\u0003 \u0010\u0000ce\u0001\u0000"+
		"\u0000\u0000da\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001"+
		"\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g\u0005\u0001\u0000\u0000"+
		"\u0000hf\u0001\u0000\u0000\u0000i\u00c0\u0003\b\u0004\u0000jn\u0005\f"+
		"\u0000\u0000km\u0005$\u0000\u0000lk\u0001\u0000\u0000\u0000mp\u0001\u0000"+
		"\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000oq\u0001"+
		"\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000qu\u0003\u001e\u000f\u0000"+
		"rt\u0005$\u0000\u0000sr\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000"+
		"us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vx\u0001\u0000\u0000"+
		"\u0000wu\u0001\u0000\u0000\u0000x|\u0003\n\u0005\u0000y{\u0005$\u0000"+
		"\u0000zy\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000"+
		"\u0000\u0000|}\u0001\u0000\u0000\u0000}\u008d\u0001\u0000\u0000\u0000"+
		"~|\u0001\u0000\u0000\u0000\u007f\u0083\u0005\u0002\u0000\u0000\u0080\u0082"+
		"\u0005$\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0085\u0001"+
		"\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001"+
		"\u0000\u0000\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085\u0083\u0001"+
		"\u0000\u0000\u0000\u0086\u008a\u0003\u001c\u000e\u0000\u0087\u0089\u0005"+
		"$\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000"+
		"\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000"+
		"\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000"+
		"\u0000\u0000\u008d\u007f\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0093\u0005\u000f"+
		"\u0000\u0000\u0090\u0092\u0005$\u0000\u0000\u0091\u0090\u0001\u0000\u0000"+
		"\u0000\u0092\u0095\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0096\u0001\u0000\u0000"+
		"\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096\u009a\u0003\u000e\u0007"+
		"\u0000\u0097\u0099\u0005$\u0000\u0000\u0098\u0097\u0001\u0000\u0000\u0000"+
		"\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009d\u0001\u0000\u0000\u0000"+
		"\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u009e\u0005\u0010\u0000\u0000"+
		"\u009e\u00c0\u0001\u0000\u0000\u0000\u009f\u00a3\u0005\u0012\u0000\u0000"+
		"\u00a0\u00a2\u0005$\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a8\u0003\n\u0005\u0000\u00a7\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00ac"+
		"\u0001\u0000\u0000\u0000\u00a9\u00ab\u0005$\u0000\u0000\u00aa\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00af\u0001"+
		"\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u00b3\u0005"+
		"\u000f\u0000\u0000\u00b0\u00b2\u0005$\u0000\u0000\u00b1\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00ba\u0003\u000e"+
		"\u0007\u0000\u00b7\u00b9\u0005$\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\u0010\u0000"+
		"\u0000\u00be\u00c0\u0001\u0000\u0000\u0000\u00bfi\u0001\u0000\u0000\u0000"+
		"\u00bfj\u0001\u0000\u0000\u0000\u00bf\u009f\u0001\u0000\u0000\u0000\u00c0"+
		"\u0007\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005\u0017\u0000\u0000\u00c2"+
		"\u00c3\u0003\u001e\u000f\u0000\u00c3\u00c7\u0005\u0002\u0000\u0000\u00c4"+
		"\u00c6\u0005$\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c9"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u0001\u0000\u0000\u0000\u00c8\u00ca\u0001\u0000\u0000\u0000\u00c9\u00c7"+
		"\u0001\u0000\u0000\u0000\u00ca\u00d9\u0003\u001c\u000e\u0000\u00cb\u00cd"+
		"\u0005$\u0000\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cd\u00d0\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d1\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d5\u0005\t\u0000\u0000\u00d2\u00d4\u0005$"+
		"\u0000\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d8\u00da\u0003\u0012\t\u0000\u00d9\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\t\u0001\u0000\u0000\u0000"+
		"\u00db\u00df\u0005\u0005\u0000\u0000\u00dc\u00de\u0005$\u0000\u0000\u00dd"+
		"\u00dc\u0001\u0000\u0000\u0000\u00de\u00e1\u0001\u0000\u0000\u0000\u00df"+
		"\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0"+
		"\u00f6\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2"+
		"\u00f3\u0003\f\u0006\u0000\u00e3\u00e5\u0005$\u0000\u0000\u00e4\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e8\u0001\u0000\u0000\u0000\u00e6\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e9"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e9\u00ed"+
		"\u0005\u0003\u0000\u0000\u00ea\u00ec\u0005$\u0000\u0000\u00eb\u00ea\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00f0\u0001"+
		"\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f2\u0003"+
		"\f\u0006\u0000\u00f1\u00e6\u0001\u0000\u0000\u0000\u00f2\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f7\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f6\u00e2\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f7\u00fb\u0001\u0000\u0000\u0000\u00f8\u00fa\u0005$\u0000"+
		"\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fd\u0001\u0000\u0000"+
		"\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fe\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fe\u00ff\u0005\u0006\u0000\u0000\u00ff\u000b\u0001\u0000\u0000"+
		"\u0000\u0100\u0104\u0003\u001e\u000f\u0000\u0101\u0103\u0005$\u0000\u0000"+
		"\u0102\u0101\u0001\u0000\u0000\u0000\u0103\u0106\u0001\u0000\u0000\u0000"+
		"\u0104\u0102\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000"+
		"\u0105\u0107\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000"+
		"\u0107\u010b\u0005\u0002\u0000\u0000\u0108\u010a\u0005$\u0000\u0000\u0109"+
		"\u0108\u0001\u0000\u0000\u0000\u010a\u010d\u0001\u0000\u0000\u0000\u010b"+
		"\u0109\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c"+
		"\u010e\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010e"+
		"\u010f\u0003\u001c\u000e\u0000\u010f\r\u0001\u0000\u0000\u0000\u0110\u0111"+
		"\u0003\u0010\b\u0000\u0111\u0112\u0003 \u0010\u0000\u0112\u0114\u0001"+
		"\u0000\u0000\u0000\u0113\u0110\u0001\u0000\u0000\u0000\u0114\u0117\u0001"+
		"\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0116\u0001"+
		"\u0000\u0000\u0000\u0116\u000f\u0001\u0000\u0000\u0000\u0117\u0115\u0001"+
		"\u0000\u0000\u0000\u0118\u0119\u0003\u001e\u000f\u0000\u0119\u011d\u0005"+
		"\t\u0000\u0000\u011a\u011c\u0005$\u0000\u0000\u011b\u011a\u0001\u0000"+
		"\u0000\u0000\u011c\u011f\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000"+
		"\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u0120\u0001\u0000"+
		"\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u0120\u0121\u0003\u0012"+
		"\t\u0000\u0121\u017f\u0001\u0000\u0000\u0000\u0122\u0126\u0005\r\u0000"+
		"\u0000\u0123\u0125\u0005$\u0000\u0000\u0124\u0123\u0001\u0000\u0000\u0000"+
		"\u0125\u0128\u0001\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000"+
		"\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0129\u0001\u0000\u0000\u0000"+
		"\u0128\u0126\u0001\u0000\u0000\u0000\u0129\u012d\u0003\u0012\t\u0000\u012a"+
		"\u012c\u0005$\u0000\u0000\u012b\u012a\u0001\u0000\u0000\u0000\u012c\u012f"+
		"\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012d\u012e"+
		"\u0001\u0000\u0000\u0000\u012e\u0130\u0001\u0000\u0000\u0000\u012f\u012d"+
		"\u0001\u0000\u0000\u0000\u0130\u0134\u0005\u000e\u0000\u0000\u0131\u0133"+
		"\u0005$\u0000\u0000\u0132\u0131\u0001\u0000\u0000\u0000\u0133\u0136\u0001"+
		"\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0134\u0135\u0001"+
		"\u0000\u0000\u0000\u0135\u0137\u0001\u0000\u0000\u0000\u0136\u0134\u0001"+
		"\u0000\u0000\u0000\u0137\u013b\u0003\u000e\u0007\u0000\u0138\u013a\u0005"+
		"$\u0000\u0000\u0139\u0138\u0001\u0000\u0000\u0000\u013a\u013d\u0001\u0000"+
		"\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000"+
		"\u0000\u0000\u013c\u013e\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000"+
		"\u0000\u0000\u013e\u013f\u0005\u0010\u0000\u0000\u013f\u017f\u0001\u0000"+
		"\u0000\u0000\u0140\u0144\u0005\u0014\u0000\u0000\u0141\u0143\u0005$\u0000"+
		"\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0143\u0146\u0001\u0000\u0000"+
		"\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000"+
		"\u0000\u0145\u0147\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000\u0000"+
		"\u0000\u0147\u014b\u0003\u0012\t\u0000\u0148\u014a\u0005$\u0000\u0000"+
		"\u0149\u0148\u0001\u0000\u0000\u0000\u014a\u014d\u0001\u0000\u0000\u0000"+
		"\u014b\u0149\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000"+
		"\u014c\u014e\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000"+
		"\u014e\u0152\u0005\u0015\u0000\u0000\u014f\u0151\u0005$\u0000\u0000\u0150"+
		"\u014f\u0001\u0000\u0000\u0000\u0151\u0154\u0001\u0000\u0000\u0000\u0152"+
		"\u0150\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153"+
		"\u0155\u0001\u0000\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0155"+
		"\u0159\u0003\u000e\u0007\u0000\u0156\u0158\u0005$\u0000\u0000\u0157\u0156"+
		"\u0001\u0000\u0000\u0000\u0158\u015b\u0001\u0000\u0000\u0000\u0159\u0157"+
		"\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u0164"+
		"\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015c\u0160"+
		"\u0005\u0016\u0000\u0000\u015d\u015f\u0005$\u0000\u0000\u015e\u015d\u0001"+
		"\u0000\u0000\u0000\u015f\u0162\u0001\u0000\u0000\u0000\u0160\u015e\u0001"+
		"\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0163\u0001"+
		"\u0000\u0000\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u0163\u0165\u0003"+
		"\u000e\u0007\u0000\u0164\u015c\u0001\u0000\u0000\u0000\u0164\u0165\u0001"+
		"\u0000\u0000\u0000\u0165\u0169\u0001\u0000\u0000\u0000\u0166\u0168\u0005"+
		"$\u0000\u0000\u0167\u0166\u0001\u0000\u0000\u0000\u0168\u016b\u0001\u0000"+
		"\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000"+
		"\u0000\u0000\u016a\u016c\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000"+
		"\u0000\u0000\u016c\u016d\u0005\u0010\u0000\u0000\u016d\u017f\u0001\u0000"+
		"\u0000\u0000\u016e\u0172\u0005\u0011\u0000\u0000\u016f\u0171\u0005$\u0000"+
		"\u0000\u0170\u016f\u0001\u0000\u0000\u0000\u0171\u0174\u0001\u0000\u0000"+
		"\u0000\u0172\u0170\u0001\u0000\u0000\u0000\u0172\u0173\u0001\u0000\u0000"+
		"\u0000\u0173\u0176\u0001\u0000\u0000\u0000\u0174\u0172\u0001\u0000\u0000"+
		"\u0000\u0175\u0177\u0003\u0012\t\u0000\u0176\u0175\u0001\u0000\u0000\u0000"+
		"\u0176\u0177\u0001\u0000\u0000\u0000\u0177\u017f\u0001\u0000\u0000\u0000"+
		"\u0178\u017f\u0003\u0012\t\u0000\u0179\u017a\u0005 \u0000\u0000\u017a"+
		"\u017b\u0005\u0005\u0000\u0000\u017b\u017c\u0005!\u0000\u0000\u017c\u017f"+
		"\u0005\u0006\u0000\u0000\u017d\u017f\u0003\b\u0004\u0000\u017e\u0118\u0001"+
		"\u0000\u0000\u0000\u017e\u0122\u0001\u0000\u0000\u0000\u017e\u0140\u0001"+
		"\u0000\u0000\u0000\u017e\u016e\u0001\u0000\u0000\u0000\u017e\u0178\u0001"+
		"\u0000\u0000\u0000\u017e\u0179\u0001\u0000\u0000\u0000\u017e\u017d\u0001"+
		"\u0000\u0000\u0000\u017f\u0011\u0001\u0000\u0000\u0000\u0180\u0182\u0005"+
		"\u0012\u0000\u0000\u0181\u0183\u0003\u0016\u000b\u0000\u0182\u0181\u0001"+
		"\u0000\u0000\u0000\u0182\u0183\u0001\u0000\u0000\u0000\u0183\u0187\u0001"+
		"\u0000\u0000\u0000\u0184\u0186\u0003\u0014\n\u0000\u0185\u0184\u0001\u0000"+
		"\u0000\u0000\u0186\u0189\u0001\u0000\u0000\u0000\u0187\u0185\u0001\u0000"+
		"\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u01a5\u0001\u0000"+
		"\u0000\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u018a\u018c\u0005\u0013"+
		"\u0000\u0000\u018b\u018d\u0003\u0016\u000b\u0000\u018c\u018b\u0001\u0000"+
		"\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u0191\u0001\u0000"+
		"\u0000\u0000\u018e\u0190\u0003\u0014\n\u0000\u018f\u018e\u0001\u0000\u0000"+
		"\u0000\u0190\u0193\u0001\u0000\u0000\u0000\u0191\u018f\u0001\u0000\u0000"+
		"\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u01a5\u0001\u0000\u0000"+
		"\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0194\u0198\u0003\u001e\u000f"+
		"\u0000\u0195\u0197\u0003\u0014\n\u0000\u0196\u0195\u0001\u0000\u0000\u0000"+
		"\u0197\u019a\u0001\u0000\u0000\u0000\u0198\u0196\u0001\u0000\u0000\u0000"+
		"\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u01a5\u0001\u0000\u0000\u0000"+
		"\u019a\u0198\u0001\u0000\u0000\u0000\u019b\u019c\u0003\u001c\u000e\u0000"+
		"\u019c\u01a0\u0003\u0016\u000b\u0000\u019d\u019f\u0003\u0014\n\u0000\u019e"+
		"\u019d\u0001\u0000\u0000\u0000\u019f\u01a2\u0001\u0000\u0000\u0000\u01a0"+
		"\u019e\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1"+
		"\u01a5\u0001\u0000\u0000\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a3"+
		"\u01a5\u0003\u0018\f\u0000\u01a4\u0180\u0001\u0000\u0000\u0000\u01a4\u018a"+
		"\u0001\u0000\u0000\u0000\u01a4\u0194\u0001\u0000\u0000\u0000\u01a4\u019b"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a3\u0001\u0000\u0000\u0000\u01a5\u0013"+
		"\u0001\u0000\u0000\u0000\u01a6\u01a8\u0005$\u0000\u0000\u01a7\u01a6\u0001"+
		"\u0000\u0000\u0000\u01a8\u01ab\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001"+
		"\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa\u01ac\u0001"+
		"\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ac\u01ad\u0005"+
		"\u0001\u0000\u0000\u01ad\u01b9\u0003\u001e\u000f\u0000\u01ae\u01b0\u0005"+
		"$\u0000\u0000\u01af\u01ae\u0001\u0000\u0000\u0000\u01b0\u01b3\u0001\u0000"+
		"\u0000\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000"+
		"\u0000\u0000\u01b2\u01b4\u0001\u0000\u0000\u0000\u01b3\u01b1\u0001\u0000"+
		"\u0000\u0000\u01b4\u01b5\u0005\u0001\u0000\u0000\u01b5\u01b6\u0003\u001e"+
		"\u000f\u0000\u01b6\u01b7\u0003\u0016\u000b\u0000\u01b7\u01b9\u0001\u0000"+
		"\u0000\u0000\u01b8\u01a9\u0001\u0000\u0000\u0000\u01b8\u01b1\u0001\u0000"+
		"\u0000\u0000\u01b9\u0015\u0001\u0000\u0000\u0000\u01ba\u01be\u0005\u0005"+
		"\u0000\u0000\u01bb\u01bd\u0005$\u0000\u0000\u01bc\u01bb\u0001\u0000\u0000"+
		"\u0000\u01bd\u01c0\u0001\u0000\u0000\u0000\u01be\u01bc\u0001\u0000\u0000"+
		"\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf\u01db\u0001\u0000\u0000"+
		"\u0000\u01c0\u01be\u0001\u0000\u0000\u0000\u01c1\u01d2\u0003\u0012\t\u0000"+
		"\u01c2\u01c4\u0005$\u0000\u0000\u01c3\u01c2\u0001\u0000\u0000\u0000\u01c4"+
		"\u01c7\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c5"+
		"\u01c6\u0001\u0000\u0000\u0000\u01c6\u01c8\u0001\u0000\u0000\u0000\u01c7"+
		"\u01c5\u0001\u0000\u0000\u0000\u01c8\u01cc\u0005\u0003\u0000\u0000\u01c9"+
		"\u01cb\u0005$\u0000\u0000\u01ca\u01c9\u0001\u0000\u0000\u0000\u01cb\u01ce"+
		"\u0001\u0000\u0000\u0000\u01cc\u01ca\u0001\u0000\u0000\u0000\u01cc\u01cd"+
		"\u0001\u0000\u0000\u0000\u01cd\u01cf\u0001\u0000\u0000\u0000\u01ce\u01cc"+
		"\u0001\u0000\u0000\u0000\u01cf\u01d1\u0003\u0012\t\u0000\u01d0\u01c5\u0001"+
		"\u0000\u0000\u0000\u01d1\u01d4\u0001\u0000\u0000\u0000\u01d2\u01d0\u0001"+
		"\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01d8\u0001"+
		"\u0000\u0000\u0000\u01d4\u01d2\u0001\u0000\u0000\u0000\u01d5\u01d7\u0005"+
		"$\u0000\u0000\u01d6\u01d5\u0001\u0000\u0000\u0000\u01d7\u01da\u0001\u0000"+
		"\u0000\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000"+
		"\u0000\u0000\u01d9\u01dc\u0001\u0000\u0000\u0000\u01da\u01d8\u0001\u0000"+
		"\u0000\u0000\u01db\u01c1\u0001\u0000\u0000\u0000\u01db\u01dc\u0001\u0000"+
		"\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u01de\u0005\u0006"+
		"\u0000\u0000\u01de\u0017\u0001\u0000\u0000\u0000\u01df\u01e1\u0005\u0004"+
		"\u0000\u0000\u01e0\u01df\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000"+
		"\u0000\u0000\u01e1\u01e3\u0001\u0000\u0000\u0000\u01e2\u01e4\u0005#\u0000"+
		"\u0000\u01e3\u01e2\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000"+
		"\u0000\u01e5\u01e3\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000"+
		"\u0000\u01e6\u01f9\u0001\u0000\u0000\u0000\u01e7\u01e9\u0005\u0004\u0000"+
		"\u0000\u01e8\u01e7\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000"+
		"\u0000\u01e9\u01eb\u0001\u0000\u0000\u0000\u01ea\u01ec\u0005#\u0000\u0000"+
		"\u01eb\u01ea\u0001\u0000\u0000\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000"+
		"\u01ed\u01eb\u0001\u0000\u0000\u0000\u01ed\u01ee\u0001\u0000\u0000\u0000"+
		"\u01ee\u01ef\u0001\u0000\u0000\u0000\u01ef\u01f1\u0005\u0001\u0000\u0000"+
		"\u01f0\u01f2\u0005#\u0000\u0000\u01f1\u01f0\u0001\u0000\u0000\u0000\u01f2"+
		"\u01f3\u0001\u0000\u0000\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f3"+
		"\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f9\u0001\u0000\u0000\u0000\u01f5"+
		"\u01f9\u0005\u001d\u0000\u0000\u01f6\u01f9\u0005\u001e\u0000\u0000\u01f7"+
		"\u01f9\u0005\u001f\u0000\u0000\u01f8\u01e0\u0001\u0000\u0000\u0000\u01f8"+
		"\u01e8\u0001\u0000\u0000\u0000\u01f8\u01f5\u0001\u0000\u0000\u0000\u01f8"+
		"\u01f6\u0001\u0000\u0000\u0000\u01f8\u01f7\u0001\u0000\u0000\u0000\u01f9"+
		"\u0019\u0001\u0000\u0000\u0000\u01fa\u01fe\u0005\u0007\u0000\u0000\u01fb"+
		"\u01fd\u0005$\u0000\u0000\u01fc\u01fb\u0001\u0000\u0000\u0000\u01fd\u0200"+
		"\u0001\u0000\u0000\u0000\u01fe\u01fc\u0001\u0000\u0000\u0000\u01fe\u01ff"+
		"\u0001\u0000\u0000\u0000\u01ff\u0201\u0001\u0000\u0000\u0000\u0200\u01fe"+
		"\u0001\u0000\u0000\u0000\u0201\u0205\u0003\u001c\u000e\u0000\u0202\u0204"+
		"\u0005$\u0000\u0000\u0203\u0202\u0001\u0000\u0000\u0000\u0204\u0207\u0001"+
		"\u0000\u0000\u0000\u0205\u0203\u0001\u0000\u0000\u0000\u0205\u0206\u0001"+
		"\u0000\u0000\u0000\u0206\u0208\u0001\u0000\u0000\u0000\u0207\u0205\u0001"+
		"\u0000\u0000\u0000\u0208\u0209\u0005\b\u0000\u0000\u0209\u001b\u0001\u0000"+
		"\u0000\u0000\u020a\u020b\u0005\u0018\u0000\u0000\u020b\u0213\u0003\u001a"+
		"\r\u0000\u020c\u020d\u0005\u0019\u0000\u0000\u020d\u0213\u0003\u001a\r"+
		"\u0000\u020e\u0213\u0005\u001c\u0000\u0000\u020f\u0213\u0005\u001a\u0000"+
		"\u0000\u0210\u0213\u0005\u001b\u0000\u0000\u0211\u0213\u0003\u001e\u000f"+
		"\u0000\u0212\u020a\u0001\u0000\u0000\u0000\u0212\u020c\u0001\u0000\u0000"+
		"\u0000\u0212\u020e\u0001\u0000\u0000\u0000\u0212\u020f\u0001\u0000\u0000"+
		"\u0000\u0212\u0210\u0001\u0000\u0000\u0000\u0212\u0211\u0001\u0000\u0000"+
		"\u0000\u0213\u001d\u0001\u0000\u0000\u0000\u0214\u0215\u0005\"\u0000\u0000"+
		"\u0215\u001f\u0001\u0000\u0000\u0000\u0216\u0218\u0005$\u0000\u0000\u0217"+
		"\u0216\u0001\u0000\u0000\u0000\u0218\u0219\u0001\u0000\u0000\u0000\u0219"+
		"\u0217\u0001\u0000\u0000\u0000\u0219\u021a\u0001\u0000\u0000\u0000\u021a"+
		"!\u0001\u0000\u0000\u0000O%*.7>EINU\\fnu|\u0083\u008a\u008d\u0093\u009a"+
		"\u00a3\u00a7\u00ac\u00b3\u00ba\u00bf\u00c7\u00ce\u00d5\u00d9\u00df\u00e6"+
		"\u00ed\u00f3\u00f6\u00fb\u0104\u010b\u0115\u011d\u0126\u012d\u0134\u013b"+
		"\u0144\u014b\u0152\u0159\u0160\u0164\u0169\u0172\u0176\u017e\u0182\u0187"+
		"\u018c\u0191\u0198\u01a0\u01a4\u01a9\u01b1\u01b8\u01be\u01c5\u01cc\u01d2"+
		"\u01d8\u01db\u01e0\u01e5\u01e8\u01ed\u01f3\u01f8\u01fe\u0205\u0212\u0219";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}