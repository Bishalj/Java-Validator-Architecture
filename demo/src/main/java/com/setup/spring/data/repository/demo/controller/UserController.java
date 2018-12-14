package com.setup.spring.data.repository.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.setup.spring.data.repository.demo.model.User;
import com.setup.spring.data.repository.demo.model.Validator;
import com.setup.spring.data.repository.demo.service.UserBeansFactory;

@RestController
public class UserController {
	
	@Autowired
	private UserBeansFactory userBeansFactory;
	
	@GetMapping("/getUserDetails/{id}")
	public User getUserById(@RequestParam String _id) {
		return userBeansFactory.getUserService().getUserDetails(_id);
	}
	
	@GetMapping("/healthCheck")
	public String getHealthCheck() {
		return "Health Check";
	}
	
	@GetMapping("/healthCheck1")
	public Object getHealthCheck1() {
		
		try {
		Validator validator = new Validator();
		
	    validator.Validate(validator.isPresent("1"),validator.isPresent2("2"));
		return "Happy";
		
		}catch(Exception e) {
			System.out.println(e);
			return e.getMessage();
		}
	}
	
}
