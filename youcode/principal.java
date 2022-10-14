package youcode;

import java.util.Scanner;
//import ArrayList;

public class principal {

    public static int opc;

    public static void main(String[] args) {
        // Instanciamos y creamos un objeto de la clase procesos para poder usar sus
        // metodos
        procesos misProcesos = new procesos();// IMPORTANTE

            menu();

            switch (opc) {

                case 1:
                    // teclado numerico
                    Teclado();
                    //menu();
                    break;
                case 2:
                    misProcesos.sumaPromedio();
                    //menu();
                    break;
                case 3:
                    misProcesos.cuadradoCuboNumero();
                    //menu();
                    break;
                case 4:
                    misProcesos.numMayorThree();
                    menu();
                    break;
                case 5:
                    misProcesos.imprimirHastaN();
                    //menu();
                    break;
                case 6:
                    // dar la bienbenida al nuevo suscriptor
                    misProcesos.suscriptor();
                    //menu();
                    break;
                default:
                    System.out.println("ingrese una opcion valida");
                    break;
            }
            // } while (opc <= 0 || opc >= 6);
    }

    // METODO STATICO
    public static void Teclado() {
        System.out.println("0");
        // declarar e inicializar array 2D
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // imprimir array 2D
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(arr[i][j] + " ");

            System.out.println();
        }
    }

    public static void menu()
    {
        try (
            Scanner sc = new Scanner(System.in)) {

            System.out.print("        MENU ");
            System.out.print("\nVer calculadora                 >   1 ");
            System.out.print("\nSumatori de 3 nuemros           >   2 ");
            System.out.print("\nCuadrado y cubo de un numero    >   3 ");
            System.out.print("\nMayor de 3 numeros              >   4 ");
            System.out.print("\nNumeros naturales hasta N       >   5 ");
            System.out.print("\nNuevo suscriptor                >   6 ");
            System.out.print("\n\nIntroduce una opcion:     ");
            opc = sc.nextInt();
            }
    }

}