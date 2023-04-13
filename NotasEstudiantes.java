import java.util.Scanner;

public class NotasEstudiantes {
    private static final String[] UNIDADES = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho",
            "nueve", "diez", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho",
            "diecinueve"};
    private static final String[] DECENAS = {"", "", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta",
            "ochenta", "noventa"};

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            double nota1, nota2, nota3, promedio;

            for (int i = 1; i <= 3; i++) {
                System.out.printf("Estudiante %d\n", i);

                System.out.print("Ingrese la primera nota: ");
                nota1 = entrada.nextDouble();

                System.out.print("Ingrese la segunda nota: ");
                nota2 = entrada.nextDouble();

                System.out.print("Ingrese la tercera nota: ");
                nota3 = entrada.nextDouble();

                promedio = (nota1 + nota2 + nota3) / 3;

                System.out.printf("El promedio es: %.2f (%s)\n", promedio, convertirNumeroEnLetras(promedio));

                System.out.printf("El estudiante %s.\n\n", promedio >= 13 ? "aprobó" : "no aprobó");
            }
        }
    }

    public static String convertirNumeroEnLetras(double numero) {
        int entero = (int) numero;
        int decimal = (int) ((numero - entero) * 100);
        String enteroEnLetras = entero < 20 ? UNIDADES[entero] : DECENAS[entero / 10] + (entero % 10 == 0 ? "" : " y " + UNIDADES[entero % 10]);
        String decimalEnLetras = decimal < 10 ? UNIDADES[decimal] : DECENAS[decimal / 10] + (decimal % 10 == 0 ? "" : " y " + UNIDADES[decimal % 10]) + " centavos";
        return enteroEnLetras + (decimal == 0 ? "" : " punto " + decimalEnLetras);
    }
}