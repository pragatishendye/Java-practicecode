package codingexercises;

public class TestSumOdd {

    public static void main(String[] args) {
        System.out.println(SumOddRange.isOdd(0));
        System.out.println(SumOddRange.isOdd(-1));
        System.out.println(SumOddRange.isOdd(10));
        System.out.println(SumOddRange.isOdd(3));
        System.out.println("************************");
        System.out.println(SumOddRange.sumOdd(1, 11));
        System.out.println(SumOddRange.sumOdd(10, 1));
        System.out.println(SumOddRange.sumOdd(11, 11));
        System.out.println(SumOddRange.sumOdd(-1, 11));
        System.out.println(SumOddRange.sumOdd(1, -1));
        System.out.println(SumOddRange.sumOdd(4, 9));
        System.out.println(SumOddRange.sumOdd(100, 1000));
    }
}
