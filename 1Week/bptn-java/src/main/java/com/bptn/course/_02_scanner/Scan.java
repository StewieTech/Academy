package com.bptn.course._02_scanner;

import java.util.Scanner;

public class Scan {


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter an Integer: ");
		
		int num = scan.nextInt(); // 7 <Enter>

		System.out.println("Please enter an String: ");
		
		String str = scan.next();
		
		//scan.nextLine(); // Flush Buffer
		
		
		
		System.out.println("The number is: " + num);
		System.out.println("The string is: " + str);
		
		scan.close();
	}

}
