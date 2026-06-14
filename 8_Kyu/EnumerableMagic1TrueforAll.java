// https://www.codewars.com/kata/54598d1fcbae2ae05200112c

// Task
//  Create a method all which takes two params:
//  a sequence
//  a function
//  and returns true if the function in the params returns true for every element in the sequence. Otherwise, it should return false. If the sequence is empty, it should return true, since technically nothing failed the test.
// Example
//  all((1, 2, 3, 4, 5), greater_than_9) -> false
//  all((1, 2, 3, 4, 5), less_than_9)    -> True

public class Solution{
    //1st Solution
    public static boolean all(int[] list, IntPredicate predicate){
        for (int num : list) {
            if (!predicate.test(num)) {
                return false;
            }
        }
        return true;
    }
}