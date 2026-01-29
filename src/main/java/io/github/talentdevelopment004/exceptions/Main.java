package io.github.talentdevelopment004.exceptions;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static Set<String> names = new HashSet<>(Set.of("John", "Mhusika", "Joy", "livingstone"));

    public static void main(String[] args) {
        // userInput();
        customExceptions();

    }

    private static void customExceptions() {
        // create a student
        try {
            createStudent("Joel", "001", "CS");
        } catch (StudentAlreadyExistsException exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
        // finding student by id
        findStudentByName("Amara");
        // update student
        // delete student
    }

    // throws is an informer to the compiler or dev on the kind of exception that a
    // method can raise
    public static void createStudent(String name, String regNo, String course) throws StudentAlreadyExistsException {
        if (names.contains(name)) {
            // throw is used to raise an alarm (create an exception)
            throw new StudentAlreadyExistsException("Student with name " + name + " already exists");

        }
        names.add(name);
        // throw an error if exists

    }

    public static String findStudentByName(String name) {
        if (names.contains(name)) {
            return name;

        }
        throw new StudentNotfoundException("Student with name " + name + " not found");

    }

    public static void userInput() {
        Scanner scanner = new Scanner(System.in);
        try {
            // happy path execution flow
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            if (age >= 18) {
                System.out.println("You can apply for ID");
            } else {
                System.out.println("You are still a minor");
            }
            System.out.print("Enter your name: ");
            System.out.println();
        } catch (InputMismatchException exception) {
            // handle the exception
            System.out.println("Exception happened");

        } finally {
            // close scanner
            System.out.println("Releasing scanner resources.....");
            scanner.close();
        }

    }

}
