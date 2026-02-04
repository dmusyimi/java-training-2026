package io.github.talentdevelopment004.datastructures.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Dvd dvd = new Dvd("Nibebe");
        System.out.println(dvd);
        System.out.println(dvd.hashCode());

        Dvd dvd2 = new Dvd("Nibebe 2");
        System.out.println(dvd2);
        System.out.println(dvd2.hashCode());
        // duplicatesRemoval();
        maps();

    }

    static void maps() {
        Map<String, Integer> studentGrades = new HashMap<>();
        // Adding key-value pairs
        studentGrades.put("Alice", 85);
        studentGrades.put("Bob", 92);
        studentGrades.put("Charlie", 78);
        studentGrades.put("Alice", 90); // Overwrites previous value

        System.out.println("Student Grades: " + studentGrades);
        System.out.println("Size: " + studentGrades.size());
        System.out.println("Alice's grade: " + studentGrades.get("Alice"));

        // Consumer<? super Integer> consumer = a -> System.out.println(a);

        // studentGrades.values().forEach(a -> System.out.println(a));

        for (var key : studentGrades.keySet()) {
            System.out.println(key);

        }
        for (var value : studentGrades.values()) {
            System.out.println(value);

        }

        for (var entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());

        }

    }

    static void duplicatesRemoval() {
        Set<String> students = new LinkedHashSet<>(6);
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("David");
        students.add("Alice"); // Duplicate - ignored

        Iterator<String> studentIterator = students.iterator();

        while (studentIterator.hasNext()) {
            System.out.println(studentIterator.next());

        }

    }
}
