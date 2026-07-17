public class Solution {
    public static String replace(final String s) {
        return s.replaceAll("[aeiouAEIOU]", "!");
    }
    public static String replace(final String s) {
        return s.replaceAll("a|A|e|E|I|i|O|o|U|u", "!");
    }
}