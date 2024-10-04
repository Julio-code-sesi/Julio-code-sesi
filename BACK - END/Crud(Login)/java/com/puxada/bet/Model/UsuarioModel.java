package com.puxada.bet.Model;

import java.util.UUID;

import com.puxada.bet.dto.LoginDTO;
import com.puxada.bet.dto.UsuarioDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_userBet")
public class UsuarioModel {

	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	
	private UUID id;
	private String cpf, aniver,email,senha;
	
	public UsuarioModel(UsuarioDTO user) {
		this.cpf = user.cpf();
		this.aniver = user.aniver();
		this.email = user.email();
		this.senha = user.senha();
	
	}
	
	
	public UsuarioModel(LoginDTO login) {
		this.email = email;
		this.senha = senha;
	}
	

}
