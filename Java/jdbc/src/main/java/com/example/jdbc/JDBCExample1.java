package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCExample1 {
    
    public static void lclStudents(){
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish a connection to the database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","Kalyan959@");
            
            // Create a statement object to execute SQL queries
            Statement stmt = conn.createStatement();
            
            // Execute a query to show all databases
            ResultSet rs = stmt.executeQuery("show databases");
            
            // Optional: Print all databases
            // while(rs.next()) {
            //    System.out.println(rs.getString(1));
            //}
            
            // Create a table if it does not exist
            stmt.execute("create table if not exists students(id INT, gender CHAR(1), name VARCHAR(25), percentage FLOAT(5,2))");
            
            // Alter the table to modify the percentage column (if needed)
            // stmt.execute("alter table students modify column percentage FLOAT(5,2)");
            
            // Insert data into the students table
            stmt.execute("insert into students values (102, 'm', 'Kalyan', 66.9), (103, 'm', 'MVV', 72.6), (42, 'f', 'GP', 76.6)");
            
            // Update data in the students table
            stmt.execute("update students set percentage = 69.6 where id = 102");
            
            // Insert more data, ignoring duplicates
            stmt.execute("INSERT IGNORE INTO students VALUES (102, 'm', 'Kalyan', 69.95),(25,'f','mvk',77.8)");
            
            // Optional: Add a primary key constraint to the table
            // stmt.execute("ALTER TABLE students ADD PRIMARY KEY (id)");
            
            // Optional: Delete specific records from the table
            // stmt.execute("delete from students where id=102");

            // Display all student records, sorted by ID in ascending order
            System.out.println("Sorting based on id:");
            ResultSet rs1 = stmt.executeQuery("select distinct * from students order by id asc");
            while(rs1.next()) {
                System.out.println(rs1.getInt(1) + " " + rs1.getString(2).charAt(0) + " " + rs1.getString(3) + " " + rs1.getFloat(4));
            }
            
            // Close the connection
            conn.close();
        }
        catch(Exception e) {
            // Print any exception that occurs
            System.err.println(e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        // Call the method to perform database operations
        lclStudents();
    }
}
