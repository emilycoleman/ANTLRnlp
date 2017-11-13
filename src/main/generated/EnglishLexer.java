// Generated from English.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EnglishLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACE=1, NOUN=2, VERB=3, DETERMINER=4, ADJ=5, ADV=6, CONJ=7, PREP=8, 
		MODAL=9, PERIOD=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WHITESPACE", "NOUN", "VERB", "DETERMINER", "ADJ", "ADV", "CONJ", "PREP", 
		"MODAL", "PERIOD", "WORD"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "'._.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WHITESPACE", "NOUN", "VERB", "DETERMINER", "ADJ", "ADV", "CONJ", 
		"PREP", "MODAL", "PERIOD"
	};
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


	public EnglishLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "English.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\f\u00b6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\6\2\33\n\2\r\2\16\2\34\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3?\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4d\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5r\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u008a\n\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"\u009d\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\f\6\f\u00b3\n\f\r\f\16\f\u00b4\2\2\r\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\2\3\2\4\4\2\f\f\"\"\4\2C\\c|\2"+
		"\u00c5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3\32\3"+
		"\2\2\2\5>\3\2\2\2\7c\3\2\2\2\tq\3\2\2\2\13\u0089\3\2\2\2\r\u009c\3\2\2"+
		"\2\17\u009e\3\2\2\2\21\u00a3\3\2\2\2\23\u00a8\3\2\2\2\25\u00ad\3\2\2\2"+
		"\27\u00b2\3\2\2\2\31\33\t\2\2\2\32\31\3\2\2\2\33\34\3\2\2\2\34\32\3\2"+
		"\2\2\34\35\3\2\2\2\35\36\3\2\2\2\36\37\b\2\2\2\37\4\3\2\2\2 !\5\27\f\2"+
		"!\"\7a\2\2\"#\7P\2\2#$\7P\2\2$?\3\2\2\2%&\5\27\f\2&\'\7a\2\2\'(\7R\2\2"+
		"()\7T\2\2)*\7R\2\2*?\3\2\2\2+,\5\27\f\2,-\7a\2\2-.\7P\2\2./\7P\2\2/\60"+
		"\7U\2\2\60?\3\2\2\2\61\62\5\27\f\2\62\63\7a\2\2\63\64\7P\2\2\64\65\7P"+
		"\2\2\65\66\7R\2\2\66?\3\2\2\2\678\5\27\f\289\7a\2\29:\7P\2\2:;\7P\2\2"+
		";<\7R\2\2<=\7U\2\2=?\3\2\2\2> \3\2\2\2>%\3\2\2\2>+\3\2\2\2>\61\3\2\2\2"+
		">\67\3\2\2\2?\6\3\2\2\2@A\5\27\f\2AB\7a\2\2BC\7X\2\2CD\7D\2\2Dd\3\2\2"+
		"\2EF\5\27\f\2FG\7a\2\2GH\7X\2\2HI\7D\2\2IJ\7F\2\2Jd\3\2\2\2KL\5\27\f\2"+
		"LM\7a\2\2MN\7X\2\2NO\7D\2\2OP\7I\2\2Pd\3\2\2\2QR\5\27\f\2RS\7a\2\2ST\7"+
		"X\2\2TU\7D\2\2UV\7P\2\2Vd\3\2\2\2WX\5\27\f\2XY\7a\2\2YZ\7X\2\2Z[\7D\2"+
		"\2[\\\7R\2\2\\d\3\2\2\2]^\5\27\f\2^_\7a\2\2_`\7X\2\2`a\7D\2\2ab\7\\\2"+
		"\2bd\3\2\2\2c@\3\2\2\2cE\3\2\2\2cK\3\2\2\2cQ\3\2\2\2cW\3\2\2\2c]\3\2\2"+
		"\2d\b\3\2\2\2ef\5\27\f\2fg\7a\2\2gh\7F\2\2hi\7V\2\2ir\3\2\2\2jk\5\27\f"+
		"\2kl\7a\2\2lm\7R\2\2mn\7T\2\2no\7R\2\2op\7&\2\2pr\3\2\2\2qe\3\2\2\2qj"+
		"\3\2\2\2r\n\3\2\2\2st\5\27\f\2tu\7a\2\2uv\7L\2\2vw\7L\2\2w\u008a\3\2\2"+
		"\2xy\5\27\f\2yz\7a\2\2z{\7L\2\2{|\7L\2\2|}\7T\2\2}\u008a\3\2\2\2~\177"+
		"\5\27\f\2\177\u0080\7a\2\2\u0080\u0081\7L\2\2\u0081\u0082\7L\2\2\u0082"+
		"\u0083\7U\2\2\u0083\u008a\3\2\2\2\u0084\u0085\5\27\f\2\u0085\u0086\7a"+
		"\2\2\u0086\u0087\7E\2\2\u0087\u0088\7F\2\2\u0088\u008a\3\2\2\2\u0089s"+
		"\3\2\2\2\u0089x\3\2\2\2\u0089~\3\2\2\2\u0089\u0084\3\2\2\2\u008a\f\3\2"+
		"\2\2\u008b\u008c\5\27\f\2\u008c\u008d\7a\2\2\u008d\u008e\7T\2\2\u008e"+
		"\u008f\7D\2\2\u008f\u009d\3\2\2\2\u0090\u0091\5\27\f\2\u0091\u0092\7a"+
		"\2\2\u0092\u0093\7T\2\2\u0093\u0094\7D\2\2\u0094\u0095\7T\2\2\u0095\u009d"+
		"\3\2\2\2\u0096\u0097\5\27\f\2\u0097\u0098\7a\2\2\u0098\u0099\7T\2\2\u0099"+
		"\u009a\7D\2\2\u009a\u009b\7U\2\2\u009b\u009d\3\2\2\2\u009c\u008b\3\2\2"+
		"\2\u009c\u0090\3\2\2\2\u009c\u0096\3\2\2\2\u009d\16\3\2\2\2\u009e\u009f"+
		"\5\27\f\2\u009f\u00a0\7a\2\2\u00a0\u00a1\7E\2\2\u00a1\u00a2\7E\2\2\u00a2"+
		"\20\3\2\2\2\u00a3\u00a4\5\27\f\2\u00a4\u00a5\7a\2\2\u00a5\u00a6\7K\2\2"+
		"\u00a6\u00a7\7P\2\2\u00a7\22\3\2\2\2\u00a8\u00a9\5\27\f\2\u00a9\u00aa"+
		"\7a\2\2\u00aa\u00ab\7O\2\2\u00ab\u00ac\7F\2\2\u00ac\24\3\2\2\2\u00ad\u00ae"+
		"\7\60\2\2\u00ae\u00af\7a\2\2\u00af\u00b0\7\60\2\2\u00b0\26\3\2\2\2\u00b1"+
		"\u00b3\t\3\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2"+
		"\2\2\u00b4\u00b5\3\2\2\2\u00b5\30\3\2\2\2\13\2\34>cq\u0089\u009c\u00b2"+
		"\u00b4\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}