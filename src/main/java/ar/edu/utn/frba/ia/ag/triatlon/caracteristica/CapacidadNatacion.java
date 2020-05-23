package main.java.ar.edu.utn.frba.ia.ag.triatlon.caracteristica;

public class CapacidadNatacion extends Caracteristica {

    private static final Integer PONDERACION_CAPACIDAD_NATACION = 1;
    private static final Integer COSTO_CAPACIDAD_NATACION = 1;

    public CapacidadNatacion() {
        super(PONDERACION_CAPACIDAD_NATACION, COSTO_CAPACIDAD_NATACION);
    }

    private static final Double LIMITE_SUPERIOR = 1.0D;
    private static final Double LIMITE_INFERIOR = 1.0D;

    public static CapacidadNatacion randomOf() {
        CapacidadNatacion capacidadNatacion = new CapacidadNatacion();
        capacidadNatacion.setValorEntre(LIMITE_INFERIOR,LIMITE_SUPERIOR);
        return capacidadNatacion;
    }

}
