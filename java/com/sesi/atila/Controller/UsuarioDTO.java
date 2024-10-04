package com.sesi.atila.Controller;

import java.util.UUID;

import com.sesi.atila.Model.UsuarioModel;

public record UsuarioDTO(UUID id, String nome, int cpf, int telefone, String email) {
    
    public UsuarioDTO(UsuarioModel user) {
        this(user.getId(), user.getNome(), user.getCpf(), user.getTelefone(), user.getEmail());
    }
}
