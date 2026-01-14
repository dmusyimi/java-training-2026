package io.github.talentdevelopment004.operators;

public class Main {
    public static void main(String[] args) {
        // arithmeticOperators();
        // assignmentOperators();
        // comparisonOperators();
        // logicalOperators();
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
        int a = 10, b = 5, c = 10;
        System.out.println("Comparison Operations on a=" + a + ", b=" + b + " c=" + c);
        System.out.println("a == c: " + (a == c)); // true
        System.out.println("a != b: " + (a != b)); // true
        System.out.println("a > b: " + (a > b)); // true
        System.out.println("a < b: " + (a < b)); // false
        System.out.println("a >= c: " + (a >= c)); // true
        System.out.println("b <= a: " + (b <= a)); // true

        // For objects, use .equals() instead of ==
        String s1 = "hello";
        String s2 = "hello";

        // reference
        System.out.println("Strings equal: " + s1.equals(s2)); // true

    }

    public static void logicalOperators() {
        System.out.println("=================logicalOperators================");
        int balance = 10000;
        int charges = 115;

        int withdrawalAmount = 10000;

        // condition withdrawalAmount+charges <= balance

        // meet charges
        // correct pin

        boolean isAbleToWithdraw = (withdrawalAmount + charges) <= balance;
        boolean isLoggedIn = false;

        System.out.println("You can withdraw(&&): " + (isAbleToWithdraw && isLoggedIn));

        // A && B
        // T and T -> T
        // T and F -> F
        // F and T -> F
        // F and F -> F

        // using OR -> ||

        System.out.println("isLoggedIn or isAbleToWithdraw: " + (isLoggedIn || isAbleToWithdraw));
        // NOT !

        System.out.println(" isAbleToWithdraw: " + !isAbleToWithdraw);
        System.out.println(" isLoggedIn: " + !isLoggedIn);
    }

    public static void incrementDecrementOperators() {
        System.out.println("=================incrementDecrementOperators================");
        int a = 5;

        // System.out.println("++a=" + (++a)); // 6
        System.out.println("++a=" + (a++)); // 5

    }

}

// -----------(-128)-- (-127)----------------------------(127)----
// -----------(-128.000)--128.001-----------------------------(127)----