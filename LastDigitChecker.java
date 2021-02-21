package exercises;

/* This program checks whether at least two of three numbers (within the range 10 - 1000)
   have the same least significant digit. Returns true if yes, else false.
   Created by Pragathi Shendye
 */

public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(410, 220, 1000));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
        System.out.println(hasSameLastDigit(230, 873, 569));
        System.out.println(hasSameLastDigit(41, 10, 71));

    }

    public static boolean isValid(int number) {
        if(number < 10 || number > 1000) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if(isValid(num1) && isValid(num2) && isValid(num3)) {
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;
            int digit3 = num3 % 10;
            if((digit1 == digit2) || (digit1 == digit3) || (digit2 == digit3)) {
                return true;
            } else {
                return false;
            }
       } else {
            System.out.println("Invalid input, returning false");
            return false;
        }
    }
}
