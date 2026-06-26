import java.util.ArrayList;

class Solution{
    public static int solve(String s){
        if (s.length() % 2 != 0) return -1;
        ArrayList<Character> chars = new ArrayList<>();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == ')' && !chars.isEmpty() && chars.contains('(')) {
                chars.remove(chars.indexOf('('));
            } else {
                chars.add(c);
            }
        }
        int openCount = 0;
        int closeCount = 0;
        for (char c : chars) {
            if (c == '(') openCount++;
            if (c == ')') closeCount++;
        }
        count += (openCount / 2) + (closeCount / 2);
        if (openCount % 2 != 0) count += 2;
        return count;
    }
}