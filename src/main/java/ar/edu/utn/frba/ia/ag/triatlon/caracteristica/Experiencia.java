package main.java.ar.edu.utn.frba.ia.ag.triatlon.caracteristica;

public class Experiencia extends Caracteristica {
    private static final Integer PONDERACION_EXPERIENCIA = 8;
    private static final Integer COSTO_EXPERIENCIA = 10;

    public Experiencia() {
        super(PONDERACION_EXPERIENCIA, COSTO_EXPERIENCIA);
    }

    private static final Double LIMITE_SUPERIOR = 100.0D;
    private static final Double LIMITE_INFERIOR = 1.0D;

    public static Experiencia randomOf() {
        Experiencia experiencia = new Experiencia();
        experiencia.setValorEntre(LIMITE_INFERIOR,LIMITE_SUPERIOR);
        return experiencia;
    }

}
