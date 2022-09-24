package Persona;

//HERENCIA
public class yo extends Persona {

    private String lenguaje;
        /*
         * esta es la clase hija que hereda las
         * caracteristicas de la clase padre Persona
         * y tiene sus propios metodos
         */
        
        public String getLenguaje() {
            return lenguaje;
        }
    
        public void setLenguaje(String lenguaje) {
            this.lenguaje = lenguaje;
        }
        
        //metodos normales
        public void Programar() {
            System.out.println(getNombre() + " " + getApellido() + " esta programando un proyecto en " + lenguaje);
        }
    
        public void Leer() {
            System.out.println(getNombre() + " " + getApellido() + " esta leyendo");
        }
    
        public void hablando() {
            System.out.println(getNombre() + " " + getApellido() + " esta hablando");
        }
    
        public void VerDatos(){
            System.out.println("\n\nSu nombre completo es\t:\t" + getNombre() + " " + getApellido());
            System.out.println("Su direccion\t\t:\t" + getDireccion());
            System.out.println("Su telefono es\t\t:\t" + getTelefono());
            System.out.println("Su genero \t\t:\t" + getGenero());
        }
}