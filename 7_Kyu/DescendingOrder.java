// https://www.codewars.com/kata/5467e4d82edf8bbf40000155

// Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.
//
// Examples:
// Input: 42145 Output: 54421
//
// Input: 145263 Output: 654321
//
// Input: 123456789 Output: 987654321

public class DescendingOrder {
    public static int sortDesc(final int num) {
        String number = "" + num;
        String[] parts = number.split("");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < parts.length; i++) {
            for (int j = i + 1; j < parts.length; j++) {
                int numberOne = Integer.parseInt(parts[i]);
                int numberTwo = Integer.parseInt(parts[j]);

                if (numberTwo > numberOne) {
                    String temp = parts[i];
                    parts[i] = parts[j];
                    parts[j] = temp;
                }
            }
            sb.append(parts[i]);
        }
        return Integer.parseInt(sb.toString());
    }
}