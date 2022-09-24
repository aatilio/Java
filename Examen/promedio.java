package Examen;

import java.util.Scanner;

/*
 * Un alumno desea saber cuál será su promedio general en las tres materias más difíciles que 
 * cursa y cual será el promedio que obtendrá en cada una de ellas. Estas materias se evalúan 
 * como se muestra a continuación: (4 puntos)

La calificación de Matemáticas se obtiene de la sig. manera:
Examen 90%
Promedio de tareas 10%
En esta materia se pidió un total de tres tareas.
La calificación de Física se obtiene de la sig. manera:
Examen 80%
Promedio de tareas 20%
En esta materia se pidió un total de dos tareas.
La calificación de Química se obtiene de la sig. manera:
Examen 85%
Promedio de tareas 15%
En esta materia se pidió un promedio de tres tareas.
 */

public class promedio {

    public static void main(String args[]) {
        calculo();
    }

    static double matematica(double exa, int n1, int n2, int n3) {
        double promediFinal = 0;
        promediFinal = exa * 0.9 + (((n1 + n2 + n3) / 3) * 0.1);
        return promediFinal;
    }

    static double fisica(double exa, int n1, int n2) {
        double promediFinal = 0;
        promediFinal = exa * 0.8 + (((n1 + n2) / 2) * 0.2);
        return promediFinal;
    }

    static double quimica(double exa, int n1, int n2, int n3) {
        double promediFinal = 0;
        promediFinal = exa * 0.85 + (((n1 + n2 + n3) / 3) * 0.15);
        return promediFinal;
    }

    public static void calculo() {
        double matematica, fisica, quimica;
        int n1_, n2_, n3_;
        double exa_;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println(" MATEMATICA ");
            System.out.println("Ingresa la nota del examen: ");
            exa_ = scan.nextFloat();
            System.out.println("Ingresa la nota de la primera tarea: ");
            n1_ = scan.nextInt();
            System.out.println("Ingresa la nota de la segunda tarea: ");
            n2_ = scan.nextInt();
            System.out.println("Ingresa la nota de la tercera tarea: ");
            n3_ = scan.nextInt();
            matematica = matematica(exa_, n1_, n2_, n3_);
            System.out.println(" FISICA ");
            System.out.println("Ingresa la nota del examen: ");
            exa_ = scan.nextFloat();
            System.out.println("Ingresa la nota de la primera tarea: ");
            n1_ = scan.nextInt();
            System.out.println("Ingresa la nota de la segunda tarea: ");
            n2_ = scan.nextInt();
            System.out.println("Ingresa la nota de la tercera tarea: ");
            n3_ = scan.nextInt();
            fisica = fisica(exa_, n1_, n2_);
            System.out.println(" QUIMICA ");
            System.out.println("Ingresa la nota del examen: ");
            exa_ = scan.nextFloat();
            System.out.println("Ingresa la nota de la primera tarea: ");
            n1_ = scan.nextInt();
            System.out.println("Ingresa la nota de la segunda tarea: ");
            n2_ = scan.nextInt();
            quimica = quimica(exa_, n1_, n2_, n3_);
            System.out.println("Promedio final del alumno es: " + (matematica + fisica + quimica) / 3);
        }
    }
}
