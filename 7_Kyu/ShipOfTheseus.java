// https://www.codewars.com/kata/69b83710b26939b35fd10429

// The "Ship of Theseus" is a classic philosophical thought experiment about identity over time.
//
// It asks: if every part of a ship is gradually replaced, one piece at a time, is it still the same ship in the end?
//
// This kata turns that idea into a simple validation problem.
//
// A ship is represented by a matrix of states.
//
// Each row shows the ship at a different moment in time.
//
// The ship is considered to remain the same only if, between every two consecutive rows, exactly one part of the ship has changed.
//
// Rules
// All rows must have the same length.
// Rows must be compared position by position.
// Between one row and the next, exactly one element (ship part) must be different.
// If any transition changes zero elements or more than one element, the process is invalid.
// Return true if the whole process is valid, otherwise return false.
//
// If the matrix has 0 or 1 row, return true.
//
// Example
// Initial values:
//
// [
//   ["a", "b", "c"],
//   ["x", "b", "c"],
//   ["x", "y", "c"],
//   ["x", "y", "z"]
// ]
// Step-by-step
// ["a", "b", "c"] -> ["x", "b", "c"] -> 1 change
// ["x", "b", "c"] -> ["x", "y", "c"] -> 1 change
// ["x", "y", "c"] -> ["x", "y", "z"] -> 1 change
// Result
// true
// Another example
// Initial values:
//
// [
//   ["a", "b", "c"],
//   ["x", "y", "c"]
// ]
// Step-by-step
// ["a", "b", "c"] -> ["x", "y", "c"] -> 2 changes
// Result
// false
// Different row lengths example
// Initial values:
//
// [
//   ["a", "b", "c"],
//   ["x", "b"]
// ]
// Step-by-step
// The rows have different lengths, so the process is invalid.
// Result
// false

public class Solution {
    public static boolean shipOfTheseus(String[][] ship) {
        if (ship.length == 0) return true;
        int counter = 0;
        for (int i = 1; i < ship.length; i++) {
            if (ship[i].length != ship[i - 1].length) return false;

            for (int j = 0; j < ship[i].length; j++) {
                if (!ship[i][j].equals(ship[i - 1][j])) counter++;
            }
        }
        return ship.length - counter == 1;
    }
}