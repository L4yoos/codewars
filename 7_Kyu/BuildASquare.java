// https://www.codewars.com/kata/59a96d71dbe3b06c0200009c

// I will give you an integer. Give me back a shape that is as long and wide as the integer. The integer will be a whole number between 1 and 50.
//
// Example
// n = 3, so I expect a 3x3 square back just like below as a string:
//
// +++
// +++
// +++

public class Kata {
    public static final String generateShape(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                sb.append("\n");
            }
            sb.append("+".repeat(n));
        }
        return sb.toString();
    }
}
