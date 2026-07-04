// https://www.codewars.com/kata/57a1fd2ce298a731b20006a4

// Write a function that checks if a given string (case insensitive) is a palindrome.
//
// A palindrome is a word, number, phrase, or other sequence of symbols that reads the same backwards as forwards, such as madam or racecar.

public class Palindrome {
    // 1st Solution
    public static Boolean isPalindrome(String x) {
        // your code here
        x = x.toLowerCase();
        String y = new StringBuilder(x).reverse().toString();
        return x.equals(y);
    }
    // 2nd Solution
    public static Boolean isPalindrome(String x) {
        // your code here
        StringBuilder output = new StringBuilder();
        int l = x.length();
        for (int i = l - 1; i >= 0; i--) {
            output.append(x.charAt(i));
        }
        return x.equalsIgnoreCase(output.toString());
    }
}