package HWLesson10;

/**
 * Created by arina on 13.07.17.
 */
public class SimpleUnit {
    public static boolean assertEquals(int actual, int expected){ //int
        boolean equals = expected == actual;
        if (!equals){
            System.out.println("Actual " + actual + ", expected " + expected);
        }
        return equals;
    }

    public static boolean assertNOEquals (int actual, int expected){
        boolean noequals = expected != actual;
        if(!noequals){
            System.out.println("Actual " + actual + ", expected " + expected);
        }
        return noequals;
    }

    public static boolean assertEquals(boolean actual, boolean expected){ //boolean
        boolean equals = expected == actual;
        if (!equals){
            System.out.println("Actual " + actual + ", expected " + expected);
        }
        return equals;
    }

    public static boolean assertNOEquals (boolean actual, boolean expected){
        boolean noequals = expected != actual;
        if(!noequals){
            System.out.println("Actual " + actual + ", expected " + expected);
        }
        return noequals;
    }

    public static boolean assertEquals(String actual, String expected){ //String
        boolean equals = expected.equals(actual);
        if (!equals){
            System.out.println("Actual " + actual + ", expected " + expected);
        }
        return equals;
    }

    public static boolean assertNOEquals (String actual, String expected){
        boolean noequals = !expected.equals(actual);
        if(!noequals){
            System.out.println("Actual " + actual + ", expected " + expected);
        }
        return noequals;
    }
}
