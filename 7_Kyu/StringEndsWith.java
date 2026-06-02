// https://www.codewars.com/kata/51f2d1cafc9c0f745c00037d

// Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).

public class Kata {
    //1st Solution
    public static boolean solution(String str, String ending) {
        if (ending.length() == 0) return true;
        if (str.length() > 0 && ending.length() > 0) {
            if (ending.length() > str.length()) return false;
            str = str.substring(str.length() - ending.length(), str.length());
            return str.equals(ending);
        }
        return false;
    }
    //2nd Solution
    public static boolean solution(String str, String ending) {
        return str.endsWith(ending);
    }
}