package com.bptn.course.week3;
//Import the HashMap class
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

 public static void main(String[] args) {
     Map<String, Integer> people = new HashMap();
     people.put("Angie",33);
     people.put("Steve",30);
     people.put("John",32);

     people.entrySet().forEach(tmp -> System.out.println("Name: " + tmp.getKey() + ", Age: " + tmp.getValue() ));

 }
}
