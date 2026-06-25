// https://www.codewars.com/kata/5702e2f380b8c86df3000003

// Finish this kata with the unit tests as your only help!
//
// Task
// Implement:
//  Calculator.getTotalArea()
// Define the different shapes: Square, Rectangle, Circle and Triangle

public class Calculator {
    public double getTotalArea(Shape... shapes) {
        double sum = 0.0;
        for (Shape shape : shapes) {
            sum += shape.getTotalArea();
        }
        return Math.round(sum * 100.0) / 100.0;
    }
}

interface Shape {
    double getTotalArea();
}

class Triangle implements Shape {
    private double triangleBase;
    private double triangleHeight;

    public Triangle(double triangleBase, double triangleHeight) {
        this.triangleBase = triangleBase;
        this.triangleHeight = triangleHeight;
    }

    @Override
    public double getTotalArea() {
        return (this.triangleBase * this.triangleHeight) / 2.0;
    }
}

class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getTotalArea() {
        return this.side * this.side;
    }
}

class Rectangle implements Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getTotalArea() {
        return this.height * this.width;
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getTotalArea() {
        return (this.radius * this.radius) * Math.PI;
    }
}