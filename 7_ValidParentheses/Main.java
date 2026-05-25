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