// https://www.codewars.com/kata/54ff3102c1bad923760001f3

// Return the number (count) of vowels in the given string.
//
// We will consider a, e, i, o, u as vowels for this Kata (but not y).
//
// The input string will only consist of lower case letters and/or spaces.

public class Vowels {
    //1st Solution
    public static int getCount(String str) {
        String vowels = "aeiou";
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c) && vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
    //2nd Solution
    public static int getCount(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
    //3rd Solution
    public static int getCount(String str) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int counter = 0;
        for (char c : str.toCharArray()) {
            if (vowels.contains(c)) {
                counter++;
            }
        }
        return counter;
    }
    //4th Solution
    public static int getCount(String str) {
        int l = str.length();
        str = str.replaceAll("a|e|i|o|u", "");
        int secL = str.length();
        return l - secL;
    }
    //5th Solution
    public static int getCount(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int count = 0;
        int length = str.length();

        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);

            switch (c) {
                case 'a', 'e', 'i', 'o', 'u' -> count++;
                default -> {}
            }
        }

        return count;
    }
}