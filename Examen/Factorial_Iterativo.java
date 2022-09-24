package Examen;

import java.util.Scanner;

/*
 * Crear un programa consistente que me calcule el factorial de un número utilizando 
 * la iteración. (3puntos)
 */
public class Factorial_Iterativo {

    public static void main(String args[]) {
        int numero;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Ingresa un numero:    ");
            numero = scan.nextInt();
        }
        System.out.println("El factorial de " + numero + " es: " + factorial_Iterado(numero));
    }
    
    static long factorial_Iterado(int n) {
        long factorialFinal = 1;
        int i = 1;
        while (i <= n) {
            factorialFinal = factorialFinal * i;
            i++;
        }
        return factorialFinal;
    }

    
}
