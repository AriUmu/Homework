package CodingBat;

/**
 * Created by arina on 16.07.17.
 */
public class CBString3 {
    public static int countYZ(String str) {
        int len = str.length();
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == 'y' || str.charAt(i) == 'z') {
                if (i < len-1 && !Character.isLetter(str.charAt(i+1)))
                count++;
      else if (i == len-1)
                count++;
            }
        }
        return count;
    }
    public static boolean gHappy(String str) {
        int len = str.length();
        boolean happy = true;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == 'g') {
                if (i > 0 && str.charAt(i-1) == 'g')
                    happy = true;
                else if (i < len-1 && str.charAt(i+1) == 'g')
                    happy = true;
                else
                    happy = false;
            }
        }
        return happy;
    }
    public static String sameEnds(String string) {
        String result = "";
        int len = 0;
        for(int i = 0; i < string.length()/2;i++){
            if(string.length() == 3){
                len = 2;
            }
            else if(string.length() == 2){
                len = 2;
            }
            else {
                len = string.length();
            }
            for(int j = string.length()/2; j < len; j++){

                // if(string.charAt(0) != string.charAt(j)){
                // result = "";
                // }

                if(string.charAt(i) == string.charAt(j)){
                    result += string.charAt(i);
                    i++;
                }

            }
            return result;

        }
        return result;
    }




    public static void main(String[] args) {
        System.out.println(countYZ("fiz = = loy"));
        System.out.println(gHappy("pppggttgg"));

        System.out.println(sameEnds("mymmy"));
    }
}
