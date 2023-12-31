package com.student.controller;

import java.io.IOException;
import java.time.Instant;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterExample2 implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("filter example 2");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("dofilter2 method started");
		Instant start = Instant.now();
		chain.doFilter(request, response);
		Instant end = Instant.now();
		System.out.println(" time diference is");
		System.out.println(end.getNano() - start.getNano());
		System.out.println("dofilter2 method ended");
	}

}
