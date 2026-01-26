package io.github.talentdevelopment004.polyabstract;

public class Main {
    public static void main(String[] args) {

//        overloadingPolymorphism();
//        overridingPolymorphism();

        Vehicle vehicle;

        Animal.animalFact();










    }

    private static void overridingPolymorphism() {
        //   overriding -> same method signature in subclass
        Animal cat = new Cat();
        cat.name = "Jemmo";

        Animal dog = new Dog();
        dog.name = "Bosco";

        Main app = new Main();


        app.printInfo(cat);
        app.printInfo(dog);
    }

    private static void overloadingPolymorphism() {
        // overloading -> different size,type and order of parameters
        MathOperations math = new MathOperations();
        System.out.println(math.add(10, 20));
        System.out.println(math.add(10, 20,20));
        System.out.println(math.add(10, 20,20,34,56,78,89));
        System.out.println(math.add(new int[]{20,34,56,78,89}));
        System.out.println(math.add(new double[]{20,34,56,78,89}));
    }

    public void printInfo(Animal animal) {
        animal.makeSound(); // runtime function invoking
    }
}
