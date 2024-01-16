package com.crnts;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Session
 */
public class Session extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Session() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		ServletContext context=request.getServletContext();
		String userName= (String) context.getInitParameter("username");
		String password=(String) context.getInitParameter("password");
		System.out.println("UserName:"+userName);
		System.out.println("Password"+password);
		
		context.setAttribute("city", "hyd");
		System.out.println(context.getAttribute("city"));
		
		HttpSession session=request.getSession(true);
		session.setAttribute("session-info", "corenuts");
		System.out.println(session.getAttribute("session-info"));
		System.out.println("Session value"+session.getId());
	    
		Cookie[]cookie=request.getCookies();
		for(Cookie cookies:cookie)
		{
			System.out.println(cookies.getName()+"---"+cookies.getValue());
		}
		Cookie cookie1=new Cookie("Place", "Hyd");
		//System.out.println(cookie1);
		response.addCookie(cookie1);
		System.out.println(cookie1.getValue());
		
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		
        ServletContext context=config.getServletContext();
        
//		String userName=  (String) context.getAttribute("username");
//		String password= (String) context.getAttribute("password");
        
		System.out.println(config.getInitParameter("username"));
		System.out.println(config.getInitParameter("password"));
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	
	}

}
