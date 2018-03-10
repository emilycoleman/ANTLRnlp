package app;

import org.antlr.v4.runtime.tree.ParseTree;

public class ReadabilityScore {
    private int score;

    public int getReadabilityScore() {
        return score;
    }

    public String getReadabilityLevel() {
        if (score < 20) return "Very easy";
        else if (score > 20 && score < 41) return "Easy";
        else if (score > 41 && score < 61) return "Medium";
        else if (score > 61 && score < 81) return "Hard";
        else return "Very hard";
    }

    private void calculateReadabilityScore(ParseTree tree) {
        //break independent clauses into array
        System.out.println(tree.getText());

    }

}
