package com.crud.jwt.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.jwt.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, UUID>{

}
