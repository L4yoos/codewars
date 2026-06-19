// https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9

// Simple, given a string of words, return the length of the shortest word(s).
//
//String will never be empty and you do not need to account for different data types.

public class Kata {
    public static int findShort(String s) {
        String[] words = s.split(" ");
        int min = 999;
        for (String word : words) {
            if (word.length() < min) {
                min = word.length();
            }
        }
        return min;
    }
}