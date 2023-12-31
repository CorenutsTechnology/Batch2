package com.student.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HttpSessionExample extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = (HttpSession) req.getSession();
		System.out.println("session created........");
		// setting name& password using request
		req.setAttribute("username", "pravalika");
		req.setAttribute("password", "123456789");
		System.out.println("username: " + req.getAttribute("username"));
		System.out.println("password: " + req.getAttribute("password"));

		// setting name& password using request
		session.setAttribute("username", "Ram");
		session.setAttribute("password", "9177961320");
		System.out.println("username: " + session.getAttribute("username"));
		System.out.println("password: " + session.getAttribute("password"));

		System.out.println(session.getId());
		System.out.println(session.getCreationTime());
		System.out.println(session.getMaxInactiveInterval());
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie cookie = new Cookie("my-cookie", "pravali123");

		System.out.println("cookie created........");

		System.out.println("cookie name: " + cookie.getName());
		System.out.println("cookie password: " + cookie.getValue());
		System.out.println("version: " + cookie.getVersion());
		System.out.println(" max age: " + cookie.getMaxAge());
		System.out.println(" " + cookie.getClass().getName());

		
		resp.addCookie(cookie);
		resp.addCookie(new Cookie("my-cookie","pravali098"));
		Cookie cookie2[] = req.getCookies();
		for (Cookie cookiee : cookie2) {
			System.out.println("cook "+cookiee);
		}

	}
}
