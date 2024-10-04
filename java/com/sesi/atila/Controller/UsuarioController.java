package com.sesi.atila.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sesi.atila.Model.UsuarioModel;
import com.sesi.atila.Repository.UserRepository;

@RestController
@RequestMapping("user")

public class UsuarioController {

	@Autowired
	UserRepository repository;

	@GetMapping
	public List<UsuarioModel> listarUsuario() {

		List<UsuarioModel> Lista = repository.findAll();
		return Lista;

	}

	@PostMapping
	public void salvarUsuario(@RequestBody UsuarioDTO dados) {
		UsuarioModel userdata = new UsuarioModel(dados);
		repository.save(userdata);

	}
}
