// https://www.codewars.com/kata/58b8c94b7df3f116eb00005b

// Task
// Given a string str, reverse it and omit all non-alphabetic characters.
//
// Example
// For str = "krishan", the output should be "nahsirk".
//
// For str = "ultr53o?n", the output should be "nortlu".
//
// Input/Output
// [input] string str
// A string consists of lowercase latin letters, digits and symbols.
//
// [output] a string

public class Kata {
    public static String reverseLetter(final String str) {
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            if (Character.isLetter(chars[i])) {
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }
}