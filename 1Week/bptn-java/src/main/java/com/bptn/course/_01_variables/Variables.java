package com.bptn.course._01_variables;

public class Variables {

	public static void main(String[] args) {
		
		
		// Integer Data Types
		
		// https://www.w3schools.com/java/java_data_types.asp
		
		// Primitives - 
		byte num1 = 4; // Declaration - Initialization
		
		
		System.out.println(num1);
		
		short num2 = 1000;
		
		System.out.println(num2);
		
		int num3 = 1_000_000;    /// <-----
		
		System.out.println(num3);

		long num4 = 3_000_000_000L;
		
		System.out.println(num4);

	
		// Decimal Data Types
		float num5 = 14.56F;
		System.out.println(num5);

		double num6 = 14.57;   // <------
		System.out.println(num6); 
		
		// Text
		
		char c1 = 'A';
		String str = "Hello"; // Reference type
		
		System.out.println(c1); 
		System.out.println(str); 
		
		// Boolean
		
		boolean b1 = false;
		System.out.println(b1);
		
		
		String str1 = new String("Hello");		
		String str11 = "Hello";
		
		
		String str2 = new String("Hello");
		
		
		System.out.println("String 1: " + str1);
		System.out.println("String 2: " + str2);
		
		if (str1.equals(str2)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Different");
		}
		
		String str3 = "Hello";		
		String str4 = "Hello";
		
		if (str3.equals(str4)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Different");
		}
		
		String str5 = "git";
		
	}
}
