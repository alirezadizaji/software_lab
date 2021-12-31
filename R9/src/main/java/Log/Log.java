package Log;

/**
 * Created by mohammad hosein on 6/29/2015.
 */
public class Log {
    private static boolean logOn = false;
    public void turnOn() {
        logOn = true;
    }
    public void turnOff() {
        logOn = false;
    }
    public static void print(String s)
    {
        if (logOn)
            System.out.println(s);
    }
}
