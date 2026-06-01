public class Kata
{
    public static Object[] mean(char[] lst)
    {
        StringBuilder sb = new StringBuilder();
        double number = 0;
        for (char c : lst) {
            if (Character.isLetter(c)) {
                sb.append(c);
            } else {
                number += Character.getNumericValue(c);
            }
        }
        return new Object[]{number / 10, sb.toString()};
    }
}