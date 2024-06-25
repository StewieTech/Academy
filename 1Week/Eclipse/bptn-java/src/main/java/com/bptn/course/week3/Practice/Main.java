package com.bptn.course.week3.Practice;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Student1", 80));
        studentList.add(new Student("Student2", 75));
        studentList.add(new Student("Student3", 86));
        studentList.add(new Student("Student4", 74));
        studentList.add(new Student("Student5", 92));
        studentList.add(new Student("Student6", 72));
        studentList.add(new Student("Student7", 60));

        // initialize passList
        List<Student> passList = new ArrayList<>();

        int targetGrade = 75 ;
        // Loop through studentlist to filter the students with target grade
//        for (int i = 0; i < studentList.size(); i++) {
//            if (studentList.getClassGrade() > targetGrade) {
//                passList.add(studentList.get(i)) ;
//            }
//        }
        
        for (Student student : studentList) {
        	if (student.getClassGrade() > targetGrade) {
        		passList.add(student) ;
        	}
        }

        // print out the students using a for-each loop.      
        for (Student student : passList) {
            System.out.println(student) ;
        }
    }
}