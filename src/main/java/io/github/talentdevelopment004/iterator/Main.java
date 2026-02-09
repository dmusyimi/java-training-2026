package io.github.talentdevelopment004.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("English", "0002", 2015, "John Makasky"));
        books.add(new Book("Kiswahili", "0003", 2016, "Roy Fabisky"));
        books.add(new Book("Social Studies", "0004", 2016, "Pamela White"));
        books.add(new Book("Social Studies", "0004", 2016, "Pamela White"));

        // for (Book book : books) {
        // System.out.println("Book: " + book);
        // // Cannot remove elements here - would throw ConcurrentModificationException
        // if (book.getName().equals("Kiswahili")) {
        // books.remove(book); // Runtime exception
        // }
        // }
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book);
            if (book.getName().equals("Kiswahili")) {
                iterator.remove(); // Runtime exception
            }
        }

        // System.out.println("book size: " + books.size());

        // List<String> colors = Arrays.asList("Red", "Green", "Blue", "Yellow");
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        // Iterator with safe removal
        System.out.println("\n=== Iterator with Removal ===");
        Iterator<String> stringIterator = colors.iterator();
        while (stringIterator.hasNext()) {
            String color = stringIterator.next();
            System.out.println("Color: " + color);
            if (color.equals("Green")) {
                stringIterator.remove(); // Safe removal
            }
        }

        // System.out.println("processing by List iterator");
        // ListIterator<Book> listIterator = books.listIterator(3);
        // while (listIterator.hasPrevious()) {
        // System.out.println(listIterator.previous());
        // System.out.println(listIterator.previousIndex());

        // }

    }
}
