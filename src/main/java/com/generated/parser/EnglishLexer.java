// Generated from English.g4 by ANTLR 4.7

    package com.generated.parser;

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
		WHITESPACE=1, NOUN=2, WH_NOUN=3, VERB=4, DETERMINER=5, WH_DET=6, ADJ=7, 
		ADV=8, WH_ADV=9, CCONJ=10, SCONJ=11, TO=12, PREP=13, IN=14, MODAL=15, 
		INTERJECTION=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WHITESPACE", "NOUN", "WH_NOUN", "VERB", "DETERMINER", "WH_DET", "ADJ", 
		"ADV", "WH_ADV", "CCONJ", "SCONJ", "TO", "PREP", "IN", "MODAL", "INTERJECTION", 
		"WORD"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WHITESPACE", "NOUN", "WH_NOUN", "VERB", "DETERMINER", "WH_DET", 
		"ADJ", "ADV", "WH_ADV", "CCONJ", "SCONJ", "TO", "PREP", "IN", "MODAL", 
		"INTERJECTION"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u0106\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\6\2\'\n\2\r\2\16\2(\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3K\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4X\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0082\n\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0096\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\b\u00bf\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u00d2\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\6\22\u0103\n\22\r\22\16\22\u0104"+
		"\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\2\3\2\4\4\2\f\f\"\"\4\2C\\c|\2\u011a\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3&\3\2\2\2\5J\3\2\2\2\7"+
		"W\3\2\2\2\t\u0081\3\2\2\2\13\u0095\3\2\2\2\r\u0097\3\2\2\2\17\u00be\3"+
		"\2\2\2\21\u00d1\3\2\2\2\23\u00d3\3\2\2\2\25\u00d9\3\2\2\2\27\u00de\3\2"+
		"\2\2\31\u00e6\3\2\2\2\33\u00eb\3\2\2\2\35\u00f2\3\2\2\2\37\u00f7\3\2\2"+
		"\2!\u00fc\3\2\2\2#\u0102\3\2\2\2%\'\t\2\2\2&%\3\2\2\2\'(\3\2\2\2(&\3\2"+
		"\2\2()\3\2\2\2)*\3\2\2\2*+\b\2\2\2+\4\3\2\2\2,-\5#\22\2-.\7a\2\2./\7P"+
		"\2\2/\60\7P\2\2\60K\3\2\2\2\61\62\5#\22\2\62\63\7a\2\2\63\64\7R\2\2\64"+
		"\65\7T\2\2\65\66\7R\2\2\66K\3\2\2\2\678\5#\22\289\7a\2\29:\7P\2\2:;\7"+
		"P\2\2;<\7U\2\2<K\3\2\2\2=>\5#\22\2>?\7a\2\2?@\7P\2\2@A\7P\2\2AB\7R\2\2"+
		"BK\3\2\2\2CD\5#\22\2DE\7a\2\2EF\7P\2\2FG\7P\2\2GH\7R\2\2HI\7U\2\2IK\3"+
		"\2\2\2J,\3\2\2\2J\61\3\2\2\2J\67\3\2\2\2J=\3\2\2\2JC\3\2\2\2K\6\3\2\2"+
		"\2LM\5#\22\2MN\7a\2\2NO\7Y\2\2OP\7R\2\2PX\3\2\2\2QR\5#\22\2RS\7a\2\2S"+
		"T\7Y\2\2TU\7R\2\2UV\7&\2\2VX\3\2\2\2WL\3\2\2\2WQ\3\2\2\2X\b\3\2\2\2YZ"+
		"\5#\22\2Z[\7a\2\2[\\\7X\2\2\\]\7D\2\2]\u0082\3\2\2\2^_\5#\22\2_`\7a\2"+
		"\2`a\7X\2\2ab\7D\2\2bc\7F\2\2c\u0082\3\2\2\2de\5#\22\2ef\7a\2\2fg\7X\2"+
		"\2gh\7D\2\2hi\7I\2\2i\u0082\3\2\2\2jk\5#\22\2kl\7a\2\2lm\7X\2\2mn\7D\2"+
		"\2no\7P\2\2o\u0082\3\2\2\2pq\5#\22\2qr\7a\2\2rs\7X\2\2st\7D\2\2tu\7R\2"+
		"\2u\u0082\3\2\2\2vw\5#\22\2wx\7a\2\2xy\7X\2\2yz\7D\2\2z{\7\\\2\2{\u0082"+
		"\3\2\2\2|}\5#\22\2}~\7a\2\2~\177\7T\2\2\177\u0080\7R\2\2\u0080\u0082\3"+
		"\2\2\2\u0081Y\3\2\2\2\u0081^\3\2\2\2\u0081d\3\2\2\2\u0081j\3\2\2\2\u0081"+
		"p\3\2\2\2\u0081v\3\2\2\2\u0081|\3\2\2\2\u0082\n\3\2\2\2\u0083\u0084\5"+
		"#\22\2\u0084\u0085\7a\2\2\u0085\u0086\7F\2\2\u0086\u0087\7V\2\2\u0087"+
		"\u0096\3\2\2\2\u0088\u0089\5#\22\2\u0089\u008a\7a\2\2\u008a\u008b\7R\2"+
		"\2\u008b\u008c\7T\2\2\u008c\u008d\7R\2\2\u008d\u008e\7&\2\2\u008e\u0096"+
		"\3\2\2\2\u008f\u0090\5#\22\2\u0090\u0091\7a\2\2\u0091\u0092\7R\2\2\u0092"+
		"\u0093\7F\2\2\u0093\u0094\7V\2\2\u0094\u0096\3\2\2\2\u0095\u0083\3\2\2"+
		"\2\u0095\u0088\3\2\2\2\u0095\u008f\3\2\2\2\u0096\f\3\2\2\2\u0097\u0098"+
		"\5#\22\2\u0098\u0099\7a\2\2\u0099\u009a\7Y\2\2\u009a\u009b\7F\2\2\u009b"+
		"\u009c\7V\2\2\u009c\16\3\2\2\2\u009d\u009e\5#\22\2\u009e\u009f\7a\2\2"+
		"\u009f\u00a0\7L\2\2\u00a0\u00a1\7L\2\2\u00a1\u00bf\3\2\2\2\u00a2\u00a3"+
		"\5#\22\2\u00a3\u00a4\7a\2\2\u00a4\u00a5\7L\2\2\u00a5\u00a6\7L\2\2\u00a6"+
		"\u00a7\7T\2\2\u00a7\u00bf\3\2\2\2\u00a8\u00a9\5#\22\2\u00a9\u00aa\7a\2"+
		"\2\u00aa\u00ab\7L\2\2\u00ab\u00ac\7L\2\2\u00ac\u00ad\7U\2\2\u00ad\u00bf"+
		"\3\2\2\2\u00ae\u00af\5#\22\2\u00af\u00b0\7a\2\2\u00b0\u00b1\7E\2\2\u00b1"+
		"\u00b2\7F\2\2\u00b2\u00bf\3\2\2\2\u00b3\u00b4\5#\22\2\u00b4\u00b5\7a\2"+
		"\2\u00b5\u00b6\7R\2\2\u00b6\u00b7\7Q\2\2\u00b7\u00b8\7U\2\2\u00b8\u00bf"+
		"\3\2\2\2\u00b9\u00ba\5#\22\2\u00ba\u00bb\7a\2\2\u00bb\u00bc\7G\2\2\u00bc"+
		"\u00bd\7Z\2\2\u00bd\u00bf\3\2\2\2\u00be\u009d\3\2\2\2\u00be\u00a2\3\2"+
		"\2\2\u00be\u00a8\3\2\2\2\u00be\u00ae\3\2\2\2\u00be\u00b3\3\2\2\2\u00be"+
		"\u00b9\3\2\2\2\u00bf\20\3\2\2\2\u00c0\u00c1\5#\22\2\u00c1\u00c2\7a\2\2"+
		"\u00c2\u00c3\7T\2\2\u00c3\u00c4\7D\2\2\u00c4\u00d2\3\2\2\2\u00c5\u00c6"+
		"\5#\22\2\u00c6\u00c7\7a\2\2\u00c7\u00c8\7T\2\2\u00c8\u00c9\7D\2\2\u00c9"+
		"\u00ca\7T\2\2\u00ca\u00d2\3\2\2\2\u00cb\u00cc\5#\22\2\u00cc\u00cd\7a\2"+
		"\2\u00cd\u00ce\7T\2\2\u00ce\u00cf\7D\2\2\u00cf\u00d0\7U\2\2\u00d0\u00d2"+
		"\3\2\2\2\u00d1\u00c0\3\2\2\2\u00d1\u00c5\3\2\2\2\u00d1\u00cb\3\2\2\2\u00d2"+
		"\22\3\2\2\2\u00d3\u00d4\5#\22\2\u00d4\u00d5\7a\2\2\u00d5\u00d6\7Y\2\2"+
		"\u00d6\u00d7\7T\2\2\u00d7\u00d8\7D\2\2\u00d8\24\3\2\2\2\u00d9\u00da\5"+
		"#\22\2\u00da\u00db\7a\2\2\u00db\u00dc\7E\2\2\u00dc\u00dd\7E\2\2\u00dd"+
		"\26\3\2\2\2\u00de\u00df\5#\22\2\u00df\u00e0\7a\2\2\u00e0\u00e1\7U\2\2"+
		"\u00e1\u00e2\7E\2\2\u00e2\u00e3\7Q\2\2\u00e3\u00e4\7P\2\2\u00e4\u00e5"+
		"\7L\2\2\u00e5\30\3\2\2\2\u00e6\u00e7\5#\22\2\u00e7\u00e8\7a\2\2\u00e8"+
		"\u00e9\7V\2\2\u00e9\u00ea\7Q\2\2\u00ea\32\3\2\2\2\u00eb\u00ec\5#\22\2"+
		"\u00ec\u00ed\7a\2\2\u00ed\u00ee\7R\2\2\u00ee\u00ef\7T\2\2\u00ef\u00f0"+
		"\7G\2\2\u00f0\u00f1\7R\2\2\u00f1\34\3\2\2\2\u00f2\u00f3\5#\22\2\u00f3"+
		"\u00f4\7a\2\2\u00f4\u00f5\7K\2\2\u00f5\u00f6\7P\2\2\u00f6\36\3\2\2\2\u00f7"+
		"\u00f8\5#\22\2\u00f8\u00f9\7a\2\2\u00f9\u00fa\7O\2\2\u00fa\u00fb\7F\2"+
		"\2\u00fb \3\2\2\2\u00fc\u00fd\5#\22\2\u00fd\u00fe\7a\2\2\u00fe\u00ff\7"+
		"W\2\2\u00ff\u0100\7J\2\2\u0100\"\3\2\2\2\u0101\u0103\t\3\2\2\u0102\u0101"+
		"\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"$\3\2\2\2\f\2(JW\u0081\u0095\u00be\u00d1\u0102\u0104\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}