package NewAuto;

import java.util.ArrayList;
import java.util.Scanner;

public class VentaVehiculo extends Vehiculo {

    /*public String placa, marca, modelo, color;
    public String fabricacion;*/
    public int u = 0;
    public int MAX = 5;

    Scanner teclado = new Scanner(System.in);

    ArrayList<String>[][] vehiculo = new ArrayList[MAX][5];
    private ArrayList<String> arrayList;// vehivuloLists[0][0]=new ArrayList<String>();
    // ArrayList<String> vehiculo = new ArrayList<String>();

    // Atributos

    public void registrar() {
        System.out.print("ingrese la placa del vehiculo ");
        placa = teclado.nextLine();
        System.out.print("Ingrese la marca del vehiculo ");
        marca = teclado.nextLine();
        System.out.print("Ingrese el modelo del vehiculo ");
        modelo = teclado.nextLine();
        System.out.print("Ingrese el color del vehiculo ");
        color = teclado.next();
        System.out.print("ingrese la fecha de fabricacion ");
        fabricacion = teclado.next();
        if (!placa.equals("") && !marca.equals("") && !modelo.equals("") && !color.equals("")
                && !fabricacion.equals("")) {
            vehiculo[u][0].add(placa);
            vehiculo[u][1].add(marca);
            vehiculo[u][2].add(modelo);
            vehiculo[u][3].add(color);
            vehiculo[u][4].add(fabricacion);
            u++;
            System.out.print(
                    "Vehiculo numero: " + u + "\nCon placa N°:  " + placa + "\nRegistrado exitosamente");
        }
        // System.out.println(vehiculo);
    }

    public void mostrar() {
        if (!vehiculo[MAX][5].isEmpty()) {
            for (int i = 0; i < MAX; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(vehiculo[i][j]);
                }
                System.out.print("\n");
            }
        }
    }

    public void buscar() {
        String plac;
        System.out.print("ingrese la placa del vehiculo ");
        plac = teclado.nextLine();
        if (!plac.equals("")) {
            for (int i = 0; i < MAX; i++) {
                arrayList = vehiculo[i][0];
                if (plac.equals(arrayList)){
                    for (int e = 0; e < MAX; e++){
                        for (int j = 0; j < 4; j++) {
                            System.out.print(vehiculo[e][j]);
                        } System.out.print("\n");
                    }
                }  
            }
        }
    }

    public void eliminar() {
        String plac;
        System.out.print("ingrese la placa del vehiculo ");
        plac = teclado.nextLine();
        if (!plac.equals("")) {
            for (int i = 0; i < MAX; i++) {
                arrayList = vehiculo[i][0];
                if (plac.equals(arrayList)){
                    vehiculo[i][0].remove(plac);
                }  
            }
        }
    }
}
