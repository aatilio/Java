package autos;

import java.util.ArrayList;


public class Sucursal {

    private ArrayList<vehiculos> vehiculo;
    private String nombre;

    public Sucursal(String nombre) {
        this.nombre = nombre;
        this.vehiculo = new ArrayList<>();
    }

    public vehiculos borrarInstrumento(String ID) {
        vehiculos insABorrar = buscarInstrumento(ID);
        this.vehiculo.remove(insABorrar);
        return insABorrar;
    }

    private vehiculos buscarInstrumento(String ID) {
        int i = 0;
        vehiculos insEncontrado = null;
        while (i < vehiculo.size() && !this.vehiculo.get(i).getPlaca().equals(ID)) {
            i++;
        }
        if (i < vehiculo.size()) {
            insEncontrado = this.vehiculo.get(i);
        }
        return insEncontrado;
    }

   

    

    public void agregarInstrumento(vehiculos ins) {
        this.vehiculo.add(ins);
    }

    public String getNombre() {
        return nombre;
    }

    public void listarInstrumentos() {
        for (vehiculos instrumento : vehiculo) {
            System.out.println(instrumento);
        }
    }

    public ArrayList<vehiculos> instrumentosPorTipo(TipoInstrumento tipo) {
        ArrayList<vehiculos> instEncontrados = new ArrayList<>();
        for (vehiculos instrumento : instrumentos) {
            if (instrumento.getTipo() == tipo) {
                instEncontrados.add(instrumento);
            }
        }
        return instEncontrados;
    }
}
