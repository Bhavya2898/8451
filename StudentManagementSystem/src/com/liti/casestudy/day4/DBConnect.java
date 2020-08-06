package com.liti.casestudy.day4;

import java.sql.Connection;

import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

//import org.apache.derby.client.am.SqlException;

public class DBConnect  {
	public static void main(String[] args){
		Connection conn = null;
		
		try {
			//Step 1. Loading the JDBC Driver
			//For Derby
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			
			//Step 2. Establishing connection with the database
			//For Derby
			String url = "jdbc:derby://localhost:1527/trainingdb";
			String user = "bhavya";
			String pass = "bhavya";
			
			conn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection Successful..");
		 	//SQL Operations
			//For ex: if we want to fire INSERT/SELECT/UPDATE statement
			//there are 2 ways:
			//1. Statement
			//2.PreparedStatement
			
			//Statement st = conn.createStatement();
			//st.execute("INSERT INTO student VALUES(1,'John','10-Jun-1998')");
			
			PreparedStatement pst = conn.prepareStatement("INSERT INTO student VALUES(?,?,?)");
			pst.setInt(1, 22);
			pst.setString(2,"John");
			pst.setString(3, "10-jun-1997");
		    pst.executeUpdate();
			
		    //PreparedStatement pst2 = conn.prepareStatement("Select * from Student");
		    //pst2.executeUpdate();
		}
		catch(ClassNotFoundException | SQLException e ) {
			e.printStackTrace();
			
		}
		finally {
			try 
			{conn.close();} 
			catch (Exception e) {
				
			}
					
		}
			
		
	
	

	
	}
}

	
		
	


