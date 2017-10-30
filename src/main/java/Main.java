//import com.grammar.EnglishLexer;
//import com.grammar.EnglishParser;
import org.antlr.v4.runtime.*;
//import generated.com.grammar.EnglishParser;
//import generated.grammar.*;


import java.io.*;

public class Main
{
    public static void main( String[] args ) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sentence = reader.readLine();

        PoSTagger tagSentence = new PoSTagger(sentence);
        String taggedSentence = tagSentence.getTaggedSentence();

//        ANTLRInputStream inputStream = new ANTLRInputStream(taggedSentence);
//        EnglishLexer lexer = new EnglishLexer(inputStream);
//        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
//        EnglishParser parser = new EnglishParser(commonTokenStream);

//        ANTLRStringStream in = new ANTLRStringStream("12*(5-6)");
//        ExpLexer lexer = new ExpLexer(in);
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//        ExpParser parser = new ExpParser(tokens);
//        parser.eval();

    }
}
