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
		WHITESPACE=1, NOUN=2, VERB=3, DETERMINER=4, ADJ=5, ADV=6, CCONJ=7, IN=8, 
		MODAL=9, PERIOD=10;
	public static final int
		RULE_sentence = 0, RULE_clause = 1, RULE_noun_phrase = 2, RULE_adjective_phrase = 3, 
		RULE_adverbial_phrase = 4, RULE_verb_phrase = 5, RULE_prepositional_phrase = 6;
	public static final String[] ruleNames = {
		"sentence", "clause", "noun_phrase", "adjective_phrase", "adverbial_phrase", 
		"verb_phrase", "prepositional_phrase"
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
		public List<ClauseContext> clause() {
			return getRuleContexts(ClauseContext.class);
		}
		public ClauseContext clause(int i) {
			return getRuleContext(ClauseContext.class,i);
		}
		public TerminalNode PERIOD() { return getToken(EnglishParser.PERIOD, 0); }
		public TerminalNode CCONJ() { return getToken(EnglishParser.CCONJ, 0); }
		public TerminalNode IN() { return getToken(EnglishParser.IN, 0); }
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
		try {
			setState(28);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				clause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
				clause();
				setState(16);
				match(PERIOD);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(18);
				clause();
				setState(19);
				match(CCONJ);
				setState(20);
				clause();
				setState(21);
				match(PERIOD);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(23);
				clause();
				setState(24);
				match(IN);
				setState(25);
				clause();
				setState(26);
				match(PERIOD);
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
		enterRule(_localctx, 2, RULE_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			noun_phrase(0);
			setState(31);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_noun_phrase, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADJ:
			case ADV:
			case IN:
				{
				setState(34);
				adjective_phrase(0);
				setState(35);
				noun_phrase(6);
				}
				break;
			case DETERMINER:
				{
				setState(37);
				match(DETERMINER);
				setState(38);
				noun_phrase(5);
				}
				break;
			case NOUN:
				{
				setState(39);
				match(NOUN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(51);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(49);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new Noun_phraseContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noun_phrase);
						setState(42);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(43);
						noun_phrase(4);
						}
						break;
					case 2:
						{
						_localctx = new Noun_phraseContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noun_phrase);
						setState(44);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(45);
						match(CCONJ);
						setState(46);
						noun_phrase(3);
						}
						break;
					case 3:
						{
						_localctx = new Noun_phraseContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noun_phrase);
						setState(47);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(48);
						adjective_phrase(0);
						}
						break;
					}
					} 
				}
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_adjective_phrase, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(55);
				adverbial_phrase(0);
				setState(56);
				adjective_phrase(3);
				}
				break;
			case 2:
				{
				setState(58);
				prepositional_phrase();
				}
				break;
			case 3:
				{
				setState(59);
				match(ADJ);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Adjective_phraseContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_adjective_phrase);
					setState(62);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(63);
					adjective_phrase(5);
					}
					} 
				}
				setState(68);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_adverbial_phrase, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IN:
				{
				setState(70);
				prepositional_phrase();
				}
				break;
			case ADV:
				{
				setState(71);
				match(ADV);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Adverbial_phraseContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_adverbial_phrase);
					setState(74);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(75);
					adverbial_phrase(4);
					}
					} 
				}
				setState(80);
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

	public static class Verb_phraseContext extends ParserRuleContext {
		public TerminalNode VERB() { return getToken(EnglishParser.VERB, 0); }
		public TerminalNode MODAL() { return getToken(EnglishParser.MODAL, 0); }
		public Adverbial_phraseContext adverbial_phrase() {
			return getRuleContext(Adverbial_phraseContext.class,0);
		}
		public Verb_phraseContext verb_phrase() {
			return getRuleContext(Verb_phraseContext.class,0);
		}
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_verb_phrase, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VERB:
				{
				setState(82);
				match(VERB);
				}
				break;
			case MODAL:
				{
				setState(83);
				match(MODAL);
				}
				break;
			case ADV:
			case IN:
				{
				setState(84);
				adverbial_phrase(0);
				setState(85);
				verb_phrase(5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(99);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new Verb_phraseContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_verb_phrase);
						setState(89);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(90);
						match(VERB);
						}
						break;
					case 2:
						{
						_localctx = new Verb_phraseContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_verb_phrase);
						setState(91);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(92);
						adverbial_phrase(0);
						}
						break;
					case 3:
						{
						_localctx = new Verb_phraseContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_verb_phrase);
						setState(93);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(94);
						adjective_phrase(0);
						}
						break;
					case 4:
						{
						_localctx = new Verb_phraseContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_verb_phrase);
						setState(95);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(96);
						adjective_phrase(0);
						}
						break;
					case 5:
						{
						_localctx = new Verb_phraseContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_verb_phrase);
						setState(97);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(98);
						noun_phrase(0);
						}
						break;
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		public TerminalNode IN() { return getToken(EnglishParser.IN, 0); }
		public Noun_phraseContext noun_phrase() {
			return getRuleContext(Noun_phraseContext.class,0);
		}
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
		enterRule(_localctx, 12, RULE_prepositional_phrase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(IN);
			setState(105);
			noun_phrase(0);
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
		case 2:
			return noun_phrase_sempred((Noun_phraseContext)_localctx, predIndex);
		case 3:
			return adjective_phrase_sempred((Adjective_phraseContext)_localctx, predIndex);
		case 4:
			return adverbial_phrase_sempred((Adverbial_phraseContext)_localctx, predIndex);
		case 5:
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
			return precpred(_ctx, 4);
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
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\fn\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\37\n\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4+\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\64\n\4\f\4\16\4\67"+
		"\13\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5?\n\5\3\5\3\5\7\5C\n\5\f\5\16\5F\13\5"+
		"\3\6\3\6\3\6\5\6K\n\6\3\6\3\6\7\6O\n\6\f\6\16\6R\13\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7Z\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7f\n\7\f\7"+
		"\16\7i\13\7\3\b\3\b\3\b\3\b\2\6\6\b\n\f\t\2\4\6\b\n\f\16\2\2\2z\2\36\3"+
		"\2\2\2\4 \3\2\2\2\6*\3\2\2\2\b>\3\2\2\2\nJ\3\2\2\2\fY\3\2\2\2\16j\3\2"+
		"\2\2\20\37\5\4\3\2\21\22\5\4\3\2\22\23\7\f\2\2\23\37\3\2\2\2\24\25\5\4"+
		"\3\2\25\26\7\t\2\2\26\27\5\4\3\2\27\30\7\f\2\2\30\37\3\2\2\2\31\32\5\4"+
		"\3\2\32\33\7\n\2\2\33\34\5\4\3\2\34\35\7\f\2\2\35\37\3\2\2\2\36\20\3\2"+
		"\2\2\36\21\3\2\2\2\36\24\3\2\2\2\36\31\3\2\2\2\37\3\3\2\2\2 !\5\6\4\2"+
		"!\"\5\f\7\2\"\5\3\2\2\2#$\b\4\1\2$%\5\b\5\2%&\5\6\4\b&+\3\2\2\2\'(\7\6"+
		"\2\2(+\5\6\4\7)+\7\4\2\2*#\3\2\2\2*\'\3\2\2\2*)\3\2\2\2+\65\3\2\2\2,-"+
		"\f\5\2\2-\64\5\6\4\6./\f\4\2\2/\60\7\t\2\2\60\64\5\6\4\5\61\62\f\6\2\2"+
		"\62\64\5\b\5\2\63,\3\2\2\2\63.\3\2\2\2\63\61\3\2\2\2\64\67\3\2\2\2\65"+
		"\63\3\2\2\2\65\66\3\2\2\2\66\7\3\2\2\2\67\65\3\2\2\289\b\5\1\29:\5\n\6"+
		"\2:;\5\b\5\5;?\3\2\2\2<?\5\16\b\2=?\7\7\2\2>8\3\2\2\2><\3\2\2\2>=\3\2"+
		"\2\2?D\3\2\2\2@A\f\6\2\2AC\5\b\5\7B@\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2"+
		"\2\2E\t\3\2\2\2FD\3\2\2\2GH\b\6\1\2HK\5\16\b\2IK\7\b\2\2JG\3\2\2\2JI\3"+
		"\2\2\2KP\3\2\2\2LM\f\5\2\2MO\5\n\6\6NL\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3"+
		"\2\2\2Q\13\3\2\2\2RP\3\2\2\2ST\b\7\1\2TZ\7\5\2\2UZ\7\13\2\2VW\5\n\6\2"+
		"WX\5\f\7\7XZ\3\2\2\2YS\3\2\2\2YU\3\2\2\2YV\3\2\2\2Zg\3\2\2\2[\\\f\b\2"+
		"\2\\f\7\5\2\2]^\f\6\2\2^f\5\n\6\2_`\f\5\2\2`f\5\b\5\2ab\f\4\2\2bf\5\b"+
		"\5\2cd\f\3\2\2df\5\6\4\2e[\3\2\2\2e]\3\2\2\2e_\3\2\2\2ea\3\2\2\2ec\3\2"+
		"\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\r\3\2\2\2ig\3\2\2\2jk\7\n\2\2kl\5"+
		"\6\4\2l\17\3\2\2\2\r\36*\63\65>DJPYeg";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}