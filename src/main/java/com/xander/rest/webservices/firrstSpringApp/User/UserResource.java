package com.xander.rest.webservices.firrstSpringApp.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	
	@Autowired
	private UserDaoService service;
	
	//retrieve AllUsers
	//GET /users
	@GetMapping("/users")
	public List<User> retrieveAllUsers(){
		return service.findAll();
	}
	
	//retrieveUser(int id)
	//GET /users/{id}
	@GetMapping("/users/{id}")
	public User retrieveUser(@PathVariable int id) {
		return service.findOne(id);		
	}
	
	//CREATED
	//Input - details of user
	//Output - CREATED & Returrn the created URI
	@PostMapping("/users")
	public String createUser(@RequestBody User user) {
		User savedUser = service.save(user);
		return "User Saved Successfully";
	}

}
