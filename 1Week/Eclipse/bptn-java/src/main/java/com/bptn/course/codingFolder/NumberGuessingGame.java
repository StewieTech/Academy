package com.bptn.course.codingFolder;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner userScanner = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100");

        int targetNumber = 23;
        int guess = 0 ;
        
        while (guess != targetNumber) {
        	guess = userScanner.nextInt(); 

        	if (guess == 23) {
        		System.out.println("Congratulations! You guessed the number correctly!");
        	} else if (guess > targetNumber) {
        		System.out.println("Too high! Try again");
        	} 
        	else { 
        		System.out.println("Too low! Try again");
        	} 
        }


        
    }
}



if (charAt(i) > 65 && charAt(i) < 100 && amt > 1) {
    System.out.println(amt + " " word + "s");
} else {
    
}