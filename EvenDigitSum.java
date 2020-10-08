package codingexercises2;

/* This method returns the sum of all even digits present in a number
   passed as an argument to it.
 */

public class EvenDigitSum {
    //123456 --> 2 + 4 + 6 = 12
    public static int getEvenDigitSum(int number) {
        if(number < 0) {
            return -1;
        }
        int digit = 0, sum = 0;
        while(number > 0) {
            digit = number % 10;
            number = number / 10;
            if(digit % 2 == 0) {
                sum += digit;
            }
        }
        return sum;
    }
}
