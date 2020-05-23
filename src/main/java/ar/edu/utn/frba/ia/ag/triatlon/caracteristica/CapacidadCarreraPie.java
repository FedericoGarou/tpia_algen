package main.java.ar.edu.utn.frba.ia.ag.triatlon.caracteristica;

public class CapacidadCarreraPie extends Caracteristica {

    private static final Integer PONDERACION_CAPACIDAD_CARRERA_PIE = 1;
    private static final Integer COSTO_CAPACIDAD_CARRERA_PIE = 1;

    public CapacidadCarreraPie() {
        super(PONDERACION_CAPACIDAD_CARRERA_PIE, COSTO_CAPACIDAD_CARRERA_PIE);
    }

    private static final Double LIMITE_SUPERIOR = 1.0D;
    private static final Double LIMITE_INFERIOR = 1.0D;

    public static CapacidadCarreraPie randomOf() {
        CapacidadCarreraPie capacidadCarreraPie = new CapacidadCarreraPie();
        capacidadCarreraPie.setValorEntre(LIMITE_INFERIOR,LIMITE_SUPERIOR);
        return capacidadCarreraPie;
    }

}
