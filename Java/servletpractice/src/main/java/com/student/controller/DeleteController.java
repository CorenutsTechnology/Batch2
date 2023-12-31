package com.student.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.dao.DeleteRecord;
import com.student.dao.FetchRecords;
import com.student.dto.Student;

public class DeleteController extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String string= req.getParameter("id");
		System.out.println(string);
		int id = Integer.parseInt(string);
		Student orgStudent = FetchRecords.fetchSingleRecord(id);
		if(orgStudent == null)
		{
			throw new IllegalArgumentException("record not found with given id");
		}
		else {
				System.out.println(DeleteRecord.deleteRecord(id));
		}
	}

}
