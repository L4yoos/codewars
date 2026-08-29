// https://www.codewars.com/kata/583989556754d6f4c700018e

// Given 3 positive parameters a, b, limit, return all positive numbers that are a multiple of both a and b up to and including limit.
//
// Examples
// 1, 5, 15 --> [5, 10, 15]
// 3, 5, 15 --> [15]
// 3, 5, 40 --> [15, 30]
// 2, 4, 40 --> [4, 8, 12, 16, 20, 24, 28, 32, 36, 40]

public class Solution {
    public static List<Integer> findMultiples(int a, int b, int limit) {
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= limit; i++) {
            if (i % a == 0 & i % b == 0) {
                result.add(i);
            }
        }

        return result;
    }
}