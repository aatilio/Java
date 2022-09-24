package Practica;

import java.util.Scanner;
//import ArrayList;

public class Pedido {

    public String cliente;
    public float monto;
    public String direccion;

    public static void main(String[] args) {
        // metodo MAIN

        try (
                Scanner sc = new Scanner(System.in)) {
            // do {
            int opc;
            System.out.print("        MENU ");
            System.out.print("\nVer calculadora     >   1 ");
            System.out.print("\nVer productos       >   2 ");
            System.out.print("\nCalcular promedio   >   3 ");
            System.out.print("\nNum mayor menor     >   4 ");
            System.out.print("\nDescuento           >   5 ");
            System.out.print("\n\nIntroduce una opcion:     ");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    // teclado numerico
                    Teclado();
                    break;
                case 2:
                    // ver productos
                    Productos();
                    break;
                case 3:
                    // calcular promedio
                    int numero1, numero2;
                    float resultado;
                    System.out.print("Introduce primer número: ");
                    numero1 = sc.nextInt();
                    System.out.print("Introduce segundo número: ");
                    numero2 = sc.nextInt();
                    resultado = Promedio(numero1, numero2);
                    System.out.println("Promedio: " + resultado);
                    // }
                    break;

                case 4:
                    // numero mayor y menor
                    int num1, num2;
                    System.out.print("Introduce primer número: ");
                    num1 = sc.nextInt();
                    System.out.print("Introduce segundo número: ");
                    num2 = sc.nextInt();
                    MayorMenor(num1, num2);

                    break;
                case 5:
                    // descuento
                    float precio, descuento;
                    float resul;
                    System.out.print("Introduce el total a pagar: ");
                    precio = sc.nextInt();
                    System.out.print("Introduce el % a descontar: ");
                    descuento = sc.nextInt();
                    resul = Descuento(precio, descuento);
                    System.out.println("Total a pagar con el descuento: " + resul);

                    break;
                default:
                    System.out.println("ingrese una opcion valida");
                    break;
            }
            // } while (opc <= 0 || opc >= 6);
        }
    }

    public static void Teclado() {
        System.out.println("0");
        // declarar e inicializar array 2D
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // imprimir array 2D
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(arr[i][j] + " ");

            System.out.println();
        }
    }

    public static void Productos() {
        System.out.println();
        // declarar e inicializar array 2D
        String[] productos = new String[3];

        double[] precio = new double[3];

        productos[0] = "Laptop";
        productos[1] = "telefono";
        productos[2] = "microfono";

        precio[0] = 4500;
        precio[1] = 2584;
        precio[2] = 560;

        // imprimir array 2D
        for (int i = 0; i < 3; i++) {
            System.out.print(productos[i] + "   precio: " + precio[i]);
            System.out.println();
        }
    }

    public static float Promedio(int a, int b) {
        float c;
        c = (a + b) / 2;
        return c;
    }

    public static void MayorMenor(int a, int b) {
        if (a > b) {
            System.out.println("El numero mayor es: " + a);
            System.out.println("El numero menor es: " + b);
        } else {
            System.out.println("El numero mayor es: " + b);
            System.out.println("El numero menor es: " + a);
        }
    }

    public static float Descuento(float a, float b) {
        float d;
        d = (a * (b / 100));
        float total;
        total = a - d;
        return total;
    }
}
