package io.github.talentdevelopment004.variablescope;

public class Car {
    // Instance variables -> defined outside the methods but not using static
    // keyword
    // for you to access you have to create an object of the class

    // Instance variables (properties)
    // accessModifier dataType variableName;
    private int regNo;
    public String model;
    public String color;

    public void startEngine() {
        System.out.println("Car is started" + regNo);
    }

    public void stopEngine() {
        System.out.println("Car is stopped");
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getModel() {
        return model;
    }
}
