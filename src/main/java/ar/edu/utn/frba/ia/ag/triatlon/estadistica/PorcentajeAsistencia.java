package main.java.ar.edu.utn.frba.ia.ag.triatlon.estadistica;

import static main.java.ar.edu.utn.frba.ia.ag.triatlon.algoritmo.ParametrosValoracion.COSTO_PORCENTAJE_ASISTENCIA;
import static main.java.ar.edu.utn.frba.ia.ag.triatlon.algoritmo.ParametrosValoracion.PONDERACION_PORCENTAJE_ASISTENCIA;

public class PorcentajeAsistencia extends Estadistica {

    public PorcentajeAsistencia(){
        super(PONDERACION_PORCENTAJE_ASISTENCIA, COSTO_PORCENTAJE_ASISTENCIA);
    }

    private static final Double LIMITE_SUPERIOR = 100.0D;
    private static final Double LIMITE_INFERIOR = 0.0D;

    public static PorcentajeAsistencia randomOf() {
        PorcentajeAsistencia porcentajeAsistencia = new PorcentajeAsistencia();
        porcentajeAsistencia.setValorEntre(LIMITE_INFERIOR,LIMITE_SUPERIOR);
        return porcentajeAsistencia;
    }

}
