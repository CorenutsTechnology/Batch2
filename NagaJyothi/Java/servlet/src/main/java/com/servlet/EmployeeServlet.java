package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

import com.entity.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.service.ServiceImpl;

/**
 * Servlet implementation class EmployeeServlet
 */
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		ServiceImpl result=new ServiceImpl();
		System.out.println("get");
		ObjectMapper objectMapper=new ObjectMapper();
		PrintWriter writer=response.getWriter();
		
		
		Employee emp=new Employee();
		System.out.println("employee");
//		String temp=request.getParameter("id");
//		int id=Integer.parseInt(temp);
//		String name=request.getParameter("name");
//		String deptNo=request.getParameter("dept");
//		String temp1=request.getParameter("sal");
//		System.out.println(temp1);
//		double sal=Double.parseDouble(temp1);
//		System.out.println(id);
//		System.out.println(name);
//		System.out.println(deptNo);
//		System.out.println(sal);
		//result.save(new Employee(id, name, deptNo, sal));
		System.out.println("getall");
		List<Employee> list=result.getAll();
		
//		String s=objectMapper.writeValueAsString(list);
//		response.setContentType("application/json");
//		writer.println(s);
		//System.out.println(s);
		//
		
		// conver json to Object
		ServletInputStream inputStream=request.getInputStream();
		String s1=IOUtils.toString(inputStream,"utf-8");
		Employee employee=objectMapper.readValue(s1, Employee.class);
		System.out.println(employee);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
