package com.bptn.course.week3;

import java.util.* ;


public class LinkedHashSetManipulation {

	public static void main(String[] args) {
		// Create a LinkedHashSet and populate it with the elements A, B and C.
	  Set<String> set = new LinkedHashSet<>();
    set.add("A");
    set.add("B");
    set.add("C");

		// Print the size of the set
    System.out.println("Set size: " + set.size());

		// Use for each loop to print the elements in the set
    System.out.println("Elements in the set(using for each loop)");
	  set.forEach(tmp-> System.out.println("Element: " + tmp));

		// Use iterator to print the elements in the set
	  System.out.println("Elements in the set (using iterator):");
	  Iterator<String> ite = set.iterator();
    while(ite.hasNext()) {
      System.out.println("Element: " + ite.next());
    }

		// Use remove() method to remove the element A from the set
		ite = set.iterator();
      set.remove("A");
      System.out.println("Set after using remove(): "+ set);
//      System.out.println(ite.next());
        
		// Use contains() method to check if the element B exists in the set
	
		ite = set.iterator();
    while(ite.hasNext()) {
      if (set.contains("B")) {
        System.out.println("Element 'B' exists in the set") ;
        break;
      } else {
        System.out.println("Element 'B' does not exist in the set.");
        break;
      }
    }

		// Use clear() method to remove all elements from the set
		set.clear();

        // Print the set to show that it is empty.
//		set.forEach(tmp -> System.out.println(tmp));
		System.out.println("Set after using clear(): " + set);
        
	}
}


