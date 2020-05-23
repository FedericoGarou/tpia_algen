package main.java.ar.edu.utn.frba.ia.ag.triatlon.caracteristica;

public class CapacidadCiclismo extends Caracteristica {

    private static final Integer PONDERACION_CAPACIDAD_CICLISMO = 1;
    private static final Integer COSTO_CAPACIDAD_CICLISMO = 1;

    public CapacidadCiclismo() {
        super(PONDERACION_CAPACIDAD_CICLISMO, COSTO_CAPACIDAD_CICLISMO);
    }

    private static final Double LIMITE_SUPERIOR = 1.0D;
    private static final Double LIMITE_INFERIOR = 1.0D;

    public static CapacidadCiclismo randomOf() {
        CapacidadCiclismo capacidadCiclismo = new CapacidadCiclismo();
        capacidadCiclismo.setValorEntre(LIMITE_INFERIOR,LIMITE_SUPERIOR);
        return capacidadCiclismo;
    }

}
