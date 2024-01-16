package com.student.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;
import com.student.dao.DBConnection;
import com.student.entity.Student;

public class StudentServiceImplementation  implements StudentService
{

	@Override
	public void save(Student student) 
	{
		Connection connection=null;
		PreparedStatement statement=null;
		String query=" insert into corenuts.student value(?,?,?,?,?)";
	     connection=DBConnection.getConnection();
	     try {
	    	 connection=DBConnection.getConnection();
			statement=connection.prepareStatement(query);
			statement.setInt(1, student.getId());
			statement.setString(2,student.getName());
			statement.setString(3, student.getPassword());
			statement.setString(4, student.getEmail());
			statement.setInt(5, student.getMobile());
			System.out.println(student);
			int num=statement.executeUpdate();
			System.out.println(num+"record inserted successfully");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	     finally
	     {
	    	 DBConnection.close(statement, connection);
	    	 
	     }
	     
		
		
		
	}

	@Override
	public void delete(int id) {
		Connection connection=null;
		PreparedStatement statement=null;
		String query="delete from corenuts.student where id=?";
		connection=DBConnection.getConnection();
		try {
			connection=DBConnection.getConnection();
			statement=connection.prepareStatement(query);
			statement.setInt(1, id);
			int res=statement.executeUpdate();
			System.out.println(res);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void update(Student student) {
	Connection connection=null;
	PreparedStatement statement=null;
	String query="update corenuts.student set mobile=? where id=? ";
	
	 try {
		 connection=DBConnection.getConnection();
		statement=connection.prepareStatement(query);
		statement.setInt(1, student.getMobile());
		statement.setInt(2, student.getId());
		 int n=statement.executeUpdate();
		 System.out.println(n);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
	}

	@Override
	public List<Student> fetchAll() {
		Connection connection=null;
		PreparedStatement statement=null;
		String query="select * from corenuts.student";
		connection=DBConnection.getConnection();
		Student s=null;
		List<Student> list=new ArrayList<>();
		try {
			connection=DBConnection.getConnection();
			statement=connection.prepareStatement(query);
			ResultSet result=statement.executeQuery();
			while(result.next())
			{
				int id=result.getInt("id");
				String name=result.getString("name");
				String password=result.getString("password");
				String email=result.getString("email");
				int mobile=result.getInt("mobileno");
				list.add(new Student(id,name,password,email,mobile));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Student> fetch(int id) {
		Connection connection=null;
		PreparedStatement statement=null;
		String query="select * from corenuts.student where id=?";
		List<Student> list=new ArrayList<>();
		
		try {
			connection=DBConnection.getConnection();
			statement=connection.prepareStatement(query);
			statement.setInt(1, id);
			 ResultSet result=statement.executeQuery();
			
			 while(result.next())
			 {
				 int id1=result.getInt("id");
				 String name=result.getString("name");
				 String password=result.getString("password");
				 String email=result.getString("email");
				 int mobile=result.getInt("mobileno");
				 list.add(new Student(id1,name,password,email,mobile));
				 return list;
			 }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			DBConnection.close(statement, connection);
		}
		
		return null;
	}
	

}
