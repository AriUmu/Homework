package Exercise;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String S = in.next();
//        try {
//            int result = Integer.parseInt(S);
//            System.out.println(S);
//        }catch (Exception e){
//            System.out.println("Bad String");
//        }
//
        Calc calc = new Calc();
//        int result = calc.power(3,5);
        //System.out.println(result);
        int result =  calc.divisorSum(6);
        System.out.println(result);
    }
}
class Calc implements Movement{

    int power(int n, int p){
        if (n < 0 || p < 0){
            throw new RuntimeException("n and p should be non-negative");
        }
        int result = 1;
        while (p > 0){
            result *= n;
            p--;
        }
        return result;
    }

    int divisorSum(int n){
        int sum = 0;
        for (int i = 1; i < n + 1; i++) {
            if(n % i == 0){
                sum += i;
            }
        }
        return sum;

}

    @Override
    public double multiply() {
        return 0;
    }
}