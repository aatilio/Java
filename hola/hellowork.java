package hola;

import java.util.Scanner;

public class hellowork {
    public static void main(String args[]) {
        String nombre = "alan atilio condoria arapa";
        String carrera = "Desarrolla de sistemas de informacion";
        int edad = 18;
        String ho = "Leer y investigar sobre los temas que me llaman la atencion";

        try (
                Scanner sc = new Scanner(System.in)) {

            int opc;
            System.out.print("        MENU ");
            System.out.print("\nVer nombre apellido     >   1 ");
            System.out.print("\nVer edad                >   2 ");
            System.out.print("\nver carrera             >   3 ");
            System.out.print("\nver hobie               >   4 ");
            System.out.print("\nIngresa una opcion:  ");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.print("hola a todos mi nombre es " + nombre);
                    break;
                case 2:
                    System.out.print("Mi esda es" + edad);
                    break;
                case 3:
                    System.out.print("Mi carrera es" + carrera);
                    break;
                case 4:
                    System.out.print("Mi hobie es" + ho);
                    break;
                default:
                    System.out.println("ingrese una opcion valida");
                    break;
            }
        }
    }
}
