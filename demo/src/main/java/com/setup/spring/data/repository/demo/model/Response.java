package com.setup.spring.data.repository.demo.model;

public class Response {
	private boolean status = true;
	private String message;
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	public Response(boolean flag) {
		this.status = flag;
		// TODO Auto-generated constructor stub
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
