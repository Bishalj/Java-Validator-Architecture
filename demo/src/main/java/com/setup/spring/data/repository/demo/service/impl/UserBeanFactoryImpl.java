package com.setup.spring.data.repository.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.setup.spring.data.repository.demo.dao.UserDao;
import com.setup.spring.data.repository.demo.service.UserBeansFactory;
import com.setup.spring.data.repository.demo.service.UserService;

@Service
public class UserBeanFactoryImpl implements UserBeansFactory{

	@Autowired
	private UserService userService;

	@Autowired
	private UserDao userDao;
	
	public UserService getUserService(){
		return userService;
	}
	
	public UserDao getUserDao(){
		return userDao;
	}
}
