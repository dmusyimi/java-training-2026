package io.github.talentdevelopment004.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        newWay();
    }

    private static void newWay() {

        try (RandomInput randomInput = new RandomInput()) {
            System.out.println("Processing data");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    private static void oldWay() {
        // Old way - manual resource management
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Error closing file: " + e.getMessage());
                }
            }
        }
    }
}