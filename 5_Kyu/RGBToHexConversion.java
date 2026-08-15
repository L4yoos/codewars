// https://www.codewars.com/kata/513e08acc600c94f01000001

// The rgb function is incomplete. Complete it so that passing in RGB decimal values will result in a hexadecimal representation being returned. Valid decimal values for RGB are 0 - 255. Any values that fall out of that range must be rounded to the closest valid value.
//
// Note: Your answer should always be 6 characters long, the shorthand with 3 will not work here.
//
// Examples (input --> output):
// 255, 255, 255 --> "FFFFFF"
// 255, 255, 300 --> "FFFFFF"
// 0, 0, 0       --> "000000"
// 148, 0, 211   --> "9400D3"

public class RgbToHex {
    public static String rgb(int r, int g, int b) {
        return getValue(r) +
                getValue(g) +
                getValue(b);
    }

    private static String getValue(int number) {
        if (number < 0) {
            return "00";
        } else if (number <= 16) {
            return "0" + Integer.toString(number, 16).toUpperCase();
        } else if (number > 255) {
            return "FF";
        } else {
            return Integer.toString(number, 16).toUpperCase();
        }
    }
}
