// https://www.codewars.com/kata/52f3149496de55aded000410

// Write a function which takes a number as input and returns the sum of the absolute value of each of the number's decimal digits.
//
// For example: (Input --> Output)
//
// 10 --> 1
// 99 --> 18
// -32 --> 5
// Let's assume that all numbers in the input will be integer values.

public class Kata {
    public static int sumDigits(int number){
        int sum = 0;
        number = Math.abs(number);
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}