
// package com.mycompany.one;
// package Pedidos;

public class Producto {
    
    //int Id;
    String Nombre;
    double Precio;
    
    public Producto(){    };

    
    public Producto(String n, double p){
        this.Nombre = n;
        this.Precio = p;
    }
    
    
    public void MostrarDatosProducto(){
        System.out.println("PRODUCTO");
        //System.out.println("ID : " + this.Id);        
        System.out.println(this.Nombre + "(" + this.Precio + ")");
        //System.out.println("PRECIO : " + this.Precioo);

    }
    
}
