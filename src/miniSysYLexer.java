// Generated from C:/Users/Best Selina/Desktop/lab3/src\miniSysY.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class miniSysYLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Int=1, Main=2, Return=3, Const=4, LPar=5, RPar=6, LBrace=7, RBrace=8, 
		Comma=9, Semicolon=10, Add=11, Sub=12, Mul=13, Div=14, Mod=15, Assign=16, 
		DecimalNumber=17, OctalNumber=18, HexadecimalNumber=19, Ident=20, WHITE_SPACE=21, 
		COMMENT=22, COMMENT_LINE=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Int", "Main", "Return", "Const", "LPar", "RPar", "LBrace", "RBrace", 
			"Comma", "Semicolon", "Add", "Sub", "Mul", "Div", "Mod", "Assign", "DecimalNumber", 
			"OctalNumber", "HexadecimalNumber", "Ident", "WHITE_SPACE", "COMMENT", 
			"COMMENT_LINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'main'", "'return'", "'const'", "'('", "')'", "'{'", 
			"'}'", "','", "';'", "'+'", "'-'", "'*'", "'/'", "'%'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Int", "Main", "Return", "Const", "LPar", "RPar", "LBrace", "RBrace", 
			"Comma", "Semicolon", "Add", "Sub", "Mul", "Div", "Mod", "Assign", "DecimalNumber", 
			"OctalNumber", "HexadecimalNumber", "Ident", "WHITE_SPACE", "COMMENT", 
			"COMMENT_LINE"
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


	public miniSysYLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "miniSysY.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u0098\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\7\22b\n\22"+
		"\f\22\16\22e\13\22\3\23\3\23\7\23i\n\23\f\23\16\23l\13\23\3\24\3\24\3"+
		"\24\6\24q\n\24\r\24\16\24r\3\25\3\25\7\25w\n\25\f\25\16\25z\13\25\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u0084\n\27\f\27\16\27\u0087\13"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u0092\n\30\f\30"+
		"\16\30\u0095\13\30\3\30\3\30\3\u0085\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\3\2\f\3\2\63;\3\2\62;\3\2\62\62\3\2\629\4\2ZZzz\5\2\62;CH"+
		"ch\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u009d"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\3\61\3\2\2\2\5\65\3\2\2\2\7:\3\2\2\2\tA\3\2\2\2\13G\3\2\2\2\rI\3\2"+
		"\2\2\17K\3\2\2\2\21M\3\2\2\2\23O\3\2\2\2\25Q\3\2\2\2\27S\3\2\2\2\31U\3"+
		"\2\2\2\33W\3\2\2\2\35Y\3\2\2\2\37[\3\2\2\2!]\3\2\2\2#_\3\2\2\2%f\3\2\2"+
		"\2\'m\3\2\2\2)t\3\2\2\2+{\3\2\2\2-\177\3\2\2\2/\u008d\3\2\2\2\61\62\7"+
		"k\2\2\62\63\7p\2\2\63\64\7v\2\2\64\4\3\2\2\2\65\66\7o\2\2\66\67\7c\2\2"+
		"\678\7k\2\289\7p\2\29\6\3\2\2\2:;\7t\2\2;<\7g\2\2<=\7v\2\2=>\7w\2\2>?"+
		"\7t\2\2?@\7p\2\2@\b\3\2\2\2AB\7e\2\2BC\7q\2\2CD\7p\2\2DE\7u\2\2EF\7v\2"+
		"\2F\n\3\2\2\2GH\7*\2\2H\f\3\2\2\2IJ\7+\2\2J\16\3\2\2\2KL\7}\2\2L\20\3"+
		"\2\2\2MN\7\177\2\2N\22\3\2\2\2OP\7.\2\2P\24\3\2\2\2QR\7=\2\2R\26\3\2\2"+
		"\2ST\7-\2\2T\30\3\2\2\2UV\7/\2\2V\32\3\2\2\2WX\7,\2\2X\34\3\2\2\2YZ\7"+
		"\61\2\2Z\36\3\2\2\2[\\\7\'\2\2\\ \3\2\2\2]^\7?\2\2^\"\3\2\2\2_c\t\2\2"+
		"\2`b\t\3\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d$\3\2\2\2ec\3\2\2"+
		"\2fj\t\4\2\2gi\t\5\2\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k&\3\2\2"+
		"\2lj\3\2\2\2mn\t\4\2\2np\t\6\2\2oq\t\7\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2"+
		"\2rs\3\2\2\2s(\3\2\2\2tx\t\b\2\2uw\t\t\2\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2"+
		"\2xy\3\2\2\2y*\3\2\2\2zx\3\2\2\2{|\t\n\2\2|}\3\2\2\2}~\b\26\2\2~,\3\2"+
		"\2\2\177\u0080\7\61\2\2\u0080\u0081\7,\2\2\u0081\u0085\3\2\2\2\u0082\u0084"+
		"\13\2\2\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0086\3\2\2\2"+
		"\u0085\u0083\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089"+
		"\7,\2\2\u0089\u008a\7\61\2\2\u008a\u008b\3\2\2\2\u008b\u008c\b\27\2\2"+
		"\u008c.\3\2\2\2\u008d\u008e\7\61\2\2\u008e\u008f\7\61\2\2\u008f\u0093"+
		"\3\2\2\2\u0090\u0092\n\13\2\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2"+
		"\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0093"+
		"\3\2\2\2\u0096\u0097\b\30\2\2\u0097\60\3\2\2\2\t\2cjrx\u0085\u0093\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}