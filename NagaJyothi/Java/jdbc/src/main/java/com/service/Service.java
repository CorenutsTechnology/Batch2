package com.service;

import java.util.List;

import com.crnts.Student;
import com.entity.Resource;

public interface Service 
{
	void insert(Resource resource);
	void update(Resource resource);
	Resource fetch(int id);
	List<Resource> getAll();

}
