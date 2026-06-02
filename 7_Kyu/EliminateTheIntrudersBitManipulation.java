// https://www.codewars.com/kata/5a0d38c9697598b67a000041

// You are given a string representing a number in binary. Your task is to delete all the unset bits in this string and return the corresponding number (after keeping only the '1's).

public class SetBits {
    //1st Solution
    public static long eliminateUnsetBits(String number) {
        if (number.length() == 0) return 0L;
        StringBuilder sb = new StringBuilder();
        for (char c : number.toCharArray()) {
            if (c == '1') sb.append(c);
        }
        return Long.parseLong(sb.toString(), 2);
    }
    //2nd Solution
    public static long eliminateUnsetBits(String number) {
        number = number.replace("0", "");
        return number.isEmpty() ? 0L : Long.parseLong(number, 2);
    }
}