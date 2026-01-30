package io.github.talentdevelopment004.enums;

import java.time.Month;

public class Main {
    public static void main(String[] args) {
        // days of a week
        Month month = Month.JANUARY;
        OrderStatus.valueOf("");
        // String month = "JANUARY";
        switch (month) {
            case JANUARY:
                System.out.println("January");
                break;
            case FEBRUARY:
                System.out.println("February");
                break;

            default:
                System.out.println("Default");
                break;
        }

    }

    public static boolean matches(String day, String anotherDay) {
        return day.equals(anotherDay);
    }
}
