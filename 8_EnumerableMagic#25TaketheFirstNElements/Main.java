import java.util.*;

public class ZywOo {
    public static int[] take(int[] arr, int n) {
        if (arr.length == 0 || n <= 0) {
            return new int[]{};
        }

        int limit = Math.min(arr.length, n);

        return Arrays.copyOfRange(arr, 0, limit);
    }
}