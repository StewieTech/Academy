package com.bptn.course.week5.challenge;

public class Student {

    // Create instance variables int id, String name, and int age
    int id ;
    String name ;
    int age ;

    //Define a constructor that takes three arguments (id, name, and age)
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name ;
        this.age = age;
    }


    // Define a getter method for the id field
    public int getId() {
        return id ;
    }

    // Define a getter method for the name field
    public String getName() {
        return name;
    }



    // Define a getter method for the age field
    public int getAge() {
        return age ;
    }



    //toString() method
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

