package main.java.ar.edu.utn.frba.ia.ag.triatlon.caracteristica;

import static main.java.ar.edu.utn.frba.ia.ag.triatlon.algoritmo.ParametrosValoracion.COSTO_CAPACIDAD_NATACION;
import static main.java.ar.edu.utn.frba.ia.ag.triatlon.algoritmo.ParametrosValoracion.PONDERACION_CAPACIDAD_NATACION;

public class CapacidadNatacion extends Caracteristica {

    public CapacidadNatacion() {
        super(PONDERACION_CAPACIDAD_NATACION, COSTO_CAPACIDAD_NATACION);
    }

    private static final Double LIMITE_SUPERIOR = 100.0D;
    private static final Double LIMITE_INFERIOR = 1.0D;

    public static CapacidadNatacion randomOf() {
        CapacidadNatacion capacidadNatacion = new CapacidadNatacion();
        capacidadNatacion.setValorEntre(LIMITE_INFERIOR,LIMITE_SUPERIOR);
        return capacidadNatacion;
    }

}
