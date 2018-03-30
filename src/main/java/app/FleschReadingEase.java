package app;

import eu.crydee.syllablecounter.SyllableCounter;

public class FleschReadingEase {
    private double readabilityEaseScore;

    FleschReadingEase(String[] sentence) {
        calculateReadabilityEaseScore(sentence);
    }

    public double getReadabilityEaseScore() {
        return readabilityEaseScore;
    }

    private void calculateReadabilityEaseScore(String[] sentence) {
        double syllableCount = countSyllables(sentence);
        double averageSyllablesPerWord = syllableCount/sentence.length;

        readabilityEaseScore = 206.835 - (1.015 * sentence.length) - (84.6 * averageSyllablesPerWord);

    }

    private int countSyllables(String[] sentence) {
        SyllableCounter sc = new SyllableCounter();
        int syllableCount = 0;

        for (String word : sentence) {
            syllableCount += sc.count(word);
        }

        return syllableCount;
    }

}
