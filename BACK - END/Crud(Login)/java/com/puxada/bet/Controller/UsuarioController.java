package com.puxada.bet.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.puxada.bet.Model.UsuarioModel;
import com.puxada.bet.Repository.UsuarioRepository;
import com.puxada.bet.dto.UsuarioDTO;

@RestController
@RequestMapping("api")
public class UsuarioController {

	
	@Autowired
	UsuarioRepository repository;
	
	@PostMapping("cadastrar")
	public ResponseEntity<?> salvarUsuario(@RequestBody UsuarioDTO usuario){
		UsuarioModel user = new UsuarioModel(usuario);
		repository.save(user);
		return ResponseEntity.ok("usuario salvo com sucesso");
		
	}
}
