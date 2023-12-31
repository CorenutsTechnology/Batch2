package com.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.student.dto.Student;

public class InsertStudentRecord 
{
	public static String insertRecord(Student student)
	{
		String qry="insert into student values(?,?,?,?,?,?)";
		Connection connection = DBConnection.getConnection();
		PreparedStatement statement=null;
		try {
			statement = connection.prepareStatement(qry);
			statement.setInt(1,student.getId());
			statement.setString(2,student.getName());
			statement.setLong(3,student.getphno());
			statement.setString(4,student.getPassword());
			statement.setInt(5,student.getMarks());
			statement.setString(6,student.getLocation());
			int result = statement.executeUpdate();			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		DBConnection.closeConnection(connection, statement);
		return "successfully inserted a record into data base";
	}
}
