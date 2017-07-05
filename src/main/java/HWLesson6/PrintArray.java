package HWLesson6;

import java.util.Arrays;

/**
 * Created by arina on 04.07.17.
 */
public class PrintArray {
    public static void main(String[] args) {

        int a[] = {1,2,3,4,5};
        int[] b = {};
        byte[] c = {2,-3,4};
        short[] s = {127, 56, 0};
        double[] d = {123.5, 67.8754, 34.5677, 0,543, -34,3};
        float[] f = {123.5f, 67.4f, 34.877f, 0, 543, -34,3};
        String [] str = {"lol","kek", "cheburek"};

        printArray(a);
        printArray(b);
        printArray(str);
        printArray(c);
        printArray(s);
        printArray(d);
        printArray(f);


        Arrays.toString(a);
    }

    public static String printArray (int[] o){
        System.out.print("[");
        for (int i = 0; i <o.length ; i++) {
            System.out.print(o[i] + " ");
        }
        System.out.println("]");
        return "";
    }

    public static String printArray (char[] o){
        System.out.print("[");
        for (int i = 0; i <o.length ; i++) {
            System.out.print(o[i] + " ");
        }
        System.out.println("]");
        return "";
    }


    public static String printArray (short[] o){
        System.out.print("[");
        for (int i = 0; i <o.length ; i++) {
            System.out.print(o[i] + " ");
        }
        System.out.println("]");
        return "";
    }

    public static String printArray (byte[] o){
        System.out.print("[");
        for (int i = 0; i <o.length ; i++) {
            System.out.print(o[i] + " ");
        }
        System.out.println("]");
        return "";
    }

    public static String printArray (double[] o){
        System.out.print("[");
        for (int i = 0; i <o.length ; i++) {
            System.out.print(o[i] + " ");
        }
        System.out.println("]");
        return "";
    }
    public static String printArray (float[] o){
        System.out.print("[");
        for (int i = 0; i <o.length ; i++) {
            System.out.print(o[i] + " ");
        }
        System.out.println("]");
        return "";
    }


    public static String printArray (Object[] o){
        System.out.print("[");
        for (int i = 0; i <o.length ; i++) {
            System.out.print(o[i] + " ");
        }
        System.out.println("]");
        return "";
    }
}
