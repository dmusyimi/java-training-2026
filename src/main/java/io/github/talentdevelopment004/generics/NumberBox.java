package io.github.talentdevelopment004.generics;

// Only accept types that are Number or subclasses ->  Upper Bounds (extends):
public class NumberBox<T extends Number> {
    private T number;

    public NumberBox(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }

    public double getSquare() {
        return number.doubleValue() * number.doubleValue();
    }

    // Can use Number methods safely
    public boolean isInteger() {
        return number instanceof Integer;
    }
}
