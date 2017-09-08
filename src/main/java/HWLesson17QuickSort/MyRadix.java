package HWLesson17QuickSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MyRadix {

    public static final int MAX = 100;

    public static void main(String[] args) {
        int[] a = new int[MAX];
        Random r = new Random();

        for (int i = 0; i < MAX; i++) {
            a[i] = r.nextInt(1000);
        }


        System.out.println(Arrays.toString(a));

        sortRadix(a);
        System.out.println();

        System.out.println(Arrays.toString(a)); //я красава))
    }

    private static void sortRadix(int[] a) {
        int[] aux = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            aux[i] = a[i];
        }

        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }


        int count = 0;
        while (max > 0) {
            max = max / 10;
            count++;
        }

        for (int i = 0; i < count; i++) {
            List<Integer>[] array = new List[10];

            for (int j = 0; j < aux.length; j++) {
                int num = (int) (aux[j] / Math.pow(10, i)) % 10;  //номер ячейки

                if (array[num] == null) {
                    array[num] = new ArrayList<>();
                    array[num].add(aux[j]);
                } else {
                    array[num].add(aux[j]);
                }
            }

            for (int j = 0; j < aux.length; ) { //обратно перекидываем в массив aux  отсортированные числа
                for (List<Integer> element : array) {
                    for (Integer number : element) {
                        aux[j] = number;
                        j++;
                    }
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            a[i] = aux[i];
        }

    }

}
