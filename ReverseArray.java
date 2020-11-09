/* This program reverses any given array of any size in place and prints it.
Created by Pragathi Shendye
 */

package arrays;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        System.out.println("Original array: " + Arrays.toString(nums));
        reverse(nums);
        System.out.println("Reversed array: " + Arrays.toString(nums));

    }

    private static void reverse(int[] arr) {
        int temp;
        int loopCount = 1;
        for(int i=0; i<arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length-loopCount];
            arr[arr.length-loopCount] = temp;
            loopCount++;
        }
    }

}
