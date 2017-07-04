package HWLesson5;

import java.util.Arrays;

/**
 * Created by arina on 03.07.17.
 */
public class Matrix {

    public static int[] counter(int[][] matrix){
        int[] row = new int[matrix.length]; //массива для суммы чисел в каждом ряду
        INNER: for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                if(matrix[i][j] > 0){
                    row[i] += matrix[i][j];
                }
                else{
                    row[i]= 0;
                    continue INNER;
                }
            }
        }

        System.out.println(Arrays.toString(row));
        return row;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,-6},
                {6,7,8},
        };
        int[][] matrix1 = {
                {1,2,3},
                {4,5,6},
                {6,7,8},
        };
        int[][] matrix3 = {
                {1,2,3,5,6,7},
                {4,5,-6,7,8},
                {6,7,8, 8},
                {6,-7,8},
                {6,7},
                {6},
        };

        counter(matrix);
        counter(matrix1);
        counter(matrix3);


    }
}
