package exercises;

/* This program checks if any two numbers (within the range 10 - 99) have any
   common digits. Returns true if found, else false.
   Created by Pragathi Shendye
 */

public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 13));
        System.out.println(hasSharedDigit(9, 25));
        System.out.println(hasSharedDigit(10, 99));
        System.out.println(hasSharedDigit(15, 55));


    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if(num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            System.out.println("Invalid input, returning false");
            return false;
        }
        // num1 = 12 num2 = 13
        int temp = num2;
        while(num1 != 0) {
            int digit1 = num1 % 10;
            num1 /= 10;
            while(num2 != 0) {
                int digit2 = num2 % 10;
                num2 /= 10;
                if(digit1 == digit2) {
                    return true;
                }
            }
            num2 = temp;

        }
        return false;
    }
}
