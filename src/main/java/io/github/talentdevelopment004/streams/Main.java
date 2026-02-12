package io.github.talentdevelopment004.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // beforeStreams();
        withStreams();
    }

    private static void withStreams() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Anna");

        Predicate<String> namesStartingWithA = name -> name.startsWith("A");

        Function<String, String> toUpperCaseFunction = name -> {
            System.out.println(name);
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
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
        BiFunction<Integer, Integer, Integer> additionOperator =(a, b) -> {
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

        IntBinaryOperator intOperator   =  (a, b) -> a + b;

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
