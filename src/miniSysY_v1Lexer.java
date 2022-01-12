// Generated from C:/Users/Best Selina/Desktop/compile/src\miniSysY_v1.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class miniSysY_v1Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Int=1, Main=2, Return=3, LPar=4, RPar=5, LBrace=6, RBrace=7, Semicolon=8, 
		DecimalNumber=9, OctalNumber=10, HexadecimalNumber=11, WHITE_SPACE=12, 
		COMMENT=13, COMMENT_LINE=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Int", "Main", "Return", "LPar", "RPar", "LBrace", "RBrace", "Semicolon", 
			"DecimalNumber", "OctalNumber", "HexadecimalNumber", "WHITE_SPACE", "COMMENT", 
			"COMMENT_LINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'main'", "'return'", "'('", "')'", "'{'", "'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Int", "Main", "Return", "LPar", "RPar", "LBrace", "RBrace", "Semicolon", 
			"DecimalNumber", "OctalNumber", "HexadecimalNumber", "WHITE_SPACE", "COMMENT", 
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


	public miniSysY_v1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "miniSysY_v1.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20k\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\7\n<\n\n\f\n\16\n?\13\n\3\13\3\13\7\13C\n\13\f\13\16\13F"+
		"\13\13\3\f\3\f\3\f\6\fK\n\f\r\f\16\fL\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\7\16W\n\16\f\16\16\16Z\13\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\7\17e\n\17\f\17\16\17h\13\17\3\17\3\17\3X\2\20\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\3\2\n\3\2\63;"+
		"\3\2\62;\3\2\62\62\3\2\629\4\2ZZzz\5\2\62;CHch\5\2\13\f\17\17\"\"\4\2"+
		"\f\f\17\17\2o\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5#\3\2"+
		"\2\2\7(\3\2\2\2\t/\3\2\2\2\13\61\3\2\2\2\r\63\3\2\2\2\17\65\3\2\2\2\21"+
		"\67\3\2\2\2\239\3\2\2\2\25@\3\2\2\2\27G\3\2\2\2\31N\3\2\2\2\33R\3\2\2"+
		"\2\35`\3\2\2\2\37 \7k\2\2 !\7p\2\2!\"\7v\2\2\"\4\3\2\2\2#$\7o\2\2$%\7"+
		"c\2\2%&\7k\2\2&\'\7p\2\2\'\6\3\2\2\2()\7t\2\2)*\7g\2\2*+\7v\2\2+,\7w\2"+
		"\2,-\7t\2\2-.\7p\2\2.\b\3\2\2\2/\60\7*\2\2\60\n\3\2\2\2\61\62\7+\2\2\62"+
		"\f\3\2\2\2\63\64\7}\2\2\64\16\3\2\2\2\65\66\7\177\2\2\66\20\3\2\2\2\67"+
		"8\7=\2\28\22\3\2\2\29=\t\2\2\2:<\t\3\2\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2"+
		"=>\3\2\2\2>\24\3\2\2\2?=\3\2\2\2@D\t\4\2\2AC\t\5\2\2BA\3\2\2\2CF\3\2\2"+
		"\2DB\3\2\2\2DE\3\2\2\2E\26\3\2\2\2FD\3\2\2\2GH\t\4\2\2HJ\t\6\2\2IK\t\7"+
		"\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\30\3\2\2\2NO\t\b\2\2OP\3"+
		"\2\2\2PQ\b\r\2\2Q\32\3\2\2\2RS\7\61\2\2ST\7,\2\2TX\3\2\2\2UW\13\2\2\2"+
		"VU\3\2\2\2WZ\3\2\2\2XY\3\2\2\2XV\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7,\2\2"+
		"\\]\7\61\2\2]^\3\2\2\2^_\b\16\2\2_\34\3\2\2\2`a\7\61\2\2ab\7\61\2\2bf"+
		"\3\2\2\2ce\n\t\2\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2h"+
		"f\3\2\2\2ij\b\17\2\2j\36\3\2\2\2\b\2=DLXf\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}