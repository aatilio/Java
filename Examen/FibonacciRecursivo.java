package Examen;

import java.util.Scanner;

public class FibonacciRecursivo {
    public static void main(String[] args) {
        try (Scanner nm = new Scanner(System.in)) {
            System.out.print("Ingrese el numero hasta donde quiere ver la secuencia fivo: ");
            int max = nm.nextInt();
            for (int i = 0; i <= max; i++) {
                int fibonacciNumber = FibonacciHastaNuro(i);
                System.out.print(" " + fibonacciNumber);
            }
            System.out.print("\n\nIngrese el la posicion del fivonacci que desea ver: ");
            int num = nm.nextInt();
            long elQueVaEnLa20 = fibonacciRecursivo(num);
            System.out.println("El que valor en la posición " + num + " es: " + elQueVaEnLa20);
        }
    }

    public static int FibonacciHastaNuro(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return FibonacciHastaNuro(n - 1) + FibonacciHastaNuro(n - 2);
    }

    public static long fibonacciRecursivo(long posicion) {
        if (posicion < 2)
            return posicion;
        return fibonacciRecursivo(posicion - 1) + fibonacciRecursivo(posicion - 2);
    }
}
