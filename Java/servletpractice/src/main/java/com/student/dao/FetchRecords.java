package com.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.student.dto.Student;

public class FetchRecords
{
	public static List<Student> fetchResultSet() {
		Connection con = null;
		Statement st = null;
		List<Student> list = new ArrayList<>();
		String qry = "select * from student";
		
		try {
			con=DBConnection.getConnection();
			st=con.createStatement();
			ResultSet rs = st.executeQuery(qry);			
			while(rs.next())
			{
				list.add(new Student(rs.getInt("id"),rs.getString("name"), rs.getLong("phno"),
						rs.getString("Password"),rs.getInt("Marks"),rs.getString("Location")));
				
			}
		} catch ( SQLException e) {
			
			System.out.println(e);
		}
		DBConnection.closeConnection(con, st);
		return list;
	}
	
	public static Student fetchSingleRecord(int id) {
		Connection con = null;
		PreparedStatement st = null;
		Student student = null;
		String qry = "select * from student where id=?";
		
		try {
			con=DBConnection.getConnection();
			st=con.prepareStatement(qry);
			st.setInt(1,id);
			ResultSet rs = st.executeQuery();
			while(rs.next())
			{
				student= new Student(rs.getInt("id"),rs.getString("name"), rs.getLong("phno"),
						rs.getString("Password"),rs.getInt("Marks"),rs.getString("Location"));
				
			}
		} catch ( SQLException e) {
			
			System.out.println(e);
		}
		DBConnection.closeConnection(con, st);
		return student;
	}
}
