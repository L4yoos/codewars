// https://www.codewars.com/kata/5748838ce2fab90b86001b1a

// Complete the function that calculates the area of the red square, when the length of the circular arc A is given as the input.
//
// Note: use the π value provided in your language (Math::PI, M_PI, math.pi, etc)

public class Geometry {
    //1st Solution
    public static double squareArea(double A) {
        double x = (2 * A) / Math.PI;
        return x * x;
    }
}