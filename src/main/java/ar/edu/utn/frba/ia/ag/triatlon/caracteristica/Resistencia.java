package main.java.ar.edu.utn.frba.ia.ag.triatlon.caracteristica;

import static main.java.ar.edu.utn.frba.ia.ag.triatlon.algoritmo.ParametrosValoracion.COSTO_RESISTENCIA;
import static main.java.ar.edu.utn.frba.ia.ag.triatlon.algoritmo.ParametrosValoracion.PONDERACION_RESISTENCIA;

public class Resistencia extends Caracteristica {

    public Resistencia() {
        super(PONDERACION_RESISTENCIA, COSTO_RESISTENCIA);
    }

    private static final Double LIMITE_SUPERIOR = 100.0D;
    private static final Double LIMITE_INFERIOR = 1.0D;

    public static Resistencia randomOf() {
        Resistencia resistencia = new Resistencia();
        resistencia.setValorEntre(LIMITE_INFERIOR,LIMITE_SUPERIOR);
        return resistencia;
    }

}
