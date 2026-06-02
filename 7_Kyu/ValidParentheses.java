// https://www.codewars.com/kata/6411b91a5e71b915d237332d

// Write a function that takes a string of parentheses, and determines if the order of the parentheses is valid. The function should return true if the string is valid, and false if it's invalid.

public class Kata {
    //1st Solution
    public static boolean validParentheses(String parenStr) {
        if (parenStr.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack();

        for (char c : parenStr.toCharArray()) {
            if (c == '(' && stack.isEmpty()) {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
    //2nd Solution
    public static boolean validParentheses(String parenStr) {
        while(parenStr.contains("()")) {
            parenStr = parenStr.replace("()", "");
        }
        return parenStr == "";
    }
}