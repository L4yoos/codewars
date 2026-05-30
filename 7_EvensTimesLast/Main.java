public class Kata{
    //1st Solution
    public static int evenLast(int[] numbers){
        if (numbers.length == 0) return 0;
        int sum = 0;
        for (int i = 0; i < numbers.length; i += 2) {
            sum += numbers[i];
        }
        return sum * numbers[numbers.length - 1];
    }
}