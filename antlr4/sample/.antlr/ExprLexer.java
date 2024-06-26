// Generated from c:/Users/micae/Antlr/antlr4/sample/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

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
		"\u0004\u0000\u0012\u008e\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0005\u000bB\b\u000b\n\u000b\f\u000bE\t\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0005\fJ\b\f\n\f\f\fM\t\f\u0001\r\u0001\r\u0005\rQ\b\r\n\r"+
		"\f\rT\t\r\u0001\r\u0001\r\u0004\rX\b\r\u000b\r\f\rY\u0003\r\\\b\r\u0001"+
		"\r\u0001\r\u0001\r\u0004\ra\b\r\u000b\r\f\rb\u0003\re\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000ej\b\u000e\n\u000e\f\u000em\t\u000e"+
		"\u0001\u000e\u0001\u000e\u0004\u000eq\b\u000e\u000b\u000e\f\u000er\u0003"+
		"\u000eu\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0004"+
		"\u000e{\b\u000e\u000b\u000e\f\u000e|\u0003\u000e\u007f\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0004\u0010\u0084\b\u0010\u000b\u0010\f\u0010"+
		"\u0085\u0001\u0011\u0004\u0011\u0089\b\u0011\u000b\u0011\f\u0011\u008a"+
		"\u0001\u0011\u0001\u0011\u0000\u0000\u0012\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012\u0001\u0000\u0005\u0001\u000019\u0001\u000009\u0001\u000000\u0002"+
		"\u0000\n\n\r\r\u0002\u0000\t\t  \u009b\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0001%\u0001\u0000\u0000\u0000\u0003\'\u0001\u0000\u0000"+
		"\u0000\u0005)\u0001\u0000\u0000\u0000\u0007+\u0001\u0000\u0000\u0000\t"+
		"-\u0001\u0000\u0000\u0000\u000b/\u0001\u0000\u0000\u0000\r1\u0001\u0000"+
		"\u0000\u0000\u000f3\u0001\u0000\u0000\u0000\u00115\u0001\u0000\u0000\u0000"+
		"\u00137\u0001\u0000\u0000\u0000\u0015;\u0001\u0000\u0000\u0000\u0017?"+
		"\u0001\u0000\u0000\u0000\u0019F\u0001\u0000\u0000\u0000\u001bd\u0001\u0000"+
		"\u0000\u0000\u001d~\u0001\u0000\u0000\u0000\u001f\u0080\u0001\u0000\u0000"+
		"\u0000!\u0083\u0001\u0000\u0000\u0000#\u0088\u0001\u0000\u0000\u0000%"+
		"&\u0005(\u0000\u0000&\u0002\u0001\u0000\u0000\u0000\'(\u0005/\u0000\u0000"+
		"(\u0004\u0001\u0000\u0000\u0000)*\u0005)\u0000\u0000*\u0006\u0001\u0000"+
		"\u0000\u0000+,\u0005|\u0000\u0000,\b\u0001\u0000\u0000\u0000-.\u0005%"+
		"\u0000\u0000.\n\u0001\u0000\u0000\u0000/0\u0005^\u0000\u00000\f\u0001"+
		"\u0000\u0000\u000012\u0005+\u0000\u00002\u000e\u0001\u0000\u0000\u0000"+
		"34\u0005-\u0000\u00004\u0010\u0001\u0000\u0000\u000056\u0005*\u0000\u0000"+
		"6\u0012\u0001\u0000\u0000\u000078\u0005M\u0000\u000089\u0005E\u0000\u0000"+
		"9:\u0005M\u0000\u0000:\u0014\u0001\u0000\u0000\u0000;<\u0005R\u0000\u0000"+
		"<=\u0005E\u0000\u0000=>\u0005S\u0000\u0000>\u0016\u0001\u0000\u0000\u0000"+
		"?C\u0007\u0000\u0000\u0000@B\u0007\u0001\u0000\u0000A@\u0001\u0000\u0000"+
		"\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000"+
		"\u0000\u0000D\u0018\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000"+
		"FG\u0005-\u0000\u0000GK\u0007\u0000\u0000\u0000HJ\u0007\u0001\u0000\u0000"+
		"IH\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000"+
		"\u0000KL\u0001\u0000\u0000\u0000L\u001a\u0001\u0000\u0000\u0000MK\u0001"+
		"\u0000\u0000\u0000NR\u0007\u0000\u0000\u0000OQ\u0007\u0001\u0000\u0000"+
		"PO\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000"+
		"\u0000RS\u0001\u0000\u0000\u0000S[\u0001\u0000\u0000\u0000TR\u0001\u0000"+
		"\u0000\u0000UW\u0005.\u0000\u0000VX\u0007\u0001\u0000\u0000WV\u0001\u0000"+
		"\u0000\u0000XY\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001"+
		"\u0000\u0000\u0000Z\\\u0001\u0000\u0000\u0000[U\u0001\u0000\u0000\u0000"+
		"[\\\u0001\u0000\u0000\u0000\\e\u0001\u0000\u0000\u0000]^\u0003\u001f\u000f"+
		"\u0000^`\u0005.\u0000\u0000_a\u0007\u0001\u0000\u0000`_\u0001\u0000\u0000"+
		"\u0000ab\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000"+
		"\u0000\u0000ce\u0001\u0000\u0000\u0000dN\u0001\u0000\u0000\u0000d]\u0001"+
		"\u0000\u0000\u0000e\u001c\u0001\u0000\u0000\u0000fg\u0005-\u0000\u0000"+
		"gk\u0007\u0000\u0000\u0000hj\u0007\u0001\u0000\u0000ih\u0001\u0000\u0000"+
		"\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000"+
		"\u0000\u0000lt\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000np\u0005"+
		".\u0000\u0000oq\u0007\u0001\u0000\u0000po\u0001\u0000\u0000\u0000qr\u0001"+
		"\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000"+
		"su\u0001\u0000\u0000\u0000tn\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000"+
		"\u0000u\u007f\u0001\u0000\u0000\u0000vw\u0005-\u0000\u0000wx\u0003\u001f"+
		"\u000f\u0000xz\u0005.\u0000\u0000y{\u0007\u0001\u0000\u0000zy\u0001\u0000"+
		"\u0000\u0000{|\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001"+
		"\u0000\u0000\u0000}\u007f\u0001\u0000\u0000\u0000~f\u0001\u0000\u0000"+
		"\u0000~v\u0001\u0000\u0000\u0000\u007f\u001e\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0007\u0002\u0000\u0000\u0081 \u0001\u0000\u0000\u0000\u0082\u0084"+
		"\u0007\u0003\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0001\u0000\u0000\u0000\u0086\"\u0001\u0000\u0000\u0000\u0087\u0089\u0007"+
		"\u0004\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001"+
		"\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d\u0006"+
		"\u0011\u0000\u0000\u008d$\u0001\u0000\u0000\u0000\u000f\u0000CKRY[bdk"+
		"rt|~\u0085\u008a\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}