package NewAuto;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Procesos {

    VentaVehiculo auto = new VentaVehiculo();
    Scanner teclado = new Scanner(System.in);
    
    public void mostrarMenu() {
        int opcion = 0;
        do {
            System.out.print("        MENU ");
            System.out.print("\nRegistrar Vehiculo                 >   1 ");
            System.out.print("\nMostrar Vehiculo                   >   2 ");
            System.out.print("\nBuscar Vehiculo                    >   3 ");
            System.out.print("\nEliminar Vehiculo                  >   4 ");
            System.out.print("\nSalir del sistema                  >   5 ");
            opcion = teclado.nextInt();

                switch (opcion) {
                    case 1:
                        auto.registrar();
                        break;
                    case 2:
                        auto.mostrar();
                        break;
                    case 3:
                        auto.buscar();
                        break;
                    case 4:
                        auto.eliminar();
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Salio del sistema");
                        opcion = 5;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion no disponible,\n vuelva a digitar");
                        break;
                }
            
        } while (opcion != 5);
    }
}
