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
		WHITESPACE=1, NOUN=2, VERB=3, DETERMINER=4, ADJ=5, ADV=6, CCONJ=7, SCONJ=8, 
		TO=9, PREP=10, IN=11, MODAL=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WHITESPACE", "NOUN", "VERB", "DETERMINER", "ADJ", "ADV", "CCONJ", "SCONJ", 
		"TO", "PREP", "IN", "MODAL", "WORD"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WHITESPACE", "NOUN", "VERB", "DETERMINER", "ADJ", "ADV", "CCONJ", 
		"SCONJ", "TO", "PREP", "IN", "MODAL"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16\u00f7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\6\2\37\n\2\r\2\16\2 \3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3N\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4x\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5\u0092\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00b5\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00ce"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\6\16\u00f4\n\16\r\16\16\16\u00f5\2\2\17\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\2\3\2\4\4\2\f\f\"\"\4"+
		"\2C\\c|\2\u010e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\3\36\3\2\2\2\5M\3\2\2\2\7w\3\2\2\2\t\u0091"+
		"\3\2\2\2\13\u00b4\3\2\2\2\r\u00cd\3\2\2\2\17\u00cf\3\2\2\2\21\u00d4\3"+
		"\2\2\2\23\u00dc\3\2\2\2\25\u00e1\3\2\2\2\27\u00e8\3\2\2\2\31\u00ed\3\2"+
		"\2\2\33\u00f3\3\2\2\2\35\37\t\2\2\2\36\35\3\2\2\2\37 \3\2\2\2 \36\3\2"+
		"\2\2 !\3\2\2\2!\"\3\2\2\2\"#\b\2\2\2#\4\3\2\2\2$%\5\33\16\2%&\7a\2\2&"+
		"\'\7P\2\2\'(\7P\2\2(N\3\2\2\2)*\5\33\16\2*+\7a\2\2+,\7R\2\2,-\7T\2\2-"+
		".\7R\2\2.N\3\2\2\2/\60\5\33\16\2\60\61\7a\2\2\61\62\7Y\2\2\62\63\7R\2"+
		"\2\63N\3\2\2\2\64\65\5\33\16\2\65\66\7a\2\2\66\67\7Y\2\2\678\7R\2\289"+
		"\7&\2\29N\3\2\2\2:;\5\33\16\2;<\7a\2\2<=\7P\2\2=>\7P\2\2>?\7U\2\2?N\3"+
		"\2\2\2@A\5\33\16\2AB\7a\2\2BC\7P\2\2CD\7P\2\2DE\7R\2\2EN\3\2\2\2FG\5\33"+
		"\16\2GH\7a\2\2HI\7P\2\2IJ\7P\2\2JK\7R\2\2KL\7U\2\2LN\3\2\2\2M$\3\2\2\2"+
		"M)\3\2\2\2M/\3\2\2\2M\64\3\2\2\2M:\3\2\2\2M@\3\2\2\2MF\3\2\2\2N\6\3\2"+
		"\2\2OP\5\33\16\2PQ\7a\2\2QR\7X\2\2RS\7D\2\2Sx\3\2\2\2TU\5\33\16\2UV\7"+
		"a\2\2VW\7X\2\2WX\7D\2\2XY\7F\2\2Yx\3\2\2\2Z[\5\33\16\2[\\\7a\2\2\\]\7"+
		"X\2\2]^\7D\2\2^_\7I\2\2_x\3\2\2\2`a\5\33\16\2ab\7a\2\2bc\7X\2\2cd\7D\2"+
		"\2de\7P\2\2ex\3\2\2\2fg\5\33\16\2gh\7a\2\2hi\7X\2\2ij\7D\2\2jk\7R\2\2"+
		"kx\3\2\2\2lm\5\33\16\2mn\7a\2\2no\7X\2\2op\7D\2\2pq\7\\\2\2qx\3\2\2\2"+
		"rs\5\33\16\2st\7a\2\2tu\7T\2\2uv\7R\2\2vx\3\2\2\2wO\3\2\2\2wT\3\2\2\2"+
		"wZ\3\2\2\2w`\3\2\2\2wf\3\2\2\2wl\3\2\2\2wr\3\2\2\2x\b\3\2\2\2yz\5\33\16"+
		"\2z{\7a\2\2{|\7F\2\2|}\7V\2\2}\u0092\3\2\2\2~\177\5\33\16\2\177\u0080"+
		"\7a\2\2\u0080\u0081\7Y\2\2\u0081\u0082\7F\2\2\u0082\u0083\7V\2\2\u0083"+
		"\u0092\3\2\2\2\u0084\u0085\5\33\16\2\u0085\u0086\7a\2\2\u0086\u0087\7"+
		"R\2\2\u0087\u0088\7T\2\2\u0088\u0089\7R\2\2\u0089\u008a\7&\2\2\u008a\u0092"+
		"\3\2\2\2\u008b\u008c\5\33\16\2\u008c\u008d\7a\2\2\u008d\u008e\7R\2\2\u008e"+
		"\u008f\7F\2\2\u008f\u0090\7V\2\2\u0090\u0092\3\2\2\2\u0091y\3\2\2\2\u0091"+
		"~\3\2\2\2\u0091\u0084\3\2\2\2\u0091\u008b\3\2\2\2\u0092\n\3\2\2\2\u0093"+
		"\u0094\5\33\16\2\u0094\u0095\7a\2\2\u0095\u0096\7L\2\2\u0096\u0097\7L"+
		"\2\2\u0097\u00b5\3\2\2\2\u0098\u0099\5\33\16\2\u0099\u009a\7a\2\2\u009a"+
		"\u009b\7L\2\2\u009b\u009c\7L\2\2\u009c\u009d\7T\2\2\u009d\u00b5\3\2\2"+
		"\2\u009e\u009f\5\33\16\2\u009f\u00a0\7a\2\2\u00a0\u00a1\7L\2\2\u00a1\u00a2"+
		"\7L\2\2\u00a2\u00a3\7U\2\2\u00a3\u00b5\3\2\2\2\u00a4\u00a5\5\33\16\2\u00a5"+
		"\u00a6\7a\2\2\u00a6\u00a7\7E\2\2\u00a7\u00a8\7F\2\2\u00a8\u00b5\3\2\2"+
		"\2\u00a9\u00aa\5\33\16\2\u00aa\u00ab\7a\2\2\u00ab\u00ac\7R\2\2\u00ac\u00ad"+
		"\7Q\2\2\u00ad\u00ae\7U\2\2\u00ae\u00b5\3\2\2\2\u00af\u00b0\5\33\16\2\u00b0"+
		"\u00b1\7a\2\2\u00b1\u00b2\7G\2\2\u00b2\u00b3\7Z\2\2\u00b3\u00b5\3\2\2"+
		"\2\u00b4\u0093\3\2\2\2\u00b4\u0098\3\2\2\2\u00b4\u009e\3\2\2\2\u00b4\u00a4"+
		"\3\2\2\2\u00b4\u00a9\3\2\2\2\u00b4\u00af\3\2\2\2\u00b5\f\3\2\2\2\u00b6"+
		"\u00b7\5\33\16\2\u00b7\u00b8\7a\2\2\u00b8\u00b9\7T\2\2\u00b9\u00ba\7D"+
		"\2\2\u00ba\u00ce\3\2\2\2\u00bb\u00bc\5\33\16\2\u00bc\u00bd\7a\2\2\u00bd"+
		"\u00be\7T\2\2\u00be\u00bf\7D\2\2\u00bf\u00c0\7T\2\2\u00c0\u00ce\3\2\2"+
		"\2\u00c1\u00c2\5\33\16\2\u00c2\u00c3\7a\2\2\u00c3\u00c4\7T\2\2\u00c4\u00c5"+
		"\7D\2\2\u00c5\u00c6\7U\2\2\u00c6\u00ce\3\2\2\2\u00c7\u00c8\5\33\16\2\u00c8"+
		"\u00c9\7a\2\2\u00c9\u00ca\7Y\2\2\u00ca\u00cb\7T\2\2\u00cb\u00cc\7D\2\2"+
		"\u00cc\u00ce\3\2\2\2\u00cd\u00b6\3\2\2\2\u00cd\u00bb\3\2\2\2\u00cd\u00c1"+
		"\3\2\2\2\u00cd\u00c7\3\2\2\2\u00ce\16\3\2\2\2\u00cf\u00d0\5\33\16\2\u00d0"+
		"\u00d1\7a\2\2\u00d1\u00d2\7E\2\2\u00d2\u00d3\7E\2\2\u00d3\20\3\2\2\2\u00d4"+
		"\u00d5\5\33\16\2\u00d5\u00d6\7a\2\2\u00d6\u00d7\7U\2\2\u00d7\u00d8\7E"+
		"\2\2\u00d8\u00d9\7Q\2\2\u00d9\u00da\7P\2\2\u00da\u00db\7L\2\2\u00db\22"+
		"\3\2\2\2\u00dc\u00dd\5\33\16\2\u00dd\u00de\7a\2\2\u00de\u00df\7V\2\2\u00df"+
		"\u00e0\7Q\2\2\u00e0\24\3\2\2\2\u00e1\u00e2\5\33\16\2\u00e2\u00e3\7a\2"+
		"\2\u00e3\u00e4\7R\2\2\u00e4\u00e5\7T\2\2\u00e5\u00e6\7G\2\2\u00e6\u00e7"+
		"\7R\2\2\u00e7\26\3\2\2\2\u00e8\u00e9\5\33\16\2\u00e9\u00ea\7a\2\2\u00ea"+
		"\u00eb\7K\2\2\u00eb\u00ec\7P\2\2\u00ec\30\3\2\2\2\u00ed\u00ee\5\33\16"+
		"\2\u00ee\u00ef\7a\2\2\u00ef\u00f0\7O\2\2\u00f0\u00f1\7F\2\2\u00f1\32\3"+
		"\2\2\2\u00f2\u00f4\t\3\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\34\3\2\2\2\13\2 Mw\u0091\u00b4"+
		"\u00cd\u00f3\u00f5\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}