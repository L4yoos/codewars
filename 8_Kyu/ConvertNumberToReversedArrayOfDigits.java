// https://www.codewars.com/kata/5583090cbe83f4fd8c000051

// Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
//
// Example (Input => Output):
// 35231 => [1,3,2,5,3]
// 0     => [0]

public class Kata {
    // 1st Solution
    public static int[] digitize(long n) {
        int size = String.valueOf(n).length();
        int[] arr = new int[size];
        int i = 0;
        while (n > 0) {
            long digit = n % 10;
            arr[i] = (int) digit;
            n /= 10;
            i++;
        }
        return arr;
    }
    // 2nd Solution
    public static int[] digitize(long n) {
        if (n == 0) return new int[]{0};

        long dumpNumber = n;
        int digits = 0;

        while (dumpNumber != 0) {
            dumpNumber /= 10;
            digits++;
        }

        int[] array = new int[digits];

        for (int i = 0; i < digits; i++) {
            array[i] = (int) (n % 10);
            n /= 10;
        }

        return array;
    }
}