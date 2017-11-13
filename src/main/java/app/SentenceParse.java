package app;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Arrays;
import java.util.List;

public class SentenceParse {

    private TreeViewer treeViewer;

    public SentenceParse(String taggedSentence) {
        this.treeViewer = createTreeViewer(taggedSentence);
    };

    public TreeViewer getTreeViewer() {
        return this.treeViewer;
    }

    private TreeViewer createTreeViewer(String sentence) {
        PoSTagger tagSentence = new PoSTagger(sentence);
        String taggedSentence = tagSentence.getTaggedSentence();
        System.out.println(taggedSentence);

        CharStream input = CharStreams.fromString(taggedSentence);
        EnglishLexer lexer = new EnglishLexer(input);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        EnglishParser parser = new EnglishParser(commonTokenStream);

        List<String> rules = Arrays.asList(parser.getRuleNames());
        ParseTree tree = parser.sentence();

        return new TreeViewer(rules, tree);
    }

}
