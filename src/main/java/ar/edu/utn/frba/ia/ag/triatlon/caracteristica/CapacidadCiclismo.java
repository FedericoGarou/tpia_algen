package main.java.ar.edu.utn.frba.ia.ag.triatlon.caracteristica;

import static main.java.ar.edu.utn.frba.ia.ag.triatlon.algoritmo.ParametrosValoracion.COSTO_CAPACIDAD_CICLISMO;
import static main.java.ar.edu.utn.frba.ia.ag.triatlon.algoritmo.ParametrosValoracion.PONDERACION_CAPACIDAD_CICLISMO;

public class CapacidadCiclismo extends Caracteristica {

    public CapacidadCiclismo() {
        super(PONDERACION_CAPACIDAD_CICLISMO, COSTO_CAPACIDAD_CICLISMO);
    }

    private static final Double LIMITE_SUPERIOR = 100.0D;
    private static final Double LIMITE_INFERIOR = 1.0D;

    public static CapacidadCiclismo randomOf() {
        CapacidadCiclismo capacidadCiclismo = new CapacidadCiclismo();
        capacidadCiclismo.setValorEntre(LIMITE_INFERIOR,LIMITE_SUPERIOR);
        return capacidadCiclismo;
    }

}
