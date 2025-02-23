package org.example;

import org.example.controllers.UsuarioController;
import org.example.models.Usuario;
import org.example.services.UsuarioService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UsuarioController controller = new UsuarioController();
        Usuario novoUsuario = new Usuario();

        novoUsuario.setNome("Maria");
        novoUsuario.setEmail("maria@email.com");
        novoUsuario.setSenha("senha123");

        Usuario usuarioSalvo = controller.salvarUsuario(novoUsuario);

        //List<Usuario> usuarios = controller.listarTodos();

//        if (usuarios.isEmpty()) {
//            System.out.println("Nenhum usuário encontrado.");
//        } else {
//            for (Usuario usuario : usuarios) {
//                System.out.println("ID: " + usuario.getId());
//                System.out.println("Nome: " + usuario.getNome());
//                System.out.println("Email: " + usuario.getEmail());
//                System.out.println("-------------------");
//            }
//        }
    }
}