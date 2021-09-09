package co.edu.uts.sistemas.crud_estudiante_hernandezbustos_anamilena;

public class Profesor {
    private long documento;
    private String nombre;
    private String profesion;
    private String programa;

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public Profesor(long documento, String nombre) {
        this.documento = documento;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "documento=" + documento +
                ", nombre='" + nombre + '\'' +
                ", profesion=" + profesion +
                ", programa='" + programa + '\'' +
                '}';
    }
}
