package com.bptn.course.week3.university;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Start by looking in the University and Student classes. Implement the methods. 

        // Create a bunch of student objects 
    	Student Errol = new Student(123L,"testUsername1","pass123","Errol","Stewart","ETech123@gmail.com","647-123-1234","123 toronto street","Male",LocalDate.of(1992, 10, 31),LocalDate.of(2023, 10, 31),4321L,"Developer") ;
    	Student jane = new Student(124L, "janeDoe", "pass333", "Jane", "Doe", "janeDoe@gmail.com", "647-123-1235", "456 Toronto Street", "Female", LocalDate.of(1993, 5, 12), LocalDate.of(2023, 5, 12), 4322L, "Designer");
        Student john = new Student(125L, "johnDoe", "pass444", "John", "Doe", "johnDoe@gmail.com", "416-123-1236", "789 Toronto Street", "Male", LocalDate.of(1994, 8, 23), LocalDate.of(2023, 8, 23), 4323L, "Engineer");
        Student rebecca = new Student(126L, "rebeccaSmith", "pass555", "rebecca", "Smith", "rebeccaSmith@gmail.com", "647-123-1237", "101 Toronto Street", "Female", LocalDate.of(1995, 1, 5), LocalDate.of(2023, 1, 5), 4324L, "Scientist");
        Student brittany = new Student(127L, "brittanyBrown", "pass898", "brittany", "Brown", "brittanyBrown@gmail.com", "416-123-1238", "202 Toronto Street", "Male", LocalDate.of(1996, 3, 15), LocalDate.of(2023, 3, 15), 4325L, "Architect");
    	
    

            // (Make sure one student has the following studentId: 123)
            // (Make sure one other student has the following username: testUsername1)

        // Create instance of university called "university" and populate it with the students.
    	University university = new University() ;  
    	university.addStudent(Errol);
    	university.addStudent(jane);
    	university.addStudent(john);
    	university.addStudent(rebecca);
    	university.addStudent(brittany);

        System.out.println("\nUniversity ------ \n" + university.students);
        System.out.println("\nGetting student------\n" + university.getStudent(123));
        System.out.println("\nDeleting student------\n" + university.deleteStudent(123));
        System.out.println("\nSeaching student------\n" + university.searchStudent("testUserna"));

        System.out.println("\nUniversity ------ \n" + university.students);

    }
}
