// https://www.codewars.com/kata/59fca81a5712f9fa4700159a

// Task Overview
// Given a non-negative integer b, write a function which returns an integer d such that the binary representation of b is the same as the decimal representation of d.
//
// Examples:
//
// n = 1 should return 1
// n = 5 should return 101
// n = 11 should return 1011

public class Kata {
    public static int toBinary(int n) {
        StringBuilder number = new StringBuilder();
        while (n > 0) {
            number.append(n % 2);
            n /= 2;
        }
        return Integer.parseInt(number.reverse().toString());
    }
}
