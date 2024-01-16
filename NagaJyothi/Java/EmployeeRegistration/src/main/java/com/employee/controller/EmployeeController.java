package com.employee.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.bean.EmployeeRegistration;

@RestController
//@RequestMapping(path = "/controller")
public class EmployeeController 
{
	@GetMapping(path = "/get")
	public ResponseEntity<String> get()
	{
		
		System.out.println("hiii");
		return new ResponseEntity<>("Employee",HttpStatus.OK);
	}
	

}
