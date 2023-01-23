package Examen;

public class tabla {
    public static void main(String args[]) {
        tablaMultiplicar();
    }

    private static void tablaMultiplicar() {
        System.out.println("Tabla de multiplicar");
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.println(i + " X " + j + "\t= " + i * j);
            }
            System.out.println("\n");
        }
    }
}
