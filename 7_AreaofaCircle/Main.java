public class Circle {
    //1st Solution
    public static double area(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        return Math.PI * (radius * radius);
    }
}