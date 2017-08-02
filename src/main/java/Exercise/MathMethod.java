package Exercise;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MathMethod {

    static double sqrting(int x){
        assert x > 0 : x;
        double y = Math.sqrt(x);
        return y;
    }

    public static void main(String[] args) {
        Logger.getGlobal().info("File -> Open menu item selected");

        Logger.getGlobal().setLevel(Level.OFF);




    }
}

class MyLogger{
    private static final Logger myLogger = Logger.getLogger("com.mycompany");
}