package com.student.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.student.dao.FetchRecords;
import com.student.dto.Student;

public class HeaderDetailsExtract extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ServletContext servletContext = req.getServletContext();

		String username = servletContext.getInitParameter("username");
		String password = servletContext.getInitParameter("password");
		System.out.println("username" + username + " password: " + password);

		Enumeration<String> headerNames = req.getHeaderNames();

		// headers
		while (headerNames.hasMoreElements()) {
			String header = headerNames.nextElement();
			System.out.println(header + "---" + req.getHeader(header));
		}

		System.out.println(req.getContextPath());
		System.out.println(req.getServletContext().getContextPath());
		System.out.println(req.getContentType());
		System.out.println(req.getRemoteAddr());
		System.out.println(req.getRemoteHost());
		System.out.println(req.getRemotePort());

		System.out.println(req.getLocalAddr());
		System.out.println(req.getLocalPort());
		System.out.println(req.getLocalName());

		System.out.println(req.getRequestURI());

	}
}
