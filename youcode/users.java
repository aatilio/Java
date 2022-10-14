package youcode;

public class users {
    private String nombre, apellido;

    public void setDatos(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    // Metodo
    public void imprimirNombre(){
        System.out.print("****** Bienvenido " + nombre + " " + apellido + " ******");
        System.out.print("\n\t============================");
    }
}
