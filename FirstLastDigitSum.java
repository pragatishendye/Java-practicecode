package codingexercises2;

/* This program gives the sum of the first and last
   digits of a given integer number.
 */

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if(number < 0) {
            return -1;
        }
        int leastSigDigit = number % 10;
        int mostSigDigit = 0, sum = 0;
        while(number > 0) {
            mostSigDigit = number % 10;
            number = number / 10;
         }
        sum = mostSigDigit + leastSigDigit;
        return sum;
    }
}
