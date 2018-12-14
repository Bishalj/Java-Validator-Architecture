package com.setup.spring.data.repository.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.setup.spring.data.repository.demo.model.User;

public abstract class AbstractBaseDao<T> {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	
}
