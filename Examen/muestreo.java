package Examen;

import java.util.Scanner;

public class muestreo {
    public static void main(String[] args) {
        ingresoDatos();
    }

    public static void ingresoDatos() {
        try (Scanner nm = new Scanner(System.in)) {

            double snin = 0, sjov = 0, sadu = 0, svie = 0;
            int nin = 0, jov = 0, adu = 0, vie = 0;
            System.out.println("Numero de personas encuestadas: ");
            int nroper = nm.nextInt();
            int[][] edPe = new int[nroper][2];

            for (int j = 0; j < nroper; j++) {
                System.out.println("\nPersona numero " + (j + 1));
                System.out.println("Ingrese edad: ");
                edPe[j][0] = nm.nextInt();
                System.out.println("Ingrese peso: ");
                edPe[j][1] = nm.nextInt();
            }

            for (int j = 0; j < nroper; j++) {
                System.out.println("Persona numero " + (j + 1) + " edad: " + edPe[j][0] + " peso: " + edPe[j][1]);
                if (edPe[j][0] >= 0 && edPe[j][0] < 13) {
                    nin++;
                    snin = snin + edPe[j][1];
                }
                if (edPe[j][0] >= 13 && edPe[j][0] < 30) {
                    jov++;
                    sjov = sjov + edPe[j][1];
                }
                if (edPe[j][0] >= 30 && edPe[j][0] < 60) {
                    adu++;
                    sadu = sadu + edPe[j][1];
                }
                if (edPe[j][0] >= 60 && edPe[j][0] < 101) {
                    vie++;
                    svie = svie + edPe[j][1];
                }
            }

            System.out.print("\nNUMERO DE PERSONAS EN CADA CATEGORIA");
            System.out.print("\nNiños: " + nin + " Peso promedio " + snin / nin);
            System.out.print("\nJovenes: " + jov + " Peso promedio " + sjov / jov);
            System.out.print("\nAdultos: " + adu + " Peso promedio " + sadu / adu);
            System.out.print("\nViejos: " + vie + " Peso promedio " + svie / vie);
        }
    }
}
