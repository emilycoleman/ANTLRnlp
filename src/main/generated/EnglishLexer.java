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
		WHITESPACE=1, NOUN=2, VERB=3, DETERMINER=4, ADJ=5, ADV=6, CONJ=7, PERIOD=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WHITESPACE", "NOUN", "VERB", "DETERMINER", "ADJ", "ADV", "CONJ", "PERIOD"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WHITESPACE", "NOUN", "VERB", "DETERMINER", "ADJ", "ADV", "CONJ", 
		"PERIOD"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\n\u00cd\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\6\2\25"+
		"\n\2\r\2\16\2\26\3\2\3\2\3\3\6\3\34\n\3\r\3\16\3\35\3\3\3\3\3\3\3\3\6"+
		"\3$\n\3\r\3\16\3%\3\3\3\3\3\3\3\3\3\3\6\3-\n\3\r\3\16\3.\3\3\3\3\3\3\3"+
		"\3\3\3\6\3\66\n\3\r\3\16\3\67\3\3\3\3\3\3\3\3\3\3\6\3?\n\3\r\3\16\3@\3"+
		"\3\3\3\3\3\3\3\3\3\5\3H\n\3\3\4\6\4K\n\4\r\4\16\4L\3\4\3\4\3\4\3\4\6\4"+
		"S\n\4\r\4\16\4T\3\4\3\4\3\4\3\4\3\4\6\4\\\n\4\r\4\16\4]\3\4\3\4\3\4\3"+
		"\4\3\4\6\4e\n\4\r\4\16\4f\3\4\3\4\3\4\3\4\3\4\6\4n\n\4\r\4\16\4o\3\4\3"+
		"\4\3\4\3\4\3\4\6\4w\n\4\r\4\16\4x\3\4\3\4\3\4\3\4\5\4\177\n\4\3\5\6\5"+
		"\u0082\n\5\r\5\16\5\u0083\3\5\3\5\3\5\3\5\3\6\6\6\u008b\n\6\r\6\16\6\u008c"+
		"\3\6\3\6\3\6\3\6\6\6\u0093\n\6\r\6\16\6\u0094\3\6\3\6\3\6\3\6\3\6\6\6"+
		"\u009c\n\6\r\6\16\6\u009d\3\6\3\6\3\6\3\6\5\6\u00a4\n\6\3\7\6\7\u00a7"+
		"\n\7\r\7\16\7\u00a8\3\7\3\7\3\7\3\7\6\7\u00af\n\7\r\7\16\7\u00b0\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\6\7\u00b9\n\7\r\7\16\7\u00ba\3\7\3\7\3\7\3\7\5\7\u00c1"+
		"\n\7\3\b\6\b\u00c4\n\b\r\b\16\b\u00c5\3\b\3\b\3\b\3\b\3\t\3\t\2\2\n\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\3\2\4\4\2\f\f\"\"\4\2C\\c|\2\u00ec\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\3\24\3\2\2\2\5G\3\2\2\2\7~\3\2\2\2\t\u0081"+
		"\3\2\2\2\13\u00a3\3\2\2\2\r\u00c0\3\2\2\2\17\u00c3\3\2\2\2\21\u00cb\3"+
		"\2\2\2\23\25\t\2\2\2\24\23\3\2\2\2\25\26\3\2\2\2\26\24\3\2\2\2\26\27\3"+
		"\2\2\2\27\30\3\2\2\2\30\31\b\2\2\2\31\4\3\2\2\2\32\34\t\3\2\2\33\32\3"+
		"\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\37\3\2\2\2\37 \7a"+
		"\2\2 !\7P\2\2!H\7P\2\2\"$\t\3\2\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2"+
		"\2\2&\'\3\2\2\2\'(\7a\2\2()\7R\2\2)*\7T\2\2*H\7R\2\2+-\t\3\2\2,+\3\2\2"+
		"\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\61\7a\2\2\61\62\7P\2\2"+
		"\62\63\7P\2\2\63H\7U\2\2\64\66\t\3\2\2\65\64\3\2\2\2\66\67\3\2\2\2\67"+
		"\65\3\2\2\2\678\3\2\2\289\3\2\2\29:\7a\2\2:;\7P\2\2;<\7P\2\2<H\7R\2\2"+
		"=?\t\3\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\7a\2\2"+
		"CD\7P\2\2DE\7P\2\2EF\7R\2\2FH\7U\2\2G\33\3\2\2\2G#\3\2\2\2G,\3\2\2\2G"+
		"\65\3\2\2\2G>\3\2\2\2H\6\3\2\2\2IK\t\3\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2"+
		"\2LM\3\2\2\2MN\3\2\2\2NO\7a\2\2OP\7X\2\2P\177\7D\2\2QS\t\3\2\2RQ\3\2\2"+
		"\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\7a\2\2WX\7X\2\2XY\7D\2\2"+
		"Y\177\7F\2\2Z\\\t\3\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^_\3\2"+
		"\2\2_`\7a\2\2`a\7X\2\2ab\7D\2\2b\177\7I\2\2ce\t\3\2\2dc\3\2\2\2ef\3\2"+
		"\2\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\7a\2\2ij\7X\2\2jk\7D\2\2k\177\7P"+
		"\2\2ln\t\3\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\7a"+
		"\2\2rs\7X\2\2st\7D\2\2t\177\7R\2\2uw\t\3\2\2vu\3\2\2\2wx\3\2\2\2xv\3\2"+
		"\2\2xy\3\2\2\2yz\3\2\2\2z{\7a\2\2{|\7X\2\2|}\7D\2\2}\177\7\\\2\2~J\3\2"+
		"\2\2~R\3\2\2\2~[\3\2\2\2~d\3\2\2\2~m\3\2\2\2~v\3\2\2\2\177\b\3\2\2\2\u0080"+
		"\u0082\t\3\2\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2"+
		"\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\7a\2\2\u0086"+
		"\u0087\7F\2\2\u0087\u0088\7V\2\2\u0088\n\3\2\2\2\u0089\u008b\t\3\2\2\u008a"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e\u008f\7a\2\2\u008f\u0090\7L\2\2\u0090\u00a4"+
		"\7L\2\2\u0091\u0093\t\3\2\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\7a"+
		"\2\2\u0097\u0098\7L\2\2\u0098\u0099\7L\2\2\u0099\u00a4\7T\2\2\u009a\u009c"+
		"\t\3\2\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\7a\2\2\u00a0\u00a1\7L\2"+
		"\2\u00a1\u00a2\7L\2\2\u00a2\u00a4\7U\2\2\u00a3\u008a\3\2\2\2\u00a3\u0092"+
		"\3\2\2\2\u00a3\u009b\3\2\2\2\u00a4\f\3\2\2\2\u00a5\u00a7\t\3\2\2\u00a6"+
		"\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7a\2\2\u00ab\u00ac\7T\2\2\u00ac\u00c1"+
		"\7D\2\2\u00ad\u00af\t\3\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\7a"+
		"\2\2\u00b3\u00b4\7T\2\2\u00b4\u00b5\7D\2\2\u00b5\u00b6\7T\2\2\u00b6\u00b8"+
		"\3\2\2\2\u00b7\u00b9\t\3\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\7a"+
		"\2\2\u00bd\u00be\7T\2\2\u00be\u00bf\7D\2\2\u00bf\u00c1\7U\2\2\u00c0\u00a6"+
		"\3\2\2\2\u00c0\u00ae\3\2\2\2\u00c1\16\3\2\2\2\u00c2\u00c4\t\3\2\2\u00c3"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\7a\2\2\u00c8\u00c9\7E\2\2\u00c9\u00ca"+
		"\7E\2\2\u00ca\20\3\2\2\2\u00cb\u00cc\7\60\2\2\u00cc\22\3\2\2\2.\2\26\33"+
		"\35#%,.\65\67>@GJLRT[]dfmovx~\u0081\u0083\u008a\u008c\u0092\u0094\u009b"+
		"\u009d\u00a3\u00a6\u00a8\u00ae\u00b0\u00b8\u00ba\u00c0\u00c3\u00c5\3\2"+
		"\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}