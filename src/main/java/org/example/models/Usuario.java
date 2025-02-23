package org.example.models;

public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private Perfil perfil;

    public Usuario() {
    }

    public Usuario(int id, String nome, String email, String senha, Perfil perfil) {
        this.nome = nome;
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.perfil = perfil;
    }

    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getSenha() {
        return senha;
    }
    public Perfil getPerfil() {
        return perfil;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setId(int id) {
        this.id = id;
    }
}
