package Examen;

import java.util.Scanner;

public class Multipicado {
    public static void main(String[] args) {
        mpProcesar();
    }

    private static float mtMultiplicar(float nro) {
        return nro * 2;
    }

    public static void mpProcesar() {
        try (Scanner nm = new Scanner(System.in)) {
            int tValor;
            System.out.print("Ingrese el numero a multiplicar ");
            tValor = nm.nextInt();
            System.out.print("El resultado es: " + mtMultiplicar(tValor));
        }
    }
}
