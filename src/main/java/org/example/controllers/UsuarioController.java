package org.example.controllers;

import org.example.models.Usuario;
import org.example.services.UsuarioService;

import java.util.List;

public class UsuarioController {
        UsuarioService usuarioService = new UsuarioService();

    public List<Usuario> listarTodos() {
        return usuarioService.listarTodos();
    }

    public Usuario salvarUsuario(Usuario usuario) {
        return usuarioService.salvar(usuario);
    }
}
