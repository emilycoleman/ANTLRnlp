import edu.stanford.nlp.tagger.maxent.MaxentTagger;

//Stanford Part of Speech Tagger: https://nlp.stanford.edu/nlp/javadoc/javanlp/edu/stanford/nlp/tagger/maxent/MaxentTagger.html
public class PoSTagger {
    private String taggedSentence;

    public PoSTagger(String sentence) {
        this.taggedSentence = tagSentence(sentence);
    }

    private static String tagSentence(String in_sentence) {
        MaxentTagger tagger = new MaxentTagger("../resources/StanfordPoSTagger/models/english-left3words-distsim.tagger");
        return tagger.tagString(in_sentence);
    }

    public String getTaggedSentence() {
        return this.taggedSentence;
    }

}
