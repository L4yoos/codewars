// https://www.codewars.com/kata/56f7493f5d7c12d1690000b6

// You will be given an array which will include both integers and characters.
//
// Return an array of length 2 with a[0] representing the mean of the ten integers as a floating point number. There will always be 10 integers and 10 characters. Create a single string with the characters and return it as a[1] while maintaining the original order.

public class Kata {
    //1st Solution
    public static Object[] mean(char[] lst) {
        StringBuilder sb = new StringBuilder();
        double number = 0;
        for (char c : lst) {
            if (Character.isLetter(c)) {
                sb.append(c);
            } else {
                number += Character.getNumericValue(c);
            }
        }
        return new Object[]{number / 10, sb.toString()};
    }
}