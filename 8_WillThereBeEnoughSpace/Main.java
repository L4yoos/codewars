public class Bob {
    public static int enough(int cap, int on, int wait){
        // your code here
        return cap > (on + wait) ? 0 : (wait + on) - cap;
    }
}