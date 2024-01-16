package com.registration.service;

import com.registration.entity.RegistrationEntity;

import java.util.List;
import java.util.Optional;

public interface RegistrationService 
{
	void save(RegistrationEntity entity);
    List<RegistrationEntity> getAll();
     Optional<RegistrationEntity>  findById( int id);
     List<RegistrationEntity> findByGender(String gender);

}
