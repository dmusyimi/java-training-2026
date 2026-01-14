package io.github.talentdevelopment004.operators;

public class Main {
    public static void main(String[] args) {
        // arithmeticOperators();
        assignmentOperators();
        // comparisonOperators();
        // logicalOperators();
        // incrementDecrementOperators();

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

        int balance = 20000;

        // deposit 5000
        balance = balance + 5000; //
        // balance += 5000;
        System.out.println("Current balance after deposit: " + balance);

        // withdraw 8000 charges 115
        // balance = balance - 8115;
        // balance -= 8115;
        // balance -= 8000;
        // balance -= 115;

        balance -= (8000 + 115);

        System.out.println("Current balance after withdraw: " + balance);

        // charity work 3 children homes equally distribute the amounts
        System.out.println("Remainder " + (balance % 3));
        // balance = balance / 3;
        double disbursement = (double) balance / 3;
        System.out.println("Amount to be disbursed: " + disbursement);

        int x = 10; // Basic assignment

        x += 5; // x = x + 5 → 15
        x -= 3; // x = x - 3 → 12
        x *= 2; // x = x * 2 → 24
        x /= 4; // x = x / 4 → 6
        x %= 4; // x = x % 4 → 2

        System.out.println("Final x: " + x);

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

// -----------(-128)-- (-127)----------------------------(127)----
// -----------(-128.000)--128.001-----------------------------(127)----