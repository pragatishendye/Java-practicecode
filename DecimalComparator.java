
/* This program checks whether two given decimal numbers are equal up to 3
   decimal places. Returns true if they are equal, false otherwise.
   Created by Pragathi Shendye
 */
public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int multiplyFactor = 1000;   // 3 decimal places, hence 1000
        double n1 = num1 * multiplyFactor;
        double n2 = num2 * multiplyFactor;
        System.out.println(n1 + "\t" + n2);
        if((int)n1 == (int)n2) {
            return true;
        }
        return false;
    }
}
