package com.setup.spring.data.repository.demo.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Validator {
	private boolean status = true;
	private List<Object> missingField = new ArrayList<>();
	private List<Response> response = new ArrayList<>();
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public List<Response> getResponse() {
		return response;
	}
	public void setResponse(List<Response> response) {
		this.response = response;
	}
	public List<Object> getMissingField() {
		return missingField;
	}
	public void setMissingField(List<Object> missingField) {
		this.missingField = missingField;
	}
	
	public boolean isPresent(String a) {
		
		return true;
	}
	

	public Validator() {
		// TODO Auto-generated constructor stub
	}
	ObjectMapper mapper = new ObjectMapper(); 
	public Object Validate(Object... arr ) throws Exception {
		// TODO Auto-generated constructor stub
		
			for (Object result : arr) {
				JsonNode node = mapper.convertValue(result, JsonNode.class);
 				if(node.get("status") != null && node.get("status").asBoolean() == false) {
					getMissingField().add(node.get("message").asText());
					setStatus(false);
				}
			// TODO: handle exception
		}
		 if(!isStatus())
			 throw new Exception(getMissingField().toString());
		return true;
	}
	
	public Object isPresent2(String a) {
		if(a == null) {
			Response response = new Response(false);
			response.setMessage("String is empty");
			return response;
		}
		return "qwerty";
	}
}
