package com.xander.rest.webservices.firrstSpringApp.User;

import java.util.Date;

public class User {
	
	private Integer id;
	private String name;
	private Date bithDate;
	
	protected User() {
		
	}
	
	public User(Integer id, String name, Date bithDate) {
		super();
		this.id = id;
		this.name = name;
		this.bithDate = bithDate;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBithDate() {
		return bithDate;
	}
	public void setBithDate(Date bithDate) {
		this.bithDate = bithDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", bithDate=" + bithDate + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getBithDate()=" + getBithDate() + "]";
	}

	
}
