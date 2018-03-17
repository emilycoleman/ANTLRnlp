package app;

import com.generated.parser.EnglishParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.runtime.tree.Trees;
import org.antlr.v4.runtime.tree.xpath.XPath;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import edu.stanford.nlp.trees.EnglishGrammaticalRelations;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.lang.StringBuffer;

public class ReadabilityScore {
    private double readingScore = 0;

    public ReadabilityScore(ParseTree tree, EnglishParser parser) {

        //Break sentence up into a list of independent clauses
        String xpath = "/sentence/independent_clause";
        ArrayList<ParseTree> independentClauses = new ArrayList<>(XPath.findAll(tree, xpath, parser));

        //For each independent clause
        for(ParseTree independentClause : independentClauses) {
            //get subtree's independent clause
            String subtreeClause = getSubtreeSentence(independentClause);
            subtreeClause = cleanSentenceOfTags(subtreeClause);
            System.out.println("clean subtree: " + subtreeClause);

            //get its baseline score
            FleschReadingEase fleschReadingEase = new FleschReadingEase(getSubtreeSentence(independentClause));
            double fleschScore = fleschReadingEase.getReadabilityEaseScore();

            //alter that score based on its structure
            readingScore = fleschScore + refineSentenceScore(fleschScore, independentClause, parser);
        }
    }

    public double getReadingScore() {
        return readingScore;
    }

    private String getSubtreeSentence(ParseTree subtree) {
        NodeListener extractor = new NodeListener();
        ParseTreeWalker.DEFAULT.walk(extractor, subtree);

        String sentence = extractor.terminalWords;
        System.out.println("subtree sentence: " + sentence);

        return sentence;
    }

    private String cleanSentenceOfTags(String sentence) {
        StringBuffer cleanSentence = new StringBuffer();
        String[] splitSentence = sentence.split(" ");

        for(String word : splitSentence) {
            cleanSentence.append(" " + word.split("_[a-zA-Z]*")[0]);
        }

        return cleanSentence.toString();
    }

    private double refineSentenceScore(double score, ParseTree t, EnglishParser parser) {
        //Penalty chart:
        //# dependent clauses       * -3
        //sum of dep clause depth   * -2
        //# adverbs                 * -1
        //passive voice               -5
        //immediate subject + verb    +5

        //Penalize dependent clauses
        score -= calculateDependentClausePenalties(t, parser);

        //Active or passive voice (?)

        //FROM JALEN'S NOTES:

        //Penalize for adverbs
        //Add one point for each adverb
        int advCount = 0;
        String advPath = "//ADV";
        for(ParseTree adv : XPath.findAll(t, advPath, parser)) {
            advCount++;
        }
        score -= advCount;

        //Keep a subject and its verb physically close together

        return score;
    }

    //recursively find each nested dependent clause

    //count how many layers deep you've gone to appropriately penalize
    private int calculateDependentClausePenalties(ParseTree tree, EnglishParser parser) {
        //for each dependent clause
        String dependentClausePaths = "//dependent_clause";
        ArrayList<ParseTree> dependentClauses = new ArrayList<>(XPath.findAll(tree, dependentClausePaths, parser));

        int depthSum = 0;
        for(ParseTree clause : dependentClauses) {
            //int depth = 0;
            for(Tree t : Trees.getAncestors(clause)) {
                String ancestorNode = Trees.getNodeText(t, parser);
                if(ancestorNode.equals("dependent_clause")) {
                    depthSum++;
                    //depth++;
                }
            }
            //System.out.println(depth);
        }

         //return (# of dependent clauses * 3) + (sum of dep clause depth * 2)
        int dependentClauseCount = dependentClauses.size();
        return ((dependentClauseCount * 3) + (depthSum * 2));
    }

    private void findRecursiveAncestors(ParseTree tree) {

    }
}
