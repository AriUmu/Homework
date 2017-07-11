package CodingBat;

/**
 * Created by arina on 24.06.17.
 */
public class CodingBatLine2 {
    ////Warmup-1 line 2
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile == bSmile){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean parrotTrouble(boolean talking, int hour) {
        if(talking && (hour > 20 || hour < 7)){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        }
        else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }
    public static String frontBack(String str) {
        if (str.length() <= 1) return str;
        String mid = str.substring(1, str.length()-1);
        return str.charAt(str.length()-1) + mid + str.charAt(0);
    }

    public static boolean or35(int n) {
        if (n % 3 == 0 || n % 5 == 0){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean icyHot(int temp1, int temp2) {
        if ((temp1 > 100 && temp2 < 0) || (temp1 < 0 && temp2 > 100)){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean loneTeen(int a, int b) {
        if (a >=13 && a<= 19 && !(b >=13 && b<= 19)){
            return true;
        }
        if (!(a >=13 && a<= 19) && (b >=13 && b<= 19)){
            return true;
        }
        else {
            return false;
        }
    }
    public static String startOz(String str) {
        String newStr = "";
        if (str.length()>0){
            if(str.charAt(0)=='o'){
                newStr = newStr + 'o';
            }
            if(str.length()>1){
                if (str.charAt(1)=='z'){
                    newStr = newStr + 'z';
                }
            }
        }
        return newStr;
    }
    public static boolean in3050(int a, int b) {
        if ((a>=30 && a<=40 && b>=30 && b<=40) || (a>=40 && a<=50 && b>=40 && b<=50)){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean lastDigit(int a, int b) {
        if (a % 10 ==  b % 10 ) {
            return true;
        }
        else return false;
    }


    public static void main(String[] args) {

        System.out.println(monkeyTrouble(true, false));
        System.out.println(parrotTrouble(true, 21));
        System.out.println(posNeg(3,5,true));
        System.out.println(frontBack("Im tied"));
        System.out.println(or35(45));
        System.out.println(icyHot(34,67));
        System.out.println(loneTeen(45,13));
        System.out.println(startOz("Ozozoz"));
        System.out.println(in3050(23, 56));
        System.out.println(lastDigit(34,54));

    }
}
