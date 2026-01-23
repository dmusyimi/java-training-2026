package io.github.talentdevelopment004.methods;

public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow();


        // withoutMethods();
        reusableAreaCalculation();
        var result = MathHelper.factorial(5);

        System.out.println("factorial of 5 = " + result);
        System.out.println("factorial of 1 = " + MathHelper.factorial(1));
        MathHelper.printMessage("I love Java", 5);

        System.out.println(MathHelper.add(5, 10));
        System.out.println(MathHelper.add(5.0, 10.0));
        System.out.println(MathHelper.add(5L, 10L));
    }

    public static void reusableAreaCalculation() {
        System.out.println("Area of a circle with radius 5.0 = " + MathHelper.calculateCircleArea(5.0));
        System.out.println("Area of a circle with radius 7.0 = " + MathHelper.calculateCircleArea(7.0));
        System.out.println("Area of a circle with radius 10.0 = " + MathHelper.calculateCircleArea(10.0));
    }

    public static void withoutMethods() {
        // Calculate area of circle
        final double PI = 3.14159;

        // PI*r^2
        double radius1 = 5.0;
        double area1 = PI * radius1 * radius1;
        System.out.println("Area: " + area1);

        // Calculate area again
        double radius2 = 7.0;
        double area2 = PI * radius2 * radius2;
        System.out.println("Area: " + area2);

        // And again...
        double radius3 = 10.0;
        double area3 = PI * radius3 * radius3;
        System.out.println("Area: " + area3);
    }

    // Method declaration syntax:
    // accessModifier static returnType methodName(parameterType parameterName) {
    // method body - code to execute
    // return value; // if return type is not void
    // }

    // accessModifier -> public protected packagePrivate, private
    // static -> optional, only needed when you don't want to create an object of
    // the class before you can access the method.
    // returnType -> data types (primitive, reference types, void) -> determines the
    // kind
    // of value that is going to be returned by the method
    // methodName -> name of the method
    // (arguments) ->(input variables to the method) parameters that are sent
    // dynamically when calling the method
    // { .... //statements to execute }

}
