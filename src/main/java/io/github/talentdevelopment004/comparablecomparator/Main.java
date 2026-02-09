package io.github.talentdevelopment004.comparablecomparator;

import java.util.*;

import io.github.talentdevelopment004.datastructures.lists.Account;

public class Main {
    public static void main(String[] args) {
        // demoComparable();

        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("Assets", "001", 0.0));
        accounts.add(new Account("Liability", "002", 0.0));
        accounts.add(new Account("Equity", "003", 0.0));
        accounts.add(new Account("Profit and Loss", "004", 0.0));
        System.out.println(accounts);
        System.out.println("After sorting");
//        Collections.sort(accounts, new AccountComparator()); // accounts.sort(new AccountComparator());
        accounts.sort((o1, o2) -> o1.getAccountName().compareTo(o2.getAccountName()));
        Comparator<Account> accountComparator = (Account o1, Account o2) -> o1.getAccountName().compareTo(o2.getAccountName());

        accounts.sort(accountComparator);

        System.out.println(accounts);

    }

    private static void demoComparable() {
        List<String> names = Arrays.asList("John", "Alice", "Aliz", "Bob", "Alice");
        Collections.sort(names);
        System.out.println(names);

        List<Book> books = new ArrayList<>();
        books.add(new Book("English", "0002", 2015, "John Makasky"));
        books.add(new Book("Kiswahili", "0003", 2016, "Roy Fabisky"));
        books.add(new Book("Arts", "0004", 2010, "Pamela White"));
        var book = new Book("Science", "0006", 2010, "Hoswell Nyoike");
        books.add(book);

        System.out.println("Before sorting");
        System.out.println(books);
        System.out.println("After sorting");
        Collections.sort(books);
        System.out.println(books);
    }
}
