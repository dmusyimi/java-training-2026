package io.github.talentdevelopment004.statickeyword;

class Outer {
    private String instanceVar = "instance";
    private static String staticVar = "static";
    
     class Inner {
         void method() { System.out.println(staticVar); }  //  OK
         static void staticMethod() { }  //  Inner classes cannot have static methods
    }
}