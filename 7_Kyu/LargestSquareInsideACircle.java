// https://www.codewars.com/kata/5887a6fe0cfe64850800161c

// Determine the area of the largest square that can fit inside a circle with radius r.

public class Kata {
    public static int areaLargestSquare(int r) {
        double a = (2 * r) / Math.sqrt(2);
        return (int) Math.round(a * a);
    }
}