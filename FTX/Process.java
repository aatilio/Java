package FTX;

import javax.swing.JOptionPane;

public class Process {

    Cajero pro = new Cajero();
    Targeta targeta = new Targeta();

    public void ingresarTargeta() {
        String numTargetaFisica, date;
        
        numTargetaFisica = JOptionPane.showInputDialog(null, "INGRESE SU TARGETA : ");
        date = JOptionPane.showInputDialog(null, "INGRESE LA FECHA DE VENCIMIENTO : ");
        if (targeta.esValidoLaTargeta(numTargetaFisica, date)) {
            mostrarMenu();
        } else {
            JOptionPane.showMessageDialog(null, "Targeta no valida o vencida");
        }
    }

    public void mostrarMenu() {
        int opcion = 0;
        do {
            String cade = JOptionPane.showInputDialog(null, ""
                    + "                 ATM by FTX\n\n"
                    + "1    >    Consultar balance\n"
                    + "2    >    Depositar\n"
                    + "3    >    Retirar\n"
                    + "4    >    Cambiar PIN\n"
                    + "5    >    Salir del sistema");

            if (cade != null && validarNumero.esNumero(cade)) {
                opcion = Integer.parseInt(cade);
                switch (opcion) {
                    case 1:
                        pro.consultarSaldo();
                        break;
                    case 2:
                        pro.depositar();
                        break;
                    case 3:
                        pro.retirar();
                        break;
                    case 4:
                        pro.cambiarPin();
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Gracias por usar FTX");
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
