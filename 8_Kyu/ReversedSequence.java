// https://www.codewars.com/kata/5a00e05cc374cb34d100000d

// Build a function that returns an array of integers from n to 1 where n>0.

public class Sequence{
    // 1st Solution
    public static int[] reverse(int n){
        int[] result = new int[n];
        int i = 0;
        while(n > 0) {
            result[i] = n;
            i++;
            n--;
        }
        return result;
    }
    // 2nd Solution
    public static int[] reverse(int n){
        int[] reverse = new int[n];
        for (int i = 0; i < n; i++) {
            reverse[i] = n-i;
        }
        return reverse;
    }
}