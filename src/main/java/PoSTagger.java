import java.util.*;

import edu.stanford.nlp.tagger.maxent.MaxentTagger;

//Stanford Part of Speech Tagger: https://nlp.stanford.edu/nlp/javadoc/javanlp/edu/stanford/nlp/tagger/maxent/MaxentTagger.html
public class PoSTagger {
    private String taggedSentence;

    public PoSTagger(String sentence) {
        taggedSentence = tagSentence(sentence);
    }

    public static void main(String[] arg) {
        tagSentence("This is a sentence.");
    }

    public static String tagSentence(String in_sentence) {
        MaxentTagger tagger = new MaxentTagger("../resources/StanfordPoSTagger/models/english-left3words-distsim.tagger");
        String taggedString = tagger.tagString(in_sentence);

        String[] splitSentence = taggedString.split(" ");

        ArrayList<String> pos = new ArrayList<>();
        for(String word : splitSentence) {
            String[] partOfSpeech = word.split("_");
            pos.add(partOfSpeech[1]);
        }

        return String.join(" ", pos);
    }

    public String getTaggedSentence() {
        return taggedSentence;
    }

}
