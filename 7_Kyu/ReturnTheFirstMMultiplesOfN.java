// https://www.codewars.com/kata/593c9175933500f33400003e

// Implement a function that takes two numbers m and n and returns an array of the first m multiples of the real number n. Assume that m is a positive integer.
//
// Ex.
//
// (3, 5.0) --> [5.0, 10.0, 15.0]

public class Kata {
    public static int[] multiples(int m, int n) {
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = n * (i + 1);
        }
        return arr;
    }
}