/* This program finds the minimum value from a range of integers entered by
the user. It uses array.
Created by Pragathi Shendye
 */

package arrays;

import java.util.Scanner;

public class MinElement {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How many integers would you like to enter? ");
        int[] numbers = readIntegers(scanner.nextInt());
        int minimumValue = findMin(numbers);
        System.out.println("Minimum number in array is: " + minimumValue);

    }

    private static int[] readIntegers(int count) {
        int[] nums = new int[count];
        System.out.println("Enter the integers: ");
        for(int i=0; i<nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        return nums;
    }

    private static int findMin(int[] a) {
        int min = a[0];
        for(int i=1; i<a.length; i++) {
            if(min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }
}
