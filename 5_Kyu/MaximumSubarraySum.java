// https://www.codewars.com/kata/54521e9ec8e60bc4de000d6c

// The maximum sum subarray problem consists in finding the maximum sum of a contiguous subsequence in an array or list of integers:
//
// For example:
//
// Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
// Output: 6 (Sum of [4, -1, 2, 1])
// Easy case is when the list is made up of only positive numbers and the maximum sum is the sum of the whole array. If the list is made up of only negative numbers, return 0 instead. Your solution should be fast, it will be tested on very large arrays so slow solutions will time out.
//
// Empty list is considered to have zero greatest sum. Note that the empty list or array is also a valid sublist/subarray.


// Algorithm Kadane'a
public class Max {
    public static int sequence(int[] arr) {
        if (arr.length == 0) return 0;
        int currentSum = 0;
        int maxSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum <= 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }
}