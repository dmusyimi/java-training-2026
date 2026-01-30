package io.github.talentdevelopment004.strings;

public class Main {
    public static void main(String[] args) {
//        stringConcatenation();
        garbageCollection();
    }

    private static void stringConcatenation() {
        // Concatenation
        System.out.println(1 + 2 + " John"); // 12John 3John 3John
        System.out.println("John " + 1 + 2);// John12 John3 John12

        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four); // 64
    }

    public static void garbageCollection() {
            Book book =new Book("Study Guide","Jeane");
            Book book1 =new Book("Study Guide","Jeane");
            print(book1);
            book1=null;
            print(book);

    }
    public static  void print(Book book) {
        System.out.println(book);
    }
}
