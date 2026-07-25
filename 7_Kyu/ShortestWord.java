// https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9

// Simple, given a string of words, return the length of the shortest word(s).
//
//String will never be empty and you do not need to account for different data types.

public class Kata {
    //1st Solution
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
    //2nd Solution
    public static int findShort(String s) {
        String[] parts = s.split(" ");
        int length = parts.length;

        int shortest = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            int partOne = parts[i].length();

            if (partOne < shortest) {
                shortest = partOne;
            }
        }
        return shortest;
    }
    //3rd Solution, O(1) space complexity
    public static int findShort(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int shortest = Integer.MAX_VALUE;
        int currentWordLength = 0;
        int len = s.length();

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') {
                if (currentWordLength < shortest) {
                    shortest = currentWordLength;
                }
                currentWordLength = 0;
            } else {
                currentWordLength++;
            }
        }

        if (currentWordLength > 0 && currentWordLength < shortest) {
            shortest = currentWordLength;
        }

        return shortest;
    }
}