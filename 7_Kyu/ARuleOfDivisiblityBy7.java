// https://www.codewars.com/kata/55e6f5e58f7817808e00002e

// A number m of the form 10x + y is divisible by 7 if and only if x − 2y is divisible by 7. In other words, subtract twice the last digit from the number formed by the remaining digits. Continue to do this until a number known to be divisible by 7 is obtained; you can stop when this number has at most 2 digits because you are supposed to know if a number of at most 2 digits is divisible by 7 or not.
//
// The original number is divisible by 7 if and only if the last number obtained using this procedure is divisible by 7.

class DivSeven {
    //1st Solution
    public static long[] seven(long m) {
        int n = 0;
        while(m > 99) {
            m = (m / 10) - (m % 10) * 2;
            n++;
        }
        return new long[]{m, n};
    }
}