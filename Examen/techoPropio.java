package Examen;

import java.util.Scanner;

/*
 * 2. El programa “Techo Propio” ofrece casas de interés social, bajo las siguientes condiciones: 
 * Si los ingresos del comprador son menores de S/.2000 el enganche será del 15% del costo de la casa 
 * y el resto se distribuirá en pagos mensuales, a pagar en diez años sin interés. Si los ingresos del 
 * comprador son mayores o iguales S/.2000 el enganche será del 30% del costo de la casa y el resto se 
 * distribuirá en pagos mensuales a pagar en 7 años, también sin interés. La empresa quiere obtener 
 * cuanto debe pagar un comprador por concepto de enganche y cuanto por cada pago parcial. 
 */
public class techoPropio {

    public static int numeroMeses;

    public static void main(String args[]) {
        proceso();
    }

    private static void proceso() {
        float capital, ingresos, enganche, interesMensual;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println(" TECHO PROPIO ");
            System.out.print("Ingrese el precio de la casa: ");
            capital = scan.nextFloat();
            System.out.print("Ingrese los ingresos de la persona: ");
            ingresos = scan.nextFloat();
            enganche = condicional(ingresos, capital);
            interesMensual = pagarMes(enganche, capital, numeroMeses);
            System.out.println("Enganche: " + enganche);
            System.out.println("Interes mensual a pagar durante " + numeroMeses + " meses es: " + interesMensual);
        }
    }

    private static float pagarMes(float enganche, float capital, int mes) {
        float interesMes = (capital - enganche) / mes;
        return interesMes;
    }

    private static float condicional(float ingresos, float capital) {
        float enganche = 0;
        if (ingresos < 2000) {
            enganche = (float) (capital * 0.15);
            numeroMeses = 120;
        } else if (ingresos >= 2000) {
            enganche = (float) (capital * 0.3);
            numeroMeses = 84;
        } else {
            enganche = (float) (capital * 0.0);
        }
        return enganche;
    }
}
