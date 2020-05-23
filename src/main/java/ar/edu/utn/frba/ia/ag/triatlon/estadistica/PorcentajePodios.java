package main.java.ar.edu.utn.frba.ia.ag.triatlon.estadistica;

public class PorcentajePodios extends Estadistica {

    private static final Integer PONDERACION_PORCENTAJE_PODIOS = 1;
    private static final Integer COSTO_PORCENTAJE_PODIOS = 1;

    public PorcentajePodios(){
        super(PONDERACION_PORCENTAJE_PODIOS,COSTO_PORCENTAJE_PODIOS);
    }

    private static final Double LIMITE_SUPERIOR = 1.0D;
    private static final Double LIMITE_INFERIOR = 1.0D;

    public static PorcentajePodios randomOf() {
        PorcentajePodios porcentajePodios = new PorcentajePodios();
        porcentajePodios.setValorEntre(LIMITE_INFERIOR,LIMITE_SUPERIOR);
        return porcentajePodios;
    }

}
