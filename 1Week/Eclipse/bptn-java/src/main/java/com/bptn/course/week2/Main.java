package com.bptn.course.week2;

public class Main {
    
    // Method to demonstrate exception propagation
	public void method2() {
		try {
			method1();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Method2: ArrayIndexOutOfBoundsException handled");
//			throw new ArrayIndexOutOfBoundsException("This is waay out of bounds") ;
		} 
	}
     
    
    // Method to handle exception and demonstrate propagation
    public static void method1() {
        int[] arr = {1,2,3,4};
        System.out.println(arr[4]);
    }

    
    
    // main() method to run the program
    public static void main(String args[]) {
         Main exceptionSolutionObject = new Main();
//        method1() ;
         exceptionSolutionObject.method2(); // Calling method2 to demonstrate exception propagation
    }
}
