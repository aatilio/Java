package POO;

/* Esta el la calse padre */
public class Persona {
    //EMCAPSULAMIENTO / PROTEGEMOS LOS DATOS 
    private String nombre, apellido, direccion, genero;
    private int telefono;

    // metodo domir donde ser puede aplicar el POLIMORFISMO
    public void comer(String nombre) {
        System.out.println(nombre + " " + apellido + " esta comiendo");
    }

    // metodo domir donde ser puede aplicar el POLIMORFISMO
    public void dormir() {
        System.out.println(nombre + " " + apellido + " esta durmiendo");
    }

    //CONSTRUCTORES
    // cirve para captural los datos ingresados
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // sirve para imprimir los datos guardados
    public String getNombre() {
        return nombre;
    }

    //asignamos los datos a la bariable con el mismo nombre  encapsulamiento
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
