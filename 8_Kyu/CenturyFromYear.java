// https://www.codewars.com/kata/5a3fe3dde1ce0e8ed6000097

// Introduction
// The first century spans from the year 1 up to and including the year 100, the second century - from the year 101 up to and including the year 200, etc.
//
// Task
// Given a year, return the century it is in.
//
// Examples
// 1705 --> 18
// 1900 --> 19
// 1601 --> 17
// 2000 --> 20
// 2742 --> 28
// Note: this kata uses strict construction as shown in the description and the examples, you can read more about it here

public class Solution {
    //1st Solution
    public static int century(int number) {
        String year = String.valueOf(number);

        if (number < 100) return 1;
        if (number < 1000 && (number % 10 > 0 || number % 100 > 0)) return Integer.parseInt(year.substring(0, 1)) + 1;
        if (number < 1000) return Integer.parseInt(year.substring(0, 1));
        if (number % 10 > 0 || number % 100 > 0) return Integer.parseInt(year.substring(0, 2)) + 1;
        return Integer.parseInt(year.substring(0, 2));
    }
    //2nd Solution
    public static int century(int number) {
        return number % 100 == 0 ? number / 100 : number / 100 + 1;
    }
}