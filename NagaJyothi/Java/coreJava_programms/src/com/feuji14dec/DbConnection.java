package com.feuji14dec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class DbConnection 
{
	
	public static Connection getConnection()
	{
		Connection connection=null;
		Statement statement=null;
		String url="jdbc:mysql://localhost:3306?user=root&password=jyothi";
	    try {
			Class.forName("com.mysql.jdbc.Driver");
			 connection=(Connection) DriverManager.getConnection(url);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return connection;
		
	}
	public static void close(Statement statement,Connection connection)
	{
		if(statement!=null)
		{
			try {
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(connection!=null)
		{
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
