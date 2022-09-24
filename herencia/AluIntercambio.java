package herencia;

public class AluIntercambio extends Alumno {
    public AluIntercambio(String nombre, String clases, String grado, String grupo) {
        super.setNombre(nombre);
        super.setClases(clases);
        super.setGrado(grado);
        super.setGrupo(grupo);
    }

    protected void matricularse() {
    }
}