package org.example.models;

import java.util.Date;

public class Transacao {
    private int id;
    private TipoTransacao tipo;
    private Date data;
    private double valor;
    private Usuario usuario;
    private Produto produto;

    public Transacao(int id, TipoTransacao tipo, Date data, double valor, Usuario usuario, Produto produto) {
        this.id = id;
        this.tipo = tipo;
        this.data = data;
        this.valor = valor;
        this.usuario = usuario;
        this.produto = produto;
    }

    public int getId() {
        return id;
    }


    public TipoTransacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransacao tipo) {
        this.tipo = tipo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
