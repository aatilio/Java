package Examen;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class temperaturas {
    public static void main(String[] args) {
        option();
    }

    public static void option() {
        String opc = JOptionPane
                .showInputDialog("          MENU    \nCelcius a Fahrenheit     ->  1\nFahrenheit a Celcius     ->  2");
        int opci = Integer.parseInt(opc);
        switch (opci) {
            case 1:
                celc_faren();
                break;
            case 2:
                faren_celc();
                break;
            default:
                System.out.println("Obcion incorrecta...Escoja una que sea valida");
                break;
        }
    }

    private static void celc_faren() {
        try (Scanner cel = new Scanner(System.in)) {
            double f;
            int n, m;
            System.out.println("Grados Celcius a Fahrenheit desde (N) hasta (M)");
            System.out.print("Ingrese N: ");
            n = cel.nextInt();
            System.out.print("Ingrese M: ");
            m = cel.nextInt();
            System.out.println("Celcius   |   Fahrenheit");
            for (int i = n; i <= m; i++) {
                f = i * 1.8 + 32;
                System.out.println("    " + i + "     |     " + f);
            }
        }
    }

    private static void faren_celc() {
        try (Scanner nm = new Scanner(System.in)) {
            double c;
            int m;
            System.out.println("Grados Fahrenheit a Celcius desde 32° hasta (M)");
            System.out.print("Ingrese M: ");
            m = nm.nextInt();
            System.out.println("Fahrenheit |    Celcius");
            for (int i = 32; i <= m; i++) {
                c = (i - 32) / 1.8;
                System.out.println("    " + i + "     |     " + c);
            }
        }
    }
}
