package com.setup.spring.data.repository.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("User")
public class User {
	@Id
	private String _id;
	@Field(value="name")
	private String name;
}
