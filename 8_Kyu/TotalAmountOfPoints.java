public class TotalPoints {
    public static int points(String[] games) {
        int score = 0;
        for (String game : games) {
            int x = game.charAt(0) - '0';
            int y = game.charAt(2) - '0';
            if (x > y) {
                score += 3;
            } else if (x == y) {
                score += 1;
            }
        }
        return score;
    }
}