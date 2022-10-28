package NewAuto;

import javax.swing.JOptionPane;

public class Procesos {

    VentaVehiculo auto = new VentaVehiculo();
    
    public void mostrarMenu() {
        int opcion = 0;
        do {
            String cade = JOptionPane.showInputDialog(null, ""
                    + "                 New Auto\n\n"
                    + "1    >    Registrar Vehiculo\n"
                    + "2    >    Mostrar Vehiculo\n"
                    + "3    >    Buscar Vehiculo\n"
                    + "4    >    Eliminar Vehiculo\n"
                    + "5    >    Salir del sistema");

            if (cade != null && validarOpcion.esNumero(cade)) {
                opcion = Integer.parseInt(cade);
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
            }
        } while (opcion != 5);
    }
}
