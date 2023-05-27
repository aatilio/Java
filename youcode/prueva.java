package youcode;

import java.util.Scanner;

public class prueva {

        public void suscriptor() {
            String nombre,apellido;
    
            try (Scanner reader = new Scanner(System.in)) {
                System.out.print("Ingrese su nombre:    ");
                nombre = reader.nextLine();
                System.out.print("Ingrese su apellido:  ");
                apellido = reader.nextLine();
            }
    
            System.out.println();
            nuevoSubcriptor peruano = new nuevoSubcriptor();
            peruano.setDatos(nombre, apellido);
            peruano.imprimirNombre();

            System.out.println();
            nuevoSubcriptor chileno = new nuevoSubcriptor();
            chileno.setDatos("Maveric", "Bret Melver" );
            chileno.imprimirNombre();
        }

        //Mayor de 3 numeros 
        static float mayor(float n1, float n2, float n3) {
            float numeros[] = { n1, n2, n3 };
            float numMayor = 0;
            for (int x = 0; x < numeros.length; x++) {
                float numeroActual = numeros[x];
                if (numeroActual > numMayor) {
                    numMayor = numeroActual;
                }
            }
            return numMayor;
        }

        public void numMayorThree() {
            float n1, n2, n3;
    
            try (Scanner scan = new Scanner(System.in)) {
                System.out.println(" NOTAS ");
                System.out.println("Ingresa el primer nuemro: ");
                n1 = scan.nextInt();
                System.out.println("Ingresa el segundo numero: ");
                n2 = scan.nextInt();
                System.out.println("Ingresa el tercer nuemero: ");
                n3 = scan.nextInt();
                System.out.println("El numero mayor es: " + mayor(n1, n2, n3));
            }
        }

        //Imprimir hasta N
        private static void hastaNum(int num){
            for(int i = 1; i <=num; i++){
                System.out.print( i + " \n");
            }
        }
        public void imprimirHastaN() {
            try (Scanner nm = new Scanner(System.in)) {
                int num;
                System.out.print("Ingrese el numero hasta donde quiere ver lor numeros naturales: ");
                num = nm.nextInt();
                hastaNum(num);
            }
        }

        //SUMATORIA DE 3 NUMEROS
        static double sumatoria(int n1, int n2, int n3) {
            double suamtoria = 0;
            suamtoria = n1 + n2 + n3;
            return suamtoria;
        }
        static double promediFinal(double sumatoria) {
            double promediFinal = 0;
            promediFinal = sumatoria / 3;
            return promediFinal;
        }
        public void sumaPromedio() {
            int n1, n2, n3;
            
            try (Scanner scan = new Scanner(System.in)) {
                System.out.println(" NOTAS ");
                System.out.println("Ingresa la nota de la primera tarea: ");
                n1 = scan.nextInt();
                System.out.println("Ingresa la nota de la segunda tarea: ");
                n2 = scan.nextInt();
                System.out.println("Ingresa la nota de la tercera tarea: ");
                n3 = scan.nextInt();
                System.out.println("La suma de las notas es: " + sumatoria(n1, n2, n3));
                System.out.println("El promedio de las notas es: " + promediFinal(sumatoria(n1, n2, n3)));
            }
        }

        //CUADRADO Y CUBO DE UN NUMERO
        static double cuadrado(int n) {
            double num = Math.pow(n, 2);
            return num;
        }
        static double cubo(int n) {
            double num = Math.pow(n, 3);
            return num;
        }
        public void cuadradoCuboNumero() {
            int n1, n2;
            try (Scanner scan = new Scanner(System.in)) {
                System.out.println(" NUMEROS ");
                System.out.println("Ingrese el primer nuemro: ");
                n1 = scan.nextInt();
                System.out.println("Ingresa el segundo numero: ");
                n2 = scan.nextInt();
                System.out.println("El cuadrado del numero " + n1 + " es " + cuadrado(n1));
                System.out.println("El cubo del numero " + n1 + " es " + cubo(n1));
                System.out.println("El cuadrado del numero " + n2 + " es " + cuadrado(n2));
                System.out.println("El cubo del numero " + n2 + " es " + cubo(n2));
            }
        }

}
