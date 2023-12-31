package com.student.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ContextExample extends HttpServlet {
	@Override
	public void init(ServletConfig config) throws ServletException {
		ServletContext servletContext = config.getServletContext();

//		String value2 = servletContext.getInitParameter("Specific-Servlet");//it will not work
		String username = config.getInitParameter("username");
		String password = config.getInitParameter("password");
		System.out.println("username" + username+" password: "+password);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		HttpSession session = req.getSession();
		System.out.println("username: " + session.getAttribute("username"));
		System.out.println("password: " + session.getAttribute("password"));
		
		ServletContext servletContext = req.getServletContext();
		
		String username = servletContext.getInitParameter("username");
		String password = servletContext.getInitParameter("password");
		System.out.println("username" + username+" password: "+password);

	}
}
