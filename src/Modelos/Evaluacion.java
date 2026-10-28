package Modelos;

import java.time.LocalDateTime;

public class Evaluacion extends ActividadSumativa {
    private int limiteDeTiempo;

    public Evaluacion(String titulo, LocalDateTime fechaDeEntrega, float puntajeMaximo, String contenido, String id, int limiteDeTiempo) {
        super(titulo, fechaDeEntrega, puntajeMaximo, contenido, id);
        this.limiteDeTiempo = limiteDeTiempo;
    }
}