package com.bptn.course.week2.InstructorLed;

	
	interface Income
	
	{
		int hello = 10;
		double calculatePay(double salary, double taxes);
		void doSomething();
	}
	
	interface Hello {
		void sayHello();
	}
	
	class Person {
	}
	
	class Employee extends Person implements Income, Hello {
		
	
	

	
	@Override
	public double calculatePay(double salary, double taxes) {
		return salary - taxes;
	}
	
	@Override
	public void doSomething() {
		
	}
	
	@Override
	public void sayHello() {
		System.out.println("Hello");
	}
	}
	
	
	public class InterfaceExample {

		public static void main(String[] args) {
			Employee emp = new Employee();
			System.out.println(emp.calculatePay(100_000, 30_000));
			Hello emp2 - new Employee();
			((Employee) emp2).doSomething();

	}

}
