// https://www.codewars.com/kata/5a3e1319b6486ac96f000049

// In this Kata your task will be to return the count of pairs that have consecutive numbers. The first pair consists of the first and second element of the input, the second pair is the next two elements (3rd and 4th), etc. If the input ends with an element without a pair, it should be ignored.
//
// For example, [1,2,5,8,-4,-3,7,6,5] has 3 such pairs. Candidate pairs are selected as follows: [(1,2), (5,8), (-4,-3), (7,6), 5].
//  the first pair is (1,2) and the numbers in the pair are consecutive; Count = 1
//  the second pair is (5,8) and the numbers are not consecutive.
//  the third pair is (-4,-3), consecutive. Count = 2.
//  the fourth pair is (7,6), also consecutive. Count = 3.
//  the last element has no pair, so we ignore.

class Solution{
    // 1st Solution
    public static int solve(int [] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i += 2) {
            if (i + 1 < arr.length) {
                if (arr[i] - arr[i+1] == -1 || arr[i] - arr[i+1] == 1) {
                    count++;
                }
            }
        }
        return count;
    }
    // 2nd Solution upgrade of first one
    public static int solve(int [] arr){
        int count = 0;
        for (int i = 0; i < arr.length - 1; i += 2) {
            if (Math.abs(arr[i] - arr[i+1]) == 1) {
                count++;
            }
        }
        return count;
    }
}