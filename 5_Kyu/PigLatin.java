// https://www.codewars.com/kata/520b9d2ad5c005041100000f

// Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
//
// Examples
// pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
// pigIt('Hello world !');     // elloHay orldway !

public class PigLatin {
    //1st Solution
    public static String pigIt(String str) {
        StringBuilder sb = new StringBuilder();
        String[] parts = str.split(" ");
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].matches("[a-zA-Z]+")) {
                sb.append(parts[i].substring(1)).append(parts[i].charAt(0)).append("ay");
            } else {
                sb.append(parts[i]);
            }

            if (i != parts.length - 1) sb.append(' ');
        }
        return sb.toString();
    }
    //2nd Solution
    public static String pigIt(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }
}