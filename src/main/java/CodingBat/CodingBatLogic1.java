package CodingBat;

/**
 * Created by arina on 08.07.17.
 */
public class CodingBatLogic1 {
    public static int caughtSpeeding(int speed, boolean isBirthday) {
        int ticket = 0;
        if (speed <= 60 && isBirthday == false || speed <= 65 && isBirthday == true) {
            ticket = 0;
        } else if (speed > 60 && speed <= 80 && isBirthday == false || speed > 65 && speed <= 85 && isBirthday == true) {
            ticket = 1;
        } else if (speed > 80 && isBirthday == false || speed > 85 && isBirthday == true) {
            ticket = 2;
        }
        return ticket;
    }

    public static boolean love6(int a, int b) {
        boolean flag = false;
        if (a == 6 || b == 6) {
            flag = true;
        } else if (a + b == 6) {
            flag = true;
        } else if (Math.abs(a - b) == 6) {
            flag = true;
        }
        return flag;
    }

    public static boolean more20(int n) {
        return n % 20 >= 1 && n % 20 < 3;
    }

    public static int teaParty(int tea, int candy) {
        int party = 0;
        if (tea < 5 || candy < 5) {
            party = 0;
        } else if (tea * 2 <= candy || 2 * candy <= tea) {
            party = 2;
        } else if (tea > 5 || candy > 5 || tea == 5 || candy == 5) {
            party = 1;
        }
        return party;
    }

    public static boolean twoAsOne(int a, int b, int c) {
        return ((a + b == c) || (b + c == a) || (a + c == b));
    }

    public static boolean lastDigit(int a, int b, int c) {
        return (b % 10 == a % 10 || c % 10 == a % 10 || b % 10 == c % 10 || c % 10 == b % 10);
    }

    public static int maxMod5(int a, int b) {
        if (a == b)
            return 0;
        if (a % 5 == b % 5)
            return Math.min(a, b);
        return Math.max(a, b);
    }


    public static void main(String[] args) {
        System.out.println(caughtSpeeding(65, true));
        System.out.println(love6(5, 7));
        System.out.println(more20(23));
        System.out.println(teaParty(6, 7));
        System.out.println(twoAsOne(1, 2, 3));
        System.out.println(lastDigit(22, 33, 44));
        System.out.println(maxMod5(7, 8));

    }
}
