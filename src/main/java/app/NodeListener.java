package app;

import com.generated.parser.EnglishBaseListener;
import com.generated.parser.EnglishParser;
import org.antlr.runtime.tree.ParseTree;

public class NodeListener extends EnglishBaseListener {
    int independent_clauses = 0;
    int dependent_clauses = 0;
    int clauses = 0;
    int noun_phrases = 0;
    int adjective_phrases = 0;
    int adverbial_phrases = 0;
    int prepositional_phrases = 0;
    int verb_phrases = 0;
    int infinitives = 0;

    @Override public void enterIndependent_clause(EnglishParser.Independent_clauseContext ctx) {
        independent_clauses++;
    }

    @Override public void enterDependent_clause(EnglishParser.Dependent_clauseContext ctx) {
        dependent_clauses++;
    }

    @Override public void enterClause(EnglishParser.ClauseContext ctx) {
        clauses++;
    }

    @Override public void enterNoun_phrase(EnglishParser.Noun_phraseContext ctx) {
        noun_phrases++;
    }

    @Override public void enterAdjective_phrase(EnglishParser.Adjective_phraseContext ctx) {
        adjective_phrases++;
    }

    @Override public void enterAdverbial_phrase(EnglishParser.Adverbial_phraseContext ctx) {
        adverbial_phrases++;
    }

    @Override public void enterPrepositional_phrase(EnglishParser.Prepositional_phraseContext ctx) {
        prepositional_phrases++;
    }

    @Override public void enterVerb_phrase(EnglishParser.Verb_phraseContext ctx) {
        verb_phrases++;
    }

    @Override public void enterInfinitive(EnglishParser.InfinitiveContext ctx) {
        infinitives++;
    }

    public int getClauses() {
        return clauses;
    }

    public int getAdjective_phrases() {
        return adjective_phrases;
    }

    public int getAdverbial_phrases() {
        return adverbial_phrases;
    }

    public int getDependent_clauses() {
        return dependent_clauses;
    }

    public int getIndependent_clauses() {
        return independent_clauses;
    }

    public int getNoun_phrases() {
        return noun_phrases;
    }

    public int getInfinitives() {
        return infinitives;
    }

    public int getPrepositional_phrases() {
        return prepositional_phrases;
    }

    public int getVerb_phrases() {
        return verb_phrases;
    }
}
