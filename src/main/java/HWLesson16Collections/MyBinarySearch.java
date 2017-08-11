package HWLesson16Collections;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class MyBinarySearch {

    public static void main(String[] args) {
        int a[] = new int[100];

        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100);
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        int num = 56;

        System.out.println(binarySearch(a, num));
        
    }


    static int binarySearch(int[] array, int key)
    {
        int lo = 0;
        int hi = array.length;

        while (true)
        {
            int mid = lo + (hi - lo) / 2;

            if (array[mid] == key)
                return mid;

            if(lo > hi){
                System.out.println("Число не найдено. Возможный индекс числа " + (mid-1));
                return mid-1;
            }

            if (array[mid] > key)
                hi = mid - 1;
            else
                lo = mid + 1;
        }
    }


}
