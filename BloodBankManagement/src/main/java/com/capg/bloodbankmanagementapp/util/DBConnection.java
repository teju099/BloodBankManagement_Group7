package com.capg.bloodbankmanagementapp.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

public static Connection con;
	
	static
	{
		// username of db admin and password 
		// port number 
		String host = "localhost:3306";  // if DB is another machine , that machine IP address should be given
        String database = "bloodbankmanagement";
        String url = "jdbc:mysql://"+ host+"/"+database;
        String username = "root";
        String password = "Mysql123";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            System.out.println("[ Connection Established  "+con+"  ]\n\n--------------------------------\n");

		} catch (Exception e) {
			System.out.println(" Exception during DB Connection "+e);
		}
		
	}
	
	
}