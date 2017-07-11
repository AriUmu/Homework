package CodingBat;

import java.util.Arrays;

/**
 * Created by arina on 04.07.17.
 */
public class CodingBatArrays {   //Arrays -1
    public static boolean sameFirstLast(int[] nums) {
        return nums.length > 0 && nums[0] == nums[nums.length-1];
    }
    public static boolean commonEnd(int[] a, int[] b) {
        return a[0]==b[0] || a[a.length -1] == b[b.length-1];
    }

    public boolean only14(int[] nums) {
        for(int num : nums) {
            if(num != 1 && num != 4) return false;
        }
        return true;
    }

    public static boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length-1]== 6;
    }

    public static int[] reverse3(int[] nums) {
        int a = nums[0];
        nums[0] = nums[2];
        nums[2] = a;

        return nums;
    }
    public static int[] maxEnd3(int[] nums) {
        int max = 0;
        for(int i = 0; i < 3; i++){
            max = nums[0];
            if(nums[i] > max){
                max = nums[i];
            }
        }
        for(int i = 0; i < 3; i++){
            nums[i] = max;
        }
        return nums;
    }
    public static int sum2(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        return nums.length > 1? nums[0] + nums[1]:nums[0];
    }
    public static int[] middleWay(int[] a, int[] b) {
        int nums[] = new int[2];
        nums[0] = a[1];
        nums[1] = b[1];
        return nums;
    }
    public static boolean no23(int[] nums) {
        return nums[0]!=2 && nums[1]!=2 && nums[0]!=3 && nums[1]!= 3;
    }

    public static int[] makeLast(int[] nums) {
        int[] a = new int[2 * nums.length];
        a[a.length-1] = nums[nums.length-1];
        return a;
    }
    public static boolean double23(int[] nums) {
        if(nums.length == 2){
            return nums[0]==2 && nums[1]==2 ||nums[0]==3 && nums[1]==3;
        }
        return false;
    }

    public int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length; i ++){
            if (nums[i] == 2 && nums[i+1]==3){
                nums[i + 1]=0;
            }
        }
        return nums;
    }
    public static int[] makeMiddle(int[] nums) {
        int[] a = new int[2];
        a[0] = nums[nums.length/2 - 1];
        a[1] = nums[nums.length/2];
        return a;
    }

    public int[] midThree(int[] nums) {
        int[] a = new int[3];
        a[0] = nums[nums.length/2 - 1];
        a[1] = nums[nums.length/2];
        a[2] = nums[nums.length/2+1];
        return a;
    }










    public static void main(String[] args) {
        int [] array = {1,2,3};
        int [] nums = {2,3,4,5,6,7,89, 6};
        int [] a = {2,3,46,7,89, 6};
        int [] b = {23,3,4,5,6,7,89, 9};
        System.out.println(sameFirstLast(nums));
        System.out.println(commonEnd(a,b));
        System.out.println(firstLast6(nums));

        System.out.println(Arrays.toString(reverse3(array)));
        System.out.println(Arrays.toString(maxEnd3(array)));

        System.out.println(Arrays.toString(middleWay(a,b)));
        System.out.println(sum2(array));
        System.out.println(no23(b));

        System.out.println(Arrays.toString(makeLast(array)));
        System.out.println(double23(array));
        System.out.println(Arrays.toString(makeMiddle(nums)));








    }
}
