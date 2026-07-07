// https://www.codewars.com/kata/58989a079c70093f3e00008d

// A Cartesian coordinate system is a coordinate system that specifies each point uniquely in a plane by a pair of numerical coordinates, which are the signed distances to the point from two fixed perpendicular directed lines, measured in the same unit of length.
//
// The сoordinates of a point in the grid are written as (x,y). Each point in a coordinate system has eight neighboring points. Provided that the grid step = 1.
//
// It is necessary to write a function that takes a coordinate on the x-axis and y-axis and returns a list of all the neighboring points. Points inside your returned list need not be sorted (any order is valid).
//
// For Example:
//
// * Given x = 2 and y = 2, the function should return [(1,1),(1,2),(1,3),(2,1),(2,3),(3,1),(3,2),(3,3)];
// * Given x = 5 and y = 7, the function should return [(6,7),(6,6),(6,8),(4,7),(4,6),(4,8),(5,6),(5,8)].
// Note that the required data structure to contain the coordinates might not be the same between translations, so check the sample test cases provided.

public class Kata {
    //1st Solution
    public static int[][] cartesianNeighbor(int x, int y){
        int[][] neighbors = new int[8][2];
        int[][] directions = new int[][]
        {
                {0, 1},   // RIGHT
                {1, 0},   // UP
                {-1, 0},  // DOWN
                {0, -1},  // LEFT
                {1, 1},   // UP + RIGHT
                {1, -1},  // UP + LEfT
                {-1, 1},  // DOWN + RIGHT
                {-1, -1}, // DOWN + LEFT
        };
        int index = 0;
        for (int[] direction : directions) {
            int row = x + direction[0];
            int col = y + direction[1];

            neighbors[index] = new int[]{row, col};
            index++;
        }
        return neighbors;
    }
    //2nd Solution
    public static int[][] cartesianNeighbor(int x, int y){
        return new int[][]
                {
                        {x, y+1},
                        {x, y-1},
                        {x+1, y-1},
                        {x+1, y},
                        {x+1, y+1},
                        {x-1, y-1},
                        {x-1, y},
                        {x-1, y+1}
                };
    }
}