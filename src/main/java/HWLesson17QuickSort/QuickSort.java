package HWLesson17QuickSort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int arr[] = {12, 34, 54, 2, 5, 7, 33, 13, 41, 52, 76, 11, 10, 9};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    public static void quickSort(int arr[], int lo, int hi) {
        int index = partition(arr, lo, hi); //находим место выбранного элемената
        if (lo < index - 1) {
            quickSort(arr, lo, index - 1);
        }
        if (index < hi) {
            quickSort(arr, index, hi);
        }
    }

    private static int partition(int[] arr, int lo, int hi) {
        int i = lo, j = hi;
        int tmp;
        int pivot = arr[(lo + hi) / 2]; //середина
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                tmp = arr[i]; //просто меняем местами
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }
        return i;
    }
}
