package com.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.db.DBConnection;
import com.entity.Employee;

public class ServiceImpl implements Service
{

	@Override
	public void save(Employee emp) {
		String query="insert into  employee values(?,?,?,?)";
		Connection connection=null;
		PreparedStatement statement=null;
		connection=DBConnection.getConnection();
		try {
			connection=DBConnection.getConnection();
			statement=connection.prepareStatement(query);
			statement.setInt(1, emp.getEmpId());
			statement.setString(2, emp.getEname());
			statement.setString(3, emp.getEdept());
			statement.setDouble(4, emp.getEsal());
			System.out.println(emp);
			int record=statement.executeUpdate();
			System.out.println(record+"record inserted successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			DBConnection.close(statement, connection);
		}
		
		
	}

	@Override
	public List<Employee> getAll() {
		String query="select * from employee";
		Connection connection=null;
		PreparedStatement statement=null;
		
		try {
			connection=DBConnection.getConnection();
			statement=connection.prepareStatement(query);
			ResultSet resultSet=statement.executeQuery();
			List<Employee> emp=new ArrayList<>();
			//emp.
			while(resultSet.next())
			{
				int id=resultSet.getInt(1);
				String name=resultSet.getString(2);
				String dept=resultSet.getNString(3);
			    double sal=resultSet.getDouble(4);
			    Employee e=new Employee(id,name,dept,sal);
			    emp.add(e);
			}
			
			
		
		
			return emp;
	}catch (Exception e) {
		System.out.println("exception occured...");
	}
		finally
		{
			DBConnection.close(statement, connection);
		}
		return null;
}
}
