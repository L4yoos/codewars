// https://www.codewars.com/kata/57eaeb9578748ff92a000009

// Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.
//
// Return your answer as a number.

import java.util.List;

public class MixedSum {

    /*
     * Assume input will be only of Integer o String type
     */
    public int sum(List<?> mixed) {
        int sum = 0;
        for (int i = 0; i < mixed.size(); i++) {
            if (mixed.get(i) instanceof String) {
                String num = (String) mixed.get(i);
                sum += Integer.parseInt(num);
            } else {
                Integer num = (Integer) mixed.get(i);
                sum += num;
            }
        }
        return sum;
    }
}