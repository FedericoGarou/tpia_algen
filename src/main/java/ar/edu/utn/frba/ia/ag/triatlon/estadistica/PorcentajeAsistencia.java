package main.java.ar.edu.utn.frba.ia.ag.triatlon.estadistica;

public class PorcentajeAsistncia extends Estadistica {
    
    private static final Integer PONDERACION_PORCENTAJE_PODIOS = 1;
    private static final Integer COSTO_PORCENTAJE_PODIOS = 1;

    public PorcentajeAsistncia(){
        super(PONDERACION_PORCENTAJE_PODIOS,COSTO_PORCENTAJE_PODIOS);
    }

}
