// https://www.codewars.com/kata/5a023c426975981341000014

// You are given two interior angles (in degrees) of a triangle.
//
// Write a function to return the 3rd.

public class ThirdAngle {
    //1st Solution
    public static int otherAngle(int angle1, int angle2) {
        return 180 - (angle1 + angle2);
    }
}
