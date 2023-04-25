// package com.mycompany.one;
// package Pedidos;

public class Cliente {
    String Nombre;
    int DNI;
    public Cliente(String s){
        this.Nombre=s;
    }
    public Cliente(){
        
    }
    public void CambiarNombre(String nombre){
        this.Nombre = nombre;
    }
    
    public void MostrarDatos(){
        System.out.println("CLiente: " + this.Nombre);
    }
}
