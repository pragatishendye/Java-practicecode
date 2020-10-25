package codingexercises;

/* This program checks if a given integer number
   is a palindrome or not.
   Created by Pragathi Shendye
 */

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedDigit = 0, count = 0;
        while(number != 0) {
            int rem = number % 10;
            number = number / 10;
            if(count > 0) {
                reversedDigit = (reversedDigit * 10) + rem;
                } else {
                reversedDigit = rem;
            }
            count++;
        }

        if(originalNumber == reversedDigit) {
            return true;
        } else {
            return false;
        }

    }
}
