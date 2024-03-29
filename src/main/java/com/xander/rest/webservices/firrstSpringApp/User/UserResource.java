package com.xander.rest.webservices.firrstSpringApp.User;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


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
		User user = service.findOne(id);
		if(user==null) {
			throw new UserNotFoundException("id-"+id);
		}
		return user; 
	}
	
	//CREATED
	//Input - details of user
	//Output - CREATED & Returrn the created URI
	@PostMapping("/users")
	public ResponseEntity<Object> createUser(@RequestBody User user) {
		User savedUser = service.save(user);
		//return "User Saved Successfully";
		URI location = ServletUriComponentsBuilder
		.fromCurrentRequest()
		.path("/{id")
		.buildAndExpand(savedUser.getId()).toUri();
		
		return ResponseEntity.created(location).build(); 
		
		
	}

}
