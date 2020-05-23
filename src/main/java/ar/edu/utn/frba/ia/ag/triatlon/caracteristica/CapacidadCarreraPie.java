package main.java.ar.edu.utn.frba.ia.ag.triatlon.caracteristica;

import static main.java.ar.edu.utn.frba.ia.ag.triatlon.algoritmo.ParametrosValoracion.COSTO_CAPACIDAD_CARRERA_PIE;
import static main.java.ar.edu.utn.frba.ia.ag.triatlon.algoritmo.ParametrosValoracion.PONDERACION_CAPACIDAD_CARRERA_PIE;

public class CapacidadCarreraPie extends Caracteristica {

    public CapacidadCarreraPie() {
        super(PONDERACION_CAPACIDAD_CARRERA_PIE, COSTO_CAPACIDAD_CARRERA_PIE);
    }

    private static final Double LIMITE_SUPERIOR = 100.0D;
    private static final Double LIMITE_INFERIOR = 1.0D;

    public static CapacidadCarreraPie randomOf() {
        CapacidadCarreraPie capacidadCarreraPie = new CapacidadCarreraPie();
        capacidadCarreraPie.setValorEntre(LIMITE_INFERIOR,LIMITE_SUPERIOR);
        return capacidadCarreraPie;
    }

}
