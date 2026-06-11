// https://www.codewars.com/kata/5a026a9cffe75fbace00007f

// You own a box-making company that can produce boxes in the shape of any regular polygon.
// Many customers use these boxes to transport circular objects - such as tin cans, glasses, tyres, or CDs.
//
// To assist them, you decided to print on every box the diameter of the largest circle that can fit inside the box.
//
//Input
// The number of equal sides of the regular polygon (sides ≥ 3),
// The length of each side of the polygon.
//Output
// Return the diameter of the largest circular item that can fit inside the polygon, accurate up to 0.001.
//
//Examples
// A box of 4 sides and a side length of 10 can hold a circular item of diameter 10.
// A box of 8 sides and a side length of 9 can hold a circular item of diameter approx. 21.72792206.

public class Polygon {
    int sides;
    int sideLength;

    public Polygon(int sides, int sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
    }

    public double circleDiameter(){
        return this.sideLength / (2 * Math.tan(Math.PI / this.sides)) * 2;
    }
}