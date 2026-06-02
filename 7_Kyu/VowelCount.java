// https://www.codewars.com/kata/54ff3102c1bad923760001f3

// Return the number (count) of vowels in the given string.
//
// We will consider a, e, i, o, u as vowels for this Kata (but not y).
//
// The input string will only consist of lower case letters and/or spaces.

public class Vowels {
    //1st Solution
    public static int getCount(String str) {
        String vowels = "aeiou";
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c) && vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
    //2nd Solution
    public static int getCount(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}