package codingexercises;

/**
 * This program checks if a given year is a leap year or not
 * Created by Pragathi Shendye
 */


/* A leap year has to be divisible by 4.
    If divisible by 4 but not by 100, it is a leap year.
    If divisible by 4 and 100, then it has to be divisible by 400
    also to be a leap year.
     */

public class LeapYear {

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (year % 4 != 0) {
            return false;
        }

        if (year % 100 != 0) {
            return true;
        } else {
            if (year % 400 != 0) {
                return false;
            } else {
                return true;
            }
        }

    }

}


