package io.github.talentdevelopment004.datastructures.lists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // accountsDemo();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(67);
        numbers.add(98);
        numbers.add(12);
        numbers.add(15);
        numbers.add(null);
        numbers.add(58);
        numbers.add(12);

        System.out.println(numbers);
        numbers.set(4, 45);
        System.out.println(numbers);
        // numbers.sort();
        numbers.remove(Integer.valueOf(12));
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == 12) {
                System.out.println("got the number at index" + i);
                break;
            }
        }
    }

    private static void accountsDemo() {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("Assets", "001", 0.0));
        accounts.add(new Account("Liability", "002", 0.0));
        System.out.println(accounts);
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}
