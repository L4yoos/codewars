// https://www.codewars.com/kata/5803753aab6c2099e600000e

// Did you ever want to know how many days old are you? Complete the function which returns your age in days. The birthdate is given in the following order: year, month, day. You can assume it is in the past.
//
// For example if today is 30 November 2015 then
//
// 2015, 11, 1 => "You are 29 days old"
// Suggestions on how to improve the kata are welcome!

public class Kata {
    public static String ageInDays(int year, int month, int day) {
        return String.format("You are %d days old", LocalDate.now().toEpochDay() - LocalDate.of(year, month, day).toEpochDay());
    }
}
