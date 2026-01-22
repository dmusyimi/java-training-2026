package io.github.talentdevelopment004.variablescope;

import io.github.talentdevelopment004.methods.MathHelper;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    // class variables - defined outside the methods, using static keyword

    public static String config = "/home/user/bin";
    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int result = MathHelper.addThreeNumbersDoubleType(2147483647.0, 1.0, 0);
        System.out.println(Integer.MAX_VALUE);
        // perform operations using scanner ......
        printVariables();
        // done
        scanner.close();
        System.out.println("result = " + result);

    }

    public static void printVariables() {
        scanner.nextDouble();
        System.out.println("config = " + config);
        int a = 20;
        System.out.println("a = " + a);
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 10) {
                System.out.println("i = " + i);
                System.out.println("a = " + a);
            }
        }
        System.out.println("i = " + a);
    }
    public void carInfo() {

        Car bmw = new Car();
        bmw.getRegNo();
        bmw.color = "red";
        bmw.model = "BMW";

        Car forester = new Car();
        forester.setRegNo(12);
        forester.color = "black";
        forester.model = "SUBARU";

        bmw.stopEngine();
        forester.startEngine();

    }
}

// FirstUpperca
