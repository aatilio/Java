package youcode;

public class users {
    private String nombre, apellido;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Metodo
    public void imprimirNombre(){
        System.out.print("****** " + nombre + " " + apellido + " ******");
        System.out.print("\n\t=================");
    }
}
