package HWLesson2;

/**
 * Created by arina on 24.06.17.
 */
public class FibonacciUnit {
    public static boolean isFibonacci(int i) {
        if (i == 0){
            return false;
        }
        if (i == 1){
            return false;
        }
        if (i > 2){
            int F [] = new int[i+1];
            F[0] = 1;
            F[1] = 1;
            for (int j = 2; j < i ; j++) {
                F[j] = F[j - 1] + F[j - 2];
                if (F[j] == i){
                    return true;
                }
            }
        }

        return false;
    }
}
