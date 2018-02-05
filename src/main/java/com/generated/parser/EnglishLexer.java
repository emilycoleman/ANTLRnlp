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
		WHITESPACE=1, NOUN=2, VERB=3, DETERMINER=4, ADJ=5, ADV=6, CCONJ=7, IN=8, 
		MODAL=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WHITESPACE", "NOUN", "VERB", "DETERMINER", "ADJ", "ADV", "CCONJ", "IN", 
		"MODAL", "WORD"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WHITESPACE", "NOUN", "VERB", "DETERMINER", "ADJ", "ADV", "CCONJ", 
		"IN", "MODAL"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13\u00e2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\3\2\6\2\31\n\2\r\2\16\2\32\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3H\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4w\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5\u0091\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6\u00b4\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00cd\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\6\13"+
		"\u00df\n\13\r\13\16\13\u00e0\2\2\f\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\2\3\2\4\4\2\f\f\"\"\4\2C\\c|\2\u00fa\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\3\30\3\2\2\2\5G\3\2\2\2\7v\3\2\2\2\t\u0090\3\2\2\2"+
		"\13\u00b3\3\2\2\2\r\u00cc\3\2\2\2\17\u00ce\3\2\2\2\21\u00d3\3\2\2\2\23"+
		"\u00d8\3\2\2\2\25\u00de\3\2\2\2\27\31\t\2\2\2\30\27\3\2\2\2\31\32\3\2"+
		"\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\34\3\2\2\2\34\35\b\2\2\2\35\4\3\2"+
		"\2\2\36\37\5\25\13\2\37 \7a\2\2 !\7P\2\2!\"\7P\2\2\"H\3\2\2\2#$\5\25\13"+
		"\2$%\7a\2\2%&\7R\2\2&\'\7T\2\2\'(\7R\2\2(H\3\2\2\2)*\5\25\13\2*+\7a\2"+
		"\2+,\7Y\2\2,-\7R\2\2-H\3\2\2\2./\5\25\13\2/\60\7a\2\2\60\61\7Y\2\2\61"+
		"\62\7R\2\2\62\63\7&\2\2\63H\3\2\2\2\64\65\5\25\13\2\65\66\7a\2\2\66\67"+
		"\7P\2\2\678\7P\2\289\7U\2\29H\3\2\2\2:;\5\25\13\2;<\7a\2\2<=\7P\2\2=>"+
		"\7P\2\2>?\7R\2\2?H\3\2\2\2@A\5\25\13\2AB\7a\2\2BC\7P\2\2CD\7P\2\2DE\7"+
		"R\2\2EF\7U\2\2FH\3\2\2\2G\36\3\2\2\2G#\3\2\2\2G)\3\2\2\2G.\3\2\2\2G\64"+
		"\3\2\2\2G:\3\2\2\2G@\3\2\2\2H\6\3\2\2\2IJ\5\25\13\2JK\7a\2\2KL\7X\2\2"+
		"LM\7D\2\2Mw\3\2\2\2NO\5\25\13\2OP\7a\2\2PQ\7X\2\2QR\7D\2\2RS\7F\2\2Sw"+
		"\3\2\2\2TU\5\25\13\2UV\7a\2\2VW\7X\2\2WX\7D\2\2XY\7I\2\2Yw\3\2\2\2Z[\5"+
		"\25\13\2[\\\7a\2\2\\]\7X\2\2]^\7D\2\2^_\7P\2\2_w\3\2\2\2`a\5\25\13\2a"+
		"b\7a\2\2bc\7X\2\2cd\7D\2\2de\7R\2\2ew\3\2\2\2fg\5\25\13\2gh\7a\2\2hi\7"+
		"X\2\2ij\7D\2\2jk\7\\\2\2kw\3\2\2\2lm\5\25\13\2mn\7a\2\2no\7V\2\2op\7Q"+
		"\2\2pw\3\2\2\2qr\5\25\13\2rs\7a\2\2st\7T\2\2tu\7R\2\2uw\3\2\2\2vI\3\2"+
		"\2\2vN\3\2\2\2vT\3\2\2\2vZ\3\2\2\2v`\3\2\2\2vf\3\2\2\2vl\3\2\2\2vq\3\2"+
		"\2\2w\b\3\2\2\2xy\5\25\13\2yz\7a\2\2z{\7F\2\2{|\7V\2\2|\u0091\3\2\2\2"+
		"}~\5\25\13\2~\177\7a\2\2\177\u0080\7Y\2\2\u0080\u0081\7F\2\2\u0081\u0082"+
		"\7V\2\2\u0082\u0091\3\2\2\2\u0083\u0084\5\25\13\2\u0084\u0085\7a\2\2\u0085"+
		"\u0086\7R\2\2\u0086\u0087\7T\2\2\u0087\u0088\7R\2\2\u0088\u0089\7&\2\2"+
		"\u0089\u0091\3\2\2\2\u008a\u008b\5\25\13\2\u008b\u008c\7a\2\2\u008c\u008d"+
		"\7R\2\2\u008d\u008e\7F\2\2\u008e\u008f\7V\2\2\u008f\u0091\3\2\2\2\u0090"+
		"x\3\2\2\2\u0090}\3\2\2\2\u0090\u0083\3\2\2\2\u0090\u008a\3\2\2\2\u0091"+
		"\n\3\2\2\2\u0092\u0093\5\25\13\2\u0093\u0094\7a\2\2\u0094\u0095\7L\2\2"+
		"\u0095\u0096\7L\2\2\u0096\u00b4\3\2\2\2\u0097\u0098\5\25\13\2\u0098\u0099"+
		"\7a\2\2\u0099\u009a\7L\2\2\u009a\u009b\7L\2\2\u009b\u009c\7T\2\2\u009c"+
		"\u00b4\3\2\2\2\u009d\u009e\5\25\13\2\u009e\u009f\7a\2\2\u009f\u00a0\7"+
		"L\2\2\u00a0\u00a1\7L\2\2\u00a1\u00a2\7U\2\2\u00a2\u00b4\3\2\2\2\u00a3"+
		"\u00a4\5\25\13\2\u00a4\u00a5\7a\2\2\u00a5\u00a6\7E\2\2\u00a6\u00a7\7F"+
		"\2\2\u00a7\u00b4\3\2\2\2\u00a8\u00a9\5\25\13\2\u00a9\u00aa\7a\2\2\u00aa"+
		"\u00ab\7R\2\2\u00ab\u00ac\7Q\2\2\u00ac\u00ad\7U\2\2\u00ad\u00b4\3\2\2"+
		"\2\u00ae\u00af\5\25\13\2\u00af\u00b0\7a\2\2\u00b0\u00b1\7G\2\2\u00b1\u00b2"+
		"\7Z\2\2\u00b2\u00b4\3\2\2\2\u00b3\u0092\3\2\2\2\u00b3\u0097\3\2\2\2\u00b3"+
		"\u009d\3\2\2\2\u00b3\u00a3\3\2\2\2\u00b3\u00a8\3\2\2\2\u00b3\u00ae\3\2"+
		"\2\2\u00b4\f\3\2\2\2\u00b5\u00b6\5\25\13\2\u00b6\u00b7\7a\2\2\u00b7\u00b8"+
		"\7T\2\2\u00b8\u00b9\7D\2\2\u00b9\u00cd\3\2\2\2\u00ba\u00bb\5\25\13\2\u00bb"+
		"\u00bc\7a\2\2\u00bc\u00bd\7T\2\2\u00bd\u00be\7D\2\2\u00be\u00bf\7T\2\2"+
		"\u00bf\u00cd\3\2\2\2\u00c0\u00c1\5\25\13\2\u00c1\u00c2\7a\2\2\u00c2\u00c3"+
		"\7T\2\2\u00c3\u00c4\7D\2\2\u00c4\u00c5\7U\2\2\u00c5\u00cd\3\2\2\2\u00c6"+
		"\u00c7\5\25\13\2\u00c7\u00c8\7a\2\2\u00c8\u00c9\7Y\2\2\u00c9\u00ca\7T"+
		"\2\2\u00ca\u00cb\7D\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00b5\3\2\2\2\u00cc"+
		"\u00ba\3\2\2\2\u00cc\u00c0\3\2\2\2\u00cc\u00c6\3\2\2\2\u00cd\16\3\2\2"+
		"\2\u00ce\u00cf\5\25\13\2\u00cf\u00d0\7a\2\2\u00d0\u00d1\7E\2\2\u00d1\u00d2"+
		"\7E\2\2\u00d2\20\3\2\2\2\u00d3\u00d4\5\25\13\2\u00d4\u00d5\7a\2\2\u00d5"+
		"\u00d6\7K\2\2\u00d6\u00d7\7P\2\2\u00d7\22\3\2\2\2\u00d8\u00d9\5\25\13"+
		"\2\u00d9\u00da\7a\2\2\u00da\u00db\7O\2\2\u00db\u00dc\7F\2\2\u00dc\24\3"+
		"\2\2\2\u00dd\u00df\t\3\2\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\26\3\2\2\2\13\2\32Gv\u0090\u00b3"+
		"\u00cc\u00de\u00e0\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}