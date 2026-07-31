// https://www.codewars.com/kata/57a049e253ba33ac5e000212

// Your task is to write function factorial.
//
// https://en.wikipedia.org/wiki/Factorial

public class Factorial {
    public static long factorial(int n) {
        long number = 1L;
        for (int i = n; i > 1; i--) {
            number *= i;
        }
        return number;
    }
}
