// https://www.codewars.com/kata/5808dcb8f0ed42ae34000031

// When provided with a number between 0-9, return it in words. Note that the input is guaranteed to be within the range of 0-9.
//
// Input: 1
//
// Output: "One".
//
// If your language supports it, try using a switch statement.

public class Kata {
    public static String switchItUp(int number) {
        return switch(number) {
            case 0 -> "Zero";
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            default -> "";
        };
    }
}