// https://www.codewars.com/kata/529eef7a9194e0cbc1000255

// An anagram is the result of rearranging the letters of a word to produce a new word (see wikipedia).
//
// Note: anagrams are case insensitive
//
// Complete the function to return true if the two arguments given are anagrams of each other; return false otherwise.
//
// Examples
// "foefet" is an anagram of "toffee"
//
// "Buckethead" is an anagram of "DeathCubeK"

public class Kata {
    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        List<Character> letters = new ArrayList<>();

        for (char c : a.toLowerCase().toCharArray()) {
            letters.add(c);
        }

        for (char c : b.toLowerCase().toCharArray()) {
            if (letters.contains(c)) {
                letters.remove((Character) c);
            }
        }

        return letters.isEmpty();
    }
}