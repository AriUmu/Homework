package CodingBat;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arina on 04.07.17.
 */
public class CodingBatArras2 { //Arrays 2
    public static int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static boolean no14(int[] nums) {
        boolean one = true;
        boolean four = true;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] == 1){
                one = false;
            }
            if(nums[i] == 4){
                four = false;
            }
        }
        return (one|four);
    }

    public static int[] shiftLeft(int[] nums) {
        if(nums.length > 0){
            int temp = nums[0];
            for(int i = 1; i < nums.length; i++){
                nums[i-1] = nums[i];
            }
            nums[nums.length-1] = temp;
            return nums;
        }
        return nums;
    }

    public static int[] withoutTen(int[] nums) {
        int[] arr = new int[nums.length];
        int num = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 10){
                arr[num++] = nums[i];
            }
        }
        return arr;
    }

    public static int bigDiff(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for(int i = 1; i < nums.length; i++){
            int max1 = Math.max(nums[i-1], nums[i]);
            if(max1 > max){
                max = max1;
            }
            int min1 = Math.min(nums[i-1], nums[i]);
            if(min1 < min){
                min = min1;
            }
        }
        return max - min;
    }






    public static void main(String[] args) {
        int[] array = {1, 2, 4, 3, 1, 5};
        int[] nums = {2, 3, 4, 5, 6, 7, 89, 6};
        int[] a = {2, 3, 46, 7, 89, 6};
        int[] b = {23, 3, 4, 5, 6, 7, 89, 9};


    //    System.out.println(countEvens(nums));
        System.out.println(bigDiff(array));


    }
}
