package app;

import com.generated.parser.EnglishParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.runtime.tree.Trees;
import org.antlr.v4.runtime.tree.xpath.XPath;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.util.ArrayList;

public class ReadabilityScore {
    private double readingScore = 0;

    public ReadabilityScore(ParseTree tree, EnglishParser parser) {

        //Break sentence up into a list of independent clauses
        String xpath = "/sentence/independent_clause";
        ArrayList<ParseTree> independentClauses = new ArrayList<>(XPath.findAll(tree, xpath, parser));
        ArrayList<Double> independentClauseScores = new ArrayList<>();
        ArrayList<Double> fleschScores = new ArrayList<>();

        //For each independent clause
        for(ParseTree independentClause : independentClauses) {

            //get subtree's independent clause
            String subtreeClause = getSubtreeSentence(independentClause);
            String[] cleanSubtree = cleanSentenceOfTags(subtreeClause);

            //get its baseline score
            FleschReadingEase fleschReadingEase = new FleschReadingEase(cleanSubtree);
            fleschScores.add(fleschReadingEase.getReadabilityEaseScore());

            //alter that score based on its structure
            independentClauseScores.add(adjustScore(independentClause, parser));
        }

        //take the average of the independent clause's scores
        double independentClauseScoresAverage = getAverage(independentClauseScores);
        double fleschScoresAverage = getAverage(fleschScores);

        //if the sentence has more than one independent clause, deduct points for each additional clause
        double readabilityScorePentalty = independentClauseScoresAverage;
        if(independentClauses.size() > 1) {
            readabilityScorePentalty -= independentClauses.size() - 1;
        }

        readingScore = fleschScoresAverage - readabilityScorePentalty;
    }

    public double getReadingScore() {
        return readingScore;
    }

    private String getSubtreeSentence(ParseTree subtree) {
        NodeListener extractor = new NodeListener();
        ParseTreeWalker.DEFAULT.walk(extractor, subtree);

        String sentence = extractor.terminalWords;

        return sentence;
    }

    private String[] cleanSentenceOfTags(String sentence) {
        ArrayList<String> cleanString = new ArrayList<>();
        String[] splitSentence = sentence.split(" ");

        for(String word : splitSentence) {
            if(word.length() > 0) {
                cleanString.add(word);
            }
        }

        String[] returnArray = new String[cleanString.size()];
        return cleanString.toArray(returnArray);
    }

    //count how many layers deep you've gone to appropriately penalize
    private double adjustScore(ParseTree tree, EnglishParser parser) {
        //Penalty chart:
        //# independent clauses > 1 * -1
        //# dependent clauses       * -3
        //sum of dep clause depth   * -2

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
        int finalSize = (dependentClauseCount * 3) + (depthSum * 2);
        return finalSize;
    }

    double getAverage(ArrayList<Double> numbers) {
        double total = 0;
        for(double number : numbers) {
            total += number;
        }

        return total/numbers.size();
    }
}
