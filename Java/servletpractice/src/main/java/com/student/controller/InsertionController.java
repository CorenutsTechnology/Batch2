package com.student.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.student.dao.FetchRecords;
import com.student.dao.InsertStudentRecord;
import com.student.dto.Student;

public class InsertionController extends HttpServlet
{
		@Override
		public void init() throws ServletException {
			System.out.println("init method");
		}
	
		//printing on browser using json object
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
		{
			System.out.println("dopost() started");
			List<Student> students = FetchRecords.fetchResultSet();
			Iterator<Student> iterator = students.iterator();
			PrintWriter writer = resp.getWriter();
			Gson gson = new Gson();
			writer.println("Existing Student records:");
			while(iterator.hasNext())
			{
				String jsonStudentObject = gson.toJson(iterator.next());
				writer.println(jsonStudentObject);
			}
			writer.close();
			System.out.println("dopost() ended");
		}
		
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
		{
			System.out.println("starting doGet method");
			String id = req.getParameter("id");
			String name = req.getParameter("name");
			String phno = req.getParameter("phno");
			String password = req.getParameter("password");
			String marks = req.getParameter("marks");
			String location = req.getParameter("location");
						
			int id2 = Integer.parseInt(id);
			long phno2 = Long.parseLong(phno) ;
			int marks2 = Integer.parseInt(marks);
			
			Student student = new Student(id2 ,name,phno2,password, marks2, location);
			
			String result = InsertStudentRecord.insertRecord(student);
			System.out.println(result);
		
			doPost(req, resp);
		}		
		@Override
		public void destroy() 
		{
			System.out.println("destroy");
		}
}
