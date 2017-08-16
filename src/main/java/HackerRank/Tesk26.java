package HackerRank;

import java.util.Scanner;

public class Tesk26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstday = sc.nextInt(); //now
        int firstmonth = sc.nextInt();
        int firstYear = sc.nextInt();
        int secondDay = sc.nextInt(); //когда нужно было вернуть
        int secondMonth = sc.nextInt();
        int secondYear = sc.nextInt();

        int dollars = solve(firstday, firstmonth, firstYear, secondDay, secondMonth, secondYear);
        System.out.println(dollars);
    }

    private static int solve(int firstday, int firstmonth, int firstYear, int secondDay, int secondMonth, int secondYear) {
        int dollars = 0;
        if (secondYear > firstYear) {
            return 0;
        } else if (secondYear < firstYear) {
            dollars = 10000;
        } else {
            if (secondMonth > firstmonth) {
                return 0;
            } else if (secondMonth < firstmonth) {
                dollars = 500 * (firstmonth - secondMonth);
            } else {
                if (secondDay > firstday) {
                    return 0;
                } else if (secondDay < firstday) {
                    dollars = 15 * (firstday - secondDay);
                }
            }
        }

        return dollars;
    }
}
