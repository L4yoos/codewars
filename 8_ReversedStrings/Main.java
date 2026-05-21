public class Kata {
    // 1st Solution
    public static String solution(String str) {
        return new StringBuilder().append(str).reverse().toString();
    }
    // 2nd Solution
    public static String solution(String str) {
        String reverse = "";
        char[] chrArray = str.toCharArray();
        for (int i = chrArray.length - 1; i >= 0; i--) {
            reverse += chrArray[i];
        }
        return reverse;
    }
    // 3nd Solution
    public static String solution(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }
}