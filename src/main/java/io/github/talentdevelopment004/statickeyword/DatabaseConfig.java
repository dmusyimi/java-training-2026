package io.github.talentdevelopment004.statickeyword;

public class DatabaseConfig {
    // Static variables
    private static String databaseUrl;
    private static String username;
    private static String password;
    private static boolean isInitialized = false;
    
    // Static block - runs once when class is loaded
    static {
        System.out.println("Loading database configuration...");
        databaseUrl = "jdbc:mysql://localhost:3306/mydb";
        username = "admin";
        password = "secret";
        isInitialized = true;
        System.out.println("Database configuration loaded successfully");
    }
    
    // Static method
    public static void displayConfig() {
        if (isInitialized) {
            System.out.println("Database URL: " + databaseUrl);
            System.out.println("Username: " + username);
            // Don't print password for security
        } else {
            System.out.println("Configuration not initialized");
        }
    }
}