package Persona;

/* Esta el la clase padre */
public class Persona {
    //EMCAPSULAMIENTO ° PROTEGEMOS LOS DATOS 
    private String nombre, apellido, direccion, genero;
    private int telefono;

    // metodo domir (APSTRACTO) donde se puede se aplica el POLIMORFISMO
    public void comer(String comida) {
        System.out.println(nombre + " " + apellido + " esta comiendo: " + comida);
    }

    // metodo domir donde ser puede aplicar el POLIMORFISMO
    public void dormir() {
        System.out.println(nombre + " " + apellido + " esta durmiendo");
    }

    //CONSTRUCTORES, METODOS SET; Encargado de asignar los valores de las variables atraves de parametros a la varianle protejida
    public void setDatos(String nombre, String apellido, String direccion, String genero, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.genero = genero;
        this.telefono = telefono;
    }

    // Metodo get. Responder a las peticiones de llamado que se le da a las variables privadas
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    
    public String getGenero() {
        return genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }
}
