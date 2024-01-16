package com.crnts;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ValidateFilter implements Filter
{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("filter started");
		String name=request.getParameter("username");
//		String name="jyothi";
//		String password="jyothi123";
		String password=request.getParameter("password");
		if(name.equals("Jyothi")&&password.equals("jyothi123"))
		{
			chain.doFilter(request, response);
			
			System.out.println("filter method");
			
		}
		else
		{
			System.out.println("Authentication failed...");
		}
		
	}
	

}
