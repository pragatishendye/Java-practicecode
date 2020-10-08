package codingexercises;

/**
 * This program converts the given minutes into years
 * and days
 */

/* 1 hour = 60 minutes
   1 day = 24 hours
   1 year = 365 days
 */

public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println("Invalid Value");

        }
        else {
            double days = (double) minutes / (60 * 24);
            int years = (int) days / 365;
            int remainingDays = (int) (days % 365);
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");

        }

    }
}
