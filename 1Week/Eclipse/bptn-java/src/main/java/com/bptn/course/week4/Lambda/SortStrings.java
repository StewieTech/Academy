package com.bptn.course.week4.Lambda;

import java.util.Arrays;
import java.util.List;

public class SortStrings {
    public static void main(String[] args) {
        //Declare and initialize a list of strings using an ArrayList and the Arrays.asList method
        List<String> strings = Arrays.asList("foo", "bar", "baz", "qux", "quux");

        //Print the string without sorting
        System.out.println("Before sorting " + strings);

        // Sort the list of strings in ascending order using a lambda expression
//        strings.forEach(word -> );
        strings.sort( (wordOne,wordTwo)  -> (wordOne.compareTo(wordTwo) )) ;

        // Print the sorted list of strings
        System.out.println("After sorting " + strings);
    }
}
