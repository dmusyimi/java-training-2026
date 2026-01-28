package io.github.talentdevelopment004.statickeyword;

import io.github.talentdevelopment004.methods.MathHelper;
import io.github.talentdevelopment004.polyabstract.Animal;

public class Main {
    static {
        System.out.println("Main class loaded");
    }

    public static void main(String[] args) {
        staticDemo();

        Animal animal = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Cow moos!!");

            }
        };

        animal.makeSound();
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.method();

        /*
         * System.out.println(Config.DB_PASSWORD);
         * var app = new Main();
         * app.connection(Config.DB_URL, Config.DB_USERNAME, Config.DB_PASSWORD);
         * DatabaseConfig.displayConfig();
         * DatabaseConfig.displayConfig();
         * 
         * System.out.println(MathUtility.Adder.add(23, 4, 5, 56, 78));
         * 
         * // nested static classes
         * System.out.println(MathUtility.AreaCalculator.circleArea(5));
         * // nested non-static classes
         * MathUtility mathUtility = new MathUtility();
         * NonStaticClass nonStaticClass = mathUtility.new NonStaticClass();
         * nonStaticClass.printMessage("guten morgen", "Eve");
         * LocalClassDemo localClassDemo = new LocalClassDemo();
         * localClassDemo.processData();
         */

    }

    private String connection(String dbUrl, String username, String password) {
        return "";
    }

    private static void staticDemo() {
        System.out.println(Employee.COMPANY_NAME);

        Employee wesMut = new Employee("Wesmut", 1);
        System.out.println(Employee.getEmployeeCount());
        Employee eve = new Employee("Eve", 2);

        System.out.println(Employee.getEmployeeCount());
        System.out.println(eve.getName());

        System.out.println((int) Math.pow(8, 2));
        MathHelper mathHelper = new MathHelper();
        System.out.println(MathHelper.calculateCircleArea(4));

    }
}