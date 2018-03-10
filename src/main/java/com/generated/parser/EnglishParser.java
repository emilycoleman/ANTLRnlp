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
		WHITESPACE=1, NOUN=2, WH_NOUN=3, VERB=4, DETERMINER=5, WH_DET=6, ADJ=7, 
		ADV=8, WH_ADV=9, CCONJ=10, SCONJ=11, TO=12, PREP=13, IN=14, MODAL=15, 
		INTERJECTION=16;
	public static final int
		RULE_sentence = 0, RULE_clause = 1, RULE_independent_clause = 2, RULE_dependent_clause = 3, 
		RULE_subordinating_conjunction = 4, RULE_subject = 5, RULE_predicate = 6, 
		RULE_noun_phrase = 7, RULE_adjective_phrase = 8, RULE_adverbial_phrase = 9, 
		RULE_prepositional_phrase = 10, RULE_verb_phrase = 11, RULE_infinitive = 12;
	public static final String[] ruleNames = {
		"sentence", "clause", "independent_clause", "dependent_clause", "subordinating_conjunction", 
		"subject", "predicate", "noun_phrase", "adjective_phrase", "adverbial_phrase", 
		"prepositional_phrase", "verb_phrase", "infinitive"
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
		public List<Independent_clauseContext> independent_clause() {
			return getRuleContexts(Independent_clauseContext.class);
		}
		public Independent_clauseContext independent_clause(int i) {
			return getRuleContext(Independent_clauseContext.class,i);
		}
		public List<TerminalNode> INTERJECTION() { return getTokens(EnglishParser.INTERJECTION); }
		public TerminalNode INTERJECTION(int i) {
			return getToken(EnglishParser.INTERJECTION, i);
		}
		public List<TerminalNode> CCONJ() { return getTokens(EnglishParser.CCONJ); }
		public TerminalNode CCONJ(int i) {
			return getToken(EnglishParser.CCONJ, i);
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
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INTERJECTION) {
				{
				{
				setState(26);
				match(INTERJECTION);
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			independent_clause();
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WH_NOUN) | (1L << WH_DET) | (1L << WH_ADV) | (1L << CCONJ) | (1L << SCONJ) | (1L << IN))) != 0)) {
				{
				setState(36);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CCONJ:
					{
					setState(33);
					match(CCONJ);
					setState(34);
					independent_clause();
					}
					break;
				case WH_NOUN:
				case WH_DET:
				case WH_ADV:
				case SCONJ:
				case IN:
					{
					setState(35);
					dependent_clause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(40);
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

	public static class ClauseContext extends ParserRuleContext {
		public SubjectContext subject() {
			return getRuleContext(SubjectContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
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
			setState(41);
			subject();
			setState(42);
			predicate();
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
		enterRule(_localctx, 4, RULE_independent_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
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
		public Subordinating_conjunctionContext subordinating_conjunction() {
			return getRuleContext(Subordinating_conjunctionContext.class,0);
		}
		public ClauseContext clause() {
			return getRuleContext(ClauseContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
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
		enterRule(_localctx, 6, RULE_dependent_clause);
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				subordinating_conjunction();
				setState(47);
				clause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				subordinating_conjunction();
				setState(50);
				predicate();
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

	public static class Subordinating_conjunctionContext extends ParserRuleContext {
		public TerminalNode SCONJ() { return getToken(EnglishParser.SCONJ, 0); }
		public TerminalNode IN() { return getToken(EnglishParser.IN, 0); }
		public TerminalNode WH_NOUN() { return getToken(EnglishParser.WH_NOUN, 0); }
		public TerminalNode WH_ADV() { return getToken(EnglishParser.WH_ADV, 0); }
		public TerminalNode WH_DET() { return getToken(EnglishParser.WH_DET, 0); }
		public Subordinating_conjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subordinating_conjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterSubordinating_conjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitSubordinating_conjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnglishVisitor ) return ((EnglishVisitor<? extends T>)visitor).visitSubordinating_conjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subordinating_conjunctionContext subordinating_conjunction() throws RecognitionException {
		Subordinating_conjunctionContext _localctx = new Subordinating_conjunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_subordinating_conjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WH_NOUN) | (1L << WH_DET) | (1L << WH_ADV) | (1L << SCONJ) | (1L << IN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class SubjectContext extends ParserRuleContext {
		public Noun_phraseContext noun_phrase() {
			return getRuleContext(Noun_phraseContext.class,0);
		}
		public SubjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterSubject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitSubject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnglishVisitor ) return ((EnglishVisitor<? extends T>)visitor).visitSubject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubjectContext subject() throws RecognitionException {
		SubjectContext _localctx = new SubjectContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_subject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
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

	public static class PredicateContext extends ParserRuleContext {
		public Verb_phraseContext verb_phrase() {
			return getRuleContext(Verb_phraseContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EnglishVisitor ) return ((EnglishVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_noun_phrase, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WH_NOUN:
			case WH_DET:
			case ADJ:
			case ADV:
			case WH_ADV:
			case SCONJ:
			case TO:
			case PREP:
			case IN:
				{
				setState(61);
				adjective_phrase(0);
				setState(62);
				noun_phrase(6);
				}
				break;
			case DETERMINER:
				{
				setState(64);
				match(DETERMINER);
				setState(65);
				noun_phrase(4);
				}
				break;
			case NOUN:
				{
				setState(66);
				match(NOUN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(76);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new Noun_phraseContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noun_phrase);
						setState(69);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(70);
						match(CCONJ);
						setState(71);
						noun_phrase(4);
						}
						break;
					case 2:
						{
						_localctx = new Noun_phraseContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noun_phrase);
						setState(72);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(73);
						noun_phrase(3);
						}
						break;
					case 3:
						{
						_localctx = new Noun_phraseContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noun_phrase);
						setState(74);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(75);
						adjective_phrase(0);
						}
						break;
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		public Dependent_clauseContext dependent_clause() {
			return getRuleContext(Dependent_clauseContext.class,0);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_adjective_phrase, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(82);
				adverbial_phrase(0);
				setState(83);
				adjective_phrase(4);
				}
				break;
			case 2:
				{
				setState(85);
				prepositional_phrase();
				}
				break;
			case 3:
				{
				setState(86);
				dependent_clause();
				}
				break;
			case 4:
				{
				setState(87);
				match(ADJ);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Adjective_phraseContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_adjective_phrase);
					setState(90);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(91);
					adjective_phrase(6);
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_adverbial_phrase, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TO:
			case PREP:
			case IN:
				{
				setState(98);
				prepositional_phrase();
				}
				break;
			case ADV:
				{
				setState(99);
				match(ADV);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Adverbial_phraseContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_adverbial_phrase);
					setState(102);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(103);
					adverbial_phrase(4);
					}
					} 
				}
				setState(108);
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
		enterRule(_localctx, 20, RULE_prepositional_phrase);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(PREP);
				setState(110);
				noun_phrase(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(IN);
				setState(112);
				noun_phrase(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				match(TO);
				setState(114);
				noun_phrase(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				match(PREP);
				setState(116);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_verb_phrase, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(120);
				adverbial_phrase(0);
				setState(121);
				verb_phrase(12);
				}
				break;
			case 2:
				{
				setState(123);
				infinitive();
				}
				break;
			case 3:
				{
				setState(124);
				infinitive();
				setState(125);
				verb_phrase(5);
				}
				break;
			case 4:
				{
				setState(127);
				match(MODAL);
				}
				break;
			case 5:
				{
				setState(128);
				match(VERB);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(146);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new Verb_phraseContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_verb_phrase);
						setState(131);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(132);
						match(CCONJ);
						setState(133);
						verb_phrase(5);
						}
						break;
					case 2:
						{
						_localctx = new Verb_phraseContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_verb_phrase);
						setState(134);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(135);
						adverbial_phrase(0);
						}
						break;
					case 3:
						{
						_localctx = new Verb_phraseContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_verb_phrase);
						setState(136);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(137);
						adjective_phrase(0);
						}
						break;
					case 4:
						{
						_localctx = new Verb_phraseContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_verb_phrase);
						setState(138);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(139);
						adjective_phrase(0);
						}
						break;
					case 5:
						{
						_localctx = new Verb_phraseContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_verb_phrase);
						setState(140);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(141);
						noun_phrase(0);
						}
						break;
					case 6:
						{
						_localctx = new Verb_phraseContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_verb_phrase);
						setState(142);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(143);
						infinitive();
						}
						break;
					case 7:
						{
						_localctx = new Verb_phraseContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_verb_phrase);
						setState(144);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(145);
						match(VERB);
						}
						break;
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		enterRule(_localctx, 24, RULE_infinitive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(TO);
			setState(152);
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
		case 7:
			return noun_phrase_sempred((Noun_phraseContext)_localctx, predIndex);
		case 8:
			return adjective_phrase_sempred((Adjective_phraseContext)_localctx, predIndex);
		case 9:
			return adverbial_phrase_sempred((Adverbial_phraseContext)_localctx, predIndex);
		case 11:
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
			return precpred(_ctx, 5);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22\u009d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2\3\2"+
		"\3\2\3\2\7\2\'\n\2\f\2\16\2*\13\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5\67\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\tF\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tO\n\t\f\t\16\tR\13\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\n[\n\n\3\n\3\n\7\n_\n\n\f\n\16\nb\13\n\3\13\3"+
		"\13\3\13\5\13g\n\13\3\13\3\13\7\13k\n\13\f\13\16\13n\13\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\5\fx\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u0084\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\7\r\u0095\n\r\f\r\16\r\u0098\13\r\3\16\3\16\3\16\3\16\2\6\20\22\24"+
		"\30\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\3\7\2\5\5\b\b\13\13\r\r\20\20"+
		"\2\u00ac\2\37\3\2\2\2\4+\3\2\2\2\6.\3\2\2\2\b\66\3\2\2\2\n8\3\2\2\2\f"+
		":\3\2\2\2\16<\3\2\2\2\20E\3\2\2\2\22Z\3\2\2\2\24f\3\2\2\2\26w\3\2\2\2"+
		"\30\u0083\3\2\2\2\32\u0099\3\2\2\2\34\36\7\22\2\2\35\34\3\2\2\2\36!\3"+
		"\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"(\5\6\4\2#$\7"+
		"\f\2\2$\'\5\6\4\2%\'\5\b\5\2&#\3\2\2\2&%\3\2\2\2\'*\3\2\2\2(&\3\2\2\2"+
		"()\3\2\2\2)\3\3\2\2\2*(\3\2\2\2+,\5\f\7\2,-\5\16\b\2-\5\3\2\2\2./\5\4"+
		"\3\2/\7\3\2\2\2\60\61\5\n\6\2\61\62\5\4\3\2\62\67\3\2\2\2\63\64\5\n\6"+
		"\2\64\65\5\16\b\2\65\67\3\2\2\2\66\60\3\2\2\2\66\63\3\2\2\2\67\t\3\2\2"+
		"\289\t\2\2\29\13\3\2\2\2:;\5\20\t\2;\r\3\2\2\2<=\5\30\r\2=\17\3\2\2\2"+
		">?\b\t\1\2?@\5\22\n\2@A\5\20\t\bAF\3\2\2\2BC\7\7\2\2CF\5\20\t\6DF\7\4"+
		"\2\2E>\3\2\2\2EB\3\2\2\2ED\3\2\2\2FP\3\2\2\2GH\f\5\2\2HI\7\f\2\2IO\5\20"+
		"\t\6JK\f\4\2\2KO\5\20\t\5LM\f\7\2\2MO\5\22\n\2NG\3\2\2\2NJ\3\2\2\2NL\3"+
		"\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\21\3\2\2\2RP\3\2\2\2ST\b\n\1\2T"+
		"U\5\24\13\2UV\5\22\n\6V[\3\2\2\2W[\5\26\f\2X[\5\b\5\2Y[\7\t\2\2ZS\3\2"+
		"\2\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[`\3\2\2\2\\]\f\7\2\2]_\5\22\n\b^\\"+
		"\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\23\3\2\2\2b`\3\2\2\2cd\b\13\1"+
		"\2dg\5\26\f\2eg\7\n\2\2fc\3\2\2\2fe\3\2\2\2gl\3\2\2\2hi\f\5\2\2ik\5\24"+
		"\13\6jh\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\25\3\2\2\2nl\3\2\2\2op"+
		"\7\17\2\2px\5\20\t\2qr\7\20\2\2rx\5\20\t\2st\7\16\2\2tx\5\20\t\2uv\7\17"+
		"\2\2vx\7\n\2\2wo\3\2\2\2wq\3\2\2\2ws\3\2\2\2wu\3\2\2\2x\27\3\2\2\2yz\b"+
		"\r\1\2z{\5\24\13\2{|\5\30\r\16|\u0084\3\2\2\2}\u0084\5\32\16\2~\177\5"+
		"\32\16\2\177\u0080\5\30\r\7\u0080\u0084\3\2\2\2\u0081\u0084\7\21\2\2\u0082"+
		"\u0084\7\6\2\2\u0083y\3\2\2\2\u0083}\3\2\2\2\u0083~\3\2\2\2\u0083\u0081"+
		"\3\2\2\2\u0083\u0082\3\2\2\2\u0084\u0096\3\2\2\2\u0085\u0086\f\6\2\2\u0086"+
		"\u0087\7\f\2\2\u0087\u0095\5\30\r\7\u0088\u0089\f\r\2\2\u0089\u0095\5"+
		"\24\13\2\u008a\u008b\f\f\2\2\u008b\u0095\5\22\n\2\u008c\u008d\f\13\2\2"+
		"\u008d\u0095\5\22\n\2\u008e\u008f\f\n\2\2\u008f\u0095\5\20\t\2\u0090\u0091"+
		"\f\b\2\2\u0091\u0095\5\32\16\2\u0092\u0093\f\5\2\2\u0093\u0095\7\6\2\2"+
		"\u0094\u0085\3\2\2\2\u0094\u0088\3\2\2\2\u0094\u008a\3\2\2\2\u0094\u008c"+
		"\3\2\2\2\u0094\u008e\3\2\2\2\u0094\u0090\3\2\2\2\u0094\u0092\3\2\2\2\u0095"+
		"\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\31\3\2\2"+
		"\2\u0098\u0096\3\2\2\2\u0099\u009a\7\16\2\2\u009a\u009b\7\6\2\2\u009b"+
		"\33\3\2\2\2\21\37&(\66ENPZ`flw\u0083\u0094\u0096";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}