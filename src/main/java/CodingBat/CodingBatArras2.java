package CodingBat;

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


    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int[] nums = {2, 3, 4, 5, 6, 7, 89, 6};
        int[] a = {2, 3, 46, 7, 89, 6};
        int[] b = {23, 3, 4, 5, 6, 7, 89, 9};


        System.out.println(countEvens(nums));

    }
}
