package io.github.talentdevelopment004.dates;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ATMMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale locale = Locale.CHINESE;
        int choice = 0;
       do {
           System.out.println(getProperty(locale,"welcome"));
           System.out.println(getProperty(locale,"deposit"));
           System.out.println(getProperty(locale,"withdraw"));
           System.out.println(getProperty(locale,"balance"));
           System.out.println(getProperty(locale,"exit"));
           System.out.println("Enter your choice: ");
           choice = input.nextInt();
       }while (choice != 4);
    }
    public static String getProperty(Locale locale, String key) {
        ResourceBundle rb = ResourceBundle.getBundle("ATM", locale);
        return rb.getString(key);
    }
}
