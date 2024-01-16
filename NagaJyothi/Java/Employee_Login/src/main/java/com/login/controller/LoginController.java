package com.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.login.entity.LoginEntity;
import com.login.service.LoginService;

@RestController
public class LoginController 
{
	@Autowired
	private LoginService service;
	
	
	@GetMapping(path = "/get")
	public ResponseEntity <String>get()
	{
		System.out.println("controller");
		return new ResponseEntity<String>("login successfull", HttpStatus.OK);
	}
	@PostMapping(path = "/save")
	public ResponseEntity <LoginEntity>save(@RequestBody LoginEntity entity)
	{
//		System.out.println("controller");
		service.save(entity);
		return new ResponseEntity<LoginEntity>(entity, HttpStatus.OK);
	}
	

}
