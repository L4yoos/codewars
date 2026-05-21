class Solution{
    // 1st Solution
    public static int solve(int [] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i += 2) {
            if (i + 1 < arr.length) {
                if (arr[i] - arr[i+1] == -1 || arr[i] - arr[i+1] == 1) {
                    count++;
                }
            }
        }
        return count;
    }
    // 2nd Solution upgrade of first one
    public static int solve(int [] arr){
        int count = 0;
        for (int i = 0; i < arr.length - 1; i += 2) {
            if (Math.abs(arr[i] - arr[i+1]) == 1) {
                count++;
            }
        }
        return count;
    }
}