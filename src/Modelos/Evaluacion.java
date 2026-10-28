package Modelos;

import java.time.LocalDateTime;

public class Evaluacion extends ActividadSumativa {
<<<<<<< HEAD

    private int LimiteTiempo;
    
}
=======
    private int limiteDeTiempo;

    public Evaluacion(String titulo, LocalDateTime fechaDeEntrega, float puntajeMaximo, String contenido, String id, int limiteDeTiempo) {
        super(titulo, fechaDeEntrega, puntajeMaximo, contenido, id);
        this.limiteDeTiempo = limiteDeTiempo;
    }
}
>>>>>>> 4d994a150108562356c860a84efb38d5d83c0bb2
