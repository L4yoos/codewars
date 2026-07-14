// https://www.codewars.com/kata/57f780909f7e8e3183000078

// Given a non-empty array of integers, return the result of multiplying the values together in order. Example:
//
// [1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24

public class Kata{
    //1st Solution
    public static int grow(int[] x){
        int sum = 1;
        for (int num : x) {
            sum *= num;
        }
        return sum;
    }

    //2nd Solution
    public static int grow(int[] x){
        return Arrays.stream(x)
                .reduce(1, (a, b) -> a * b);
    }
}