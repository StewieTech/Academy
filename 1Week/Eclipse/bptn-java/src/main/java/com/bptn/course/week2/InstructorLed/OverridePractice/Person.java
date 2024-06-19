package com.bptn.course.week2.InstructorLed.OverridePractice;

class Person {
	   private String name;

	   public Person(String theName) {
	      this.name = theName;
	   }

	   public String getName() {
	      return name;
	   }

	   public boolean setName(String theNewName) {
	      if (theNewName != null) {
	         this.name = theNewName;
	         return true;
	      }
	      return false;
	   }
	}
