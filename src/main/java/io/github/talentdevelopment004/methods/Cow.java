package io.github.talentdevelopment004.methods;

import io.github.talentdevelopment004.inheritance.Animal;

public class Cow extends Animal {

    @Override
    public void makeSound() {
        System.out.println( name + " is a cow and mows");
    }
}

