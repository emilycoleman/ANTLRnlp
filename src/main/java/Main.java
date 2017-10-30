//import com.grammar.EnglishLexer;
//import com.grammar.EnglishParser;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.awt.*;
import java.io.*;
import java.util.Arrays;
import java.util.List;

import javax.swing.*;



public class Main
{
    public static void main( String[] args ) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sentence = reader.readLine();

        PoSTagger tagSentence = new PoSTagger(sentence);
        String taggedSentence = tagSentence.getTaggedSentence();

        ANTLRInputStream inputStream = new ANTLRInputStream(taggedSentence);
        EnglishLexer lexer = new EnglishLexer(inputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        EnglishParser parser = new EnglishParser(commonTokenStream);
        List<String> rules = Arrays.asList(parser.getRuleNames());
        parser.getBuildParseTree();
        ParseTree tree = parser.getContext();
        TreeViewer treeViewer = new TreeViewer(rules, tree);

        JFrame frame = new JFrame();
        frame.setContentPane( new JScrollPane( treeViewer ) );
        frame.setPreferredSize( new Dimension(600, 800));
        frame.pack();
        frame.setLocationRelativeTo( null );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setVisible( true );
    }
}
