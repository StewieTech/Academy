package com.bptn.course._03_flow_control._01_while_loop;

public class WhileLoop {

	public static void main(String[] args) {

		// 0, 1 , 2, 3, 4 ... 9
		
		int counter = -1;
		
		
		while (counter < 9) {
			
			
			counter++;
			
            if (counter == 5) {
            	continue;
            }
            
			System.out.println(counter);
		}
		
		/*
		do {
			System.out.println(counter);
			
			counter++;			
		} while (counter < 10);
		*/
	}

}
