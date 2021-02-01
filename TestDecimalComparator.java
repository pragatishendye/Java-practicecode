package exercises;
// This code tests the DecimalComparator program

public class TestDecimalComparator {

    public static void main(String[] args) {
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.1234, 3.123));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.12, 3.123));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.123, 3.122));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(2.17562, 2.1757));
        //System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(1.0001, 1.001));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(1.0001, 1.002));

    }
}
