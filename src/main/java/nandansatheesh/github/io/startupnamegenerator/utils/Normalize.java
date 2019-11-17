package nandansatheesh.github.io.startupnamegenerator.utils;

public class Normalize {

    public static String getNormalizedString(String string) {

        return string.replaceAll("e i", "i")
                .replaceAll("th t", "t")
                .replaceAll(" ", "")
                .toUpperCase();
    }
}
