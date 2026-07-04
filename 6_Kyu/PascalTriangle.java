// https://www.codewars.com/kata/5226eb40316b56c8d500030f

// In mathematics, Pascal's triangle is a triangular array of the binomial coefficients expressed with formula
//
// (n / k) = n! / k! (n - k)!
//
// where n denotes a row of the triangle, and k is a position of a term in the row.
//
// Pascal's Triangle
//
// You can read Wikipedia article on Pascal's Triangle for more information.
//
// Task
// Write a function that, given a depth n, returns n top rows of Pascal's Triangle flattened into a one-dimensional list/array.
//
// Example:
// n = 1: [1]
// n = 2: [1,  1, 1]
// n = 4: [1,  1, 1,  1, 2, 1,  1, 3, 3, 1]
// Note
// Beware of overflow. Requested terms of a triangle are guaranteed to fit into the returned type, but depending on selected method of calculations, intermediate values can be larger.

public class PascalsTriangle {
    //1st Solution
    public static long[] generate(int n) {
        final List<Long> res = new ArrayList<Long>();
        for (int i = 0; i < n; i++) {
            long num = 1;
            for (int j = 0; j <= i; j++) {
                res.add(num);
                num = (num * (i - j)) / (j + 1);
            }
        }
        return res.stream().mapToLong(i -> i).toArray();
    }
    //2nd Solution
    public static long[] generate(int level) {
        List<List<Long>> triangle = new ArrayList<>();

        for (int row = 0; row < level; row++) {
            List<Long> currentRow = new ArrayList<>();
            for (int i = 0; i <= row; i++) {
                if (i == 0 || i == row) {
                    currentRow.add(1L);
                } else {
                    List<Long> prevRow = triangle.get(row - 1);
                    currentRow.add(prevRow.get(i) + prevRow.get(i - 1));
                }
            }
            triangle.add(currentRow);
        }

        int totalElements = 0;
        for (int row = 0; row < level; row++) {
            totalElements += (row + 1);
        }
        long[] arr = new long[totalElements];

        int index = 0;
        for (List<Long> row : triangle) {
            for (Long value : row) {
                arr[index] = value;
                index++;
            }
        }


        return arr;
    }
}