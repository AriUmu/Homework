package CodingBat;

/**
 * Created by arina on 06.07.17.
 */
public class CodingBat {

    public static String helloName(String name) {
        return "Hello " + name + "!";
    }

    public static String makeOutWord(String out, String word) {
        return out.substring(0,2) + word + out.substring(2,4);
    }
    public static String extraEnd(String str) {
        String a = str.substring(str.length() - 2, str.length());
        return a + a + a;
    }
    public static String firstHalf(String str) {
        if(str.length() > 0){
            return str.substring(0, str.length()/2);
        }
        return "";
    }

    public static String nonStart(String a, String b) {
        return a.substring(1,a.length()) + b.substring(1,b.length());
    }

    public static String left2(String str) {
        if (str.length()>0){
            String a = str.substring(0, 2);
            String b = str.substring(2, str.length());
            return b + a;
        }
        return str;
    }
    public static String theEnd(String str, boolean front) {
        if(front){
            return str.substring(0,1);
        }
        return str.substring(str.length()-1, str.length());
    }

    public static boolean endsLy(String str) {
        if(str.length()>1) {
            return str.substring(str.length()-2, str.length()).equals("ly");
        }
        else {
            return false;
        }
    }

    public static String middleThree(String str) {
        if(str.length() >=3){
            return str.substring((str.length()/2 -1), (str.length()/2 + 2));
        }
        return str;
    }

    public static String lastChars(String a, String b) {
        if(a.length() > 0 && b.length() > 0) {
            return a.substring(0,1) + b.substring (b.length() - 1, b.length());
        }
        if (a.length() == 0 && b.length() == 0){
            return "@" + "@";
        }
        if (a.length() == 0){
            return "@" + b.substring (b.length() - 1, b.length());
        }
        return a.substring(0,1) + "@";
    }










    public static void main(String[] args) {
        System.out.println(helloName("Arina"));
        System.out.println(makeOutWord("<<>>", "Vaflya"));
        System.out.println(extraEnd("Chocolad"));
        System.out.println(firstHalf("WooHoo"));
        System.out.println(nonStart("hotl", "java"));
        System.out.println(left2("Hello"));
        System.out.println(theEnd("gokdmg", true));
        System.out.println(endsLy("fataly"));
        System.out.println(middleThree("Candy"));
        lastChars("", "");


    }
}
