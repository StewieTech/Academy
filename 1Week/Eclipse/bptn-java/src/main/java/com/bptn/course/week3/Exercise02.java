package com.bptn.course.week3;


import java.util.Set;
import java.util.TreeSet;

public class Exercise02 {
    public static void main(String[] args) {
        Set<String> set1 = new TreeSet<>();

        set1.add("Hello");
        set1.add("Java");
        set1.add("BPTN");
        set1.add("Obsid");
        set1.add("Spring");
        set1.add("Class");
        set1.add("James");

        // Using subSet to get elements from "BPTN" (inclusive) to "Spring" (exclusive)
        Set<String> subSet = ((TreeSet<String>) set1).subSet("BPTN", "Spring");

        // Using headSet to get elements less than "Obsid"
//        Set<String> headSet = ((TreeSet<String>) set1).headSet("Obsid");
        Set<String> headSet = set1.headSet("Obsid");

        System.out.println("SubSet:");
        for (String str : subSet) {
            System.out.println(str);
        }

        System.out.println("\nHeadSet:");
        for (String str : headSet) {
            System.out.println(str);
        }

        System.out.println("\nFull Set:");
        for (String str : set1) {
            System.out.println(str);
        }

        System.out.println(set1);
    }
}
