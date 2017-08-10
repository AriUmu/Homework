package HWLesson6;

import java.util.*;

/**
 * Created by arina on 05.07.17.
 */
public class RadixSort {

    public static void main(String[] args) {
        int[] num = new int[500];
        random(num);

       // System.out.println(Arrays.toString(num));
       // System.out.println();

        long start = System.nanoTime();
        radixsort(num);
        long finish = System.nanoTime();
        System.out.println("Time RadixSort " + (finish - start)); //2539580

        start = System.nanoTime();
        Arrays.sort(num);
        finish = System.nanoTime();

        System.out.println("Time QuikSort " + (finish - start)); //490259

        System.out.println(Arrays.toString(num));

    }


    public static int[] random(int[] arr){
      Random r = new Random();
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = r.nextInt(100);
        }
      return arr;
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

    public static void radixsort(int[] input) {  //не моя

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
