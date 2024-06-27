package com.bptn.course.week3.university;

import java.util.*;
import java.util.stream.Collectors;

public class University {
    List<Student> students = new ArrayList<>();

    // property - get inspired by the UML diagram

    public void addStudent(Student s) {
        // add a student to the "university" arraylist
        students.add(s) ;
    }

    public Student getStudent(long studentId) {
      // get the first student in the university that has the studentId. (ideally, this would be unique, so you can stop searching after finding the fist match)
      for (Student student : students  ) {
          if (student.getStudentId() == studentId) {
              return student ;
          }
      }
      return null ;
    }

    public List<Student> searchStudent(String userNamePrefix) {
       // return all students that have usernames beginning with the prefix
       Integer prefixLength = userNamePrefix.length() ;
       List<Student> foundStudents = new ArrayList<>();
       
       for (Student student : students) {
    	   String username = student.getUserName() ;
    	   if (username.length() >= prefixLength) {
    		   if (username.substring(0,prefixLength).equals(userNamePrefix) )  {
    			   foundStudents.add(student) ;
    		   }
    	   }

       } 
       return foundStudents ;
    }

    public boolean deleteStudent(long studentId) {
       // return if a successful deletion happened
       for (Student person : students) {
           if (    person.getStudentId() == studentId )    {
               students.remove(person);
               return true ;
           }
       }
       return false ;
    }

}

