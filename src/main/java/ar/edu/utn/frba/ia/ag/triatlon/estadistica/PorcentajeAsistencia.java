package main.java.ar.edu.utn.frba.ia.ag.triatlon.estadistica;

public class PorcentajeAsistencia extends Estadistica {
    
    private static final Integer PONDERACION_PORCENTAJE_ASISTENCIA = 1;
    private static final Integer COSTO_PORCENTAJE_ASISTENCIA = 1;

    public PorcentajeAsistencia(){
        super(PONDERACION_PORCENTAJE_ASISTENCIA, COSTO_PORCENTAJE_ASISTENCIA);
    }

    private static final Double LIMITE_SUPERIOR = 1.0D;
    private static final Double LIMITE_INFERIOR = 1.0D;

    public static PorcentajeAsistencia randomOf() {
        PorcentajeAsistencia porcentajeAsistencia = new PorcentajeAsistencia();
        porcentajeAsistencia.setValorEntre(LIMITE_INFERIOR,LIMITE_SUPERIOR);
        return porcentajeAsistencia;
    }

}
