package com.student.controller;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListner implements HttpSessionListener
{
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println(se.getSession().getCreationTime());
		
	}
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println(se.getSession().getLastAccessedTime());
	}
	
}
