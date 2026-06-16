// https://www.codewars.com/kata/5aa1bcda373c2eb596000112

// Task
//  Given an array/list of integers, find the maximum sum of 3 DISTINCT array elements.
//
// Notes:
//  array size is at least 3 .
//  array elements can be zero or negative
// Repetition of numbers in the array/list could occur , So (duplications are not included when summing).
//  Input >> Output Examples
//  maxTriSum ({3,2,6,8,2,3}) ==> return (17)
//  Best triplet = {6,8,3}, its sum is 17
//  maxTriSum ({2,1,8,0,6,4,8,6,2,4}) ==> return (18)
//  Best triplet = {8, 6, 4} , its sum is 18.
//  maxTriSum ({-7,12,-7,29,-5,0,-7,0,0,29}) ==> return (41)
//  Best triplet = {12 , 29 , 0} , its sum is 41
//  See my other kata:
//  Playing with Numbers Series
//
//  Playing With Lists/Arrays Series
//
//  For More Enjoyable Katas
//
//  Enjoy Learning !! ~ Zizou

public class Solution
{
    //1st Solution
    public static int maxTriSum (int[] numbers)
    {
        ArrayList<Integer> uniqNums = new ArrayList<>();
        for (int num : numbers) {
            if (!uniqNums.contains(num)) {
                uniqNums.add(num);
            }
        }
        Collections.sort(uniqNums);
        Collections.reverse(uniqNums);
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += uniqNums.get(i);
        }
        return sum;
    }
}