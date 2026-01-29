package io.github.talentdevelopment004.exceptions;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        try {
            // Multiple potential exceptions
            String input = args[0];  // ArrayIndexOutOfBoundsException if no args
            int number = Integer.parseInt(input);  // NumberFormatException if not a number
            int result = 100 / number;  // ArithmeticException if zero
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Please provide a command-line argument");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please provide a valid integer");
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }
       // general exception
        catch (Exception e) {
            System.out.println("Error: Something unexpected happened: " + e.getMessage());
        }

        System.out.println("Program completed");
    }
}