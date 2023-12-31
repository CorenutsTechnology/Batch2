package com.feuji.service;

import java.util.List;

import com.feuji.entity.TrainingEntity;

public interface TrainingService
{
	TrainingEntity save(TrainingEntity entity);
	TrainingEntity update(TrainingEntity entity);
	TrainingEntity get(long id);
	List<TrainingEntity> getAll();
	
}
