package com.bptn.course.week3;

import java.util.Set;
//import java.util.*;
import java.util.HashSet;

public class HashSetManipulation {
	public static void main(String[] args) {
		// Create a HashSet and populate it with initial values
    Set<String> set = new HashSet<>();
    set.add("A");
    set.add("B");
    set.add("C");
		

		// Print the size of the set
         System.out.println("Set size: " + set.size());
		

		// Use for loop to print the values in the set
	  set.forEach(tmp-> System.out.println("Value: " + tmp));
		

		// Use add() method to add a new value to the set
            set.add("D");
            System.out.println("Set after using add(): ");
            set.forEach(tmp-> System.out.println("Value: " + tmp));

		

		// Use remove() method to remove a value from the set
            System.out.println("Set after using remove(): ");
        set.remove("A");
        set.forEach(tmp-> System.out.println("Value: " + tmp));
		

		// Use contains() method to check if the value "C" exists in the set
              if (set.contains("C")) {
        System.out.println("Value 'C' exists in the set.") ;
      } else {
        System.out.println("Value 'C' does not exist in the set.");
      }
    }
		
	}
