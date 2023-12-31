package com.student.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GenericServletEx extends GenericServlet
{

	
	private String parameter;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		parameter = req.getParameter("");
	}

}
