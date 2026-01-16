package io.github.talentdevelopment004.decisions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // idRegistration();

        // grading System
        // gradingSystem();

        switchSystem();

    }

    private static void switchSystem() {

        // Order processing PLACED, IN_PROGRESS, SHIPMENT

        String orderStatus = "In Progress";

        switch (orderStatus) {
            case "Placed":
                System.out.println("order is in placed status");
                break;
            case "In Progress":
                System.out.println("order is in progress status");
                break;
            case "shipment":
                System.out.println("order is in shipment status");
                break;
            default:
                break;
        }

        // java 14+
        switch (orderStatus) {
            case "Placed" -> System.out.println("order is in placed status");
            case "In Progress" -> System.out.println("order is in placed status");
            case "shipment" -> System.out.println("order is in placed status");
        }

        String response = "09";

        String result = switch (response) {
            case "01", "05" -> "Do not honor";
            case "03" -> "No Merchant";
            default -> {
                yield "unknown";
            }
        };

        System.out.println(result);

    }

    // >= 80 A
    // >= 70 B
    // >= 60 C
    // >= 50 D
    // <50 E

    private static void gradingSystem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you marks: ");
        int marks = scanner.nextInt();

        if (marks >= 80) {
            System.out.println("You got an A");
        } else if (marks >= 70) {
            System.out.println("You got an B");
        } else if (marks >= 60) {
            System.out.println("You got an C");
        } else if (marks >= 50) {
            System.out.println("You got an D");
        } else {
            System.out.println("You got an E");
        }
        scanner.close();

    }

    private static void idRegistration() {
        Scanner scanner = new Scanner(System.in);

        final int QUALIFICATION_AGE = 18;

        // Id registration
        System.out.print("Input your age: ");
        int age = scanner.nextInt(); // e.g 25\n
        scanner.nextLine(); // \n clear the \n character

        if (age >= QUALIFICATION_AGE) {
            // proceed with registration information gathering
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your location: ");
            String location = scanner.nextLine();

            // proceed other processing

            System.out.println("You are now registered: " + name + " at " + location);
        } else {
            // ELSE
            System.out.println("You are under age.");
        }
        System.out.println("After registration check");
        scanner.close();

        // banking system
        // loaning
        // Active
        // LoanRules
        // Amount limit check
    }
}
