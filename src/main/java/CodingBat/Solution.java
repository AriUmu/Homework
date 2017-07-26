package CodingBat;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by arina on 20.07.17.
 */
public class Solution {

    public static int toBinary(int i) {
        String result = "";
        String ost = null;
        if (i == 0) {
            return 0;
        }
        while (i >= 1) {
            ost = Integer.toString(i % 2);
            result = result + ost;
            i = i / 2;
        }
        result += i;
        StringBuffer sbf = new StringBuffer(result);
        sbf.reverse();
        if (sbf.charAt(0) == '0') {
            sbf.deleteCharAt(0);
        }

        //String str = sbf.toString();
        System.out.println(sbf);
        int max = 1;
        int num = 1;

        for (int j = 0; j < sbf.length() - 1; j++) {
            if (sbf.charAt(j) == '1' && sbf.toString().charAt(j + 1) == '1') {
                num++;

                if (num > max) {
                    max = num;
                }

            }
            else{
                num = 1;
            }

        }

        return max;
    }


    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        HashMap telephone = new HashMap();
//        int n = in.nextInt();
//        for(int i = 0; i < n; i++){
//            String name = in.next();
//            int phone = in.nextInt();
//            // Write code here
//            telephone.put(name,phone);
//
//        }
//        while(in.hasNext()){
//            String s = in.next();
//            // Write code here
//            if(telephone.get(s) == null){
//                System.out.println("Not found");
//            }
//            else {
//                System.out.println(s + "=" + telephone.get(s));
//            }
//        }
//        in.close();
//    }


        System.out.println(toBinary(13));

    }
}

