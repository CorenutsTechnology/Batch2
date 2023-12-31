package com.student.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.student.dto.ErrorMessageBean;

public class AuthenticationUsingFilter implements Filter {

	//whenever server starts this method will execute
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
		System.out.println("filter name: "+filterConfig.getInitParameter("username"));
		System.out.println("password: "+filterConfig.getInitParameter("password"));
	}
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException 
	{
		if(request.getParameter("username").equals("pravalika") &&
			request.getParameter("password").equals("123456789"))
		{
			System.out.println("credential are valid");
			chain.doFilter(request, response);
		}
		else {
			ErrorMessageBean bean = new ErrorMessageBean();
			bean.setErrorMessage("invalid credentials");
			bean.setLocation(this.getClass().toString());
			bean.setStatuscode(400);
			PrintWriter writer = response.getWriter();
			writer.println(bean);
			
		}
			
	}

}
