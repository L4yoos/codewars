// https://www.codewars.com/kata/5738f5ea9545204cec000155

// Bob is a lazy man.
//
// He needs you to create a method that can determine how many letters (both uppercase and lowercase ASCII letters) and digits are in a given string.

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