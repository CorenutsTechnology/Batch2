package com.student.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.student.dto.ErrorMessageBean;

public class ErrorMessageController extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		doPost(req, resp);
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		Exception exception =(Exception) req.getAttribute("javax.servlet.error.exception");
		int status_code = (int) req.getAttribute("javax.servlet.error.status_code");
		String location = (String) req.getAttribute("javax.servlet.error.servlet_name");
		
		ErrorMessageBean messageBean = new ErrorMessageBean();
		if(exception != null)
		{
			messageBean.setErrorMessage((exception).getMessage());
			System.out.println(messageBean.getErrorMessage().getClass().getSimpleName());
		}
		else {
			messageBean.setErrorMessage((String) req.getAttribute("javax.servlet.error.message"));
		}
		
		
		messageBean.setLocation(location);
		messageBean.setStatuscode(status_code);
		
		ObjectMapper mapper = new  ObjectMapper();
		String json = mapper.writeValueAsString(messageBean);
		
		PrintWriter writer = resp.getWriter();
		writer.print(json);
		
		
	}
}
