package CodingBat;

/**
 * Created by arina on 04.07.17.
 */
public class CodingBatLogic {
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (40 <= cigars && cigars <= 60 && !isWeekend) {
            return true;
        } else if (40 <= cigars && isWeekend) {
            return true;
        }
        return false;
    }

    public static int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) {
            return 0;
        }
        if (you >= 8 || date >= 8) {

            return 2;
        } else {
            return 1;
        }

    }

    public static boolean squirrelPlay(int temp, boolean isSummer) {
        if (temp >= 60 && temp <= 90 && !isSummer) {
            return true;
        } else if (temp >= 60 && temp <= 100 && isSummer) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        cigarParty(40, true);
        dateFashion(5, 5);
        squirrelPlay(90, true);


    }
}
