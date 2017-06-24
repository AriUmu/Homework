package HWLesson2;

/**
 * Created by arina on 24.06.17.
 */
public class PrimeUnit { //другой вариант (Решето Эратосфена)

    public static boolean isPrime(int i) {
        int a = 2;
        if (i == 1 || i == 0){
            return true;
        }
        for (int j = 2; j < i; j++) {
            if(i % j == 0){
                return false;
            }
        }
       return true;
    }
}
