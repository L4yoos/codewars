// https://www.codewars.com/kata/57ee99a16c8df7b02d00045f

// Challenge:
//
// Given a two-dimensional array of integers, return the flattened version of the array with all the integers in the sorted (ascending) order.
//
// Example:
//
// Given [[3, 2, 1], [4, 6, 5], [], [9, 7, 8]], your function should return [1, 2, 3, 4, 5, 6, 7, 8, 9].

public class Kata {
    //1st Solution
    public static int[] flattenAndSort(int[][] array) {
        if (array.length == 0) return new int[]{};
        int length = 0;
        for (int[] numbers : array) {
            length += numbers.length;
        }
        int[] newArr = new int[length];
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                newArr[temp++] = array[i][j];
            }
        }
        Arrays.sort(newArr);
        return newArr;
    }
    //2nd Solution
    public static int[] flattenAndSort(int[][] array) {
        if (array.length == 0) return new int[]{};
        List<Integer> numbers = new ArrayList<>();
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                numbers.add(array[i][j]);
            }
        }
        Collections.sort(numbers);
        return numbers.stream().mapToInt(i -> i).toArray();
    }
}
