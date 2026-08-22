// https://www.codewars.com/kata/595aa94353e43a8746000120

// An ordered sequence of numbers from 1 to N is given. One number might have deleted from it, then the remaining numbers were mixed. Find the number that was deleted.
//
// Example:
//
// The starting array sequence is [1,2,3,4,5,6,7,8,9]
// The mixed array with one deleted number is [3,2,4,6,7,8,1,9]
// Your function should return the int 5.
// If no number was deleted from the starting array, your function should return the int 0.
//
// Note: N may be 1 or less (in the latter case, the first array will be []).

public class Kata {
    //1st Solution
    public static int findDeletedNumber(int[] arr, int[] mixedArr) {
        if (arr.length == mixedArr.length) return 0;

        Arrays.sort(mixedArr);

        for (int i = 0; i < mixedArr.length; i++) {
            if (mixedArr[i] != arr[i]) return arr[i];
        }

        return arr[arr.length - 1];
    }
    //2nd Solution
    public static int findDeletedNumber(int[] arr, int[] mixedArr) {
        int sum = 0;
        for (int number : arr) {
            sum += number;
        }
        int secondSum = 0;
        for (int num : mixedArr) {
            secondSum += num;
        }
        return sum - secondSum;
    }
}