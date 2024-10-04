package com.puxada.bet.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.puxada.bet.Model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, UUID> {

	

}
