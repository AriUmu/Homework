package HWLesson2;

/**
 * Created by arina on 24.06.17.
 */
public class ModUnit {
    public static int mod(int i, int i1) { //остаток от деления нацело
        int sum = 0;
        int a =  Math.abs(i);
        int b =  Math.abs(i1);
        while (sum < a && (a - sum >= b)){
            sum = sum + b;
        }
        return (a - sum);
    }
}
