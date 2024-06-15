package com.bptn.course.codingFolder;

import java.util.Scanner ;

public class WordEncryption {
	
	public static void main(String[] args) {
	
	
	Scanner userInput = new Scanner(System.in);
	System.out.println("Enter your word: ");
	String wordInput = userInput.next() ;
	char[] wordArray = new char[100];
	
		
	for (int i = 0; i < wordInput.length(); i++) {
		if ( (char) ((int) wordInput.charAt(i) ) >= 48 && (char) ((int) wordInput.charAt(i) )<= 57 )
			wordArray[i] += wordInput.charAt(i) ; 
		else if ((char) ((int) wordInput.charAt(i) ) < 48) {
		wordArray[i] += wordInput.charAt(i);
		}
		else {
		wordArray[i] += (char) ((int) wordInput.charAt(i) +1) ;
		}
		
		
//		Integer intWordValue = Integer.valueOf(wordInput) ;
		
		System.out.print(wordArray[i]);
	}
	
	userInput.close();
	
	// I believe I can do two conversions, first turn the string to int and then the int to char, its possible there is a toInt method in the string class
	//	<https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html#parseInt-java.lang.String-int->

}
}
