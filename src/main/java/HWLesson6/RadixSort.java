package HWLesson6;

import java.util.*;

/**
 * Created by arina on 05.07.17.
 */
public class RadixSort {

    public static void main(String[] args) {
        int[] num = {16, 45, 75, 90, 85, 2, 24, 66,23,23,3,26,44};

        radixsort(num);
        radixSort1(num);

        System.out.println(Arrays.toString(num));

    }


    public static int[] random(int[] a){
        for(int num: a){
            System.out.print(num =  (int)(Math.random()*1000));
            System.out.print(" ");
        }
        return a;
    }

    public static Integer[] radixSort1(int[] array){ //движение побайтово
        int k = 4; // максимум 4 байти в числе
        int n = array.length; //количество элементов в массиве
        Integer[] b = new Integer[n];

        for (int i = 0; i < k; i++) {
            int[] arryOfElementKbyte = new int[256]; //массив содержащий iе байты элементов

            for (int j = 0; j < n ; j++) {
                int num = (array[j] >>(8 * i))& 255;
                arryOfElementKbyte[num]++;
            }

            for (int j = 1; j < 256; j++) {
                arryOfElementKbyte[j] += arryOfElementKbyte[j - 1];
            }

            for (int j = n -1; j >=0 ; j--) {
                b[ -- arryOfElementKbyte[(array[j] >>(8 * i))& 255]]= array[j];
            }

        }
        return b;
    }

    public static void radixsort(int[] input) {

        List<Integer>[] buckets = new ArrayList[input.length];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<Integer>();
        }

        // sort
        boolean flag = false;
        int tmp = -1, divisor = 1;
        while (!flag) {
            flag = true;
            // split input between lists
            for (Integer i : input) {
                tmp = i / divisor;
                buckets[tmp % 10].add(i);
                if (flag && tmp > 0) {
                    flag = false;
                }
            }
            // empty lists into input array
            int a = 0;
            for (int b = 0; b < 10; b++) {
                for (Integer i : buckets[b]) {
                    input[a++] = i;
                }
                buckets[b].clear();
            }
            // move to next digit
            divisor *= 10;
        }
    }
}
