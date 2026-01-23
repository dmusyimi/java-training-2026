package io.github.talentdevelopment004.inheritance;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Bosco";
        Cat cat = new Cat();
        cat.name = "Jemo";

        Animal animal = new Animal();


        dog.makeSound();

        cat.makeSound();


    }
}
