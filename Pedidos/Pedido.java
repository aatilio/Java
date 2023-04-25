import java.util.ArrayList;

// package com.mycompany.one;
// package Pedidos;

public class Pedido {

    int numPedido;

    Cliente c;
    double total;

    ArrayList<ItemPedido> ListaProd = new ArrayList();

    public Pedido(int np) {
        this.numPedido = np;
    }

    public Pedido(int np, Cliente c) {
        this.numPedido = np;
        this.c = c;
    }

    public Pedido() {
    }

    public void AsignarCliente(Cliente c) {
        this.c = c;
    }

    public void AgregarProductos(int c, Producto p) {
        this.ListaProd.add(new ItemPedido(c, p));
    }

    public void ImprimirPedido() {
        System.out.println("_______________________________________________________________________ ");
        System.out.println("        PEDIDO      ");
        System.out.println("N° " + this.numPedido);
        System.out.println("Nombre cliente :" + this.c.Nombre);
        System.out.println("_______________________________________________________________________ ");
        // productos del pedido
        System.out.println("DETALLES \t\tCANTIDAD \tPRECIO \t\tSUBTOTAL \n");
        this.ListaProd.forEach((n) -> System.out
                .println("" + n.p.Nombre + "\t\t" + n.Cantidad + "\t\tS/. " + n.p.Precio + "\t\tS/. " + n.subtotal));
        System.out.println("_______________________________________________________________________ ");
        this.ListaProd.forEach((n) -> this.total += n.subtotal);
        System.out.println("\t\t\t\t\t\t\tTOTAL:   " + this.total);
        System.out.println("_______________________________________________________________________ ");

    }

}
