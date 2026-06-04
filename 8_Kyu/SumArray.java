// https://www.codewars.com/kata/53dc54212259ed3d4f00071c

// Write a function that takes an array of numbers and returns the sum of the numbers. The numbers can be negative. If the array is empty, return 0.

public class SumArray {
    //1st Solution
    public static double sum(double[] numbers) {
        double sum = 0.0;
        for (double num : numbers) {
            sum += num;
        }
        return sum;
    }
}