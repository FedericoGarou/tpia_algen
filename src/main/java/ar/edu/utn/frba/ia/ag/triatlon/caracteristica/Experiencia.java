package main.java.ar.edu.utn.frba.ia.ag.triatlon.caracteristica;

import static main.java.ar.edu.utn.frba.ia.ag.triatlon.algoritmo.ParametrosValoracion.COSTO_EXPERIENCIA;
import static main.java.ar.edu.utn.frba.ia.ag.triatlon.algoritmo.ParametrosValoracion.PONDERACION_EXPERIENCIA;

public class Experiencia extends Caracteristica {

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
