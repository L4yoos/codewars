// https://www.codewars.com/kata/515de9ae9dcfc28eb6000001

// Complete the solution so that it splits the string into strings of two characters in a list/array (depending on the language you use). If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').
//
// Examples:
//
// * 'abc' =>  ['ab', 'c_']
// * 'abcdef' => ['ab', 'cd', 'ef']

public class StringSplit {
    public static String[] solution(String s) {
        if (s == null || s.isEmpty()) {
            return new String[]{};
        }

        List<String> parts = new ArrayList<>();

        for (int i = 0; i < s.length(); i += 2) {
            if (i + 1 == s.length()) {
                parts.add(s.charAt(i) + "_");
            } else {
                parts.add(s.substring(i, i + 2));
            }
        }

        return parts.toArray(new String[]{});
    }
}