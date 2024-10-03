package com.crud.jwt.service;

import java.time.Instant;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.crud.jwt.Controller.CreateUserDto;
import com.crud.jwt.Entity.User;
import com.crud.jwt.repository.UserRepository;

@Service
public class UserService {
	
	private UserRepository UserRepository;
	
	

	public UserService(UserRepository userRepository) {
		this.UserRepository = userRepository;
	}



	public UUID createUser(CreateUserDto CreateUserDto) {
		
		//DTO - Entity
		var entity = new User(UUID.randomUUID(),
				CreateUserDto.Username(),
				CreateUserDto.email(),
				CreateUserDto.password(),
				Instant.now(),
				null);
				
				
		
		
		
		var userSaved = UserRepository.save(entity);
		
		return userSaved.getUserId()
		
		
	}
}
