package HWLesson3;

/**
 * Created by arina on 27.06.17.
 */
public class NumberUnit {

    public static String toString(int x, int y) { //x - число, y - основание, перевод  в 2,8,16 систему из 10-й
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

    public static String toBinary(int i) {
        String result = "";
        String ost = null;
        if(i == 0){
            return "0";
        }
        while (i >= 1) {
            ost = Integer.toString(i % 2);
            result = result + ost;
            i = i / 2;
        }
        result += i;
        StringBuffer sbf = new StringBuffer(result);
        sbf.reverse();
        if(sbf.charAt(0) == '0'){
            sbf.deleteCharAt(0);
        }
        return sbf.toString();
    }

    public static String toOctalString(int i) {
        String result = "";
        String ost = null;
        if(i == 0){
            return "0";
        }
        while (i >= 7) {
            ost = Integer.toString(i % 8);
            result = result + ost;
            i = i / 8;
        }
        result += i;
        StringBuffer sbf = new StringBuffer(result);
        sbf.reverse();
        if(sbf.charAt(0) == '0'){
            sbf.deleteCharAt(0);
        }
        return sbf.toString();
    }

    public static String toHexString(int i) {
        String result = "";
        String ost = null;
        if(i == 0){
            return "0";
        }
        while (i >= 16) {
            ost = Integer.toString(i % 16);
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
            result = result + ost;
            i = i / 16;
        }
        result += i;
        StringBuffer sbf = new StringBuffer(result);
        sbf.reverse();
        if(sbf.charAt(0) == '0'){
            sbf.deleteCharAt(0);
        }
        return sbf.toString();
    }
}
