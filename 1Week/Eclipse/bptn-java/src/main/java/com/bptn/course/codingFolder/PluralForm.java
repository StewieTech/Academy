package com.bptn.course.codingFolder;

import java.util.Scanner;

public class PluralForm {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.println("# in:");
    int amt = inp.nextInt();
    inp.nextLine(); //this line is necessary
    System.out.println("word:");
    String word = inp.nextLine();
    //leave the above unedited, write your code below:
    
//    System.out.println(word.charAt(word.length() -1));
    
    
    char lastLetter = word.charAt(word.length() -1);
    String lastTwoLetters = ("" + word.charAt(word.length() -2) + word.charAt(word.length() -1));
    
    if ( (amt == 1) && (lastTwoLetters.equals("ry") )|| (amt == 0) &&  (lastTwoLetters.equals("ry") )) {
    
    		String pluralWord = word.substring(0,word.length() -1) + "ies";	
    		System.out.println(amt + " " +pluralWord);
    	} 
    else if (amt == 1 || amt == 0) {    		
    		System.out.println(amt + " " + word);
    	}
    else {
    	
    
    if (lastTwoLetters.equals("ay") || lastTwoLetters.equals("oy") || lastTwoLetters.equals("ey") || lastTwoLetters.equals("uy")) {
    	String pluralWord = word.substring(0,word.length() ) + "s";
    	System.out.println(amt + " " +pluralWord);
    } else if (lastTwoLetters.equals("fe") ) {
    	String pluralWord = word.substring(0,word.length() - 2 ) + "ves";	
    	System.out.println(amt + " " +pluralWord);
       
  } else if (lastTwoLetters.equals("sh")   || lastTwoLetters.equals("ch")  ) {
	  String pluralWord = word.substring(0,word.length()) + "es";	
	  System.out.println(amt + " " +pluralWord);
    
  } else if (lastTwoLetters.equals("us") ) {
	  String pluralWord = word.substring(0,word.length()  - 2) + "i" ;	
	  System.out.println(amt + " " +pluralWord);
  }
   else if (lastTwoLetters.equals("ly")  ) {
	  String pluralWord = word.substring(0,word.length() -1) + "ies";	
	  System.out.println(amt + " " +pluralWord);
  } 
	 else {
	  String pluralWord = word + "s";
	  System.out.println(amt + " " +pluralWord);
  }
    
    }



//    if (word.codePointAt(-1))
//    if else if ( amt > 1) {
//        System.out.println(amt + " " word + "s");
//    } else {
//
//    }


    // seems like we can solve this with an if else block. I tried split at first to split where the words are but realistically substring works a lot better. no need to turn it into a string array
    
    
  }
  }
