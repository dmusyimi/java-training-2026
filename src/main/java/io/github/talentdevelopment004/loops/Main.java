package io.github.talentdevelopment004.loops;

import java.util.Scanner;

public class Main {
    // ! Stop copy pasting code you don't actually understand
    // * Build the coding confidence you need to become, a developer
    // * companies will fight for.

    public static void main(String[] args) {
        // forLoops();
        // whileLoop();
        // whileLoopWithCounter();
        // doWhileLoop();

        // breakingStatement();
        continueStatement();

    }

    static void continueStatement() { // skipping the loop counter

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Skip number 3
            }
            System.out.println("Processing: " + i);
        }

    }

    static void breakingStatement() {
        // list of numbers 1,25,85,96,36,78,12,8
        // search for a number 96
        int[] numbers = { 1, 25, 85, 96, 36, 78, 12, 8 };
        // 0, 1, 2.....
        // for()

        for (int counter = 0; counter < numbers.length; counter += 1) {
            int number = numbers[counter];

            if (number == 96) {
                System.out.println("Found the number" + counter);
                break;
            }
        }
        // using enhanced for loop
        int[] numbers2 = { 2, 4, 6, 8, 10, 12 };
        int searchFor = 100;
        for (int num : numbers2) {
            if (num == searchFor) {
                System.out.println("Found " + searchFor);
                break;
            }
            System.out.println("Still searching");
        }

    }

    static void doWhileLoop() {
        // do {

        // } while (condition);

        // Example: Menu system
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Play game");
            System.out.println("2. View scores");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            // Process choice here
        } while (choice != 3);
        scanner.close();
        System.out.println("Goodbye!");

    }

    static void whileLoopWithCounter() {
        int counter = 1;
        while (counter <= 5) {
            System.out.println("I love you Dad and Mum");
            counter++;

        }
    }

    static void whileLoop() {
        // show menu
        // *544#
        // 1. Tea
        // 2. Andazi
        // 3. Chapati
        // 4. Exit

        Scanner scanner = new Scanner(System.in);

        char key = 'a';
        // while loop
        while (key != 'q') {
            System.out.println("=======Mathews & Musyimi Hotels=====");
            System.out.println("1. Tea");
            System.out.println("2. Andazi");
            System.out.println("3. Chapati");
            System.out.println("q. Exit");
            System.out.print("Enter you pick: ");
            char choice = scanner.nextLine().charAt(0);
            if (choice == 'q') {
                key = 'q';
            } else {
                System.out.println("You have been server with " + choice);
            }

        }

        // close the scanner
        scanner.close();

    }

    static void forLoops() {

        // ? for ( initialExpression; testExpression; step(updateExpression))
        // 1,3,5
        for (int counter = 1; counter <= 5; counter = counter + 2) {
            // updated after use
            System.out.println("I love you Dad and Mum" + counter);
        }
        System.out.println("After the initial loop");
        for (int counter = 1; counter <= 5; counter += 2) {
            // updated after use
            System.out.println("I love you Dad and Mum" + counter);
        }

    }

    static void iLoveYouMumAndDad() {
        System.out.println("I love you Dad and Mum");
        System.out.println("I love you Dad and Mum");
        System.out.println("I love you Dad and Mum");
        System.out.println("I love you Dad and Mum");
        System.out.println("I love you Dad and Mum");
        System.out.println("I love you Dad and Mum");
        System.out.println("I love you Dad and Mum");
        System.out.println("I love you Dad and Mum");
        System.out.println("I love you Dad and Mum");
        System.out.println("I love you Dad and Mum");
        System.out.println("I love you Dad and Mum");
        System.out.println("I love you Dad and Mum");
        System.out.println("I love you Dad and Mum");
        System.out.println("I love you Dad and Mum");
        System.out.println("I love you Dad and Mum");
    }
}
