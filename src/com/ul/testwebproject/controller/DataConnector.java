package com.ul.testwebproject.controller;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataConnector {

    public static final String URL = "jdbc:mysql://localhost:3306/sakila";
    public static final String USER = "root";
    public static final String PASS = "password"; 

    public Connection getConnection() {
	
	    Connection connection = null;
	    
	    try {
	    	Class.forName("com.mysql.jdbc.Driver");
	    	connection = DriverManager.getConnection(URL,USER,PASS);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	    
    }
}
