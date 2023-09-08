
package Entidades;


public class Inscripcion {
   
    
    private int idInscripcion;
    private Alumno alumno;
    private Materia materia;
    private double nota;

    public Inscripcion() {
    }

    public Inscripcion(int idInscripcion, Alumno alumno, Materia materia, double estado) {
        this.idInscripcion = idInscripcion;
        this.alumno = alumno;
        this.materia = materia;
        this.nota = estado;
    }

    public Inscripcion(Alumno alumno, Materia materia, double estado) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = estado;
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public double isEstado() {
        return nota;
    }

    public void setEstado(double estado) {
        this.nota = estado;
    }

   
    
    
}
