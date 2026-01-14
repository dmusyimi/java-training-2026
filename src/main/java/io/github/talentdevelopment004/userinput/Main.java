package io.github.talentdevelopment004.userinput;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        double balance = 0.0;

        // deposits
        Scanner scanner = new Scanner(System.in);

        // Scanner scanner = new Scanner(
        // Path.of("C:\\Users\\mhusika\\Desktop\\talentdevelopment004\\java-training\\test.txt"));

        System.out.print("Enter amount to deposit: ");
        double amountToDeposit = scanner.nextDouble();
        balance += amountToDeposit; // balance = balance + deposit
        System.out.println("Balance after deposit = " + balance);

        System.out.print("Enter withdrawal charges: ");
        double charges = scanner.nextDouble();

        System.out.print("Enter withdrawal amount: ");
        double withdrawal = scanner.nextDouble();
        scanner.nextLine(); // clear numbers buffer
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter age of customer: ");
        int customerAge = scanner.nextInt();

        System.out.println("Customer Age= " + customerAge);

        System.out.println(" You ATM at Service for " + customerName);

        balance = balance - (withdrawal + charges);

        System.out.println("Balance after withdrawal = " + balance);

        // close the scanner
        scanner.close();
    }
}
