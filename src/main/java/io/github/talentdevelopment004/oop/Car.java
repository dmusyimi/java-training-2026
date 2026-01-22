package io.github.talentdevelopment004.oop;

public class Car {
    public String brand;
    public String model;
    public int year;

    // Constructor using this
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method using this
    public void displayInfo() {
        System.out.println(year + " " + brand + " " + model);
    }

    // Method comparing objects using this
    public boolean isNewerThan(Car otherCar) {
        return this.year > otherCar.year;
    }
}