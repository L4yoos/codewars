// https://www.codewars.com/kata/5259b20d6021e9e14c0010d4

// Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.
//
// Examples
// "This is an example!" ==> "sihT si na !elpmaxe"
// "double  spaces"      ==> "elbuod  secaps"

public class Kata {
    public static String reverseWords(final String original) {
        if (original.isEmpty()) return original;
        String[] parts = original.split(" ", -1);

        StringBuilder finalSb = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            StringBuilder sb = new StringBuilder(parts[i]);
            finalSb.append(sb.reverse());
            if (i < parts.length - 1) {
                finalSb.append(" ");
            }
        }

        return finalSb.toString();
    }
}