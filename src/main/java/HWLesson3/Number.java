package HWLesson3;

/**
 * Created by arina on 27.06.17.
 */
public class Number {

    public static String toBinaty(int x, int y) {
        String result = "";
        String ost;

        if(x == 0){
            return "0";
        }
        while (x >= y - 1) {
            ost = Integer.toString(x % y);
            if(Integer.valueOf(ost) >= 10){
                switch (Integer.valueOf(ost)){
                    case 10:
                        ost = "A";
                        break;
                    case 11:
                        ost = "B";
                        break;
                    case 12:
                        ost = "C";
                        break;
                    case 13:
                        ost = "D";
                        break;
                    case 14:
                        ost = "E";
                        break;
                    case 15:
                        ost = "F";
                        break;
                }
            }
            result = result +  ost;
            x = x / y;
        }

        result += x;
        StringBuffer sbf = new StringBuffer(result);
        sbf.reverse();
        if(sbf.charAt(0) == '0'){
            sbf.deleteCharAt(0);
        }
        return sbf.toString();
    }
}
