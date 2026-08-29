import java.math.BigDecimal;
import java.math.RoundingMode;

public class Numbers {
    //1st Solution
    public static double TwoDecimalPlaces(double number) {
        BigDecimal bd = new BigDecimal(Double.toString(number));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    //2nd Solution
    public static double TwoDecimalPlaces(double number) {
        return Math.round(number * 100.0) / 100.0;
    }
    //3rd Solution
    public static double TwoDecimalPlaces(double number) {
        return Double.parseDouble(String.format("%.2f", number));
    }
}