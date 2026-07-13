// https://www.codewars.com/kata/5208f99aee097e6552000148

// Complete the solution so that the function will break up camel casing, using a space between words.
//
// Example
// "camelCasing"  =>  "camel Casing"
// "identifier"   =>  "identifier"
// ""             =>  ""

class Solution {
    public static String camelCase(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                sb.append(' ').append(input.charAt(i));
            } else {
                sb.append(input.charAt(i));
            }
        }
        return sb.toString();
    }
}
