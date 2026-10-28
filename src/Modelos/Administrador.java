package Modelos;

public class Administrador extends Usuario {

    public Administrador(String usuario, String contraseña, String nombre, String apellido) {
        super(usuario, contraseña, nombre, apellido);
    }

    public void crearUsuarioConRol(String usuario, String contraseña) {
        // Implementación
    }

    public void asignarPermisoUsuario(String usuario) {
        // Implementación
    }

    public void actualizarSoftware() {
        // Implementación
    }

    public void asignarResponsable(Curso curso, Profesor responsable) {
        // Implementación
    }
}