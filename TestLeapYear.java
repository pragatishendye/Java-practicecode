package codingexercises;
/* This program tests the LeapYear program.
Created by Pragathi Shendye
*/
public class TestLeapYear {

    public static void main(String[] args) {
        System.out.println(LeapYear.isLeapYear(0));
        System.out.println(LeapYear.isLeapYear(-20));
        System.out.println(LeapYear.isLeapYear(1));

        System.out.println(LeapYear.isLeapYear(2500));
        System.out.println(LeapYear.isLeapYear(2400));
        System.out.println(LeapYear.isLeapYear(1600));
        System.out.println(LeapYear.isLeapYear(2000));

        System.out.println(LeapYear.isLeapYear(10000));
        System.out.println(LeapYear.isLeapYear(9999));
        System.out.println(LeapYear.isLeapYear(1924));
    }
}
