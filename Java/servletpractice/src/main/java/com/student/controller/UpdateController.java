package com.student.controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.student.dao.FetchRecords;
import com.student.dao.UpdateRecord;
import com.student.dto.Student;

public class UpdateController extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPut(req, resp);
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		ServletInputStream  inputStream=req.getInputStream();
		String record = IOUtils.toString(inputStream,"utf-8"); 
		ObjectMapper mapper = new ObjectMapper();
		Student student = mapper.readValue(record, Student.class);	
		Student orgStudent = FetchRecords.fetchSingleRecord(student.getId());
		if(orgStudent == null)
		{
			throw new FileNotFoundException("record not found with given id");
		}
		else {
				System.out.println(UpdateRecord.doUpdate(student));
		}
	}
}
