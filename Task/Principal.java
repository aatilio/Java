package Task;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        String nombre;
        String apellidoPaterno;
        String apellidoMaterno;
        String sexo;
        int edad;
        String direccion;

        try (Scanner reader = new Scanner(System.in)) {
            System.out.print("Ingrese su nombre:    ");
            nombre = reader.nextLine();
            System.out.print("Ingrese su apellido paterno:  ");
            apellidoPaterno = reader.nextLine();
            System.out.print("Ingrese su apellido materno:  ");
            apellidoMaterno = reader.nextLine();
            System.out.print("Ingrese su genero  ");
            sexo = reader.next();
            System.out.print("Ingrese su edad:  ");
            edad = reader.nextInt();
            System.out.print("Ingrese su direccion:  ");
            direccion = reader.nextLine();
        }
        System.out.print("Su nombre completo es: " + nombre + apellidoPaterno + apellidoMaterno);
        System.out.print("Su direccion es: " + direccion);
        System.out.print("Su edad es: " + edad);
        System.out.print("Su genero es: " + sexo);

    }
}
