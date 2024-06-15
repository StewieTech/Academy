package com.bptn.course.codingFolder ;


	import java.util.Scanner;
	import java.lang.Math;

	public class Calculator {
	    public static void main(String[] args) {
	        //write your code below:
	    
	    Scanner userInput = new Scanner(System.in);
	    // System.out.println("Welcome to the calculator");

//	     User Inputs
	     System.out.println("/................Calculator Menu................/ ");
	     System.out.println("Press 1 for addition: ");
	     System.out.println("Press 2 for subtraction: ");
	     System.out.println("Press 3 for multiplication: ");
	     System.out.println("Press 4 for division: ");
	     System.out.println("Press 5 to square a number: ");
	     System.out.println("Press 6 to find a square root: ");
	     System.out.println("Press 7 to find the reciprocal: ");
	    double buttonPressed = userInput.nextDouble();
	    if (buttonPressed < 1 || buttonPressed > 7) {
	    	System.out.println("Invalid choice") ;
//	    	break;
	    } else {
	    	
        
	    // System.out.println("Enter your first Number: ");
	    double firstNumber = userInput.nextDouble();
	    // System.out.println("Enter your Second Number: ");
	    double secondNumber = userInput.nextDouble();

    	
	    if (buttonPressed == 1) {
	        addition(firstNumber, secondNumber);
	    } else if (buttonPressed == 2) {
	    	subtraction(firstNumber, secondNumber) ;
	    } else if (buttonPressed == 3) {
	    	multiplication(firstNumber, secondNumber) ;
	    }
	    else if (buttonPressed == 4) {
	    	division(firstNumber, secondNumber) ;
	    }
	    else if (buttonPressed == 5) {
	    	numberSquared(firstNumber) ;
	    }
	    else if (buttonPressed == 6) {
	    	squareRoot(firstNumber) ;
	    }
	    else if (buttonPressed == 7) {
	    	numReciprocal(firstNumber) ;
	    }
	    else if (buttonPressed == 0) {
	    	System.out.println("Invalid choice") ;
	    }
	    else {
	    	System.out.println("Invalid choice") ;
	    }
	
	    }
	    }
	    
	    public static double addition(double a, double b) {
	        double answer  = a + b;
	        System.out.println(answer);
	    	return answer;
	    }
	    public static double subtraction(double a, double b) {
	    	double answer =  a - b;
	    	System.out.println(answer);
	        return answer;
	    }
	    public static double multiplication(double a, double b) {
	        double answer = a * b;
	        System.out.println(answer);
	        return answer ;
	        
	    }
	    public static double division(double a, double b) {
	    
	    	double answer =  a / b;
            double remainder = a % b;
	    	System.out.printf("Dividing %.1f by %.1f the quotient is %.1f\nThe remainder is %.1f", a,b,answer, remainder);
	    	return answer ;
	    }
	    public static double numberSquared(double a) {
	        double answer = a * a;
	        System.out.println(answer);
	        return answer ;
	    }
	    public static double squareRoot(double a) {
	        double answer =  Math.sqrt(a) ;
//	        double answerdouble = (int)answer ;
	        System.out.println(answer);
	        return answer ;
	    }
	    public static double numReciprocal(double a) {
	        double answer =  1 / a;
	        System.out.printf("The Reciprocal of the number 56.0 is = %.2f", answer);
	        return answer ;
	    }
	  


	        
	    }


