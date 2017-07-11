package CodingBat;

/**
 * Created by arina on 24.06.17.
 */
public class CodingBatLine1 {
    //Warmup-1 line 1
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if(!weekday || vacation) {
            return true;
        }
        return false;
    }
    public static int diff21(int n) {
        if (n > 21){
            return 2*(n - 21);
        }
        else {
            return (21 - n);
        }
    }
    public static boolean nearHundred(int n) {
        if (Math.abs(100 - n) <= 10 ||  Math.abs (200 - n) <= 10){
            return true;
        }
        else {
            return false;
        }
    }

    public static String missingChar(String str, int n) {
        return (str.substring(0, n) + str.substring(n+1, str.length()));
    }

    public static String backAround(String str) {
        String sign = str.substring(str.length() - 1);
        return sign + str + sign;
    }

    public static boolean startHi(String str) {
        if(str.length() >=2 && str.substring(0,2).equals("hi")) {
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean hasTeen(int a, int b, int c) {
        if (19 >= a && a >= 13 ||19 >= b && b >= 13 || 19 >= c && c >= 13) {
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean mixStart(String str) {
        if(str.length() >= 3 && str.substring(1,3).equals("ix")){
            return true;
        }
        else {
            return false;
        }
    }
    public static int close10(int a, int b) {
        if (Math.abs(10 - a) < Math.abs(10 - b)){
            return a;
        }
        if (Math.abs(10 - a) > Math.abs(10 - b)){
            return b;
        }
        else {
            return 0;
        }
    }
    public static boolean stringE(String str) {
        int num = 0;
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'e'){
                num++;
            }
        }
        if (num >= 1 && num <= 3){
            return true;
        }
        else {
            return false;
        }
    }
    public static String everyNth(String str, int n) {
        String newStr = "";
        for(int  i = 0; i < str.length(); i= i + n) {
            newStr = newStr + str.charAt(i);
        }
        return newStr;
    }


    public static void main(String[] args) {

        System.out.println(sleepIn(true, false));
        System.out.println(diff21( 4));
        System.out.println(nearHundred(23));
        System.out.println(missingChar("I love lol", 5));
        System.out.println(backAround("I played a dota every day"));
        System.out.println(hasTeen(45,34,2));
        System.out.println(mixStart("Please, make a cup of coffee"));
        System.out.println(close10(12,56));
        System.out.println(stringE("Good"));
        System.out.println(everyNth("Bye bye mister Mengel", 3));
    }
}
