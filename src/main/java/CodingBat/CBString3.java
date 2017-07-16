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




    public static void main(String[] args) {
        System.out.println(countYZ("fiz = = loy"));
        System.out.println(gHappy("pppggttgg"));
    }
}
