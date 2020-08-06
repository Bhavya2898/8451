    package com.lti.servlet;	
    import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	public class DatabaseLginService {
		
		public boolean authenticate(String uname, String pwd) {
			Connection conn = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			try {
				Class.forName("org.apache.derby.jdbc.ClientDriver");
				String url = "jdbc:derby://localhost:1527/trainingdb";
				String user = "bhavya";
				String pass = "bhavya";
				conn = DriverManager.getConnection(url, user, pass);
				//System.out.println("Connection Successfull...");
				String sql ="SELECT COUNT(user_id) FROM tb1_users WHERE user_name = ? AND user_pass = ?";
				stmt = conn.prepareStatement(sql);
				// this 1 and 2 is order of question marks in sql string
				stmt.setString(1, uname);
				stmt.setString(2, pwd);
				rs = stmt.executeQuery();
				// rs currently points to the header
				// rs.next() moves the cursor to 1st row
				if(rs.next()) {
					// here 1 means 1st select clause/column in sql string i.e. Count
					int count = rs.getInt(1);
					if(count == 1)
						return true;
				}
				return false;
			}
			catch(ClassNotFoundException | SQLException e) {
				e.printStackTrace(); //detailed report of exception
				// we should rather throw user defined exception
				return false;
			}
			finally {
				try {
					conn.close();
				}
				catch(Exception e) {
					
				}
			}
		}

	}

