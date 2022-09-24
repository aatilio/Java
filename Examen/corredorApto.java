package Examen;

import java.util.Scanner;

public class corredorApto {

    /*
     * 3. Un entrenador le ha propuesto a un atleta recorrer una ruta de cinco
     * kilómetros durante 10 días,
     * para determinar si es apto para la prueba de 5 Kilómetros o debe buscar otra
     * especialidad.
     * Para considerarlo apto debe cumplir por lo menos una de las siguientes
     * condiciones: (4 puntos)
     * 
     * a. Que en ninguna de las pruebas haga un tiempo mayor a 16 minutos.
     * b. Que al menos en una de las pruebas realice un tiempo mayor a 16 minutos.
     * c. Que su promedio de tiempos sea menor o igual a 15 minutos.
     */

    public static String nombre;
    public static float tiempo, tiempoTotal, promedioTiempo;
    public static int numPrueva = 1;

    public static void main(String args[]) {
        
        try (Scanner scan = new Scanner(System.in)) {
            
            determinarPromedioN();
            System.out.println("___________________________________________________________________________________________________\n\n");
            System.out.println("\t\tNombre del atleta: " + nombre);
            System.out.println("Tiempo promedio de " + (numPrueva - 1) + " pruevas realizadas es: " + promedioTiempo);
            esApto(promedioTiempo);
        }
    }

    public static void determinarPromedioN() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("\t\tMARATON DE 5 KILOMETROS DURANTE 10 DIAS\n\n");
            System.out.print("Ingresa su nombre del atleta: ");
            nombre = scan.next();
            System.out.print("Ingrese el tiempo que hiso el atcleta en su prueva numero " + numPrueva + "   :   ");
            tiempo = scan.nextFloat();
            System.out.print("\t\t0 para calcular el promedio y finalizar\n");

            
            while (tiempo != 0) {
                numPrueva++;
                tiempoTotal = tiempoTotal + tiempo;
                promedioTiempo = tiempoTotal / (numPrueva - 1);
                System.out.print("Ingrese el tiempo que hiso el atcleta en su prueva numero " + numPrueva + "   :   ");
                tiempo = scan.nextFloat();
                System.out.print("\t\t0 para calcular el promedio y finalizar\n");
            }
        }
    }

    public static void esApto(float tm) {
        if (tm <= 15) {
            System.out.print( "\nFelicidaes! :-) Ud. es adto para realisar la prueva de 5 kilometros durante 10 dias\n\n");
            System.out.println("___________________________________________________________________________________________________");
        } else {
            System.out.print("\nLastima :-( Ud. no es adto para realisar la prueva de 5 kilometros durante 10 dias\n\n");
            System.out.println("___________________________________________________________________________________________________");
        }
    }
}
