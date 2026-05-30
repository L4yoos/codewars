public class SimpleFun {
    public static int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
        int day = 1;
        int height = upSpeed;
        while (height < desiredHeight) {
            height -= downSpeed;
            height += upSpeed;
            day++;
            if (height == desiredHeight) {
                break;
            }
        }
        return day;
    }
}