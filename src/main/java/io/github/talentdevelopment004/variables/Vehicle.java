package io.github.talentdevelopment004.variables;

import io.github.talentdevelopment004.variablescope.Car;

public class Vehicle extends Car {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setRegNo(12345);
        vehicle.getModel();
    }
    // anywhere within this class


}
