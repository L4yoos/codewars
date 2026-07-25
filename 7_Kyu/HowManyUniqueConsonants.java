// https://www.codewars.com/kata/5a19226646d843de9000007d

// Complete the function that counts the number of unique consonants in a string (made up of printable ascii characters).
//
// Consonants are letters used in English other than "a", "e", "i", "o", "u".
//
// Remember, your function needs to return the number of unique consonants - disregarding duplicates. For example, if the string passed into the function reads "add", the function should return 1 rather than 2, since "d" is a duplicate.
//
// Similarly, the function should also disregard duplicate consonants of differing cases. For example, "Dad" passed into the function should return 1 as "d" and "D" are duplicates.

public class Kata {
    //1st Solution
    public static int countConsonants(final String str) {
        List<Character> letters = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (Character.toLowerCase(str.charAt(i)) != 'a' && Character.toLowerCase(str.charAt(i)) != 'e' && Character.toLowerCase(str.charAt(i)) != 'i' && Character.toLowerCase(str.charAt(i)) != 'o' && Character.toLowerCase(str.charAt(i)) != 'u') {
                if (Character.isLetter(str.charAt(i))) {
                    if (!letters.contains(Character.toLowerCase(str.charAt(i)))) {
                        letters.add(Character.toLowerCase(str.charAt(i)));
                    }
                }
            }
        }
        return letters.size();
    }
    //2nd Solution
    public static int countConsonants(final String str) {
        Set<Character> uniqueConsonants = new HashSet<>();
        String vowels = "aeiou";

        for (char c : str.toLowerCase().toCharArray()) {
            if (Character.isLetter(c) && vowels.indexOf(c) == -1) {
                uniqueConsonants.add(c);
            }
        }
        return uniqueConsonants.size();
    }
    //3rd Interesting Solution
    public static int countConsonants(final String str) {
        return (int) str.toLowerCase()
                .replaceAll("[^a-z]|(?=[aeiou]).", "")
                .chars()
                .distinct()
                .count();
    }
}