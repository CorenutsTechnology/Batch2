package com.feuji.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.feuji.config.HibernateConfiguration;
import com.feuji.entity.TrainingEntity;

@Repository
@Transactional
public class TrainingRepository 
{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	//= HibernateConfiguration.hibernateTemplate();
	
	public void save(TrainingEntity entity) 
	{
		 hibernateTemplate.save(entity);
	}

	public void update(TrainingEntity entity) {
		hibernateTemplate.update(entity);
	}

	public Optional<TrainingEntity> get(long id)
	{
		TrainingEntity trainingEntity = hibernateTemplate.get(TrainingEntity.class, id);
		return Optional.ofNullable(trainingEntity);
	}

	public List<TrainingEntity> getAll() 
	{
		List<TrainingEntity> trainingEntities = hibernateTemplate.loadAll(TrainingEntity.class);
		return trainingEntities ;
	}
}
