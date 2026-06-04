// https://www.codewars.com/kata/55a996e0e8520afab9000055

// For this problem you must create a program that says who ate the last cookie.
//
// If the input is a string then "Zach" ate the cookie.
//
// If the input is a Double or an Integer then "Monica" ate the cookie.
//
// If the input is anything else "the dog" ate the cookie.
//
// The way to return the statement is: "Who ate the last cookie? It was (name)!"
//
// Ex: Input = "hi" --> Output = "Who ate the last cookie? It was Zach! (The reason you return Zach is because the input is a string)

public class Cookie {
    //1st Solution
    public static String cookie(Object x) {
        if (x instanceof String) {
            return "Who ate the last cookie? It was Zach!";
        } else if (x instanceof Integer || x instanceof Double) {
            return "Who ate the last cookie? It was Monica!";
        }
        return "Who ate the last cookie? It was the dog!";
    }
}