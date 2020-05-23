package main.java.ar.edu.utn.frba.ia.ag.triatlon.caracteristica;

public class Mentalidad extends Caracteristica {

    private static final Integer PONDERACION_MENTALIDAD = 10;
    private static final Integer COSTO_MENTALIDAD = 9;

    public Mentalidad() {
        super(PONDERACION_MENTALIDAD, COSTO_MENTALIDAD);
    }

    private static final Double LIMITE_SUPERIOR = 100.0D;
    private static final Double LIMITE_INFERIOR = 1.0D;

    public static Mentalidad randomOf() {
        Mentalidad mentalidad = new Mentalidad();
        mentalidad.setValorEntre(LIMITE_INFERIOR,LIMITE_SUPERIOR);
        return mentalidad;
    }

}
