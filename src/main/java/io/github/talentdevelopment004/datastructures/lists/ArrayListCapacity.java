package io.github.talentdevelopment004.datastructures.lists;

import java.util.ArrayList;

public class ArrayListCapacity {
    public static void main(String[] args) {
        // Understanding capacity vs size
        ArrayList<Integer> numbers = new ArrayList<>(5); // Initial capacity = 5

        System.out.println("Initial size: " + numbers.size());
        // Capacity is not directly accessible in public API

        // Adding elements beyond initial capacity
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
            System.out.println("Added " + i + ", Size: " + numbers.size());
        }

        // Trim to current size
        numbers.trimToSize();

        // Performance demonstration
        long startTime = System.nanoTime();

        // Adding to end - fast
        numbers.add(100);

        // Adding to beginning - slow (needs shifting)
        numbers.add(0, 0);

        long endTime = System.nanoTime();
        System.out.println("Operation time: " + (endTime - startTime) + " ns");
    }
}