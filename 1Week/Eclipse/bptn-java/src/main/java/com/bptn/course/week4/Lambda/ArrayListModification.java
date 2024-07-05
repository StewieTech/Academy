package com.bptn.course.week4.Lambda;

import java.util.ArrayList;
import java.util.List;

public class ArrayListModification {
    public static void main(String[] args) {
        // Create an ArrayList
        List<String> languages = new ArrayList<>();
        languages.add("java");
        languages.add("javascript");
        languages.add("swift");
        languages.add("python");


        // Add elements to the ArrayList



        System.out.println("Original ArrayList:");
        // Print the original ArrayList using forEach and a lambda
        languages.forEach(tmp -> System.out.println("Original ArrayList: " + tmp));

        // Modify all elements to uppercase using replaceAll()
        languages.replaceAll(element -> (element.replaceAll(element, element.toUpperCase())));


        System.out.println("\nUpdated ArrayList:");
        // Print the updated ArrayList using forEach and a lambda
        languages.forEach(tmp -> System.out.println("Updated ArrayList: " + tmp));
    }
}

