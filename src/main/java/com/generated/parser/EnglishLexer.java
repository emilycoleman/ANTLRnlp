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
		WHITESPACE=1, NOUN=2, WH_NOUN=3, VERB=4, PARTICLE=5, DETERMINER=6, WH_DET=7, 
		ADJ=8, ADV=9, WH_ADV=10, CCONJ=11, SCONJ=12, TO=13, PREP=14, IN=15, MODAL=16, 
		INTERJECTION=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WHITESPACE", "NOUN", "WH_NOUN", "VERB", "PARTICLE", "DETERMINER", "WH_DET", 
		"ADJ", "ADV", "WH_ADV", "CCONJ", "SCONJ", "TO", "PREP", "IN", "MODAL", 
		"INTERJECTION", "WORD"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WHITESPACE", "NOUN", "WH_NOUN", "VERB", "PARTICLE", "DETERMINER", 
		"WH_DET", "ADJ", "ADV", "WH_ADV", "CCONJ", "SCONJ", "TO", "PREP", "IN", 
		"MODAL", "INTERJECTION"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u0108\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\6\2)\n\2\r\2\16\2*\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3M\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4Z\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5\177\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0098\n\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u00c1\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00d4\n\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\6\23\u0105\n\23"+
		"\r\23\16\23\u0106\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\2\3\2\4\5\2\f\f\"\"..\4\2C\\c|"+
		"\2\u011b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\3(\3\2\2\2\5L\3\2\2\2\7Y\3\2\2\2\t~\3\2\2\2\13\u0080\3\2"+
		"\2\2\r\u0097\3\2\2\2\17\u0099\3\2\2\2\21\u00c0\3\2\2\2\23\u00d3\3\2\2"+
		"\2\25\u00d5\3\2\2\2\27\u00db\3\2\2\2\31\u00e0\3\2\2\2\33\u00e8\3\2\2\2"+
		"\35\u00ed\3\2\2\2\37\u00f4\3\2\2\2!\u00f9\3\2\2\2#\u00fe\3\2\2\2%\u0104"+
		"\3\2\2\2\')\t\2\2\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+,\3\2\2\2"+
		",-\b\2\2\2-\4\3\2\2\2./\5%\23\2/\60\7a\2\2\60\61\7P\2\2\61\62\7P\2\2\62"+
		"M\3\2\2\2\63\64\5%\23\2\64\65\7a\2\2\65\66\7R\2\2\66\67\7T\2\2\678\7R"+
		"\2\28M\3\2\2\29:\5%\23\2:;\7a\2\2;<\7P\2\2<=\7P\2\2=>\7U\2\2>M\3\2\2\2"+
		"?@\5%\23\2@A\7a\2\2AB\7P\2\2BC\7P\2\2CD\7R\2\2DM\3\2\2\2EF\5%\23\2FG\7"+
		"a\2\2GH\7P\2\2HI\7P\2\2IJ\7R\2\2JK\7U\2\2KM\3\2\2\2L.\3\2\2\2L\63\3\2"+
		"\2\2L9\3\2\2\2L?\3\2\2\2LE\3\2\2\2M\6\3\2\2\2NO\5%\23\2OP\7a\2\2PQ\7Y"+
		"\2\2QR\7R\2\2RZ\3\2\2\2ST\5%\23\2TU\7a\2\2UV\7Y\2\2VW\7R\2\2WX\7&\2\2"+
		"XZ\3\2\2\2YN\3\2\2\2YS\3\2\2\2Z\b\3\2\2\2[\\\5%\23\2\\]\7a\2\2]^\7X\2"+
		"\2^_\7D\2\2_\177\3\2\2\2`a\5%\23\2ab\7a\2\2bc\7X\2\2cd\7D\2\2de\7F\2\2"+
		"e\177\3\2\2\2fg\5%\23\2gh\7a\2\2hi\7X\2\2ij\7D\2\2jk\7I\2\2k\177\3\2\2"+
		"\2lm\5%\23\2mn\7a\2\2no\7X\2\2op\7D\2\2pq\7P\2\2q\177\3\2\2\2rs\5%\23"+
		"\2st\7a\2\2tu\7X\2\2uv\7D\2\2vw\7R\2\2w\177\3\2\2\2xy\5%\23\2yz\7a\2\2"+
		"z{\7X\2\2{|\7D\2\2|}\7\\\2\2}\177\3\2\2\2~[\3\2\2\2~`\3\2\2\2~f\3\2\2"+
		"\2~l\3\2\2\2~r\3\2\2\2~x\3\2\2\2\177\n\3\2\2\2\u0080\u0081\5%\23\2\u0081"+
		"\u0082\7a\2\2\u0082\u0083\7T\2\2\u0083\u0084\7R\2\2\u0084\f\3\2\2\2\u0085"+
		"\u0086\5%\23\2\u0086\u0087\7a\2\2\u0087\u0088\7F\2\2\u0088\u0089\7V\2"+
		"\2\u0089\u0098\3\2\2\2\u008a\u008b\5%\23\2\u008b\u008c\7a\2\2\u008c\u008d"+
		"\7R\2\2\u008d\u008e\7T\2\2\u008e\u008f\7R\2\2\u008f\u0090\7&\2\2\u0090"+
		"\u0098\3\2\2\2\u0091\u0092\5%\23\2\u0092\u0093\7a\2\2\u0093\u0094\7R\2"+
		"\2\u0094\u0095\7F\2\2\u0095\u0096\7V\2\2\u0096\u0098\3\2\2\2\u0097\u0085"+
		"\3\2\2\2\u0097\u008a\3\2\2\2\u0097\u0091\3\2\2\2\u0098\16\3\2\2\2\u0099"+
		"\u009a\5%\23\2\u009a\u009b\7a\2\2\u009b\u009c\7Y\2\2\u009c\u009d\7F\2"+
		"\2\u009d\u009e\7V\2\2\u009e\20\3\2\2\2\u009f\u00a0\5%\23\2\u00a0\u00a1"+
		"\7a\2\2\u00a1\u00a2\7L\2\2\u00a2\u00a3\7L\2\2\u00a3\u00c1\3\2\2\2\u00a4"+
		"\u00a5\5%\23\2\u00a5\u00a6\7a\2\2\u00a6\u00a7\7L\2\2\u00a7\u00a8\7L\2"+
		"\2\u00a8\u00a9\7T\2\2\u00a9\u00c1\3\2\2\2\u00aa\u00ab\5%\23\2\u00ab\u00ac"+
		"\7a\2\2\u00ac\u00ad\7L\2\2\u00ad\u00ae\7L\2\2\u00ae\u00af\7U\2\2\u00af"+
		"\u00c1\3\2\2\2\u00b0\u00b1\5%\23\2\u00b1\u00b2\7a\2\2\u00b2\u00b3\7E\2"+
		"\2\u00b3\u00b4\7F\2\2\u00b4\u00c1\3\2\2\2\u00b5\u00b6\5%\23\2\u00b6\u00b7"+
		"\7a\2\2\u00b7\u00b8\7R\2\2\u00b8\u00b9\7Q\2\2\u00b9\u00ba\7U\2\2\u00ba"+
		"\u00c1\3\2\2\2\u00bb\u00bc\5%\23\2\u00bc\u00bd\7a\2\2\u00bd\u00be\7G\2"+
		"\2\u00be\u00bf\7Z\2\2\u00bf\u00c1\3\2\2\2\u00c0\u009f\3\2\2\2\u00c0\u00a4"+
		"\3\2\2\2\u00c0\u00aa\3\2\2\2\u00c0\u00b0\3\2\2\2\u00c0\u00b5\3\2\2\2\u00c0"+
		"\u00bb\3\2\2\2\u00c1\22\3\2\2\2\u00c2\u00c3\5%\23\2\u00c3\u00c4\7a\2\2"+
		"\u00c4\u00c5\7T\2\2\u00c5\u00c6\7D\2\2\u00c6\u00d4\3\2\2\2\u00c7\u00c8"+
		"\5%\23\2\u00c8\u00c9\7a\2\2\u00c9\u00ca\7T\2\2\u00ca\u00cb\7D\2\2\u00cb"+
		"\u00cc\7T\2\2\u00cc\u00d4\3\2\2\2\u00cd\u00ce\5%\23\2\u00ce\u00cf\7a\2"+
		"\2\u00cf\u00d0\7T\2\2\u00d0\u00d1\7D\2\2\u00d1\u00d2\7U\2\2\u00d2\u00d4"+
		"\3\2\2\2\u00d3\u00c2\3\2\2\2\u00d3\u00c7\3\2\2\2\u00d3\u00cd\3\2\2\2\u00d4"+
		"\24\3\2\2\2\u00d5\u00d6\5%\23\2\u00d6\u00d7\7a\2\2\u00d7\u00d8\7Y\2\2"+
		"\u00d8\u00d9\7T\2\2\u00d9\u00da\7D\2\2\u00da\26\3\2\2\2\u00db\u00dc\5"+
		"%\23\2\u00dc\u00dd\7a\2\2\u00dd\u00de\7E\2\2\u00de\u00df\7E\2\2\u00df"+
		"\30\3\2\2\2\u00e0\u00e1\5%\23\2\u00e1\u00e2\7a\2\2\u00e2\u00e3\7U\2\2"+
		"\u00e3\u00e4\7E\2\2\u00e4\u00e5\7Q\2\2\u00e5\u00e6\7P\2\2\u00e6\u00e7"+
		"\7L\2\2\u00e7\32\3\2\2\2\u00e8\u00e9\5%\23\2\u00e9\u00ea\7a\2\2\u00ea"+
		"\u00eb\7V\2\2\u00eb\u00ec\7Q\2\2\u00ec\34\3\2\2\2\u00ed\u00ee\5%\23\2"+
		"\u00ee\u00ef\7a\2\2\u00ef\u00f0\7R\2\2\u00f0\u00f1\7T\2\2\u00f1\u00f2"+
		"\7G\2\2\u00f2\u00f3\7R\2\2\u00f3\36\3\2\2\2\u00f4\u00f5\5%\23\2\u00f5"+
		"\u00f6\7a\2\2\u00f6\u00f7\7K\2\2\u00f7\u00f8\7P\2\2\u00f8 \3\2\2\2\u00f9"+
		"\u00fa\5%\23\2\u00fa\u00fb\7a\2\2\u00fb\u00fc\7O\2\2\u00fc\u00fd\7F\2"+
		"\2\u00fd\"\3\2\2\2\u00fe\u00ff\5%\23\2\u00ff\u0100\7a\2\2\u0100\u0101"+
		"\7W\2\2\u0101\u0102\7J\2\2\u0102$\3\2\2\2\u0103\u0105\t\3\2\2\u0104\u0103"+
		"\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"&\3\2\2\2\f\2*LY~\u0097\u00c0\u00d3\u0104\u0106\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}