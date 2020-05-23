package main.java.ar.edu.utn.frba.ia.ag.triatlon.estadistica;

public class PorcentajeAsistencia extends Estadistica {
    
    private static final Integer PONDERACION_PORCENTAJE_ASISTENCIA = 6;
    private static final Integer COSTO_PORCENTAJE_ASISTENCIA = 3;

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
