package main.java.ar.edu.utn.frba.ia.ag.triatlon.caracteristica;

import static main.java.ar.edu.utn.frba.ia.ag.triatlon.algoritmo.ParametrosValoracion.COSTO_MENTALIDAD;
import static main.java.ar.edu.utn.frba.ia.ag.triatlon.algoritmo.ParametrosValoracion.PONDERACION_MENTALIDAD;

public class Mentalidad extends Caracteristica {

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
