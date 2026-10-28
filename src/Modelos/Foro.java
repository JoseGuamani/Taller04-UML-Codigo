package Modelos;

public class Foro {
    private String id;
    private String temática;
    private int numeroDeComentarios;

    public Foro(String id, String temática) {
        this.id = id;
        this.temática = temática;
        this.numeroDeComentarios = 0;
    }
}