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
    //3nd Interesting Solution
    public static int countConsonants(final String str) {
        return (int) str.toLowerCase()
                .replaceAll("[^a-z]|(?=[aeiou]).", "")
                .chars()
                .distinct()
                .count();
    }
}