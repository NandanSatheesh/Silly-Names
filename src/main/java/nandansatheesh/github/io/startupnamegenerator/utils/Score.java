package nandansatheesh.github.io.startupnamegenerator.utils;

import nandansatheesh.github.io.startupnamegenerator.constants.Constants;

import java.util.Random;

public class Score {

    public static double calculateOverAllScore(String word) {
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());
        double score = 0.0;
        score += lengthScore(word) + suffixScore(word) + syllableScore(word);
        score += 0.4 * random.nextDouble();
        return score;
    }

    private static double suffixScore(String word) {

        if (word.length() == Constants.ACTUAL_SUFFIX.get(new Random().nextInt(Constants.ACTUAL_SUFFIX.size())).length()) {
            return -1.5;
        } else {
            return 0;
        }
    }

    private static double syllableScore(String word) {

        int count = Syllables.countSyllables(word);

        if (count == 2) {
            return 6.1;
        } else if (count == 3) {
            return 6;
        } else if (count > 4) {
            return 2;
        } else {
            return 4;
        }
    }

    private static double lengthScore(String word) {
        return Normalize.getNormalizedString(word).length() > 9 ? 0.1 : 0;
    }
}
