package PalabraReser;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try (
        Scanner reader = new Scanner(System.in)) {
            int numero1 = 0;
            int numero2 = 0;
            System.out.println("Introduce el número 1:")
            numero1 = reader.nextInt();
            System.out.println("Introduce el número 2:");
            numero2 = reader.nextInt();
            int suma=numero1+numero2;

            System.out.println("La suma de los dos número es: "+suma);
        }
    
    }
}
