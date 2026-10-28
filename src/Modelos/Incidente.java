package Modelos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Incidente {
    private int id;
    private LocalDateTime fechaReportado;
    private String estado;
    private String titulo;
    private String descripcion;
    private List<String> logActualizaciones;
    private LocalDateTime fechaCerrado;
    private String tipo;

    // Asociaciones
    private Usuario beneficiario;
    private Usuario responsableAtencion;

    public Incidente(int id, String titulo, String descripcion, String tipo, Usuario beneficiario) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.beneficiario = beneficiario;
        this.fechaReportado = LocalDateTime.now();
        this.estado = "Abierto";
        this.logActualizaciones = new ArrayList<>();
    }
}