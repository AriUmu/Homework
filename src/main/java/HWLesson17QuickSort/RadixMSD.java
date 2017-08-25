package HWLesson17QuickSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RadixMSD {
    public static void main(String[] args) {
        int[] arr = {23, 12, 45, 32, 11, 22, 1, 3, 45, 2, 5, 40};

        radixSort(arr);
        System.out.println(Arrays.toString(arr));


    }

    public static void radixSort(int[] a) {
        int m = 2;
        int n = a.length;
        List<Integer> aux[] = new ArrayList[10];


        for (int j = 0; j < n; j++) {

            if (aux[a[j] % 10] == null) {
                aux[a[j] % 10] = new ArrayList<>();
            }
            aux[a[j] % 10].add(a[j]);
        }

        for (int j = 0, l = 0; j < 10; j++) {

            if (!aux[j].isEmpty()) {
                while (!aux[j].isEmpty()) {
                    a[l] = aux[j].get(0);
                    aux[j].remove(0);
                    l++;
                }
            }

        }
        System.out.println(Arrays.toString(a));

//
//        for (int j = 0; j < n; j++) {
//
//            if (aux[a[j] / 10] == null) {
//                aux[a[j] / 10] = new ArrayList<>();
//            }
//            aux[a[j] / 10].add(a[j]);
//        }
//
//        for (int j = 0, l = 0; j < n; j++, l++) {
//            int k = 0;
//            while (!aux[l].isEmpty()) {
//                a[j] = aux[j].get(k);
//                j++;
//                k++;
//            }
//            System.out.println(Arrays.toString(a));
//        }
    }
}
