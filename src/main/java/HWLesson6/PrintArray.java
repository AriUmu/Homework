package HWLesson6;

import java.util.Arrays;

/**
 * Created by arina on 04.07.17.
 */
public class PrintArray {
    public static void main(String[] args) {

        int arrayA[] = {1,2,3,4,5};
        int[] arrayB = {};
        byte[] arrayC = {2,-3,4};
        short[] arrayS = {127, 56, 0};
        double[] arrayD = {123.5, 67.8754, 34.5677, 0,543, -34,3};
        float[] arrayF = {123.5f, 67.4f, 34.877f, 0, 543, -34,3};
        String [] str = {"lol","kek", "cheburek"};

        printArray(arrayA);
        printArray(arrayB);
        printArray(str);
        printArray(arrayC);
        printArray(arrayS);
        printArray(arrayD);
        printArray(arrayF);

    }

    public static String printArray (int[] o){
        System.out.print("[");
        for (int num : o) {
            System.out.print(num + " ");
        }
        System.out.println("]");
        return "";
    }

    public static String printArray (char[] o){
        System.out.print("[");
        for (char num : o) {
            System.out.print(num + " ");
        }
        System.out.println("]");
        return "";
    }


    public static String printArray (short[] o){
        System.out.print("[");
        for (short num : o) {
            System.out.print(num + " ");
        }
        System.out.println("]");
        return "";
    }

    public static String printArray (byte[] o){
        System.out.print("[");
        for (byte num : o) {
            System.out.print(num + " ");
        }
        System.out.println("]");
        return "";
    }

    public static String printArray (double[] o){
        System.out.print("[");
        for (double num : o) {
            System.out.print(num + " ");
        }
        System.out.println("]");
        return "";
    }
    public static String printArray (float[] o){
        System.out.print("[");
        for (float num : o) {
            System.out.print(num + " ");
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
