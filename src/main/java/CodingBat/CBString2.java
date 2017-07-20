package CodingBat;

/**
 * Created by arina on 19.07.17.
 */
public class CBString2 {

    public static boolean sameStarChar(String str) {
        boolean flag = true;
        if (str.length() > 0){
            for(int i = 1; i < str.length() -1; i++){
                if (str.charAt(i) == '*'){
                    if(str.charAt(i - 1) == str.charAt(i + 1)){
                        flag = true;
                    }
                    else {
                        flag = false;
                    }
                }
            }
        }
        else {
            return true;
        }
        return flag;

    }



    public static void main(String[] args) {
        System.out.println(sameStarChar("XY*YYYY*Z*"));
    }
}
