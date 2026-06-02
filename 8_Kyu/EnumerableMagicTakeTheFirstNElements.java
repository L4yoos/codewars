// https://www.codewars.com/kata/545afd0761aa4c3055001386

// Create a function that accepts a sequence and a non-negative integer n, and returns a sequence of the first n elements from it.
//
// If the sequence has fewer than n elements, return all of them.

public class ZywOo {
    //1st Solution
    public static int[] take(int[] arr, int n) {
        if (arr.length == 0 || n <= 0) {
            return new int[]{};
        }

        int limit = Math.min(arr.length, n);

        return Arrays.copyOfRange(arr, 0, limit);
    }
}