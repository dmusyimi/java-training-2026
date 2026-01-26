package io.github.talentdevelopment004.polyabstract;

// Abstract class - cannot create objects of this class
public abstract class Vehicle {
    protected String brand;
    protected int year;
    
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    
    // Concrete method - has implementation
    public void displayInfo() {
        System.out.println(year + " " + brand);
    }
    
    // Abstract method - no implementation, must be overridden
    public abstract void start();
    public abstract void stop();
    
    // Can have both abstract and concrete methods
    public void honk() {
        System.out.println("Beep beep!");
    }
}