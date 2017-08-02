package CodingBat;

import java.util.Arrays;

/**
 * Created by arina on 04.07.17.
 */
public class CodingBatArrays {   //Arrays -1
    public static boolean sameFirstLast(int[] nums) {
        return nums.length > 0 && nums[0] == nums[nums.length - 1];
    }

    public static boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    public boolean only14(int[] nums) {
        for (int num : nums) {
            if (num != 1 && num != 4) return false;
        }
        return true;
    }

    public static boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }

    public static int[] reverse3(int[] nums) {
        int a = nums[0];
        nums[0] = nums[2];
        nums[2] = a;

        return nums;
    }

    public static int[] maxEnd3(int[] nums) {
        int max = 0;
        for (int i = 0; i < 3; i++) {
            max = nums[0];
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        for (int i = 0; i < 3; i++) {
            nums[i] = max;
        }
        return nums;
    }

    public static int sum2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        return nums.length > 1 ? nums[0] + nums[1] : nums[0];
    }

    public static int[] middleWay(int[] a, int[] b) {
        int nums[] = new int[2];
        nums[0] = a[1];
        nums[1] = b[1];
        return nums;
    }

    public static boolean no23(int[] nums) {
        return nums[0] != 2 && nums[1] != 2 && nums[0] != 3 && nums[1] != 3;
    }

    public static int[] makeLast(int[] nums) {
        int[] a = new int[2 * nums.length];
        a[a.length - 1] = nums[nums.length - 1];
        return a;
    }

    public static boolean double23(int[] nums) {
        if (nums.length == 2) {
            return nums[0] == 2 && nums[1] == 2 || nums[0] == 3 && nums[1] == 3;
        }
        return false;
    }

    public int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3) {
                nums[i + 1] = 0;
            }
        }
        return nums;
    }

    public static int[] makeMiddle(int[] nums) {
        int[] a = new int[2];
        a[0] = nums[nums.length / 2 - 1];
        a[1] = nums[nums.length / 2];
        return a;
    }

    public int[] midThree(int[] nums) {
        int[] a = new int[3];
        a[0] = nums[nums.length / 2 - 1];
        a[1] = nums[nums.length / 2];
        a[2] = nums[nums.length / 2 + 1];
        return a;
    }

    public static int[] plusTwo(int[] a, int[] b) {
        int[] c = {a[0], a[1], b[0], b[1]};
        return c;
    }

    public static int[] rotateLeft3(int[] nums) {
        int[] array = new int[3];
        array[0] = nums[1];
        array[1] = nums[2];
        array[2] = nums[0];
        return array;
    }

    public static boolean unlucky1(int[] nums) {
        boolean flag = false;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == 1 && nums[i+1] == 3 && (i <= 1 || i >= nums.length - 2)){
                return !flag;
            }
        }
        return flag;
    }

    public static int[] make2(int[] a, int[] b) {
        int[] arr = new int[2];
        if(a.length >= 2){
            arr[0] = a[0];
            arr[1] = a[1];

        }
        else if(a.length == 1){
            arr[0] = a[0];
            arr[1] = b[0];

        }
        else if(a.length == 0){
            arr[0] = b[0];
            arr[1] = b[1];
        }
        return arr;
    }

    public static int[] swapEnds(int[] nums) {
        int num = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = num;
        return nums;
    }

    public static int[] front11(int[] a, int[] b) {
        int[] arr = new int[2];
        int[] array = new int[1];
        int[] ar = new int[0];
        if(a.length > 0 && b.length > 0){
            arr[0] = a[0];
            arr[1] = b[0];
            return arr;
        }
        else if (a.length > 0){
            array[0] = a[0];
            return  array;
        }
        else if (b.length > 0){
            array[0] = b[0];
            return  array;
        }
        return ar;
    }

    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        if(bOk){
            if(c > b){
                return true;
            }
            else return false;
        }
        else {
            if(c >= b && b >= a){
                return true;
            }
            else {
                return false;
            }
        }
    }

    public static int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2)
            return 10;
        if ( a == b && b == c)
            return 5;
        if ( a != b && a != c)
            return 1;
        else
            return 0;
    }

    public static String alarmClock(int day, boolean vacation) {
        if(vacation){
            if(day > 5 || day == 0){
                return "off";
            }
            else {
                return "10:00";
            }
        }
        else {
            if(day > 5 || day == 0){
                return "10:00";
            }
            else {
                return "7:00";
            }
        }
    }

    public static boolean specialEleven(int n) {
        if ((n % 11 == 0) || ((n - 1) % 11 == 0)){
            return true;
        }
        return false;
    }

    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if(!equalOk){
            return (a < b && b < c);
        }
        else {
            return (a <= b && b <= c);
        }
    }

    public static int makeChocolate(int small, int big, int goal) {
        int rem = goal % 5;
        int multi = (goal - big * 5) / 5;
        if (small + (big*5) < goal)
            return -1;
        else if (rem <= small && goal - big*5 > 4)
            return (rem + 5 * multi);
        else if (rem <= small)
            return rem;
        else
            return -1;
    }








    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int[] nums1 = {1,1,3,4,5,1,1};
        int[] nums = {2, 3, 4, 5, 6, 7, 89, 6};
        int[] a = {2, 3, 46, 7, 89, 6};
        int[] b = {23, 3, 4, 5, 6, 7, 89, 9};
        System.out.println(sameFirstLast(nums));
        System.out.println(commonEnd(a, b));
        System.out.println(firstLast6(nums));

        System.out.println(Arrays.toString(reverse3(array)));
        System.out.println(Arrays.toString(maxEnd3(array)));

        System.out.println(Arrays.toString(middleWay(a, b)));
        System.out.println(sum2(array));
        System.out.println(no23(b));

        System.out.println(Arrays.toString(makeLast(array)));
        System.out.println(double23(array));
        System.out.println(Arrays.toString(makeMiddle(nums)));
        System.out.println(unlucky1(nums1));
        System.out.println(make2(array, nums));
        System.out.println(swapEnds(array));
        System.out.println(front11(array, nums));
        System.out.println(inOrder(2,3,4,true));
        System.out.println(redTicket(2,2,2));
        System.out.println(alarmClock(5, true));


    }
}
