// https://www.codewars.com/kata/5769b3802ae6f8e4890009d2

// Take an array and remove every second element from the array. Always keep the first element and start removing with the next element.
//
// Example:
// ["Keep", "Remove", "Keep", "Remove", "Keep", ...] --> ["Keep", "Keep", "Keep", ...]
//
// None of the arrays will be empty, so you don't have to worry about that!

public class Kata {
    //1st Solution
    public static Object[] removeEveryOther(Object[] arr) {
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i += 2) {
            list.add(arr[i]);
        }
        return list.toArray();
    }
    //2nd Solution
    public static Object[] removeEveryOther(Object[] arr) {
        Object[] result = new Object[(arr.length + 1) / 2];

        for (int i = 0; i < result.length; i++) {
            result[i] = arr[i * 2];
        }

        return result;
    }
}