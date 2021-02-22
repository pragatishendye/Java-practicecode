package exercises;

/* This program finds the Greatest Common Divisor of any two positive integers.
   Created by Pragathi Shendye
 */

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(12, 9));
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
        System.out.println(getGreatestCommonDivisor(13, 17));
        System.out.println(getGreatestCommonDivisor(4, 6));
        System.out.println(getGreatestCommonDivisor(0, 0));

    }

    public static int getGreatestCommonDivisor(int num1, int num2) {
        if(num1 < 0 || num2 < 0) {
            System.out.println("Invalid input");
            return -1;
        }
        int min = 0, gcd = 0;
        if(num1 < num2) {
            min = num1;
        } else {
            min = num2;
        }
        for(int i=1; i<=min; i++) {
            if(num1 % i == 0) {
                if(num2 % i == 0) {
                    gcd = i;
                }
            }
        }
        return gcd;
    }
}
