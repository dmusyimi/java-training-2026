package io.github.talentdevelopment004.exceptions;

public class ExceptionPropagation {
    public static void main(String[] args) {
        try {
            methodA();
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e.getMessage());
            System.out.println("Stack trace:");
            e.printStackTrace();
        }
    }
    
    public static void methodA() {
        System.out.println("Method A calling Method B");
        methodB();  // Exception propagates from B to A to main
        System.out.println("Method A completed");  // Won't execute if exception occurs
    }
    
    public static void methodB() {
        System.out.println("Method B calling Method C");
        methodC();  // Exception thrown here
        System.out.println("Method B completed");  // Won't execute
    }
    
    public static void methodC() {
        System.out.println("Method C throwing exception");
        throw new RuntimeException("Error from Method C");
    }
}