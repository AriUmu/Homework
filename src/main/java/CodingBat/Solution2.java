package CodingBat;

import java.util.Scanner;

public class Solution2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }


        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(a[i] > a[j]){
                    int tem = a[j];
                    a[j] = a[i];
                    a[i] = tem;
                }
            }
        }

        for (int mun : a){
            System.out.print(mun + " ");
        }

        System.out.println("Array is sorted in " + n + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length-1]);


    }
}

class DoSomething { public void go() {
    System.out.print("A"); try {
        stop();
    } catch (ArithmeticException e) {
        System.out.print("B"); }
        finally {
        System.out.print("C");
    }
    System.out.print("D"); }
    public void stop() {
    System.out.print("E");
    Object x = null; x.toString();
    System.out.print("F");
    }
    public static void main(String[] args) {
        new DoSomething().go(); }
}