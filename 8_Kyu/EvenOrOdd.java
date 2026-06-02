// https://www.codewars.com/kata/53da3dbb4a5168369a0000fe

// Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.

public class Kata {
    // 1st Solution
    public static String evenOrOdd(int number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }
    // 2nd Solution
    public class Kata {
        public static String evenOrOdd(int number) {
            if (number % 2 == 0) return "Even";
            return "Odd";
        }
    }
}