package com.bptn.course.week2.coding12;

class Car {

    // Fill in the code for Step 2
	private String color;
	private String brand;
	private int price;
	


    public Car(String color, String brand, int price) {
       // Fill in the code for Step 4
    	this.color = color;
    	this.brand = brand;
    	this.price = price;

    }

    private void print() {
    	
    	System.out.println("Car{" +
    			"color='" + color + '\'' +
    			", brand='" + brand + '\'' +
    			", price=" + price +
    			'}');
    }
    

    void printCarDetails() {
    	print();
   }



}