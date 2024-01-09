package com.feujiCompany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feujiCompany.DTO.Application;
import com.feujiCompany.DTO.ApplicationEntity;
import com.feujiCompany.repository.FeujiRepository;

@Service
public class FeujiSeviceImpl implements FeujiService{

	
	@Autowired
	FeujiRepository feujiRepository;
	@Override
	public void save(Application application) {


		ApplicationEntity entity=new ApplicationEntity();
		entity.setFirstName(application.getFirstName());
		entity.setLastName(application.getLastName());
		entity.setEducation(application.getEducation());
		entity.setEmail(application.getEmail());
		entity.setLocation(application.getLocation());
		entity.setMblNo(application.getMblNo());
		entity.setPercentage(application.getPercentage());


		feujiRepository.save(entity);
		System.out.println("stored in db");
	}

}
