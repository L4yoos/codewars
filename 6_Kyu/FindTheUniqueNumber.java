// https://www.codewars.com/kata/585d7d5adb20cf33cb000235

// There is an array with some numbers. All numbers are equal except for one. Try to find it!
//
// Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
// Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
// It’s guaranteed that array contains at least 3 numbers.
//
// The tests contain some very huge arrays, so think about performance.
//
// This is the first kata in series:
//
// Find the unique number (this kata)
// Find the unique string
// Find The Unique

public class Kata {
    //1st Solution
    public static double findUniq(double arr[]) {
        Set<Double> seen = new HashSet<>();
        Set<Double> duplicates = new HashSet<>();
        for (double num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        for (double num : seen) {
            if (!duplicates.contains(num)) {
                return num;
            }
        }
        return 0.0;
    }
    //2nd Solution
    public static double findUniq(double arr[]) {
        double number = arr[0] == arr[1] ? arr[0] : arr[2];
        for (double num : arr) {
            if (num != number) return num;
        }
        return number;
    }
}