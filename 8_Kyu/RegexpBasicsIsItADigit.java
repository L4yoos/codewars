// https://www.codewars.com/kata/567bf4f7ee34510f69000032

// Implement a function that returns true when a given string only contains a single digit (0-9), false otherwise.

public class StringUtils {
    public static boolean isDigit(String s) {
        return s.matches("[0-9]");
    }
}