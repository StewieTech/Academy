package com.bptn.course.week3.university;

import java.time.LocalDate;
import java.util.*;

public class Student {

    private long studentId;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String gender;
    private LocalDate birthdate;
    private LocalDate admissionDate;
    private long rollNumber;
    private String curriculumName;

    public Student(long studentId,
            String userName,
            String password,
            String firstName,
            String lastName,
            String email,
            String phone,
            String address,
            String gender,
            LocalDate birthdate,
            LocalDate admissionDate,
            long rollNumber,
            String curriculumName) {
        this.studentId = studentId;
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
        this.birthdate = birthdate;
        this.admissionDate = admissionDate;
        this.rollNumber = rollNumber;
        this.curriculumName = curriculumName;
    }

    /* Implement getters and setters */
    public long getStudentId() {
    	return studentId;
    }

    public void setStudentId(long studentId) {
    	this.studentId = studentId;
    	
    }

    public String getUserName() {
    	return userName;
    }

    public void setUserName(String userName) {
    	this.userName = userName;
    }

    public String getPassword() {
    	return password;
    }

    public void setPassword(String password) {
    	this.password = password;
    }

    public String getFirstName() {
    	return firstName ;
    }

    public void setFirstName(String firstName) {
    	this.firstName = firstName;
    }

    public String getLastName() {
    	return lastName ;
    }

    public void setLastName(String lastName) {
    	this.lastName = lastName;
    }

    public String getEmail() {
    	return email ;
    }

    public void setEmail(String email) {
    	this.email = email;
    }

    public String getPhone() {
    	return phone ;
    }

    public void setPhone(String phone) {
    	this.phone = phone ;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthdate() {
    	return birthdate ;
    }

    public void setBirthdate(LocalDate birthdate) {
    	this.birthdate = birthdate ;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }

    public long getRollNumber() {
    	return rollNumber ;
    }

    public void setRollNumber(long rollNumber) {
    	this.rollNumber = rollNumber ;
    }

    public String getCurriculumName() {
        return curriculumName;
    }

    public void setCurriculumName(String curriculumName) {
    }
    /* ------end section of getters and setters----------*/

    public void editStudent(List<Student> universityStudents, Student student) {
       // Given a list of students, find by id a student that matches the id of the given student and replace it with the given student.
    	
    	for (Student person : universityStudents) {
    		if (person.getStudentId()  == student.getStudentId() ) {
    			person.setStudentId(student.getStudentId());
    		}
    	}

       // CAN THIS BE REFACTORED? Think about it and give some comments here. Could this method be better placed in a different class? Maybe yes, maybe not. Why?
    	// Yes, this code is essentially recreating the getStudent method we created already in the Unversity class. We could have this method just take advantage of that one which would simply the code
    }

     public String toString() {
        return "\nStudent: \n" +
                "studentId = " + this.studentId + "\n" +
                "userName = " + this.userName + "\n" +
                "password = " + this.password + "\n" +
                "firstName = " + this.firstName + "\n" +
                "lastName = " + this.lastName + "\n" +
                "email = " + this.email + "\n" +
                "phone = " + this.phone + "\n" +
                "address = " + this.address + "\n" +
                "gender = " + this.gender + "\n" +
                "birthdate = " + this.birthdate + "\n" +
                "admissionDate = " + this.admissionDate + "\n" +
                "rollNumber = " + this.rollNumber + "\n" +
                "curriculumName = " + this.curriculumName + "\n";
    }

}

