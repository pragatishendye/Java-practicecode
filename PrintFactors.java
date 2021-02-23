package exercises;

/* This program prints all the factors of a given positive integer.
   Created by Pragathi Shendye
 */

public class PrintFactors {

    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(0);
        printFactors(17);
        printFactors(54);
        printFactors(1);

    }

    public static void printFactors(int number) {
        if(number < 1) {
            System.out.println("Invalid Value");
        } else {
            int max = number / 2;
            int i = 1;
            while(i <= max) {
                if(number % i == 0) {
                    System.out.print(i + "\t");
                }
                i++;
            }
            System.out.println(number);

        }

    }
}
