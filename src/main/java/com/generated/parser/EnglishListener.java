// Generated from English.g4 by ANTLR 4.7

    package com.generated.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EnglishParser}.
 */
public interface EnglishListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EnglishParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(EnglishParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(EnglishParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnglishParser#independent_clause}.
	 * @param ctx the parse tree
	 */
	void enterIndependent_clause(EnglishParser.Independent_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#independent_clause}.
	 * @param ctx the parse tree
	 */
	void exitIndependent_clause(EnglishParser.Independent_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnglishParser#dependent_clause}.
	 * @param ctx the parse tree
	 */
	void enterDependent_clause(EnglishParser.Dependent_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#dependent_clause}.
	 * @param ctx the parse tree
	 */
	void exitDependent_clause(EnglishParser.Dependent_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnglishParser#clause}.
	 * @param ctx the parse tree
	 */
	void enterClause(EnglishParser.ClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#clause}.
	 * @param ctx the parse tree
	 */
	void exitClause(EnglishParser.ClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnglishParser#noun_phrase}.
	 * @param ctx the parse tree
	 */
	void enterNoun_phrase(EnglishParser.Noun_phraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#noun_phrase}.
	 * @param ctx the parse tree
	 */
	void exitNoun_phrase(EnglishParser.Noun_phraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnglishParser#adjective_phrase}.
	 * @param ctx the parse tree
	 */
	void enterAdjective_phrase(EnglishParser.Adjective_phraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#adjective_phrase}.
	 * @param ctx the parse tree
	 */
	void exitAdjective_phrase(EnglishParser.Adjective_phraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnglishParser#adverbial_phrase}.
	 * @param ctx the parse tree
	 */
	void enterAdverbial_phrase(EnglishParser.Adverbial_phraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#adverbial_phrase}.
	 * @param ctx the parse tree
	 */
	void exitAdverbial_phrase(EnglishParser.Adverbial_phraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnglishParser#prepositional_phrase}.
	 * @param ctx the parse tree
	 */
	void enterPrepositional_phrase(EnglishParser.Prepositional_phraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#prepositional_phrase}.
	 * @param ctx the parse tree
	 */
	void exitPrepositional_phrase(EnglishParser.Prepositional_phraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnglishParser#verb_phrase}.
	 * @param ctx the parse tree
	 */
	void enterVerb_phrase(EnglishParser.Verb_phraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#verb_phrase}.
	 * @param ctx the parse tree
	 */
	void exitVerb_phrase(EnglishParser.Verb_phraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnglishParser#infinitive}.
	 * @param ctx the parse tree
	 */
	void enterInfinitive(EnglishParser.InfinitiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#infinitive}.
	 * @param ctx the parse tree
	 */
	void exitInfinitive(EnglishParser.InfinitiveContext ctx);
}