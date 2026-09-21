// https://www.codewars.com/kata/57f222ce69e09c3630000212

// For every good kata idea there seem to be quite a few bad ones!
//
// In this kata you need to check the provided array for good ideas 'good' and bad ideas 'bad'. If there are one or two good ideas, return 'Publish!', if there are more than 2 return 'I smell a series!'. If there are no good ideas, as is often the case, return 'Fail!'.

public class Kata {
    public static String well(String[] x) {
        int counter = 0;

        for (String part : x) {
            if (part.equals("good")) counter++;
        }

        return switch(counter) {
            case 0 -> "Fail!";
            case 1, 2 -> "Publish!";
            default -> "I smell a series!";
        };
    }
}