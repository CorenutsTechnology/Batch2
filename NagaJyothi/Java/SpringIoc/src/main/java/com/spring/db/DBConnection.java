package com.spring.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection 

{
	private String url;
	private String username;
	private String password;
	
	public  Connection getConnection()
	{
		Connection connection=null;
		Statement statement=null;
		//String url="jdbc:mysql://localhost:3306/corenuts?user=root&password=jyothi";
		
	    try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 connection=(Connection) DriverManager.getConnection(url,username,password);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return connection;
		
	}
	public DBConnection()
	{
		
	}
	public DBConnection(String url, String username, String password) {
		super();
		this.url = url;
		this.username = username;
		this.password = password;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
