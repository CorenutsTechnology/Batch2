package com.feuji.service;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DbConnection
{
	@Value("${url}")
	private String url;
	
	@Value("${_username}")
	private String _username;
	
	@Value("${password}")
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
	 * @return the _username
	 */
	public String get_username() {
		return _username;
	}



	/**
	 * @param _username the _username to set
	 */
	public void set_username(String _username) {
		this._username = _username;
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
			connection = DriverManager.getConnection(url,_username,password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	
}
