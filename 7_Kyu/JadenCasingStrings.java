public class JadenCase {
    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) return null;
        StringBuilder sb = new StringBuilder(phrase.length());
        boolean makeThisUp = true;
        for (int i = 0; i < phrase.length(); i++) {
            char c = phrase.charAt(i);

            if (c == ' ') {
                sb.append(c);
                makeThisUp = true;
            } else if (makeThisUp) {
                sb.append(Character.toUpperCase(c));
                makeThisUp = false;
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}