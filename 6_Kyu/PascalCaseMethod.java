// https://www.codewars.com/kata/587731fda577b3d1b0001196

// Write a method (or function, depending on the language) that converts a string to PascalCase, that is, all words must have their first letter capitalized and spaces must be removed.
//
// Examples (input --> output):
// "hello case" --> "HelloCase"
// "pascal case word" --> "PascalCaseWord"
// Don't forget to rate this kata! Thanks :)
//
// Note: for historical reasons, the function is named camelCase() or similar in some languages, but it should actually perform conversion to PascalCase.

public class Solution {
    //1st Solution
    public static String camelCase(String str) {
        StringBuilder sb = new StringBuilder();
        boolean capitalize = true;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isWhitespace(c)) {
                capitalize = true;
            } else {
                if (capitalize) {
                    sb.append(Character.toUpperCase(c));
                    capitalize = false;
                } else {
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
    //2nd Solution
    public static String camelCase(String str) {
        String[] parts = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            for (int j = 0; j < parts[i].length(); j++) {
                if (j == 0) {
                    sb.append(Character.toUpperCase(parts[i].charAt(j)));
                } else {
                    sb.append(parts[i].charAt(j));
                }
            }
        }
        return sb.toString();
    }
    //3rd Solution
    public static String camelCase(String str) {
        StringBuilder sb = new StringBuilder();
        String[] parts = str.split(" ");
        for (String part : parts) {
            if (!part.isEmpty()) sb.append(part.substring(0, 1).toUpperCase()).append(part.substring(1).toLowerCase());
        }
        return sb.toString();
    }
}
