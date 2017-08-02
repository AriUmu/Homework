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

    public static int countOfCard(int ty){
        int count = 0;
        if (ty > 155) {
            count = ((ty - 155) / 35) + 1;
        }
        else{
            return 1;
        }
        return count;
    }

    public static int sumNumbers(String str) {
        int sum = 0;
        String result = "";
        for (int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){

                if(i < str.length()-1 && Character.isDigit(str.charAt(i+1))){
                    result += str.charAt(i);
                }
                else {
                    result += str.charAt(i);
                    sum += Integer.parseInt(result);
                    result = "";
                }
            }
        }
        return sum;
    }


    public static String withoutString(String base, String remove) {
        int blen = base.length();
        int rlen = remove.length();
        String lowbase = base.toLowerCase();
        String lowrem = remove.toLowerCase();
        String fin = "";
        for (int i = 0; i < blen; i++) {
            if (i <= blen - rlen) {
                String tmp = lowbase.substring(i,i+rlen);
                if (!tmp.equals(lowrem))
                    fin += base.substring(i,i+1);
                else {
                    i += rlen-1;
                }
            }
            else {
                String tmp2 = lowbase.substring(i,i+1);
                if (!tmp2.equals(lowrem))
                    fin += base.substring(i,i+1);
            }
        }
        return fin;
    }

    public static int countTriple(String str) {
        int len = str.length();
        int count = 0;
        for (int i = 0; i < len-2; i++){
            char tmp = str.charAt(i);
            if (tmp == str.charAt(i+1) && tmp == str.charAt(i+2))
                count++;
        }
        return count;
    }

    public static String mirrorEnds(String string) {
        String result = "";
        int len = string.length();
        for(int i = 0; i < len; i++){
            if(string.charAt(i) == string.charAt(len - i - 1)){
                result += string.charAt(i);
            }
            else return result;
        }
        return result;
    }

    public static String notReplace(String str) {
        String letter = "is";
        String noLetter = "is not ";
        String result = "";


        for (int i = 0; i < str.length() - 2 ; i++) {
            if(str.substring(i, i+2).equals(letter)){
                if(i > 0) {
                    if (str.charAt(i - 1) < 65 && str.charAt(i - 1) > 122){
                        result += (str.substring(0,i) + noLetter + str.substring(i + 3, str.length()));
                        System.out.println(result);
                    }
                }else{ //i == 0
                    result += (str.substring(0,i) + noLetter + str.substring(i + 3, str.length()));
                    System.out.println(result);
                }
            }
            else {

            }
        }
        return result;
    }

    public static boolean equalIsNot(String str) {
        int is = 0;
        int no = 0;

        for(int i = 0; i < str.length()-1; i++){
            if(str.substring(i,i+2).equals("is")){
                is++;
            }
        }
        for(int i = 0; i < str.length()-2; i++){
            if(str.substring(i,i+3).equals("not")){
                no++;
            }
        }
        return is == no;
    }


    public static int sumDigits(String str) {
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        return sum;
    }

    public int maxBlock(String str) {
        int sum = 0;
        int max = 1;
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i-1) == str.charAt(i)){
                sum++;
            }
            else {
                if(sum > max){
                    max = sum;
                }
                sum = 0;
            }
        }
        return max;
    }







    public static void main(String[] args) {
//        System.out.println(countYZ("fiz = = loy"));
//        System.out.println(gHappy("pppggttgg"));
//
//        System.out.println(sameEnds("mymmy"));
//        System.out.println(countOfCard(0));
//
//        System.out.println(sumNumbers("fs123lkuk12") + "  результат");
//        System.out.println(withoutString("THIS is a FISH", "is"));
//        System.out.println(countTriple("xxxttyyuuevb"));
//
//        System.out.println(mirrorEnds("xxYxx"));
//        System.out.println(notReplace("is mu is"));

//        System.out.println(equalIsNot("isisnotnot"));
        System.out.println(sumDigits("1234dsfvksl"));

    }
}
