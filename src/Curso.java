
import java.util.List;

public class Curso {

    private String id;
    private String nombre;
    private boolean estadoDisponible;

    private List<Estudiante> estudiantesInscritos;
    private List<Estudiante> estudiantesenESperaDeInscripcion;

    public void inscribirEstudiante(Estudiante estudiante) {}

    public void ponerEnListaDeEspera(Estudiante estudiante) {}
}
