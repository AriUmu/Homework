package CodingBat;

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
    public static void main(String[] args) {
        System.out.println(makeBricks(3,4,12));
    }
}
