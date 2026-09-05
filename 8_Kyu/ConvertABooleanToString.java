// https://www.codewars.com/kata/551b4501ac0447318f0009cd

// Implement a function which convert the given boolean value into its string representation.
//
// Note: Only valid inputs will be given.

public class BooleanToString {
    // 1st Solution
    public static String convert(boolean b) {
        return String.valueOf(b);
    }
    // 2nd Solution
    public static String convert(boolean b) {
        return b ? "true" : "false";
    }
    // 3rd Solution
    public static String convert(boolean b) {
        return Boolean.toString(b);
    }
}