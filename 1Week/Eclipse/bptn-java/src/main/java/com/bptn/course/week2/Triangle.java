package com.bptn.course.week2;


public class Triangle{

	// Write perimeterCalculator method 
    public int perimeterCalculator(int a, int b, int c) {
        return  a + b + c ;
    }
    

    // Write areaCalculator method
	public double areaCalculator(int b, int h) {
        double base = (double) b;
        double height = (double) h;
        double answer =  (base * height) ;
        return answer ;
    }

    // Do not modify the code below:
    public static void main (String[]args){

		Triangle object = new Triangle();

		int a = 7;
        int b = 10;
        int c = 35;

        int perimeter = object.perimeterCalculator(a,b,c);
        double area = object.areaCalculator(7,10);

        System.out.println("Perimeter of the triangle is: " + perimeter + "\nThe Area of the Triangle is: " + area);
    }
    
}
