package com.bptn.course.week3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Example {


	public static class HashMapExample {
		public void demonstrateHashMap() {
			
	        // Creating a HashMap and populating it with initial key-value pairs
	        HashMap<String, Integer> map = new HashMap<>();
	        map.put("John",25);
	        map.put("Jane", 30);
	        map.put("Jack", 35);

	        // Iterating a HashMap using the keySet() method.
	        for (String key: map.keySet()) {
	        	System.out.println(key + ": " + map.get(key));
	        }

	        // Using the put() and get() methods to update the value for an existing key
	        map.put("John", map.get("John") + 5);
	        System.out.println("John's new age: " + map.get("John"));
	        
	        // Using the containsKey() method to check if a key exists in the map.
	        if (map.containsKey("Jane")) {
	        	System.out.println("The key 'Jane' exists in the map");
	        }
	        
	        // Using the containsValue() method to check if a value exists in the map.
	        if (map.containsValue(30)) {
	        	System.out.println("The value '30' exists in the map");
	        }
	        
	        // Using the putIfAbsent() method to add a key-value pair only if the key is not present in the map
	        map.putIfAbsent("Mike", 42);
	        System.out.println("Mike's age: " + map.get("Mike"));
	    }
	}
	
	

	public static class LinkedHashMapExample {		
		public void demonstrateLinkedHashMap() {
			

	        // Creating a HashMap and populating it with initial key-value pairs
	        LinkedHashMap<String, Integer> map = new LinkedHashMap<>(16, 0.75f, true);
	        map.put("John", 25);
	        map.put("Jane", 30);
	        map.put("Jack", 35);

	        // Iterating a LinkedHashMap using the keySet() method.
	        for (String key: map.keySet()) {
	        	System.out.println(key + ": " + map.get(key));
	        }

	        // Using the get() method to access a value
	        System.out.println("John's age: " + map.get("John"));

	        // Using the put() method to update the value for a given key
	        map.put("John", 30);
	        System.out.println("John's new age: " + map.get("John"));

	        // Using the remove() method to remove a key-value pair
	        map.remove("Jane");
	        System.out.println("Jane's age: " + map.get("Jane"));

	        // Using the keySet() method to access the keys in the LinkedHashMap
	        System.out.println("Keys in the LinkedHashMap: " + map.keySet());

	        // Using the values() method to access the values in the LinkedHashMap
	        System.out.println("Values in the LinkedHashMap: " + map.values());

	        // Using the entrySet() method to access the key-value pairs in the LinkedHashMap
	        System.out.println("Key-value pairs in the LinkedHashMap: " + map.entrySet());
	}
	}
	

	public static class TreeMapExample {
	    public  void demonstrateTreeMap() {
	        
	        // Creating a TreeMap and populating it with initial key-value pairs
	        TreeMap<String, Integer> map = new TreeMap<>();
	        map.put("John", 25);
	        map.put("Jane", 30);
	        map.put("Jack", 35);

	        // Iterating a TreeMap using the keySet() method.
	        for (String key: map.keySet()) {
	        	System.out.println(key + ": " + map.get(key));
	        }

	        // Using the get() method to access a value
	        System.out.println("John's age: " + map.get("John"));

	        // Using the put() method to update the value for a given key
	        map.put("John", 30);
	        System.out.println("John's new age: " + map.get("John"));

	        // Using the remove() method to remove a key-value pair
	        map.remove("Jane");
	        System.out.println("Jane's age: " + map.get("Jane"));

	        // Using the headMap() method to get a submap of the TreeMap
	        System.out.println("HeadMap of the TreeMap: " + map.headMap("John"));

	        // Using the tailMap() method to get a submap of the TreeMap
	        System.out.println("TailMap of the TreeMap: " + map.tailMap("John"));

	        // Using the subMap() method to get a submap of the TreeMap
	        System.out.println("Submap of the TreeMap: " + map.subMap("Jack", "John"));

	        // Using the firstKey() method to get the first key in the TreeMap
	        System.out.println("First key in the TreeMap: " + map.firstKey());

	        // Using the lastKey() method to get the last key in the TreeMap
	        System.out.println("Last key in the TreeMap: " + map.lastKey());
	    }
	}
	public static void main(String[] args) {
//	        HashMapExample hashMapExample = new HashMapExample();
//	        hashMapExample.demonstrateHashMap();

//	        LinkedHashMapExample linkedHashMapExample = new LinkedHashMapExample();
//	        linkedHashMapExample.demonstrateLinkedHashMap();
}
	        TreeMapExample treeMapExample = new TreeMapExample();
	        treeMapExample.demonstrateTreeMap();
}
