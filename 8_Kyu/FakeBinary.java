// https://www.codewars.com/kata/57eae65a4321032ce000002d

// Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string.
//
// Note: input will never be an empty string

public class FakeBinary {
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