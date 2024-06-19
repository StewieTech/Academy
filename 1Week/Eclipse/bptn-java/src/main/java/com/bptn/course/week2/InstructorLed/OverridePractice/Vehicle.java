package com.bptn.course.week2.InstructorLed.OverridePractice;

public class Vehicle {
	  
	  //Step 1a: Declare String color and String brand
	String color ;
	String brand ;

	  //Step 1b: Define a parameterized constructor with color and brand as parameters
	public Vehicle(String color, String brand) {
		this.color = color;
		this.brand = brand;
	}
	
	  //Step 1c: Create a print() method as described in the above.
	public void print() {
		System.out.println(this.color + " " + this.brand);
	}

	}