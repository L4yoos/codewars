// https://www.codewars.com/kata/57eae65a4321032ce000002d

// Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string.
//
// Note: input will never be an empty string

public class FakeBinary {
    // 1st Solution
    public static String fakeBin(String numberString) {
        int l = numberString.length();
        StringBuilder sb = new StringBuilder(l);
        for (int i = 0; i < l; i++) {
            if (numberString.charAt(i) < '5') {
                sb.append('0');
            } else {
                sb.append('1');
            }
        }
        return sb.toString();
    }
    // 2nd Solution
    public static String fakeBin(String numberString) {
        int l = numberString.length();
        StringBuilder sb = new StringBuilder(l);
        for (int i = 0; i < l; i++) {
            int value = numberString.charAt(i) - '0';
            if (value < 5) {
                sb.append('0');
            } else {
                sb.append('1');
            }
        }
        return sb.toString();
    }
    // 3rd Solution
    public static String fakeBin(String numberString) {
        StringBuilder sb = new StringBuilder();
        for (char c : numberString.toCharArray()) {
            if (c < '5') {
                sb.append('0');
            } else {
                sb.append('1');
            }
        }
        return sb.toString();
    }
}