// https://www.codewars.com/kata/5168bb5dfe9a00b126000018

// Complete the solution so that it reverses the string passed into it.

public class Kata {
    // 1st Solution
    public static String solution(String str) {
        return new StringBuilder().append(str).reverse().toString();
    }
    // 2nd Solution
    public static String solution(String str) {
        String reverse = "";
        char[] chrArray = str.toCharArray();
        for (int i = chrArray.length - 1; i >= 0; i--) {
            reverse += chrArray[i];
        }
        return reverse;
    }
    // 3nd Solution
    public static String solution(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }
}