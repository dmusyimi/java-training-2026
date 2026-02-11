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
//        commonBuiltInFunctionalInterfaces();
        effectiveFinalVariables();
    }
//    private   static  String prefix ="Mr. ";
    private static void effectiveFinalVariables() {
         String prefix = "Mr."; // effectively
        Consumer<String> consumer = s-> {
//            prefix = "test"; //throws an compilation error 
            System.out.println(prefix + s);
        };
        List<String> list = List.of("Abednego", "Mathew", "Ezra");
        list.forEach(consumer);

        // Static variable capture - no restrictions
        Supplier<String> staticSupplier = () -> "Static value: " + StaticCounter.count;
        System.out.println(staticSupplier.get());
    }
    class StaticCounter {
        public static int count = 0;
    }
    private static void commonBuiltInFunctionalInterfaces() {
        System.out.println("=================Predicates===========");
        predicates();
        System.out.println("=================Functions===========");
        functions();
        System.out.println("=================Consumers===========");
//        Main main = new Main();
//        main.consumers();
        consumers();
        System.out.println("=================Supplier===========");
        suppliers();
        System.out.println("=================UnaryOperator===========");
        unaryOperators();
        System.out.println("=================UnaryOperator===========");
        binaryOperators();
        consumeIntegers(
                (t) -> System.out.println(t + "^2=" + Math.pow(t, 2)),
                List.of(1, 2, 3, 4, 5, 6, 7, 8));
        List<Phone> phones = List.of(
                new Phone("Samsung A35", "Samsung", 2025),
                new Phone("Red magic", "RedMg", 2024),
                new Phone("OnePlus", "one+", 2026)

        );
        for (Phone phone : phones) {
            predicatePhone(t -> t.getYear() == 2026, phone);
        }

    }

    private static void predicatePhone(Predicate<Phone> phonePredicate, Phone phone) {
        System.out.println(phone.getName() + " New phone?=> " + phonePredicate.test(phone));
    }

    private static void consumeIntegers(Consumer<Integer> integerConsumer, List<Integer> numbers) {
        for (Integer integer : numbers) {
            integerConsumer.accept(integer);
        }

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
        System.out.println("========================Method References start======");
        phones.forEach(phone -> Utility.printToLowerCase(phone));

        phones.forEach( Utility::printToLowerCase);
        phones.forEach( Main::printPhoneNameLength); // when the function is static
        phones.forEach(phone -> System.out.println(phone.getName()));
        System.out.println("========================Method References End======");
        String prefix = "Hello ";
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(prefix::concat); // Equivalent to: s -> prefix.concat(s)
        Main app = new Main();
        names.forEach(app::printListOfNames);
    }
    void nonStaticCodeBlock(){
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(this::printListOfNames); // Equivalent to: s -> prefix.concat(s)
    }
    void  printListOfNames(String name){
        System.out.println(name);
    }

    public static void printPhoneNameLength(Phone phone) {
        System.out.println(phone.getName().length());
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
