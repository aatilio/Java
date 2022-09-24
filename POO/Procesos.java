package POO;

import java.util.Scanner;

public class Procesos {
    /**
     * la clase procesos sirve para llamar a
     * los distintos metodos de las diferentes clases
     * como la de persona y sus clases hijas donde hereda 
     * todos sus atributos.
     */

    public void iniciar() {

        String nombre, genero, apellido, direccion;
        int telefono;

        try (Scanner reader = new Scanner(System.in)) {
            System.out.print("Ingrese su nombre:    ");
            nombre = reader.nextLine();
            System.out.print("Ingrese su apellido:  ");
            apellido = reader.nextLine();
            System.out.print("Ingrese su direccion:  ");
            direccion = reader.nextLine();
            System.out.print("Ingrese su genero  ");
            genero = reader.next();
            System.out.print("Ingrese su telefono:  ");
            telefono = reader.nextInt();
        }
        
        /* 
         * //datos predefinidos
         * System.out.println();
         * Persona person = new Persona();
         * person.setNombre("Edu");
         * person.setApellido("Fernandez");
         * person.setDireccion("Arequipa");
         * person.setGenero("Masculino");
         * person.settelefono(987456321);
         * person.comer(person.getNombre());
         * person.dormir();
         */

        System.out.println();

        yo alan = new yo();
        alan.setNombre(nombre);
        alan.setApellido(apellido);
        alan.setDireccion(direccion);
        alan.setGenero(genero);
        alan.setTelefono(telefono);
        alan.comer(alan.getNombre());
        alan.dormir();
        alan.Programar();
        alan.VerDatos();

        System.out.println();

    }

}
