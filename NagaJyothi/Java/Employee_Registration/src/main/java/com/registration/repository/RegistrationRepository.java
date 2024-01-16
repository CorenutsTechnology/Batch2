package com.registration.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.registration.entity.RegistrationEntity;

public interface RegistrationRepository extends JpaRepository<RegistrationEntity, Integer>
{
	List<RegistrationEntity> findByGender(String gender);

}
