package com.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.student.dto.Student;

public class UpdateRecord {

	public static String doUpdate(Student student) 
	{
		String qry = "update student set id=?,name=?,phno=?,password=?,marks=?,location=? where id=?";
		Connection connection = DBConnection.getConnection();
		PreparedStatement pst=null;
		try {
			pst = connection.prepareStatement(qry);
			pst.setInt(1,student.getId());
			pst.setString(2,student.getName());
			pst.setLong(3,student.getphno());
			pst.setString(4,student.getPassword());
			pst.setInt(5,student.getMarks());
			pst.setString(6,student.getLocation());
			pst.setInt(7,student.getId());
			
			pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBConnection.closeConnection(connection, pst);
		return "updated successfully.......";
	}

}
