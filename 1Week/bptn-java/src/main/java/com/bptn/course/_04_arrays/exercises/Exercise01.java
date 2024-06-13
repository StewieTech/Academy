package com.bptn.course._04_arrays.exercises;

public class Exercise01 {

	// Write a Java program to calculate the average value of array elements.
	
	public static void main(String[] args) {

		int[] nums = { 1, 4, 6, 7, 8, 9, 3 , 13, 26};
		
		int sum = 0;
		
		// for-each: for(temporary variable : array    )
		for (int num : nums) { // As of Java 5
			
			sum = sum + num;
			System.out.println(sum + " " + num);
		}
		
		double avg = sum/(double)nums.length;
		
		//System.out.println("The average is " + sum/(double)nums.length);
		//System.out.println("The average is " + avg + " and the total is " + sum);
		String str = "Hello";
		
		System.out.printf("%s, The average is %.2f and the total is %d %.4f %n", str, avg, sum, avg);
		System.out.println("\n\"BPTN");
		
		int x = hello();
		
		System.out.println("x is: " + x);
	}
	
	static int hello() {
		
		int a = 4;
		int b = 5;
		
		int c = a + b;
		
		return c;
	}

}
