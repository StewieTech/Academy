package com.bptn.course.codingFolder;

import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		int userCheck = 0;
		
		do {
			
			System.out.println("/................String Menu................/ ");
			System.out.println("Press 1 for Palindrome Check");
			System.out.println("Press 2 to reverse a String");
			System.out.println("Press 3 to Concatenate two Strings");
			System.out.println("Press 4 for String Comparison"); 
			System.out.println("Press 5 to Calculate the Length of String"); 
			System.out.println("Enter the option:");
			userCheck = userInput.nextInt();
		} while ( (userCheck < 1) || (userCheck > 5) ) ;
			switch (userCheck) {
			case 1:
				System.out.println("Enter the a string: ");
				String palinString = userInput.next();
				palindrome(palinString);
				break;
			case 2:
				System.out.println("Enter the a string: ");
				String wordString = userInput.next();
				stringReverse(wordString);
				break;
				
			case 3: 
				System.out.println("Enter First string: ");
				String firstString = userInput.next();
				System.out.println("Enter Second string: ");
				String secondString = userInput.next();
				concatenateStrigns(firstString, secondString) ;
				break;
			
			case 4: 
				System.out.println("Enter the first string: ");
				String firstWord = userInput.next();
				System.out.println("Enter the second string: ");
				String secondWord = userInput.next();
				compareString(firstWord, secondWord) ;
				break;
				
			case 5:
				System.out.println("Enter the a string: ");
				String wordLength = userInput.next();
				stringLength(wordLength);
				break;
			}
		
			userInput.close(); 
	}
	
	public static String stringReverse(String word) {
		String reversedWord = null ;
		for (int i = word.length(); i > 0 ; i--) {
			reversedWord = "" + word.charAt(i - 1) ;
			System.out.print(reversedWord);
		}
		return reversedWord ;
	}
	
	public static String palindrome(String word) {
		
		String reversedWord = "" ;
		for (int i = word.length(); i > 0 ; i--) {
			reversedWord += "" + word.charAt(i - 1) ;
//			System.out.print(reversedWord);
		}
		
		if (reversedWord.equalsIgnoreCase(word)) {
			System.out.println(word + " is a palindrome");
		} else {
			System.out.println(word + " is not a palindrome");
		}
		return reversedWord ;
		
	}

	public static String concatenateStrigns(String firstString, String secondString) {
		String combinedWord = firstString + secondString;
		System.out.println(combinedWord);
		return combinedWord;
	}
	
	public static String compareString(String firstString, String secondString) {

	

		
		if (firstString.equals(secondString)) {
			System.out.println("The entered strings are equal") ;
		}
			
			else { System.out.println("The entered strings are not equal") ;
			}
		return firstString ;
	}
	
	public static int stringLength(String word) {
		int result = word.length() ;
		System.out.println("The length of the entered string is: " + result);
		return result ;
	}
}
