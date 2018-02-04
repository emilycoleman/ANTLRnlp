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
		MODAL=9, PERIOD=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WHITESPACE", "NOUN", "VERB", "DETERMINER", "ADJ", "ADV", "CCONJ", "IN", 
		"MODAL", "PERIOD", "WORD"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "'._.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WHITESPACE", "NOUN", "VERB", "DETERMINER", "ADJ", "ADV", "CCONJ", 
		"IN", "MODAL", "PERIOD"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\f\u00e3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\6\2\33\n\2\r\2\16\2\34\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3J\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4y\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5\u0093\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\u00b1\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00ca\n\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\6"+
		"\f\u00e0\n\f\r\f\16\f\u00e1\2\2\r\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\2\3\2\4\4\2\f\f\"\"\4\2C\\c|\2\u00fa\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3\32\3\2\2\2\5I\3\2\2\2\7x\3\2\2\2"+
		"\t\u0092\3\2\2\2\13\u00b0\3\2\2\2\r\u00c9\3\2\2\2\17\u00cb\3\2\2\2\21"+
		"\u00d0\3\2\2\2\23\u00d5\3\2\2\2\25\u00da\3\2\2\2\27\u00df\3\2\2\2\31\33"+
		"\t\2\2\2\32\31\3\2\2\2\33\34\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\36"+
		"\3\2\2\2\36\37\b\2\2\2\37\4\3\2\2\2 !\5\27\f\2!\"\7a\2\2\"#\7P\2\2#$\7"+
		"P\2\2$J\3\2\2\2%&\5\27\f\2&\'\7a\2\2\'(\7R\2\2()\7T\2\2)*\7R\2\2*J\3\2"+
		"\2\2+,\5\27\f\2,-\7a\2\2-.\7Y\2\2./\7R\2\2/J\3\2\2\2\60\61\5\27\f\2\61"+
		"\62\7a\2\2\62\63\7Y\2\2\63\64\7R\2\2\64\65\7&\2\2\65J\3\2\2\2\66\67\5"+
		"\27\f\2\678\7a\2\289\7P\2\29:\7P\2\2:;\7U\2\2;J\3\2\2\2<=\5\27\f\2=>\7"+
		"a\2\2>?\7P\2\2?@\7P\2\2@A\7R\2\2AJ\3\2\2\2BC\5\27\f\2CD\7a\2\2DE\7P\2"+
		"\2EF\7P\2\2FG\7R\2\2GH\7U\2\2HJ\3\2\2\2I \3\2\2\2I%\3\2\2\2I+\3\2\2\2"+
		"I\60\3\2\2\2I\66\3\2\2\2I<\3\2\2\2IB\3\2\2\2J\6\3\2\2\2KL\5\27\f\2LM\7"+
		"a\2\2MN\7X\2\2NO\7D\2\2Oy\3\2\2\2PQ\5\27\f\2QR\7a\2\2RS\7X\2\2ST\7D\2"+
		"\2TU\7F\2\2Uy\3\2\2\2VW\5\27\f\2WX\7a\2\2XY\7X\2\2YZ\7D\2\2Z[\7I\2\2["+
		"y\3\2\2\2\\]\5\27\f\2]^\7a\2\2^_\7X\2\2_`\7D\2\2`a\7P\2\2ay\3\2\2\2bc"+
		"\5\27\f\2cd\7a\2\2de\7X\2\2ef\7D\2\2fg\7R\2\2gy\3\2\2\2hi\5\27\f\2ij\7"+
		"a\2\2jk\7X\2\2kl\7D\2\2lm\7\\\2\2my\3\2\2\2no\5\27\f\2op\7a\2\2pq\7V\2"+
		"\2qr\7Q\2\2ry\3\2\2\2st\5\27\f\2tu\7a\2\2uv\7T\2\2vw\7R\2\2wy\3\2\2\2"+
		"xK\3\2\2\2xP\3\2\2\2xV\3\2\2\2x\\\3\2\2\2xb\3\2\2\2xh\3\2\2\2xn\3\2\2"+
		"\2xs\3\2\2\2y\b\3\2\2\2z{\5\27\f\2{|\7a\2\2|}\7F\2\2}~\7V\2\2~\u0093\3"+
		"\2\2\2\177\u0080\5\27\f\2\u0080\u0081\7a\2\2\u0081\u0082\7Y\2\2\u0082"+
		"\u0083\7F\2\2\u0083\u0084\7V\2\2\u0084\u0093\3\2\2\2\u0085\u0086\5\27"+
		"\f\2\u0086\u0087\7a\2\2\u0087\u0088\7R\2\2\u0088\u0089\7T\2\2\u0089\u008a"+
		"\7R\2\2\u008a\u008b\7&\2\2\u008b\u0093\3\2\2\2\u008c\u008d\5\27\f\2\u008d"+
		"\u008e\7a\2\2\u008e\u008f\7R\2\2\u008f\u0090\7F\2\2\u0090\u0091\7V\2\2"+
		"\u0091\u0093\3\2\2\2\u0092z\3\2\2\2\u0092\177\3\2\2\2\u0092\u0085\3\2"+
		"\2\2\u0092\u008c\3\2\2\2\u0093\n\3\2\2\2\u0094\u0095\5\27\f\2\u0095\u0096"+
		"\7a\2\2\u0096\u0097\7L\2\2\u0097\u0098\7L\2\2\u0098\u00b1\3\2\2\2\u0099"+
		"\u009a\5\27\f\2\u009a\u009b\7a\2\2\u009b\u009c\7L\2\2\u009c\u009d\7L\2"+
		"\2\u009d\u009e\7T\2\2\u009e\u00b1\3\2\2\2\u009f\u00a0\5\27\f\2\u00a0\u00a1"+
		"\7a\2\2\u00a1\u00a2\7L\2\2\u00a2\u00a3\7L\2\2\u00a3\u00a4\7U\2\2\u00a4"+
		"\u00b1\3\2\2\2\u00a5\u00a6\5\27\f\2\u00a6\u00a7\7a\2\2\u00a7\u00a8\7E"+
		"\2\2\u00a8\u00a9\7F\2\2\u00a9\u00b1\3\2\2\2\u00aa\u00ab\5\27\f\2\u00ab"+
		"\u00ac\7a\2\2\u00ac\u00ad\7R\2\2\u00ad\u00ae\7Q\2\2\u00ae\u00af\7U\2\2"+
		"\u00af\u00b1\3\2\2\2\u00b0\u0094\3\2\2\2\u00b0\u0099\3\2\2\2\u00b0\u009f"+
		"\3\2\2\2\u00b0\u00a5\3\2\2\2\u00b0\u00aa\3\2\2\2\u00b1\f\3\2\2\2\u00b2"+
		"\u00b3\5\27\f\2\u00b3\u00b4\7a\2\2\u00b4\u00b5\7T\2\2\u00b5\u00b6\7D\2"+
		"\2\u00b6\u00ca\3\2\2\2\u00b7\u00b8\5\27\f\2\u00b8\u00b9\7a\2\2\u00b9\u00ba"+
		"\7T\2\2\u00ba\u00bb\7D\2\2\u00bb\u00bc\7T\2\2\u00bc\u00ca\3\2\2\2\u00bd"+
		"\u00be\5\27\f\2\u00be\u00bf\7a\2\2\u00bf\u00c0\7T\2\2\u00c0\u00c1\7D\2"+
		"\2\u00c1\u00c2\7U\2\2\u00c2\u00ca\3\2\2\2\u00c3\u00c4\5\27\f\2\u00c4\u00c5"+
		"\7a\2\2\u00c5\u00c6\7Y\2\2\u00c6\u00c7\7T\2\2\u00c7\u00c8\7D\2\2\u00c8"+
		"\u00ca\3\2\2\2\u00c9\u00b2\3\2\2\2\u00c9\u00b7\3\2\2\2\u00c9\u00bd\3\2"+
		"\2\2\u00c9\u00c3\3\2\2\2\u00ca\16\3\2\2\2\u00cb\u00cc\5\27\f\2\u00cc\u00cd"+
		"\7a\2\2\u00cd\u00ce\7E\2\2\u00ce\u00cf\7E\2\2\u00cf\20\3\2\2\2\u00d0\u00d1"+
		"\5\27\f\2\u00d1\u00d2\7a\2\2\u00d2\u00d3\7K\2\2\u00d3\u00d4\7P\2\2\u00d4"+
		"\22\3\2\2\2\u00d5\u00d6\5\27\f\2\u00d6\u00d7\7a\2\2\u00d7\u00d8\7O\2\2"+
		"\u00d8\u00d9\7F\2\2\u00d9\24\3\2\2\2\u00da\u00db\7\60\2\2\u00db\u00dc"+
		"\7a\2\2\u00dc\u00dd\7\60\2\2\u00dd\26\3\2\2\2\u00de\u00e0\t\3\2\2\u00df"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2"+
		"\2\2\u00e2\30\3\2\2\2\13\2\34Ix\u0092\u00b0\u00c9\u00df\u00e1\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}