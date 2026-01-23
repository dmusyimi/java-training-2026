package io.github.talentdevelopment004.inheritance;

public class Animal {

   protected String name;

    public void makeSound() {
        System.out.println("Animal makes sound"+name);
    }

}
// overloading -> different size,type and order of parameters
// overriding -> same method signature in subclass