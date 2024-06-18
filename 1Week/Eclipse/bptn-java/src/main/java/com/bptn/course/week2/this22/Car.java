package com.bptn.course.week2.this22;


class Car {

    //Declare a String color, String brand, int price
    private String color;
    private String brand;
    private int price ;


    public Car() {
        // calls the parameterized constructor
        this("white", "Honda", 20000);
    }

    public Car(String color, String brand, int price) {
        this.color = color ;
        this.brand = brand;
        this.price = price;
    } 
        //Define a parameterized constructor with parameters String color, String brand, int price) {
    //Assign Constructor parameters String color, String brand, and int price to Class variables with the this keyword.


void printCarDetails() {
    this.print();
}

private void print() {
//    System.out.println(
//        "Car{" + "color='" + color + '\'',+  ",  brand='' + brand + '\', price=' + price + '}'
//);
    System.out.println(
    	"Car{" + "color='" + color + '\'' +
    			", brand='" + brand + '\'' +
    			", price=" + price +
    			'}');
    }
}

