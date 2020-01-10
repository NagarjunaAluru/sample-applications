package com.ppk.db;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection
{
	
	 static Connection con=null;
	    public static Connection getDBConnection()
	    {
	        if (con != null) return con;
	        // get db, user, pass from settings file
	        return getConnection();
	    }

	    private static Connection getConnection()
	    {
	        try
	        {
	        	// load the Driver Class
	            Class.forName("com.mysql.jdbc.Driver");
	 
	            // create the connection now
	            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test",
	                   "root",
	                    "password");
	        }
	        catch(Exception e)
	        {
	            e.printStackTrace();
	        }

	        return con;        
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static Connection getConnection() {
        Connection con = null;
        try {
 
            // load the Driver Class
            Class.forName("com.mysql.jdbc.Driver");
 
            // create the connection now
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test",
                   "root",
                    "password");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return con;
    }*/
	

}
