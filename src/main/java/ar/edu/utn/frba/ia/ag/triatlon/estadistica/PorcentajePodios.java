package main.java.ar.edu.utn.frba.ia.ag.triatlon.estadistica;

import static main.java.ar.edu.utn.frba.ia.ag.triatlon.algoritmo.ParametrosValoracion.COSTO_PORCENTAJE_PODIOS;
import static main.java.ar.edu.utn.frba.ia.ag.triatlon.algoritmo.ParametrosValoracion.PONDERACION_PORCENTAJE_PODIOS;

public class PorcentajePodios extends Estadistica {

    public PorcentajePodios(){
        super(PONDERACION_PORCENTAJE_PODIOS, COSTO_PORCENTAJE_PODIOS);
    }

    private static final Double LIMITE_SUPERIOR = 80.0D;
    private static final Double LIMITE_INFERIOR = 0.0D;

    public static PorcentajePodios randomOf() {
        PorcentajePodios porcentajePodios = new PorcentajePodios();
        porcentajePodios.setValorEntre(LIMITE_INFERIOR,LIMITE_SUPERIOR);
        return porcentajePodios;
    }

    public static Double limiteSuperior() {
        return LIMITE_SUPERIOR;
    }

}
