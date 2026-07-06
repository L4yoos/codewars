// https://www.codewars.com/kata/5656b6906de340bd1b0000ac

// Take 2 strings s1 and s2 including only letters from a to z. Return a new sorted string (alphabetical ascending), the longest possible, containing distinct letters - each taken only once - coming from s1 or s2.
//
// Examples:
// a = "xyaabbbccccdefww"
// b = "xxxxyyyyabklmopq"
// longest(a, b) -> "abcdefklmopqwxy"
//
// a = "abcdefghijklmnopqrstuvwxyz"
// longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"

import java.util.List;
import java.util.ArrayList;

public class TwoToOne {
    //1st Solution
    public static String longest(String s1, String s2) {
        Set<Character> letters = new TreeSet<>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            letters.add(c);
        }

        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            letters.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (char c : letters) {
            sb.append(c);
        }
        return sb.toString();
    }
    //2nd Solution
    public static String longest(String s1, String s2) {
        List<Character> letters = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (!letters.contains(c)) {
                letters.add(c);
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (!letters.contains(c)) {
                letters.add(c);
            }
        }

        letters.sort(null);
        StringBuilder sb = new StringBuilder();
        for (char c : letters) {
            sb.append(c);
        }

        return sb.toString();
    }
}