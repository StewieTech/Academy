//package com.bptn.course.week6;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//
//public class StmtSelect {
//    public static void main(String[] args) {
//
//    String dbURL = "jdbc:postgresql://localhost:5432/bptn5";
//    String dbUsername = "postgres";
//    String dbPassword = "postgres";
//
//    List<Student> students = new ArrayList<>();
//    String sql = "SELECT * FROM students";
//
//    try (Connection con = DriverManager.getConnection(dbURL, dbUsername,dbPassword);
//         Statement st = con.createStatement();
//         ResultSet rs = st.executeQuery(sql);
//    ) {
//        while (rs.next()) {
//            int studentId = rs.getInt("studentId");
//            int courseId = rs.getInt("courseId");
//            String studentName = rs.getString("studentName");
//            String studentEmail = rs.getString("studentEmail");
//            String studentPhone = rs.getString("studentPhone");
//
//            Student stu = new Student();
//            stu.setStudentId(studentId);
//            stu.setCourseId(courseId);
//            stu.setStudentName(studentName);
//            stu.studentPhone(studentPhone);
//
//            students.add(stu) ;
//        }
//        students.forEach(System.out::println);
//
//        System.out.println("Connection Successful") ;
//
//    } catch (SQLException e ) {
//        e.printStackTrace();
//
//    }
//        }
//    }
