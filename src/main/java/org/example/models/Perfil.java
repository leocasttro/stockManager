package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Perfil {
    private final int id;
    private String nome;
    private List<Permissoes> permissoes;
    public Perfil(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.permissoes = new ArrayList<>();
    }
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public List<Permissoes> getPermissoes() {
        return permissoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPermissoes(List<Permissoes> permissoes) {
        this.permissoes = permissoes;
    }
}
