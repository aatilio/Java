package autos;


public class vehiculos {
    private String placa, marca, modelo, color, fabricacion;
    

    public void setVehiculo(String placa, String marca, String modelo, String color, String fabricacion) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.fabricacion = fabricacion;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getFabricacion() {
        return fabricacion;
    }

    @Override
    public String toString() {
        return "Instrumento{" + "Placa = " + placa + ", Marca = " + marca + ", Modelo = " + modelo + ", Color = " + color + ", Fabricaion = " + fabricacion + '}';
    }

}
