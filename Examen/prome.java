package Examen;

import java.util.Scanner;

public class prome {
    /*
     * 2. Calcular el promedio de dos alumnos que tiene 8 calificaciones en la
     * materia de
     * Algoritmos Avanzados y estructura de Datos. (4 puntos)
     */
    public static void main(String args[]) {
        calculo();
    }

    static double CalculoPromedio(int n1, int n2, int n3, int n4) {
        double promediFinal = 0;
        promediFinal = (n1 + n2 + n3 + n4) / 4;
        return promediFinal;
    }

    public static void calculo() {
        int numeroAlu = 0;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println(" INGRESO DE NOSTAS PARA PROMEDIO FINAL DE 2 CURSOS ");
            while (numeroAlu != 2) {
                double Algoritmos_Avanzados = 0, Estructura_Datos = 0;
                int an1 = 0, an2 = 0, an3 = 0, an4 = 0, en1 = 0, en2 = 0, en3 = 0, en4 = 0;
                String nombre = "";
                
                System.out.print(" Ingrese el nombre del alumno: ");
                nombre = scan.nextLine();

                System.out.println(" Algoritmos Avanzados ");
                System.out.print("Ingresa la nota 1: ");
                an1 = scan.nextInt();
                System.out.print("Ingresa la nota 2: ");
                an2 = scan.nextInt();
                System.out.print("Ingresa la nota 3: ");
                an3 = scan.nextInt();
                System.out.print("Ingresa la nota 4: ");
                an4 = scan.nextInt();
                Algoritmos_Avanzados = CalculoPromedio(an1, an2, an3, an4);

                System.out.print("________________________________________________________________\n\n");
                System.out.println(" Estructura de Datos ");
                System.out.print("Ingresa la nota 1: ");
                en1 = scan.nextInt();
                System.out.print("Ingresa la nota 2: ");
                en2 = scan.nextInt();
                System.out.print("Ingresa la nota 3: ");
                en3 = scan.nextInt();
                System.out.print("Ingresa la nota 4: ");
                en4 = scan.nextInt();
                Estructura_Datos = CalculoPromedio(en1, en2, en3, en4);
                System.out.println(
                        "Promedio final del alumno " + (numeroAlu + 1) + " " + nombre + " es: "
                                + (Estructura_Datos + Algoritmos_Avanzados) / 2);
                numeroAlu += 1;
            }
        }
    }
}
