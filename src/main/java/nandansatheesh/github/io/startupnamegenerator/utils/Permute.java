package nandansatheesh.github.io.startupnamegenerator.utils;

import nandansatheesh.github.io.startupnamegenerator.constants.Constants;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Permute {

    public static List<String> permutateStrings(List<String> wordList) {

        if (wordList.size() == 0) {
            return permuteFixes(Constants.PREFIXES, Constants.SUFFIXES);
        } else {
            return Stream.concat(permuteFixes(Constants.PREFIXES, wordList).stream(),
                    permuteFixes(wordList, Constants.SUFFIXES).stream())
                    .collect(Collectors.toList());
        }

    }

    private static List<String> permuteFixes(List<String> prefixes, List<String> suffixes) {

        List<String> namesList = new ArrayList<>();

        prefixes.stream().forEach(prefix -> {
            suffixes.stream().forEach(suffix -> {
                if (!prefix.equalsIgnoreCase(suffix)) {
                    namesList.add(prefix + " " + suffix);
                }
            });
        });

        return namesList;
    }

}
