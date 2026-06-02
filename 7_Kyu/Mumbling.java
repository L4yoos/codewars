// https://www.codewars.com/kata/5667e8f4e3f572a8f2000039

// This time no story, no theory. The examples below show you how to write function accum:
//
// Examples:
//  accum("abcd") -> "A-Bb-Ccc-Dddd"
//  accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
//  accum("cwAt") -> "C-Ww-Aaa-Tttt"
// The parameter of accum is a string which includes only letters from a..z and A..Z.

public class Accumul {
    //1st Solution
    public static String accum(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int counter = 1;

        for (char c : chars) {
            for (int i = 0; i < counter; i++) {
                if (i == 0) {
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(Character.toLowerCase(c));
                }
            }
            sb.append("-");
            counter++;
        }
        return sb.toString().substring(0, sb.length() - 1);
    }
}