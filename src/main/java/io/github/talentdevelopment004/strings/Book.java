package io.github.talentdevelopment004.strings;

public class Book {
    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        String message = new String( "Book[name=" + name + ", author=" + author + "]");
        return message;
    }
}
