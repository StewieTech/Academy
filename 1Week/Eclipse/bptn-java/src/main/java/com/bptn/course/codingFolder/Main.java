package com.bptn.course.codingFolder;

public class Main {
    void method() {
    	try {
    		try {
    			int arr[] = {1,2,3,4};
    			System.out.println(arr[0]) ;
    			System.out.println(arr[5]) ;
    		}
    		catch (ArithmeticException e) {
    			System.out.println("ArithmeticException occurred");
    		}
    			
    		} catch (ArrayIndexOutOfBoundsException e) {
    			System.out.println("ArrayIndexOutOfBoundsException is handled in the outer catch block");
    		}
    	}

  // main() method to run the program
    public static void main(String args[]) {
        Main nestedTryBlockSolutionObject = new Main();
        nestedTryBlockSolutionObject.method();
    }
}

