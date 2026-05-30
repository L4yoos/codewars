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