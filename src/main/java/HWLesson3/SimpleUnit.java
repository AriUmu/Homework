package HWLesson3;

/**
 * Created by arina on 27.06.17.
 */
public class SimpleUnit {

    public static boolean assertEquals(String actual, String expected){
        boolean equals = actual.equals(expected);
        if(!equals){
            System.err.println("Test faild. Actual  " + actual + " expected " + expected);
        }
        return equals;
    }
    public static boolean assertNOEquals(String actual, String expected){
        boolean noequals = !actual.equals(expected);
        if(!noequals){
            System.err.println("Test faild. Actual  " + actual + " expected NO" + expected);
        }
        return noequals;
    }
}
