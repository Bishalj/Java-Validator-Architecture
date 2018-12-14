package com.setup.spring.data.repository.demo.dao;

import com.setup.spring.data.repository.demo.model.User;

public interface UserDao {
	public User findById(String id,Class<User> clazz);
}
