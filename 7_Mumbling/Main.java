public class Accumul {
    public static String accum(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int counter = 1;

        for (char c : chars) {
            for (int i = 0; i < counter; i++) {
                if (i == 0) {
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(Character.toLowerCase(c));
                }
            }
            sb.append("-");
            counter++;
        }
        return sb.toString().substring(0, sb.length() - 1);
    }
}