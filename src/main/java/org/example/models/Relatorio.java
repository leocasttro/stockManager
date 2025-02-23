package org.example.models;

import java.util.Date;

public class Relatorio {
    private final int id;
    private Date dataGeracao;
    private String tipo;

    public Relatorio(int id, Date dataGeracao, String tipo) {
        this.id = id;
        this.dataGeracao = dataGeracao;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public Date getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(Date dataGeracao) {
        this.dataGeracao = dataGeracao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
