// https://www.codewars.com/kata/57cfdf34902f6ba3d300001e

// You will be given a list of strings. You must sort it alphabetically (case-sensitive, and based on the ASCII values of the chars) and then return the first value.
//
// The returned value must be a string, and have "***" between each of its letters.
//
// You should not remove or add elements from/to the array.

public class SortAndStar {
    //1st Solution
    public static String twoSort(String[] s) {
        Arrays.sort(s);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s[0].length(); i++) {
            sb.append(s[0].charAt(i));
            if (i < s[0].length() - 1) sb.append("***");
        }
        return sb.toString();
    }
    //2nd Solution
    public static String twoSort(String[] s) {
        Arrays.sort(s);
        return String.join("***", s[0].split(""));
    }
}