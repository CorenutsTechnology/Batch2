package com.student.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class StudentServlet1 extends GenericServlet 
{
	@Override
	public void init() throws ServletException {
		System.out.println("init method ");
	}	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		String name = req.getParameter("name");
		System.out.println("Name: "+name);
		
		PrintWriter writer = res.getWriter();
		writer.print("response from server");
	
	
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy method");
	}
}
