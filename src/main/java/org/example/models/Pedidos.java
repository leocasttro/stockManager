package org.example.models;

import java.util.Date;

public class Pedidos {
    private final int id;
    private Date dataPedido;
    private Status statusPedido;
    private final Usuario usuarioPedido;

    public Pedidos(Status statusPedido, int id, Date dataPedido, Usuario usuarioPedido) {
        this.statusPedido = statusPedido;
        this.id = id;
        this.dataPedido = dataPedido;
        this.usuarioPedido = usuarioPedido;
    }

    public int getId() {
        return id;
    }
    public Date getDataPedido() {
        return dataPedido;
    }
    public Status getStatusPedido() {
        return statusPedido;
    }

    public Usuario getUsuarioPedido() {
        return usuarioPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }
    public void setStatusPedido(Status statusPedido) {
        this.statusPedido = statusPedido;
    }
}
