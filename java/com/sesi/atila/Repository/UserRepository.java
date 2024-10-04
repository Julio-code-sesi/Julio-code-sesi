package com.sesi.atila.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sesi.atila.Model.UsuarioModel;

@Repository
public interface UserRepository extends JpaRepository <UsuarioModel, UUID>{
	
	

}
