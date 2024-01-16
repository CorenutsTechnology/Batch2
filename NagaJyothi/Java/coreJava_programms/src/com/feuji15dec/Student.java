package com.feuji15dec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import com.feuji14dec.DbConnection;


public class Student
{
	//@Test
	public void insert()
	{
		Connection connection=null;
	    Statement  statement=null;
		String query="insert into corenuts.studentfueji values(5,'puri',22,'guntur','m')";
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			connection=DbConnection.getConnection();
			statement=connection.createStatement();
			int record=statement.executeUpdate(query);
			System.out.println(record);
					
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		finally
		{
			DbConnection.close( statement,connection );
//			if(connection!=null)
//			{
//				try {
//					connection.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			if(statement!=null)
//				try {
//					statement.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			{
				
			}
		}
		
	//@Test
	public void insertPrepareStatement()
	{
		Connection connection=null;
		PreparedStatement statement=null;
		String query="insert into corenuts.studentfueji values(?,?,?,?,?)";
		
		try {
			connection=DbConnection.getConnection();
			statement=connection.prepareStatement(query);
			statement.setInt(1, 4);
			statement.setString(2, "Latha");
			statement.setInt(3, 23);
			statement.setString(4, "hyd");
			statement.setString(5, "f");
			int record=statement.executeUpdate();
			System.out.println(record+"Record inserted successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			DbConnection.close(statement, connection);
		}
	}
	//@Test
	public void removeusingPrepareStatement()
	{
		Connection connection=null;
		PreparedStatement statement=null;
		String query="delete from  corenuts.studentfueji where sid=?";
		//connection=DbConnection.getConnection();
		try {
			connection=DbConnection.getConnection();
			statement=connection.prepareStatement(query);
			statement.setInt(1, 2);
			int record=statement.executeUpdate();
			System.out.println(record);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			DbConnection.close(statement, connection);
		}
		
	}
	//@Test
	public void updateusingPrepareStatement()
	{
		Connection connection=null;
		PreparedStatement statement=null;
		String query=" update  corenuts.studentfueji set sgender=? where sid=?";
		//connection=DbConnection.getConnection();
		try {
			connection=DbConnection.getConnection();
			statement=connection.prepareStatement(query);
			statement.setString(1, "f");
			statement.setInt(2, 5);
			int record=statement.executeUpdate();
			System.out.println(record);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			DbConnection.close(statement, connection);
		}
		
	}
	@Test
	public void fetch()
	{
		Connection connection=null;
		PreparedStatement statement=null;
		String query="select * from corenuts.studentfueji";
		List<StudentDetails> list=new ArrayList<>();
		StudentDetails s=null;
		try {
			connection=DbConnection.getConnection();
			statement=connection.prepareStatement(query);
		    ResultSet result=statement.executeQuery();
		    while(result.next())
		    {
		    	int id=result.getInt("sid");
		    	String name=result.getString("sname");
		    	int age=result.getInt("sage");
		    	String add=result.getString("saddress");
		    	String gender=result.getString("sgender");
		    	s=new StudentDetails();
		    	//s.setAdd(id);
		    	s.setSid(id);
		    	s.setSname(name);
		    	s.setSage(age);
		    	s.setAdd(add);
		    	s.setSgender(gender);
		    	//s=new StudentDetails(id,name,age,add,gender);
		    	list.add(s);
		    	
		    }
		    list.stream().collect(Collectors.toList()).forEach((e)->System.out.println(e));
		    
		    //System.out.println(list);
		     
		    		    		    
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally
		{
			DbConnection.close(statement, connection);
		}

		
	}
	
	
	
	
	
	

}
