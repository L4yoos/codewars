// https://www.codewars.com/kata/56b29582461215098d00000f

// Issue
// Looks like some hoodlum plumber and his brother has been running around and damaging your stages again.
//
// The pipes connecting your level's stages together need to be fixed before you receive any more complaints.
//
// The pipes are correct when each pipe after the first is 1 more than the previous one.
//
// Task
// Given a list of unique numbers sorted in ascending order, return a new list so that the values increment by 1 for each index from the minimum value up to the maximum value (both included).
//
// Example
// Input:  1,3,5,6,7,8 Output: 1,2,3,4,5,6,7,8

public class Kata {
    public static int[] pipeFix(int[] numbers) {
        int[] arr = new int[numbers[numbers.length - 1] - numbers[0] + 1];
        int j = 0;
        for (int i = numbers[0]; i <= numbers[numbers.length - 1]; i++) {
            arr[j++] = i;
        }
        return arr;
    }
}