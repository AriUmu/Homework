package CodingBat;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by arina on 20.07.17.
 */
public class Solution{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        HashMap telephone = new HashMap();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            telephone.put(name,phone);

        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(telephone.get(s) == null){
                System.out.println("Not found");
            }
            else {
                System.out.println(s + "=" + telephone.get(s));
            }
        }
        in.close();
    }
}

