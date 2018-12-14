package com.setup.spring.data.repository.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.setup.spring.data.repository.demo.model.User;
import com.setup.spring.data.repository.demo.service.UserBeansFactory;
import com.setup.spring.data.repository.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{


	@Autowired
	private UserBeansFactory userBeansFactory;
	
	public User getUserDetails(String _id) {
		return userBeansFactory.getUserDao().findById(_id, User.class);
	}
}
