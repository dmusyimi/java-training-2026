package io.github.talentdevelopment004.datastructures.lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PerformanceComparison {
    public static void main(String[] args) {
        final int ELEMENT_COUNT = 100000;

        // ArrayList performance
        List<Integer> arrayList = new ArrayList<>();
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < ELEMENT_COUNT; i++) {
            arrayList.add(0, i); // Add at beginning - worst case for ArrayList
        }

        long arrayListTime = System.currentTimeMillis() - startTime;

        // LinkedList performance
        List<Integer> linkedList = new LinkedList<>();
        startTime = System.currentTimeMillis();

        for (int i = 0; i < ELEMENT_COUNT; i++) {
            linkedList.add(0, i); // Add at beginning - good for LinkedList
        }

        long linkedListTime = System.currentTimeMillis() - startTime;

        System.out.println("Adding " + ELEMENT_COUNT + " elements at beginning:");
        System.out.println("ArrayList time: " + arrayListTime + " ms");
        System.out.println("LinkedList time: " + linkedListTime + " ms");
    }
}