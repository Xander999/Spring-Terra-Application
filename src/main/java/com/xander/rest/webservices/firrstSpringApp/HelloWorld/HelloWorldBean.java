package com.xander.rest.webservices.firrstSpringApp.HelloWorld;

public class HelloWorldBean {
	
	private String message;
	public HelloWorldBean(String msg) {
		this.message = msg; 
	}
	public String getMessage() {
		return message;
	}
	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
