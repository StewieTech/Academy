package com.bptn.course._03_flow_control._02_for_loop;

public class ForLoop {

	public static void main(String[] args) {


		/*
		 * While is better when you don't know how many times you need to repeat the block of code
		 * for instance: searching.
		 */
		/*		
		int counter = 0;
		
		
		while (counter < 10) {
			
			System.out.println(counter);
			
			counter++;
		}
		*/
		
		/*
		 * Is better when you know how many times you need to repeat the block of code
		 */
		for (int counter = 0; counter < 10; counter++) {
			
			
			if (counter == 5) {
				continue;
			}
			System.out.println(counter);
		}

	}

}
