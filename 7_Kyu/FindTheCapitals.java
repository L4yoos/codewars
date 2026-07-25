// https://www.codewars.com/kata/539ee3b6757843632d00026b

// Instructions
// Write a function that takes a single non-empty string of only lowercase and uppercase ascii letters (word) as its argument, and returns an ordered list containing the indices of all capital (uppercase) letters in the string.
//
// Example (Input --> Output)
// "CodEWaRs" --> [0,3,4,6]

import java.util.ArrayList;

public class Kata{
    //1st Solution
    public static int[] capitals(String s){
        List<Integer> letters = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                letters.add(i);
            }
        }

        return letters.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    //2nd Solution
    public static int[] capitals(String s){
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) list.add(i);
            i++;
        }
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    //3rd Solution
    public static int[] capitals(String s){
        int l = 0;
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                l++;
            }
        }
        int[] arr = new int[l];
        int i = 0;
        int arrIndex = 0;
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                arr[arrIndex] = i;
                arrIndex++;
            }
            i++;
        }
        return arr;
    }
}
