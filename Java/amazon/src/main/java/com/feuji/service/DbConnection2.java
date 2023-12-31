package com.feuji.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection2
{
	private String url;
	
	private String username;
	
	private String password;
	
	
	
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}



	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}



	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}



	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}



	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}



	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}



	public Connection getConnection()
	{
		Connection connection=null;
		try {
			System.out.println("connection creating");
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("created");
			connection = DriverManager.getConnection(url,username,password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
