package io.github.talentdevelopment004.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethods {
    // Generic static method
    public static <T> T[] printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");

        }
        return array;
    }

    // Generic instance method
    public <T> T getFirstElement(List<T> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    // Generic method that returns generic type
    public static <T> List<T> createList(T... elements) {
        List<T> list = new ArrayList<>();
        for (T element : elements) {
            list.add(element);
        }
        return list;
    }

    public static <T extends Number> T print(T a, T b) {
        return (T) (Double) (a.doubleValue() + b.doubleValue());
    }

}