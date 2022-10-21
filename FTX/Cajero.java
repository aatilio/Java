package FTX;

import javax.swing.JOptionPane;

public class Cajero {

    private float saldo = 10000;
    private String pin = "1234";

    public void setDatos(int saldo, String pin) {
        this.saldo = saldo;
        this.pin = pin;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getPin() {
        return pin;
    }


    // Creamos el metodo para depositar
    public void depositar() {
        String cadena;
        int deposito = 0;

        cadena = JOptionPane.showInputDialog(null, "Digite la cantidad que desea depositar : ");
        if (cadena != null && !cadena.equals("") && validarNumero.esNumero(cadena)) {
            deposito = Integer.parseInt(cadena);
            if (deposito > 0) {
                String pinn = JOptionPane.showInputDialog(null, "Digite su PIN para confirmar la transacion : ");
                if (pinn.equals(pin)) {
                    saldo += deposito;
                    JOptionPane.showMessageDialog(null, "Balance de la cuenta: \tS/. " + saldo);
                } else {
                    JOptionPane.showMessageDialog(null, "PIN incorrecto ");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Digite una cantidad mayor a cero para depositar");
            }
        }
    }

    // Metodo para retirar
    public void retirar() {
        String cadena;
        cadena = JOptionPane.showInputDialog(null, "Digite su PIN : ");

        if (cadena == null) {
            // vuelve a la ventana de inicio
        } else {
            if (!cadena.equals("")) {
                if (cadena.equals(pin)) {
                    cadena = JOptionPane.showInputDialog(null, ""
                            + "RETIRO RAPIDO\n\n"
                            + "a    >    50\n"
                            + "b    >    100\n"
                            + "c    >    200\n"
                            + "d    >    500\n"
                            + "e    >    1000\n\n"
                            + "f    >    Monto espesifico");

                    if (cadena != null) {
                        if (!cadena.equals("")) {
                            switch (cadena) {
                                case "a":
                                    if ((saldo - 50) >= 100) {
                                        saldo -= 50;
                                        JOptionPane.showMessageDialog(null, "Balance de la cuenta: \ttS/. " + saldo);
                                    }
                                    break;
                                case "b":
                                    if ((saldo - 100) >= 100) {
                                        saldo -= 100;
                                        JOptionPane.showMessageDialog(null, "Balance de la cuenta: \tS/. " + saldo);
                                    }
                                    break;
                                case "c":
                                    if ((saldo - 200) >= 100) {
                                        saldo -= 200;
                                        JOptionPane.showMessageDialog(null, "Balance de la cuenta: \tS/. " + saldo);
                                    }
                                    break;
                                case "d":
                                    if ((saldo - 500) >= 100) {
                                        saldo -= 500;
                                        JOptionPane.showMessageDialog(null, "Balance de la cuenta: \tS/. " + saldo);
                                    }
                                    break;
                                case "e":
                                    if ((saldo - 1000) >= 100) {
                                        saldo -= 1000;
                                        JOptionPane.showMessageDialog(null, "Balance de la cuenta: \tS/. " + saldo);
                                    }
                                    break;
                                case "f":
                                    cadena = JOptionPane.showInputDialog(null,
                                            "Balance disponible S/. "+ saldo +"\nDigite la cantidad de dinero que quiere retirar: ");
                                    if ((cadena != null && !cadena.equals("") && validarNumero.esNumero(cadena))
                                            && (saldo - Integer.parseInt(cadena) <= 10000)
                                            && (Integer.parseInt(cadena) > 0)) {
                                        saldo -= Integer.parseInt(cadena);
                                        JOptionPane.showMessageDialog(null, "Balance de la cuenta: \tS/. " + saldo);
                                    }
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "La opcion no existe , vuelva a digitar");
                                    break;
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El PIN es incorecto, vuelba a digitar de nuevo");
                }
            }
        }
    }

    // Metodo para cambiar clave
    public void cambiarClave() {
        String pinAntiguo;
        String pinNuevo;

        pinAntiguo = JOptionPane.showInputDialog(null, "Digite su PIN actual : ");
        if (pinAntiguo != null) {
            if (!pinAntiguo.equals("")) {
                if (pinAntiguo.equals(pin)) {
                    pinNuevo = JOptionPane.showInputDialog("Digite su nuevo PIN : ");
                    if (pinNuevo != null) {
                        if (!pinNuevo.equals("")) {
                            if (pinNuevo.length() >= 4) {
                                pinAntiguo = null;
                                pinAntiguo = pin;
                                JOptionPane.showMessageDialog(null, "El PIN anterior es " + pinAntiguo);
                                JOptionPane.showMessageDialog(null, "NO olvide este PIN\nSu nuevo PIN es : " + pinNuevo);
                                pin = pinNuevo;
                            } else {
                                JOptionPane.showMessageDialog(null,
                                        "EL PIN de debe de tener como minimo 4 digitos");
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El PIN no coincide");
                }
            }
        }
    }

    // Metodo para consultar
    public void consultarSaldo() {
        JOptionPane.showMessageDialog(null, "Balance disponible:\tS/.  " + saldo);
    }
}