package Modelos;

public class Profesor extends PersonalAcademico {

    public Profesor(String usuario, String contraseña, String nombre, String apellido) {
        super(usuario, contraseña, nombre, apellido);
    }

    public void cargarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa) {
    
    }

    public void calificarActividadSumativa(Curso curso, Estudiante estudiante, ActividadSumativa actividadSumativa) {
        
    }

    public void aceptarInscripcion(Curso curso, String usuarioEstudiante) {
    }

    public void crearNuevoForo(Foro foro) {
        
    }
}