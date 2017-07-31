package CodingBat;

/**
 * Created by arina on 11.07.17.
 */
public class CodingBatString1 {

    public static int countCode(String str) {
        int count = 0;
        for (int i= 3; i < str.length(); i++){
            if(str.charAt(i) == ('e') && str.charAt(i-2) == ('o') && str.charAt(i-3) == ('c')){
                count++;
            }
        }
        return count;
    }

    public static boolean bobThere(String str) {
        boolean flag = false;
        if(str.length()>2){
            for(int i = 2; i < str.length(); i++){
                if(str.charAt(i-2) == 'b' && str.charAt(i) == 'b'){
                    flag = true;
                }
            }
        }
        return flag;
    }

    public static String repeatEnd(String str, int n) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < n; i++){
            result.append(str.substring(str.length()-n, str.length()));
        }
        return result.toString();
    }

    public static String extraFront(String str) {
        String result = "";
        if(str.length() > 2){
            for(int i = 0; i < 3; i++){
                result += str.substring(0,1) + str.substring(1,2);
            }
        }
        else {
            for(int i = 0; i < 3; i++){
                result += str;
            }
        }
        return result;
    }
    public static String startWord(String str, String word) {
        int lenStr = str.length();
        int lenWord = word.length();
        if (lenStr == 0)
            return "";
        if (lenWord > lenStr)
            return "";
        if (word.length() == 1)
            return str.substring(0,1);
        else if (str.substring(1,lenWord).equals(word.substring(1,lenWord)))
            return str.substring(0,lenWord);
        else
            return "";
    }

    public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public static String withouEnd2(String str) {
        if(str.length() > 2){
            return str.substring(1, str.length() -1);
        }
        else return "";

    }

    public static boolean hasBad(String str) {
        if(str.length()>3){
            for(int i = 0; i < 2; i++){
                if(str.substring(i, i+3).equals("bad")){
                    return true;
                }
            }
        }
        if(str.length() == 3){
            return str.equals("bad");
        }
        return false;
    }

    public static String conCat(String a, String b) {
        int len = a.length();
        int lenB = b.length();
        if (len > 0 && lenB > 0){
            if(a.charAt(len-1) == b.charAt(0)){
                return a.substring(0, len-1) + b;
            }
        }
        return a + b;
    }

    public static boolean frontAgain(String str) {
        if(str.length() >1){
            String first = str.substring(0,2);
            String last = str.substring(str.length()-2, str.length());
            return first.equals(last);
        }
        return false;
    }

    public static String without2(String str) {
        String result = "";
        if(str.length() > 1){
            String first = str.substring(0,2);
            String last = str.substring(str.length()-2, str.length());
            if (first.equals(last)){
                return str.substring(2, str.length());
            }
            else {
                return str;
            }
        }
        if(str.length() == 1){
            return str;
        }
        return result;
    }

    public static String withoutX(String str) {
        String result = "";
        if(str.length() > 1){
            String first = str.substring(0,1);
            String last = str.substring(str.length()-1, str.length());
            if(first.equals("x")){
                if(last.equals("x")){
                    return str.substring(1, str.length()-1);
                }
                else {
                    return str.substring(1, str.length());
                }
            }
            else if(last.equals("x")){
                return str.substring(0, str.length()-1);
            }
            else return str;
        }

        else return result;

    }

    public static String left2(String str) {
        if (str.length() > 2){
            String a = str.substring(2, str.length() - 2);
            String b = str.substring(str.length() - 2, str.length());
            return b + a;
        }
        else return str;
    }
    public static String minCat(String a, String b) {
        if (a.length() == b.length())
            return a+b;
        if (a.length() > b.length()){
            int diff = a.length() - b.length();
            return a.substring(diff, a.length()) + b;
        } else {
            int diff = b.length() - a.length();
            return a + b.substring(diff, b.length());
        }
    }

    public static String deFront(String str) {
        int len = str.length();
        String temp = "";
        for (int i = 0; i < len; i++) {
            if (i == 0 && str.charAt(i) == 'a')
                temp += 'a';
            else if (i == 1 && str.charAt(i) == 'b')
                temp += 'b';
            else if (i > 1)
                temp += str.charAt(i);
        }
        return temp;
    }

    public static String seeColor(String str) {
        String color = "";
        if(str.equals("red")){
            return "red";
        }
        if(str.equals("blue")){
            return "blue";
        }
        if(str.length() > 2){
            for(int i = 0; i < str.length()-3; i++){
                if (str.substring(i, i + 3).equals("red")){
                    color = "red";
                }
            }
            for(int i = 0; i < str.length()-4; i++){
                if (str.substring(i, i + 4).equals("blue")){
                    color = "blue";
                }
            }
        }
        else {
            color = "";
        }
        return color;
    }



    public static void main(String[] args) {
        System.out.println(countCode("codecodecilelde"));
        System.out.println(bobThere("bobobobob"));
        System.out.println(repeatEnd("Hello",3));
        System.out.println(extraFront("Hello"));
        System.out.println(startWord("hippi", "hi"));
        System.out.println(conCat("abc", "cgh"));
        System.out.println(frontAgain("ghghghgh"));
        System.out.println(without2("HelloHe"));
        System.out.println(withoutX("xHHHx"));
        System.out.println(left2("Gi"));
        System.out.println(minCat("Hello", "Hi"));
        System.out.println("Hello");

    }
}
