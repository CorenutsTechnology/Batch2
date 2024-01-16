package com.student.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.student.entity.Student;
import com.student.service.StudentServiceImplementation;

/**
 * Servlet implementation class StudentServlet
 */
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public StudentServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		StudentServiceImplementation result = new StudentServiceImplementation();
		ObjectMapper objectMapper = new ObjectMapper();
		PrintWriter writer = response.getWriter();
		try {
			String sqlType = request.getParameter("sqlType");
			if (sqlType.equals("fetchAll")) {

				List<Student> list = result.fetchAll();
				System.out.println(list);

				objectMapper = new ObjectMapper();
				String json = objectMapper.writeValueAsString(list);
				response.setContentType("application/json");
				System.out.println(json);
				writer.println(json);
			}

			else if (sqlType.equals("fetch")) {
				String temp = request.getParameter("id");
				int id = Integer.parseInt(temp);
				List<Student> list = result.fetch(id);
				System.out.println(list);
				String json=objectMapper.writeValueAsString(list);
				response.setContentType("application/json");
				System.out.println(json);
				
			} else if (sqlType.equals("json")) {
				ServletInputStream inputStream = request.getInputStream();
				String s1 = IOUtils.toString(inputStream, "utf-8");
				Student student = objectMapper.readValue(s1, Student.class);
				System.out.println(student);
			}
		} catch (Exception e) {
			System.out.println("Exceptipn occured");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String sqlType = request.getParameter("sqlType");
		Student s = new Student();
		StudentServiceImplementation result = new StudentServiceImplementation();
		if (sqlType.equals("insert")) {
			String temp = request.getParameter("id");
			int id = Integer.parseInt(temp);
			String name = request.getParameter("name");
			String password = request.getParameter("password");
			String email = request.getParameter("email");
			String temp1 = request.getParameter("mobile");
			System.out.println(temp1);
			int mobile = Integer.parseInt(temp1);
			result.save(new Student(id, name, password, email, mobile));
		} else if (sqlType.equals("delete")) {

			String res = request.getParameter("id");
			int id1 = Integer.parseInt(res);
			result.delete(id1);
			System.out.println("deleted...");
		}

//		String mob=request.getParameter("mobile");
//		int mobile1=Integer.parseInt(mob);
//		String i=request.getParameter("id");
//		int id1=Integer.parseInt(i);
//		Student s1=new Student(id1,mobile1);
//		result.update(s1);

		doGet(request, response);

	}

}
