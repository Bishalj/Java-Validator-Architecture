package com.setup.spring.data.repository.demo.dao.impl;

import org.springframework.stereotype.Repository;
import com.setup.spring.data.repository.demo.dao.AbstractBaseDao;
import com.setup.spring.data.repository.demo.dao.UserDao;
import com.setup.spring.data.repository.demo.model.User;

@Repository
public class UserDaoImpl extends AbstractBaseDao<UserDao> implements UserDao {

	@Override
	public User findById(String id, Class<User> clazz) {
		return null;
	}

	

}
