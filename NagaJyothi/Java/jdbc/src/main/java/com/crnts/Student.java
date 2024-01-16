package com.crnts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.WriteAbortedException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.IOUtils;

import com.db.DBConnection;
import com.entity.Resource;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.service.Service;
import com.service.ServiceImplementation;

/**
 * Servlet implementation class Student
 */
public class Student extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Student() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("do get");	
//		String query="INSERT INTO resource(id,name,location,code) values(?,?,?,?)";
		Connection connection=null;
		PreparedStatement statement=null;
//		int id=5;
//		  String name="Indira";
//		  String location="guntur";
//		  int code=113;
		Service result=new ServiceImplementation();
		PrintWriter writer=response.getWriter();
		ObjectMapper objMapper=new ObjectMapper();
		String sqlType=request.getParameter("sqlType");
		
		
		  
		try {
			connection=DBConnection.getConnection();
			if(sqlType!=null) {
			if(sqlType.equals("insert"))
			{
				
				String temp=request.getParameter("id");
				int id1=Integer.parseInt(temp);
				String name1=request.getParameter("name");
				String loc=request.getParameter("location");
				String temp1=request.getParameter("code");
				int code1=Integer.parseInt(temp1);
				Resource resource=new Resource(id1,name1,loc,code1);
				result.insert(resource);	
			    //int record=statement.executeUpdate();
			    System.out.println("inserted....");
			}
			else if(sqlType.equals("update"))
			{
				String query="update resource set name=? where id=?";
				statement=connection.prepareStatement(query);
//				Update u1=new Update();
//				u1.update();
				 String name=request.getParameter("name");
				  int value=Integer.parseInt(request.getParameter("id"));
				statement.setString(1, name);
				statement.setInt(2, value);
				 int record=statement.executeUpdate();
				 System.out.println("updated successfully...");
			}
			else if(sqlType.equals("delete"))
			{
				String query1="delete from  resource  where id=?";
				statement=connection.prepareStatement(query1);
				  
				  String temp=request.getParameter("id");
				  int value=Integer.parseInt(temp);
				
				statement.setInt(1, value);
				 int record=statement.executeUpdate();
				 System.out.println("updated successfully...");
				
			}
			else if(sqlType.equals("fetch"))
			{
				
				List<Resource> list=result.getAll();
				
				String jsonobj=objMapper.writeValueAsString(list);
				response.setContentType("application/json");
				writer.println(jsonobj);
				
				
			}
			else if(sqlType.equals("insertjson"))
			{
				ServletInputStream inputStream=request.getInputStream();
				String record=IOUtils.toString(inputStream, "utf-8");
				Resource resource=objMapper.readValue(record, Resource.class);
				System.out.println(resource);
//				Resource resource2=
//				if(resource==null)
//				{
//					
//				}
			}
			else if(sqlType.equalsIgnoreCase("fetchid"))
			{
				int id=Integer.parseInt(request.getParameter("id"));
				Resource resource=result.fetch(id);
				if(resource!=null) {
					System.out.println(resource);
				}
				else
				{
					throw new FileNotFoundException("Resource not present with id "+id);
				}

				System.out.println("get record....");
				
				
			}
			}
//			ServletContext context=request.getServletContext();
//			String name=(String) context.getAttribute("username");
//			String password=(String) context.getAttribute("password");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			DBConnection.close(statement, connection);
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	private String getParameter(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		System.out.println("do post");
	}

}
