package main.java.ar.edu.utn.frba.ia.ag.triatlon.estadistica;

public class PorcentajeCarreraCompleta extends Estadistica {
    
    private static final Integer PONDERACION_PORCENTAJE_CARRERA_COMPLETA = 40;
    private static final Integer COSTO_PORCENTAJE_CARRERA_COMPLETA = 25;

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
