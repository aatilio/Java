package practice;

//import java.util.Scanner; //Tenemos que importar este paquete para poder usar la clase Scanner

public class Ejercicio1 {
    public static void main(String[] args) {

        // array de 4.
        int[] arr = new int[4];

        try {
            int i = arr[4]; //nunca se ejecula nada

            // esta decalracion nunca se ejecutara
            // como excepcion se plantea la decalracion anterior 
            System.out.println("Dentro de bloke de prueva");
        }

        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Excepcion capturada de catch del bloke de prueva");
        }

        finally {
            System.out.println("finalmente blokear la egecucion");
        }

        // programa de descanso sera ejecutado
        System.out.println("fuera de la capsula try-catch-finally clause");
    }
}
