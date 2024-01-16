package com.service;

import java.util.List;

import com.entity.Employee;

public interface Service 
{
	void save(Employee emp);
	List<Employee>getAll();

}
