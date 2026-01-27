package io.github.talentdevelopment004.inheritance;

import io.github.talentdevelopment004.statickeyword.Config;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Bosco";
        Cat cat = new Cat();
        cat.name = "Jemo";

        Animal animal = new Animal();

        dog.makeSound();

        cat.makeSound();

        var app = new Main();
        app.connection(Config.DB_URL, Config.DB_USERNAME, Config.DB_PASSWORD);
    }

    private String connection(String dbUrl, String username, String password) {
        return "";
    }

}
