// https://www.codewars.com/kata/57fb09ef2b5314a8a90001ed

// Description:
// Replace all vowel to exclamation mark in the sentence. aeiouAEIOU is vowel.
//
// Examples
// "Hi!" --> "H!!"
// "!Hi! Hi!" --> "!H!! H!!"
// "aeiou" --> "!!!!!"
// "ABCDE" --> "!BCD!"

public class Solution {
    //1st Solution
    public static String replace(final String s) {
        return s.replaceAll("[aeiouAEIOU]", "!");
    }
    //2nd Solution
    public static String replace(final String s) {
        return s.replaceAll("a|A|e|E|I|i|O|o|U|u", "!");
    }
}