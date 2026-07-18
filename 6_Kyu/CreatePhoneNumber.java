// https://www.codewars.com/kata/525f50e3b73515a6db000b83

// Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.
//
// Example
// Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
// The returned format must be correct in order to complete this challenge.
//
// Don't forget the space after the closing parentheses!

public class Kata {
    //1st Solution
    public static String createPhoneNumber(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",
                numbers[0], numbers[1],
                numbers[2], numbers[3],
                numbers[4], numbers[5],
                numbers[6], numbers[7],
                numbers[8], numbers[9]
        );
    }
    //2nd Solution
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder sb = new StringBuilder("(");
        for (int i = 0; i < numbers.length; i++) {
            sb.append(numbers[i]);
            if (i == 2) {
                sb.append(')');
                sb.append(' ');
            }
            if (i == 5) {
                sb.append('-');
            }
        }
        return sb.toString();
    }
}