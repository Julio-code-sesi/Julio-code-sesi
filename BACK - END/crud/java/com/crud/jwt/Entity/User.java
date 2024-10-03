package com.crud.jwt.Entity;

import java.time.Instant;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "User")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)   
	private UUID userId;
	
	@Column(name = "Username")
	private String Username;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@CreationTimestamp
	private Instant creationTimestamp;
	
	@UpdateTimestamp
	private Instant updateTimesTamp;

	public User(UUID userId, String username, String email, String password, Instant creationTimestamp,
			Instant updateTimesTamp) {
		super();
		this.userId = userId;
		Username = username;
		this.email = email;
		this.password = password;
		this.creationTimestamp = creationTimestamp;
		this.updateTimesTamp = updateTimesTamp;
	}

	public UUID getUserId() {
		return userId;
	}

	public void setUserId(UUID userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Instant getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Instant creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public Instant getUpdateTimesTamp() {
		return updateTimesTamp;
	}

	public void setUpdateTimesTamp(Instant updateTimesTamp) {
		this.updateTimesTamp = updateTimesTamp;
	}
	
	
}
