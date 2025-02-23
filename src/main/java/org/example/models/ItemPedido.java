package org.example.models;

public class ItemPedido {
    private int id;
    private int quantidade;
    private double precoUnitario;
    private Pedidos pedido;
    private Produto produtos;

    public ItemPedido(int id, int quantidade, double precoUnitario, Pedidos pedido, Produto produtos) {
        this.id = id;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.pedido = pedido;
        this.produtos = produtos;
    }

    public int getId() {
        return id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public Pedidos getPedido() {
        return pedido;
    }


    public Produto getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto produtos) {
        this.produtos = produtos;
    }
}
