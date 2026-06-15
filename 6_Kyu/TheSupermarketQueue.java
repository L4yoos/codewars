public class Solution {
  //1st Solution
  public static int solveSuperMarketQueue(int[] customers, int n) {
    if (n == 1) {
      int sum = 0;
      for (int num : customers) {
        sum += num;
      }
      return sum;
    }
    int[] tills = new int[n];
    for (int i = 0; i < customers.length; i++) {
      int minIndex = 0;
      for (int j = 0; j < n; j++) {
        if (tills[j] < tills[minIndex]) {
          minIndex = j;
        }
      }
      tills[minIndex] += customers[i];
    }
    int max = 0;
    for (int num : tills) {
      if (max < num) {
        max = num;
      }
    }
    return max;
  }
}