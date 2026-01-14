package io.github.talentdevelopment004.operators;

public class Main {
    public static void main(String[] args) {
        arithmeticOperators();
        assignmentOperators();
        comparisonOperators();
        logicalOperators();
        incrementDecrementOperators();

        // call
        add(5, 10);
        add(5, 10, 0);

    }

    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int add(int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber + secondNumber + thirdNumber;
    }

    public static void arithmeticOperators() {
        // mathematics
        System.out.println("=================arithmeticOperators================");
        int a = 15, b = 4;
        System.out.println(" Operations on a=" + a + ", b=" + b);
        System.out.println("a + b = " + (a + b)); // 19
        System.out.println("a - b = " + (a - b)); // 11
        System.out.println("a * b = " + (a * b)); // 60
        System.out.println("a / b = " + (a / b)); // 3 (integer division)
        System.out.println("a % b = " + (a % b)); // 3 (remainder)

        double result = (double) a / b; // 3.75 (decimal division)
        System.out.println("Decimal division: " + result);

    }

    public static void assignmentOperators() {
        System.out.println("=================assignmentOperators================");

    }

    public static void comparisonOperators() {
        System.out.println("=================comparisonOperators================");

    }

    public static void logicalOperators() {
        System.out.println("=================logicalOperators================");

    }

    public static void incrementDecrementOperators() {
        System.out.println("=================incrementDecrementOperators================");

    }

}
