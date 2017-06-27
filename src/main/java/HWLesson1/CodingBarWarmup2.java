package HWLesson1;

/**
 * Created by arina on 25.06.17.
 */
public class CodingBarWarmup2 {

    public static String stringTimes(String str, int n) {
        String result = "";
        for (int i = 0 ; i < n; i++){
            result = result + str;
        }
        return result;
    }
    public static boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i == -1) return false; // no "x" at all
        if (i+1 >= str.length()) return false; // check i+1 in bounds?
        return str.substring(i+1, i+2).equals("x");
    }

    public static int last2(String str) {
        int num = 0;
        if (str.length() < 2) return  0;
        for (int i = 0; i < str.length() -2; i++){
            if(str.substring(i, i+2).equals(str.substring(str.length()-2))){
                num++;
            }
        }
        return num;
    }



    public static void main(String[] args) {
        System.out.println(stringTimes("Hi", 5));
        System.out.println(doubleX("axxaa"));
        System.out.println(last2("tratata"));

    }
}
