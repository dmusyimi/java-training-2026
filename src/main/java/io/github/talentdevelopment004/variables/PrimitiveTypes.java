package io.github.talentdevelopment004.variables;

public class PrimitiveTypes {
    public static void main(String[] args) {
        // Integer types
        int age = 25;
        long bigNumber = 123456789L;

        // Decimal types
        float price = 19.99f;
        double precise = 3.1415926535;

        // Character and boolean
        char grade = 'A';
        boolean isJavaFun = true;

        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);

        String name = "John Doe";
        System.out.println(name);

        int[] scores = { 90, 85, 95 };

        int[] marks = new int[10];

        Student amara = new Student("Amara", 23);

        System.out.println(amara.getAge());

        var years = 23;

        // Constants
        // final int DOZEN = 12;
        int DOZEN = 12;

        DOZEN = 23;

        System.out.println(DOZEN);

    }
}