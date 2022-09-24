package Persona;

import java.util.Scanner;

//METODO APSTRACTO: La abstracción consiste en ocultar detalles no deseados mientras se muestra la información más esencial.
public class Procesos {
    /**
     * la clase procesos sirve para llamar a
     * los distintos metodos de las diferentes clases
     * como la de persona y sus clases hijas donde hereda
     * todos sus atributos.
     */

    public void iniciar() {

        String nombre, genero, apellido, direccion, lenguaje;
        int telefono;

        try (Scanner reader = new Scanner(System.in)) {
            System.out.print("Ingrese su nombre:    ");
            nombre = reader.nextLine();
            System.out.print("Ingrese su apellido:  ");
            apellido = reader.nextLine();
            System.out.print("Ingrese su direccion:  ");
            direccion = reader.nextLine();
            System.out.print("Ingrese su genero:  ");
            genero = reader.next();
            System.out.print("Ingrese el lenguaje a la que esta escribiendo:  ");
            lenguaje = reader.next();
            System.out.print("Ingrese su telefono:  ");
            telefono = reader.nextInt();
        }

        System.out.println();

        yo man = new yo();
        man.setDatos(nombre, apellido, direccion, genero, telefono);
        man.setLenguaje(lenguaje);
        man.comer("Arros con pollo");// POLIMORFISMO
        man.comer("Pollo dorado con pastel de papa");// POLIMORFISMO, mismo metod con resultados diferentes
        man.dormir();
        man.Programar();
        man.Leer();
        man.hablando();
        man.VerDatos();

        System.out.println("______________________________________________________\n");

        // datos predefinidos, aplicando el polimorfismo
        tu person = new tu();
        person.setDatos("Edgar", "Valdivia", "Arequipa", "Masculino", 987456321);
        person.setLenguaje("go");
        person.comer("pollito");// POLIMORFISMO
        person.Programar();
        person.VerDatos();
    }
}
