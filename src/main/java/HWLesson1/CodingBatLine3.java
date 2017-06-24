package HWLesson1;

/**
 * Created by arina on 24.06.17.
 */
public class CodingBatLine3 {
    ////Warmup-1 line 3
    public static int sumDouble(int a, int b) {
        return a==b?2*(a+b):(a+b);
    }

    public static boolean makes10(int a, int b) {
        if (a == 10 || b == 10 || (a + b == 10)){
            return true;
        }
        else return false;
    }

    public static String notString(String str) {
        if (str.length() <= 3 && !str.equals("not")){
            return "not " + str;
        }
        if(str.substring(0,3).equals("not")){
            return str;
        }
        else {
            return "not " + str;
        }
    }
    public static String front3(String str) {
        if(str.length() < 3){
            return str + str + str;
        }
        else {
            String first = str.substring(0,3);
            return first + first + first;
        }
    }

    public static String front22(String str) {
        if (str.length() < 3){
            return str + str + str;
        }
        else {
            return str.substring(0,2) + str + str.substring(0,2);
        }
    }

    public static boolean in1020(int a, int b) {
        if ((a >= 10 && a <=20) || (b >= 10 && b <= 20)){
            return true;
        }
        else {
            return false;
        }
    }
    public static String delDel(String str) {
        if(str.length() <= 3){
            return str;
        }
        if(str.substring(1,4).equals("del")){
            return str.substring(0,1) + str.substring(4,str.length());
        }
        return str;
    }

    public static int intMax(int a, int b, int c) {
        if(a > b){
            return a > c ? a : c;
        }
        else if (b > c){
            return b > a ? b : a;
        }
        else return c;
    }

    public static int max1020(int a, int b) {
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    }
    public static String endUp(String str) {
        if (str.length() <=3){
            return str.toUpperCase();
        }
        else {
            return str.substring(0, str.length()-3) + str.substring(str.length()-3, str.length()).toUpperCase();
        }
    }


    public static void main(String[] args) {
        System.out.println(sumDouble(2,2));
        System.out.println(makes10(2,5));
        System.out.println(notString("Fair"));
        System.out.println(front3("Ku"));
        System.out.println(front22("Ha"));
        System.out.println(in1020(3,5));
        System.out.println(delDel("del"));
        System.out.println(intMax(3,5,7));
        System.out.println(max1020(10,30));
        System.out.println(endUp("arina"));


    }
}
