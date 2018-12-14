package com.setup.spring.data.repository.demo.service;

import com.setup.spring.data.repository.demo.dao.UserDao;

public interface UserBeansFactory {
	
	UserService getUserService();
	
	UserDao     getUserDao();
}
