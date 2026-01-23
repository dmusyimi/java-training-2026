package io.github.talentdevelopment004.encapsulation;

public class BankAccount {
    private double balance;
    private String accountNumber;
    private boolean active;

    public BankAccount(double balance, String accountNumber) {
        this.accountNumber = accountNumber;
        this.setBalance(balance);
    }

    public void printInfo() {
        System.out.println(accountNumber + "->" + balance + "-state-" + active);
        // Io.println

    }

    public double getBalance() { // read only
        return this.balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) { // data validation
            this.balance = balance;

        } else {
            throw new RuntimeException("Balance cannot be negative");
        }
    }

    // setter
    public void setActive(boolean active) {
        this.active = active;
    }

    // boolean accessor is_variable name
    public boolean isActive() {
        return this.active;
    }

}
