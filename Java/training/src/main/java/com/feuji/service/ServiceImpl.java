package com.feuji.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feuji.entity.TrainingEntity;
import com.feuji.repository.TrainingRepository;

@Service
public class ServiceImpl implements TrainingService {

	@Autowired
	private TrainingRepository repository;
	
	public TrainingEntity save(TrainingEntity entity) 
	{
		repository.save(entity);
		return entity ;
	}

	public TrainingEntity update(TrainingEntity entity) 
	{
		repository.update(entity);
		return entity;
	}

	
	public TrainingEntity get(long id) 
	{
		Optional<TrainingEntity> optional = repository.get(id);
		
		TrainingEntity trainingEntity = optional.orElseThrow(()-> new IllegalArgumentException("Record not found"));
		return trainingEntity;
	}

	@Override
	public List<TrainingEntity> getAll() {
		return repository.getAll();
	}

}
