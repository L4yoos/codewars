// https://www.codewars.com/kata/5865918c6b569962950002a1

// Create a function that accepts a string and a single character, and returns an integer of the count of occurrences the 2nd argument is found in the first one.
//
// If no occurrences can be found, a count of 0 should be returned.
//
// ("Hello", 'o')  =>  1
// ("Hello", 'l')  =>  2
// ("", 'z')       =>  0
// Notes
// The first argument can be an empty string
// In languages with no distinct character data type, the second argument will be a string of length 1

public class CodeWars {
    // 1st Solution
    public static int strCount(String str, char letter) {
        int count = 0;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }
    // 2nd Solution
    public static int strCount(String str, char letter) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }
    // 3rd Solution
    public static int strCount(String str, char letter) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == letter) {
                count++;
            }
        }
        return count;
    }
}