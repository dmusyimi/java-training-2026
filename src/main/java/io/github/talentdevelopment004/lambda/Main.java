package io.github.talentdevelopment004.lambda;

import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        // lambdaSyntaxAndFunctionalInterface();
        commonBuiltInFunctionalInterfaces();

    }

    private static void commonBuiltInFunctionalInterfaces() {
        System.out.println("=================Predicates===========");
        predicates();
        System.out.println("=================Functions===========");
        functions();
        System.out.println("=================Consumers===========");
        consumers();
        System.out.println("=================Supplier===========");
        suppliers();
        System.out.println("=================UnaryOperator===========");
        unaryOperators();
        System.out.println("=================UnaryOperator===========");
        binaryOperators();

    }

    private static void binaryOperators() {
        BinaryOperator<Integer> productBinaryOperator = (firstNumber, secondNumber) -> firstNumber * secondNumber;

        System.out.println(productBinaryOperator.apply(3, 9));

    }

    private static void unaryOperators() {
        List<String> myListOfStrings = List.of(" I love java programming", "Java is cool ", " MyPassword ");
        UnaryOperator<String> unaryOperator = t -> t.toLowerCase();
        for (String string : myListOfStrings) {
            System.out.println(string + " -> " + unaryOperator.apply(string));
        }

    }

    private static void suppliers() {
        Supplier<RuntimeException> supplier = () -> new RuntimeException("my supplied exception");
        System.out.println(supplier.get().getLocalizedMessage());

    }

    private static void consumers() {

        List<Phone> phones = List.of(
                new Phone("Samsung A35", "Samsung", 2025),
                new Phone("Red magic", "RedMg", 2024),
                new Phone("OnePlus", "one+", 2026)

        );
        Consumer<Phone> phoneConsumer = phone -> System.out.println(phone.getName() + " " + phone.getYear());
        // for (Phone phone : phones) {
        // phoneConsumer.accept(phone);
        // }
        phones.forEach(phoneConsumer);

        phones.forEach(phone -> System.out.println(phone.getName().toUpperCase()));

    }

    private static void functions() {
        Function<String, Integer> function = t -> t.trim().length();

        List<String> myListOfStrings = List.of(" I love java programming", "Java is cool ", " MyPassword ");

        for (String string : myListOfStrings) {
            System.out.println(string + " has trimmed length " + string.length() + " -> " + function.apply(string));
        }

        Function<String, String> upperFunction = t -> t.toUpperCase();
        for (String string : myListOfStrings) {
            System.out.println(string + " -> " + upperFunction.apply(string));
        }

    }

    private static void predicates() {
        Predicate<Integer> isEvenPredicate = t -> t % 2 == 0;

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);

        for (Integer num : numbers) {
            System.out.println(num + " is even -> " + isEvenPredicate.test(num));
        }
    }

    private static void lambdaSyntaxAndFunctionalInterface() {
        Export pdfExport = new PdfExport();
        pdfExport.export("I have learnt interesting Java topics");

        Export powerPoint = new PptExport();
        powerPoint.export("I am becoming....");

        Export htmlExport = new Export() {

            @Override
            public void export(String content) {
                System.out.println("Exporting to HTML " + content);
            }

        };

        htmlExport.export("Java is awesome, although challenging");

        Export pngExport = (content) -> System.out.println("Exporting to PNG " + content);
        pngExport.export("This is an awesome image");

        // More parameters

        Printer printer = new Printer() {
            @Override
            public String print(String content, String path) {
                System.out.println("Printing " + content + " to " + path);
                return "Success";
            }
        };

        Printer printerInLambda = (content, path) -> {
            System.out.println("Printing " + content + " to " + path);
            return "Success";
        };

        printerInLambda.print("Hello World", "Console");

        Printer printerInLambda2 = (content, path) -> {
            System.out.println("Printing " + content + " to " + path);
            return "Success";
        };

        Printer printerInLambda3 = (name, age) -> {
            String message = name + " is " + age + " years old";
            System.out.println(message);
            return message;
        };

        // 4. Lambda with return statement
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares = new ArrayList<>();
        numbers.forEach(n -> {
            int square = n * n;
            squares.add(square);
        });

        System.out.println("\nSNumbers: " + numbers);
        System.out.println("\nSquares: " + squares);

        Month month = Month.DECEMBER;

        switch (month) {
            case DECEMBER -> {
                System.out.println("Hello World");
                System.out.println("Hello World");
                System.out.println("Hello World");
                System.out.println("Hello World");

            }
            case NOVEMBER -> pngExport.export("This is an awesome image");
            default -> htmlExport.export("Java is awesome, although challenging");
        }
    }
}
