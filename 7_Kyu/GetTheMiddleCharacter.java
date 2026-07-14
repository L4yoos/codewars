// https://www.codewars.com/kata/56747fd5cb988479af000028

// You are going to be given a non-empty string. Your job is to return the middle character(s) of the string.
//
// If the string's length is odd, return the middle character.
// If the string's length is even, return the middle 2 characters.
// Examples:
// "test" --> "es"
// "testing" --> "t"
// "middle" --> "dd"
// "A" --> "A"

class Kata {
    //1st Solution
    public static String getMiddle(String word) {
        int half = word.length() / 2;
        StringBuilder sb = new StringBuilder();
        if (word.length() % 2 == 0) {
            sb.append(word.charAt(half - 1));
        }
        sb.append(word.charAt(half));

        return sb.toString();
    }

    //2nd Solution
    public static String getMiddle(String word) {
        int length = word.length();
        return word.substring((length - 1) / 2, (length / 2) + 1);
    }
}