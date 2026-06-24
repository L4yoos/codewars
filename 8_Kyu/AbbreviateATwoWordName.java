// https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/java

// Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
//
// The output should be two capital letters with a dot separating them.
//
// It should look like this:
//
// Sam Harris => S.H
//
// patrick feeney => P.F

public class AbbreviateTwoWords {
    // 1st Solution
    public static String abbrevName(String name) {
        String[] parts = name.split(" ");
        return parts[0].substring(0, 1).toUpperCase() + "." + parts[1].substring(0, 1).toUpperCase();
    }
    // 2nd Solution
    public static String abbrevName(String name) {
        String[] parts = name.split(" ");
        return (parts[0].charAt(0) + "." + parts[1].charAt(0)).toUpperCase();
    }
}