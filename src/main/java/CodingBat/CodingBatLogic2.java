package CodingBat;

import java.util.Arrays;

/**
 * Created by arina on 11.07.17.
 */
public class CodingBatLogic2 {

    public static boolean makeBricks(int small, int big, int goal) {
        boolean flag = true;
        int digit = goal % 10;
        if (goal > small + (big * 5))
            flag = false;
        if (digit < 5 && small < digit)
            flag = false;
        else if (digit > 5 && digit > small + 5)
            flag = false;
        return flag;
    }

    public static int noTeenSum(int a, int b, int c) {
        int sum = 0;
        if (a < 13 || 19 < a) {
            sum += a;
        }
        if (a == 15 || a == 16) {
            sum += a;
        }
        if (b < 13 || 19 < b) {
            sum += b;
        }
        if (b == 15 || b == 16) {
            sum += b;
        }
        if (c < 13 || 19 < c) {
            sum += c;
        }
        if (c == 15 || c == 16) {
            sum += c;
        }
        return sum;
    }

    public static int blackjack(int a, int b) {
        int result = 0;
        if (a > 21) {
            result = b;
        }
        if (b > 21) {
            if (a > 21) {
                result = 0;
            } else {
                result = a;
            }
        } else if (a <= 21 && b <= 21) {
            if ((21 - a) > (21 - b)) {
                result = b;
            } else {
                result = a;
            }
        }
        return result;
    }

    public static int loneSum(int a, int b, int c) {
        int[] sum = {a,b,c};
        int result = 0;
        if(sum[0] != sum[1] && sum[0] != sum[2]){
            result += sum[0];
        }
        if(sum[1] != sum[2] && sum[1] != sum[0]){
            result += sum[1];
        }
        if(sum[2] != sum[1] && sum[2] != sum[0]){
            result += sum[2];
        }
        return result;
    }

    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }
    public int round10(int n) {
        if (n % 10 < 5)
            return n - (n%10);
        else
            return n + (10 - (n%10));
    }
    public static boolean evenlySpaced(int a, int b, int c) {
        int[] anArray = {a, b, c};
        Arrays.sort(anArray);
        int one = anArray[1] - anArray[0];
        int two = anArray[2] - anArray[1];
        if (one == two)
            return true;
        else
            return false;
    }


    public static void main(String[] args) {
        System.out.println(makeBricks(3, 4, 12));
        System.out.println(noTeenSum(2, 17, 16));
        System.out.println(blackjack(12, 22));
        System.out.println(loneSum(2,3,4));
        System.out.println(evenlySpaced(1,2,3));
    }
}
