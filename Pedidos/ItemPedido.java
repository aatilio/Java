// package com.mycompany.one;
// package Pedidos;

public class ItemPedido {

    int Cantidad;
    Producto p;
    double subtotal;

    public ItemPedido() {

    }

    public ItemPedido(int c, Producto p) {
        this.Cantidad=c;
        this.p=p;
        this.subtotal=c*p.Precio;
    }

}
