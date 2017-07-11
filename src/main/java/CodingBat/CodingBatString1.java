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


    public static void main(String[] args) {
        System.out.println(countCode("codecodecilelde"));
        System.out.println(bobThere("bobobobob"));
        System.out.println(repeatEnd("Hello",3));

    }
}
