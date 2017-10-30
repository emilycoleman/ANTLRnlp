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
		WHITESPACE=1, ADJ=2, VERB=3, ADV=4, PREP=5, CONJ=6, INTERJ=7, NOUN=8, 
		PRONOUN=9, PERIOD=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WHITESPACE", "ADJ", "VERB", "ADV", "PREP", "CONJ", "INTERJ", "NOUN", 
		"PRONOUN", "PERIOD"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'adjective'", "'verb'", "'adverb'", "'preposition'", "'conjunction'", 
		"'interjection'", "'noun'", "'pronoun'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WHITESPACE", "ADJ", "VERB", "ADV", "PREP", "CONJ", "INTERJ", "NOUN", 
		"PRONOUN", "PERIOD"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\fh\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\6\2\31\n\2\r\2\16\2\32\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\2\2\f\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\3\2\3\4\2\f\f\"\"\2h\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3\30\3\2\2\2\5\36\3\2\2"+
		"\2\7(\3\2\2\2\t-\3\2\2\2\13\64\3\2\2\2\r@\3\2\2\2\17L\3\2\2\2\21Y\3\2"+
		"\2\2\23^\3\2\2\2\25f\3\2\2\2\27\31\t\2\2\2\30\27\3\2\2\2\31\32\3\2\2\2"+
		"\32\30\3\2\2\2\32\33\3\2\2\2\33\34\3\2\2\2\34\35\b\2\2\2\35\4\3\2\2\2"+
		"\36\37\7c\2\2\37 \7f\2\2 !\7l\2\2!\"\7g\2\2\"#\7e\2\2#$\7v\2\2$%\7k\2"+
		"\2%&\7x\2\2&\'\7g\2\2\'\6\3\2\2\2()\7x\2\2)*\7g\2\2*+\7t\2\2+,\7d\2\2"+
		",\b\3\2\2\2-.\7c\2\2./\7f\2\2/\60\7x\2\2\60\61\7g\2\2\61\62\7t\2\2\62"+
		"\63\7d\2\2\63\n\3\2\2\2\64\65\7r\2\2\65\66\7t\2\2\66\67\7g\2\2\678\7r"+
		"\2\289\7q\2\29:\7u\2\2:;\7k\2\2;<\7v\2\2<=\7k\2\2=>\7q\2\2>?\7p\2\2?\f"+
		"\3\2\2\2@A\7e\2\2AB\7q\2\2BC\7p\2\2CD\7l\2\2DE\7w\2\2EF\7p\2\2FG\7e\2"+
		"\2GH\7v\2\2HI\7k\2\2IJ\7q\2\2JK\7p\2\2K\16\3\2\2\2LM\7k\2\2MN\7p\2\2N"+
		"O\7v\2\2OP\7g\2\2PQ\7t\2\2QR\7l\2\2RS\7g\2\2ST\7e\2\2TU\7v\2\2UV\7k\2"+
		"\2VW\7q\2\2WX\7p\2\2X\20\3\2\2\2YZ\7p\2\2Z[\7q\2\2[\\\7w\2\2\\]\7p\2\2"+
		"]\22\3\2\2\2^_\7r\2\2_`\7t\2\2`a\7q\2\2ab\7p\2\2bc\7q\2\2cd\7w\2\2de\7"+
		"p\2\2e\24\3\2\2\2fg\7\60\2\2g\26\3\2\2\2\4\2\32\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}