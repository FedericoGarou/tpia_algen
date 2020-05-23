package main.java.ar.edu.utn.frba.ia.ag.triatlon.estadistica;

import static main.java.ar.edu.utn.frba.ia.ag.triatlon.algoritmo.ParametrosValoracion.COSTO_PORCENTAJE_CARRERA_COMPLETA;
import static main.java.ar.edu.utn.frba.ia.ag.triatlon.algoritmo.ParametrosValoracion.PONDERACION_PORCENTAJE_CARRERA_COMPLETA;

public class PorcentajeCarreraCompleta extends Estadistica {

    public PorcentajeCarreraCompleta(){
        super(PONDERACION_PORCENTAJE_CARRERA_COMPLETA, COSTO_PORCENTAJE_CARRERA_COMPLETA);
    }

    private static final Double LIMITE_SUPERIOR = 100.0D;
    private static final Double LIMITE_INFERIOR = 0.0D;

    public static PorcentajeCarreraCompleta randomOf() {
        PorcentajeCarreraCompleta porcentajeCarreraCompleta = new PorcentajeCarreraCompleta();
        porcentajeCarreraCompleta.setValorEntre(LIMITE_INFERIOR,LIMITE_SUPERIOR);
        return porcentajeCarreraCompleta;
    }

}
