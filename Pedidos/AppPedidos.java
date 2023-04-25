import java.util.ArrayList;
import java.util.Scanner;

//package com.mycompany.one;
// package Pedidos;

public class AppPedidos {

    public static void main(String[] args) {
        // Creamos un objeto Scanner para poder leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Creamos un ArrayList para almacenar todos los pedidos realizados
        ArrayList<Pedido> pedidos = new ArrayList<>();

        // Creamos una variable booleana para saber si el usuario quiere seguir
        // realizando pedidos
        boolean continuar = true;
        while (continuar) {
            // Declaramos variables para almacenar la información del pedido
            int numCliente;
            String nombreCliente;
            int numProductos, cantidad;
            String nomProducto;
            double precio;

            // Mostramos un mensaje de bienvenida al usuario
            System.out.println("Bienvenido a la aplicación de pedidos\n");

            // Pedimos al usuario que ingrese el número del cliente
            System.out.print("Numero de cliente: ");
            numCliente = scanner.nextInt();
            scanner.nextLine(); // Consumimos el salto de línea después del número

            // Pedimos al usuario que ingrese el nombre y apellido del cliente
            System.out.print("Ingrese el nombre y apellido del cliente: ");
            nombreCliente = scanner.nextLine();

            // Creamos un objeto Pedido con la información del cliente
            Pedido pedido = new Pedido(numCliente, new Cliente(nombreCliente));

            // Pedimos al usuario que ingrese la cantidad de productos que desea ordenar
            System.out.print("Cantidad de productos: ");
            numProductos = scanner.nextInt();
            scanner.nextLine(); // Consumimos el salto de línea después del número

            // Mostramos un mensaje para indicar que comenzarán a pedirse los detalles de
            // cada producto
            System.out.println("\t\tDETALLES DEL PRODUCTO");
            for (int i = 1; i <= numProductos; i++) {
                System.out.println("\tProducto N°: " + i);

                // Pedimos al usuario que ingrese el nombre del producto
                System.out.print("Nombre\t\t: ");
                nomProducto = scanner.nextLine();

                // Pedimos al usuario que ingrese la cantidad del producto que desea ordenar
                System.out.print("Cantidad\t: ");
                cantidad = scanner.nextInt();

                // Pedimos al usuario que ingrese el precio del producto
                System.out.print("Precio\t\t: ");
                precio = scanner.nextFloat();

                scanner.nextLine(); // Consumimos el salto de línea después del precio

                // Creamos un objeto Producto con la información ingresada por el usuario y lo
                // agregamos al pedido
                pedido.AgregarProductos(cantidad, new Producto(nomProducto, precio));
            }

            // Agregamos el pedido al ArrayList de pedidos realizados
            pedidos.add(pedido);

            // Mostramos el resumen del pedido
            pedido.ImprimirPedido();

            // Preguntamos al usuario si desea realizar otro pedido
            System.out.print("¿Desea agregar otro pedido? (s/n): ");
            String respuesta = scanner.nextLine();
            continuar = respuesta.equalsIgnoreCase("s");
        }

        // Mostramos un resumen de todos los pedidos realizados
        System.out.println("\nRESUMEN DE PEDIDOS:");
        for (Pedido pedido : pedidos) {
            pedido.ImprimirPedido();
        }

    }

    // Cliente c1, c2;
    // c1 = new Cliente();
    // c1.CambiarNombre("ALAN ATILIO");
    // c1.MostrarDatos();

    // c2 = new Cliente();
    // c2.CambiarNombre("Brayan darcy");
    // c2.MostrarDatos();

    // Producto p1, p2;
    // p1 = new Producto("XIAOMI 12 T PRO", 2255);
    // p2 = new Producto("SANSUNG S 23 ULTRA", 5855);

    // p1.MostrarDatosProducto();
    // p2.MostrarDatosProducto();

    // Pedido ped1 = new Pedido(1);
    // // ped1.AsignarCliente(new Cliente("Carlos ponce");
    // ped1.AsignarCliente(new Cliente("juan vetansos"));
    // ped1.ImprimirPedido();

    // Pedido ped2 = new Pedido(2, new Cliente("Brenda Liz"));
    // ped2.AgregarProductos(2, new Producto("Cocacola 1L", 2.5));
    // ped2.AgregarProductos(3, new Producto("Fanta 1L", 2));
    // ped2.AgregarProductos(4, new Producto("Agua mineral", 1.2));
    // ped2.ImprimirPedido();

    // Pedido ped3 = new Pedido(3, new Cliente("Juana Alarcon"));
    // ped3.AgregarProductos(5, new Producto("Papitas lyce", 2.8));
    // ped3.AgregarProductos(3, new Producto("Chocolate Fondy", 2.5));
    // ped3.AgregarProductos(2, new Producto("Inca cola 2.5 L", 9));
    // ped3.AgregarProductos(6, new Producto("Soda Dia ", 1.5));

    // ped3.ImprimirPedido();
}
