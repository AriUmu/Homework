package CodingBat;

/**
 * Created by arina on 25.06.17.
 */
public class CodingBarWarmup2 {

    public static String stringTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + str;
        }
        return result;
    }

    public static boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i == -1) return false; // no "x" at all
        if (i + 1 >= str.length()) return false; // check i+1 in bounds?
        return str.substring(i + 1, i + 2).equals("x");
    }

    public static int last2(String str) {
        int num = 0;
        if (str.length() < 2) return 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals(str.substring(str.length() - 2))) {
                num++;
            }
        }
        return num;
    }

    public static boolean array123(int[] nums) {
        boolean one = false;
        boolean two = false;
        boolean tree = false;
        for (int i = 0; i < nums.length; i++) {
            switch (nums[i]) {
                case 1:
                    one = true;
                    break;
                case 2:
                    two = true;
                    break;
                case 3:
                    tree = true;
                    break;
            }

        }
        return one && two && tree;

    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(stringTimes("Hi", 5));
        System.out.println(doubleX("axxaa"));
        System.out.println(last2("tratata"));
        array123(arr);


    }
}
