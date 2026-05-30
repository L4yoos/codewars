public class Kata{
    //1st Solution
    public static int countLettersAndDigits(String input){
        List<Character> uniqueChars = new ArrayList<>();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c) || Character.isDigit(c)) {
                uniqueChars.add(c);
            }
        }
        return uniqueChars.size();
    }
    //2nd Solution
    public static int countLettersAndDigits(String input){
        int n = 0;
        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) n++;
        }
        return n;
    }
}