package com.example.knk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DatabaseConnection {
    public Connection conn;
    public  Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn =  DriverManager.getConnection("jdbc:mysql://localhost/Ecom?user=root&password=vesazhitia.12fr");


        } catch (Exception ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("VendorError: " + ex.getCause());
        }
        System.out.println(conn);
        return conn;
    }
}