package io.github.talentdevelopment004.interfaces;

//socket
// contract
public interface ThreePinPlug {

    void accessPower();

    void printUsage();

    default void checkStatus() {
        System.out.println("Default implementation");
        me();
    }

    static void printSpecifications() {
        System.out.println("Specifications");


    }

    private void me() {
        System.out.println("me");
    }
}
