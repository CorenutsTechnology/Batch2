package com.student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection
{
	static Connection con = null;
	static String url = "jdbc:mysql://localhost:3306/jdbcfeuji" , user="root" , pwd="admin";
	public static Connection getConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,user,pwd);
			System.out.println("Connection created successfully........");
			return con;
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		return null;
	}
	
	public static void closeConnection(Connection con , Statement st)
	{
		if(st!=null)
		{
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(con!=null)
		{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("connections closed successfully.............");
	}
	
//	public static void main(String[] args) {
//		DBConnection.getConnection();
//	}
}
