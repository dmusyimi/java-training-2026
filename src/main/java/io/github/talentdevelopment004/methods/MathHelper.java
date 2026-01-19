package io.github.talentdevelopment004.methods;

public class MathHelper {
    public static double calculateCircleArea(double radius) {
        final double PI = 3.14159;
        double result = PI * radius * radius; // Math.pow(radius,2);
        return result;
    }

    // factorial
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    // 5 -> 5*4*3*2*1 = 120

    public static void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }

    // adding operations overloading
    public static double add(double a, double b) {
        System.out.println("double add(double a, double b)");
        return a + b;
    }

    public static int add(int a, int b) {
        System.out.println("int add(int a, int b)");
        return a + b;
    }

    // based on number of parameters
    public static int add(int a, int b, int c) {
        System.out.println("int add(int a, int b, int c)");
        return a + b;
    }

    // based on different types
    public static long add(long a, long b) {
        System.out.println("long add(long a, long b)");
        return a + b;
    }

    public static void create(int id, String name) {
    }

    public static void create(String name, int id) {
    }
}
