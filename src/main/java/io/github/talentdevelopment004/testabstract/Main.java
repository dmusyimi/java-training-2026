package io.github.talentdevelopment004.testabstract;


import io.github.talentdevelopment004.polyabstract.BankManager;

public class Main {
    public static void main(String[] args) {
        BankManager bankManager = new BankManager();
        System.out.println( bankManager.processLoan(1_000_000,"002"));
    }
}
