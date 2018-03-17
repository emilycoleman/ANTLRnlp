package app;

import eu.crydee.syllablecounter.SyllableCounter;

public class FleschReadingEase {
    private double readabilityEaseScore;

    FleschReadingEase(String sentence) {
        calculateReadabilityEaseScore(sentence);
    }

    public double getReadabilityEaseScore() {
        return readabilityEaseScore;
    }

    private void calculateReadabilityEaseScore(String sentence) {
        int sentenceLength = sentence.split(" ").length;
        int syllableCount = countSyllables(sentence);
        double averageSyllablesPerWord = syllableCount/sentenceLength;

        readabilityEaseScore = 206.835 - (1.015 * sentenceLength) - (84.6 * averageSyllablesPerWord);

    }

    private int countSyllables(String sentence) {
        SyllableCounter sc = new SyllableCounter();
        int syllableCount = 0;

        String[] words = sentence.split(" ");
        for (String word : words) {
            syllableCount += sc.count(word);
        }

        return syllableCount;
    }

}
