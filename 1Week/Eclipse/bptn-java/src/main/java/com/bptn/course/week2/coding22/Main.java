package com.bptn.course.week2.coding22;

public class Main {
	   public static void main(String[] args) {
	       // create an instance of Employee class and initialize it with salary = 100 and hoursPerDay = 8
	       Employee student = new Employee(501, 2);
	       
	       // print the salary of the employee
//	       student.setSalary(student.getSalary()) ;
//	       student.setHoursPerDay(student.getHours(), student.getSalary());
	       System.out.println(student.getSalary());
	   }
	}
