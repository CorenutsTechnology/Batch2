package com.registration.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.registration.entity.RegistrationEntity;
import com.registration.repository.RegistrationRepository;
import com.registration.service.RegistrationService;
import java.util.List;
import java.util.Optional;

@Service
public class RegistrationImplementation implements RegistrationService
{
	@Autowired
	private RegistrationRepository repository;

	@Override
	public void save(RegistrationEntity entity) {
		
		repository.save(entity);	
	}
     
	@Override
	public List<RegistrationEntity> getAll() {
		List<RegistrationEntity> list= repository.findAll();
		return list;
	}

	@Override
	public Optional<RegistrationEntity> findById(int id) {
		Optional<RegistrationEntity> entity=repository.findById(id);
		return entity;
	}

	@Override
	public List<RegistrationEntity> findByGender(String gender) {
		List<RegistrationEntity> list=repository.findByGender(gender);
		return list;
	}
	

}
