package nandansatheesh.github.io.startupnamegenerator.utils;

public class Syllables {

    private static boolean isVowel(char c)
    {
        boolean bVowel = false;
        String temp = (c+"").toLowerCase();
        c = temp.charAt(0);
        switch(c)                                                                                                                                                                 //Used to check each character within the word to determine if
        {                                                                                                                                                                            //there is a vowel. If not the default statement will return a false.
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
                bVowel = true;                                                                                                                                                    //If any of the characters within the string proves to be a vowel it will
            default:                                                                                                                                                                 //return true.
                bVowel = false;                                                                                                                                                //The opposite effect will happen if the character within the string is a constant.
        }
        return bVowel;
    }

    public static int countSyllables(String word)
    {
        int count = 0;
        for(int i = 0; i < word.length()-1; i++)
        {
            if(isVowel(word.charAt(i)))
            {
                if(!isVowel(word.charAt(i)) && isVowel(word.charAt(i + 1)))
                    count++;
            }
            if(i == word.length() && word.charAt(i) == 'e')
                count = count;
        }
        return count;
    }
}
