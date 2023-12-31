package com.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteRecord 
{
	public static String deleteRecord(int id) 
	{
		Connection connection = DBConnection.getConnection();
		String qry="delete from student where id=?";
		PreparedStatement pst=null;
		try {
			pst=connection.prepareStatement(qry);
			pst.setInt(1,id);
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBConnection.closeConnection(connection, pst);
		return "deleted successfullyy......";
	}
}
