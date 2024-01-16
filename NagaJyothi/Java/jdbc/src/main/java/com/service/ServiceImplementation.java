 package com.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.crnts.Student;
import com.db.DBConnection;
import com.entity.Resource;

public class ServiceImplementation  implements Service
{
   
	@Override
	public void insert(Resource resource) {
		Connection connection=null;
		PreparedStatement statement=null;
		try {
			connection=DBConnection.getConnection();
			
				String query="INSERT INTO resource(id,name,location,code) values(?,?,?,?)";
				statement=connection.prepareStatement(query);
				 statement.setInt(1,resource.getId() );
				 statement.setString(2, resource.getName());
				 statement.setString(3, resource.getLocation());
				 statement.setInt(4, resource.getCode());
				 int record=statement.executeUpdate();
				System.out.println("inserted....");
			}
		catch (Exception e) {
			System.out.println("exception occured");
		}
		finally
		{
			DBConnection.close(statement, connection);
		}
		
	}

	@Override
	public void update(Resource resource) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Resource> getAll() {
		Connection connection=null;
		PreparedStatement statement=null;
		List<Resource> list=new ArrayList<>();
		try {
			connection=DBConnection.getConnection();
			
				String query="select * from resource";
				statement=connection.prepareStatement(query);
				 ResultSet result=statement.executeQuery();
				while(result.next())
				{
					int id=result.getInt("id");
					String name=result.getString("name");
					String location=result.getString("location");
					int code=result.getInt("code");
					list.add(new Resource(id,name,location,code));
					
				}
				return list;
				//System.out.println("....");
			}
		catch (Exception e) {
			System.out.println("exception occured");
		}
		finally
		{
			DBConnection.close(statement, connection);
		}
		return null;
	}

	@Override
	public Resource fetch(int id) {
		Connection connection=null;
		PreparedStatement statement=null;
		
		try {
			connection=DBConnection.getConnection();
			
				String query="select * from resource where id=?";
				statement=connection.prepareStatement(query);
				statement.setInt(1, id);
				 ResultSet result=statement.executeQuery();
				 Resource r=null;
				while(result.next())
				{
					int id1=result.getInt("id");
					String name=result.getString("name");
					String location=result.getString("location");
					int code=result.getInt("code");
					 r=new Resource(id1,name,location,code);
					
					
				}
				return r;
				//System.out.println("....");
			}
		catch (Exception e) {
			System.out.println("exception occured");
		}
		finally
		{
			DBConnection.close(statement, connection);
		}
		return null;
	}

	

//	@Override
//	public void save(Resource resource) {
//		String query="INSERT INTO resource(name,location,code,date) values(?,?,?,?)";
//		Connection connection=null;
//		PreparedStatement statement=null;
//		
//		try {
//			connection=DBConnection.getConnection();
//			statement=connection.prepareStatement(query);
//			statement.setString(1, resource.getName());
//			statement.setString(2, resource.getLocation());
//			statement.setInt(3, resource.getCode());
//			//statement.setDate(4, (Date) resource.getDate());
//			 int record=statement.executeUpdate();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		finally
//		{
//			DBConnection.close(statement, connection);
//		}
//		
//	}
//
//	@Override
//	public List<Resource> getAll() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	

}
