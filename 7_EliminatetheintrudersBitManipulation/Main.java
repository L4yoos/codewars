public class SetBits {
    //1st Solution
    public static long eliminateUnsetBits(String number) {
        if (number.length() == 0) return 0L;
        StringBuilder sb = new StringBuilder();
        for (char c : number.toCharArray()) {
            if (c == '1') sb.append(c);
        }
        return Long.parseLong(sb.toString(), 2);
    }
    //2nd Solution
    public static long eliminateUnsetBits(String number) {
        number = number.replace("0", "");
        return number.isEmpty() ? 0L : Long.parseLong(number, 2);
    }
}