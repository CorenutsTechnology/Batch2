package com.feuji14dec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeJdbc 
{
	
	public static void main(String[] args) 
	{
		 Connection connection=null;
		Statement statement=null;
		String query="insert into corenuts.studentfueji values(2,'swathi',30,'blr','f')";
      
		
	  try {
		  connection=  DbConnection.getConnection();
		 statement= connection.createStatement();
		 int result=statement.executeUpdate(query);
		 System.out.println(result+" record inserted sucessfully...");
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	  finally
	  {
		  try {
			  if(connection!=null)
			  {
				  connection.close();
			  }
			if(statement!=null)
			{
				statement.close();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
		
	}

}
