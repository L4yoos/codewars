// https://www.codewars.com/kata/56582133c932d8239900002e

// Complete the function to find the count of the most frequent item of an array. You can assume that input is an array of integers. For an empty array return 0
//
// Example
// input array: [3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3]
// ouptut: 5
// The most frequent number in the array is -1 and it occurs 5 times.

public class Kata {
    public static int mostFrequentItemCount(int[] collection) {
        if (collection == null || collection.length == 0) return 0;

        int counter = 1;
        int maxCount = 1;
        Arrays.sort(collection);
        for (int i = 1; i < collection.length; i++) {
            if (collection[i] == collection[i - 1]) {
                counter++;
            } else {
                counter = 1;
            }

            if (counter > maxCount) maxCount = counter;
        }
        return maxCount;
    }
}