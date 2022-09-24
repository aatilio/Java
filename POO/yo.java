package POO;

//HERENCIA
public class yo extends Persona {
    /*
     * esta es la clase hija que hereda las
     * caracteristicas de la clase padre Persona
     * y tiene su propio metodo que es afeitase
     */

    public void Programar() {
        System.out.println(getNombre() + " " + getApellido() + " esta programando un proyecto en java");
    }

    public void VerDatos(){
        System.out.println("\nSu nombre completo es\t:\t" + getNombre() + " " + getApellido());
        System.out.println("Su direccion\t\t:\t" + getDireccion());
        System.out.println("Su telefono es\t\t:\t" + getTelefono());
        System.out.println("Su genero \t\t:\t" + getGenero());
    }
}