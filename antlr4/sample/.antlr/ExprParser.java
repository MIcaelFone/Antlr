// Generated from c:/Users/micae/Antlr/antlr4/sample/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, NUMERO_INTEIRO_POSITIVO=12, NUMERO_INTEIRO_NEGATIVO=13, 
		NUMERO_FLOAT_POSITIVO=14, NUMERO_FLOAT_NEGATIVO=15, NUMERO_ZERO=16, NOVALINHA=17, 
		WS=18;
	public static final int
		RULE_prog = 0, RULE_expr = 1, RULE_operador = 2, RULE_numero_real = 3, 
		RULE_numero_inteiro_semzero = 4, RULE_numero_inteiro = 5, RULE_numero_zero = 6, 
		RULE_numero_float_semzero = 7, RULE_numero_float = 8, RULE_numero_inteiro_positivo = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "expr", "operador", "numero_real", "numero_inteiro_semzero", 
			"numero_inteiro", "numero_zero", "numero_float_semzero", "numero_float", 
			"numero_inteiro_positivo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "'/'", "')'", "'|'", "'%'", "'^'", "'+'", "'-'", "'*'", 
			"'MEM'", "'RES'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"NUMERO_INTEIRO_POSITIVO", "NUMERO_INTEIRO_NEGATIVO", "NUMERO_FLOAT_POSITIVO", 
			"NUMERO_FLOAT_NEGATIVO", "NUMERO_ZERO", "NOVALINHA", "WS"
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
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NOVALINHA() { return getTokens(ExprParser.NOVALINHA); }
		public TerminalNode NOVALINHA(int i) {
			return getToken(ExprParser.NOVALINHA, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(20);
				expr();
				setState(21);
				match(NOVALINHA);
				}
				}
				setState(27);
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
	public static class ExprContext extends ParserRuleContext {
		public Numero_inteiroContext numero_inteiro() {
			return getRuleContext(Numero_inteiroContext.class,0);
		}
		public Numero_inteiro_semzeroContext numero_inteiro_semzero() {
			return getRuleContext(Numero_inteiro_semzeroContext.class,0);
		}
		public List<Numero_zeroContext> numero_zero() {
			return getRuleContexts(Numero_zeroContext.class);
		}
		public Numero_zeroContext numero_zero(int i) {
			return getRuleContext(Numero_zeroContext.class,i);
		}
		public Numero_float_semzeroContext numero_float_semzero() {
			return getRuleContext(Numero_float_semzeroContext.class,0);
		}
		public Numero_floatContext numero_float() {
			return getRuleContext(Numero_floatContext.class,0);
		}
		public List<Numero_realContext> numero_real() {
			return getRuleContexts(Numero_realContext.class);
		}
		public Numero_realContext numero_real(int i) {
			return getRuleContext(Numero_realContext.class,i);
		}
		public Numero_inteiro_positivoContext numero_inteiro_positivo() {
			return getRuleContext(Numero_inteiro_positivoContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				match(T__0);
				setState(29);
				numero_inteiro();
				setState(30);
				numero_inteiro_semzero();
				setState(31);
				match(T__1);
				setState(32);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(T__0);
				setState(35);
				numero_zero();
				setState(36);
				numero_zero();
				setState(37);
				match(T__1);
				setState(38);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				match(T__0);
				setState(41);
				numero_inteiro();
				setState(42);
				numero_inteiro_semzero();
				setState(43);
				match(T__3);
				setState(44);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				match(T__0);
				setState(47);
				numero_inteiro();
				setState(48);
				numero_float_semzero();
				setState(49);
				match(T__3);
				setState(50);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				match(T__0);
				setState(53);
				numero_float();
				setState(54);
				numero_inteiro_semzero();
				setState(55);
				match(T__3);
				setState(56);
				match(T__2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(58);
				match(T__0);
				setState(59);
				numero_float();
				setState(60);
				numero_float_semzero();
				setState(61);
				match(T__3);
				setState(62);
				match(T__2);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(64);
				match(T__0);
				setState(65);
				numero_zero();
				setState(66);
				numero_zero();
				setState(67);
				match(T__3);
				setState(68);
				match(T__2);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(70);
				match(T__0);
				setState(71);
				numero_inteiro();
				setState(72);
				numero_inteiro_semzero();
				setState(73);
				match(T__4);
				setState(74);
				match(T__2);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(76);
				match(T__0);
				setState(77);
				numero_zero();
				setState(78);
				numero_zero();
				setState(79);
				match(T__4);
				setState(80);
				match(T__2);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(82);
				match(T__0);
				setState(83);
				numero_real();
				setState(84);
				numero_inteiro_positivo();
				setState(85);
				match(T__5);
				setState(86);
				match(T__2);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(88);
				match(T__0);
				setState(89);
				numero_real();
				setState(90);
				numero_real();
				setState(91);
				match(T__6);
				setState(92);
				match(T__2);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(94);
				match(T__0);
				setState(95);
				numero_real();
				setState(96);
				numero_real();
				setState(97);
				match(T__7);
				setState(98);
				match(T__2);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(100);
				match(T__0);
				setState(101);
				numero_real();
				setState(102);
				numero_real();
				setState(103);
				match(T__8);
				setState(104);
				match(T__2);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(106);
				match(T__0);
				setState(107);
				expr();
				setState(108);
				expr();
				setState(109);
				operador();
				setState(110);
				match(T__2);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(112);
				match(T__0);
				setState(113);
				numero_real();
				setState(114);
				expr();
				setState(115);
				operador();
				setState(116);
				match(T__2);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(118);
				match(T__0);
				setState(119);
				numero_real();
				setState(120);
				match(T__9);
				setState(121);
				match(T__2);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(123);
				match(T__0);
				setState(124);
				match(T__9);
				setState(125);
				match(T__2);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(126);
				match(T__0);
				setState(127);
				expr();
				setState(128);
				match(T__9);
				setState(129);
				match(T__2);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(131);
				match(T__0);
				setState(132);
				match(T__9);
				setState(133);
				expr();
				setState(134);
				match(T__2);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(136);
				match(T__0);
				setState(137);
				match(T__9);
				setState(138);
				expr();
				setState(139);
				operador();
				setState(140);
				match(T__2);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(142);
				match(T__0);
				setState(143);
				numero_real();
				setState(144);
				match(T__9);
				setState(145);
				expr();
				setState(146);
				operador();
				setState(147);
				match(T__2);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(149);
				match(T__0);
				setState(150);
				numero_inteiro_positivo();
				setState(151);
				match(T__10);
				setState(152);
				match(T__2);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(154);
				match(T__0);
				setState(155);
				numero_inteiro_positivo();
				setState(156);
				match(T__10);
				setState(157);
				expr();
				setState(158);
				operador();
				setState(159);
				match(T__2);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(161);
				match(T__0);
				setState(162);
				expr();
				setState(163);
				numero_inteiro_positivo();
				setState(164);
				match(T__10);
				setState(165);
				match(T__2);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(167);
				match(T__0);
				setState(168);
				expr();
				setState(169);
				match(T__10);
				setState(170);
				match(T__2);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(172);
				match(T__0);
				setState(173);
				expr();
				setState(174);
				match(T__10);
				setState(175);
				expr();
				setState(176);
				match(T__2);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(178);
				match(T__0);
				setState(179);
				expr();
				setState(180);
				match(T__10);
				setState(181);
				expr();
				setState(182);
				operador();
				setState(183);
				match(T__2);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(185);
				match(T__0);
				setState(186);
				expr();
				setState(187);
				match(T__10);
				setState(188);
				expr();
				setState(189);
				match(T__10);
				setState(190);
				operador();
				setState(191);
				match(T__2);
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
	public static class OperadorContext extends ParserRuleContext {
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1012L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Numero_realContext extends ParserRuleContext {
		public Numero_inteiroContext numero_inteiro() {
			return getRuleContext(Numero_inteiroContext.class,0);
		}
		public Numero_floatContext numero_float() {
			return getRuleContext(Numero_floatContext.class,0);
		}
		public Numero_realContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_real; }
	}

	public final Numero_realContext numero_real() throws RecognitionException {
		Numero_realContext _localctx = new Numero_realContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_numero_real);
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				numero_inteiro();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				numero_float();
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
	public static class Numero_inteiro_semzeroContext extends ParserRuleContext {
		public TerminalNode NUMERO_INTEIRO_POSITIVO() { return getToken(ExprParser.NUMERO_INTEIRO_POSITIVO, 0); }
		public TerminalNode NUMERO_INTEIRO_NEGATIVO() { return getToken(ExprParser.NUMERO_INTEIRO_NEGATIVO, 0); }
		public Numero_inteiro_semzeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_inteiro_semzero; }
	}

	public final Numero_inteiro_semzeroContext numero_inteiro_semzero() throws RecognitionException {
		Numero_inteiro_semzeroContext _localctx = new Numero_inteiro_semzeroContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_numero_inteiro_semzero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_la = _input.LA(1);
			if ( !(_la==NUMERO_INTEIRO_POSITIVO || _la==NUMERO_INTEIRO_NEGATIVO) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Numero_inteiroContext extends ParserRuleContext {
		public Numero_inteiro_semzeroContext numero_inteiro_semzero() {
			return getRuleContext(Numero_inteiro_semzeroContext.class,0);
		}
		public Numero_zeroContext numero_zero() {
			return getRuleContext(Numero_zeroContext.class,0);
		}
		public Numero_inteiroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_inteiro; }
	}

	public final Numero_inteiroContext numero_inteiro() throws RecognitionException {
		Numero_inteiroContext _localctx = new Numero_inteiroContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_numero_inteiro);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO_INTEIRO_POSITIVO:
			case NUMERO_INTEIRO_NEGATIVO:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				numero_inteiro_semzero();
				}
				break;
			case NUMERO_ZERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				numero_zero();
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
	public static class Numero_zeroContext extends ParserRuleContext {
		public TerminalNode NUMERO_ZERO() { return getToken(ExprParser.NUMERO_ZERO, 0); }
		public Numero_zeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_zero; }
	}

	public final Numero_zeroContext numero_zero() throws RecognitionException {
		Numero_zeroContext _localctx = new Numero_zeroContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_numero_zero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(NUMERO_ZERO);
			}
		}
		catch (RecognitionException re) {
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
	public static class Numero_float_semzeroContext extends ParserRuleContext {
		public TerminalNode NUMERO_FLOAT_POSITIVO() { return getToken(ExprParser.NUMERO_FLOAT_POSITIVO, 0); }
		public TerminalNode NUMERO_FLOAT_NEGATIVO() { return getToken(ExprParser.NUMERO_FLOAT_NEGATIVO, 0); }
		public Numero_float_semzeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_float_semzero; }
	}

	public final Numero_float_semzeroContext numero_float_semzero() throws RecognitionException {
		Numero_float_semzeroContext _localctx = new Numero_float_semzeroContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_numero_float_semzero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_la = _input.LA(1);
			if ( !(_la==NUMERO_FLOAT_POSITIVO || _la==NUMERO_FLOAT_NEGATIVO) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Numero_floatContext extends ParserRuleContext {
		public Numero_float_semzeroContext numero_float_semzero() {
			return getRuleContext(Numero_float_semzeroContext.class,0);
		}
		public Numero_zeroContext numero_zero() {
			return getRuleContext(Numero_zeroContext.class,0);
		}
		public Numero_floatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_float; }
	}

	public final Numero_floatContext numero_float() throws RecognitionException {
		Numero_floatContext _localctx = new Numero_floatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_numero_float);
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO_FLOAT_POSITIVO:
			case NUMERO_FLOAT_NEGATIVO:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				numero_float_semzero();
				}
				break;
			case NUMERO_ZERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				numero_zero();
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
	public static class Numero_inteiro_positivoContext extends ParserRuleContext {
		public TerminalNode NUMERO_INTEIRO_POSITIVO() { return getToken(ExprParser.NUMERO_INTEIRO_POSITIVO, 0); }
		public Numero_inteiro_positivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_inteiro_positivo; }
	}

	public final Numero_inteiro_positivoContext numero_inteiro_positivo() throws RecognitionException {
		Numero_inteiro_positivoContext _localctx = new Numero_inteiro_positivoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_numero_inteiro_positivo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(NUMERO_INTEIRO_POSITIVO);
			}
		}
		catch (RecognitionException re) {
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
		"\u0004\u0001\u0012\u00da\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u0000\u0018\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u00c2\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u00c8\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u00ce\b\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0003\b\u00d6\b\b\u0001\t\u0001\t\u0001\t"+
		"\u0000\u0000\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0003"+
		"\u0002\u0000\u0002\u0002\u0004\t\u0001\u0000\f\r\u0001\u0000\u000e\u000f"+
		"\u00ee\u0000\u0019\u0001\u0000\u0000\u0000\u0002\u00c1\u0001\u0000\u0000"+
		"\u0000\u0004\u00c3\u0001\u0000\u0000\u0000\u0006\u00c7\u0001\u0000\u0000"+
		"\u0000\b\u00c9\u0001\u0000\u0000\u0000\n\u00cd\u0001\u0000\u0000\u0000"+
		"\f\u00cf\u0001\u0000\u0000\u0000\u000e\u00d1\u0001\u0000\u0000\u0000\u0010"+
		"\u00d5\u0001\u0000\u0000\u0000\u0012\u00d7\u0001\u0000\u0000\u0000\u0014"+
		"\u0015\u0003\u0002\u0001\u0000\u0015\u0016\u0005\u0011\u0000\u0000\u0016"+
		"\u0018\u0001\u0000\u0000\u0000\u0017\u0014\u0001\u0000\u0000\u0000\u0018"+
		"\u001b\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019"+
		"\u001a\u0001\u0000\u0000\u0000\u001a\u0001\u0001\u0000\u0000\u0000\u001b"+
		"\u0019\u0001\u0000\u0000\u0000\u001c\u001d\u0005\u0001\u0000\u0000\u001d"+
		"\u001e\u0003\n\u0005\u0000\u001e\u001f\u0003\b\u0004\u0000\u001f \u0005"+
		"\u0002\u0000\u0000 !\u0005\u0003\u0000\u0000!\u00c2\u0001\u0000\u0000"+
		"\u0000\"#\u0005\u0001\u0000\u0000#$\u0003\f\u0006\u0000$%\u0003\f\u0006"+
		"\u0000%&\u0005\u0002\u0000\u0000&\'\u0005\u0003\u0000\u0000\'\u00c2\u0001"+
		"\u0000\u0000\u0000()\u0005\u0001\u0000\u0000)*\u0003\n\u0005\u0000*+\u0003"+
		"\b\u0004\u0000+,\u0005\u0004\u0000\u0000,-\u0005\u0003\u0000\u0000-\u00c2"+
		"\u0001\u0000\u0000\u0000./\u0005\u0001\u0000\u0000/0\u0003\n\u0005\u0000"+
		"01\u0003\u000e\u0007\u000012\u0005\u0004\u0000\u000023\u0005\u0003\u0000"+
		"\u00003\u00c2\u0001\u0000\u0000\u000045\u0005\u0001\u0000\u000056\u0003"+
		"\u0010\b\u000067\u0003\b\u0004\u000078\u0005\u0004\u0000\u000089\u0005"+
		"\u0003\u0000\u00009\u00c2\u0001\u0000\u0000\u0000:;\u0005\u0001\u0000"+
		"\u0000;<\u0003\u0010\b\u0000<=\u0003\u000e\u0007\u0000=>\u0005\u0004\u0000"+
		"\u0000>?\u0005\u0003\u0000\u0000?\u00c2\u0001\u0000\u0000\u0000@A\u0005"+
		"\u0001\u0000\u0000AB\u0003\f\u0006\u0000BC\u0003\f\u0006\u0000CD\u0005"+
		"\u0004\u0000\u0000DE\u0005\u0003\u0000\u0000E\u00c2\u0001\u0000\u0000"+
		"\u0000FG\u0005\u0001\u0000\u0000GH\u0003\n\u0005\u0000HI\u0003\b\u0004"+
		"\u0000IJ\u0005\u0005\u0000\u0000JK\u0005\u0003\u0000\u0000K\u00c2\u0001"+
		"\u0000\u0000\u0000LM\u0005\u0001\u0000\u0000MN\u0003\f\u0006\u0000NO\u0003"+
		"\f\u0006\u0000OP\u0005\u0005\u0000\u0000PQ\u0005\u0003\u0000\u0000Q\u00c2"+
		"\u0001\u0000\u0000\u0000RS\u0005\u0001\u0000\u0000ST\u0003\u0006\u0003"+
		"\u0000TU\u0003\u0012\t\u0000UV\u0005\u0006\u0000\u0000VW\u0005\u0003\u0000"+
		"\u0000W\u00c2\u0001\u0000\u0000\u0000XY\u0005\u0001\u0000\u0000YZ\u0003"+
		"\u0006\u0003\u0000Z[\u0003\u0006\u0003\u0000[\\\u0005\u0007\u0000\u0000"+
		"\\]\u0005\u0003\u0000\u0000]\u00c2\u0001\u0000\u0000\u0000^_\u0005\u0001"+
		"\u0000\u0000_`\u0003\u0006\u0003\u0000`a\u0003\u0006\u0003\u0000ab\u0005"+
		"\b\u0000\u0000bc\u0005\u0003\u0000\u0000c\u00c2\u0001\u0000\u0000\u0000"+
		"de\u0005\u0001\u0000\u0000ef\u0003\u0006\u0003\u0000fg\u0003\u0006\u0003"+
		"\u0000gh\u0005\t\u0000\u0000hi\u0005\u0003\u0000\u0000i\u00c2\u0001\u0000"+
		"\u0000\u0000jk\u0005\u0001\u0000\u0000kl\u0003\u0002\u0001\u0000lm\u0003"+
		"\u0002\u0001\u0000mn\u0003\u0004\u0002\u0000no\u0005\u0003\u0000\u0000"+
		"o\u00c2\u0001\u0000\u0000\u0000pq\u0005\u0001\u0000\u0000qr\u0003\u0006"+
		"\u0003\u0000rs\u0003\u0002\u0001\u0000st\u0003\u0004\u0002\u0000tu\u0005"+
		"\u0003\u0000\u0000u\u00c2\u0001\u0000\u0000\u0000vw\u0005\u0001\u0000"+
		"\u0000wx\u0003\u0006\u0003\u0000xy\u0005\n\u0000\u0000yz\u0005\u0003\u0000"+
		"\u0000z\u00c2\u0001\u0000\u0000\u0000{|\u0005\u0001\u0000\u0000|}\u0005"+
		"\n\u0000\u0000}\u00c2\u0005\u0003\u0000\u0000~\u007f\u0005\u0001\u0000"+
		"\u0000\u007f\u0080\u0003\u0002\u0001\u0000\u0080\u0081\u0005\n\u0000\u0000"+
		"\u0081\u0082\u0005\u0003\u0000\u0000\u0082\u00c2\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0005\u0001\u0000\u0000\u0084\u0085\u0005\n\u0000\u0000\u0085"+
		"\u0086\u0003\u0002\u0001\u0000\u0086\u0087\u0005\u0003\u0000\u0000\u0087"+
		"\u00c2\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u0001\u0000\u0000\u0089"+
		"\u008a\u0005\n\u0000\u0000\u008a\u008b\u0003\u0002\u0001\u0000\u008b\u008c"+
		"\u0003\u0004\u0002\u0000\u008c\u008d\u0005\u0003\u0000\u0000\u008d\u00c2"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0005\u0001\u0000\u0000\u008f\u0090"+
		"\u0003\u0006\u0003\u0000\u0090\u0091\u0005\n\u0000\u0000\u0091\u0092\u0003"+
		"\u0002\u0001\u0000\u0092\u0093\u0003\u0004\u0002\u0000\u0093\u0094\u0005"+
		"\u0003\u0000\u0000\u0094\u00c2\u0001\u0000\u0000\u0000\u0095\u0096\u0005"+
		"\u0001\u0000\u0000\u0096\u0097\u0003\u0012\t\u0000\u0097\u0098\u0005\u000b"+
		"\u0000\u0000\u0098\u0099\u0005\u0003\u0000\u0000\u0099\u00c2\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0005\u0001\u0000\u0000\u009b\u009c\u0003\u0012"+
		"\t\u0000\u009c\u009d\u0005\u000b\u0000\u0000\u009d\u009e\u0003\u0002\u0001"+
		"\u0000\u009e\u009f\u0003\u0004\u0002\u0000\u009f\u00a0\u0005\u0003\u0000"+
		"\u0000\u00a0\u00c2\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\u0001\u0000"+
		"\u0000\u00a2\u00a3\u0003\u0002\u0001\u0000\u00a3\u00a4\u0003\u0012\t\u0000"+
		"\u00a4\u00a5\u0005\u000b\u0000\u0000\u00a5\u00a6\u0005\u0003\u0000\u0000"+
		"\u00a6\u00c2\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\u0001\u0000\u0000"+
		"\u00a8\u00a9\u0003\u0002\u0001\u0000\u00a9\u00aa\u0005\u000b\u0000\u0000"+
		"\u00aa\u00ab\u0005\u0003\u0000\u0000\u00ab\u00c2\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ad\u0005\u0001\u0000\u0000\u00ad\u00ae\u0003\u0002\u0001\u0000"+
		"\u00ae\u00af\u0005\u000b\u0000\u0000\u00af\u00b0\u0003\u0002\u0001\u0000"+
		"\u00b0\u00b1\u0005\u0003\u0000\u0000\u00b1\u00c2\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\u0005\u0001\u0000\u0000\u00b3\u00b4\u0003\u0002\u0001\u0000"+
		"\u00b4\u00b5\u0005\u000b\u0000\u0000\u00b5\u00b6\u0003\u0002\u0001\u0000"+
		"\u00b6\u00b7\u0003\u0004\u0002\u0000\u00b7\u00b8\u0005\u0003\u0000\u0000"+
		"\u00b8\u00c2\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\u0001\u0000\u0000"+
		"\u00ba\u00bb\u0003\u0002\u0001\u0000\u00bb\u00bc\u0005\u000b\u0000\u0000"+
		"\u00bc\u00bd\u0003\u0002\u0001\u0000\u00bd\u00be\u0005\u000b\u0000\u0000"+
		"\u00be\u00bf\u0003\u0004\u0002\u0000\u00bf\u00c0\u0005\u0003\u0000\u0000"+
		"\u00c0\u00c2\u0001\u0000\u0000\u0000\u00c1\u001c\u0001\u0000\u0000\u0000"+
		"\u00c1\"\u0001\u0000\u0000\u0000\u00c1(\u0001\u0000\u0000\u0000\u00c1"+
		".\u0001\u0000\u0000\u0000\u00c14\u0001\u0000\u0000\u0000\u00c1:\u0001"+
		"\u0000\u0000\u0000\u00c1@\u0001\u0000\u0000\u0000\u00c1F\u0001\u0000\u0000"+
		"\u0000\u00c1L\u0001\u0000\u0000\u0000\u00c1R\u0001\u0000\u0000\u0000\u00c1"+
		"X\u0001\u0000\u0000\u0000\u00c1^\u0001\u0000\u0000\u0000\u00c1d\u0001"+
		"\u0000\u0000\u0000\u00c1j\u0001\u0000\u0000\u0000\u00c1p\u0001\u0000\u0000"+
		"\u0000\u00c1v\u0001\u0000\u0000\u0000\u00c1{\u0001\u0000\u0000\u0000\u00c1"+
		"~\u0001\u0000\u0000\u0000\u00c1\u0083\u0001\u0000\u0000\u0000\u00c1\u0088"+
		"\u0001\u0000\u0000\u0000\u00c1\u008e\u0001\u0000\u0000\u0000\u00c1\u0095"+
		"\u0001\u0000\u0000\u0000\u00c1\u009a\u0001\u0000\u0000\u0000\u00c1\u00a1"+
		"\u0001\u0000\u0000\u0000\u00c1\u00a7\u0001\u0000\u0000\u0000\u00c1\u00ac"+
		"\u0001\u0000\u0000\u0000\u00c1\u00b2\u0001\u0000\u0000\u0000\u00c1\u00b9"+
		"\u0001\u0000\u0000\u0000\u00c2\u0003\u0001\u0000\u0000\u0000\u00c3\u00c4"+
		"\u0007\u0000\u0000\u0000\u00c4\u0005\u0001\u0000\u0000\u0000\u00c5\u00c8"+
		"\u0003\n\u0005\u0000\u00c6\u00c8\u0003\u0010\b\u0000\u00c7\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c8\u0007\u0001"+
		"\u0000\u0000\u0000\u00c9\u00ca\u0007\u0001\u0000\u0000\u00ca\t\u0001\u0000"+
		"\u0000\u0000\u00cb\u00ce\u0003\b\u0004\u0000\u00cc\u00ce\u0003\f\u0006"+
		"\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000"+
		"\u0000\u00ce\u000b\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005\u0010\u0000"+
		"\u0000\u00d0\r\u0001\u0000\u0000\u0000\u00d1\u00d2\u0007\u0002\u0000\u0000"+
		"\u00d2\u000f\u0001\u0000\u0000\u0000\u00d3\u00d6\u0003\u000e\u0007\u0000"+
		"\u00d4\u00d6\u0003\f\u0006\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d6\u0011\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u0005\f\u0000\u0000\u00d8\u0013\u0001\u0000\u0000\u0000\u0005\u0019"+
		"\u00c1\u00c7\u00cd\u00d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}