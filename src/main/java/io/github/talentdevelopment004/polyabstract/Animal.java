package io.github.talentdevelopment004.polyabstract;

import java.io.FileNotFoundException;
import java.io.IOException;

public abstract  class Animal {

   protected String name;

    public abstract void makeSound() ;
//    public abstract void sleep() ;

    protected long sum(int a, int b) {
        return a+b;

    }

    public void readFile() throws IOException {

    }
    public static void animalFact() {
        System.out.println("All animals need food and water");
    }
}
// overloading -> different size,type and order of parameters
// overriding -> same method signature in subclass