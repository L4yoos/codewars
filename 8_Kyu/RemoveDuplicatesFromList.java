// https://www.codewars.com/kata/57a5b0dfcf1fa526bb000118

// Define a function that removes duplicates from an array of non negative numbers and returns it as a result.
//
// The order of the sequence has to stay the same.
//
// Examples:
//
// Input -> Output
// [1, 1, 2] -> [1, 2]
// [1, 2, 1, 1, 3, 2] -> [1, 2, 3]

public class Solution {
    //1st Solution
    public static int[] distinct(int[] array) {
        Set<Integer> nums = new LinkedHashSet<>();

        for (int num : array) {
            nums.add(num);
        }

        return nums.stream().mapToInt(i -> i).toArray();
    }

    //2nd Solution
    public static int[] distinct(int[] array) {
        return IntStream.of(array).distinct().toArray();
    }
}