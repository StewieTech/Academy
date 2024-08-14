package com.bptn.course.week6.feedApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FeedAppClass {
    private static final String userName = "postgres";
    private static final String password = "admin";
    private static final String dbName = "feedApp";
    private static final String port = "5432";
    private static final String dbUrl = "localhost";

    int resultCount ;

    Connection createConnection() {
        Connection conn = null ;
        try {
        conn = DriverManager.getConnection("jdbc:postgresql://" + dbUrl + ":" + port + "/" + dbName, userName,password);
                System.out.println("Opened database successfully");
           return conn ;
        } catch (Exception e) {
                System.out.println(e.getClass().getName() + ": " + e.getMessage());
                System.exit(0);
        }
        return conn;
    } ;

        boolean closeConnection(Connection conn) {
            boolean flag = true ;
            try {
                conn.close();
                return flag ;
            } catch (SQLException e) {
                flag = false ;
                System.out.println("Exception: " + e.getMessage());
                return flag ;
            }
        }

        public void addUser(Connection conn, String firstName, String lastName, String username, String phone, String emailId, String password, boolean emailVerified) {

        try {
            PreparedStatement stmt = null ;
            String sql = "INSERT INTO \"User\" (\"firstName\", \"lastName\", \"username\", \"phone\", \"emailId\", \"password\", \"emailVerified\", \"createdOn\") VALUES (?, ?, ?, ?, ?, ?, ?, CURRENT_TIMESTAMP)";

            stmt = conn.prepareStatement(sql);
            stmt.setString(1, firstName);
            stmt.setString(2, lastName);
            stmt.setString(3, username);
            stmt.setString(4, phone);
            stmt.setString(5, emailId);
            stmt.setString(6, password);
            stmt.setBoolean(7, emailVerified);
            resultCount = stmt.executeUpdate();
            System.out.println(resultCount + " record(s) inserted");
            stmt.close() ;
        } catch (SQLException ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
}
        }
