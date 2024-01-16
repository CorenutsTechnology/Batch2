package com.registration.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.registration.entity.RegistrationEntity;
import com.registration.serviceimpl.RegistrationImplementation;

@RestController
@RequestMapping("/register")
public class RegistrationController 
{
	@Autowired
	private RegistrationImplementation registration;
	
	@RequestMapping("/get")
	public ResponseEntity<String> get()
	{
		
		
		return new ResponseEntity<>("Employee Registration",HttpStatus.OK);
	}
	//@RequestMapping("/save")
	@PostMapping(path="/save")
	public ResponseEntity<RegistrationEntity> save(@RequestBody RegistrationEntity entity)
	{
		registration.save(entity);
		
		return new ResponseEntity<RegistrationEntity>(entity,HttpStatus.OK);
	}
	
	
	@GetMapping(path = "/fetch/{id}")
	public ResponseEntity<RegistrationEntity> getById(@PathVariable(value="id") int id)
	{
		Optional<RegistrationEntity> result=registration.findById(id);
		return new ResponseEntity<RegistrationEntity>(result.get(),HttpStatus.OK);
	}
	
	@GetMapping(path = "/getall")
	public ResponseEntity<List<RegistrationEntity>> getAll()
	{
		List<RegistrationEntity> result=registration.getAll();
		return new ResponseEntity<List<RegistrationEntity>>(result,HttpStatus.OK);
	}
	
	@GetMapping(path = "/getgender/{gender}")
	public ResponseEntity<List<RegistrationEntity>> getByGender(@PathVariable(value="gender") String gender)
	{
		
		List<RegistrationEntity> result=registration.findByGender(gender);
		return new ResponseEntity<List<RegistrationEntity>>(result,HttpStatus.OK);
	}
	
	

}
