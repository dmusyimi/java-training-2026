package io.github.talentdevelopment004.polyabstract;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Dog extends Animal {


    @Override
    public void makeSound() {
        System.out.println( super.name + " is a dog and barks");
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public long sum(int a, int b) {
        return a+b;
    }

    @Override
    public void readFile() throws FileNotFoundException {

    }
}

//acceptable override
    // - parent class has a parent exception and
    // child class override by specifying a child exception

// this-> current class
// super -> parent class
