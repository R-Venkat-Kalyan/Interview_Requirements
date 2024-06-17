package com.example.jdbc;

import java.sql.*;
import java.util.Scanner;

public class Oracle_JDBC_CRUD {
    
    // Program to demonstrate CRUD operations through JDBC using Oracle Database.

    public static void main(String[] args) throws Exception {
        
        // Load Oracle JDBC driver
        Class.forName("oracle.jdbc.driver.OracleDriver");
        
        // Establish a connection to the Oracle database
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "admin");
        
        // Create a Statement object to execute SQL queries
        Statement stmt = conn.createStatement();
        
        // Table creation (uncomment to create the table)
        // stmt.execute("create table student(sid number(5), sname varchar(20), scgpa number(5))");
        
        // Data insertion (uncomment to insert data)
        // stmt.execute("insert into student(sid, sname, scgpa) values (30976, 'faizaan', 9.51)");
        // stmt.execute("insert into student(sid, sname, scgpa) values (31090, 'sai', 9.2)");

        // Delete operation (uncomment to delete a record)
        // stmt.execute("delete from student where sid = 30976");
        
        // Update operation (uncomment to update a record)
        // stmt.execute("update student set sname = 'sai kiran' where sid = 31090");

        // Retrieve data (uncomment to retrieve and display student records)
        // ResultSet rs = stmt.executeQuery("select * from student");
        // while(rs.next()) {
        //     int id = rs.getInt(1);
        //     String name = rs.getString(2);
        //     float cgpa = rs.getFloat(3);
        //     System.out.println("ID : " + id + "\t" + "NAME : " + name + "\t" + "CGPA : " + cgpa);
        // }

        // Insertion using PreparedStatement (uncomment to insert using PreparedStatement)
        // PreparedStatement ps = conn.prepareStatement("insert into student values(?, ?, ?)");
        // ps.setInt(1, 30965);
        // ps.setString(2, "satya");
        // ps.setDouble(3, 9.1);
        // ps.execute();

        // Insertion using PreparedStatement with Scanner class (uncomment to insert using Scanner)
        // Scanner ip = new Scanner(System.in);
        // System.out.println("Enter id, name, cgpa:");
        // int id = ip.nextInt();
        // String name = ip.next();
        // double cgpa = ip.nextDouble();
        // PreparedStatement ps = conn.prepareStatement("insert into student values(?, ?, ?)");
        // ps.setInt(1, id);
        // ps.setString(2, name);
        // ps.setDouble(3, cgpa);
        // ps.execute();

        // Close the connection
        conn.close();
    }
}
