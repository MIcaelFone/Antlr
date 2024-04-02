// Generated from Expr.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, NUMERO_INTEIRO_POSITIVO=12, NUMERO_INTEIRO_NEGATIVO=13, 
		NUMERO_FLOAT_POSITIVO=14, NUMERO_FLOAT_NEGATIVO=15, NUMERO_ZERO=16, NOVALINHA=17, 
		WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "NUMERO_INTEIRO_POSITIVO", "NUMERO_INTEIRO_NEGATIVO", 
			"NUMERO_FLOAT_POSITIVO", "NUMERO_FLOAT_NEGATIVO", "NUMERO_ZERO", "NOVALINHA", 
			"WS"
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u0090\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\7\rD\n"+
		"\r\f\r\16\rG\13\r\3\16\3\16\3\16\7\16L\n\16\f\16\16\16O\13\16\3\17\3\17"+
		"\7\17S\n\17\f\17\16\17V\13\17\3\17\3\17\6\17Z\n\17\r\17\16\17[\5\17^\n"+
		"\17\3\17\3\17\3\17\6\17c\n\17\r\17\16\17d\5\17g\n\17\3\20\3\20\3\20\7"+
		"\20l\n\20\f\20\16\20o\13\20\3\20\3\20\6\20s\n\20\r\20\16\20t\5\20w\n\20"+
		"\3\20\3\20\3\20\3\20\6\20}\n\20\r\20\16\20~\5\20\u0081\n\20\3\21\3\21"+
		"\3\22\6\22\u0086\n\22\r\22\16\22\u0087\3\23\6\23\u008b\n\23\r\23\16\23"+
		"\u008c\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\7\3\2\63;\3\2\62;\3\2\62"+
		"\62\4\2\f\f\17\17\4\2\13\13\"\"\2\u009d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5)"+
		"\3\2\2\2\7+\3\2\2\2\t-\3\2\2\2\13/\3\2\2\2\r\61\3\2\2\2\17\63\3\2\2\2"+
		"\21\65\3\2\2\2\23\67\3\2\2\2\259\3\2\2\2\27=\3\2\2\2\31A\3\2\2\2\33H\3"+
		"\2\2\2\35f\3\2\2\2\37\u0080\3\2\2\2!\u0082\3\2\2\2#\u0085\3\2\2\2%\u008a"+
		"\3\2\2\2\'(\7*\2\2(\4\3\2\2\2)*\7\61\2\2*\6\3\2\2\2+,\7+\2\2,\b\3\2\2"+
		"\2-.\7~\2\2.\n\3\2\2\2/\60\7\'\2\2\60\f\3\2\2\2\61\62\7`\2\2\62\16\3\2"+
		"\2\2\63\64\7-\2\2\64\20\3\2\2\2\65\66\7/\2\2\66\22\3\2\2\2\678\7,\2\2"+
		"8\24\3\2\2\29:\7O\2\2:;\7G\2\2;<\7O\2\2<\26\3\2\2\2=>\7T\2\2>?\7G\2\2"+
		"?@\7U\2\2@\30\3\2\2\2AE\t\2\2\2BD\t\3\2\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2"+
		"\2EF\3\2\2\2F\32\3\2\2\2GE\3\2\2\2HI\7/\2\2IM\t\2\2\2JL\t\3\2\2KJ\3\2"+
		"\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\34\3\2\2\2OM\3\2\2\2PT\t\2\2\2QS\t"+
		"\3\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U]\3\2\2\2VT\3\2\2\2WY\7"+
		"\60\2\2XZ\t\3\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2"+
		"]W\3\2\2\2]^\3\2\2\2^g\3\2\2\2_`\5!\21\2`b\7\60\2\2ac\t\3\2\2ba\3\2\2"+
		"\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fP\3\2\2\2f_\3\2\2\2g\36\3\2"+
		"\2\2hi\7/\2\2im\t\2\2\2jl\t\3\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2"+
		"\2\2nv\3\2\2\2om\3\2\2\2pr\7\60\2\2qs\t\3\2\2rq\3\2\2\2st\3\2\2\2tr\3"+
		"\2\2\2tu\3\2\2\2uw\3\2\2\2vp\3\2\2\2vw\3\2\2\2w\u0081\3\2\2\2xy\7/\2\2"+
		"yz\5!\21\2z|\7\60\2\2{}\t\3\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2"+
		"\2\2\177\u0081\3\2\2\2\u0080h\3\2\2\2\u0080x\3\2\2\2\u0081 \3\2\2\2\u0082"+
		"\u0083\t\4\2\2\u0083\"\3\2\2\2\u0084\u0086\t\5\2\2\u0085\u0084\3\2\2\2"+
		"\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088$\3"+
		"\2\2\2\u0089\u008b\t\6\2\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\b\23"+
		"\2\2\u008f&\3\2\2\2\21\2EMT[]dfmtv~\u0080\u0087\u008c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}