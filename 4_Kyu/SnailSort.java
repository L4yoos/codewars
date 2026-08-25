// https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1

// Snail Sort
// Given an n x n array, return the array elements arranged from outermost elements to the middle element, traveling clockwise.
//
// array = [[1,2,3],
//         [4,5,6],
//         [7,8,9]]
// snail(array) #=> [1,2,3,6,9,8,7,4,5]
// For better understanding, please follow the numbers of the next array consecutively:
//
// array = [[1,2,3],
//         [8,9,4],
//         [7,6,5]]
// snail(array) #=> [1,2,3,4,5,6,7,8,9]
// This image will illustrate things more clearly:
//
//
// NOTE: The idea is not sort the elements from the lowest value to the highest; the idea is to traverse the 2-d array in a clockwise snailshell pattern.
//
// NOTE 2: The 0x0 (empty matrix) is represented as en empty array inside an array [[]].

public class Snail {
    public static int[] snail(int[][] array) {
        if (array.length == 0 || array[0].length == 0) return new int[]{};

        int l = array.length;
        int[] result = new int[l * l];

        // [0][0], [0][1], [0][2]
        // [1][0], [1][1], [1][2]
        // [2][0], [2][1], [2][2]

        int top = 0;
        int right = l - 1;
        int left = 0;
        int bottom = l - 1;

        int index = 0;

        while (top <= bottom && left <= right) {
            // Right
            for (int i = left; i <= right; i++) {
                result[index++] = array[top][i];
            }
            top++;

            // Bottom
            for (int j = top; j <= bottom; j++) {
                result[index++] = array[j][right];
            }
            right--;

            if (top <= bottom) {
                // Left
                for (int j = right; j >= left; j--) {
                    result[index++] = array[bottom][j];
                }
                bottom--;
            }

            if (left <= right) {
                // Up
                for (int i = bottom; i >= top; i--) {
                    result[index++] = array[i][left];
                }
                left++;
            }
        }
        return result;
    }
}