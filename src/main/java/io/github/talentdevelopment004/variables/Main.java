package io.github.talentdevelopment004.variables;

import io.github.talentdevelopment004.methods.MathHelper;

@SuppressWarnings("unused")
public class Main {
    public static void main(String[] args) {

        byte b = 127; // -128 to 127

        short a = -32768; // -32,768 to 32,767

        int age = 2147483647; // -2147483648 to 2147483647
        long pop = 7800000000L; // -9223372036854775808 to 9223372036854775807

        System.out.println(Long.MIN_VALUE);

        float price = 19.99f;
        double amount = 19.99;

        char grade = 'A';

        boolean isActive = false;

        int years = Integer.MAX_VALUE;

        long numberOfYears = years; // lower to higher type casting - Implicit (not directly expressed)

        short numOfYears = (short) years; // explicit - directly specified
        System.out.println(numOfYears);

        String number = "10000";

        int num = Integer.parseInt(number);
        Double.parseDouble(number);
        Float.parseFloat(number);
        MathHelper.printMessage("I love Java", 5);
    }
}
