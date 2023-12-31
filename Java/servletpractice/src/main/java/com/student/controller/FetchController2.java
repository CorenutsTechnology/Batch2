package com.student.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.student.dao.FetchRecords;
import com.student.dto.Student;

public class FetchController2 extends HttpServlet
{

	//printing on browser using jackson 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		List<Student> students = FetchRecords.fetchResultSet();
		Iterator<Student> iterator = students.iterator();
		PrintWriter writer = resp.getWriter();
		ObjectMapper mapper = new ObjectMapper();
		writer.println("Existing Student records:");
		while(iterator.hasNext())
		{
			String jacksonObject = mapper.writeValueAsString((iterator.next()));
			writer.println(jacksonObject);
		}
		writer.close();
	}
}
