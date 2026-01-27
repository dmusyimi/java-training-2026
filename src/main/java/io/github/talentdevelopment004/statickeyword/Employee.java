package io.github.talentdevelopment004.statickeyword;

public class Employee {
    // Instance variables - unique to each object
    private String name;
    private int id;
    // Static variable - shared by all Employee objects
    private static int employeeCount = 0;
    // Constants - static final
    public static final String COMPANY_NAME = "Tech Corp";

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++; // Increment shared counter
    }// Getters

    public String getName() {

        return name;
    }

    public int getId() {
        return id;
    }

    // Static method to access static variable
    public static int getEmployeeCount() {

        return employeeCount;
    }
}
