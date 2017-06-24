package HWLesson2;

/**
 * Created by arina on 24.06.17.
 */
public class SimpleUnit {

    public static boolean assertEquals(int actual, int expected){
        boolean equals = actual == expected;
        if(!equals){
            System.err.println("Test faild. Actual  " + actual + " expected " + expected);
        }
        return equals;
    }
    public static boolean assertNOEquals(int actual, int expected){
        boolean noequals = actual != expected;
        if(!noequals){
            System.err.println("Test faild. Actual  " + actual + " expected NO" + expected);
        }
        return noequals;

    }


    public static boolean assertEquals(boolean prime, boolean b) {
        boolean equals = prime == b;
        if(!equals){
            System.err.println("Test faild. Actual  " + prime + " expected " + b);
        }
        return equals;
    }
    public static boolean assertNOEquals(boolean prime, boolean b) {
        boolean equals = prime != b;
        if(!equals){
            System.err.println("Test faild. Actual  " + prime + " expected NO" + b);
        }
        return equals;
    }
}
