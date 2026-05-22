public class SmallestIntegerFinder {
    // 1st Solution
    public static int findSmallestInt(int[] args) {
        Arrays.sort(args);
        return args[0];
    }
    // 2nd Solution
    public static int findSmallestInt(int[] args) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < args.length; i++) {
            if (args[i] < min) {
                min = args[i];
            }
        }
        return min;
    }
}