package com.example.jdbc;

import java.sql.*;

public class MySQL_JDBC_CRUD {
    // Program to demonstrate JDBC CRUD operations using MySQL database

    public static void main(String[] args) throws Exception {
        // Driver loading
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Connection establishment
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/klu", "root", "Kalyan959@");

        // Statement creation
        Statement stmt = conn.createStatement();

        // Table creation (uncomment to create the table)
        // stmt.execute("create table student(sid int, sname varchar(20), scgpa float(3,2))");

        // Insertion of data into table (uncomment to insert data)
        // stmt.execute("insert into student(sid, sname, scgpa) values(30959,'kalyan', 9.46)");
        // stmt.execute("insert into student values(31090,'sai', 9.3)");

        // Updation of data (uncomment to update a record)
        // stmt.execute("update student set sname = 'venkat' where sid = 30959");

        // Deletion of data (uncomment to delete a record)
        // stmt.execute("delete from student where sid = 30976");

        // Retrieval of data
        ResultSet rs = stmt.executeQuery("select * from student");

        // Process and display the retrieved data
        while (rs.next()) {
            int id = rs.getInt(1);           // Retrieve student id
            String name = rs.getString(2);   // Retrieve student name
            float cgpa = rs.getFloat(3);     // Retrieve student CGPA
            System.out.println(id + " " + name + " " + cgpa);  // Print student details
        }

        // Close the connection object
        conn.close();
    }
}
