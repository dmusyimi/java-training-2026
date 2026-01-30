package io.github.talentdevelopment004.interfaces;

public class LaptopCharger implements ThreePinPlug, StudentService {

    @Override
    public void accessPower() {
        System.out.println("Access Power called: Laptop");
    }

    @Override
    public void printUsage() {

    }

    @Override
    public void checkStatus() {

        System.out.println("Laptop Charger implementation for checking status");
    }

    @Override
    public void addStudent(Student student) {

    }

    @Override
    public void removeStudent(Student student) {

    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public Student getStudent(int id) {
        return null;
    }
}
