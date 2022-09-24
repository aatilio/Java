package herencia;

public class Alumno {

    private String nombre;
    private String clases;
    private String grado;
    private String grupo;

    public static void main(String args[]) {
        AluRegular pepe = new AluRegular();
        pepe.setNombre("Pepe");
        pepe.setClases("Biologia,matematicas");
        pepe.setGrado("2");
        pepe.setGrupo("G");
        pepe.ir_a_clase();

        AluIntercambio luis = new AluIntercambio("Luis", "Fisica,Ecologia", "3", "B");
        luis.ir_a_clase();
        luis.estudiar();
        luis.matricularse();
    }

    public String getNombre() {
        return nombre;
    }

    public String getClases() {
        return clases;
    }

    public String getGrado() {
        return grado;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClases(String clases) {
        this.clases = clases;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    protected void ir_a_clase() {
    }

    protected void estudiar() {
    }
}
