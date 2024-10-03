package com.crud.jwt.Controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.jwt.Entity.User;
import com.crud.jwt.service.UserService;

@RestController
@RequestMapping("/v1/users")
public class UserController {
	
	private UserService UserService;
	
	
	public UserController(UserService userService) {
		this.UserService = userService;
	}


	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody CreateUserDto CreateUserDto){
		UserService.createUser(CreateUserDto);
		var userId = UserService.createUser(CreateUserDto);
		return  ResponseEntity.created(URI.create("/v1/users/" + userId.toString())).build();
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<User> getUserByiD(@PathVariable("userId") String body){
		
		//
		
		return null;

}
	}

