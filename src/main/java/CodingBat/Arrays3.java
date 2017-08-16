package CodingBat;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            System.out.println(isPrime(n) ? "Prime" : "Not prime");
        }

        sc.close();
    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

class M{
    public static void main(String[] args) {
        System.out.println(Arrays.toString(seriesUp(7)));
    }


    public static int[] seriesUp(int n) {
        int len = n*(n+1)/2;
        int[] array = new int[len];
        int m = 0;
        for(int  i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                array[m++] = j;
            }
        }
        return array;
    }


}
