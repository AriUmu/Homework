package HWLesson17QuickSort;

import java.util.Arrays;

public class RadixSort {
    private static final int BITS_PER_BYTE = 8;

    public static void main(String[] args) {

        int a[] = {23,54,65,12,34,21,35,67,87,11,22,33,4,5,6,7};
        radixSort(a);
        System.out.println(Arrays.toString(a));

    }


    public static void radixSort(int[] a){
        int BITS = 32;
        int R = 1 << BITS_PER_BYTE; //сдвигаем по 8 битов 1_00000000
        int MASK = R - 1; //маска 0FF = 0хFFFFFFFF
        int w = BITS/BITS_PER_BYTE; //сколько раз нужно сдвинуть, int = 4 times

        int n = a.length;
        int[] aux = new int[n]; //новый вспомогательный массив

        for (int d = 0; d < w; d++) {
            //вычисляем количество частот появления
            int[] count = new int[R + 1];//8 bits новый массив размером с размерностью значений в 1 разряде

            for (int i = 0; i < n ; i++) {
                int c = (a[i] >> BITS_PER_BYTE*d) & MASK; //индекс где хранится младший разряд
                count[c + 1]++;
            }

            for (int r = 0; r < R; r++)
                count[r+1] += count[r];

            if (d == w-1) { //если d = 3 очень больших чисел
                int shift1 = count[R] - count[R/2];
                int shift2 = count[R/2];
                for (int r = 0; r < R/2; r++)
                    count[r] += shift1;
                for (int r = R/2; r < R; r++)
                    count[r] -= shift2;
            }

            // move data
            for (int i = 0; i < n; i++) {
                int c = (a[i] >> BITS_PER_BYTE*d) & MASK;
                aux[count[c]++] = a[i];
            }

            // copy back
            for (int i = 0; i < n; i++)
                a[i] = aux[i];

        }
    }

}














