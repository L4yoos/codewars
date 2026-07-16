// https://www.codewars.com/kata/577bd026df78c19bca0002c0

// Character recognition software is widely used to digitise printed texts. Thus the texts can be edited, searched and stored on a computer.
//
// When documents (especially pretty old ones written with a typewriter), are digitised character recognition softwares often make mistakes.
//
// Your task is correct the errors in the digitised text. You only have to handle the following mistakes:
//
// S is misinterpreted as 5
// O is misinterpreted as 0
// I is misinterpreted as 1
// The test cases contain numbers only by mistake.

public class Correct {
    //1st Solution
    public static String correct(String string) {
        Map<Character, Character> map = new HashMap<>();
        map.put('1', 'I');
        map.put('0', 'O');
        map.put('5', 'S');
        char[] chars = string.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                chars[i] = map.get(chars[i]);
            }
        }

        return new String(chars);
    }

    //2nd Solution
    public static String correct(String string) {
        return string.replace("1", "I").replace("0", "O").replace("5", "S");
    }
}