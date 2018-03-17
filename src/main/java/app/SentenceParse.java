package app;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import com.generated.parser.EnglishParser;
import com.generated.parser.EnglishLexer;

import java.util.Arrays;
import java.util.List;

public class SentenceParse {

    private TreeViewer treeViewer;
    private int sentenceReadabilityScore;

//  TODO: Refactor into separate objects: ParsedSentence, ReadabilityScore
//    private ParseTree tree;
//    private EnglishParser parser;
    private String sentence;
//    private String taggedSentence;

    public SentenceParse(String taggedSentence) {
        this.treeViewer = createTreeViewer(taggedSentence);
    };

    public TreeViewer getTreeViewer() {
        return this.treeViewer;
    }

    public int getSentenceReadabilityScore() {
        return sentenceReadabilityScore;
    }

    private TreeViewer createTreeViewer(String sentence) {
        this.sentence = sentence;
        PoSTagger tagSentence = new PoSTagger(sentence);
        String taggedSentence = tagSentence.getTaggedSentence();
        taggedSentence = preprocessor(taggedSentence);
        System.out.println(taggedSentence);

        CharStream input = CharStreams.fromString(taggedSentence);
        EnglishLexer lexer = new EnglishLexer(input);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        EnglishParser parser = new EnglishParser(commonTokenStream);

        List<String> rules = Arrays.asList(parser.getRuleNames());
        ParseTree tree = parser.sentence();

        ReadabilityScore readabilityScore = new ReadabilityScore(tree, parser);

        return new TreeViewer(rules, tree);
    }

    private String preprocessor(String sentence) {
        if(sentence.contains("_IN ")) {
            String[] words = sentence.split(" ");
            for(String taggedWord : words) {
                if(taggedWord.contains("_IN")) {
                    String word = taggedWord.split("_IN")[0];

                    if(isPreposition(word) && isSubordinateConjunction(word)) {
                        //TODO: write a tagger that can make a best guess?
                        //leave word as-is
                    } else if(isPreposition(word)) {
                        sentence = sentence.replace(taggedWord, word + "_PREP");
                    } else if(isSubordinateConjunction(word)) {
                        sentence = sentence.replace(taggedWord, word + "_SCONJ");
                    } else {
                        //leave word as-is
                        System.out.println("_IN not in list!\n" + word);
                    }
                }
            }
        }

        return sentence;
    }

    private boolean isPreposition(String word) {
        String[] prepositions = {"aboard",	"about",	"above",	"across",	"after",	"against",	"along",	"amid",	"among",	"anti",	"around",	"as",	"at",	"before",	"behind",	"below",	"beneath",	"beside",	"besides",	"between",	"beyond",	"but",	"by",	"concerning",	"considering",	"despite",	"down",	"during",	"except",	"excepting",	"excluding",	"following",	"for",	"from",	"in",	"inside",	"into",	"like",	"minus",	"near",	"of",	"off",	"on",	"onto",	"opposite",	"out", "outside", "over", "past", "per", "plus", "regarding", "round", "save", "since",	"than",	"through", "to", "toward", "towards", "under", "underneath", "unlike", "until", "up", "upon", "versus", "via", "with",	"within",	"without"};
        return containsCaseInsensitive(word, prepositions);
    }

    private boolean isSubordinateConjunction(String word) {
        String[] subordinatingConjunctions = {"After",	"Although",	"As", "Because", "Before", "By", "How",	"If", "Lest", "Once", "Since", "Than", "That", "Though", "Till", "Unless", "Until", "Whatever",	"When",	"Whenever",	"Where", "Whereas",	"Wherever",	"Whether",	"Which", "Whichever", "While", "Who", "Whoever", "Whom", "Whomever", "Whose"};
        return containsCaseInsensitive(word, subordinatingConjunctions);
    }

    private boolean containsCaseInsensitive(String word, String[] sentence){
        return Arrays.stream(sentence).anyMatch(x -> x.equalsIgnoreCase(word));
    }
}
