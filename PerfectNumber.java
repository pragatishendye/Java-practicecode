package exercises;

/* This program determines if any given positive integer is a perfect number or not.
   A number is perfect if the sum of all of it's positive divisors, excluding
   itself, is equal to the number itself.
   Created by Pragathi Shendye
 */

public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(1));
        System.out.println(isPerfectNumber(-1));

    }

    public static boolean isPerfectNumber(int number) {
        if(number < 1) {
            System.out.println("Invalid input");
            return false;
        }

        int sum = 1;
        for(int i=2; i<=number/2; i++) {
            if(number % i == 0) {
                sum += i;
            }
        }
        if(sum == number) {
            System.out.println("Perfect number");
            return true;
        } else {
            System.out.println("Not a perfect number");
            return false;
        }

    }
}
