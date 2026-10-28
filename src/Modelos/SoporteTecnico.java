package Modelos;

public class SoporteTecnico extends Usuario {

    public SoporteTecnico(String usuario, String contraseña, String nombre, String apellido) {
        super(usuario, contraseña, nombre, apellido);
    }

    public void brindarAsistencia(Usuario usuario) {
        // Implementación
    }

    public void resolverProblemaTecnico(Usuario usuario) {
        // Implementación
    }

    public void derivarProblemaDeGestion(Administrador administrador) {
        // Implementación
    }
}