package com.bptn.course.week2.InstructorLed;

abstract class MyAbstractClass {


	abstract void print();

	void printHello() {
		System.out.println("Hello");
		// TODO Auto-generated method stub

	}
}

class MyChild extends MyAbstractClass{


	@Override
	void print() {
		System.out.println("I am the Child Class");
	}

	void doSomething() {
		System.out.println();
	}


}

//public static void main(String[] args) {
//
//}
