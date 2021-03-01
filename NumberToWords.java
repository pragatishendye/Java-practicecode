package exercises;

/* This program prints a given positive integer in words.
   Created by Pragathi Shendye
 */

public class NumberToWords {

    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-234));
        numberToWords(2345);
        numberToWords(-3748);
        numberToWords(100);
        numberToWords(-1005);
        numberToWords(50000);
        System.out.println(getDigitCount(0));
        numberToWords(0);

    }

    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.println("Invalid Value");
        } else {
            int numOfDigits = getDigitCount(number);
            //System.out.println(numOfDigits);
            number = reverse(number);
            while(number != 0) {
                int digit = number % 10;
                numOfDigits--;
                switch(digit) {
                    case 0:
                        System.out.print("Zero");
                        System.out.print(" ");
                        break;
                    case 1:
                        System.out.print("One");
                        System.out.print(" ");
                        break;
                    case 2:
                        System.out.print("Two");
                        System.out.print(" ");
                        break;
                    case 3:
                        System.out.print("Three");
                        System.out.print(" ");
                        break;
                    case 4:
                        System.out.print("Four");
                        System.out.print(" ");
                        break;
                    case 5:
                        System.out.print("Five");
                        System.out.print(" ");
                        break;
                    case 6:
                        System.out.print("Six");
                        System.out.print(" ");
                        break;
                    case 7:
                        System.out.print("Seven");
                        System.out.print(" ");
                        break;
                    case 8:
                        System.out.print("Eight");
                        System.out.print(" ");
                        break;
                    case 9:
                        System.out.print("Nine");
                        System.out.print(" ");
                        break;

                }
                number /= 10;
            }
            if(numOfDigits > 0) {
                for(int i=numOfDigits; i>0; i--) {
                    System.out.print("Zero");
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static int reverse(int number) {
        int reversedNum = number % 10;
        number /= 10;
        while(number != 0) {
            int digit = number % 10;
            reversedNum = (reversedNum * 10) + digit;
            number /= 10;
        }
        return reversedNum;

    }

    public static int getDigitCount(int number) {
        if(number < 0) {
            return -1;
        }
        int digitCount = 0;
        if(number == 0) {
            digitCount = 1;
            return digitCount;
        } else {
            while(number != 0) {
                int digit = number % 10;
                digitCount++;
                number /= 10;
        }
            return digitCount;
        }

    }
}
