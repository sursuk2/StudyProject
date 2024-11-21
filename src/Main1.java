public class Main1 {

    public static void main(String[] args) {

        int testNumber= 500;
        int testNumber2 = 964;

        System.out.println("1--------------");
        long testLongNumber = testNumber;
        long testLongNumber2 = testNumber2;
        System.out.println(testLongNumber);
        System.out.println(testLongNumber2);

        System.out.println("2---------------");
        byte testByteNumber = (byte) testNumber;
        byte testByteNumber2 = (byte) testNumber2;
        System.out.println(testByteNumber);
        System.out.println(testByteNumber2);

        System.out.println("4------------------");

        double testDoubleNumber = testNumber;
        double testDoubleNumber2 = testNumber2;
        System.out.println(testDoubleNumber);
        System.out.println(testDoubleNumber2);

        System.out.println("3------------------");
        int testIntNumberFromDouble = (int) testDoubleNumber;
        int testIntNumberFromDouble2 = (int)testDoubleNumber2;
        System.out.println(testIntNumberFromDouble);
        System.out.println(testIntNumberFromDouble2);
    }
}