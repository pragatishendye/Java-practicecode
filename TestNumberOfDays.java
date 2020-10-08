package codingexercises;

public class TestNumberOfDays {

    public static void main(String[] args) {
        System.out.println(NumberOfDaysInMonth.isLeapYear(-2));
        System.out.println(NumberOfDaysInMonth.isLeapYear(10000));
        System.out.println(NumberOfDaysInMonth.isLeapYear(2004));
        System.out.println(NumberOfDaysInMonth.isLeapYear(2017));
        System.out.println("*************");
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(6, 1984));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(14, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(-1, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(12, 10000));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(11, -1));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(14, 10001));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2001));
    }
}
