// https://www.codewars.com/kata/5672a98bdbdd995fad00000f

// Rules of the "Rock, Paper, Scissors" game are:
//
// Rock beats Scissors,
// Scissors beat Paper,
// Paper beats Rock,
// Two identical moves are a draw.
// Let's play! You will be given valid moves of two Rock, Paper, Scissors players, and have to return which player won: "Player 1 won!" for player 1, and "Player 2 won!" for player 2. In case of a draw return Draw!.
//
// Examples:
//  "scissors",     "paper"     --> "Player 1 won!"
//  "scissors",     "rock"      --> "Player 2 won!"
//  "paper",        "paper"     --> "Draw!"

public class Kata {
    public static String rps(String p1, String p2) {
        if (p1.equals(p2)) return "Draw!";
        else if (p1.equals("rock") && p2.equals("scissors")) return "Player 1 won!";
        else if (p1.equals("scissors") && p2.equals("paper")) return "Player 1 won!";
        else if (p1.equals("paper") && p2.equals("rock")) return "Player 1 won!";
        return "Player 2 won!";
    }
}
