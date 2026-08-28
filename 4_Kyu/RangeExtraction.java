// https://www.codewars.com/kata/51ba717bb08c1cd60f00002f

// A format for expressing an ordered list of integers is to use a comma separated list of either
//
// individual integers
// or a range of integers denoted by the starting integer separated from the end integer in the range by a dash, '-'. The range includes all integers in the interval including both endpoints. It is not considered a range unless it spans at least 3 numbers. For example "12,13,15-17"
// Complete the solution so that it takes a list of integers in increasing order and returns a correctly formatted string in the range format.
//
// Example:
//
// Solution.rangeExtraction(new int[] {-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20})
// # returns "-10--8,-6,-3-1,3-5,7-11,14,15,17-20"
// Courtesy of rosettacode.org

class Solution {
    public static String rangeExtraction(int[] arr) {
        List<String> parts = new ArrayList<>();
        int firstRange = 0;
        int lastRange = 0;
        int counter = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] + 1 == arr[i]) {
                if (counter == 0) {
                    firstRange = arr[i - 1];
                }
                lastRange = arr[i];
                counter++;
            } else {
                if (counter >= 2) {
                    parts.add(firstRange + "-" + lastRange);
                } else if (counter == 1) {
                    parts.add(firstRange + "," + lastRange);
                } else {
                    parts.add(String.valueOf(arr[i - 1]));
                }
                counter = 0;
            }
        }

        if (counter >= 2) {
            parts.add(firstRange + "-" + lastRange);
        } else if (counter == 1) {
            parts.add(firstRange + "," + lastRange);
        } else {
            parts.add(String.valueOf(arr[arr.length - 1]));
        }

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < parts.size(); j++) {
            sb.append(parts.get(j));
            if (j < parts.size() - 1) {
                sb.append(",");
            }
        }

        return sb.toString();
    }
}