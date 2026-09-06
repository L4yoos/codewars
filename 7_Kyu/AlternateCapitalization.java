// https://www.codewars.com/kata/59cfc000aeb2844d16000075

// Given a string, capitalize the letters that occupy even indexes and odd indexes separately, and return as shown below. Index 0 will be considered even.
//
// For example, capitalize("abcdef") = ['AbCdEf', 'aBcDeF']. See test cases for more examples.
//
// The input will be a lowercase string with no spaces.
//
// ood luck!
//
// If you like this Kata, please try:
//
// Indexed capitalization
//
// Even-odd disparity

class Solution {
    public static String[] capitalize(String s){
        char[] chars = s.toCharArray();
        char[] charsSec = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }

        for (int i = 0; i < chars.length; i++) {
            if (i % 2 != 0) {
                charsSec[i] = Character.toUpperCase(charsSec[i]);
            }
        }

        return new String[]{new String(chars), new String(charsSec)};
    }
}