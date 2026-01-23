package io.github.talentdevelopment004.inheritance;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println( super.name + " is a dog and barks");
        super.makeSound();
    }


    public void setName(String name) {
        this.name = name;
    }
}

// this-> current class
// super -> parent class
