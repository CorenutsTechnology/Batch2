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
import com.student.dto.Student;

public class FetchController extends HttpServlet
{
	@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("doget() started");
			doPost(req, resp);
			System.out.println("doget() ended");
		}
	
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
//	{
//		List<Student> students = FetchAllRecords.fetchResultSet();
//		Iterator<Student> iterator = students.iterator();
//		PrintWriter writer = resp.getWriter();
//		writer.print("Existing Student records:");
//		while(iterator.hasNext())
//		{
//			writer.println(iterator.next());
//		}
//		writer.close();
//	}
	
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
	
	/*
	 * output
	 * Existing Student records:
{"id":101,"name":"Pravali","phno":6302818639,"password":"pravali123","marks":23,"location":"Andhra Pradesh"}
{"id":102,"name":"Mounika","phno":9177961320,"password":"mounika123","marks":47,"location":"Manglore"}
{"id":103,"name":"Supriya","phno":9390032811,"password":"supriya123","marks":52,"location":"Delhi"}
{"id":104,"name":"charitha","phno":6302818345,"password":"charitha123","marks":24,"location":"hyderabad"}
{"id":105,"name":"manasa","phno":6363818345,"password":"manasa123","marks":23,"location":"mysore"}
{"id":106,"name":"mamatha","phno":6363818347,"password":"mamatha123","marks":43,"location":"kolkata"}

	 */
}
