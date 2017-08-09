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

    public static String stringBits(String str) {
        String result = "";
        for (int i=0; i<str.length(); i+=2) {
            result = result + str.substring(i, i+1);
        }
        return result;
    }
    public static int arrayCount9(int[] nums) {
        int count = 0;
        for(int i : nums){
            if(i == 9){
                count++;
            }
        }
        return count;
    }

    public static int stringMatch(String a, String b) {
        int count = 0;
        int minLen = a.length();
        if(a.length() > b.length()){
            minLen = b.length();
        }
        for(int i = 0; i < minLen -1; i++){
            if(a.substring(i, i+2).equals(b.substring(i, i+2))){
                count++;
            }
        }
        return count;
    }

    public static int  countXX(String str) {
        int count = 0;
        for(int i = 0; i < str.length()-1; i++){
            if(str.charAt(i) == 'x' && str.charAt(i + 1) == 'x'){
                count ++;
            }
        }
        return count;
    }

    public static String stringSplosion(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++){
            result += str.charAt(i);
            if(i < str.length() - 1){
                result += str.substring(0, i+1);
            }
        }
        return result;
    }

    public static boolean arrayFront9(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(i < 4 && nums[i] == 9){
                return true;
            }
        }
        return false;
    }

    public  static String stringX(String str) {
        StringBuilder result = new StringBuilder(str);
        for(int i = 0; i < result.length() - 1; i++){
            if (result.charAt(i) == 'x' && i != 0){
                result = result.delete(i, i+1);
                i--;
            }
        }
        return result.toString();
    }





    public static void main(String[] args) {
        int[] arr = {1, 2, 9, 4, 5, 6, 7};

//        System.out.println(stringTimes("Hi", 5));
//        System.out.println(doubleX("axxaa"));
//        System.out.println(last2("tratata"));
//        array123(arr);
//        System.out.println(stringBits("Hello"));
//        System.out.println(arrayCount9(arr));
//        System.out.println(stringMatch("ghjkld", "dfghjk"));
//        System.out.println(countXX("sdlkljaxx,n,kxx"));
//        System.out.println(stringSplosion("Code"));
//        System.out.println(arrayFront9(arr));
//        System.out.println(stringX("xabxxxcdx"));


    }
}
