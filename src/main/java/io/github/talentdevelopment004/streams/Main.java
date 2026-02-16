package io.github.talentdevelopment004.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // beforeStreams();
        // withStreams();
        // streamCreation();

        // filteringOperations();
        // mappingOperations();

        // List<String> listVal = List.of("Joe", "Paul", "Alice", "Tom");
        // System.out.println(
        // listVal.stream()
        // .filter(x -> x.length() > 3)
        // .mapToInt(x -> x.length())
        // .sum());
        // sortingAndPeeking();
        terminalOperations();

    }

    private static void terminalOperations() {
        // collectionTerminalOperations();
        // reducingOperations();
        findingMatchingOperations();

    }

    private static void findingMatchingOperations() {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 1. anyMatch() - true if any element matches
        boolean hasEven = numbers.stream().anyMatch(n -> {
            System.out.println("Any Match processing: " + n);
            return n % 2 == 0;
        });
        System.out.println("Has even numbers: " + hasEven);

        // 2. allMatch() - true if all elements match
        boolean allPositive = numbers.stream().allMatch(n -> {
            System.out.println("All Match processing: " + n);
            return n > 0;
        });
        System.out.println("All positive: " + allPositive);

    }

    private static void reducingOperations() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        BinaryOperator<Integer> binaryOperator = (t, u) -> t + u;
        // 1. reduce() - custom reduction
        Optional<Integer> sum = numbers.stream()
                .reduce(binaryOperator);

        Integer sumWithIdentity = numbers.stream()
                .reduce(0, binaryOperator);

        BiFunction<Integer, Integer, Integer> accumulator = (t1, t2) -> {
            System.out.println("Accumulation:  (" + t1 + " + " + t2 + ")");
            return t1 + t2;
        };
        BinaryOperator<Integer> combiner = (t1, t2) -> {
            System.out.println("Combiner:  (" + t1 + " + " + t2 + ")");
            return t1 + t2;
        };
        Integer sumWithIdentityAccumulatorCombiner = numbers.stream()
                .reduce(0, accumulator, combiner);

        System.out.println(sum.orElse(0));
        System.out.println(sumWithIdentity);
        System.out.println(sumWithIdentityAccumulatorCombiner);
    }

    private static void collectionTerminalOperations() {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Introduction", "Roy"));
        Book mastery = new Book("Mastery", "Sharon");
        bookList.add(mastery);
        bookList.add(mastery);
        bookList.add(new Book("Kidagaa kimemwozea", "Gideon"));
        bookList.add(new Book("Mstahiki Meya", "Joy"));

        List<Book> filteredBooks = bookList.stream()
                .filter(book -> book.getName().length() > 7)
                .collect(Collectors.toList());
        System.out.println(filteredBooks);

        Map<String, List<Book>> collect = bookList.stream()
                .collect(Collectors.groupingBy(Book::getName));

        System.out.println(collect);

        Set<Book> collect2 = bookList.stream()
                .collect(Collectors.toSet());
        System.out.println("=================Set====================");
        System.out.println(collect2);
    }

    private static void sortingAndPeeking() {
        List<String> names = Arrays.asList("Charlie", "Alice", "David", "Bob");
        Stream<String> nameStream = names.stream();
        // PEEK
        // nameStream.peek(name -> System.out.println("Before Map: " + name))
        // .map(String::toUpperCase)
        // .peek(name -> System.out.println("After Map: " + name))
        // .collect(Collectors.toList());

        // SORTING
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Introduction", "Roy"));
        bookList.add(new Book("Mastery", "Sharon"));
        bookList.add(new Book("Mastery", "Fian"));
        bookList.add(new Book("Kidagaa kimemwozea", "Gideon"));
        bookList.add(new Book("Mstahiki Meya", "Joy"));
        System.out.println("Before Sorting: " + bookList);

        Comparator<Book> bookComparatorUsingName = (o1, o2) -> o1.getName().compareTo(o2.getName());
        Comparator<Book> bookComparatorUsingAuthor = (o1, o2) -> o1.getAuthor().compareTo(o2.getAuthor());

        Comparator<Book> comparing = Comparator.comparing(Book::getAuthor);
        Comparator<Book> bookReverse = (o1, o2) -> {
            if (o1 == o2) {
                return 0;
            }
            if (o1.getAuthor().length() == o2.getAuthor().length()) {
                return 0;
            } else if (o1.getAuthor().length() < o2.getAuthor().length()) {
                return 1;
            } else {
                return -1;
            }
        };
        List<Book> sortedList = bookList.stream()
                // .sorted(bookComparator) // using book name
                // .sorted(bookComparatorUsingAuthor)
                // .sorted(Comparator.comparing(Book::getName))
                // .sorted(bookReverse)
                .sorted(bookComparatorUsingName.thenComparing(bookComparatorUsingAuthor))
                .collect(Collectors.toList());
        System.out.println("Sorted: " + sortedList);

    }

    private static void mappingOperations() {
        ArrayList<Book> englishBookList = new ArrayList<>();
        englishBookList.add(new Book("Introduction", "Roy"));
        englishBookList.add(new Book("Mastery", "Sharon"));

        ArrayList<Book> swahiliBookList = new ArrayList<>();
        swahiliBookList.add(new Book("Kidagaa kimemwozea", "Gideon"));
        swahiliBookList.add(new Book("Mstahiki Meya", "Joy"));
        List<String> bookNames = englishBookList.stream()
                .map(book -> book.getName())
                .collect(Collectors.toList());
        System.out.println(bookNames);

        List<List<Book>> books = new ArrayList<>();
        books.add(swahiliBookList);
        books.add(englishBookList);

        List<Book> combinedList = books.stream()
                .flatMap(list -> list.stream())
                .peek(System.out::println)
                .collect(Collectors.toList());
        System.out.println(combinedList);

    }

    private static void filteringOperations() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Anna", "Alex", "Alex");
        Predicate<String> namesStartingWithA = name -> name.startsWith("A");
        Consumer<String> cons = name -> System.out.println("After Filter " + name);

        names.stream()
                .skip(2)
                .peek(name -> System.out.println("Before TakeWhile " + name))
                // .takeWhile(namesStartingWithA)
                .peek(name -> System.out.println("Before Filter " + name))
                .filter(namesStartingWithA)
                .peek(cons)
                .distinct()
                .collect(Collectors.toList());

    }

    private static void streamCreation() {
        Stream<Double> stream = Stream.generate(() -> Math.random()).limit(5);
        UnaryOperator<Integer> operator = (t) -> t + 1;
        // int -> Integer
        IntStream intStream = IntStream.range(1, 6); // 1,2,3,4,5
        System.out.println("Range: " + intStream.boxed().collect(Collectors.toList()));
    }

    private static void withStreams() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Anna");

        Predicate<String> namesStartingWithA = name -> name.startsWith("A");

        Function<String, String> toUpperCaseFunction = name -> {
            System.out.println(name);
            // try {
            // Thread.sleep(2000);
            // } catch (InterruptedException e) {
            // throw new RuntimeException(e);
            // }
            return name.toUpperCase();
        }; // String::toUpperCase;

        // Find names starting with 'A' and convert to uppercase
        Stream<String> namesStream = names.stream();
        List<String> result = namesStream
                .filter(namesStartingWithA)
                .map(toUpperCaseFunction)
                .collect(Collectors.toList());

        System.out.println(result);
        Function<String, Integer> toIntLength = name -> name.length(); // String::length
        BinaryOperator<Integer> sumOperator = (a, b) -> {
            System.out.println("Performing operation for  " + a + " and " + b);
            return a + b;
        };
        BiFunction<Integer, Integer, Integer> additionOperator = (a, b) -> {
            System.out.println("Performing operation for  " + a + " and " + b);
            return a + b;
        };

        // Calculate total length of names
        int totalLength = names.stream()
                .map(toIntLength)
                .reduce(0, sumOperator);
        System.out.println(totalLength);

        // Calculate total length of names
        ToIntFunction<String> toIntFunction = String::length;

        IntBinaryOperator intOperator = (a, b) -> a + b;

        int totalLength2 = names.stream()
                .mapToInt(toIntFunction)
                .sum();

        // Find the longest name
        Optional<String> longestName = names.stream()
                .max(Comparator.comparing(String::length));

    }

    private static void beforeStreams() {
        // **Traditional Imperative Approach:**
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Anna");

        // Find names starting with 'A' and convert to uppercase
        List<String> result = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith("A")) {
                result.add(name.toUpperCase());
            }
        }
        System.out.println(names);
        System.out.println(result);

        // Calculate total length of names
        int totalLength = 0;
        for (String name : names) {
            totalLength += name.length();
        }
        System.out.println(totalLength);
        // Find the longest name
        String longestName = "";
        for (String name : names) {
            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }
        System.out.println(longestName);
    }
}
