package main.java.ar.edu.utn.frba.ia.ag.triatlon.caracteristica;

public class Resistencia extends Caracteristica {

    private static final Integer PONDERACION_RESISTENCIA = 1;
    private static final Integer COSTO_RESISTENCIA = 1;

    public Resistencia() {
        super(PONDERACION_RESISTENCIA,COSTO_RESISTENCIA);
    }

    private static final Double LIMITE_SUPERIOR = 1.0D;
    private static final Double LIMITE_INFERIOR = 1.0D;

    public static Resistencia randomOf() {
        Resistencia resistencia = new Resistencia();
        resistencia.setValorEntre(LIMITE_INFERIOR,LIMITE_SUPERIOR);
        return resistencia;
    }

}
