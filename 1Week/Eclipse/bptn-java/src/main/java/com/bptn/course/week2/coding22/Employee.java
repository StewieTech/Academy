package com.bptn.course.week2.coding22;

class Employee {
	   // Instance variable to store salary
	   private int salary ;

	   // Instance variable to store hours per day worked by employee
	   private int hoursPerDay ;

	   

	   // Constructor to set instance variables(salary and hoursPerDay) value 
	   public Employee(int salary, int hoursPerDay) {
	       this.salary = salary ; 
	       this.hoursPerDay = hoursPerDay ;
	   }

	   // Set method to update salary
	   public void setSalary(int salary) {
	           this.salary += 10 ;
	   }

	   // Set method to update hoursPerDay
	   public void setHoursPerDay(int hoursPerDay) {
	           this.salary += 5 ;
	   }

	   // Get method to return salary
	   public int getSalary() {
	       return salary ;
	   }
	   public int getHours() {
		   return hoursPerDay ;
	   }
	}
