package com.bptn.course.week2.InstructorLed.OverridePractice;


public class Bike extends Vehicle {
    
  //Step 3a: Declare String bikeHandle 
	String bikeHandle ;

  //Step 3b: Define parameterized constructor for color, brand, bikeHandle
	public Bike(String color, String brand, String bikeHandle) {
		super(color,brand);
		this.bikeHandle = bikeHandle;
	}
	
  //Step 3c: Create a print() method as per the specification in the above
	public void print() {
		System.out.println("I am Bike");
	}
	
}