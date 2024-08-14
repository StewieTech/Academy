package com.bptn.course.week6;

import java.sql.* ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentAppClass {
    // These lines establish the variables we need to connect to our Postgres database. Note that we have our username, password, the name of the database, the port, and the URL. If any of these variables has changed in your project (e.g., you changed your password or provided a different port name), make sure you change them below. Failure to do so will result in errors:
    private static final String userName = "postgres";
    private static final String password = "pg123";
    private static final String dbName = "postgres";
    private static final String port = "5432";
    private static final String dbUrl = "localhost";

    // Finally, we can start our connection.
    public Connection createConnection() {
        Connection conn = null;
        try {
            // These lines load the postgresql driver, then initialize it with the variables we defined above:
            //Class.forName("org.postgresql.Driver");
            conn = DriverManager
                    .getConnection("jdbc:postgresql://" + dbUrl + ":" + port + "/" + dbName,
                            userName, password);
        } catch (Exception e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
        return conn;
    }
    // Here, we define a function that will make use of the connection we've created above:
    public void getAllStudents(Connection conn) {
        try {
            Statement stmt = null;
            stmt = conn.createStatement();
            // This line creates our SQL statement to select all entries from the student table:
            String sql = "SELECT * FROM students";
            // This line executes the query in the line above, setting its results to a ResultSet object called rs:
            ResultSet rs = stmt.executeQuery(sql);
            // While there is data in the returned result set, we will print that line to the console:
            while (rs.next()) {
                // Retrieve by column name
                System.out.print("Student ID: " + rs.getInt("studentId"));
                System.out.print(", Course ID: " + rs.getInt("courseId"));
                System.out.print(", Student Name: " + rs.getString("studentName"));
                System.out.print(", Student Email: " + rs.getString("studentEmail"));
                System.out.println(", Student Phone: " + rs.getString("studentPhone"));
            }
            // Here, we close our connection:
            stmt.close();
        } catch (SQLException ex) {
            // And of course, we handle exceptions in case our query is unsuccessful:
            System.out.println("Exception:" + ex.getMessage());
        }
    }

    // Here's another query. Feel free to paste this one into your IDE and annotate it yourself, based on what you saw in the example above:
    public void getStudentById(Connection conn, Integer studentId) {
        try {
            // This is a prepared statement. We'll go into more detail on these in the next lesson, so don't worry too much about exactly how it works right now. Just try to figure out how it's being used, and how the ? relates to what's going on:
            PreparedStatement stmt = null;
            // Note: we're using \s so Java interprets our "" properly:
            String sql = "SELECT * FROM students WHERE \"studentId\" = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, studentId);  // 1 specifies the first parameter in the query
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.print("Student ID: " + rs.getInt("studentId"));
                System.out.print(", Course ID: " + rs.getInt("courseId"));
                System.out.print(", Student Name: " + rs.getString("studentName"));
                System.out.print(", Student Email: " + rs.getString("studentEmail"));
                System.out.println(", Student Phone: " + rs.getString("studentPhone"));
            }
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Exception:" + ex.getMessage());
        }
    }
    // Here's an INSERT statement using the JDBC. Try to annotate this one as well, then compare notes with your team:
    public void addStudent(Connection conn, int courseId, String studentName, String studentEmail, String studentPhone) {
        try {
            // This is a prepared statement. We'll go into more detail on these in the next lesson, so don't worry too much about exactly how it works right now. Just try to understand how it's being used, and how the values are being passed:
            PreparedStatement stmt = null;
            String sql = "INSERT INTO students (\"courseId\", \"studentName\", \"studentEmail\", \"studentPhone\") VALUES (?, ?, ?, ?)";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, courseId);
            stmt.setString(2, studentName);
            stmt.setString(3, studentEmail);
            stmt.setString(4, studentPhone);
            int resultCount = stmt.executeUpdate();
            System.out.println(resultCount + " record(s) inserted");
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Exception:" + ex.getMessage());
        }
    }
    // This code can be called upon to close our connections. To see it in use, check the Main.java file below:
    public boolean closeConnection(Connection conn) {
        boolean flag = true;
        try {
            conn.close();
        } catch (SQLException ex) {
            flag = false;
            // Handle exception, in case of any errors:
            System.out.println("Exception:" + ex.getMessage());
        }
        return flag;
    }
}
//Your package name goes here


class Main {
    public static void main(String[] args) {
        StudentAppClass jdbc = new StudentAppClass();
        Connection conn = jdbc.createConnection();
        jdbc.getAllStudents(conn);
        jdbc.closeConnection(conn);
    }
}
