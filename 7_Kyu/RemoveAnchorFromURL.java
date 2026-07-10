// https://www.codewars.com/kata/51f2b4448cadf20ed0000386

// Complete the function/method so that it returns the url with anything after the anchor (#) removed.
//
// Examples
// "www.codewars.com#about" --> "www.codewars.com"
// "www.codewars.com?page=1" -->"www.codewars.com?page=1"

public class Kata {
    //1st Solution
    public static String removeUrlAnchor(String url) {
        return url.replaceAll("#([a-z]*)\\d?", "");
    }
    //2nd Solution
    public static String removeUrlAnchor(String url) {
        return url.split("#")[0];
    }
}
