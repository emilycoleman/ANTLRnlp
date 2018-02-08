// Generated from English.g4 by ANTLR 4.7

    package com.generated.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EnglishParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACE=1, NOUN=2, VERB=3, DETERMINER=4, ADJ=5, ADV=6, CCONJ=7, SCONJ=8, 
		TO=9, PREP=10, IN=11, MODAL=12;
	public static final int
		RULE_sentence = 0, RULE_independent_clause = 1, RULE_dependent_clause = 2, 
		RULE_clause = 3, RULE_noun_phrase = 4, RULE_adjective_phrase = 5, RULE_adverbial_phrase = 6, 
		RULE_prepositional_phrase = 7, RULE_verb_phrase = 8, RULE_infinitive = 9;
	public static final String[] ruleNames = {
		"sentence", "independent_clause", "dependent_clause", "clause", "noun_phrase", 
		"adjective_phrase", "adverbial_phrase", "prepositional_phrase", "verb_phrase", 
		"infinitive"
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

	@Override
	public String getGrammarFileName() { return "English.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EnglishParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SentenceContext extends ParserRuleContext {
		public ClauseContext clause() {
			return getRuleContext(ClauseContext.class,0);
		}
		public List<Independent_clauseContext> independent_clause() {
			return getRuleContexts(Independent_clauseContext.class);
		}
		public Independent_clauseContext independent_clause(int i) {
			return getRuleContext(Independent_clauseContext.class,i);
		}
		public List<Dependent_clauseContext> dependent_clause() {
			return getRuleContexts(Dependent_clauseContext.class);
		}
		public Dependent_clauseContext dependent_clause(int i) {
			return getRuleContext(Dependent_clauseContext.class,i);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnglishVisitor ) return ((EnglishVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			clause();
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CCONJ) | (1L << SCONJ) | (1L << IN))) != 0)) {
				{
				setState(23);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CCONJ:
					{
					setState(21);
					independent_clause();
					}
					break;
				case SCONJ:
				case IN:
					{
					setState(22);
					dependent_clause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Independent_clauseContext extends ParserRuleContext {
		public TerminalNode CCONJ() { return getToken(EnglishParser.CCONJ, 0); }
		public ClauseContext clause() {
			return getRuleContext(ClauseContext.class,0);
		}
		public Independent_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_independent_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterIndependent_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitIndependent_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnglishVisitor ) return ((EnglishVisitor<? extends T>)visitor).visitIndependent_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Independent_clauseContext independent_clause() throws RecognitionException {
		Independent_clauseContext _localctx = new Independent_clauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_independent_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(CCONJ);
			setState(29);
			clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dependent_clauseContext extends ParserRuleContext {
		public TerminalNode SCONJ() { return getToken(EnglishParser.SCONJ, 0); }
		public ClauseContext clause() {
			return getRuleContext(ClauseContext.class,0);
		}
		public TerminalNode IN() { return getToken(EnglishParser.IN, 0); }
		public Dependent_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dependent_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterDependent_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitDependent_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnglishVisitor ) return ((EnglishVisitor<? extends T>)visitor).visitDependent_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dependent_clauseContext dependent_clause() throws RecognitionException {
		Dependent_clauseContext _localctx = new Dependent_clauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dependent_clause);
		try {
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCONJ:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				match(SCONJ);
				setState(32);
				clause();
				}
				break;
			case IN:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				match(IN);
				setState(34);
				clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClauseContext extends ParserRuleContext {
		public Noun_phraseContext noun_phrase() {
			return getRuleContext(Noun_phraseContext.class,0);
		}
		public Verb_phraseContext verb_phrase() {
			return getRuleContext(Verb_phraseContext.class,0);
		}
		public ClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnglishVisitor ) return ((EnglishVisitor<? extends T>)visitor).visitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClauseContext clause() throws RecognitionException {
		ClauseContext _localctx = new ClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			noun_phrase(0);
			setState(38);
			verb_phrase(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Noun_phraseContext extends ParserRuleContext {
		public Adjective_phraseContext adjective_phrase() {
			return getRuleContext(Adjective_phraseContext.class,0);
		}
		public List<Noun_phraseContext> noun_phrase() {
			return getRuleContexts(Noun_phraseContext.class);
		}
		public Noun_phraseContext noun_phrase(int i) {
			return getRuleContext(Noun_phraseContext.class,i);
		}
		public TerminalNode DETERMINER() { return getToken(EnglishParser.DETERMINER, 0); }
		public TerminalNode NOUN() { return getToken(EnglishParser.NOUN, 0); }
		public TerminalNode CCONJ() { return getToken(EnglishParser.CCONJ, 0); }
		public Noun_phraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noun_phrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterNoun_phrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitNoun_phrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnglishVisitor ) return ((EnglishVisitor<? extends T>)visitor).visitNoun_phrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Noun_phraseContext noun_phrase() throws RecognitionException {
		return noun_phrase(0);
	}

	private Noun_phraseContext noun_phrase(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Noun_phraseContext _localctx = new Noun_phraseContext(_ctx, _parentState);
		Noun_phraseContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_noun_phrase, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADJ:
			case ADV:
			case TO:
			case PREP:
			case IN:
				{
				setState(41);
				adjective_phrase(0);
				setState(42);
				noun_phrase(6);
				}
				break;
			case DETERMINER:
				{
				setState(44);
				match(DETERMINER);
				setState(45);
				noun_phrase(4);
				}
				break;
			case NOUN:
				{
				setState(46);
				match(NOUN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(56);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new Noun_phraseContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noun_phrase);
						setState(49);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(50);
						match(CCONJ);
						setState(51);
						noun_phrase(4);
						}
						break;
					case 2:
						{
						_localctx = new Noun_phraseContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noun_phrase);
						setState(52);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(53);
						noun_phrase(3);
						}
						break;
					case 3:
						{
						_localctx = new Noun_phraseContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noun_phrase);
						setState(54);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(55);
						adjective_phrase(0);
						}
						break;
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Adjective_phraseContext extends ParserRuleContext {
		public Adverbial_phraseContext adverbial_phrase() {
			return getRuleContext(Adverbial_phraseContext.class,0);
		}
		public List<Adjective_phraseContext> adjective_phrase() {
			return getRuleContexts(Adjective_phraseContext.class);
		}
		public Adjective_phraseContext adjective_phrase(int i) {
			return getRuleContext(Adjective_phraseContext.class,i);
		}
		public Prepositional_phraseContext prepositional_phrase() {
			return getRuleContext(Prepositional_phraseContext.class,0);
		}
		public TerminalNode ADJ() { return getToken(EnglishParser.ADJ, 0); }
		public Adjective_phraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adjective_phrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterAdjective_phrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitAdjective_phrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnglishVisitor ) return ((EnglishVisitor<? extends T>)visitor).visitAdjective_phrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Adjective_phraseContext adjective_phrase() throws RecognitionException {
		return adjective_phrase(0);
	}

	private Adjective_phraseContext adjective_phrase(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Adjective_phraseContext _localctx = new Adjective_phraseContext(_ctx, _parentState);
		Adjective_phraseContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_adjective_phrase, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(62);
				adverbial_phrase(0);
				setState(63);
				adjective_phrase(3);
				}
				break;
			case 2:
				{
				setState(65);
				prepositional_phrase();
				}
				break;
			case 3:
				{
				setState(66);
				match(ADJ);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Adjective_phraseContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_adjective_phrase);
					setState(69);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(70);
					adjective_phrase(5);
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Adverbial_phraseContext extends ParserRuleContext {
		public Prepositional_phraseContext prepositional_phrase() {
			return getRuleContext(Prepositional_phraseContext.class,0);
		}
		public TerminalNode ADV() { return getToken(EnglishParser.ADV, 0); }
		public List<Adverbial_phraseContext> adverbial_phrase() {
			return getRuleContexts(Adverbial_phraseContext.class);
		}
		public Adverbial_phraseContext adverbial_phrase(int i) {
			return getRuleContext(Adverbial_phraseContext.class,i);
		}
		public Adverbial_phraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adverbial_phrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterAdverbial_phrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitAdverbial_phrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnglishVisitor ) return ((EnglishVisitor<? extends T>)visitor).visitAdverbial_phrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Adverbial_phraseContext adverbial_phrase() throws RecognitionException {
		return adverbial_phrase(0);
	}

	private Adverbial_phraseContext adverbial_phrase(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Adverbial_phraseContext _localctx = new Adverbial_phraseContext(_ctx, _parentState);
		Adverbial_phraseContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_adverbial_phrase, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TO:
			case PREP:
			case IN:
				{
				setState(77);
				prepositional_phrase();
				}
				break;
			case ADV:
				{
				setState(78);
				match(ADV);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Adverbial_phraseContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_adverbial_phrase);
					setState(81);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(82);
					adverbial_phrase(4);
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Prepositional_phraseContext extends ParserRuleContext {
		public TerminalNode PREP() { return getToken(EnglishParser.PREP, 0); }
		public Noun_phraseContext noun_phrase() {
			return getRuleContext(Noun_phraseContext.class,0);
		}
		public TerminalNode IN() { return getToken(EnglishParser.IN, 0); }
		public TerminalNode TO() { return getToken(EnglishParser.TO, 0); }
		public TerminalNode ADV() { return getToken(EnglishParser.ADV, 0); }
		public Prepositional_phraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prepositional_phrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterPrepositional_phrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitPrepositional_phrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnglishVisitor ) return ((EnglishVisitor<? extends T>)visitor).visitPrepositional_phrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prepositional_phraseContext prepositional_phrase() throws RecognitionException {
		Prepositional_phraseContext _localctx = new Prepositional_phraseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_prepositional_phrase);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(PREP);
				setState(89);
				noun_phrase(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(IN);
				setState(91);
				noun_phrase(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				match(TO);
				setState(93);
				noun_phrase(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				match(PREP);
				setState(95);
				match(ADV);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Verb_phraseContext extends ParserRuleContext {
		public Adverbial_phraseContext adverbial_phrase() {
			return getRuleContext(Adverbial_phraseContext.class,0);
		}
		public List<Verb_phraseContext> verb_phrase() {
			return getRuleContexts(Verb_phraseContext.class);
		}
		public Verb_phraseContext verb_phrase(int i) {
			return getRuleContext(Verb_phraseContext.class,i);
		}
		public InfinitiveContext infinitive() {
			return getRuleContext(InfinitiveContext.class,0);
		}
		public TerminalNode MODAL() { return getToken(EnglishParser.MODAL, 0); }
		public TerminalNode VERB() { return getToken(EnglishParser.VERB, 0); }
		public TerminalNode CCONJ() { return getToken(EnglishParser.CCONJ, 0); }
		public Adjective_phraseContext adjective_phrase() {
			return getRuleContext(Adjective_phraseContext.class,0);
		}
		public Noun_phraseContext noun_phrase() {
			return getRuleContext(Noun_phraseContext.class,0);
		}
		public Verb_phraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verb_phrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterVerb_phrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitVerb_phrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnglishVisitor ) return ((EnglishVisitor<? extends T>)visitor).visitVerb_phrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Verb_phraseContext verb_phrase() throws RecognitionException {
		return verb_phrase(0);
	}

	private Verb_phraseContext verb_phrase(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Verb_phraseContext _localctx = new Verb_phraseContext(_ctx, _parentState);
		Verb_phraseContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_verb_phrase, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(99);
				adverbial_phrase(0);
				setState(100);
				verb_phrase(12);
				}
				break;
			case 2:
				{
				setState(102);
				infinitive();
				}
				break;
			case 3:
				{
				setState(103);
				infinitive();
				setState(104);
				verb_phrase(5);
				}
				break;
			case 4:
				{
				setState(106);
				match(MODAL);
				}
				break;
			case 5:
				{
				setState(107);
				match(VERB);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(125);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new Verb_phraseContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_verb_phrase);
						setState(110);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(111);
						match(CCONJ);
						setState(112);
						verb_phrase(5);
						}
						break;
					case 2:
						{
						_localctx = new Verb_phraseContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_verb_phrase);
						setState(113);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(114);
						adverbial_phrase(0);
						}
						break;
					case 3:
						{
						_localctx = new Verb_phraseContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_verb_phrase);
						setState(115);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(116);
						adjective_phrase(0);
						}
						break;
					case 4:
						{
						_localctx = new Verb_phraseContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_verb_phrase);
						setState(117);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(118);
						adjective_phrase(0);
						}
						break;
					case 5:
						{
						_localctx = new Verb_phraseContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_verb_phrase);
						setState(119);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(120);
						noun_phrase(0);
						}
						break;
					case 6:
						{
						_localctx = new Verb_phraseContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_verb_phrase);
						setState(121);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(122);
						infinitive();
						}
						break;
					case 7:
						{
						_localctx = new Verb_phraseContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_verb_phrase);
						setState(123);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(124);
						match(VERB);
						}
						break;
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InfinitiveContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(EnglishParser.TO, 0); }
		public TerminalNode VERB() { return getToken(EnglishParser.VERB, 0); }
		public InfinitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infinitive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterInfinitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitInfinitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnglishVisitor ) return ((EnglishVisitor<? extends T>)visitor).visitInfinitive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfinitiveContext infinitive() throws RecognitionException {
		InfinitiveContext _localctx = new InfinitiveContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_infinitive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(TO);
			setState(131);
			match(VERB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return noun_phrase_sempred((Noun_phraseContext)_localctx, predIndex);
		case 5:
			return adjective_phrase_sempred((Adjective_phraseContext)_localctx, predIndex);
		case 6:
			return adverbial_phrase_sempred((Adverbial_phraseContext)_localctx, predIndex);
		case 8:
			return verb_phrase_sempred((Verb_phraseContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean noun_phrase_sempred(Noun_phraseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean adjective_phrase_sempred(Adjective_phraseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean adverbial_phrase_sempred(Adverbial_phraseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean verb_phrase_sempred(Verb_phraseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 9);
		case 9:
			return precpred(_ctx, 8);
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16\u0088\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\5\4&\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\62\n\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\7\6;\n\6\f\6\16\6>\13\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7F\n\7\3\7\3\7\7\7J\n\7\f\7\16\7M\13\7\3\b\3\b\3\b\5\bR\n\b\3\b\3\b"+
		"\7\bV\n\b\f\b\16\bY\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tc\n\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\no\n\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0080\n\n\f\n\16\n\u0083\13\n"+
		"\3\13\3\13\3\13\3\13\2\6\n\f\16\22\f\2\4\6\b\n\f\16\20\22\24\2\2\2\u0098"+
		"\2\26\3\2\2\2\4\36\3\2\2\2\6%\3\2\2\2\b\'\3\2\2\2\n\61\3\2\2\2\fE\3\2"+
		"\2\2\16Q\3\2\2\2\20b\3\2\2\2\22n\3\2\2\2\24\u0084\3\2\2\2\26\33\5\b\5"+
		"\2\27\32\5\4\3\2\30\32\5\6\4\2\31\27\3\2\2\2\31\30\3\2\2\2\32\35\3\2\2"+
		"\2\33\31\3\2\2\2\33\34\3\2\2\2\34\3\3\2\2\2\35\33\3\2\2\2\36\37\7\t\2"+
		"\2\37 \5\b\5\2 \5\3\2\2\2!\"\7\n\2\2\"&\5\b\5\2#$\7\r\2\2$&\5\b\5\2%!"+
		"\3\2\2\2%#\3\2\2\2&\7\3\2\2\2\'(\5\n\6\2()\5\22\n\2)\t\3\2\2\2*+\b\6\1"+
		"\2+,\5\f\7\2,-\5\n\6\b-\62\3\2\2\2./\7\6\2\2/\62\5\n\6\6\60\62\7\4\2\2"+
		"\61*\3\2\2\2\61.\3\2\2\2\61\60\3\2\2\2\62<\3\2\2\2\63\64\f\5\2\2\64\65"+
		"\7\t\2\2\65;\5\n\6\6\66\67\f\4\2\2\67;\5\n\6\589\f\7\2\29;\5\f\7\2:\63"+
		"\3\2\2\2:\66\3\2\2\2:8\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\13\3\2\2"+
		"\2><\3\2\2\2?@\b\7\1\2@A\5\16\b\2AB\5\f\7\5BF\3\2\2\2CF\5\20\t\2DF\7\7"+
		"\2\2E?\3\2\2\2EC\3\2\2\2ED\3\2\2\2FK\3\2\2\2GH\f\6\2\2HJ\5\f\7\7IG\3\2"+
		"\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\r\3\2\2\2MK\3\2\2\2NO\b\b\1\2OR\5"+
		"\20\t\2PR\7\b\2\2QN\3\2\2\2QP\3\2\2\2RW\3\2\2\2ST\f\5\2\2TV\5\16\b\6U"+
		"S\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\17\3\2\2\2YW\3\2\2\2Z[\7\f\2"+
		"\2[c\5\n\6\2\\]\7\r\2\2]c\5\n\6\2^_\7\13\2\2_c\5\n\6\2`a\7\f\2\2ac\7\b"+
		"\2\2bZ\3\2\2\2b\\\3\2\2\2b^\3\2\2\2b`\3\2\2\2c\21\3\2\2\2de\b\n\1\2ef"+
		"\5\16\b\2fg\5\22\n\16go\3\2\2\2ho\5\24\13\2ij\5\24\13\2jk\5\22\n\7ko\3"+
		"\2\2\2lo\7\16\2\2mo\7\5\2\2nd\3\2\2\2nh\3\2\2\2ni\3\2\2\2nl\3\2\2\2nm"+
		"\3\2\2\2o\u0081\3\2\2\2pq\f\6\2\2qr\7\t\2\2r\u0080\5\22\n\7st\f\r\2\2"+
		"t\u0080\5\16\b\2uv\f\f\2\2v\u0080\5\f\7\2wx\f\13\2\2x\u0080\5\f\7\2yz"+
		"\f\n\2\2z\u0080\5\n\6\2{|\f\b\2\2|\u0080\5\24\13\2}~\f\5\2\2~\u0080\7"+
		"\5\2\2\177p\3\2\2\2\177s\3\2\2\2\177u\3\2\2\2\177w\3\2\2\2\177y\3\2\2"+
		"\2\177{\3\2\2\2\177}\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\23\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7\13\2"+
		"\2\u0085\u0086\7\5\2\2\u0086\25\3\2\2\2\20\31\33%\61:<EKQWbn\177\u0081";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}