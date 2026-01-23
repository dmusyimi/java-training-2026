package io.github.talentdevelopment004.encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000.0, "001");
        bankAccount.printInfo();
        // bankAccount.balance = -1000;
        bankAccount.setBalance(500);
        // bankAccount.printInfo();
        bankAccount.setActive(true);
        System.out.println(bankAccount.getBalance());
        System.out.println(bankAccount.isActive());

        // 001->-1000.0
        Person person = new Person();
        person.setName("Purity Waithera");


    }
}
