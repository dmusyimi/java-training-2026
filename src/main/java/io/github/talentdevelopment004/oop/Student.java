package io.github.talentdevelopment004.oop;

public class Student {
    public String name;
    public int age;

    public Student() {

    }

    public Student(String studentName, int studentAge) {
        // this refers to the instance variable
        age = studentAge;
        name = studentName;

    }

    public Student(int age, String name) {
        // this refers to the instance variable
        this.age = age;
        this.name = name;

    }

    public void displayInfo() {
        System.out.println(name + "-" + age + " ->");
    }
}
