// https://www.codewars.com/kata/5296455e4fe0cdf2e000059f

// Write a function called that takes 3 values. The first and third values are numbers. The second value is a character.
//
// If the character is "+" , "-", "*", or "/", the function will return the result of the corresponding mathematical function on the two numbers.
// If the string is not one of the specified characters, the function should return null (throw an ArgumentException in C#).
// Keep in mind, you cannot divide by zero. If an attempt to divide by zero is made, return null / None (Python) / throw an ArgumentException (C#).
// (2,"+", 4) --> 6
// (6,"-", 1.5) --> 4.5
// (-4,"*", 8) --> -32
// (49,"/", -7) --> -7
// (8,"m", 2) --> null
// (4,"/",0) --> null

public class Calculator {
    public static Double calculate(double a, String operator, double b) {
        return switch(operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> {
                if (b == 0) yield null;
                yield a / b;
            }
            default -> null;
        };
    }
}