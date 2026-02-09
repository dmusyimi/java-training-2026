package io.github.talentdevelopment004.lambda;

import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

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
