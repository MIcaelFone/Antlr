// Generated from Expr.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitProg(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitExpr(this);
		}
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

	public static class OperadorContext extends ParserRuleContext {
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterOperador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitOperador(this);
		}
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterNumero_real(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitNumero_real(this);
		}
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

	public static class Numero_inteiro_semzeroContext extends ParserRuleContext {
		public TerminalNode NUMERO_INTEIRO_POSITIVO() { return getToken(ExprParser.NUMERO_INTEIRO_POSITIVO, 0); }
		public TerminalNode NUMERO_INTEIRO_NEGATIVO() { return getToken(ExprParser.NUMERO_INTEIRO_NEGATIVO, 0); }
		public Numero_inteiro_semzeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_inteiro_semzero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterNumero_inteiro_semzero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitNumero_inteiro_semzero(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterNumero_inteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitNumero_inteiro(this);
		}
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

	public static class Numero_zeroContext extends ParserRuleContext {
		public TerminalNode NUMERO_ZERO() { return getToken(ExprParser.NUMERO_ZERO, 0); }
		public Numero_zeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_zero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterNumero_zero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitNumero_zero(this);
		}
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

	public static class Numero_float_semzeroContext extends ParserRuleContext {
		public TerminalNode NUMERO_FLOAT_POSITIVO() { return getToken(ExprParser.NUMERO_FLOAT_POSITIVO, 0); }
		public TerminalNode NUMERO_FLOAT_NEGATIVO() { return getToken(ExprParser.NUMERO_FLOAT_NEGATIVO, 0); }
		public Numero_float_semzeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_float_semzero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterNumero_float_semzero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitNumero_float_semzero(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterNumero_float(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitNumero_float(this);
		}
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

	public static class Numero_inteiro_positivoContext extends ParserRuleContext {
		public TerminalNode NUMERO_INTEIRO_POSITIVO() { return getToken(ExprParser.NUMERO_INTEIRO_POSITIVO, 0); }
		public Numero_inteiro_positivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_inteiro_positivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterNumero_inteiro_positivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitNumero_inteiro_positivo(this);
		}
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24\u00dc\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3\u00c4\n\3\3\4\3\4\3\5\3\5\5\5\u00ca\n\5\3\6\3\6\3\7\3\7\5\7"+
		"\u00d0\n\7\3\b\3\b\3\t\3\t\3\n\3\n\5\n\u00d8\n\n\3\13\3\13\3\13\2\2\f"+
		"\2\4\6\b\n\f\16\20\22\24\2\5\4\2\4\4\6\13\3\2\16\17\3\2\20\21\2\u00f0"+
		"\2\33\3\2\2\2\4\u00c3\3\2\2\2\6\u00c5\3\2\2\2\b\u00c9\3\2\2\2\n\u00cb"+
		"\3\2\2\2\f\u00cf\3\2\2\2\16\u00d1\3\2\2\2\20\u00d3\3\2\2\2\22\u00d7\3"+
		"\2\2\2\24\u00d9\3\2\2\2\26\27\5\4\3\2\27\30\7\23\2\2\30\32\3\2\2\2\31"+
		"\26\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\3\3\2\2\2\35"+
		"\33\3\2\2\2\36\37\7\3\2\2\37 \5\f\7\2 !\5\n\6\2!\"\7\4\2\2\"#\7\5\2\2"+
		"#\u00c4\3\2\2\2$%\7\3\2\2%&\5\16\b\2&\'\5\16\b\2\'(\7\4\2\2()\7\5\2\2"+
		")\u00c4\3\2\2\2*+\7\3\2\2+,\5\f\7\2,-\5\n\6\2-.\7\6\2\2./\7\5\2\2/\u00c4"+
		"\3\2\2\2\60\61\7\3\2\2\61\62\5\f\7\2\62\63\5\20\t\2\63\64\7\6\2\2\64\65"+
		"\7\5\2\2\65\u00c4\3\2\2\2\66\67\7\3\2\2\678\5\22\n\289\5\n\6\29:\7\6\2"+
		"\2:;\7\5\2\2;\u00c4\3\2\2\2<=\7\3\2\2=>\5\22\n\2>?\5\20\t\2?@\7\6\2\2"+
		"@A\7\5\2\2A\u00c4\3\2\2\2BC\7\3\2\2CD\5\16\b\2DE\5\16\b\2EF\7\6\2\2FG"+
		"\7\5\2\2G\u00c4\3\2\2\2HI\7\3\2\2IJ\5\f\7\2JK\5\n\6\2KL\7\7\2\2LM\7\5"+
		"\2\2M\u00c4\3\2\2\2NO\7\3\2\2OP\5\16\b\2PQ\5\16\b\2QR\7\7\2\2RS\7\5\2"+
		"\2S\u00c4\3\2\2\2TU\7\3\2\2UV\5\b\5\2VW\5\24\13\2WX\7\b\2\2XY\7\5\2\2"+
		"Y\u00c4\3\2\2\2Z[\7\3\2\2[\\\5\b\5\2\\]\5\b\5\2]^\7\t\2\2^_\7\5\2\2_\u00c4"+
		"\3\2\2\2`a\7\3\2\2ab\5\b\5\2bc\5\b\5\2cd\7\n\2\2de\7\5\2\2e\u00c4\3\2"+
		"\2\2fg\7\3\2\2gh\5\b\5\2hi\5\b\5\2ij\7\13\2\2jk\7\5\2\2k\u00c4\3\2\2\2"+
		"lm\7\3\2\2mn\5\4\3\2no\5\4\3\2op\5\6\4\2pq\7\5\2\2q\u00c4\3\2\2\2rs\7"+
		"\3\2\2st\5\b\5\2tu\5\4\3\2uv\5\6\4\2vw\7\5\2\2w\u00c4\3\2\2\2xy\7\3\2"+
		"\2yz\5\b\5\2z{\7\f\2\2{|\7\5\2\2|\u00c4\3\2\2\2}~\7\3\2\2~\177\7\f\2\2"+
		"\177\u00c4\7\5\2\2\u0080\u0081\7\3\2\2\u0081\u0082\5\4\3\2\u0082\u0083"+
		"\7\f\2\2\u0083\u0084\7\5\2\2\u0084\u00c4\3\2\2\2\u0085\u0086\7\3\2\2\u0086"+
		"\u0087\7\f\2\2\u0087\u0088\5\4\3\2\u0088\u0089\7\5\2\2\u0089\u00c4\3\2"+
		"\2\2\u008a\u008b\7\3\2\2\u008b\u008c\7\f\2\2\u008c\u008d\5\4\3\2\u008d"+
		"\u008e\5\6\4\2\u008e\u008f\7\5\2\2\u008f\u00c4\3\2\2\2\u0090\u0091\7\3"+
		"\2\2\u0091\u0092\5\b\5\2\u0092\u0093\7\f\2\2\u0093\u0094\5\4\3\2\u0094"+
		"\u0095\5\6\4\2\u0095\u0096\7\5\2\2\u0096\u00c4\3\2\2\2\u0097\u0098\7\3"+
		"\2\2\u0098\u0099\5\24\13\2\u0099\u009a\7\r\2\2\u009a\u009b\7\5\2\2\u009b"+
		"\u00c4\3\2\2\2\u009c\u009d\7\3\2\2\u009d\u009e\5\24\13\2\u009e\u009f\7"+
		"\r\2\2\u009f\u00a0\5\4\3\2\u00a0\u00a1\5\6\4\2\u00a1\u00a2\7\5\2\2\u00a2"+
		"\u00c4\3\2\2\2\u00a3\u00a4\7\3\2\2\u00a4\u00a5\5\4\3\2\u00a5\u00a6\5\24"+
		"\13\2\u00a6\u00a7\7\r\2\2\u00a7\u00a8\7\5\2\2\u00a8\u00c4\3\2\2\2\u00a9"+
		"\u00aa\7\3\2\2\u00aa\u00ab\5\4\3\2\u00ab\u00ac\7\r\2\2\u00ac\u00ad\7\5"+
		"\2\2\u00ad\u00c4\3\2\2\2\u00ae\u00af\7\3\2\2\u00af\u00b0\5\4\3\2\u00b0"+
		"\u00b1\7\r\2\2\u00b1\u00b2\5\4\3\2\u00b2\u00b3\7\5\2\2\u00b3\u00c4\3\2"+
		"\2\2\u00b4\u00b5\7\3\2\2\u00b5\u00b6\5\4\3\2\u00b6\u00b7\7\r\2\2\u00b7"+
		"\u00b8\5\4\3\2\u00b8\u00b9\5\6\4\2\u00b9\u00ba\7\5\2\2\u00ba\u00c4\3\2"+
		"\2\2\u00bb\u00bc\7\3\2\2\u00bc\u00bd\5\4\3\2\u00bd\u00be\7\r\2\2\u00be"+
		"\u00bf\5\4\3\2\u00bf\u00c0\7\r\2\2\u00c0\u00c1\5\6\4\2\u00c1\u00c2\7\5"+
		"\2\2\u00c2\u00c4\3\2\2\2\u00c3\36\3\2\2\2\u00c3$\3\2\2\2\u00c3*\3\2\2"+
		"\2\u00c3\60\3\2\2\2\u00c3\66\3\2\2\2\u00c3<\3\2\2\2\u00c3B\3\2\2\2\u00c3"+
		"H\3\2\2\2\u00c3N\3\2\2\2\u00c3T\3\2\2\2\u00c3Z\3\2\2\2\u00c3`\3\2\2\2"+
		"\u00c3f\3\2\2\2\u00c3l\3\2\2\2\u00c3r\3\2\2\2\u00c3x\3\2\2\2\u00c3}\3"+
		"\2\2\2\u00c3\u0080\3\2\2\2\u00c3\u0085\3\2\2\2\u00c3\u008a\3\2\2\2\u00c3"+
		"\u0090\3\2\2\2\u00c3\u0097\3\2\2\2\u00c3\u009c\3\2\2\2\u00c3\u00a3\3\2"+
		"\2\2\u00c3\u00a9\3\2\2\2\u00c3\u00ae\3\2\2\2\u00c3\u00b4\3\2\2\2\u00c3"+
		"\u00bb\3\2\2\2\u00c4\5\3\2\2\2\u00c5\u00c6\t\2\2\2\u00c6\7\3\2\2\2\u00c7"+
		"\u00ca\5\f\7\2\u00c8\u00ca\5\22\n\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3"+
		"\2\2\2\u00ca\t\3\2\2\2\u00cb\u00cc\t\3\2\2\u00cc\13\3\2\2\2\u00cd\u00d0"+
		"\5\n\6\2\u00ce\u00d0\5\16\b\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2"+
		"\u00d0\r\3\2\2\2\u00d1\u00d2\7\22\2\2\u00d2\17\3\2\2\2\u00d3\u00d4\t\4"+
		"\2\2\u00d4\21\3\2\2\2\u00d5\u00d8\5\20\t\2\u00d6\u00d8\5\16\b\2\u00d7"+
		"\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\23\3\2\2\2\u00d9\u00da\7\16\2"+
		"\2\u00da\25\3\2\2\2\7\33\u00c3\u00c9\u00cf\u00d7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}